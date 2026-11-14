package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.opera.android.BrowserActivity;
import com.opera.android.BrowserAppWidget;
import com.opera.android.LoadingView;
import com.opera.android.OperaApplication;
import com.opera.android.bar.BottomBar;
import com.opera.android.bookmarks.h;
import com.opera.android.browser.BrowserFragment;
import com.opera.android.browser.TabInfo;
import com.opera.android.browser.UrlMangler;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class uu3 {
    public final /* synthetic */ BrowserActivity a;

    public uu3(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    @vkk
    public final void A(@NotNull nzj nzjVar) {
        if (nzjVar.a.d) {
            qim qimVar = this.a.o;
            Objects.requireNonNull(qimVar);
            ysj ysjVar = qimVar.e;
            ysjVar.b(am2.i(2132021602, 2500, ysjVar), ijm.b);
        }
    }

    @vkk
    public final void B(@NotNull xrl xrlVar) {
        int i = BrowserActivity.E1;
    }

    @vkk
    public final void C(@NotNull xxh xxhVar) {
        xxhVar.getClass();
        int i = BrowserActivity.E1;
        this.a.o1(1);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, com.opera.android.BrowserActivity, hjf] */
    @vkk
    public final void D(@NotNull q5j q5jVar) {
        String str = q5jVar.b;
        boolean zEquals = str.equals("app_layout");
        ?? r2 = this.a;
        if (zEquals || str.equals("addressbar_position")) {
            r2.x.d(new qt3(r2, (byte) 17)).a(null);
            return;
        }
        if (str.equals("app_theme") || str.equals("app_theme_accent") || str.equals("night_mode_switch_theme")) {
            int i = BrowserActivity.E1;
            r2.C();
            if (str.equals("app_theme_accent")) {
                int i2 = eif.a;
                kfo.k0((Context) r2, BrowserAppWidget.class);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    @vkk
    public final void E(k6h k6hVar) {
        ?? r1 = this.a;
        r1.getApplication().onTrimMemory(80);
        r1.onLowMemory();
    }

    @vkk
    public final void a(@NotNull yu yuVar) {
        String str = yuVar.a;
        String str2 = yuVar.b;
        int i = BrowserActivity.E1;
        wpe wpeVar = new wpe(str2, str);
        z77 z77Var = (z77) this.a.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
        z77Var.getClass();
        z77Var.b(wpeVar, ijm.b);
    }

    @vkk
    public final void b(h6h h6hVar) {
        throw new RuntimeException("Intentional crash on demand");
    }

    @vkk
    public final void c(@NotNull by3 by3Var) {
        int i = BrowserActivity.E1;
        this.a.c1(by3Var);
    }

    @vkk
    public final void d(@NotNull ps1 ps1Var) {
        BrowserActivity browserActivity = this.a;
        browserActivity.S0 = true;
        browserActivity.z1(3000L, 600L, false);
    }

    @vkk
    public final void e(@NotNull a03 a03Var) {
        BrowserActivity browserActivity = this.a;
        xf8.F0(browserActivity.l1, Boolean.valueOf(a03Var.a == 2));
        pyl pylVar = browserActivity.U0;
        pylVar.getClass();
        int i = a03Var.a;
        pylVar.b = i;
        if (i == 2 || i == 3) {
            return;
        }
        LoadingView loadingView = (LoadingView) pylVar.c;
        if ((loadingView != null ? loadingView.a : null) != null) {
            pylVar.m();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    @vkk
    public final void f(@NotNull fc6 fc6Var) {
        jm3 jm3Var = fc6Var.a;
        boolean z = jm3Var.a;
        ?? r4 = this.a;
        if (z && jm3Var.b > 0) {
            String[] strArr = OperaApplication.K;
            ((h) ((OperaApplication) r4.getApplication()).g()).j();
        }
        z77 z77VarZ0 = r4.z0();
        nz0 nz0VarY = vtp.y(fc6Var.a, fc6Var.b);
        z77VarZ0.getClass();
        z77VarZ0.b(nz0VarY, nz0VarY.getDefaultPriority());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    @vkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(@org.jetbrains.annotations.NotNull defpackage.sk5 r13) {
        /*
            r12 = this;
            java.lang.String[] r0 = com.opera.android.OperaApplication.K
            com.opera.android.BrowserActivity r0 = r12.a
            android.app.Application r1 = r0.getApplication()
            com.opera.android.OperaApplication r1 = (com.opera.android.OperaApplication) r1
            jk5 r1 = r1.i()
            java.lang.Object r2 = r1.d
            monitor-enter(r2)
            java.lang.String r3 = r1.e     // Catch: java.lang.Throwable -> L66
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L19
            r3 = r5
            goto L1a
        L19:
            r3 = r4
        L1a:
            monitor-exit(r2)
            if (r3 != 0) goto L65
            ode r1 = r1.b
            java.lang.Object r1 = r1.g()
            eb8 r1 = (defpackage.eb8) r1
            if (r1 == 0) goto L2b
            boolean r1 = r1.b
            r4 = r1 ^ 1
        L2b:
            if (r4 != 0) goto L65
            k6l r1 = r0.V
            if (r1 != 0) goto L32
            r1 = 0
        L32:
            b2l r8 = r1.o
            if (r8 == 0) goto L47
            r1 = r8
            d7l r1 = (defpackage.d7l) r1
            boolean r2 = r1.n0()
            if (r2 == 0) goto L47
            e7l r1 = r1.j
            boolean r1 = r1.m()
            if (r1 == 0) goto L51
        L47:
            com.opera.android.BrowserActivity r6 = r12.a
            r9 = 0
            lqm r10 = defpackage.lqm.l
            r7 = 0
            r11 = 0
            r6.i0(r7, r8, r9, r10, r11)
        L51:
            r0.o1(r5)
            tw3 r12 = r0.y
            zv3 r12 = r12.s
            java.lang.Object r12 = r12.get()
            bk5 r12 = (defpackage.bk5) r12
            java.lang.String r13 = r13.a
            gk5 r0 = defpackage.gk5.b
            r12.e(r13, r0)
        L65:
            return
        L66:
            r0 = move-exception
            r12 = r0
            monitor-exit(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu3.g(sk5):void");
    }

    @vkk
    public final void h(@NotNull bgf bgfVar) {
        lk6.a(bgfVar.a, bgfVar.b, bgfVar.c, this.a.getApplicationContext());
    }

    @vkk
    public final void i(@NotNull xh2 xh2Var) {
        vx3 vx3VarA = ay3.a(xh2Var.a.toString(), xh2Var.b, false);
        vx3VarA.c(true);
        ac8.a(new ay3(vx3VarA));
    }

    @vkk
    public final void j(@NotNull th8 th8Var) {
        int i = BrowserActivity.E1;
        this.a.e1(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.content.Context, com.opera.android.BrowserActivity] */
    @vkk
    public final void k(@NotNull xm8 xm8Var) throws JSONException {
        byte b = xm8Var.a;
        ?? r13 = this.a;
        if (b == 0) {
            ((yug) r13.y.a.m.get()).b(11, ltg.d, true);
        } else if (b == 1) {
            r13.P0().e(new vfn(xm8Var.b ? 1 : 0, null, 2), false);
        } else {
            if (b != 2) {
                return;
            }
            new zhj(new wzg(null, i8d.class, (byte) 4), null, 2, 0, null, true, Arrays.asList(new n6h[0])).c(r13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
    @vkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(@org.jetbrains.annotations.NotNull defpackage.ay3 r36) {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu3.l(ay3):void");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Activity, com.opera.android.BrowserActivity, dx3] */
    @vkk
    public final void m(@NotNull k3b k3bVar) {
        ?? r5 = this.a;
        if (joh.p((Activity) r5)) {
            byte b = k3bVar.a;
            ijm ijmVar = ijm.b;
            if (b == 1) {
                String[] strArr = OperaApplication.K;
                ((h) ((OperaApplication) r5.getApplication()).g()).j();
                qim qimVar = r5.o;
                Objects.requireNonNull(qimVar);
                z77 z77Var = qimVar.c;
                l3b l3bVar = new l3b(k3bVar.b);
                z77Var.getClass();
                z77Var.b(l3bVar, ijmVar);
                return;
            }
            if (b == 2) {
                qim qimVar2 = r5.o;
                Objects.requireNonNull(qimVar2);
                z77 z77Var2 = qimVar2.c;
                z2b z2bVar = new z2b(k3bVar.c);
                z77Var2.getClass();
                z77Var2.b(z2bVar, ijmVar);
            }
        }
    }

    @vkk
    public final void n(vwc vwcVar) {
        String[] strArr = OperaApplication.K;
        ((SharedPreferences) ((OperaApplication) this.a.getApplication()).F().e.get()).edit().remove("timer").apply();
        ac8.a(new yzh());
    }

    @vkk
    public final void o(@NotNull u6d u6dVar) {
        atj atjVar;
        atj atjVarK;
        b2l b2lVar;
        BrowserActivity browserActivity = this.a;
        View viewFindViewById = browserActivity.findViewById(2131363372);
        t6d t6dVar = u6dVar.a;
        t6d t6dVar2 = t6d.d;
        viewFindViewById.setVisibility(t6dVar == t6dVar2 ? 4 : 0);
        r22 r22Var = browserActivity.G;
        if (r22Var == null) {
            r22Var = null;
        }
        BottomBar bottomBar = (BottomBar) r22Var.a;
        boolean z = t6dVar == t6d.a;
        bp bpVar = (bp) r22Var.c;
        if (z) {
            View view = (View) bpVar.b;
            if (view != null) {
                view.setImportantForAccessibility(bpVar.a);
            }
            bpVar.b = null;
        } else {
            View view2 = (View) bpVar.b;
            if (view2 != bottomBar) {
                if (view2 != null) {
                    view2.setImportantForAccessibility(bpVar.a);
                }
                bpVar.b = bottomBar;
                bpVar.a = bottomBar.getImportantForAccessibility();
                bottomBar.setImportantForAccessibility(4);
            }
        }
        Object tag = bottomBar.getTag(2131364495);
        if (tag != null) {
            atjVar = (atj) tag;
        } else {
            Object parent = bottomBar.getParent();
            View view3 = parent instanceof View ? (View) parent : null;
            if (view3 == null) {
                atjVar = null;
            } else {
                Object tag2 = view3.getTag(2131364495);
                if (tag2 != null) {
                    atjVarK = (atj) tag2;
                } else {
                    Object parent2 = view3.getParent();
                    View view4 = parent2 instanceof View ? (View) parent2 : null;
                    if (view4 != null) {
                        atjVarK = xug.k(view4);
                    }
                    atjVar = null;
                }
                atjVar = atjVarK;
            }
        }
        if (atjVar != null) {
            LinkedHashSet linkedHashSet = atjVar.d;
            if (z) {
                if (linkedHashSet.remove(bottomBar)) {
                    atjVar.b();
                }
            } else if (linkedHashSet.add(bottomBar)) {
                atjVar.b();
            }
        }
        gbf gbfVar = browserActivity.M;
        gbf gbfVar2 = gbfVar != null ? gbfVar : null;
        gbfVar2.getClass();
        if (t6dVar == t6dVar2) {
            gbfVar2.m(true);
        }
        BrowserFragment browserFragmentP = browserActivity.P();
        if (browserFragmentP != null) {
            vp5 vp5Var = browserFragmentP.e;
            boolean z2 = t6dVar == t6dVar2;
            if (vp5Var.e != z2) {
                vp5Var.e = z2;
                ChromiumContainerView chromiumContainerView = vp5Var.f;
                if (chromiumContainerView != null) {
                    int i = vp5Var.c;
                    chromiumContainerView.setVisibility((i == 0 && z2) ? 4 : i);
                }
            }
            if (t6dVar.ordinal() != 2 || (b2lVar = browserFragmentP.g.o) == null) {
                return;
            }
            ((d7l) b2lVar).M(false);
        }
    }

    @vkk
    public final void p(c8d c8dVar) {
        qim qimVar = this.a.o;
        Objects.requireNonNull(qimVar);
        qimVar.g(new zhj(new wzg(e35.H0(1), e35.class, (byte) 4), null, 1, -1, null, true, Arrays.asList(new n6h[0])));
    }

    @vkk
    public final void q(@NotNull x2b x2bVar) {
        if (x2bVar != null) {
            boolean z = x2bVar instanceof m3b;
            BrowserActivity browserActivity = this.a;
            if (z) {
                z77 z77VarZ0 = browserActivity.z0();
                k4g k4gVar = new k4g(((m3b) x2bVar).a, true);
                z77VarZ0.getClass();
                z77VarZ0.b(k4gVar, ijm.b);
                return;
            }
            if (x2bVar instanceof a3b) {
                y2b y2bVar = ((a3b) x2bVar).a;
                z77 z77VarZ02 = browserActivity.z0();
                yz5 yz5Var = y2bVar == y2b.c ? new yz5(false, false, (byte) 5) : new yz5(false, false, (byte) 4);
                z77VarZ02.getClass();
                z77VarZ02.b(yz5Var, yz5Var.getDefaultPriority());
            }
        }
    }

    @vkk
    public final void r(@NotNull i6h i6hVar) {
    }

    @vkk
    public final void s(yzh yzhVar) {
        BrowserActivity browserActivity = this.a;
        browserActivity.S0 = true;
        browserActivity.z1(1000L, 0L, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
    @vkk
    public final void t(@NotNull uhj uhjVar) {
        String[] strArr = OperaApplication.K;
        ?? r1 = this.a;
        if (((Boolean) ((yk6) ((OperaApplication) r1.getApplication()).e().get()).i.g()).booleanValue()) {
            z5i.s0((Context) r1, r1.H0(), (d8j) r1.g0.E(d8j.class), uhjVar.c ? uhjVar.a : null, uhjVar.b, new pt3(r1, (byte) 14));
        }
    }

    @vkk
    public final void u(@NotNull whj whjVar) {
        lsc lscVarA;
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.a;
        browserActivity.B1();
        b2l b2lVarW0 = browserActivity.w0();
        if (b2lVarW0 == null) {
            return;
        }
        c5o c5oVar = browserActivity.e0;
        g82 g82Var = whjVar.a;
        ArrayList arrayList = whjVar.d;
        lqm lqmVar = whjVar.c;
        lhb lhbVar = browserActivity.x0().v;
        boolean z = whjVar.b;
        boolean zB = lhbVar.b(z ? 1 : 0);
        if (zB) {
            lhbVar.a();
        }
        lhbVar.m++;
        khb khbVar = zB ? new khb(z ? 1 : 0) : null;
        HashMap map = (HashMap) c5oVar.a;
        String str = g82Var.a;
        map.put(str, g82Var);
        HashMap map2 = (HashMap) c5oVar.b;
        if (khbVar != null) {
            map2.put(str, khbVar);
        } else {
            map2.remove(str);
        }
        t82 t82Var = browserActivity.E;
        if (t82Var == null) {
            t82Var = null;
        }
        g82 g82Var2 = whjVar.a;
        SettingsManager settingsManager = t82Var.b;
        settingsManager.getClass();
        o7j o7jVar = o7j.values()[settingsManager.n("enable_reading_mode_as_default")];
        if (o7jVar != o7j.AUTO ? o7jVar != o7j.ENABLED : vep.A(g82Var2.f) == 0) {
            UrlMangler.Builder builder = new UrlMangler.Builder("article", g82Var2.d);
            builder.title(g82Var2.b);
            builder.c.put("article_id", g82Var2.a);
            lscVarA = wqm.f(builder.build(), null, lqmVar);
        } else {
            lscVarA = t82Var.a(g82Var2, lqmVar);
        }
        lsc lscVar = lscVarA;
        if (arrayList == null) {
            ((d7l) b2lVarW0).Z(lscVar);
            return;
        }
        d7l d7lVarV = browserActivity.P().h.v(new TabInfo(0, 0, System.currentTimeMillis(), 0L), false, lqmVar, lscVar, true, arrayList);
        k6l k6lVar = browserActivity.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        k6lVar.f(null, d7lVarV, true);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    @vkk
    public final void v(@NotNull yhj yhjVar) {
        re7 re7VarD;
        Long l = yhjVar.a;
        ?? r3 = this.a;
        if (l != null) {
            String[] strArr = OperaApplication.K;
            re7VarD = ((OperaApplication) r3.getApplication()).m().a.d(yhjVar.a.longValue());
        } else {
            re7VarD = null;
        }
        int i = BrowserActivity.E1;
        r3.u1(re7VarD, 0);
    }

    @vkk
    public final void w(@NotNull zhj zhjVar) {
        qim qimVar = this.a.o;
        Objects.requireNonNull(qimVar);
        qimVar.g(zhjVar);
    }

    @vkk
    public final void x(@NotNull aij aijVar) {
        ysj ysjVarJ0 = this.a.J0();
        ysjVarJ0.b(am2.i(2132019322, 5000, ysjVarJ0), ijm.b);
    }

    @vkk
    public final void y(@NotNull cij cijVar) {
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.a;
        b2l b2lVarW0 = browserActivity.w0();
        if (b2lVarW0 != null) {
            browserActivity.o.f.R(new xq3(cijVar.b, cijVar.a), b2lVarW0);
        }
    }

    @vkk
    public final void z(@NotNull j6h j6hVar) {
        int i = BrowserActivity.E1;
    }
}
