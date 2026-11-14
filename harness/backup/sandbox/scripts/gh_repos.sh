#!/bin/bash
TOK=$(cat /home/z/my-project/upload/github_token.txt | tr -d '\n\r')
echo "=== Repos visible to token ==="
curl -s -H "Authorization: Bearer $TOK" -H "Accept: application/vnd.github+json" "https://api.github.com/user/repos?per_page=100&sort=updated" | python3 -c "
import json,sys
d=json.load(sys.stdin)
if isinstance(d, dict): print('message:', d.get('message'))
else:
    for r in d:
        print(f\"{r['full_name']:50} private={r['private']} size={r['size']}KB updated={r['updated_at']}\")"
