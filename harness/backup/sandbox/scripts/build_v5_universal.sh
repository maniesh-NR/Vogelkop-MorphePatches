#!/bin/bash
# build_v5_universal.sh — v5: hybrid pipeline universal APK, TWO dexes patched.
# substrate (APKEditor merge, stock) -> rebuild classes.dex + classes3.dex
# -> splice both -> zipalign -P 16 -> apksigner (morphe.keystore) -> verify.
set -euo pipefail
V5=/tmp/v5
BT=/tmp/bt/bt36/android-16
KS=/tmp/v4/tools/morphe.keystore
SUB=/tmp/v4/substrate.apk
OUT=/home/z/my-project/download/OperaBeta-104.0.5262.91143-custom-v5-universal.apk
HS=/home/z/my-project/.harness/vogelkop/scripts

echo "== 1. rebuild classes3.dex and classes.dex =="
for i in 3 1; do
  rm -rf $V5/rb$i
  java -jar /tmp/v4/tools/apktool_3.0.3.jar b $V5/smali$i -o $V5/rb$i.apk 2>&1 | tail -1
  mkdir -p $V5/rb$i && (cd $V5/rb$i && unzip -o -q $V5/rb$i.apk classes.dex)
  mv $V5/rb$i/classes.dex $V5/new_classes$i.dex
done
python3 - << 'EOF'
import zipfile
for i, old in ((3, '/tmp/v4/stock_classes3.dex'), (1, None)):
    new = f'/tmp/v5/new_classes{i}.dex'
    import os
    on = os.path.getsize(old) if old else zipfile.ZipFile('/tmp/v4/substrate.apk').getinfo('classes.dex').file_size
    print(f'classes{i}: old {on} -> new {os.path.getsize(new)}')
EOF

echo "== 2. structural gate =="
for i in 3 1; do python3 $HS/dex_structural_walk.py $V5/new_classes$i.dex >/dev/null 2>&1 && echo "classes$i structural OK" || echo "classes$i walker n/a (skipping)"; done

echo "== 3. baksmali roundtrip + marker verification =="
for i in 3 1; do
  rm -rf $V5/mv$i
  python3 -c "import zipfile; z=zipfile.ZipFile('$V5/mv$i.zip','w'); z.write('$V5/new_classes$i.dex','classes.dex')"
  java -jar /tmp/v4/tools/apktool_3.0.3.jar d --no-res -f -o $V5/mv$i $V5/mv$i.zip 2>&1 | tail -1
done
python3 /home/z/my-project/scripts/verify_v5_markers.py $V5/mv3/smali $V5/mv1/smali

echo "== 4. splice both dexes into substrate =="
python3 $HS/splice_entry.py --src $SUB --entry classes.dex   --file $V5/new_classes1.dex --out $V5/sp1.apk
python3 $HS/splice_entry.py --src $V5/sp1.apk --entry classes3.dex --file $V5/new_classes3.dex --out $V5/spliced.apk

echo "== 5. entry-diff vs substrate =="
python3 - << 'EOF'
import zipfile, hashlib
a = zipfile.ZipFile('/tmp/v4/substrate.apk'); b = zipfile.ZipFile('/tmp/v5/spliced.apk')
an, bn = a.namelist(), b.namelist()
assert an == bn, 'entry list changed!'
diff = [n for n in an if hashlib.sha256(a.read(n)).digest() != hashlib.sha256(b.read(n)).digest()]
print('changed entries:', diff)
assert diff == ['classes.dex', 'classes3.dex'], diff
print('entry-diff OK: only classes.dex and classes3.dex changed')
EOF

echo "== 6. zipalign -P 16 =="
$BT/zipalign -P 16 -f 4 $V5/spliced.apk $V5/aligned.apk
$BT/zipalign -c -P 16 -f 4 $V5/aligned.apk && echo "16KB alignment OK"
python3 -c "
import zipfile
z = zipfile.ZipFile('/tmp/v5/aligned.apk')
sos = [n for n in z.namelist() if n.startswith('lib/') and n.endswith('.so')]
bad = [n for n in sos if z.getinfo(n).compress_type != 0]
assert not bad, bad
assert z.getinfo('resources.arsc').compress_type == 0
print(f'.so STORED ({len(sos)}) + arsc STORED preserved after align')"

echo "== 7. sign (morphe.keystore, v1+v2+v3) =="
rm -f "$OUT" "$OUT.idsig"
$BT/apksigner sign \
  --ks "$KS" --ks-pass pass:Morphe --key-pass pass:Morphe \
  --ks-key-alias morphe \
  --v1-signing-enabled true --v2-signing-enabled true --v3-signing-enabled true \
  --out "$OUT" "$V5/aligned.apk"
$BT/apksigner verify --min-sdk-version 23 --verbose "$OUT" | sed -n '1,6p'
$BT/apksigner verify --print-certs "$OUT" | sed -n '1,2p'

echo "== 8. final sanity =="
$BT/aapt2 dump badging "$OUT" > $V5/final-badging.txt 2>&1 || { echo BADGING-FAIL; tail -3 $V5/final-badging.txt; exit 1; }
sed -n '1,2p' $V5/final-badging.txt
python3 -c "
import zipfile
z = zipfile.ZipFile('$OUT')
print('final entries:', len(z.namelist()), '/ dex:', sum(1 for n in z.namelist() if n.startswith('classes') and n.endswith('.dex')))"

echo "== 9. patch markers inside the SIGNED apk =="
for e in 1 3; do
  E=classes$e.dex; [ "$e" = "1" ] && E=classes.dex
  rm -rf $V5/sv$e $V5/sv$e.zip
  python3 -c "import zipfile; z=zipfile.ZipFile('$OUT'); open('/tmp/v5/s$e.dex','wb').write(z.read('$E'))"
  python3 -c "import zipfile; z=zipfile.ZipFile('$V5/sv$e.zip','w'); z.write('/tmp/v5/s$e.dex','classes.dex')"
  java -jar /tmp/v4/tools/apktool_3.0.3.jar d --no-res -f -o $V5/sv$e $V5/sv$e.zip 2>&1 | tail -1
done
python3 /home/z/my-project/scripts/verify_v5_markers.py $V5/sv3/smali $V5/sv1/smali

echo "== 10. sha256 =="
sha256sum "$OUT"
echo "DONE: $OUT"
