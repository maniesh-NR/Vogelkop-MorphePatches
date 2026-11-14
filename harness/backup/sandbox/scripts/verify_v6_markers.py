#!/usr/bin/env python3
"""verify_v6_markers.py <smali3-tree> <smali1-tree> [--nonews] — assert every
v4+v5+v6 patch marker is present in a baksmali-decoded tree. Fail-loud."""
import re
import sys

args = [a for a in sys.argv[1:] if not a.startswith('--')]
nonews = '--nonews' in sys.argv
T3, T1 = args[0], args[1]
ok = True


def check(name, cond):
    global ok
    print(f'{name}: {"OK" if cond else "MISSING"}')
    ok &= bool(cond)


def rd(p):
    return open(p).read()


# --- v4+v5 markers (delegate to the v5 verifier logic, inlined) ---
src = rd(f'{T3}/com/opera/android/OperaApplication.smali')
check('P1 onboarding gate',
      re.search(r'\.method public final a\(\)Z\n    \.locals 5\n\n    const/4 v0, 0x1\n\n    return v0\n', src))
src = rd(f'{T3}/cfn.smali')
check('P2 personalization sheet',
      re.search(r'personalization\.onboarding\.completed".{0,400}?const/4 v0, 0x0\n\n    invoke-static \{v0\}, Ljava/lang/Boolean;->valueOf', src, re.S))
src = rd(f'{T3}/ssi.smali')
seg = re.search(r':pswitch_17\n.*?(?=\n    :pswitch_18)', src, re.S).group(0)
check('P3 splash spinner', 'setVisibility' not in seg and 'SplashView' in seg)
src = rd(f'{T3}/m9k.smali')
check('02f waiter bypass',
      re.search(r'const/4 p5, 0x1\n\s*invoke-static \{p5\}, Ljava/lang/Boolean;->valueOf', src))

src = rd(f'{T3}/com/opera/android/settings/SettingsManager.smali')
ctor = re.search(r'\.method public constructor <init>\(Ly9j;.*?\.end method', src, re.S).group(0)
check('S1 .locals 11', '\n    .locals 11\n' in ctor)
_s1_keys = ['ad_blocking', 'banner_blocker', 'dns_over_https_enabled',
            'dns_over_https_mode', 'enable_trending_searches', 'ga_usage_statistics',
            'enable_rewards', 'rewards_notifications', 'esim_notifications', 'vpn_pro_in_app_notification']
check('S1 defaults', all(re.search(rf'const/4 v10, 0x[0-9a-f]+\n\n    const-string v0, "{k}"\n\n    invoke-virtual \{{v1, v0, v10\}}', ctor)
                         for k in _s1_keys))
check('S1 cookies=2', 'const/16 v10, 0x2' in ctor)

src = rd(f'{T3}/xnh.smali')
u = re.search(r'\.method public final u\(Lwnh;\)V\n.*?\.end method', src, re.S).group(0)
check('S2 adblock forced on', re.search(r'const/high16 v1, 0x4000000\n\n    const/4 v1, 0x1\n', u))
check('S2 trending forced off', re.search(r'const/high16 p0, 0x100000\n\n    const/4 p0, 0x0\n', u))
check('S2 tracker forced on', re.search(r'const-string p0, "tracker_blocker"\n\n    const/4 v1, 0x1\n', u))

src = rd(f'{T3}/ggn.smali')
check('V1 pro banners nulled',
      re.search(r':goto_b\n    const/16 v21, 0x0\n\n    const/16 v22, 0x0\n\n    const/16 v23, 0x0\n\n(?:    const/4 v15, 0x2\n\n)?    invoke-direct/range \{v13 \.\. v23\}', src))
src = rd(f'{T3}/zfn.smali')
check('V2 promo banner hidden',
      re.search(r'check-cast v8, Lcom/opera/android/custom_views/VpnProBanner;\n\n    if-eqz v8, :cond_38\n\n    const/16 v7, 0x8\n\n    invoke-virtual \{v8, v7\}, Landroid/view/View;->setVisibility\(I\)V', src))
check('V2 restore row always gone',
      re.search(r':cond_\w+\n    goto :\w+\n\n    move/from16 v1, v22\n', src)
      and not re.search(r'if-eqz v21, :cond_41\n\n    move/from16 v1, v22\n', src))
src = rd(f'{T3}/cgn.smali')
check('V3 paywall router dead',
      re.search(r'\.method public final J0\(Luvg;I\)V\n    \.locals 1\n\n    return-void\n', src))
src = rd(f'{T3}/ldn.smali')
g0 = re.search(r'\.method public final G0\(\)V\n.*?\.end method', src, re.S).group(0)
check('V4 pro catalog emptied',
      'sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;' in g0
      and 'Lcnk;->a(Ljava/util/Map;)Ljava/util/List;' not in g0)
src = rd(f'{T3}/k15.smali')
check('R1 wallpapers unlocked',
      re.search(r'\.method public final a\(\)Z\n    \.locals 1\n\n    const/4 v0, 0x1\n\n    return v0\n', src))
src = rd(f'{T3}/at1.smali')
check('R2 app icons unlocked',
      re.search(r'if-ne v6, v9, :cond_4\n\n    const/4 v14, 0x0\n', src)
      and re.search(r'if-nez v7, :cond_9\n\n    const/16 v21, 0x0\n', src))
src = rd(f'{T3}/l98.smali')
check('E1 esim sheet chain dead',
      re.search(r'\.method public final b\(Landroid/content/Intent;\)V\n    \.locals 3\n\n    return-void\n', src))
src = rd(f'{T3}/com/opera/android/esim/EsimTimeZoneChangeReceiver.smali')
check('E2 esim tz receiver dead',
      re.search(r'\.method public final onReceive\(Landroid/content/Context;Landroid/content/Intent;\)V\n    \.locals 0\n\n    return-void\n', src))
src = rd(f'{T3}/daj.smali')
check('B1 default-browser banner off',
      re.search(r'const/4 v3, 0x3\n\n    if-ge v4, v3, :cond_14\n\n    const/4 v4, 0x0\n', src))
src = rd(f'{T3}/com/opera/android/custom_views/SplashView.smali')
check('K1 splash white background',
      re.search(r'\.locals 1\n\n    invoke-direct \{p0, p1, p2\}, Landroid/widget/FrameLayout;-><init>\(Landroid/content/Context;Landroid/util/AttributeSet;\)V\n\n    const v0, -0x1\n\n    invoke-virtual \{p0, v0\}, Landroid/view/View;->setBackgroundColor\(I\)V', src))
src = rd(f'{T1}/d37.smali')
b = re.search(r'\.method public final B\(\)Lehc;\n.*?\.end method', src, re.S).group(0)
check('E3 esim menu tile removed',
      re.search(r'goto :\w+\n\n    sget-object v1, Lwol;->n:Lwol;\n\n    invoke-virtual \{v0, v1\}, Lehc;->add\(Ljava/lang/Object;\)Z\n\n    :\w+\n    iget-boolean v1, p0, Ld37;->b:Z', b))

# --- v6 markers ---
src = rd(f'{T3}/com/opera/android/settings/SettingsManager.smali')
check('A1 adblock mode CUSTOM',
      re.search(r'const/4 v10, 0x2\n\n    const-string v0, "ad_blocking_mode"\n\n    invoke-virtual \{v1, v0, v10\}', src))
check('A2 selected_custom_lists seeded',
      re.search(r'const-string v10, "\[\\"(?:easylist|regional_|nocoin|ublock|adguard)', src)
      and 'adguard_ads' in src
      and re.search(r'const-string v10, ".*"\n\n    const-string v0, "ad_blocking_mode\.selected_custom_lists"\n\n    invoke-virtual \{v1, v0, v10\}, Landroid/os/BaseBundle;->putString', src, re.S))
src = rd(f'{T1}/zi3.smali')
check('A4 manifest pinned to assets',
      len(re.findall(r'invoke-virtual \{p0\}, Lzi3;->h\(\)Ljava/lang/Object;', src)) == 2)
src = rd(f'{T3}/ggn.smali')
check('V5a premium VPN layout forced',
      re.search(r'const/16 v23, 0x0\n\n    const/4 v15, 0x2\n\n    invoke-direct/range \{v13 \.\. v23\}', src))
src = rd(f'{T3}/bgn.smali')
check('V5b protocol picker always',
      re.search(r'invoke-interface \{p1\}, Lgfn;->isEnabled\(\)Z\n\n    move-result p1\n\n    goto :\w+\n', src))
src = rd(f'{T3}/p12.smali')
check('V6 menu VPN Pro banner dead',
      re.search(r'\.method public final n\(\)Lp7d;\n    \.locals 9\n\n    const/4 v0, 0x0\n\n    return-object v0\n', src))
src = rd(f'{T3}/rmg.smali')
check('R3a icons fetch ungated', 'if-ne v0, v0, :cond_1d' in src)
check('R3b wallpapers fetch ungated', 'if-ne v2, v2, :cond_1' in src)
src = rd(f'{T3}/o71.smali')
check('R4a wallpapers emit ungated', 'if-ne v6, v6, :cond_6' in src)
check('R4b icons emit ungated', 'if-ne v11, v11, :cond_11' in src)
src = rd(f'{T3}/r2i.smali')
check('R4c icons refresh ungated', 'if-ne v2, v2, :cond_7' in src)
src = rd(f'{T3}/com/opera/android/BrowserActivity.smali')
check('M1 minipay menu gate off',
      re.search(r'if-nez v2, :cond_1\n\n    const/16 v22, 0x0\n\n    goto :goto_0\n', src))
src = rd(f'{T3}/pc.smali')
check('M2 minipay toolbar button off',
      re.search(r'sget-object v37, Lxc;->I:Lxc;\n\n    const/16 v38, 0x0\n', src))
check('M2b rewards toolbar button off',
      re.search(r'sget-object v38, Lxc;->M:Lxc;\n\n    const/16 v39, 0x0\n', src))
src = rd(f'{T1}/d37.smali')
b = re.search(r'\.method public final B\(\)Lehc;\n.*?\.end method', src, re.S).group(0)
check('M3 minipay menu item never added',
      re.search(r'iget-boolean v1, p0, Ld37;->b:Z\n\n    goto :\w+\n', b))
check('M3b wallet menu item never added',
      re.search(r'invoke-virtual \{p0\}, Ljava/lang/Boolean;->booleanValue\(\)Z\n\n    move-result p0\n\n    goto :\w+\n', b))
src = rd(f'{T3}/bo3.smali')
check('N1 earn-rewards settings row removed', '0x7f0a09ec' not in src)
src = rd(f'{T3}/rqd.smali')
k = re.search(r'\.method public final k\(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;\)Ljava/lang/Object;\n.*?\.end method', src, re.S).group(0)
check('N2 promo notification rows hidden',
      len(re.findall(r'invoke-virtual \{v\d+, v1\}, Landroid/view/View;->setVisibility\(I\)V', k)) == 7
      and 'invoke-virtual {v10, v1}' not in k)

if nonews:
    src = rd(f'{T3}/com/opera/android/settings/SettingsManager.smali')
    check('X1 newsfeed default off',
          re.search(r'move-result v0\n\n    const/4 v0, 0x0\n\n    const-string v7, "enable_newsfeed"\n\n    invoke-virtual \{v1, v7, v0\}', src))
    src = rd(f'{T3}/xnh.smali')
    check('X2 live scores forced off',
          re.search(r'const/16 p0, 0x4000\n\n    const/4 p0, 0x0\n\n    const-string v1, "live_scores_enabled"\n\n    invoke-virtual \{v0, p0, v1\}', src))
    src = rd(f'{T3}/pc.smali')
    check('X3 live scores toolbar button off',
          re.search(r'sget-object v25, Lxc;->u:Lxc;\n\n    const/16 v26, 0x0\n', src))

if not ok:
    sys.exit('PATCH MARKER VERIFICATION FAILED')
print(f'ALL V4+V5+V6 PATCH MARKERS VERIFIED{" (+nonews)" if nonews else ""}')
