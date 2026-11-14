# Opera Beta 104 custom build — patch notes (v6, universal APK)

## Scope of v6 — driven by the v5 device test report

v6 keeps the device-proven v4/v5 pipeline (APKEditor-merged substrate +
byte-safe dex splice + morphe.keystore signature; same cert
`28f79a444459c0a6…`) and adds **22 new code patches across two dexes** plus a
**binary patch of the ad-blocker manifest** (`assets/op/abp.manifest`).
Resources are otherwise untouched.

Two variants are published:

| APK | content |
|---|---|
| `OperaBeta-104.0.5262.91143-custom-v6-universal.apk` | all v6 patches |
| `OperaBeta-104.0.5262.91143-custom-v6-universal-nonews.apk` | same + live scores & news removed (optional patch set) |

## What changed vs v5

### 1. Ad blocker: now CUSTOM mode, every list on, "Opera site fixes" gone
- Default mode changed from ENHANCED (1) to **CUSTOM (2)** — patch A1.
- `ad_blocking_mode.selected_custom_lists` is **seeded with all 39
  picker-visible lists** (EasyList, uBlock, uBlock-powered lists, AdGuard Ads,
  AdGuard Mobile Ads, NoCoin and all 34 regional lists) — patch A2. In Custom
  mode the engine uses exactly this set, so every checkbox you can see in the
  list picker is checked.
- `assets/op/abp.manifest` rewritten (binary patch):
  - `opera_fixes` ("Opera Ad Blocker Site Fixes") **removed** from both the
    URL and CSS sets and from the metadata; its two bundled compiled assets
    are replaced by the empty list (belt and braces).
  - all normal lists promoted to bitmask 3 (on in Balanced AND Enhanced, so
    switching modes later never loses protection).
  - the internal Opera-partner allow-lists (`tier1_allow_rules`,
    `tier2_allow_rules`), the QA `testcase` list and the redundant
    `ublock_min` are pinned to bitmask 8: **hidden from the picker and never
    auto-active in any mode** — no partner ad whitelisting.
- `zi3.k()`/`zi3.q()` now always load the manifest from APK assets — patch A4.
  A server-pushed manifest can **never** revert our catalog (push ACKs still
  fire; only the content stays pinned).
- Custom-list **add/import** needs no patch: the "Add custom list" row ships
  in the Custom-mode screen and is reachable now that Custom is the default.

### 2. VPN: menu card gone, settings fully unlocked
- The **"VPN Pro" card below History / Offline pages / Flow** in the main menu
  is dead: `p12.n()` (the MainMenuVpnProBannerState factory) now returns null
  — patch V6. Null is the stock "VPN Pro not offered here" state.
- The padlocked free-layout rows are gone for good: the VPN settings screen
  now **always uses the premium layout** (`Legn.b` forced to 2) — patch V5a.
  "Auto-connect on device startup" is a working checkbox (writes
  `vpn.vpnpro_auto_connect`, enforced by VpnProReceiver on boot) with **no
  padlock**, and "VPN protocol" is a normal row.
- "VPN protocol" now **always opens the real protocol picker**
  (Auto / Lightway-TCP / Lightway-UDP via `sfn`) instead of routing through
  the dead paywall — patch V5b. The choice is stored in the native VPN
  config and applied on the next connect.
- v5's paywall router kill (V3, `cgn.J0` → return-void) is kept: every
  remaining "Get started"-style Pro button still does nothing.

### 3. Wallpapers & app icons: visible again AND unlocked
v5 accidentally made the premium catalog invisible (the rewards feature gate
also gates the catalog). v6 keeps rewards OFF but un-gates the catalog:
- the wallpaper and app-icon **catalog fetches now launch with rewards
  disabled** (patches R3a/R3b), the **lists are emitted** (R4a/R4b) and the
  icons refresh coroutine no longer re-checks the rewards state (R4c).
- v5's unlock patches (R1 `k15.a()` always "purchased", R2 icon picker
  `locked=false`) are kept, so everything renders free-to-apply.
- 10,000 points stay impossible (server-issued balance) — and remain
  unnecessary.

### 4. Minipay / wallet / rewards surfaces removed
- **Minipay menu item** never appears (M1 kills the feature gate,
  M3 skips the `wol.MINIPAY` add; belt and braces).
- **Minipay is no longer offered in the toolbar customization** list
  (M2: its `pc` entry is not customizable) — same for the **Rewards**
  toolbar button (M2b).
- The **crypto Wallet menu item** is never added (M3b).
- The **"Rewards — Earn while you browse" row is gone from the browser
  settings** (N1 removes its catalog entry).

### 5. Notifications settings sanitised
The in-app "Personalize your experience" screen keeps only **Push
notifications**. The seven promo toggles — eSIM, Feature tips, Feedback and
ratings, VPN Pro, Product and service news, Rewards, Wallpaper promotions —
are hidden (N2). Their notification defaults were already OFF since v5, so
nothing behind them fires either.

### 6. Optional: live scores & news removal (the `-nonews` APK)
- `enable_newsfeed` defaults **OFF** (X1).
- `live_scores_enabled` is **forced OFF flag-proof** (X2 — a server config
  refresh cannot flip it back, same technique as v5's tracker-blocker force).
- The **Live scores toolbar button** is not offered in toolbar customization
  (X3).
The start page then shows neither the news feed nor the live-scores card, and
their data is not fetched. The standard v6 APK leaves both untouched.

## Kept from v4/v5 (unchanged)
- P1 onboarding skip, P2 "Set up your browser" sheet skip, P3 splash spinner
  removal, 02f startup-waiter bypass (freeze fix), eSIM removals (E1-E3),
  default-browser banner off (B1), splash white background (K1),
  pangle split exclusion, 16 KB page zipalignment, all v5 defaults
  (cookies = enabled-except-third-party, Secure DNS = Cloudflare,
  trending searches off, usage reports off, data collection off,
  tracker blocker on, VPN Pro mentions/locations/upsells removed).

## Clean-install requirement
All default-setting patches are **first-run defaults**. Install over a
previous build only if you accept its stored settings — for a clean test,
**uninstall the old build first** (this also applies to the ad-blocker mode:
a v5 install that ever opened the mode screen may have stored
`ad_blocking_mode` and would keep it).

## Verification performed (v6, both variants)
- baksmali roundtrip of both rebuilt dexes: **all 40 v4+v5 markers and all
  22 v6 markers present** (43 with the 3 nonews markers), inside the final
  signed APKs as well
- entry-diff vs substrate: exactly `classes.dex`, `classes3.dex`,
  `assets/op/abp.manifest` and the two emptied `opera_fixes` assets changed
- the patched manifest re-parsed from the signed APKs: 43 adblock lists,
  `opera_fixes` absent, internal allow-lists pinned to bitmask 8
- zipalign -c -P 16: OK; `.so` (10) and `resources.arsc` STORED preserved
- apksigner verify (min-sdk 23): v1 true, v2 true, v3 true
- aapt2 badging: `com.opera.browser.beta` 104.0.5262.91143 (1910404306)
- final sha256:
  - v6-universal.apk:
    `15cc03fc0c2fd1994cd2182a3f0ffeb65a1baca20c37862bd82c4561ce2cfdc5`
  - v6-universal-nonews.apk:
    `df66bb327ca5d769460014bfbff5e92e959cdd463f8f8456dd8ac738dc220320`

## Build artifacts
- `scripts/apply_v6_patches.py` — all v6 edits (idempotent, fail-loud,
  `--nonews` adds the optional patch set)
- `scripts/build_v6_universal.sh <standard|nonews>` — 2-dex rebuild → splice
  (dexes + manifest + emptied assets) → align → sign → verify
- `scripts/verify_v6_markers.py` — 40+22(+3)-marker fail-loud verifier
