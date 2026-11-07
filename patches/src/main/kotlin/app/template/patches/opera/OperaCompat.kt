package app.template.patches.opera

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

/**
 * Compatibility targets for the Opera browser family.
 *
 * Notes on builds:
 *  - Google Play builds of Opera / Opera Beta ship as split bundles (~96 MB) whose
 *    Chromium core is downloaded at first run. All patched code (ad blocker list
 *    loading, suggested sites, ad module wiring) lives in `base.apk`, so patching
 *    the base (or a merged universal APK) works for both Play and direct downloads.
 *  - The direct ("generic") build from get.opera.com is a single full APK
 *    (e.g. `Opera_103_3_5234_91185_Generic_Opera_arm8_LZMA.apk`,
 *    versionCode 1910312408) and is the recommended input.
 *  - Opera GX 3.x is a standalone WebView-based app, not a Chromium build, and has
 *    its own ad-blocker configuration (see `gx/GxRemoveSponsoredTilesPatch.kt`).
 */
val OPERA_COMPATIBILITY = Compatibility(
    name = "Opera Browser",
    packageName = "com.opera.browser",
    apkFileType = ApkFileType.APK,
    appIconColor = 0xFF1B36,
    targets = listOf(
        // Google Play bundle (base.apk versionCode).
        AppTarget(version = "103.3.5234.91185", versionCode = 1910312306),
        // Direct download from get.opera.com (generic arm64 build).
        AppTarget(version = "103.3.5234.91185", versionCode = 1910312408),
    ),
)

val OPERA_BETA_COMPATIBILITY = Compatibility(
    name = "Opera Browser Beta",
    packageName = "com.opera.browser.beta",
    apkFileType = ApkFileType.APK,
    appIconColor = 0xC15746,
    targets = listOf(
        AppTarget(version = "104.0.5262.91143", versionCode = 1910404306),
    ),
)

val OPERA_GX_COMPATIBILITY = Compatibility(
    name = "Opera GX",
    packageName = "com.opera.gx",
    apkFileType = ApkFileType.XAPK,
    appIconColor = 0xF81C4C,
    targets = listOf(
        AppTarget(version = "3.3.18", versionCode = 199),
    ),
)
