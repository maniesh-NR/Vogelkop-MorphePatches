#!/bin/bash
TOK=$(cat /home/z/my-project/upload/github_token.txt | tr -d '\n\r')
REPO="maniesh-NR/Vogelkop-MorphePatches"
DIR="${1:-harness}"
echo "=== $DIR/ ==="
curl -s --max-time 60 -H "Authorization: Bearer $TOK" -H "Accept: application/vnd.github+json" "https://api.github.com/repos/$REPO/contents/$DIR" | python3 -c "
import json,sys
d=json.load(sys.stdin)
if isinstance(d, dict): print('message:', d.get('message'))
else:
    for f in d: print(f\"{f['type']:6} {f['size']:>12} {f['path']}\")"
