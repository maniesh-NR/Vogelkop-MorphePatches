# Opera ad-blocker & ads — reverse-engineering findings

All findings verified against three APKs (Nov 2026):

| App | Version | Source | Key facts |
|---|---|---|---|
| Opera (com.opera.browser) | 103.3.5234.91185 | Play bundle (base.apk v.c. 1910312306) + get.opera.com generic arm64 (v.c. 1910312408) | 7 dex sets, `assets/abp_files/op/` present in base, `split_pangle_ads.apk` split, Chromium core downloaded at runtime |
| Opera Beta (com.opera.browser.beta) | 104.0.5262.91143 | Play bundle (base.apk v.c. 1910404306) | identical layout, identical whitelist assets |
| Opera GX (com.opera.gx) | 3.3.18 (v.c. 199) | Play bundle | **not** a Chromium build — WebView-based app; ad-blocker config downloaded at runtime |

## 1. The paid whitelist (stable & beta)

Opera's built-in ad blocker ("Ad blocking" in settings) is fed by compiled filter
lists in `assets/abp_files/op/<sha256-of-content>.gz`. File names are the SHA-256
of the *decompressed* content. Twelve lists ship in the box; two of them exist
only to let paying partners through:

### `97bda3c5f03d…` — measurement / "Acceptable Ads" whitelist (1.6 KB decompressed)

- `DOCUMENT` page-level exceptions for `*yandex*/*`, `*.google.*/*`, `*://google.*/*`
- `WHITE.PLAIN /DIRECT/` allows for:
  `fls.doubleclick.net`, `google-analytics.com`, `googletagmanager.com`,
  `stats.g.doubleclick.net`, `googleadservices.com`, `ymetrica.com`,
  `mc.yandex.*` (all TLDs), `webvisor.com`, `webvisor.org`,
  `metrika-inf.com`, `metrika-informer.com`

→ Google Analytics, Google Tag Manager, Doubleclick and Yandex Metrica trackers
  are un-blocked by the "ad blocker" that ships enabled by default.

### `f66a1f2c11bd…` — partner/affiliate whitelist (4.0 KB decompressed)

- `DOCUMENT` exceptions (ad blocking disabled on the whole page) for:
  - **Taboola** (`taboola.com`, `taboolanews.com`)
  - **Gambling** (30+): `1xbet.ng`, `1xbeast.net`, `bet1-x17542.com`, `betika.*`,
    `bet9ja.com`, `betpawa.*`, `bongobongo.*`, `hollywoodbets.net`,
    `melbet.com.gh`, `m-bet.*`, `mlott.bet`, `powerbets.*`, `supabets.*`,
    `premierbet.*`, `betway.*`, `livescorebet.com`, `mozzart.com`,
    `mercurybet.com`, `guineegames.com`, `empawalotto.com`, `triple5bet.com`, …
  - **E-commerce affiliates**: `amazon.{com,de,fr,it,es,in,ca,cn,nl,com.be}`,
    `jumia.*` (15 countries), `lazada.*` (8 countries), `flipkart.com`,
    `shoprite.co.za`
  - **Opera properties**: `opera.com`, `opera.news`, `opr.news`,
    `operacricket.com`, `operafootball.com`, `operanewsapp.com`, `opera.thisday.app`,
    `opera.sportskeeda.com`, `opera.wowkeren.com`, `opera.hungama.com`,
    `operamobiletiles.ampxdirect.com`, `hub4games.operacdn.com`, …
  - **Opera content networks**: `apexnews-*.com`, `dailyadvent.com`,
    `dailyactive.info`, `briefly.news`, `guardian.ng`, `pepeshort.com`,
    `gamesnacks.com`, `softgames.com`, `gamezop.com`, `tembo.media`, …
  - Misc: `bybit.com`, `chess.com`, `duckduckgo.com`, `pluto.tv`, `startpage.com`,
    `turbotax.intuit.com`, `unstoppabledomains.com`, …
- `WHITE.PLAIN /DIRECT/` allows for attribution/affiliate trackers:
  `appsflyer.com`, `adjust.com`, `control.kochava.com`, `statcounter.com`,
  `r.bttn.io`, and Commission Junction domains (`qksrv.net`, `tkqlhce.com`,
  `dpbolvw.net`, `anrdoezrs.net`, `emjcd.com`, `kqzyfj.com`, `lijdoqocy.com`,
  `tqlkg.com`, `cj.dotomi.com`), plus Opera ad infrastructure
  (`lsdk.opera-mini.net`, `interstitial.opera-mini.net`, `pay1.op-test.net`,
  `tembo.media`, `eacdn.com`).

Full decompressed contents of both files are in this directory.

## 2. List loading & update mechanics (stable & beta)

- The loader enumerates **all** files in `assets/abp_files/op/` and loads them
  (`AssetManager.list("abp_files/op")` → path helper `"assets:abp_files/" + name`).
- **Bundled assets are not content-verified at load time.** Only lists that the
  updater downloads into the app's files directory are SHA-256-digested and
  verified against their file name.
- Updates come from Opera's OFA (Opera Filter Archive) service:
  `https://ofa-{b,r,o}-sub.osp.opera.software/v1/binary` (POST; the ad-blocker
  component uses `ofa-b-sub`). Lists are gzip blobs in the compiled
  `[default] / BLACK / WHITE / DOCUMENT / …` format.
- The 42-list registry of *user-toggleable* lists (easylist, adguard_ads,
  adguard_mobile_ads, nocoin, opera_fixes, ublock + 36 regional lists) only maps
  list id → display name/subtitle resources; the whitelists above are **not** in
  it — they are always-on core lists.

→ Patch strategy: replace pure-whitelist assets with an empty compiled list
  (byte-identical to Opera's own empty list `e87a67d8…`) under the same file
  name. Detection rule: a list with `DOCUMENT =` / `WHITE.PLAIN` / `WHITE.GLOB`
  and no `BLACK` section is a pure whitelist. This is version-robust (works even
  when Opera renames the files, because the file names are derived from content).

## 3. Built-in ads inventory

### Sponsored Speed Dial / suggested sites (stable & beta)
Room database `com.opera.android.suggested_sites.SuggestedSitesDatabase` with
tables `metadata`, `provider_info`, `partner_data`, `partner_tree`,
`domain_data`. The DAO refresh transaction reads:
`SELECT * FROM partner_data`, `SELECT * FROM partner_tree LIMIT 1`,
`SELECT * FROM domain_data` (identical strings in stable 103 and beta 104).

### Ad mediation layer (stable & beta)
An enum of ad providers maps to module implementations that are loaded
reflectively by class name:

```
com.opera.android.ads.liftoff.LiftoffAdsModuleImpl     (Liftoff / Vungle)
com.opera.android.ads.mintegral.MintegralAdsModuleImpl (Mintegral)
com.opera.android.ads.pangle.PangleAdsModuleImpl       (Pangle / ByteDance)
```

- Pangle ships as a dedicated dynamic-feature split (`split_pangle_ads.apk`,
  ~5 MB) with its own per-language config splits; its activities
  (`com.bytedance.sdk.openadsdk.activity.*`) are declared in the base manifest.
- Opera's first-party ads run through the in-house `ads_mobile_sdk` package
  (~1,770 classes, "neosdk"/OPERA provider in the mediation enum) — deeply
  wired into the promo/news system, so it is **not** surgically patched; the
  visible sponsored tiles are removed by the suggested-sites patch instead.
- Also bundled: AppsFlyer, Leanplum, Google IMA / measurement.

### Opera GX (3.3.18)
- Default start-page tiles from `assets/preloadedTopSites/topSites*.json`:
  2 of 4 default entries are sponsored (Eneba → `operagx.gg/eneba-sd-mob`,
  Instant Gaming → `operagx.gg/4mw`); per-country variants add Amazon
  storefronts tagged `?tag=operagx-mob-sp-sd-<cc>-21`, etc.
- Ad-blocker config is fetched at runtime from
  `https://download.opera.com/download/get/?resource=adblocker_v2` →
  `https://download3.operacdn.com/res/servicefiles/adblocker_v2/adblocker-desktop-202610291634-stable.json`
  (6.4 MB JSON; schema v2). Contents: 52 lists, 102,372 URL rules, 24,730
  element rules, 16 snippets, 1,997 allow rules (707 easylist + 850 easyprivacy
  upstream exceptions, 84 + 356 Opera-custom allows such as
  `||*.opera-api.com`, `||*gxc.gg^` document, `||*.capitalone.com`).
  Included but off-by-default lists: Peter Lowe, AdGuard Base/Tracking, uBO
  filters/privacy/badware/unbreak/quick-fixes/annoyances/cookie-notices, 36
  regional lists — all user-toggleable in Settings → Ad blocking → Manage lists.
- Small internal list from Firebase:
  `firebasestorage.googleapis.com/v0/b/opera-gxm.appspot.com/o/internal_files%2Finternal_filters.json`
  (test rules only).

## 4. Endpoint inventory (for network-level blocking, if desired)

```
ofa-b-sub.osp.opera.software/v1/binary        filter-list updates (browser)
ofa-r-sub / ofa-o-sub.osp.opera.software      regional/other OFA channels
momi-client-sdk-sub.osp.opera.software        MoMi monetization/metrics SDK
download.opera.com/download/get/              adblocker config redirector (GX)
download3.operacdn.com                        adblocker config / service files
vtp.operagx.gg                                GX install-redirect tracker
operamobiletiles.ampxdirect.com               sponsored tiles delivery
lsdk.opera-mini.net, interstitial.opera-mini.net, pay1.op-test.net,
refpakrtsb.top, refpaydc.top, tembo.media     partner ad/affiliate infra
```
