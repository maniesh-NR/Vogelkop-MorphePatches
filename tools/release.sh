#!/bin/bash
# Publish the Vogelkop patches release: push, tag, create the GitHub release
# and upload the bundle asset. Requires a GitHub PAT with repo contents:write.
#
#   export GITHUB_ACTOR=maniesh-NR
#   export GITHUB_TOKEN=ghp_xxx        # new PAT — never paste tokens in chats
#   tools/release.sh 1.2.2
#
set -euo pipefail
cd "$(dirname "$0")/.."

VER="${1:?usage: tools/release.sh <version>}"
REPO_SLUG="maniesh-NR/Vogelkop-MorphePatches"
BUNDLE="patches/build/libs/patches-$VER.mpp"
API="https://api.github.com/repos/$REPO_SLUG"

[ -f "$BUNDLE" ] || { echo "missing $BUNDLE — run the gradle build first" >&2; exit 1; }
[ -n "${GITHUB_ACTOR:-}" ] && [ -n "${GITHUB_TOKEN:-}" ] || {
    echo "export GITHUB_ACTOR and GITHUB_TOKEN first" >&2; exit 1; }

auth=(-H "Authorization: Bearer $GITHUB_TOKEN" -H "Accept: application/vnd.github+json")

echo "== push main =="
git push origin main

echo "== create tag v$VER =="
git tag -f "v$VER" >/dev/null
git push -f origin "refs/tags/v$VER"

echo "== create release v$VER =="
NOTES=$(python3 -c "import json;print(json.load(open('patches-bundle.json'))['description'])")
PAYLOAD=$(python3 -c \
    "import json,sys;print(json.dumps({'tag_name':'v$VER','name':'v$VER','body':sys.argv[1],'draft':False,'prerelease':False}))" \
    "$NOTES")
RELEASE_ID=$(curl -sf "${auth[@]}" -X POST "$API/releases" -d "$PAYLOAD" \
    | python3 -c "import json,sys;print(json.load(sys.stdin)['id'])")

echo "== upload asset (release $RELEASE_ID) =="
curl -sf "${auth[@]}" -X POST \
    -H "Content-Type: application/octet-stream" \
    --data-binary "@$BUNDLE" \
    "$API/releases/$RELEASE_ID/assets?name=patches-$VER.mpp" >/dev/null

echo "done: https://github.com/$REPO_SLUG/releases/tag/v$VER"
