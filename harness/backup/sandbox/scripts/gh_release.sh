#!/bin/bash
TOK=$(cat /home/z/my-project/.vault/github.token | tr -d '\n\r')
echo "=== sandbox-storage release ==="
curl -s --max-time 60 -H "Authorization: Bearer $TOK" -H "Accept: application/vnd.github+json" "https://api.github.com/repos/maniesh-NR/Vogelkop-MorphePatches/releases?per_page=20" | python3 -c "
import json,sys
rels=json.load(sys.stdin)
if isinstance(rels, dict): print('message:', rels.get('message')); sys.exit()
if not rels: print('(no releases)')
for r in rels:
    print(f\"tag={r['tag_name']} name={r['name']!r} prerelease={r['prerelease']} draft={r['draft']}\")
    for a in r.get('assets',[]):
        print(f\"   asset: {a['name']:55} {a['size']:>12} bytes  state={a['state']}  dl={a['download_count']}\")"
