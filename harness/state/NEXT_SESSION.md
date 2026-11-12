# NEXT_SESSION.md — working memory / handoff

Updated: 2026-11-12 (backup-policy session, UTC)

## Current state

- Harness LIVE with **event-driven backups** (ADR 0004): every execution
  plan ends with `harness/bin/backup.sh` as its final step; the 8-hour
  cron job was deleted 2026-11-12. Scripts in `harness/bin/`, memory
  seeded, snapshots pushed and verified.
- Project: v1.3.0 released; v1.3.1 W-rung W1/W2 built + host-verified,
  awaiting DEVICE TEST RESULTS from the user (root STATE.md §W-rung).

## Open threads

1. **v1.3.2 adblock defaults patch** — user-confirmed requirements are in
   `knowledge/project-morphe.md` §"v1.3.2 adblock patch" (AdGuard = the list
   that scored 100%; all regional lists on by default; remove the
   "opera site fixes" whitelist; add all uBO-shipped lists; custom
   blocklists; Secure DNS default Cloudflare 1.1.1.1). Recon needed:
   adblock settings storage, list seeding path, secure-DNS preference
   location.
2. **W1/W2 device results** — when the user reports, record verdicts in root
   STATE.md and continue per the v1.3.2 roadmap (target substrate: the W2
   lineage).
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
