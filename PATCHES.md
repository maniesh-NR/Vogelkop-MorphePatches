# 🧩 Opera patches

Morphe patches for the Opera browser family, built from a full reverse-engineering
pass over Opera 103.3.5234.91185 (stable), Opera Beta 104.0.5262.91143 and
Opera GX 3.3.18.

## Opera Browser (com.opera.browser)

**Supported versions:** `103.3.5234.91185` (Play bundle `1910312306`, direct download `1910312408`)

| Patch | Details |
|---|---|
| **Disable ad modules** | Prevents Opera from loading its bundled third-party ad network modules (Liftoff/Vungle, Mintegral, Pangle/ByteDance) by breaking the reflective class lookup used by the ad mediation layer. |
| **Remove sponsored Speed Dial** | Stops sponsored/partner tiles from appearing on the start page by making Opera's suggested-sites database queries return no rows. Regular Speed Dial entries and bookmarks are not affected. |
| **Disable Acceptable Ads whitelist** | Replaces Opera's hidden partner whitelists (Google/Yandex measurement, Taboola, gambling and shopping affiliates, AppsFlyer/Adjust/Kochava/CJ tracking domains) with empty filter lists, so the built-in ad blocker actually blocks them. |

## Opera Browser Beta (com.opera.browser.beta)

**Supported versions:** `104.0.5262.91143`

| Patch | Details |
|---|---|
| **Disable ad modules** | Same as stable: breaks the Liftoff/Mintegral/Pangle module lookups. |
| **Remove sponsored Speed Dial** | Same as stable: neutralizes the `partner_data` / `partner_tree` / `domain_data` queries. |
| **Disable Acceptable Ads whitelist** | Same as stable: empties the pure-whitelist lists in `assets/abp_files/op/`. |

## Opera GX (com.opera.gx)

**Supported versions:** `3.3.18`

| Patch | Details |
|---|---|
| **Remove sponsored Speed Dial** | Removes sponsored tiles (Eneba, Instant Gaming, Amazon and other affiliate links routed through operagx.gg) from Opera GX's preloaded start page, keeping the organic default tiles. |
