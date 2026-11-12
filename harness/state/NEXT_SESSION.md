# NEXT_SESSION.md — working memory / handoff

Updated: 2026-11-12 (v1.3.2 #8 recon session, UTC)

## Current state

- Harness LIVE with **event-driven backups** (ADR 0004): every execution
  plan ends with `harness/bin/backup.sh` as its final step; the 8-hour
  cron job was deleted 2026-11-12. Scripts in `harness/bin/`, memory
  seeded, snapshots pushed and verified.
- Project: v1.3.0 released; v1.3.1 W-rung W1/W2 built + host-verified,
  awaiting DEVICE TEST RESULTS from the user (root STATE.md §W-rung).
- **v1.3.2 #8 (adblock defaults + Secure DNS) recon COMPLETE** — full
  findings in `evidence/adblock-defaults-recon.md`, ROADMAP #8 updated;
  tested manifest rewriter at repo `scripts/abp_manifest_patch.py`
  (stable 103 + beta 104 manifests byte-identical). 4-part patch
  designed: (A) manifest rewrite, (B) empty opera_fixes assets,
  (C) SettingsManager defaults (ad_blocking / dns_over_https_enabled /
  dns_over_https_mode → 1), (D) pin zi3.k/q to assets. Implementation
  awaits the W2 device verdict (target substrate).

## Open threads

1. **Implement v1.3.2 #8** once W2 passes its device round (or the user
   says to proceed on the current substrate): follow §4 of
   `evidence/adblock-defaults-recon.md`. C+D are smali edits
   (SettingsManager → classes3.dex, zi3 → classes.dex); A+B are resource
   edits; reuse `scripts/abp_manifest_patch.py`.
2. **W1/W2 device results** — when the user reports, record verdicts in
   root STATE.md and continue per the v1.3.2 roadmap (target substrate:
   the W2 lineage).
3. **Token expiry watch** — the PAT was uploaded 2026-11-12 and follows the
   project's ~7-day convention, so expect expiry around 2026-11-19. On auth
   failure, ask the user to re-issue (fine-grained, Contents: Read & Write on
   maniesh-NR/Vogelkop-MorphePatches) and upload the new key as
   `Vogelkop access key.txt`; `backup.sh` auto-imports it.
4. (optional) `scripts/upload_storage.py` has stale `/tmp/my-project` paths —
   retire it in favour of `harness/bin/storage_upload.py`, or fix its paths
   next time it is touched.

## Next session should

1. `git -C /home/z/my-project/.harness/vogelkop pull --rebase --autostash origin HEAD`
2. Read `memory/MEMORY.md` → this file → root `STATE.md`.
3. Do the work. EVERY reply ends with `bash harness/bin/backup.sh`
   (AGENTS.md "End of every prompt — MANDATORY final step"); at rung
   boundaries also write an episode + update this file BEFORE the backup.
