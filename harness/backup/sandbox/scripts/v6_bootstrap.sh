#!/bin/bash
# v6_bootstrap.sh — full environment restore after sandbox recycle #N:
# harness clone, tools (APKEditor/apktool/jadx/morphe.keystore/build-tools r36),
# substrate APK, smali trees for all dexes, v4 patch base on smali3.
set -euo pipefail
SANDBOX=/home/z/my-project
VAULT=$SANDBOX/.vault
CLONE=$SANDBOX/.harness/vogelkop
V4=/tmp/v4
V6=/tmp/v6

echo "== 0. ram =="
free -m | head -2

echo "== 1. vault + askpass =="
mkdir -p "$VAULT"
cp "$SANDBOX/upload/github_token.txt" "$VAULT/github.token" 2>/dev/null || true
[ -s "$VAULT/github.token" ] || cp "$SANDBOX/upload/Vogelkop access key.txt" "$VAULT/github.token"
chmod 600 "$VAULT/github.token"
cat > "$VAULT/askpass.sh" <<'ASKPASS'
#!/bin/sh
case "$1" in
  *sername*) echo "maniesh-NR" ;;
  *) tr -d '[:space:]' < /home/z/my-project/.vault/github.token ;;
esac
ASKPASS
chmod 700 "$VAULT/askpass.sh"

echo "== 2. harness clone =="
if [ ! -d "$CLONE/.git" ]; then
  mkdir -p "$(dirname "$CLONE")"
  GIT_ASKPASS="$VAULT/askpass.sh" GIT_TERMINAL_PROMPT=0 \
    git clone -q https://github.com/maniesh-NR/Vogelkop-MorphePatches.git "$CLONE"
  git -C "$CLONE" config user.name "maniesh-NR"
  git -C "$CLONE" config user.email "maniesh-NR@users.noreply.github.com"
fi
test -d "$CLONE/.git" && echo "clone at $(git -C "$CLONE" rev-parse --short HEAD)"

echo "== 3. tools =="
mkdir -p $V4/tools
if [ ! -f $V4/tools/APKEditor-1.4.9.jar ]; then
  curl -sL --max-time 300 -o $V4/tools/APKEditor-1.4.9.jar \
    "https://github.com/REAndroid/APKEditor/releases/download/V1.4.9/APKEditor-1.4.9.jar"
fi
if [ ! -f $V4/tools/apktool_3.0.3.jar ]; then
  curl -sL --max-time 300 -o $V4/tools/apktool_3.0.3.jar \
    "https://github.com/iBotPeaches/Apktool/releases/download/v3.0.3/apktool_3.0.3.jar"
fi
if [ ! -f $V4/tools/morphe.keystore ]; then
  curl -sL --max-time 120 -o $V4/tools/morphe.keystore \
    "https://github.com/maniesh-NR/Vogelkop-MorphePatches/releases/download/sandbox-storage/morphe.keystore"
fi
if [ ! -x /tmp/jadx/bin/jadx ]; then
  curl -sL --max-time 300 -o /tmp/jadx.zip \
    "https://github.com/skylot/jadx/releases/download/v1.5.2/jadx-1.5.2.zip"
  rm -rf /tmp/jadx && mkdir -p /tmp/jadx && unzip -q -o /tmp/jadx.zip -d /tmp/jadx
fi
ls -la $V4/tools/ | grep -E 'jar|keystore'
echo "jadx: $(/tmp/jadx/bin/jadx --version 2>&1 | head -1)"

echo "== 4. build-tools r36 =="
mkdir -p /tmp/bt
if [ ! -x /tmp/bt/bt36/android-16/zipalign ]; then
  curl -sL --max-time 500 -o /tmp/bt/bt36.zip "https://dl.google.com/android/repository/build-tools_r36_linux.zip"
  unzip -q -o /tmp/bt/bt36.zip -d /tmp/bt/bt36
fi
BT=/tmp/bt/bt36/android-16
"$BT/aapt2" version
"$BT/zipalign" 2>&1 | head -1 || true

echo "== 5. substrate (APKEditor merge, pangle excluded) =="
mkdir -p $V4/merge_in
if [ ! -f $V4/substrate.apk ]; then
  python3 - << 'EOF'
import zipfile
z = zipfile.ZipFile('/home/z/my-project/upload/com.opera.browser.beta_104.0.5262.91143-1910404306_2dpi_25lang_19feat_c2b59ea30fab5744c9b5462fed6dd891_apkmirror.com.apkm')
keep = [n for n in z.namelist() if n == 'base.apk' or n.startswith('split_config.')]
assert len(keep) == 28, keep
for n in keep:
    open('/tmp/v4/merge_in/'+n,'wb').write(z.read(n))
print(f"merge_in: {len(keep)} apks (pangle excluded)")
EOF
  java -Xmx3g -jar $V4/tools/APKEditor-1.4.9.jar m -i $V4/merge_in -o $V4/substrate.apk 2>&1 | tail -3
fi
python3 - << 'EOF'
import zipfile
z = zipfile.ZipFile('/tmp/v4/substrate.apk')
names = z.namelist()
dex = [n for n in names if n.startswith('classes') and n.endswith('.dex')]
print(f"substrate: entries={len(names)} dex={dex}")
assert 'classes.dex' in names and 'classes3.dex' in names
import os
print('substrate size:', os.path.getsize('/tmp/v4/substrate.apk'))
EOF

echo "== 6. decode all dexes to smali =="
mkdir -p $V6
SUB=$V4/substrate.apk
for i in 1 2 3 4 5 6 7; do
  if [ -d $V6/smali$i ]; then echo "smali$i exists, skip"; continue; fi
  D=classes$i.dex; [ "$i" = "1" ] && D=classes.dex
  python3 -c "import zipfile; z=zipfile.ZipFile('$V6/c$i.zip','w'); z.writestr('classes.dex', zipfile.ZipFile('$SUB').read('$D'))"
  java -jar $V4/tools/apktool_3.0.3.jar d --no-res -f -o $V6/smali$i $V6/c$i.zip 2>&1 | tail -1
  echo "smali$i done: $(find $V6/smali$i -name '*.smali' | wc -l) files"
done
# stock classes3 kept aside; v6 works on smali3 = stock + v4 patches
cp -r $V6/smali3 $V6/smali3.stock
python3 $SANDBOX/scripts/apply_v4_patches.py $V6/smali3

echo "== 7. reproduce full v5 state (S1 + part2) =="
# v5 scripts hardcode /tmp/v5/smali3 and /tmp/v5/smali1 — symlink them here
mkdir -p /tmp/v5
rm -rf /tmp/v5/smali3 /tmp/v5/smali1
ln -s $V6/smali3 /tmp/v5/smali3
ln -s $V6/smali1 /tmp/v5/smali1
python3 $SANDBOX/scripts/apply_v5_patches.py
python3 $SANDBOX/scripts/apply_v5_patches_part2.py
python3 $SANDBOX/scripts/verify_v5_markers.py $V6/smali3/smali $V6/smali1/smali

echo "== 8. jadx trees for analysis (classes1 + classes3) =="
mkdir -p /home/z/my-project/opera6
for N in 1 3; do
  D=classes$N.dex; [ "$N" = "1" ] && D=classes.dex
  if [ ! -d /home/z/my-project/opera6/jdx$N ]; then
    python3 -c "import zipfile; z=zipfile.ZipFile('/tmp/v6/j$N.zip','w'); z.writestr('classes.dex', zipfile.ZipFile('$SUB').read('$D'))"
    JAVA_OPTS="-Xmx2500m" /tmp/jadx/bin/jadx --threads-count 2 --no-debug-info -d /home/z/my-project/opera6/jdx$N $V6/j$N.zip 2>&1 | tail -n 1
  fi
  echo "jdx$N: $(find /home/z/my-project/opera6/jdx$N -name '*.java' | wc -l) java files"
done
echo BOOTSTRAP-OK
