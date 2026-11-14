# Opera Beta 104 custom build — patch notes (rebuild v2)

Base: com.opera.browser.beta 104.0.5262.91143 (versionCode 1910404306), APKMirror bundle.
Decoded at opera/decoded (apktool 3.0.3).

Context: previous patched build (patch set lost in sandbox recycle) froze after the
onboarding "start browsing" button (UI freeze + memory pressure + black screen on relaunch,
reproduced on s3/w1/w2/x1/x2). This rebuild takes a different, minimal strategy:
skip the whole onboarding chain instead of editing it, and do not touch the
BrowserActivity startup/draw chain at all.

## Patches applied to opera/decoded

### P1 — Skip WelcomeActivity (first-run onboarding flow)
File: smali_classes3/com/opera/android/OperaApplication.smali
Method: `.method public final a()Z`
Change: early-return `true` (injected `const/4 v0, 0x1; return v0` at method start,
original body left as unreachable code).
Why: `a()` is the master "app fully set up" gate. Exactly two callers, both route to
WelcomeActivity when it returns false:
- com/opera/android/IntentDispatcherActivity.onCreate (:cond_b)
- com/opera/android/BrowserActivity.onCreate (:cond_39)
Returning true sends both straight to the normal browser startup.
The a() conditions it fakes: eula_accepted.gdpr, pushed.sequence, "need" pref,
r65.e(), has_waited_for_startup_dependencies, personalization.onboarding.completed.

### P2 — Skip in-browser "Set up your browser" personalization sheet
File: smali_classes3/cfn.smali
Case: `:pswitch_11` (observable behind Li0o;)
Change: `xor-int/2addr v0, v5` -> `const/4 v0, 0x0`
Why: this observable computes `!prefs("personalization.onboarding.completed")` =
"should show personalization onboarding". Forced to false (completed) the
wallpaper/news-interests sheet and its "start browsing" button never appear.
This also removes the trigger that led into the frozen post-onboarding transition.

### P3 — Remove splash loading indicator ("loading bar")
File: smali_classes3/ssi.smali
Case: `:pswitch_17` (runnable posted 400ms after SplashView inflates)
Change: drop the `findViewById(splash_spinner).setVisibility(VISIBLE)` body, keep
check-cast + return-void.
Why: the only code that reveals the spinner on the BrowserActivity splash view.
The ViewStub inflation, kv3 OnPreDrawListener, and r1() splash teardown are all
left stock — no control-flow change (this is where the old build's freeze
probably originated: it broke the startup/draw chain).

### P4 — Blank the Android 12+ system splash icon ("Opera logo" at cold start)
File: res/values/styles.xml (style BrowserActivityDefault) + new res/drawable/op_splash_blank.xml
Change: `<item name="android:windowSplashScreenAnimatedIcon">@drawable/op_splash_blank</item>`
(transparent shape).
Why: on A12+ the launcher activity's system splash shows the Opera logo icon.
Blanking it leaves a plain, brand-free splash of the theme background color.
Pre-A12 devices have no system splash; the in-app Opera-logo Lottie lives in the
onboarding flow (startup_fragment_new.xml, @raw/lottie_startup_opera) which is
skipped by P1/P2.

### P5 — Drop Pangle (ByteDance) ad SDK splits (Play Protect quiet install)
Packaging change: the delivered bundle omits split_pangle_ads.apk and all 25
split_pangle_ads.config.<lang>.apk splits.
Why: ad modules are loaded via reflection with availability probing
(smali_classes3/k8.smali -> smali_classes3/ay.smali :pswitch_8:
`Class.forName(...)` wrapped in try/catch ClassNotFoundException -> Boolean.FALSE),
so a missing module is handled gracefully by design (network disabled).
This matches the observed behavior of the previous build (no Play Protect warning).

## Not changed (deliberately)
- BrowserActivity onCreate pre-draw gating (kv3), r1() splash teardown, RootView flags.
- m9k/g49 first-run "startup dependencies" wait (bounded by ~15s timeout, proceeds
  regardless of outcome; t77 persists has_waited_for_startup_dependencies).
- InstallSplitLocaleActivity and PreviousCrashActivity routing (still useful).

## Known residual behavior
- Cold start still takes the time Chromium needs to init; user sees the plain
  splash surface (dark/light per theme) for ~2-4s on mid devices. This is the
  same pause x2 measured; without the onboarding Lottie there is nothing left
  to remove — it is app init time, not branding.

## Build/sign/package
- apktool b opera/decoded -> opera/build/base.apk
- Re-sign base + all kept splits with the same debug key (uber-apk-signer 1.3.0,
  which also zipaligns): java -jar tools/uber-apk-signer.jar --apks <dir>
- Bundle: zip -> download/OperaBeta104-Custom-v2.apkm (info.json + base.apk +
  22 non-pangle splits). Install with any split-APK installer (SAI etc.)
  after uninstalling the previous custom build (different signing key).
