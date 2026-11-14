#!/bin/bash
# Check GitHub token identity and repo access (never prints the token itself)
TOK=$(cat /home/z/my-project/upload/github_token.txt | tr -d '\n\r')
VTOK=$(cat "/home/z/my-project/upload/Vogelkop access key.txt" | tr -d '\n\r')
for NAME in "upload-token" "$TOK" "vogelkop-key" "$VTOK"; do
  :
done
echo "=== upload/github_token.txt ==="
curl -s -H "Authorization: Bearer $TOK" -H "Accept: application/vnd.github+json" https://api.github.com/user | python3 -c "import json,sys; d=json.load(sys.stdin); print('login:', d.get('login'), '| name:', d.get('name'), '| message:', d.get('message'))"
echo "=== Vogelkop access key ==="
curl -s -H "Authorization: Bearer $VTOK" -H "Accept: application/vnd.github+json" https://api.github.com/user | python3 -c "import json,sys; d=json.load(sys.stdin); print('login:', d.get('login'), '| name:', d.get('name'), '| message:', d.get('message'))"
