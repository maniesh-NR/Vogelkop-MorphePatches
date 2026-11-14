#!/bin/bash
# v5_jadx_dex.sh <n> — jadx-decompile substrate dex n (1=classes.dex) into opera5/jdx<n>
set -euo pipefail
N=${1:?usage: v5_jadx_dex.sh <dex-number>}
V5=/tmp/v5
SUB=/tmp/v4/substrate.apk
D=classes$N.dex; [ "$N" = "1" ] && D=classes.dex
mkdir -p $V5
python3 -c "import zipfile; z=zipfile.ZipFile('$V5/j$N.zip','w'); z.writestr('classes.dex', zipfile.ZipFile('$SUB').read('$D'))"
rm -rf /home/z/my-project/opera5/jdx$N
JAVA_OPTS="-Xmx2500m" /tmp/jadx/bin/jadx --threads-count 2 --no-debug-info -d /home/z/my-project/opera5/jdx$N $V5/j$N.zip 2>&1 | tail -n 2
echo "jdx$N: $(find /home/z/my-project/opera5/jdx$N -name '*.java' | wc -l) java files"
