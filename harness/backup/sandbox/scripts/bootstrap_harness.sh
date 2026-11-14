#!/bin/bash
# Bootstrap the Vogelkop harness on a fresh sandbox (mirrors harness/bin/install.sh)
set -euo pipefail
SANDBOX="/home/z/my-project"
VAULT="$SANDBOX/.vault"
CLONE="$SANDBOX/.harness/vogelkop"
REPO_URL="https://github.com/maniesh-NR/Vogelkop-MorphePatches.git"

# 1. token -> vault
mkdir -p "$VAULT"
cp "/home/z/my-project/upload/Vogelkop access key.txt" "$VAULT/github.token"
chmod 600 "$VAULT/github.token"
TOKEN="$(tr -d '[:space:]' < "$VAULT/github.token")"
[ -n "$TOKEN" ] || { echo "ERROR: token empty"; exit 1; }

# 2. askpass helper (no secrets stored inside)
cat > "$VAULT/askpass.sh" <<ASKPASS
#!/bin/sh
case "\$1" in
  *sername*) echo "maniesh-NR" ;;
  *) tr -d '[:space:]' < "$VAULT/github.token" ;;
esac
ASKPASS
chmod 700 "$VAULT/askpass.sh"

# 3. clone if needed
if [ ! -d "$CLONE/.git" ]; then
  mkdir -p "$(dirname "$CLONE")"
  GIT_ASKPASS="$VAULT/askpass.sh" GIT_TERMINAL_PROMPT=0 git clone "$REPO_URL" "$CLONE" 2>&1 | tail -3
fi
git -C "$CLONE" config user.name  "maniesh-NR"
git -C "$CLONE" config user.email "maniesh-NR@users.noreply.github.com"
echo "harness clone ready: $(git -C "$CLONE" rev-parse --short HEAD) @ branch $(git -C "$CLONE" rev-parse --abbrev-ref HEAD)"
