#!/bin/bash
TOK=$(cat /home/z/my-project/upload/github_token.txt | tr -d '\n\r')
REPO="maniesh-NR/Vogelkop-MorphePatches"
echo "=== harness/ tree ==="
curl -s -H "Authorization: Bearer $TOK" -H "Accept: application/vnd.github+json" "https://api.github.com/repos/$REPO/git/trees/main?recursive=1" | python3 -c "
import json,sys
d=json.load(sys.stdin)
for t in d.get('tree',[]):
    if t['path'].startswith('harness/'):
        print(f\"{t['type']:5} {t.get('size',''):>10} {t['path']}\")"
