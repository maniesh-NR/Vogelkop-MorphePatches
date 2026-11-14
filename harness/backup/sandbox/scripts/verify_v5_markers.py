#!/usr/bin/env python3
"""verify_v5_markers.py <smali3-tree> <smali1-tree> — assert every v4+v5 patch
marker is present in a baksmali-decoded tree. Fail-loud on any miss."""
import re
import sys

T3, T1 = sys.argv[1], sys.argv[2]
ok = True


def check(name, path, cond):
    global ok
    print(f'{name}: {"OK" if cond else "MISSING"}')
    ok &= bool(cond)


def rd(p):
    return open(p).read()


# --- v4 markers (classes3) ---
src = rd(f'{T3}/com/opera/android/OperaApplication.smali')
check('P1 onboarding gate', None,
      re.search(r'\.method public final a\(\)Z\n    \.locals 5\n\n    const/4 v0, 0x1\n\n    return v0\n', src))
src = rd(f'{T3}/cfn.smali')
check('P2 personalization sheet', None,
      re.search(r'personalization\.onboarding\.completed".{0,400}?const/4 v0, 0x0\n\n    invoke-static \{v0\}, Ljava/lang/Boolean;->valueOf', src, re.S))
src = rd(f'{T3}/ssi.smali')
seg = re.search(r':pswitch_17\n.*?(?=\n    :pswitch_18)', src, re.S).group(0)
check('P3 splash spinner', None, 'setVisibility' not in seg and 'SplashView' in seg)
src = rd(f'{T3}/m9k.smali')
check('02f waiter bypass', None,
      re.search(r'const/4 p5, 0x1\n\s*invoke-static \{p5\}, Ljava/lang/Boolean;->valueOf', src))

# --- S1 SettingsManager defaults (classes3) ---
src = rd(f'{T3}/com/opera/android/settings/SettingsManager.smali')
ctor = re.search(r'\.method public constructor <init>\(Ly9j;.*?\.end method', src, re.S).group(0)
check('S1 .locals 11', None, '\n    .locals 11\n' in ctor)
_s1_keys = ['ad_blocking', 'banner_blocker', 'ad_blocking_mode', 'dns_over_https_enabled',
            'dns_over_https_mode', 'enable_trending_searches', 'ga_usage_statistics',
            'enable_rewards', 'rewards_notifications', 'esim_notifications', 'vpn_pro_in_app_notification']
check('S1 11 const/4 v10 defaults', None,
      all(re.search(rf'const/4 v10, 0x[0-9a-f]+\n\n    const-string v0, "{k}"\n\n    invoke-virtual \{{v1, v0, v10\}}', ctor)
          for k in _s1_keys))
check('S1 cookies=2', None, 'const/16 v10, 0x2' in ctor)

# --- S2 xnh forces (classes3) ---
src = rd(f'{T3}/xnh.smali')
u = re.search(r'\.method public final u\(Lwnh;\)V\n.*?\.end method', src, re.S).group(0)
check('S2 adblock forced on', None,
      re.search(r'const/high16 v1, 0x4000000\n\n    const/4 v1, 0x1\n', u))
check('S2 trending forced off', None,
      re.search(r'const/high16 p0, 0x100000\n\n    const/4 p0, 0x0\n', u))
check('S2 tracker forced on', None,
      re.search(r'const-string p0, "tracker_blocker"\n\n    const/4 v1, 0x1\n', u))

# --- V1 ggn (classes3) ---
src = rd(f'{T3}/ggn.smali')
check('V1 pro banners nulled', None,
      re.search(r':goto_b\n    const/16 v21, 0x0\n\n    const/16 v22, 0x0\n\n    const/16 v23, 0x0\n\n    invoke-direct/range \{v13 \.\. v23\}', src))

# --- V2 zfn (classes3) ---
src = rd(f'{T3}/zfn.smali')
check('V2 promo banner hidden', None,
      re.search(r'check-cast v8, Lcom/opera/android/custom_views/VpnProBanner;\n\n    if-eqz v8, :cond_38\n\n    const/16 v7, 0x8\n\n    invoke-virtual \{v8, v7\}, Landroid/view/View;->setVisibility\(I\)V', src))
check('V2 restore row always gone', None,
      re.search(r':cond_\w+\n    goto :\w+\n\n    move/from16 v1, v22\n', src)
      and not re.search(r'if-eqz v21, :cond_41\n\n    move/from16 v1, v22\n', src))

# --- V3 cgn.J0 (classes3) ---
src = rd(f'{T3}/cgn.smali')
check('V3 paywall router dead', None,
      re.search(r'\.method public final J0\(Luvg;I\)V\n    \.locals 1\n\n    return-void\n', src))

# --- V4 ldn (classes3) ---
src = rd(f'{T3}/ldn.smali')
g0 = re.search(r'\.method public final G0\(\)V\n.*?\.end method', src, re.S).group(0)
check('V4 pro catalog emptied', None,
      'sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;' in g0
      and 'Lcnk;->a(Ljava/util/Map;)Ljava/util/List;' not in g0)

# --- R1 k15 (classes3) ---
src = rd(f'{T3}/k15.smali')
check('R1 wallpapers unlocked', None,
      re.search(r'\.method public final a\(\)Z\n    \.locals 1\n\n    const/4 v0, 0x1\n\n    return v0\n', src))

# --- R2 at1 (classes3) ---
src = rd(f'{T3}/at1.smali')
check('R2 app icons unlocked (catalog+offline)', None,
      re.search(r'if-ne v6, v9, :cond_4\n\n    const/4 v14, 0x0\n', src)
      and re.search(r'if-nez v7, :cond_9\n\n    const/16 v21, 0x0\n', src))

# --- E1/E2 (classes3) ---
src = rd(f'{T3}/l98.smali')
check('E1 esim sheet chain dead', None,
      re.search(r'\.method public final b\(Landroid/content/Intent;\)V\n    \.locals 3\n\n    return-void\n', src))
src = rd(f'{T3}/com/opera/android/esim/EsimTimeZoneChangeReceiver.smali')
check('E2 esim tz receiver dead', None,
      re.search(r'\.method public final onReceive\(Landroid/content/Context;Landroid/content/Intent;\)V\n    \.locals 0\n\n    return-void\n', src))

# --- B1 daj (classes3) ---
src = rd(f'{T3}/daj.smali')
check('B1 default-browser banner off', None,
      re.search(r'const/4 v3, 0x3\n\n    if-ge v4, v3, :cond_14\n\n    const/4 v4, 0x0\n', src))

# --- K1 SplashView (classes3) ---
src = rd(f'{T3}/com/opera/android/custom_views/SplashView.smali')
check('K1 splash white background', None,
      re.search(r'\.locals 1\n\n    invoke-direct \{p0, p1, p2\}, Landroid/widget/FrameLayout;-><init>\(Landroid/content/Context;Landroid/util/AttributeSet;\)V\n\n    const v0, -0x1\n\n    invoke-virtual \{p0, v0\}, Landroid/view/View;->setBackgroundColor\(I\)V', src))

# --- E3 d37 (classes.dex) ---
src = rd(f'{T1}/d37.smali')
b = re.search(r'\.method public final B\(\)Lehc;\n.*?\.end method', src, re.S).group(0)
check('E3 esim menu tile removed', None,
      re.search(r'goto :\w+\n\n    sget-object v1, Lwol;->n:Lwol;\n\n    invoke-virtual \{v0, v1\}, Lehc;->add\(Ljava/lang/Object;\)Z\n\n    :\w+\n    iget-boolean v1, p0, Ld37;->b:Z', b))

if not ok:
    sys.exit('PATCH MARKER VERIFICATION FAILED')
print('ALL V4+V5 PATCH MARKERS VERIFIED')
