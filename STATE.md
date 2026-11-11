# STATE — Morphe × Opera Beta v1.3.1 (reconstructed 2026-11-11)

Prior repo history was lost in a sandbox recycle; this file records the ladder
state from rung E onward. Byte-level facts below were re-verified on-host this
session from the shipped artifacts.

A SECOND sandbox recycle happened before the W-rung; all artifacts (keystore,
C1 substrate, B0b, sums) were re-downloaded from the `sandbox-storage` GitHub
release and hash-verified. The toolchain (build-tools r34, jadx 1.5.6,
apktool 3.0.3, androguard 4.1.4) was re-provisioned from scratch.

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
| N0 | C1, patcher zip-rewrite only (null-patch control) | not flashed (moot) |
| S1 | C1 + 02a only (eula read-bypass, 4 sites) | **no T&C dialog, but HANGS at "Almost there!", black screen on reopen → 02a convicted (semantic)** |
| S2 | C1 + 03a only (manifest: 3 VpnPro components cut) | **instant crash → 03a convicted** |
| S3 | C1 + 03c only (5 vpn_pro strings blanked) | boots; part of a VPN Pro notice blanked → innocent + only patch with visible effect |
| S4 | C1 + 02b only (fixed 1-byte form) | boots → innocent (CMP onboarding dialog still shows → inert for that goal) |
| S5 | C1 + 02c only (mm6.e → false) | boots → innocent (default-browser onboarding dialog still shows → inert) |
| S6 | C1 + 03b only (wdn.a → false) | boots → innocent (user-visible VPN Pro button NOT wdn.a-gated) |

## Convictions (post-S-rung, complete and consistent)

1. Legacy 02b (`const/4 v0,0; return v0` over the r65.l head) split the
   following 2-unit `if-nez`; orphaned bytes decode as a phantom sparse-switch
   → ART verifier rejection → E/F crashes. Fixed = 1-byte operand flip.
2. **02a (read-bypass) is a semantic killer**: forcing the four
   `SettingsManager.i("eula_accepted.gdpr")` reads true skips the T&C leaf but
   never WRITES the pref and never runs the real accept path
   (`WelcomeActivity.X()`); the onboarding state machine deadlocks at the
   "Almost there!" finalization and relaunch renders black.
3. **03a (manifest component cut) is a killer**: removing the three VpnPro
   component declarations breaks a startup resolution (crash before first
   frame). Manifest surgery is retired; VPN Pro removal is code/resource-level.
4. 02b/02c/03b are innocent but INERT for the onboarding dialogs: the dialogs
   the user wants gone are steps of the `q0o.g()` onboarding machine
   (m0o: FEATURES_ONBOARDING[DEFAULT_BROWSER, NOTIFICATIONS, CMP_INTRO],
   CONSENT, PERSONALIZATION), gated by `cfn` lambda cases — not by the
   standalone r65/mm6 re-prompt gates.
5. Rewrite path exonerated de facto (S3–S6 all pass through it and boot).
6. The user-visible "VPN Pro button + dialog" is the omnibox feature-suggestion
   chip (`nt8` enum: ESIM + VPN_PRO, `ofa://ui/upgrade?source=feature_suggestion`)
   — not wdn.a-gated, hence visible in S6.

## W-rung (2026-11-11, awaiting device results)

- `W1-rung-universal_signed.apk` — C1 + {02b, 02c, 03b, 03c-extended}
  (binary patcher only). Combination check of the four innocent patches.
- `W2-rung-universal_signed.apk` — W1 content + **smali-rebuilt classes3.dex**
  (hybrid pipeline, see docs/v1.3.1-R2/):
  - 02a' auto-accept: WelcomeActivity site#1 forced true (skip EULA leaf);
    site#2 `:cond_9` else-branch redirected to `X()` — the real T&C accept
    handler (writes eula, `m9k.S()`, `W()` → flow). Identical app state to a
    real button press; no more read/write divergence.
  - 02d: cfn case 0x8 `canOfferDefaultBrowser` → false (DEFAULT_BROWSER step dead).
  - 02e: cfn case 0xc `isCmpIntroductionDue` → false, case 0xd `e0o.shouldShow`
    → false (CMP_INTRO + CONSENT steps dead; unasked consent = all denied).
  - 03d: `nt8` values emptied (omnibox VPN Pro + eSIM suggestion chips gone;
    verified: zero `nt8.valueOf/values()` callers in any dex).
  - PERSONALIZATION (wallpaper/interests) step intentionally kept.
- Host verification: patcher anchors held on the rebuilt dex (02b/02c/03b
  applied cleanly), structural gate 0 failures on all 10 dexes, dexdump OK,
  androguard parse OK (11,928 classes), entry-diff vs C1 = exactly
  `classes3.dex` + `resources.arsc` + signatures. Full smali-tree audit:
  only the 3 intended files changed (+4 files with benign static-default-value
  encoding drops; class count identical).

## Tooling (reconstructed this session)

- `scripts/v131_binary_patch.py` — fixed-02b patcher, `--only`, `--no-patches`,
  structural gate, **extended 03c blank list (12 names)**.
- `scripts/splice_entry.py` — byte-preserving single-entry zip splice
  (the hybrid pipeline's dex injector).
- `scripts/build_w_rung.sh` — W1/W2 build+sign pipeline.
- Hybrid smali pipeline (decode → edit → rebuild → splice → binary-patch →
  sign): procedure in `docs/v1.3.1-R2/README.md`; patches as
  `docs/v1.3.1-R2/patches/*.smali.patch`.
- Calibration: gate on C1 = 0, on E2 = 1 (r65.l phantom switch).
