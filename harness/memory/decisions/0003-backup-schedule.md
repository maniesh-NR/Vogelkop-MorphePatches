# ADR 0003 — backup frequency

Date: 2026-11-12 · Status: accepted

## Decision

- An automated platform job (agent turn, name "Vogelkop sandbox backup") runs
  `harness/bin/backup.sh` **hourly**.
- Every working session additionally backs up at the end (AGENTS.md protocol)
  — the primary path. The hourly job is the crash backstop and a no-op when
  clean.

## Rationale

- The sandbox only changes during sessions, so most hourly runs are no-ops.
- The project's stated pain ("hourly sandbox wipes stop losing work", in the
  sandbox-storage release description) makes an hourly bound the right
  default: worst-case loss after a mid-session recycle is ~1 hour of work.
- Two prior recycle losses (v1.3.x) both happened between sessions, which the
  end-of-session backup already covers.

## Changing it

Delete and re-create the platform cron job with the desired interval; nothing
else depends on it. The scripts themselves are frequency-agnostic (flock
makes concurrent runs safe).
