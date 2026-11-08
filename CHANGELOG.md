# Changelog

All notable changes to the Vogelkop Morphe patches (Opera / Opera Beta /
Opera GX) are documented here. Versions follow the tags in this repository;
each tag matches a GitHub release carrying the compiled `patches-<version>.mpp`
bundle.

## v1.2.3 (2026-11-08)

### Spoof app signature — two-layer redesign (community-informed)

A code review against five community patch collections
([MorpheApp](https://github.com/MorpheApp/morphe-patches),
[rushiranpise](https://github.com/rushiranpise/morphe-patches),
[hxreborn](https://github.com/hxreborn/morphe-patches),
[kveld9](https://github.com/kveld9/kveld-morphe-patches),
[heval99](https://github.com/heval99/Heval-Morphe-Patches)) prompted a
redesign of the signature spoof along the lines of the proven Morphe
universal *Spoof signature* pattern (ported from
kveld9/morphe-patches, MorpheApp PR #2470 lineage):

- **New primary layer — call-site redirects.** Every
  `PackageManager.getPackageInfo(...)`,
  `PackageManager.hasSigningCertificate(...)`,
  `SigningInfo.getApkContentsSigners()`,
  `SigningInfo.getSigningCertificateHistory()` and
  `SigningInfo.hasMultipleSigners()` call site in the app's own bytecode is
  rewritten to a bundled static helper that swaps in the original Opera
  certificate. Deterministic, reflection-free, no hidden APIs, no final-field
  writes; the spoof no longer depends on the fragile `PackageInfo.CREATOR`
  swap. `invoke-virtual/range` call sites are rewritten to
  `invoke-static/range` (never skipped); only non-range sites using registers
  above v15 are skipped and reported in the patch log.
- **Hardened secondary layer — CREATOR parcel proxy.** The proxy body is
  wrapped so any throwable during rewriting returns the untouched parcel
  instead of crashing the unmarshalling binder thread.
- **Race fix.** Parcel's global creator caches (`mCreators`,
  `sPairedCreators`) are no longer `clear()`-ed wholesale (a racy, wide-window
  operation inherited from ApkSignatureKillerEx); only the cached
  `android.content.pm.PackageInfo` creator entries are evicted, via a
  collect-then-remove reflection pass.
- The placeholder fingerprint accepts both compiled shapes of the rewritten
  companion initializer (outer `<clinit>` or Companion constructor).

### Fixes & hardening

- `IgnoreBrowserBootFailuresPatch`, `HideBrokenInstallationDialogPatch`,
  `DisableAdModulesPatch`, `RemoveSponsoredSpeedDialPatch`,
  `DisableAnalyticsPatch` and the GX tile patch are unchanged; they were
  re-audited against the community patterns (offset-validated native
  rewrites, fail-loudly fingerprint drift, hook-count logging) and already
  follow them.

### Documentation

- New README section: *Do Brave Shields or uBlock Origin replace the built-in
  ad blocker?* — the researched answer for the three Android variants
  (engines not installable on Android; uBlock/AdGuard lists selectable in
  Opera's built-in blocker since Opera for Android 86; what filter lists
  cannot reach and these patches cover). Recommendation: patched Opera +
  built-in blocker on **Enhanced** mode.
- Attribution extended to kveld9/morphe-patches for the redirect-engine port.

## v1.2.2 (2026-11-08)

- Fix the v1.2.1 immediate crash-on-open: `PackageInfo.CREATOR` is
  `public static final`, and ART rejects `Field.set()` on final fields. The
  hook now requests hidden-API exemptions first, clears the FINAL bit via the
  hidden `Field#accessFlags` field, falls back to a `sun.misc.Unsafe` static
  write, then a plain set — and nothing can escape the static initializer
  (any failure is caught and logged, leaving a working app).

## v1.2.1 (2026-11-07)

- Fix the v1.2.0 startup crash: the extension was compiled against
  hand-written framework stubs with wrong shapes (`Base64` object vs class,
  Kotlin property calls on public fields). The extension is now compiled
  against the real Android framework (Robolectric android-all) and every
  `android/*` reference in the built dex is mechanically audited
  (`tools/AuditExtDex.java`) — the build fails if any reference would not
  resolve on a device.
- New patch: **Disable analytics & tracking** — rewrites third-party
  ad/measurement endpoint constants (Firebase Analytics collector, Google
  Ads/Doubleclick/IMA, Leanplum) to a dead host, in code and in static field
  initial values. Firebase infrastructure features depend on (push, feature
  flags, GX's filter list) is deliberately untouched.
- Patch-count reporting switched to `!=` so a version drift fails loudly.

## v1.2.0 (2026-11-06)

- Fix the welcome-splash hang: **Ignore browser boot failures** converts
  MainLibraryBoot failure announcements into success notifications so a
  failed engine boot can no longer deadlock the welcome flow (the dialog it
  used to call is a no-op since v1.1.0).
- Rename the bundle to "Vogelkop patches", embed the project logo.

## v1.1.2 (2026-11-06)

- Rename bundle to "Vogelkop Morphe Patches", rotate the bundle signing key.

## v1.1.1 (2026-11-05)

- Ship `classes.dex` inside the bundle JAR (D8, min API 26) plus the Ed25519
  bundle signature — fixes Morphe Manager showing 0 patches.
- SHA256SUMS now hashes the dex+signed bundle, not the jar-wiped artifact.

## v1.1.0 (2026-11-05)

- New patch: **Hide broken installation dialog** (crash-recovery nag and
  broken-installation flag).
- Memory: string patches scan the patcher's prebuilt string index and only
  materialize matched classes — peak patching RSS drops from 1.1–1.5 GB to
  ~333 MB on the 147 MB Beta base APK.

## v1.0.0 (2026-11-04)

- Initial bundle: **Disable ad modules** (Pangle/Mintegral/Liftoff),
  **Remove sponsored Speed Dial** (stable/beta SQL, GX JSON), **Disable
  Acceptable Ads whitelist** (pure-allowlist compiled lists replaced with an
  empty list), **Spoof app signature** (CREATOR proxy extension, ported from
  rushiranpise/morphe-patches).
