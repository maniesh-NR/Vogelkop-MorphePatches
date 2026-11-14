#!/bin/bash
TOK=$(cat /home/z/my-project/upload/github_token.txt | tr -d '\n\r')
REPO="maniesh-NR/Vogelkop-MorphePatches"
BRANCH="${2:-main}"
PATH_IN_REPO="$1"
DEST="$3"
curl -s --max-time 90 -H "Authorization: Bearer $TOK" -H "Accept: application/vnd.github.raw" "https://api.github.com/repos/$REPO/contents/$PATH_IN_REPO?ref=$BRANCH" -o "$DEST"
echo "fetched $PATH_IN_REPO -> $DEST ($(wc -c < "$DEST") bytes)"
