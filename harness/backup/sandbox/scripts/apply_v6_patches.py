#!/usr/bin/env python3
"""apply_v6_patches.py — v6 smali edits on the v5-patched trees
(/tmp/v6/smali3 = v4+v5 patched classes3, /tmp/v6/smali1 = v5 patched classes1).

V6 patch set (from the v5 device test report):

  Ad blocker (custom mode, all lists on, opera_fixes gone):
    A1  SettingsManager: ad_blocking_mode default 1 (ENHANCED) -> 2 (CUSTOM)
    A2  SettingsManager: ad_blocking_mode.selected_custom_lists seeded with
        the JSON array of every picker-visible list (generated from the
        patched abp.manifest: all ADBLOCK lists except opera_fixes and the
        internal bit3 ones tier1/tier2/testcase/ublock_min)
    A4  zi3.k()/q() (classes1): always return h() — the blocklist manifest
        is pinned to APK assets; server-pushed manifests can never revert
        our catalog (companion to the binary manifest patch in the build)

  VPN (Pro upsell gone, premium layout + protocol picker unlocked):
    V5a ggn.a(): force Legn.b = 2 — VPN settings always use the PREMIUM
        layout (no padlocked free-layout rows; functional auto-connect
        checkbox + protocol row)
    V5b bgn pswitch_0: protocol row ALWAYS opens the sfn protocol picker
        (Auto / Lightway-TCP / Lightway-UDP), never the J0 paywall route
    V6  p12.n() -> null — MainMenuVpnProBannerState never exists, so the
        "VPN Pro" card below History/Offline/Flow in the main menu is gone

  Wallpapers / app icons (visible AND unlocked):
    R3a rmg pswitch_8: launch the app-icons catalog fetch even with the
        rewards feature disabled
    R3b rmg pswitch_2: launch the wallpapers catalog fetch likewise
    R4a o71 (x4i case): emit the wallpapers list even with rewards disabled
    R4b o71 (r2i case): emit the app-icons list likewise
    R4c r2i.c: skip the inner m18 re-check in the icons refresh coroutine

  Minipay / wallet / rewards (predatory crypto surfaces):
    M1  BrowserActivity: h73.x (minipay gate) always false — MINIPAY never
        added to the main menu
    M2  pc: MINIPAY toolbar button b true -> false (not offered in the
        toolbar customization list)
    M2b pc: REWARDS toolbar button b true -> false (same)
    M3  d37.B: never add wol.k (MINIPAY) — belt and braces with M1
    M3b d37.B: never add wol.l (WALLET) — crypto wallet menu item gone

  Settings sanitisation:
    N1  bo3: the "Rewards / Earn while you browse" catalog row is never
        added to the browser settings list
    N2  rqd.k: the 7 promo in-app notification rows (eSIM, Feature tips,
        Feedback and ratings, VPN Pro, Product and service news, Rewards,
        Wallpaper promotions) start GONE; only Push notifications remains

  --nonews (optional variant: live scores + news removed):
    X1  SettingsManager: enable_newsfeed default -> 0
    X2  xnh.u: live_scores_enabled forced 0 (flag-proof)
    X3  pc: LIVE_SCORES toolbar button b true -> false

Every edit anchors on a unique multi-line pattern and asserts exactly one
match (fail-loud), like the v4/v5 scripts.
"""
import json
import re
import struct
import sys
import zipfile

T3 = '/tmp/v6/smali3/smali'
T1 = '/tmp/v6/smali1/smali'
SUBSTRATE = '/tmp/v4/substrate.apk'


def edit(path, pattern, repl, flags=0, marker=None):
    src = open(path).read()
    n = len(list(re.finditer(pattern, src, flags)))
    if n != 1:
        if marker and marker in src:
            print(f'  skip (already applied): {path.split("/smali")[-1]}')
            return
        sys.exit(f'{path}: anchor matched {n}x (want 1): {pattern!r}')
    out = re.sub(pattern, repl, src, count=1, flags=flags)
    open(path, 'w').write(out)
    print(f'  patched {path.split("/smali")[-1]}')


# ---------------- abp.manifest helpers (seed + patched manifest) ----------------

KINDS = ['ADBLOCK_URL', 'CDB_URL', 'TRACKER_URL', 'ADBLOCK_CSS']
INTERNAL = {'tier1_allow_rules', 'tier2_allow_rules', 'testcase', 'ublock_min'}
OPERA_FIXES = 'opera_fixes'


class R:
    def __init__(self, b):
        self.b, self.o = b, 0

    def u16(self):
        v = struct.unpack_from('>H', self.b, self.o)[0]; self.o += 2; return v

    def i32(self):
        v = struct.unpack_from('>i', self.b, self.o)[0]; self.o += 4; return v

    def u32(self):
        v = struct.unpack_from('>I', self.b, self.o)[0]; self.o += 4; return v

    def i16(self):
        v = struct.unpack_from('>h', self.b, self.o)[0]; self.o += 2; return v

    def u8(self):
        v = self.b[self.o]; self.o += 1; return v

    def take(self, n):
        v = self.b[self.o:self.o + n]; self.o += n; return v

    def s(self):
        n = self.u16()
        return None if n == 0 else self.take(n).decode('utf-8')


def u16(v): return struct.pack('>H', v)
def i32(v): return struct.pack('>i', v)
def u32(v): return struct.pack('>I', v)
def i16(v): return struct.pack('>h', v)


def wstr(s):
    if s is None:
        return u16(0)
    b = s.encode('utf-8')
    return u16(len(b)) + b


def parse_manifest(data):
    r = R(data)
    m = {}
    m['head'] = r.i32()
    m['url'] = r.s()
    m['sets'] = {}
    for kind in KINDS:
        cnt = r.u16()
        m['sets'][kind] = [(r.s(), r.s()) for _ in range(cnt)]
    m['s'] = r.i16()
    cnt = r.u32()
    metas = []
    for _ in range(cnt):
        blen = r.u32()
        blob = r.take(blen)
        ir = R(blob)
        name = ir.s()
        mlen = ir.u32()
        meta = None
        if mlen:
            mr = R(ir.take(mlen))
            meta = dict(bitmask=mr.i32(), category=mr.u8(),
                        s1=mr.s(), s2=mr.s(), s3=mr.s())
        metas.append(dict(name=name, meta=meta, version=ir.i32(), ts=ir.i16()))
    m['metas'] = metas
    assert r.o == len(data), f'trailing bytes: {len(data) - r.o}'
    return m


def serialize_manifest(m):
    out = i32(m['head']) + wstr(m['url'])
    for kind in KINDS:
        entries = m['sets'][kind]
        out += u16(len(entries))
        for name, h in entries:
            out += wstr(name) + wstr(h)
    out += i16(m['s'])
    out += u32(len(m['metas']))
    for e in m['metas']:
        inner = wstr(e['name'])
        if e['meta'] is None:
            inner += u32(0)
        else:
            mt = e['meta']
            mblob = (i32(mt['bitmask']) + bytes([mt['category']])
                     + wstr(mt['s1']) + wstr(mt['s2']) + wstr(mt['s3']))
            inner += u32(len(mblob)) + mblob
        inner += i32(e['version']) + i16(e['ts'])
        out += u32(len(inner)) + inner
    return out


def patch_manifest(data):
    m = parse_manifest(data)
    assert serialize_manifest(m) == data, 'manifest round-trip mismatch'
    for kind in ['ADBLOCK_URL', 'ADBLOCK_CSS']:
        m['sets'][kind] = [(n, h) for n, h in m['sets'][kind] if n != OPERA_FIXES]
    m['metas'] = [e for e in m['metas'] if e['name'] != OPERA_FIXES]
    flipped = []
    for e in m['metas']:
        if e['meta'] is None:
            continue
        if e['name'] in INTERNAL:
            # internal allow-lists/QA: strip every mode bit (8 = hidden, off)
            e['meta']['bitmask'] = 8
        else:
            old = e['meta']['bitmask']
            if old != old | 3:
                e['meta']['bitmask'] = old | 3
                flipped.append(e['name'])
    seed_names = [n for n, _ in m['sets']['ADBLOCK_URL']
                  if n != OPERA_FIXES and n not in INTERNAL]
    return serialize_manifest(m), seed_names, flipped


def smali_json(names):
    """JSON array string, escaped for a smali const-string literal."""
    js = json.dumps(names, separators=(',', ':'))
    return js.replace('\\', '\\\\').replace('"', '\\"')


# ---------------- A: ad blocker defaults ----------------

def a_defaults(seed_names):
    f = f'{T3}/com/opera/android/settings/SettingsManager.smali'
    # A1: mode 1 -> 2 (CUSTOM)
    edit(f,
         r'(const/4 v10, 0x1\n\n)(    const-string v0, "ad_blocking_mode"\n)',
         r'const/4 v10, 0x2\n\n\2',
         marker='const/4 v10, 0x2\n\n    const-string v0, "ad_blocking_mode"')
    # A2: seed selected_custom_lists
    js = smali_json(seed_names)
    edit(f,
         r'(    const-string v0, "ad_blocking_mode\.selected_custom_lists"\n\n)'
         r'    invoke-virtual \{v1, v0, v7\}, Landroid/os/BaseBundle;->putString\(Ljava/lang/String;Ljava/lang/String;\)V\n',
         f'    const-string v10, "{js}"\n\n\\1'
         '    invoke-virtual {v1, v0, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V\n',
         marker='invoke-virtual {v1, v0, v10}, Landroid/os/BaseBundle;->putString')


# ---------------- A4: zi3 manifest pinning (classes1) ----------------

def a4_zi3():
    f = f'{T1}/zi3.smali'
    edit(f,
         r'(\.method public final k\(Lizd;\)Ljava/lang/Object;\n'
         r'    \.locals 0\n\n)'
         r'    invoke-static \{p1\}, Lz4o;->l0\(Lizd;\)Lui3;\n\n'
         r'    move-result-object p0\n',
         r'\1    invoke-virtual {p0}, Lzi3;->h()Ljava/lang/Object;\n\n'
         r'    move-result-object p0\n',
         marker='.method public final k(Lizd;)Ljava/lang/Object;\n    .locals 0\n\n    invoke-virtual {p0}, Lzi3;->h()')
    edit(f,
         r'(\.method public final q\(\[B\)Ljava/lang/Object;\n'
         r'    \.locals 1\n\n)'
         r'    new-instance p0, Lizd;\n\n'
         r'    new-instance v0, Ljava/io/ByteArrayInputStream;\n\n'
         r'    invoke-direct \{v0, p1\}, Ljava/io/ByteArrayInputStream;-><init>\(\[B\)V\n\n'
         r'    invoke-direct \{p0, v0\}, Ljava/io/DataInputStream;-><init>\(Ljava/io/InputStream;\)V\n\n'
         r'    invoke-static \{p0\}, Lz4o;->l0\(Lizd;\)Lui3;\n\n'
         r'    move-result-object p0\n',
         r'\1    invoke-virtual {p0}, Lzi3;->h()Ljava/lang/Object;\n\n'
         r'    move-result-object p0\n',
         marker='.method public final q([B)Ljava/lang/Object;\n    .locals 1\n\n    invoke-virtual {p0}, Lzi3;->h()')


# ---------------- V5a: ggn — premium settings layout always ----------------

def v5a_ggn():
    f = f'{T3}/ggn.smali'
    edit(f,
         r'(    :goto_b\n'
         r'    const/16 v21, 0x0\n\n'
         r'    const/16 v22, 0x0\n\n'
         r'    const/16 v23, 0x0\n\n)'
         r'(    invoke-direct/range \{v13 \.\. v23\}, Legn;-><init>\(Luvg;IZZZZZLnfn;Ldgh;Z\)V\n)',
         r'\1    const/4 v15, 0x2\n\n\2',
         marker='const/4 v15, 0x2\n\n    invoke-direct/range {v13 .. v23}')


# ---------------- V5b: bgn — protocol row always opens the picker ----------------

def v5b_bgn():
    f = f'{T3}/bgn.smali'
    edit(f,
         r'(    invoke-interface \{p1\}, Lgfn;->isEnabled\(\)Z\n\n'
         r'    move-result p1\n\n)'
         r'    if-nez p1, :cond_0\n',
         r'\1    goto :cond_0\n',
         marker='move-result p1\n\n    goto :cond_0')


# ---------------- V6: p12.n — no main-menu VPN Pro banner ----------------

def v6_p12():
    f = f'{T3}/p12.smali'
    edit(f,
         r'(\.method public final n\(\)Lp7d;\n    \.locals 9\n)',
         r'\1\n    const/4 v0, 0x0\n\n    return-object v0\n',
         marker='.method public final n()Lp7d;\n    .locals 9\n\n    const/4 v0, 0x0\n\n    return-object v0')


# ---------------- R3/R4: wallpaper + app icon catalogs with rewards off ---------

def r3_rmg():
    f = f'{T3}/rmg.smali'
    # pswitch_8 (r2i / app icons fetch launcher)
    edit(f,
         r'(    :pswitch_8\n'
         r'    check-cast p0, Lr2i;\n\n'
         r'    check-cast p1, Lm18;\n\n)'
         r'    sget-object v0, Lm18;->b:Lm18;\n\n'
         r'    if-ne p1, v0, :cond_1d\n',
         r'\1    sget-object v0, Lm18;->b:Lm18;\n\n'
         r'    if-ne v0, v0, :cond_1d\n',
         marker='if-ne v0, v0, :cond_1d')
    # pswitch_2 (x4i / wallpapers fetch launcher)
    edit(f,
         r'(    :pswitch_2\n'
         r'    check-cast p0, Lx4i;\n\n'
         r'    iget-object v0, p0, Lx4i;->d:Lddc;\n\n'
         r'    check-cast p1, Lm18;\n\n)'
         r'    sget-object v2, Lm18;->b:Lm18;\n\n'
         r'    if-ne p1, v2, :cond_1\n',
         r'\1    sget-object v2, Lm18;->b:Lm18;\n\n'
         r'    if-ne v2, v2, :cond_1\n',
         marker='if-ne v2, v2, :cond_1')


def r4_o71_r2i():
    f = f'{T3}/o71.smali'
    # x4i (wallpapers) emit gate
    edit(f,
         r'(    iget-object v3, v0, Lx4i;->b:Likc;\n\n'
         r'    invoke-virtual \{v3\}, Lekc;->g\(\)Ljava/lang/Object;\n\n'
         r'    move-result-object v3\n\n)'
         r'    sget-object v6, Lm18;->b:Lm18;\n\n'
         r'    if-ne v3, v6, :cond_6\n',
         r'\1    sget-object v6, Lm18;->b:Lm18;\n\n'
         r'    if-ne v6, v6, :cond_6\n',
         marker='if-ne v6, v6, :cond_6')
    # r2i (app icons) emit gate
    edit(f,
         r'(    iget-object v10, v0, Lr2i;->b:Likc;\n\n'
         r'    invoke-virtual \{v10\}, Lekc;->g\(\)Ljava/lang/Object;\n\n'
         r'    move-result-object v10\n\n)'
         r'    sget-object v11, Lm18;->b:Lm18;\n\n'
         r'    if-ne v10, v11, :cond_11\n',
         r'\1    sget-object v11, Lm18;->b:Lm18;\n\n'
         r'    if-ne v11, v11, :cond_11\n',
         marker='if-ne v11, v11, :cond_11')
    # r2i.c inner gate
    f2 = f'{T3}/r2i.smali'
    edit(f2,
         r'(    :cond_3\n'
         r'    iget-object p1, p0, Lr2i;->b:Likc;\n\n'
         r'    invoke-virtual \{p1\}, Lekc;->g\(\)Ljava/lang/Object;\n\n'
         r'    move-result-object p1\n\n)'
         r'    sget-object v2, Lm18;->b:Lm18;\n\n'
         r'    if-ne p1, v2, :cond_7\n',
         r'\1    sget-object v2, Lm18;->b:Lm18;\n\n'
         r'    if-ne v2, v2, :cond_7\n',
         marker='if-ne v2, v2, :cond_7')


# ---------------- M: minipay / wallet / rewards buttons ----------------

def m_minipay():
    # M1: BrowserActivity h73.x gate -> always false
    f = f'{T3}/com/opera/android/BrowserActivity.smali'
    edit(f,
         r'(    and-int/lit16 v2, v2, 0x800\n\n'
         r'    if-eqz v2, :cond_1\n\n'
         r'    invoke-static \{\}, Li0l;->g\(\)Z\n\n'
         r'    move-result v2\n\n'
         r'    if-nez v2, :cond_1\n\n)'
         r'    const/16 v22, 0x1\n',
         r'\1    const/16 v22, 0x0\n',
         marker='const/16 v22, 0x0\n\n    goto :goto_0')
    # M2 + M2b: pc button flags (MINIPAY, REWARDS)
    f = f'{T3}/pc.smali'
    edit(f,
         r'(sget-object v37, Lxc;->I:Lxc;\n\n)'
         r'    const/16 v38, 0x1\n',
         r'\1    const/16 v38, 0x0\n',
         marker='sget-object v37, Lxc;->I:Lxc;\n\n    const/16 v38, 0x0')
    edit(f,
         r'(sget-object v38, Lxc;->M:Lxc;\n\n)'
         r'    const/16 v39, 0x1\n',
         r'\1    const/16 v39, 0x0\n',
         marker='sget-object v38, Lxc;->M:Lxc;\n\n    const/16 v39, 0x0')
    # M3 + M3b: d37 never adds MINIPAY/WALLET menu items
    f = f'{T1}/d37.smali'
    edit(f,
         r'(    :cond_7\n'
         r'    iget-boolean v1, p0, Ld37;->b:Z\n\n)'
         r'    if-eqz v1, :cond_8\n',
         r'\1    goto :cond_8\n',
         marker='iget-boolean v1, p0, Ld37;->b:Z\n\n    goto :cond_8')
    edit(f,
         r'(    invoke-virtual \{p0\}, Ljava/lang/Boolean;->booleanValue\(\)Z\n\n'
         r'    move-result p0\n\n)'
         r'    if-eqz p0, :cond_9\n',
         r'\1    goto :cond_9\n',
         marker='move-result p0\n\n    goto :cond_9')


# ---------------- N: settings sanitisation ----------------

def n_settings():
    # N1: bo3 — drop the Rewards row from the browser settings catalog
    f = f'{T3}/bo3.smali'
    edit(f,
         r'    const/4 v6, 0x0\n\n'
         r'    const/16 v7, 0x38\n\n'
         r'    const/4 v2, 0x6\n\n'
         r'    const v3, 0x7f140a39\n\n'
         r'    const v4, 0x7f0a09ec\n\n'
         r'    invoke-static/range \{v1 \.\. v7\}, Ln6j;->c\(Ln6j;IIIILjava/util/List;I\)V\n\n',
         '',
         marker='Ln6j;->c(Ln6j;IIIILjava/util/List;I)V\n\n    iget-object v0, v0, Liy3;->f:Lg1c;')
    # N2: rqd.k — hide the 7 promo in-app notification rows
    f = f'{T3}/rqd.smali'
    edit(f,
         r'(    check-cast v10, Lcom/opera/android/ui/catalog/widget/OperaListItem;\n\n'
         r'    if-eqz v10, :cond_0\n\n)'
         r'(    new-instance v0, Lfm9;\n)',
         r'\1'
         r'    const/16 v1, 0x8\n\n'
         r'    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V\n\n'
         r'    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V\n\n'
         r'    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V\n\n'
         r'    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V\n\n'
         r'    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V\n\n'
         r'    invoke-virtual {v8, v1}, Landroid/view/View;->setVisibility(I)V\n\n'
         r'    invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V\n\n'
         r'\2',
         marker='invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V')


# ---------------- X: nonews variant ----------------

def x_nonews():
    f = f'{T3}/com/opera/android/settings/SettingsManager.smali'
    # X1: enable_newsfeed default 0
    edit(f,
         r'(    invoke-static \{p2\}, Lcom/opera/android/utilities/DisplayUtil;->a\(Landroid/content/Context;\)Z\n\n'
         r'    move-result v0\n\n)'
         r'    xor-int/2addr v0, v4\n',
         r'\1    const/4 v0, 0x0\n',
         marker='move-result v0\n\n    const/4 v0, 0x0\n\n    const-string v7, "enable_newsfeed"')
    # X2: xnh — live_scores_enabled forced 0
    f = f'{T3}/xnh.smali'
    edit(f,
         r'(    const/16 p0, 0x4000\n\n)'
         r'    invoke-virtual \{p1, p0\}, Lwnh;->b\(I\)Z\n\n'
         r'    move-result p0\n\n'
         r'(    const-string v1, "live_scores_enabled"\n)',
         r'\1    const/4 p0, 0x0\n\n\2',
         marker='const/16 p0, 0x4000\n\n    const/4 p0, 0x0')
    # X3: pc — LIVE_SCORES toolbar button off
    f = f'{T3}/pc.smali'
    edit(f,
         r'(sget-object v25, Lxc;->u:Lxc;\n\n)'
         r'    const/16 v26, 0x1\n',
         r'\1    const/16 v26, 0x0\n',
         marker='sget-object v25, Lxc;->u:Lxc;\n\n    const/16 v26, 0x0')


def main():
    nonews = '--nonews' in sys.argv
    print(f'applying v6 patches (nonews={nonews})')

    print('  [manifest] parsing stock abp.manifest from substrate')
    stock = zipfile.ZipFile(SUBSTRATE).read('assets/op/abp.manifest')
    patched, seed_names, flipped = patch_manifest(stock)
    open('/tmp/v6/abp.manifest.patched', 'wb').write(patched)
    print(f'  [manifest] {len(seed_names)} lists seeded, opera_fixes removed, '
          f'{len(flipped)} promoted, internals -> bitmask 8')

    a_defaults(seed_names)
    a4_zi3()
    v5a_ggn()
    v5b_bgn()
    v6_p12()
    r3_rmg()
    r4_o71_r2i()
    m_minipay()
    n_settings()
    if nonews:
        x_nonews()
    print('all v6 patches applied')


if __name__ == '__main__':
    main()
