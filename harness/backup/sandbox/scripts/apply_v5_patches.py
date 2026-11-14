#!/usr/bin/env python3
"""apply_v5_patches.py — v5 smali edits on the v4-patched classes3 tree
(/tmp/v5/smali3, carries P1/P2/P3/02f) and the stock classes.dex tree
(/tmp/v5/smali1).

V5 patch set (user-requested defaults + feature removals):

  S1  SettingsManager Bundle first-run defaults (.locals 10->11, scratch v10):
        ad_blocking 0->1, banner_blocker 0->1, ad_blocking_mode 0->1 (ENHANCED),
        accept_cookies 1->2 (Enabled, excluding third-party),
        dns_over_https_enabled 0->1, dns_over_https_mode 0->1 (CLOUDFLARE),
        enable_trending_searches 1->0, ga_usage_statistics 1->0,
        enable_rewards 1->0, rewards_notifications 1->0,
        esim_notifications 1->0, vpn_pro_in_app_notification 1->0
  S2  xnh.u (native feature-flag applier): force ad_blocking=1 (first-run
      gate), enable_trending_searches=0, tracker_blocker=1 — server config
      can no longer flip these back.
  V1  ggn.a: null Legn.h (upsell banner), Legn.i (reactivate banner),
      Legn.j (giveaway flag) before the Legn constructor.
  V2  zfn.d0: hide VpnProBanner ("Protect your privacy / Unlock VPN Pro /
      Get started") and the restore-purchase row (always GONE).
  V3  cgn.J0: return-void — all VPN-Pro paywall navigation dead.
  V4  ldn.G0: location catalog = EMPTY_LIST — pro (padlocked) locations
      never enter the picker.
  R1  k15.a(): always true — wallpapers render as purchased/unlocked.
  R2  at1.i(): locked=false both in the catalog path and the offline path —
      all app icons unlocked.
  E1  l98.b: return-void — eSIM promo bottom-sheet chain dead.
  E2  EsimTimeZoneChangeReceiver.onReceive: return-void — no promo re-sched.
  E3  d37.B (classes.dex): ESIM tile never added to the main menu.
  B1  daj: "Set Opera as default" settings-top banner gate always false.
  K1  SplashView.<init>: setBackgroundColor(white) — first-run pre-frame
      window is no longer black on dark-mode devices.

Every edit anchors on a unique multi-line pattern and asserts exactly one
match (fail-loud), mirroring apply_v4_patches.py.
"""
import re
import sys

USAGE NOTE (v5 session): S1 (SettingsManager defaults) is applied by this
script; the remaining edits (S2..K1) are applied by apply_v5_patches_part2.py,
which contains the indentation-corrected anchors (this file's later patterns
predate a whitespace fix). Run part1 then part2 on a fresh tree.


def edit(path, pattern, repl, flags=0, count=1):
    src = open(path).read()
    n = len(list(re.finditer(pattern, src, flags)))
    if n != 1:
        sys.exit(f'{path}: anchor matched {n}x (want 1): {pattern!r}')
    out = re.sub(pattern, repl, src, count=count, flags=flags)
    open(path, 'w').write(out)
    print(f'  patched {path.split("/smali")[-1]}')


T3 = '/tmp/v5/smali3/smali'
T1 = '/tmp/v5/smali1/smali'


# ---------------- S1: SettingsManager Bundle defaults ----------------

def s1_defaults():
    f = f'{T3}/com/opera/android/settings/SettingsManager.smali'
    edit(f,
         r'(\.method public constructor <init>\(Ly9j;Landroid/content/Context;Lorg/chromium/base/CommandLine;Lumi;\)V\n'
         r'    \.locals )10(\n)',
         r'\g<1>11\g<2>')
    # generic: insert const v10 + swap invoke register
    def put(key, val, reg):
        pat = (rf'(    const-string v0, "{key}"\n\n'
               rf'    invoke-virtual \{{v1, v0, v{reg}\}}, Landroid/os/BaseBundle;->putInt\(Ljava/lang/String;I\)V\n)')
        rep = (f'    const/4 v10, 0x{val:x}\n\n'
               f'    const-string v0, "{key}"\n\n'
               f'    invoke-virtual {{v1, v0, v10}}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V\n')
        edit(f, pat, rep)
    put('ad_blocking', 1, 3)
    put('banner_blocker', 1, 3)
    put('ad_blocking_mode', 1, 3)
    put('dns_over_https_enabled', 1, 3)
    put('dns_over_https_mode', 1, 3)
    put('enable_trending_searches', 0, 4)
    put('ga_usage_statistics', 0, 4)
    put('enable_rewards', 0, 4)
    put('rewards_notifications', 0, 4)
    put('esim_notifications', 0, 4)
    put('vpn_pro_in_app_notification', 0, 4)
    # accept_cookies has a const/4 v4, 0x1 between const-string and invoke
    edit(f,
         r'(    const-string v0, "accept_cookies"\n\n'
         r'    const/4 v4, 0x1\n\n)'
         r'(    invoke-virtual \{v1, v0, v4\}, Landroid/os/BaseBundle;->putInt\(Ljava/lang/String;I\)V\n)',
         r'\1    const/16 v10, 0x2\n\n\2'.replace('invoke-virtual {v1, v0, v4}', 'invoke-virtual {v1, v0, v10}'))


# ---------------- S2: xnh.u flag forces ----------------

def s2_xnh():
    f = f'{T3}/xnh.smali'
    # first-run ad_blocking = 1
    edit(f,
         r'(const/high16 v1, 0x4000000\n\n)'
         r'invoke-virtual \{p1, v1\}, Lwnh;->b\(I\)Z\n\n    move-result v1\n',
         r'\1const/4 v1, 0x1\n')
    # enable_trending_searches = 0 (flag-proof)
    edit(f,
         r'(const/high16 p0, 0x100000\n\n)'
         r'invoke-virtual \{p1, p0\}, Lwnh;->a\(I\)Z\n\n    move-result p0\n\n    xor-int/lit8 p0, p0, 0x1\n',
         r'\1const/4 p0, 0x0\n')
    # tracker_blocker = 1 (flag-proof)
    edit(f,
         r'(const-string p0, "tracker_blocker"\n\n)'
         r'invoke-virtual \{p1, v2\}, Lwnh;->b\(I\)Z\n\n    move-result v1\n',
         r'\1const/4 v1, 0x1\n')


# ---------------- V1: ggn.a — null h/i/j ----------------

def v1_ggn():
    f = f'{T3}/ggn.smali'
    edit(f,
         r'(    :goto_b\n)'
         r'(    invoke-direct/range \{v13 \.\. v23\}, Legn;-><init>\(Luvg;IZZZZZLnfn;Ldgh;Z\)V\n)',
         r'\1    const/16 v21, 0x0\n\n    const/16 v22, 0x0\n\n    const/16 v23, 0x0\n\n\2')


# ---------------- V2: zfn.d0 — hide promo banner + restore row ----------------

def v2_zfn():
    f = f'{T3}/zfn.smali'
    # hide VpnProBanner right after the null-check
    edit(f,
         r'(    check-cast v8, Lcom/opera/android/custom_views/VpnProBanner;\n\n'
         r'    if-eqz v8, :cond_38\n)',
         r'\1\n    const/16 v7, 0x8\n\n    invoke-virtual {v8, v7}, Landroid/view/View;->setVisibility(I)V\n')
    # restore-purchase row (cgn.O) always GONE
    edit(f,
         r'(    :cond_40\n)'
         r'if-eqz v21, :cond_41\n',
         r'\1    goto :cond_41\n')


# ---------------- V3: cgn.J0 paywall router dead ----------------

def v3_cgn():
    f = f'{T3}/cgn.smali'
    edit(f,
         r'(\.method public final J0\(Luvg;I\)V\n    \.locals 1\n)',
         r'\1\n    return-void\n')


# ---------------- V4: ldn — empty pro catalog ----------------

def v4_ldn():
    f = f'{T3}/ldn.smali'
    edit(f,
         r'invoke-virtual \{v7, v0\}, Lcnk;->a\(Ljava/util/Map;\)Ljava/util/List;\n\n'
         r'    move-result-object v0\n',
         'sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;\n')


# ---------------- R1/R2: unlock wallpapers + app icons ----------------

def r1_k15():
    f = f'{T3}/k15.smali'
    edit(f,
         r'(\.method public final a\(\)Z\n    \.locals 1\n)',
         r'\1\n    const/4 v0, 0x1\n\n    return v0\n')


def r2_at1():
    f = f'{T3}/at1.smali'
    edit(f,
         r'(    if-ne v6, v9, :cond_4\n\n)'
         r'const/4 v14, 0x1\n',
         r'\1const/4 v14, 0x0\n')
    edit(f,
         r'(    if-nez v7, :cond_9\n\n)'
         r'const/16 v21, 0x1\n',
         r'\1const/16 v21, 0x0\n')


# ---------------- E1/E2: eSIM dead ----------------

def e1_l98():
    f = f'{T3}/l98.smali'
    edit(f,
         r'(\.method public final b\(Landroid/content/Intent;\)V\n    \.locals 3\n)',
         r'\1\n    return-void\n')


def e2_receiver():
    f = f'{T3}/com/opera/android/esim/EsimTimeZoneChangeReceiver.smali'
    edit(f,
         r'(\.method public final onReceive\(Landroid/content/Context;Landroid/content/Intent;\)V\n    \.locals 0\n)',
         r'\1\n    return-void\n')


def e3_d37():
    f = f'{T1}/d37.smali'
    edit(f,
         r'(    )if-eqz v1, :cond_7(\n\n    sget-object v1, Lwol;->n:Lwol;\n)',
         r'\1goto :cond_7\2')


# ---------------- B1: settings default-browser banner off ----------------

def b1_daj():
    f = f'{T3}/daj.smali'
    edit(f,
         r'(    const/4 v3, 0x3\n\n    if-ge v4, v3, :cond_14\n\n)'
         r'const/4 v4, 0x1\n',
         r'\1const/4 v4, 0x0\n')


# ---------------- K1: SplashView white background ----------------

def k1_splash():
    f = f'{T3}/com/opera/android/custom_views/SplashView.smali'
    edit(f,
         r'(\.method public constructor <init>\(Landroid/content/Context;Landroid/util/AttributeSet;\)V\n)'
         r'(    \.locals )0(\n\n)'
         r'(    invoke-direct \{p0, p1, p2\}, Landroid/widget/FrameLayout;-><init>\(Landroid/content/Context;Landroid/util/AttributeSet;\)V\n)',
         r'\1\g<2>1\g<3>\4\n    const v0, -0x1\n\n    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V\n')


def main():
    print('applying v5 patches (classes3 tree + classes1 tree)')
    s1_defaults()
    s2_xnh()
    v1_ggn()
    v2_zfn()
    v3_cgn()
    v4_ldn()
    r1_k15()
    r2_at1()
    e1_l98()
    e2_receiver()
    e3_d37()
    b1_daj()
    k1_splash()
    print('all v5 patches applied')


if __name__ == '__main__':
    main()
