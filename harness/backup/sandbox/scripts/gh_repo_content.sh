#!/bin/bash
TOK=$(cat /home/z/my-project/upload/github_token.txt | tr -d '\n\r')
REPO="maniesh-NR/Vogelkop-MorphePatches"
echo "=== Repo info ==="
curl -s -H "Authorization: Bearer $TOK" -H "Accept: application/vnd.github+json" "https://api.github.com/repos/$REPO" | python3 -c "import json,sys; d=json.load(sys.stdin); print('name:', d.get('name'), '| default_branch:', d.get('default_branch'), '| size:', d.get('size'), 'KB | message:', d.get('message'))"
echo "=== Root contents ==="
curl -s -H "Authorization: Bearer $TOK" -H "Accept: application/vnd.github+json" "https://api.github.com/repos/$REPO/contents/" | python3 -c "
import json,sys
d=json.load(sys.stdin)
if isinstance(d, dict): print('message:', d.get('message'))
else:
    for f in d: print(f\"{f['type']:6} {f['size']:>12} {f['path']}\")"
echo "=== Recent commits ==="
curl -s -H "Authorization: Bearer $TOK" -H "Accept: application/vnd.github+json" "https://api.github.com/repos/$REPO/commits?per_page=5" | python3 -c "
import json,sys
d=json.load(sys.stdin)
if isinstance(d, dict): print('message:', d.get('message'))
else:
    for c in d: print(c['sha'][:7], '|', c['commit']['message'].split(chr(10))[0], '|', c['commit']['author']['date'])"
