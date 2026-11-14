#!/bin/bash
# Rebuild Opera Beta custom v3 bundle with 16KB-page-aligned native libs.
#
# Root cause fixed here: v2's base.apk (apktool b + uber-apk-signer) only had
# .so aligned to 4096; the original Opera base aligns .so to 16384 (16KB pages,
# required for extractNativeLibs=false apps on 16KB-kernel devices, targetSdk 35+).
# 4KB-only alignment => INSTALL_FAILED_INVALID_APK surfaced by the installer as
# "There was a problem parsing the package" on 16KB devices.
#
# Pipeline: unsigned apktool output -> zipalign -P 16 -> apksigner (uber debug
# key, so the base cert matches the already-signed splits) -> verify -> bundle.
set -euo pipefail

BT36=/tmp/bt/bt36/android-16
BT34=/tmp/bt/bt34/android-14
WORK=/tmp/rebuild
KS=/tmp/keys/debug.keystore        # extracted from uber-apk-signer.jar (bundled debug key)
V2APKM=/home/z/my-project/download/OperaBeta-104.0.5262.91143-custom-v2.apkm
OUT=/home/z/my-project/download/OperaBeta-104.0.5262.91143-custom-v3.apkm

rm -rf "$WORK" && mkdir -p "$WORK"

echo "== 1. zipalign base to 16KB pages =="
"$BT36/zipalign" -P 16 -f 4 /home/z/my-project/opera/build/base.apk "$WORK/base-aligned.apk"
"$BT36/zipalign" -c -P 16 -f 4 "$WORK/base-aligned.apk" && echo "   zipalign check OK (16KB)"

echo "== 2. sign with uber debug key (same cert as v2 splits) =="
"$BT34/apksigner" sign \
  --ks "$KS" --ks-pass pass:android --key-pass pass:android \
  --ks-key-alias androiddebugkey \
  --v1-signing-enabled true --v2-signing-enabled true --v3-signing-enabled true \
  --min-sdk-version 29 \
  --out "$WORK/base-signed.apk" \
  "$WORK/base-aligned.apk"

echo "== 3. verify signature =="
"$BT34/apksigner" verify --min-sdk-version 24 --verbose "$WORK/base-signed.apk" > "$WORK/sig-verify.txt" 2>&1 || true
sed -n '1,8p' "$WORK/sig-verify.txt"
echo "-- certs (must match splits: 1e08a903aef9c3a7...)"
"$BT34/apksigner" verify --print-certs "$WORK/base-signed.apk" | sed -n '2p'

echo "== 4. post-sign alignment check =="
"$BT36/zipalign" -c -P 16 -f 4 "$WORK/base-signed.apk" && echo "   still 16KB-aligned after signing"

echo "== 5. manifest parses (aapt2 badging) =="
"$BT34/aapt2" dump badging "$WORK/base-signed.apk" > "$WORK/badging.txt" 2>&1 || { echo "   BADGING FAILED"; sed -n '1,5p' "$WORK/badging.txt"; exit 1; }
sed -n '1,2p' "$WORK/badging.txt"

echo "== 6. resources.arsc parses =="
"$BT34/aapt2" dump resources "$WORK/base-signed.apk" > "$WORK/resources-dump.txt" 2>&1 \
  && echo "   arsc dump OK ($(wc -l < "$WORK/resources-dump.txt") lines)" \
  || { echo "   ARSC DUMP FAILED"; tail -5 "$WORK/resources-dump.txt"; exit 1; }

echo "== 7. gather splits from v2 bundle (unchanged, already debug-signed, no .so inside) =="
python3 - "$V2APKM" "$WORK" << 'EOF'
import sys, zipfile
src, work = sys.argv[1], sys.argv[2]
z = zipfile.ZipFile(src)
splits = sorted(n for n in z.namelist() if n.startswith('split_'))
assert len(splits) == 27, f"expected 27 splits, got {len(splits)}"
for n in splits + ['info.json', 'icon.png']:
    open(f"{work}/{n}", "wb").write(z.read(n))
print(f"   extracted {len(splits)} splits + info.json + icon.png")
EOF

echo "== 8. assemble v3 .apkm (DEFLATED container, like the original) =="
python3 - "$WORK" "$OUT" << 'EOF'
import sys, zipfile, os
work, out = sys.argv[1], sys.argv[2]
entries = ['info.json', 'icon.png', 'base-signed.apk'] + \
          sorted(f for f in os.listdir(work) if f.startswith('split_'))
with zipfile.ZipFile(out, 'w', zipfile.ZIP_DEFLATED, compresslevel=6) as z:
    for e in entries:
        arc = 'base.apk' if e == 'base-signed.apk' else e
        z.write(os.path.join(work, e), arc)
print(f"   wrote {out} ({os.path.getsize(out)} bytes), {len(entries)} entries")
EOF

echo "== 9. final verification of the bundle =="
python3 - "$OUT" << 'EOF'
import sys, zipfile
z = zipfile.ZipFile(sys.argv[1])
names = z.namelist()
assert 'base.apk' in names and 'info.json' in names, "container malformed"
assert len([n for n in names if n.startswith('split_')]) == 27, "split count"
open('/tmp/rebuild/final-base.apk', 'wb').write(z.read('base.apk'))
print(f"   container OK: {sorted(set(n.split('.')[0] for n in names))[:3]}... {len(names)} entries")
EOF
"$BT36/zipalign" -c -P 16 -f 4 /tmp/rebuild/final-base.apk && echo "   inner base.apk 16KB-aligned OK"
"$BT34/apksigner" verify --min-sdk-version 24 /tmp/rebuild/final-base.apk && echo "   inner base.apk signature OK"

echo "== 10. sha256 =="
cd /home/z/my-project/download && sha256sum OperaBeta-104.0.5262.91143-custom-v3.apk* 2>/dev/null || true
sha256sum OperaBeta-104.0.5262.91143-custom-v3.apkm
echo "DONE"
