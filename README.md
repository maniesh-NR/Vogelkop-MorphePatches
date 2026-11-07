# Morphe Patches — Opera Browser / Opera Beta / Opera GX

De-ads the Opera browser family, for use with the
[Morphe](https://morphe.software/) patcher (ReVanced-style Android patcher):

- **Removes Opera's built-in ads** — sponsored/partner Speed Dial tiles and the
  third-party ad network modules (Pangle/ByteDance, Mintegral, Liftoff/Vungle)
  that Opera bundles for monetization.
- **Disables the "Acceptable Ads" whitelists** — Opera ships hidden filter lists
  whose only job is to *un-block* the trackers and advertisers of paying
  partners. These patches replace them with empty lists so the built-in ad
  blocker actually blocks.
- **Adds filter lists** — documents and enables the extra lists that Opera ships
  but leaves off by default (uBO, AdGuard, Peter Lowe, Fanboy, 36 regional
  lists), which are toggleable in Settings once patched.

Built from a full reverse-engineering pass over **Opera 103.3.5234.91185**,
**Opera Beta 104.0.5262.91143** and **Opera GX 3.3.18**. See
[`evidence/ANALYSIS.md`](evidence/ANALYSIS.md) for everything found inside the
APKs, including the full decompressed partner whitelists.

---

## Patches

| App | Patch | What it does |
|---|---|---|
| Opera & Opera Beta | **Disable ad modules** | Rewrites the reflective class-name lookups (`com.opera.android.ads.{pangle,mintegral,liftoff}.*ModuleImpl`) to a non-existent class so no third-party ad SDK module is ever instantiated. Opera already tolerates missing modules — Pangle ships as an optional split. |
| Opera & Opera Beta | **Remove sponsored Speed Dial** | Appends `WHERE 0` to the suggested-sites database queries (`SELECT * FROM partner_data`, `… FROM partner_tree LIMIT 1`, `… FROM domain_data`), so no sponsored/partner tiles are ever shown. Schema and regular Speed Dial are untouched. |
| Opera & Opera Beta | **Disable Acceptable Ads whitelist** | Scans `assets/abp_files/op/`, detects lists that consist *only* of allow directives (`DOCUMENT`/`WHITE.PLAIN`/`WHITE.GLOB` and no `BLACK` section) and replaces them with an empty compiled list under the same file name. Neutralizes the Google/Yandex measurement whitelist and the Taboola/gambling/affiliate whitelist — and any future pure-whitelist list Opera adds. |
| Opera GX | **Remove sponsored Speed Dial** | Strips sponsored entries (Eneba, Instant Gaming, Amazon and other affiliates routed through `operagx.gg`, or carrying a `realUrl` partner field) from `assets/preloadedTopSites/*.json`, keeping organic tiles like YouTube/Twitch. |

All bytecode patches use **string fingerprints** (SQL text, class-name constants)
rather than obfuscated class names, so they match across stable, beta and
different builds of the same version. Each patch fails loudly (instead of
silently doing nothing) if its targets are missing.

## What the user asked for vs. what is technically possible

> *"replace its ad blocker with a ublock origin style adblocker with configurable
> blocklists"*

Opera's ad blocker is compiled into the app (native engine + proprietary binary
list format on stable/beta; a JSON config fetched at runtime on GX), so a static
APK patch cannot embed uBlock Origin itself. What these patches do instead:

1. **Kill the partner whitelists** so the built-in engine blocks what it should
   have blocked all along (the biggest real-world win — see
   `evidence/whitelist_f66a1f2c_partner_affiliate.txt` for what was being let
   through).
2. **Expose the extra lists Opera already ships but disables**: after patching,
   open **Settings → Ad blocking → Manage lists** and enable *uBO: Filters*,
   *uBO: Privacy*, *uBO: Annoyances*, *AdGuard Base/Tracking*, *Peter Lowe's
   list*, *Fanboy's Annoyance/Cookie lists* and your regional list. These
   download through Opera's own list updater (OFA) and are fully maintained —
   a curated uBlock-style selection with zero extra code.
   The whitelists are already gone at that point, so nothing you enable gets
   silently un-blocked.
3. GX users: the same list picker exists (**Settings → Ad blocking → Manage
   lists**) with 52 lists incl. uBO/AdGuard — GX's config is downloaded at
   runtime (`adblocker_v2` JSON) and cannot be modified by a static patch.

## Which APK to patch

| App | Recommended input | Notes |
|---|---|---|
| Opera stable | Direct download from `get.opera.com/ftp/pub/opera/android/10300/` (`Opera_103_3_5234_91185_Generic_Opera_arm8_LZMA.apk`, versionCode 1910312408) | Single full APK, no splits. |
| Opera stable (Play) | `base.apk` of the Play bundle, or a merged universal APK (e.g. APKEditor `merge`) | Play builds download the Chromium core at first run; all patched code is in `base.apk`, so patching the base works. |
| Opera Beta | `base.apk` of the Play bundle (104.0.5262.91143, versionCode 1910404306) | Beta full builds are not on the public CDN. |
| Opera GX | The XAPK/APKM bundle from APKMirror (3.3.18, versionCode 199) | GX is a WebView-based app (66 MB); no core download involved. |

All three patches for stable/beta are registered for both the Play and the
direct-download version codes of their version.

## Using the patches

### With the Morphe app

1. Build the patches bundle (below) and host it, or add this repo as a patch
   source in Morphe (`morphe.software/add-source?github=maniesh-NR/Vogelkop-MophePatches`).
2. Select the APK/XAPK for the Opera app you want to patch.
3. Enable the Opera patches (all default-on) and patch.
4. Install the patched APK. If you patch a Play split bundle, merge it to a
   universal APK first, and uninstall the original (different signature).

### Building

```bash
# The Morphe patches Gradle plugin lives in GitHub Packages:
#   gpr.user / gpr.key in gradle.properties (a PAT with read:packages)
./gradlew :patches:build          # or the plugin's generate/bundle task
```

`patches-list.json` in this repo is a pre-rendered reference of the generated
output; the Gradle plugin regenerates it at build time.

### Submitting to rushiranpise/morphe-patches

The source tree is laid out exactly like upstream:

```
patches/src/main/kotlin/app/template/patches/opera/…
```

Copy the `opera/` package into `patches/src/main/kotlin/app/template/patches/`
and add the three `Compatibility` blocks from `OperaCompat.kt` to
`shared/Constants.kt`. `PATCHES.md` and `patches-list.json` regenerate on
release.

## Limitations & honest notes

- **Opera's first-party promo cards / news feed**: start-page promos are served
  by Opera's own `ads_mobile_sdk` (~1,770 classes) and the promo/news system.
  Surgically disabling it risks crashes and kills the news feature entirely
  (not just its ads), so it is out of scope; the sponsored *tiles* (the most
  visible built-in ads) are removed by the suggested-sites patch. If you want
  the whole feed gone, disable it in start-page settings, or block the hosts in
  `evidence/ANALYSIS.md` §4 at the DNS level.
- **List freshness**: the whitelist assets are patched at install time. If
  Opera's list updater (OFA) later pushes a *new* whitelist file under a new
  content-hash name, re-patch the new version — the detection rule
  (pure-allowlist ⇒ empty) will catch it automatically in the updated APK.
- **GX ad-block config**: downloaded at runtime; a static patch cannot rewrite
  it. The sponsored tiles (bundled in the APK) are removed.
- The patches intentionally do **not** touch Opera's VPN, Aria AI, or news
  features.

## File map

```
patches/src/main/kotlin/app/template/patches/opera/
├── OperaCompat.kt                  Compatibility targets (stable/beta/GX)
├── shared/StringConstantExtensions.kt  dexlib2 const-string rewriter
├── ads/DisableAdModulesPatch.kt    stable+beta: Pangle/Mintegral/Liftoff
├── ads/RemoveSponsoredSpeedDialPatch.kt  stable+beta: partner_data SQL
├── adblock/DisableAcceptableAdsPatch.kt  stable+beta: whitelist assets
└── gx/GxRemoveSponsoredTilesPatch.kt     GX: preloadedTopSites JSON
evidence/
├── ANALYSIS.md                     full reverse-engineering write-up
├── whitelist_97bda3c5_google_yandex_measurement.txt
└── whitelist_f66a1f2c_partner_affiliate.txt
```

## License

GPLv3, matching upstream morphe-patches.
