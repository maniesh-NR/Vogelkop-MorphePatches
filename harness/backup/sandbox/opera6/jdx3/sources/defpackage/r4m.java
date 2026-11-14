package defpackage;

import J.N;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.settings.SettingsManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class r4m extends y08 {
    public final y4m b;
    public final b0c c;
    public final h5m d;
    public final tjm e;
    public final k6l f;
    public final v3m g;
    public final cbl h;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final ode i = new ode();
    public final kze j = new kze("");
    public byte k = 0;
    public final l8l a = new l8l(new o4m(this, (byte) 6), 24);

    public r4m(BrowserActivity browserActivity, BrowserActivity browserActivity2, k6l k6lVar, SettingsManager settingsManager, v3m v3mVar, cbl cblVar, cbl cblVar2, ghf ghfVar, int i) {
        final byte b = 0;
        this.f = k6lVar;
        this.g = v3mVar;
        this.h = cblVar;
        final y4m y4mVar = new y4m(new o4m(this, (byte) 6), browserActivity, v3mVar, ghfVar, this);
        this.b = y4mVar;
        this.c = new b0c(new o4m(this, (byte) 7), v3mVar);
        h5m h5mVar = new h5m(v3mVar, ghfVar, cblVar2, new o4m(this, (byte) 8));
        this.d = h5mVar;
        this.e = new tjm(new o4m(this, (byte) 6), v3mVar, k6lVar, i);
        aib.A(k6lVar.w, browserActivity2.getLifecycle(), this, new p7l(this, (byte) 22));
        aib.B(settingsManager, browserActivity2, new ezg(this, (byte) 9), new vme((byte) 19));
        plk plkVar = v3mVar.d;
        ode odeVar = (ode) plkVar.c;
        ode odeVar2 = (ode) plkVar.d;
        odeVar.j(browserActivity2, new f7f() { // from class: w4m
            public final void d0(Object obj) {
                byte b2 = b;
                y4m y4mVar2 = y4mVar;
                Set hashSet = (Set) obj;
                switch (b2) {
                    case 0:
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        y4mVar2.g = hashSet;
                        y4mVar2.v0();
                        break;
                    default:
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        y4mVar2.h = hashSet;
                        y4mVar2.v0();
                        break;
                }
            }
        });
        final byte b2 = 1;
        odeVar2.j(browserActivity2, new f7f() { // from class: w4m
            public final void d0(Object obj) {
                byte b22 = b2;
                y4m y4mVar2 = y4mVar;
                Set hashSet = (Set) obj;
                switch (b22) {
                    case 0:
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        y4mVar2.g = hashSet;
                        y4mVar2.v0();
                        break;
                    default:
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        y4mVar2.h = hashSet;
                        y4mVar2.v0();
                        break;
                }
            }
        });
        h5mVar.h.k(new g9l(this, (byte) 8));
    }

    public final szb W() {
        b0c b0cVar = this.c;
        szb szbVar = b0cVar.f;
        return szbVar != null ? szbVar : b0cVar.e;
    }

    public final boolean X(b2l b2lVar, int i) {
        szb szbVarW;
        if (tjm.I0(this.e.c, b2lVar) && (szbVarW = W()) != null && !((d5m) this.d.h.g()).b()) {
            String str = this.a.d;
            if (i != 1) {
                y4m y4mVar = this.b;
                if (i == 2) {
                    return !y4mVar.I0(szbVarW, str);
                }
                if (!y4mVar.d.b.E().a || !y4mVar.j || y4mVar.H0(str) || !y4mVar.d.e(szbVarW, 0)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(defpackage.b2l r6, int r7) {
        /*
            r5 = this;
            tjm r0 = r5.e
            v3m r1 = r0.c
            boolean r6 = defpackage.tjm.I0(r1, r6)
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L66
            boolean r6 = r0.H0()
            if (r6 != 0) goto L65
            szb r6 = r5.W()
            l8l r3 = r5.a
            java.lang.String r3 = r3.d
            if (r7 == r2) goto L65
            r4 = 2
            y4m r5 = r5.b
            if (r7 == r4) goto L5e
            v3m r7 = r5.d
            com.opera.android.settings.SettingsManager r4 = r7.b
            z4m r4 = r4.E()
            boolean r4 = r4.a
            if (r4 == 0) goto L66
            boolean r4 = r5.j
            if (r4 == 0) goto L66
            if (r6 == 0) goto L66
            szb r4 = r5.i
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L66
            boolean r3 = r5.I0(r6, r3)
            if (r3 != 0) goto L66
            android.content.Context r7 = r7.a
            android.content.Context r7 = r7.getApplicationContext()
            szb r7 = ybh.h(r7)
            if (r7 != 0) goto L4f
            r5 = r1
            goto L55
        L4f:
            v3m r5 = r5.d
            boolean r5 = r5.e(r7, r1)
        L55:
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L65
            if (r5 != 0) goto L65
            goto L66
        L5e:
            boolean r5 = r5.I0(r6, r3)
            r1 = r5 ^ 1
            goto L66
        L65:
            r1 = r2
        L66:
            if (r1 == 0) goto L6b
            r0.J0(r2)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r4m.Y(b2l, int):void");
    }

    public final void Z(b2l b2lVar, int i) {
        Y(this.f.o, i);
        if (this.e.H0()) {
            if (X(b2lVar, i)) {
                c0(new o4m(this, (byte) 0));
                return;
            }
            if (i == 1 && this.c.d == 2) {
                vz5 vz5Var = this.d.f;
                d7h d7hVar = vz5Var != null ? (d7h) vz5Var.i : null;
                if (d7hVar != null) {
                    y4m y4mVar = this.b;
                    v3m v3mVar = y4mVar.d;
                    szb szbVar = y4mVar.i;
                    if (szbVar == null) {
                        szb szbVarD = v3mVar.d();
                        y4mVar.i = szbVarD;
                        v3mVar.i(szbVarD);
                        szbVar = y4mVar.i;
                    }
                    Objects.requireNonNull(szbVar);
                    d7hVar.d((szb) null, szbVar, ps0.c);
                }
            }
        }
    }

    public final void a0() throws InterruptedException {
        if (v3m.f(this.g.a)) {
            this.h.run();
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void b(b2l b2lVar, yqa yqaVar) {
        c0(new h4m((Object) this, (Object) yqaVar, (Object) b2lVar, (byte) 1));
    }

    public final void b0() {
        this.k = (byte) 0;
        this.o = false;
        c0(new o4m(this, (byte) 4));
    }

    public final void c0(Runnable runnable) {
        if (this.m) {
            runnable.run();
            return;
        }
        this.m = true;
        runnable.run();
        this.m = false;
        if (this.n) {
            f0();
            this.n = false;
        }
    }

    public final void d0(b2l b2lVar) throws InterruptedException {
        if (this.c.e == null) {
            v3m v3mVar = this.g;
            if (v3mVar.b.shouldDetectLanguageAutomatically() || this.e.H0()) {
                if (((d7l) b2lVar).j.isLoading() && v3mVar.b.shouldDetectLanguageAutomatically()) {
                    return;
                }
                if (((d7l) b2lVar).j.isLoading()) {
                    this.o = true;
                    return;
                }
                ChromiumContent chromiumContentH = uy3.H(b2lVar);
                if (chromiumContentH == null) {
                    b(b2lVar, null);
                    return;
                }
                yqa yqaVar = chromiumContentH.Q;
                if (yqaVar != null) {
                    String str = (String) yqaVar.b;
                    if (!str.isEmpty() && !"und".equals(str)) {
                        b(b2lVar, yqaVar);
                        return;
                    }
                }
                N.MokdJxHC(chromiumContentH.n);
                return;
            }
        }
        a0();
    }

    public final void e0(d5m d5mVar) {
        Set set;
        boolean z;
        if (this.m) {
            this.n = true;
            return;
        }
        tjm tjmVar = this.e;
        boolean zH0 = tjmVar.H0();
        String str = this.a.d;
        y4m y4mVar = this.b;
        Set setUnmodifiableSet = Collections.unmodifiableSet(y4mVar.g);
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(y4mVar.h);
        boolean z2 = y4mVar.j;
        v3m v3mVar = y4mVar.d;
        szb szbVar = y4mVar.i;
        if (zH0 && szbVar == null) {
            szb szbVarD = v3mVar.d();
            y4mVar.i = szbVarD;
            v3mVar.i(szbVarD);
            szbVar = y4mVar.i;
        }
        b0c b0cVar = this.c;
        byte b = b0cVar.d;
        szb szbVar2 = szbVar;
        szb szbVarW = W();
        v3m v3mVar2 = this.g;
        if (v3m.f(v3mVar2.a) && b0cVar.d == 2 && !ru9.c(y4mVar.c).a.getBoolean("translate_web_pages.tap_to_select_language_hint.shown", false) && tjmVar.H0()) {
            set = setUnmodifiableSet;
            z = true;
        } else {
            set = setUnmodifiableSet;
            z = false;
        }
        this.i.r(new n4m(str, set, setUnmodifiableSet2, z2, szbVar2, b, szbVarW, d5mVar, zH0, z, v3m.f(v3mVar2.a) && this.l));
        this.l = false;
    }

    public final void f0() {
        e0((d5m) this.d.h.g());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    @Override // defpackage.y08, defpackage.a2l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.b2l r5) {
        /*
            r4 = this;
            boolean r0 = r4.o
            if (r0 == 0) goto L31
            com.opera.android.browser.chromium.ChromiumContent r0 = defpackage.uy3.H(r5)
            if (r0 != 0) goto Lf
            r0 = 0
            r4.b(r5, r0)
            goto L2e
        Lf:
            yqa r1 = r0.Q
            if (r1 == 0) goto L29
            java.lang.Object r2 = r1.b
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L29
            java.lang.String r3 = "und"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L29
            r4.b(r5, r1)
            goto L2e
        L29:
            long r0 = r0.n
            J.N.MokdJxHC(r0)
        L2e:
            r5 = 0
            r4.o = r5
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r4m.j(b2l):void");
    }
}
