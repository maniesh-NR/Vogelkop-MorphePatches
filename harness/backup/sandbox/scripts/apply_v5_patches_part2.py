#!/usr/bin/env python3
"""apply_v5_patches_part2.py — remaining v5 edits after S1 was applied
(S2 xnh forces, V1-V4 VPN, R1-R2 unlocks, E1-E3 eSIM, B1 banner, K1 splash).
Indentation-corrected anchors. Same fail-loud edit() as v4/v5 scripts."""
import re
import sys


def edit(path, pattern, repl, flags=0):
    src = open(path).read()
    n = len(list(re.finditer(pattern, src, flags)))
    if n != 1:
        sys.exit(f'{path}: anchor matched {n}x (want 1): {pattern!r}')
    out = re.sub(pattern, repl, src, count=1, flags=flags)
    open(path, 'w').write(out)
    print(f'  patched {path.split("/smali")[-1]}')


T3 = '/tmp/v5/smali3/smali'
T1 = '/tmp/v5/smali1/smali'


def s2_xnh():
    f = f'{T3}/xnh.smali'
    edit(f,
         r'(const/high16 v1, 0x4000000\n\n    )'
         r'invoke-virtual \{p1, v1\}, Lwnh;->b\(I\)Z\n\n    move-result v1\n',
         r'\1const/4 v1, 0x1\n')
    edit(f,
         r'(const/high16 p0, 0x100000\n\n    )'
         r'invoke-virtual \{p1, p0\}, Lwnh;->a\(I\)Z\n\n    move-result p0\n\n    xor-int/lit8 p0, p0, 0x1\n',
         r'\1const/4 p0, 0x0\n')
    edit(f,
         r'(const-string p0, "tracker_blocker"\n\n    )'
         r'invoke-virtual \{p1, v2\}, Lwnh;->b\(I\)Z\n\n    move-result v1\n',
         r'\1const/4 v1, 0x1\n')


def v1_ggn():
    f = f'{T3}/ggn.smali'
    edit(f,
         r'(    :goto_b\n)'
         r'(    invoke-direct/range \{v13 \.\. v23\}, Legn;-><init>\(Luvg;IZZZZZLnfn;Ldgh;Z\)V\n)',
         r'\1    const/16 v21, 0x0\n\n    const/16 v22, 0x0\n\n    const/16 v23, 0x0\n\n\2')


def v2_zfn():
    f = f'{T3}/zfn.smali'
    edit(f,
         r'(    check-cast v8, Lcom/opera/android/custom_views/VpnProBanner;\n\n'
         r'    if-eqz v8, :cond_38\n)',
         r'\1\n    const/16 v7, 0x8\n\n    invoke-virtual {v8, v7}, Landroid/view/View;->setVisibility(I)V\n')
    edit(f,
         r'(    :cond_40\n    )if-eqz v21, :cond_41\n',
         r'\1goto :cond_41\n')


def v3_cgn():
    f = f'{T3}/cgn.smali'
    edit(f,
         r'(\.method public final J0\(Luvg;I\)V\n    \.locals 1\n)',
         r'\1\n    return-void\n')


def v4_ldn():
    f = f'{T3}/ldn.smali'
    edit(f,
         r'invoke-virtual \{v7, v0\}, Lcnk;->a\(Ljava/util/Map;\)Ljava/util/List;\n\n'
         r'    move-result-object v0\n',
         'sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;\n')


def r1_k15():
    f = f'{T3}/k15.smali'
    edit(f,
         r'(\.method public final a\(\)Z\n    \.locals 1\n)',
         r'\1\n    const/4 v0, 0x1\n\n    return v0\n')


def r2_at1():
    f = f'{T3}/at1.smali'
    edit(f,
         r'(    if-ne v6, v9, :cond_4\n\n    )const/4 v14, 0x1\n',
         r'\1const/4 v14, 0x0\n')
    edit(f,
         r'(    if-nez v7, :cond_9\n\n    )const/16 v21, 0x1\n',
         r'\1const/16 v21, 0x0\n')


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


def b1_daj():
    f = f'{T3}/daj.smali'
    edit(f,
         r'(    const/4 v3, 0x3\n\n    if-ge v4, v3, :cond_14\n\n    )const/4 v4, 0x1\n',
         r'\1const/4 v4, 0x0\n')


def k1_splash():
    f = f'{T3}/com/opera/android/custom_views/SplashView.smali'
    edit(f,
         r'(\.method public constructor <init>\(Landroid/content/Context;Landroid/util/AttributeSet;\)V\n)'
         r'(    \.locals )0(\n\n)'
         r'(    invoke-direct \{p0, p1, p2\}, Landroid/widget/FrameLayout;-><init>\(Landroid/content/Context;Landroid/util/AttributeSet;\)V\n)',
         r'\1\g<2>1\g<3>\4\n    const v0, -0x1\n\n    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V\n')


def main():
    print('applying v5 patches part 2')
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
    print('all v5 part-2 patches applied')


if __name__ == '__main__':
    main()
