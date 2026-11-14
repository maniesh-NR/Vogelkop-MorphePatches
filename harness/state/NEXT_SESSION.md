# NEXT_SESSION.md — working memory / handoff

Updated: 2026-11-14 (v6 universal build session, UTC)

## Current state

- Hybrid (apktool dex-rebuild + splice) pipeline is the shipping path:
  v4 installed fine, v5 confirmed (no Play Protect, fast first open, no
  onboarding). v6 BUILT + UPLOADED, awaiting device verdict.
- v6 deliverables in sandbox-storage: OperaBeta-104.0.5262.91143-custom-v6-
  universal.apk (15cc03fc…) and …-nonews.apk (df66bb32…), plus
  PATCH-NOTES-v6.md / V6-SHA256SUMS.txt.
- v6 content: ad blocker CUSTOM mode + 39-list seed + opera_fixes removed +
  manifest pinned (zi3); VPN Pro menu card dead (p12.n), premium layout
  forced (Legn.b=2), protocol picker always (bgn→sfn); wallpaper/icon
  catalogs un-gated from rewards (rmg/o71/r2i) — visible AND unlocked;
  Minipay/Wallet/Rewards surfaces removed (BrowserActivity gate, pc flags,
  d37 skips); notifications screen keeps only Push (rqd.k); Rewards settings
  row removed (bo3); nonews variant adds newsfeed/live-scores kills.
- Session bootstrap recipe that worked from a bare recycle:
  scripts/v6_bootstrap.sh (clone → tools → substrate → decode → v4 → v5),
  then scripts/apply_v6_patches.py [--nonews] and
  scripts/build_v6_universal.sh <standard|nonews>.

## Open threads

1. v6 device verdict (CLEAN install required — see PATCH-NOTES-v6.md). Watch:
   ad-blocker mode = Custom with all visible lists checked; protocol picker;
   wallpapers/icons; main menu; notifications screen.
2. If ad-blocker mode still reads "Balanced" on a clean install, hunt the
   runtime writer of ad_blocking_mode (only known writer is lk.onDetach).
3. arm64-v8a variant of the .apkm still wanted for real 64-bit libopera.so.
4. Token expiry watch — PAT re-issued 2026-11-14 (~7-day convention →
   expect expiry ~2026-11-21).

## Next session should

1. `git -C /home/z/my-project/.harness/vogelkop pull --rebase --autostash origin HEAD`
2. Read `memory/MEMORY.md` → this file → the 2026-11-14-v6 episode.
3. Do the work. End every reply with `bash harness/bin/backup.sh`.
