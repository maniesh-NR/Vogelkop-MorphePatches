#!/bin/bash
# build_v6_universal.sh <standard|nonews> — v6 hybrid pipeline universal APK.
# substrate (APKEditor merge, stock) -> rebuild classes.dex + classes3.dex
# -> splice dexes + patched abp.manifest + emptied opera_fixes assets
# -> zipalign -P 16 -> apksigner (morphe.keystore) -> verify markers.
set -euo pipefail
VARIANT=${1:?usage: build_v6_universal.sh <standard|nonews>}
V6=/tmp/v6
BT=/tmp/bt/bt36/android-16
KS=/tmp/v4/tools/morphe.keystore
HS=/home/z/my-project/.harness/vogelkop/scripts
SUB=/tmp/v4/substrate.apk
if [ "$VARIANT" = "nonews" ]; then
  OUT=/home/z/my-project/download/OperaBeta-104.0.5262.91143-custom-v6-universal-nonews.apk
else
  OUT=/home/z/my-project/download/OperaBeta-104.0.5262.91143-custom-v6-universal.apk
fi
SUFFIX=""; [ "$VARIANT" = "nonews" ] && SUFFIX="-nonews"

echo "== 1. rebuild classes3.dex and classes.dex =="
for i in 3 1; do
  rm -rf $V6/rb$i $V6/rb$i.apk $V6/new_classes$i.dex
  java -jar /tmp/v4/tools/apktool_3.0.3.jar b $V6/smali$i -o $V6/rb$i.apk 2>&1 | tail -1
  mkdir -p $V6/rb$i && (cd $V6/rb$i && unzip -o -q $V6/rb$i.apk classes.dex)
  mv $V6/rb$i/classes.dex $V6/new_classes$i.dex
done
python3 - << EOF
import zipfile, os
for i, old in ((3, None), (1, None)):
    on = zipfile.ZipFile('$SUB').getinfo('classes' + ('' if i == 1 else str(i)) + '.dex').file_size
    new = os.path.getsize(f'/tmp/v6/new_classes{i}.dex')
    print(f'classes{i}: old {on} -> new {new}')
EOF

echo "== 2. baksmali roundtrip + marker verification =="
for i in 3 1; do
  rm -rf $V6/mv$i $V6/mv$i.zip
  python3 -c "import zipfile; z=zipfile.ZipFile('$V6/mv$i.zip','w'); z.write('$V6/new_classes$i.dex','classes.dex')"
  java -jar /tmp/v4/tools/apktool_3.0.3.jar d --no-res -f -o $V6/mv$i $V6/mv$i.zip 2>&1 | tail -1
done
python3 /home/z/my-project/scripts/verify_v6_markers.py $V6/mv3/smali $V6/mv1/smali $([ "$VARIANT" = "nonews" ] && echo --nonews || echo)

echo "== 3. splice dexes + manifest + emptied opera_fixes assets =="
python3 - << 'EOF'
import zipfile
z = zipfile.ZipFile('/tmp/v4/substrate.apk')
open('/tmp/v6/empty_list.bin', 'wb').write(
    z.read('assets/abp_files/op/e87a67d80d78d6ad9992c9c4ea0b6aba4e3b66f4c8d3268efa2bc01be7997d65')
)
print('empty compiled list:', len(open('/tmp/v6/empty_list.bin', 'rb').read()), 'bytes')
EOF
python3 $HS/splice_entry.py --src $SUB --entry classes.dex   --file $V6/new_classes1.dex --out $V6/sp1.apk
python3 $HS/splice_entry.py --src $V6/sp1.apk --entry classes3.dex --file $V6/new_classes3.dex --out $V6/sp2.apk
python3 $HS/splice_entry.py --src $V6/sp2.apk --entry assets/op/abp.manifest --file $V6/abp.manifest.patched --out $V6/sp3.apk
python3 $HS/splice_entry.py --src $V6/sp3.apk --entry assets/abp_files/op/2add4739de65724a59c87b73a9ba5287ff7005db37db74d06b588178db75ba93 --file $V6/empty_list.bin --out $V6/sp4.apk
python3 $HS/splice_entry.py --src $V6/sp4.apk --entry assets/abp_files/op/bf14726e1a09695e6f75f3f057b2bd0023b7c7adbf049b6213e69d159c816580 --file $V6/empty_list.bin --out $V6/spliced$SUFFIX.apk

echo "== 4. entry-diff vs substrate =="
python3 - "$SUFFIX" << 'EOF'
import zipfile, hashlib, sys
suf = sys.argv[1]
a = zipfile.ZipFile('/tmp/v4/substrate.apk'); b = zipfile.ZipFile(f'/tmp/v6/spliced{suf}.apk')
an, bn = a.namelist(), b.namelist()
assert an == bn, 'entry list changed!'
diff = [n for n in an if hashlib.sha256(a.read(n)).digest() != hashlib.sha256(b.read(n)).digest()]
print('changed entries:', diff)
expect = ['classes.dex', 'classes3.dex', 'assets/op/abp.manifest',
          'assets/abp_files/op/2add4739de65724a59c87b73a9ba5287ff7005db37db74d06b588178db75ba93',
          'assets/abp_files/op/bf14726e1a09695e6f75f3f057b2bd0023b7c7adbf049b6213e69d159c816580']
assert set(diff) == set(expect), diff
assert len(diff) == len(expect), diff
print('entry-diff OK: exactly dexes + manifest + 2 opera_fixes assets changed')
EOF

echo "== 5. zipalign -P 16 =="
$BT/zipalign -P 16 -f 4 $V6/spliced$SUFFIX.apk $V6/aligned$SUFFIX.apk
$BT/zipalign -c -P 16 -f 4 $V6/aligned$SUFFIX.apk && echo "16KB alignment OK"
python3 -c "
import zipfile
z = zipfile.ZipFile('/tmp/v6/aligned$SUFFIX.apk')
sos = [n for n in z.namelist() if n.startswith('lib/') and n.endswith('.so')]
bad = [n for n in sos if z.getinfo(n).compress_type != 0]
assert not bad, bad
assert z.getinfo('resources.arsc').compress_type == 0
print(f'.so STORED ({len(sos)}) + arsc STORED preserved after align')"

echo "== 6. sign (morphe.keystore, v1+v2+v3) =="
rm -f "$OUT" "$OUT.idsig"
$BT/apksigner sign \
  --ks "$KS" --ks-pass pass:Morphe --key-pass pass:Morphe \
  --ks-key-alias morphe \
  --v1-signing-enabled true --v2-signing-enabled true --v3-signing-enabled true \
  --out "$OUT" $V6/aligned$SUFFIX.apk
$BT/apksigner verify --min-sdk-version 23 --verbose "$OUT" | sed -n '1,6p'
$BT/apksigner verify --print-certs "$OUT" | sed -n '1,2p'

echo "== 7. final sanity =="
$BT/aapt2 dump badging "$OUT" > $V6/final-badging$SUFFIX.txt 2>&1 || { echo BADGING-FAIL; tail -3 $V6/final-badging$SUFFIX.txt; exit 1; }
sed -n '1,2p' $V6/final-badging$SUFFIX.txt
python3 -c "
import zipfile
z = zipfile.ZipFile('$OUT')
print('final entries:', len(z.namelist()), '/ dex:', sum(1 for n in z.namelist() if n.startswith('classes') and n.endswith('.dex')))"

echo "== 8. patch markers inside the SIGNED apk =="
for e in 3 1; do
  E=classes$e.dex; [ "$e" = "1" ] && E=classes.dex
  rm -rf $V6/sv$e$SUFFIX $V6/sv$e$SUFFIX.zip
  python3 -c "import zipfile; z=zipfile.ZipFile('$OUT'); open('/tmp/v6/s$e$SUFFIX.dex','wb').write(z.read('$E'))"
  python3 -c "import zipfile; z=zipfile.ZipFile('$V6/sv$e$SUFFIX.zip','w'); z.write('/tmp/v6/s$e$SUFFIX.dex','classes.dex')"
  java -jar /tmp/v4/tools/apktool_3.0.3.jar d --no-res -f -o $V6/sv$e$SUFFIX $V6/sv$e$SUFFIX.zip 2>&1 | tail -1
done
python3 /home/z/my-project/scripts/verify_v6_markers.py $V6/sv3$SUFFIX/smali $V6/sv1$SUFFIX/smali $([ "$VARIANT" = "nonews" ] && echo --nonews || echo)

echo "== 9. verify the patched manifest inside the signed apk =="
python3 - "$OUT" << 'EOF'
import sys, zipfile
sys.path.insert(0, '/home/z/my-project/scripts')
from apply_v6_patches import parse_manifest
z = zipfile.ZipFile(sys.argv[1])
m = parse_manifest(z.read('assets/op/abp.manifest'))
names = {n for n, _ in m['sets']['ADBLOCK_URL']}
metas = {e['name']: e['meta']['bitmask'] for e in m['metas'] if e['meta']}
assert 'opera_fixes' not in names and 'opera_fixes' not in metas
assert 'adguard_ads' in names and metas['adguard_ads'] == 3
assert metas['easylist'] == 7
for internal in ('tier1_allow_rules', 'tier2_allow_rules', 'testcase', 'ublock_min'):
    assert metas[internal] == 8, (internal, metas[internal])
empty = z.read('assets/abp_files/op/2add4739de65724a59c87b73a9ba5287ff7005db37db74d06b588178db75ba93')
assert empty == z.read('assets/abp_files/op/e87a67d80d78d6ad9992c9c4ea0b6aba4e3b66f4c8d3268efa2bc01be7997d65')
print(f'manifest inside APK OK: {len(names)} adblock lists, opera_fixes gone, internals pinned to 8')
EOF

echo "== 10. sha256 =="
sha256sum "$OUT"
echo "DONE: $OUT"
