#!/bin/bash
# v5_decode_all.sh — decode every substrate dex to smali (for patch anchors).
# classes3 comes from the v4 tree (already carries the 4 v4 patches).
set -euo pipefail
V5=/tmp/v5
SUB=/tmp/v4/substrate.apk
mkdir -p $V5
cp -r /tmp/v4/smali3 $V5/smali3
for i in 1 2 4 5 6 7; do
  if [ -d $V5/smali$i ]; then echo "smali$i exists, skip"; continue; fi
  D=classes$i.dex; [ "$i" = "1" ] && D=classes.dex
  python3 -c "import zipfile; z=zipfile.ZipFile('$V5/c$i.zip','w'); z.writestr('classes.dex', zipfile.ZipFile('$SUB').read('$D'))"
  java -jar /tmp/v4/tools/apktool_3.0.3.jar d --no-res -f -o $V5/smali$i $V5/c$i.zip 2>&1 | tail -1
  echo "smali$i done: $(find $V5/smali$i -name '*.smali' | wc -l) files"
done
echo ALL-DECODED
