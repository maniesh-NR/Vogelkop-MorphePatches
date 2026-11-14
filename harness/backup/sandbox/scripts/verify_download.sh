#!/bin/bash
TOK=$(cat /home/z/my-project/.vault/github.token | tr -d '\n\r')
echo "=== v2 assets in sandbox-storage release ==="
curl -s --max-time 60 -H "Authorization: Bearer $TOK" "https://api.github.com/repos/maniesh-NR/Vogelkop-MorphePatches/releases/tags/sandbox-storage" | python3 -c "
import json,sys
r=json.load(sys.stdin)
want={'OperaBeta-104.0.5262.91143-custom-v2.apkm','INSTALL-AND-TEST.md','PATCH-NOTES-v2.md','V2-SHA256SUMS.txt'}
for a in r['assets']:
    if a['name'] in want:
        print(f\"{a['name']:50} {a['size']:>12}B state={a['state']} id={a['id']}\")
        print(f\"  url: {a['browser_download_url']}\")"
echo ""
echo "=== ranged GET on the .apkm (public URL, no auth) ==="
curl -s --max-time 60 -r 0-3 -o /tmp/apkm-magic.bin -w "http=%{http_code} bytes=%{size_download} type=%{content_type}\n" -L "https://github.com/maniesh-NR/Vogelkop-MorphePatches/releases/download/sandbox-storage/OperaBeta-104.0.5262.91143-custom-v2.apkm"
echo "magic bytes: $(xxd -p /tmp/apkm-magic.bin 2>/dev/null || od -An -tx1 /tmp/apkm-magic.bin | tr -d ' ')"
echo ""
echo "=== full download + hash check of INSTALL-AND-TEST.md ==="
curl -sL --max-time 60 "https://github.com/maniesh-NR/Vogelkop-MorphePatches/releases/download/sandbox-storage/INSTALL-AND-TEST.md" -o /tmp/dl-INSTALL.md
sha256sum /tmp/dl-INSTALL.md
echo "expected: 4ec03d643af7436368d41b429d49e186b06bca8c091fecd6beca91176c4f5021"
echo ""
echo "=== remote backup commit ==="
curl -s --max-time 60 -H "Authorization: Bearer $TOK" "https://api.github.com/repos/maniesh-NR/Vogelkop-MorphePatches/commits/main" | python3 -c "import json,sys; c=json.load(sys.stdin); print(c['sha'][:7], '|', c['commit']['message'].split(chr(10))[0])"
