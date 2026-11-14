package defpackage;

import android.icu.text.Collator;
import android.icu.text.RuleBasedCollator;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.opera.android.bookmarks.h;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.settings.SettingsManager;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class gn3 implements View.OnClickListener, View.OnLongClickListener, jvk {
    public um3 A;
    public xw D;
    public e E;
    public flb F;
    public bm3 G;
    public som H;
    public boolean I;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public final h b;
    public final om3 e;
    public final ne5 f;
    public final x5f g;
    public final zwk h;
    public final db i;
    public final SettingsManager j;
    public final cq5 k;
    public final hxk m;
    public final sl6 n;
    public Runnable o;
    public r p;
    public y83 q;
    public FadingRecyclerView r;
    public xm3 s;
    public final im3 t;
    public final tzi u;
    public final vx v;
    public final iu2 w;
    public final gjm x;
    public final ArrayList a = new ArrayList();
    public final dl3 c = new dl3(this, 2);
    public final fn3 l = new fn3(this, 0);
    public final mvk B = nvk.v(2132018532);
    public final vi7 C = new vi7(vml.d, 0, true, 0, null, false);
    public boolean J = true;
    public final rm3 y = rm3.e;
    public final dm3 z = dm3.e;
    public final zm3 d = new zm3(this);

    public gn3(im3 im3Var, tzi tziVar, vx vxVar, iu2 iu2Var, x5f x5fVar, i53 i53Var, zwk zwkVar, db dbVar, SettingsManager settingsManager, cq5 cq5Var, om3 om3Var, hxk hxkVar, sl6 sl6Var, gjm gjmVar) {
        this.t = im3Var;
        this.u = tziVar;
        this.v = vxVar;
        this.w = iu2Var;
        this.x = gjmVar;
        this.g = x5fVar;
        h hVar = (h) i53Var;
        this.b = hVar;
        this.h = zwkVar;
        this.i = dbVar;
        this.j = settingsManager;
        this.k = cq5Var;
        this.n = sl6Var;
        this.e = om3Var;
        this.m = hxkVar;
        Locale locale = Locale.getDefault();
        ne5 ne5Var = new ne5();
        ne5Var.a = hVar;
        ne5Var.b = new ArrayList();
        ne5Var.d = new ArrayList();
        ne5Var.e = new hn3(ne5Var, (byte) 0);
        Collator collator = Collator.getInstance(locale);
        collator.setStrength(0);
        ne5Var.g = (RuleBasedCollator) collator;
        this.f = ne5Var;
    }

    public final ml3 a() {
        ym3 ym3VarB = b();
        if (ym3VarB == null) {
            return null;
        }
        return ym3VarB.a;
    }

    public final ym3 b() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (ym3) am2.k(1, arrayList);
    }

    public final ArrayList c() {
        Set setUnmodifiableSet = Collections.unmodifiableSet((LinkedHashSet) this.u.a.c);
        ArrayList arrayList = new ArrayList(setUnmodifiableSet.size());
        Iterator it = setUnmodifiableSet.iterator();
        while (it.hasNext()) {
            al3 al3VarM = this.b.m(((Long) it.next()).longValue(), true);
            if (al3VarM != null) {
                arrayList.add(qhc.b(al3VarM));
            }
        }
        return arrayList;
    }

    public final void d() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
        if (arrayList.isEmpty()) {
            this.t.g0();
        } else {
            g();
        }
    }

    public final boolean e() {
        rm3 rm3Var = this.y;
        rm3Var.q();
        return this.I && !TextUtils.isEmpty((CharSequence) rm3Var.a);
    }

    public final void g() {
        um3 um3Var = this.A;
        if (um3Var != null) {
            um3Var.a(true);
        }
        ((CircularProgressIndicator) this.q.h).setVisibility(8);
        this.r.y0((d) null);
        ym3 ym3VarB = b();
        ml3 ml3Var = ym3VarB != null ? ym3VarB.a : null;
        this.z.S(ml3Var);
        xm3 xm3Var = this.s;
        xm3Var.c = ml3Var;
        xm3Var.J();
        this.r.y0(this.G.c);
        if (ym3VarB != null) {
            this.r.restoreHierarchyState(ym3VarB.b);
        }
        this.w.run(ml3Var);
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        mvk mvkVar = this.B;
        hvkVarArr[1] = mvkVar;
        hvkVarArr[0] = mvkVar;
    }

    public final void i(String str) {
        if (!this.I || this.J) {
            this.J = false;
            return;
        }
        rm3 rm3Var = this.y;
        if (str != null && !str.equals(rm3Var.a) && !this.K) {
            this.K = true;
            this.g.S(3);
        }
        rm3Var.S(str);
        xm3 xm3Var = this.s;
        if (xm3Var.l.e()) {
            xm3Var.M();
        } else {
            xm3Var.J();
        }
    }

    public final void j(ArrayList arrayList, String str, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z2 = this.j.C() == q7j.FOREGROUND;
        vx3 vx3VarA = ay3.a((String) ((pl3) arrayList.get(0)).getUrl().a, lqm.g, false);
        vx3VarA.c(true);
        vx3VarA.e(z);
        vx3VarA.a(z2);
        vx3VarA.f = false;
        vx3VarA.d(true);
        vx3VarA.i = new v4l(str, false, false);
        for (int i = 1; i < arrayList.size(); i++) {
            vx3VarA.b((String) ((pl3) arrayList.get(i)).getUrl().a, false);
        }
        this.u.d();
        ac8.a(new ay3(vx3VarA));
    }

    @Override // defpackage.jvk
    public final void k(i iVar, hvk hvkVar) {
        p(Collections.singletonList(((d7n) iVar).i));
    }

    public final void l(List list) {
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            al3 al3Var = (al3) it.next();
            sa2 sa2Var = new sa2((byte) 4, false);
            al3Var.c(sa2Var);
            i += sa2Var.b;
            sa2 sa2Var2 = new sa2((byte) 3, false);
            al3Var.c(sa2Var2);
            i2 += sa2Var2.b;
        }
        this.M = i;
        this.N = i2;
    }

    public final void m(al3 al3Var) {
        ml3 ml3VarA = al3Var.g() ? (ml3) al3Var : al3Var.a(this.b.o());
        if (ml3VarA == null || ml3VarA.equals(a())) {
            return;
        }
        o(ml3VarA, true);
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        this.G.getClass();
        if (iVar instanceof xz7) {
            return false;
        }
        return ((e7n) iVar).i.a();
    }

    public final void o(ml3 ml3Var, boolean z) {
        ArrayList arrayList = this.a;
        if (z) {
            arrayList.clear();
        }
        if (ml3Var.h()) {
            arrayList.add(new ym3(ml3Var));
            return;
        }
        ml3 ml3VarA = ml3Var.a(this.b.o());
        if (ml3VarA == null) {
            return;
        }
        o(ml3VarA, false);
        arrayList.add(new ym3(ml3Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            com.opera.android.custom_views.FadingRecyclerView r0 = r5.r
            if (r0 == 0) goto Lb4
            android.view.View r1 = r0.I(r6)
            r2 = 0
            if (r1 != 0) goto Ld
            r0 = r2
            goto L11
        Ld:
            androidx.recyclerview.widget.i r0 = r0.T(r1)
        L11:
            e7n r0 = (defpackage.e7n) r0
            if (r0 == 0) goto Lb4
            qhc r1 = r0.i
            int r3 = r6.getId()
            r4 = 2131363258(0x7f0a05ba, float:1.834632E38)
            if (r3 != r4) goto L2d
            xw r0 = new xw
            r0.<init>(r5, r1)
            r5.D = r0
            r0.h = r1
            r0.p(r6)
            return
        L2d:
            tzi r6 = r5.u
            boolean r3 = r6.g
            if (r3 == 0) goto L43
            boolean r5 = r1.a()
            if (r5 == 0) goto Lb4
            e5d r5 = r6.a
            long r0 = r0.getItemId()
            r5.d(r0)
            return
        L43:
            al3 r6 = r1.a
            boolean r0 = r6.g()
            r1 = 0
            if (r0 == 0) goto La4
            boolean r0 = r5.I
            if (r0 == 0) goto L54
            r5.m(r6)
            goto La0
        L54:
            ml3 r0 = r5.a()
            if (r0 == 0) goto L6a
            boolean r3 = r0.h()
            if (r3 != 0) goto L6a
            com.opera.android.bookmarks.h r2 = r5.b
            com.opera.android.bookmarks.c r2 = r2.o()
            ml3 r2 = r0.a(r2)
        L6a:
            if (r2 == 0) goto L71
            boolean r0 = r2.equals(r6)
            goto L72
        L71:
            r0 = r1
        L72:
            java.util.ArrayList r2 = r5.a
            if (r0 == 0) goto L96
            int r0 = r2.size()
            r3 = 2
            if (r0 < r3) goto L8a
            int r0 = r0 - r3
            java.lang.Object r0 = r2.get(r0)
            ym3 r0 = (defpackage.ym3) r0
            ml3 r0 = r0.a
            boolean r1 = r0.equals(r6)
        L8a:
            if (r1 == 0) goto L96
            int r6 = r2.size()
            int r6 = r6 + (-1)
            r2.remove(r6)
            goto La0
        L96:
            ml3 r6 = (defpackage.ml3) r6
            ym3 r0 = new ym3
            r0.<init>(r6)
            r2.add(r0)
        La0:
            r5.g()
            return
        La4:
            pl3 r6 = (defpackage.pl3) r6
            shf r5 = r6.getUrl()
            java.lang.Object r5 = r5.a
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto Lb5
        Lb4:
            return
        Lb5:
            boolean r6 = z5i.a0(r5)
            lqm r0 = defpackage.lqm.g
            vx3 r5 = defpackage.ay3.a(r5, r0, r1)
            r5.q = r6
            am2.v(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn3.onClick(android.view.View):void");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        FadingRecyclerView fadingRecyclerView = this.r;
        if (fadingRecyclerView != null && !this.I) {
            View viewI = fadingRecyclerView.I(view);
            e7n e7nVar = (e7n) (viewI == null ? null : fadingRecyclerView.T(viewI));
            if (e7nVar != null && e7nVar.i.b == 1) {
                vi7 vi7Var = this.C;
                if (vi7Var.g.p != -1) {
                    this.u.d();
                    vi7Var.g.s(e7nVar);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void p(List list) {
        if (list.isEmpty()) {
            return;
        }
        l(Stream.-EL.toList(list.stream().map(new mn((byte) 1))));
        um3 um3Var = this.A;
        int i = this.M;
        um3Var.getClass();
        if (list.isEmpty()) {
            return;
        }
        um3Var.g = true;
        e5d e5dVarN = um3Var.e.N(list);
        if (!((ArrayList) e5dVarN.c).isEmpty()) {
            ((mhk) um3Var.c.b).g(new mkm(e5dVarN, i));
            um3Var.f();
            um3Var.b.u();
        }
        um3Var.g = false;
    }

    public final boolean q() {
        return (((f8f) this.k.getValue()).f() || this.n.b() || this.i.f()) ? false : true;
    }

    public final void r(al3 al3Var) {
        ss7 ts7Var;
        boolean zG = al3Var.g();
        w80 w80Var = w80.b;
        if (zG) {
            ts7Var = new as(this.x);
            ss7.L0(al3Var, null, ts7Var, w80Var, null);
        } else {
            ts7Var = new ts7();
            ss7.L0(al3Var, null, ts7Var, w80Var, null);
        }
        zhj.a(ts7Var, 4097).c(this.p);
    }

    public final void s(ArrayList arrayList, String str, boolean z) {
        if (arrayList.size() <= 8) {
            j(arrayList, str, z);
            return;
        }
        bn3 bn3Var = new bn3(new wm3(this, arrayList, str, z), arrayList.size());
        z77 z77VarU = sfe.U(this.p);
        z77VarU.getClass();
        z77VarU.b(bn3Var, ijm.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(boolean r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.c()
            int r1 = r0.size()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L29
            java.lang.Object r1 = r0.get(r3)
            qhc r1 = (defpackage.qhc) r1
            al3 r1 = r1.a
            boolean r1 = r1.g()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.get(r3)
            qhc r1 = (defpackage.qhc) r1
            al3 r1 = r1.a
            ml3 r1 = (defpackage.ml3) r1
            java.lang.String r1 = r1.getTitle()
            goto L67
        L29:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L66
            java.lang.Object r1 = r0.get(r3)
            qhc r1 = (defpackage.qhc) r1
            al3 r1 = r1.a
            com.opera.android.bookmarks.h r2 = r5.b
            com.opera.android.bookmarks.c r2 = r2.o()
            ml3 r1 = r1.a(r2)
            if (r1 == 0) goto L66
            java.util.List r2 = r1.i()
            int r3 = r2.size()
            int r4 = r0.size()
            if (r3 != r4) goto L66
            java.util.stream.Stream r2 = r2.stream()
            zx1 r3 = new zx1
            r4 = 3
            r3.<init>(r0, r4)
            boolean r2 = r2.allMatch(r3)
            if (r2 == 0) goto L66
            java.lang.String r1 = r1.getTitle()
            goto L67
        L66:
            r1 = 0
        L67:
            java.util.ArrayList r0 = alo.j(r0)
            java.util.ArrayList r0 = alo.r(r0)
            r5.s(r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn3.t(boolean):void");
    }

    public final void u() {
        boolean z = false;
        if (this.I) {
            this.G.g(cm3.e);
            this.G.e(false);
            this.G.f(false);
            this.G.h(false);
            return;
        }
        boolean z2 = this.L;
        bm3 bm3Var = this.G;
        if (z2) {
            bm3Var.g(cm3.f);
            this.G.e(false);
            this.G.f(false);
            this.G.h(false);
            return;
        }
        bm3Var.g(cm3.d);
        bm3 bm3Var2 = this.G;
        boolean zS = this.b.s();
        sl6 sl6Var = this.n;
        bm3Var2.e(zS && sl6Var.b());
        bm3 bm3Var3 = this.G;
        if (!((f8f) this.k.getValue()).f() && !sl6Var.b()) {
            z = true;
        }
        bm3Var3.f(z);
        this.G.h(q());
    }
}
