# Changelog

All notable changes to the Vogelkop Morphe patches (Opera / Opera Beta /
Opera GX) are documented here. Versions follow the tags in this repository;
each tag matches a GitHub release carrying the compiled `patches-<version>.mpp`
bundle.

## v1.2.4 (2026-11-08)

### Startup diagnostics — the app now reports its own crashes

The instant crash-on-open reported for v1.2.0–v1.2.3 patched builds persisted
through three signature-spoof rewrites, because the only available evidence
was "it crashes when I open it" — no device stack trace was ever captured.
v1.2.4 removes that dependency on `adb logcat`:

- **New patch: *Startup diagnostics*** (default on, all four supported
  packages). It merges its own extension dex (`extensions/diag.mpe`, class
  `app.template.extension.diag.StartupDiag`) and instruments **every
  `Application` subclass** of the target app at three register-neutral
  injection points (existing registers are only ever read, never written):
  the start of every `attachBaseContext(Context)` (which runs before
  ContentProviders and `Application.onCreate`), the start of every
  `onCreate()`, and before every `return-void` in every `onCreate()`.
- **Any uncaught exception is self-reported.** An uncaught-exception handler
  is installed at `attachBaseContext` — early enough to capture provider and
  pre-onCreate crashes — and writes the full stack trace, thread, process
  name and timestamp to
  `Android/data/<package>/files/vogelkop-diag.log`, a file any file manager
  can open without permissions or root. The handler **chains to the previous
  default handler** (Opera's breakpad wiring) so Opera's own crash flow is
  preserved, and re-asserts itself at every injection point because Opera
  swaps the handler during `onCreate`. Every entry point is wrapped in
  `try/Throwable` — a diagnostic layer must never be the crash.
- **Startup breadcrumbs.** The log records each stage
  (`attach-base-context`, `app-onCreate entered/completed`), the device
  model, Android/SDK version, app version, and - decisively for this
  project - **which signing certificate the app currently sees for itself**
  (Opera's vendor certificate proves the spoof engaged at runtime; the Morphe
  key means it did not) and **the spoof hook's own install state**.
- The hook extension exposes its install result as a public static field
  (`SignatureHookApp.installState`: `ok(creator-proxy)` /
  `ok(no-creator-proxy)` / `failed:<throwable-class>`), read reflectively by
  the diagnostics so they work with the spoof disabled too. Because the
  diagnostics are independent of *Spoof app signature* (separate extension
  dex, separate patch), a no-spoof build still self-reports.

### What v1.2.4 ruled out (local end-to-end reproduction)

The whole patching pipeline was reproduced locally for the first time —
official `Opera_103_3_5234_91185_Generic_Opera_arm8_LZMA.apk` (sha256
verified) patched with Morphe Desktop CLI v2.1.1 and the v1.2.3 bundle — and
the output was audited byte-by-byte. All of the following check out, so
these are **not** the crash cause:

- all 135 redirected call sites match the merged helper descriptors exactly,
  with matching register counts; no un-redirected `getPackageInfo` /
  `SigningInfo` reads remain in app code;
- the extension dex is merged exactly once, placeholders rewritten, no
  duplicate classes across the 9 dex files; every dex passes D8's strict
  parser; the re-parented hierarchy is correct;
- all native libraries stay byte-identical and STORED (including the
  156 MB arm64 engine); `AndroidManifest.xml` is semantically identical
  (only line-number metadata differs);
- the rebuilt `resources.arsc` contains the exact same entries as the
  original (config chunks reordered, entries identical) and parses in
  aapt2/libandroidfw semantics.

### Signing key rotated

The bundle signing key was rotated (the previous private key was lost with a
recycled build environment). `morphe-signing.pub` now contains the new public
key; bundle verification is unchanged - each release simply carries a
signature made by the new key, exactly as in the v1.1.2 rotation. The key
file is not committed; `MORPHE_SIGNING_KEY` (or a local `morphe-signing.key`)
signs release builds.

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
