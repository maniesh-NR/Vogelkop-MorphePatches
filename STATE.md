# STATE — Morphe × Opera Beta v1.3.1 (reconstructed 2026-11-11)

Prior repo history was lost in a sandbox recycle; this file records the ladder
state from rung E onward. Byte-level facts below were re-verified on-host this
session from the shipped artifacts.

## Device verdicts

| Build | Content | Device result |
|---|---|---|
| B0b | APKEditor merge of base+splits (v123) | boots |
| C1 | B0b + v1.3.0 Morphe patches (minus spoof) + startup diagnostics | boots |
| E1 | B0b + six v1.3.1 patches (legacy 02b) | installs, black screen → instant crash |
| E2 | C1 + six v1.3.1 patches (legacy 02b) | installs, black screen → instant crash |
| F1 | labeled "stock + fixed v1.3.1" — **actually shipped legacy 02b** (proved: F1 vs G2 = 3-byte r65.l head delta) | crash |
| F2 | labeled "FULL fixed" — **actually shipped legacy 02b** (F2 vs G1 = same 3-byte delta) | crash |
| K1 | B0b bytes + new-key re-sign, ZERO entry changes (pure re-sign; never touched the patcher rewrite) | boots |
| G0 | C1 + ONLY legacy-broken 02b (deliberate forensic) | not reported |
| G1 | C1 + six v1.3.1 patches, FIXED 02b (vs E2: exactly 2 bytes in r65.l) | **crash** |
| G2 | B0b + six v1.3.1 patches, FIXED 02b | **crash** |

## Convictions

1. Legacy 02b (`const/4 v0,0; return v0` over the r65.l head) split the
   following 2-unit `if-nez`; orphaned bytes decode as a phantom sparse-switch
   (payload 2117800535 units outside the 48-unit method) → ART verifier
   rejection of a startup class → E/F crashes. Structural gate reproduces:
   C1 = 0 failures, E2 = exactly 1 (`Lr65;->l`).
2. Fixed 02b = single operand byte flip (`const/4 v0,1` → `v0,0`), if-nez
   intact. Verified byte-identical between reconstructed patcher output (S4)
   and the G-rung G1.
3. G1+G2 crash ⇒ a SECOND killer exists among 02a/02c/03a/03b/03c (or 02b
   forced-false semantics). Structural gate clean ⇒ it is semantic, not a
   verifier-level defect. K1 boots ⇒ it is not key/sign/repack.
4. K1 was a pure re-sign (0/6346 entries changed vs B0b) ⇒ the patcher's
   zip-rewrite path is still device-unproven ⇒ N0 null-patch control required.

## S-rung (this session) — pending device results

N0 (rewrite-only control), S1=02a, S2=03a, S3=03c, S4=02b-fix, S5=02c,
S6=03b — all C1 substrate, all gate-clean, per-build byte-diff vs C1 proves
only intended deltas. Protocol + interpretation: download/S-RUNG-README.md.

## Tooling (reconstructed this session)

- `scripts/v131_binary_patch.py` — G-version patcher: fixed 02b, `--only`,
  `--no-patches`, `--02b-legacy-broken` (with `--no-gate`), structural gate
  (linear ART-style walk + switch-payload/branch-target resolution).
- `scripts/build_s_rung.sh` — N0/S1–S6 build+sign pipeline.
- E-rung patcher preserved as `scripts/v131_binary_patch_E-rung.py.bak`.
- Calibration: gate on C1 = 0, on E2 = 1 (r65.l phantom switch).
