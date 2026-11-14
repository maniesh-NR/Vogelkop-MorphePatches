package defpackage;

import J.N;
import android.os.Handler;
import android.os.Looper;
import com.opera.android.Lazy;
import com.opera.android.browser.BrowserFragment;
import com.opera.android.browser.BrowserTabState;
import com.opera.android.browser.NavigationEntry;
import com.opera.android.browser.NavigationHistory;
import com.opera.android.browser.SessionStore;
import com.opera.android.browser.TabInfo;
import com.opera.android.browser.chromium.OperaBrowserContext;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class k6l implements w6f {
    public final xbf a;
    public final eq6 e;
    public final ltc f;
    public final azn g;
    public final z2g h;
    public final ld7 i;
    public final wd7 j;
    public final ld7 k;
    public final qp2 l;
    public int n;
    public b2l o;
    public d7l p;
    public final i6l r;
    public final g6l s;
    public final Handler t;
    public final d6l u;
    public final u7k v;
    public final xg w;
    public final b5l x;
    public int y;
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public final ghf d = new ghf(this);
    public final z6l m = new z6l(System.currentTimeMillis());
    public final h7f q = new h7f();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [d6l, nwe] */
    public k6l(BrowserFragment browserFragment, umi umiVar, xbf xbfVar, Lazy lazy, SettingsManager settingsManager, eq6 eq6Var, nw3 nw3Var, hwf hwfVar, nw3 nw3Var2, xnh xnhVar, ox3 ox3Var, qp2 qp2Var, ox3 ox3Var2, plh plhVar, dj9 dj9Var, j4c j4cVar) {
        i6l i6lVar = new i6l(this);
        this.r = i6lVar;
        g6l g6lVar = new g6l();
        this.s = g6lVar;
        this.t = new Handler(Looper.getMainLooper());
        ?? r12 = new nwe() { // from class: d6l
            @Override // defpackage.nwe
            public final void y(boolean z) {
                this.a.z();
            }
        };
        this.u = r12;
        this.v = new u7k(this);
        this.w = new xg(this);
        this.a = xbfVar;
        this.e = eq6Var;
        qke qkeVar = new qke(this, settingsManager, nw3Var);
        this.f = new ltc(qkeVar, hwfVar, nw3Var2);
        this.g = new azn(qkeVar, settingsManager, xnhVar, ox3Var, this, nw3Var, (geb) no7.n(browserFragment.getActivity(), io7.z, geb.k));
        this.h = new z2g(qkeVar, settingsManager, ox3Var);
        this.i = new ld7(qkeVar);
        this.j = new wd7(browserFragment.getActivity(), umiVar, ox3Var2, qkeVar, plhVar, dj9Var);
        this.k = new ld7(qkeVar, j4cVar);
        this.l = qp2Var;
        new yg(this, nw3Var, nw3Var2);
        ac8.c(i6lVar);
        owe.c.F(r12);
        byte b = 1;
        s99 s99Var = new s99(settingsManager, b);
        Objects.requireNonNull(lazy);
        b5l b5lVar = new b5l(s99Var, this, xbfVar, new s4k(lazy, b));
        this.x = b5lVar;
        F(b5lVar);
        g6lVar.a.b(b5lVar);
    }

    public final b2l A() {
        b2l b2lVar = this.o;
        Objects.requireNonNull(b2lVar);
        return b2lVar;
    }

    public final void B(b2l b2lVar) {
        C(b2lVar, 3);
    }

    public final void C(b2l b2lVar, int i) {
        if (b2lVar == null) {
            ks3.B("Active tab set to null", null);
        }
        b2l b2lVar2 = this.o;
        if (b2lVar != b2lVar2) {
            if (b2lVar2 != null) {
                ((d7l) b2lVar2).W(false);
            }
            this.o = b2lVar;
            if (b2lVar != null) {
                ((d7l) b2lVar).W(true);
                if (b2lVar.T() != (b2lVar2 != null ? b2lVar2.T() : p6l.a)) {
                    this.y++;
                }
                h7f h7fVar = this.q;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    try {
                        ((j6l) g7fVarH.next()).H(b2lVar2, b2lVar, i);
                    } catch (RuntimeException e) {
                        ks3.D(e);
                    }
                }
            }
        }
    }

    public final f6l a(a2l a2lVar) {
        f6l f6lVar = new f6l(a2lVar);
        F(f6lVar);
        b2l b2lVar = this.o;
        if (b2lVar != null) {
            ((d7l) b2lVar).F(a2lVar);
        }
        return f6lVar;
    }

    public final void b(a2l a2lVar) {
        this.s.a.b(a2lVar);
    }

    @Override // defpackage.w6f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void F(j6l j6lVar) {
        this.q.b(j6lVar);
    }

    public final void e(int i, d7l d7lVar, boolean z) {
        g(d7lVar, i);
        ArrayList arrayList = this.b;
        if (arrayList.size() == 1 || z) {
            C(d7lVar, 3);
        }
        h7f h7fVar = this.q;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            j6l j6lVar = (j6l) g7fVarH.next();
            try {
                arrayList.size();
                j6lVar.d(this.n);
            } catch (RuntimeException e) {
                ks3.D(e);
            }
        }
    }

    public final void f(b2l b2lVar, d7l d7lVar, boolean z) {
        ArrayList arrayList = this.b;
        e(b2lVar != null ? arrayList.indexOf(b2lVar) + 1 : arrayList.size(), d7lVar, z);
    }

    public final void g(d7l d7lVar, int i) {
        int iMax = d7lVar.j.m() ? Math.max(i, q()) : Math.min(i, q());
        ArrayList arrayList = this.b;
        arrayList.add(iMax, d7lVar);
        this.c.put(Integer.valueOf(d7lVar.j.getId()), d7lVar);
        if (d7lVar.j.m()) {
            this.n++;
        }
        h7f h7fVar = this.q;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            try {
                ((j6l) g7fVarH.next()).o(d7lVar, iMax, false);
            } catch (RuntimeException e) {
                ks3.D(e);
            }
        }
        d7lVar.F(this.s);
        b2l b2lVar = iMax > 0 ? (b2l) arrayList.get(iMax - 1) : null;
        b5l b5lVar = this.x;
        b5lVar.getClass();
        if (b2lVar == null || d7lVar.j.m() != ((d7l) b2lVar).j.m()) {
            return;
        }
        Iterator it = ((ArrayList) b5lVar.b.d.b).iterator();
        if (it.hasNext()) {
            switch (((h6l) it.next()).ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    h9o.p();
                    break;
            }
            return;
        }
        int iOrdinal = d7lVar.l.ordinal();
        if (iOrdinal == 4 || iOrdinal == 13 || iOrdinal == 42) {
            b5lVar.W(b2lVar, d7lVar);
        }
    }

    public final void h(h6l h6lVar) {
        ghf ghfVar = this.d;
        k6l k6lVar = (k6l) ghfVar.d;
        if (((bde) ghfVar.c) == null) {
            bde bdeVar = new bde();
            ghfVar.c = bdeVar;
            k6lVar.F(bdeVar);
            k6lVar.s.F((bde) ghfVar.c);
        }
        ((ArrayList) ghfVar.b).add(h6lVar);
        h7f h7fVar = k6lVar.q;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            try {
                ((j6l) g7fVarH.next()).getClass();
            } catch (RuntimeException e) {
                ks3.D(e);
            }
        }
    }

    public final d7l i(b2l b2lVar, boolean z) {
        xbf xbfVar = this.a;
        xbfVar.getClass();
        d7l d7lVar = (d7l) b2lVar;
        NavigationHistory navigationHistoryI = d7lVar.i();
        boolean zM = d7lVar.j.m();
        vzk vzkVar = (vzk) xbfVar.b;
        int iL = vzkVar.L(zM);
        TabInfo tabInfoA = d7lVar.j.a();
        if (!zM && ((SessionStore) xbfVar.g) != null) {
            iuh iuhVar = (iuh) navigationHistoryI;
            NavigationHistory navigationHistory = (NavigationHistory) iuhVar.b;
            int iD = navigationHistory.d();
            ArrayList arrayList = new ArrayList(iD);
            int iJ = navigationHistory.j();
            for (int i = 0; i < iD; i++) {
                NavigationEntry navigationEntryI = iuhVar.i(i);
                if (navigationEntryI.b()) {
                    arrayList.add(new zy3(navigationEntryI.getId(), navigationEntryI.getUrl(), navigationEntryI.d(), navigationEntryI.getTitle(), navigationEntryI.a(), navigationEntryI.c(), navigationEntryI.e()));
                }
                if (iJ == i || iJ < 0) {
                    iJ = arrayList.size() - 1;
                }
            }
            ((SessionStore) xbfVar.g).c(new BrowserTabState(arrayList, iJ, iL, tabInfoA));
        }
        d7l d7lVar2 = new d7l(new ilj(vzkVar, iL, tabInfoA, (iuh) navigationHistoryI, zM), d7lVar);
        f(b2lVar, d7lVar2, z);
        this.x.W(b2lVar, d7lVar2);
        return d7lVar2;
    }

    public final void j() {
        TabInfo tabInfoB = TabInfo.b();
        xbf xbfVar = this.a;
        lqm lqmVar = lqm.l;
        d7l d7lVarU = xbfVar.u(tabInfoB, false, lqmVar);
        g(d7lVarU, 0);
        C(d7lVarU, 3);
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b2l b2lVar = (b2l) it.next();
            if (b2lVar != d7lVarU) {
                it.remove();
                this.c.remove(Integer.valueOf(((d7l) b2lVar).j.getId()));
                y(b2lVar, true);
            }
        }
        if (d7lVarU.j.m()) {
            g(xbfVar.u(TabInfo.b(), false, lqmVar), 0);
        }
        h7f h7fVar = this.q;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            j6l j6lVar = (j6l) g7fVarH.next();
            try {
                arrayList.size();
                j6lVar.d(this.n);
            } catch (RuntimeException e) {
                ks3.D(e);
            }
        }
        g7f g7fVarH2 = am2.h(h7fVar, h7fVar);
        while (g7fVarH2.hasNext()) {
            try {
                ((j6l) g7fVarH2.next()).z();
            } catch (RuntimeException e2) {
                ks3.D(e2);
            }
        }
    }

    public final void k(b2l b2lVar) {
        ArrayList arrayList = this.b;
        boolean z = arrayList.size() == 1 && arrayList.get(0) == b2lVar;
        if (!((d7l) b2lVar).j.m() && arrayList.size() - this.n == 1) {
            g(this.a.u(TabInfo.b(), false, lqm.l), 0);
        }
        boolean zContains = arrayList.contains(b2lVar);
        h7f h7fVar = this.q;
        if (zContains) {
            if (b2lVar == this.o) {
                b2l b2lVarO = o(b2lVar, u3l.c);
                Objects.requireNonNull(b2lVarO);
                C(b2lVarO, 1);
            }
            arrayList.remove(b2lVar);
            this.c.remove(Integer.valueOf(((d7l) b2lVar).j.getId()));
            y(b2lVar, false);
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                j6l j6lVar = (j6l) g7fVarH.next();
                try {
                    arrayList.size();
                    j6lVar.d(this.n);
                } catch (RuntimeException e) {
                    ks3.D(e);
                }
            }
        }
        if (z) {
            g7f g7fVarH2 = am2.h(h7fVar, h7fVar);
            while (g7fVarH2.hasNext()) {
                try {
                    ((j6l) g7fVarH2.next()).z();
                } catch (RuntimeException e2) {
                    ks3.D(e2);
                }
            }
        }
    }

    public final void l(Set set) {
        ArrayList arrayList = this.b;
        boolean zContainsAll = set.containsAll(arrayList);
        if (set.contains(this.o)) {
            b2l b2lVar = this.o;
            s3l s3lVar = u3l.a;
            b2l b2lVarO = o(b2lVar, new q3l(set));
            b2l b2lVar2 = b2lVarO;
            if (b2lVarO == null) {
                d7l d7lVarU = this.a.u(TabInfo.b(), false, lqm.l);
                g(d7lVarU, 0);
                b2lVar2 = d7lVarU;
            }
            C(b2lVar2, 1);
        }
        ArrayList arrayList2 = new ArrayList();
        sfe.z(arrayList2, sfe.Q(arrayList, new e6l(set, (byte) 0)));
        exg.A(arrayList2, x6l.a);
        h6l h6lVar = h6l.f;
        h(h6lVar);
        arrayList2.forEach(new pv1(this, (byte) 7));
        n(h6lVar);
        if (zContainsAll) {
            h7f h7fVar = this.q;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                try {
                    ((j6l) g7fVarH.next()).z();
                } catch (RuntimeException e) {
                    ks3.D(e);
                }
            }
        }
    }

    public final d7l m(boolean z) {
        eq6 eq6Var;
        lqm lqmVar = lqm.o;
        if (!z && this.b.isEmpty() && (eq6Var = this.e) != null) {
            grf grfVar = (grf) eq6Var.a;
            if (aik.o(((frf) grfVar.i()).a) != null) {
                lsc lscVarF = wqm.f(aik.o(((frf) grfVar.i()).a), null, lqmVar);
                xbf xbfVar = this.a;
                return lscVarF == null ? xbfVar.u(TabInfo.b(), z, lqmVar) : xbfVar.v(TabInfo.b(), z, lqmVar, lscVarF, true, null);
            }
        }
        return this.a.u(TabInfo.b(), z, lqmVar);
    }

    public final void n(h6l h6lVar) {
        bde bdeVar;
        ghf ghfVar = this.d;
        k6l k6lVar = (k6l) ghfVar.d;
        h7f h7fVar = k6lVar.q;
        ArrayList arrayList = (ArrayList) ghfVar.b;
        if (arrayList.isEmpty()) {
            return;
        }
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            try {
                ((j6l) g7fVarH.next()).k();
            } catch (RuntimeException e) {
                ks3.D(e);
            }
        }
        if (!arrayList.isEmpty() || (bdeVar = (bde) ghfVar.c) == null) {
            return;
        }
        k6lVar.H(bdeVar);
        g6l g6lVar = k6lVar.s;
        bde bdeVar2 = (bde) ghfVar.c;
        g6lVar.getClass();
        g6lVar.a.c(bdeVar2);
        ghfVar.c = null;
        g7f g7fVarH2 = am2.h(h7fVar, h7fVar);
        while (g7fVarH2.hasNext()) {
            try {
                ((j6l) g7fVarH2.next()).K(bdeVar);
            } catch (RuntimeException e2) {
                ks3.D(e2);
            }
        }
    }

    public final b2l o(b2l b2lVar, u3l u3lVar) {
        b2l b2lVarN;
        s3l s3lVar = ((d7l) b2lVar).j.m() ? u3l.b : u3l.a;
        int i = ((d7l) b2lVar).j.a().d;
        u7k u7kVar = this.v;
        if (i != 0) {
            u3lVar.getClass();
            b2lVarN = u7kVar.n(b2lVar, new p3l(new p3l(u3lVar, s3lVar), new r3l(i)));
        } else {
            b2lVarN = null;
        }
        if (b2lVarN == null) {
            u3lVar.getClass();
            b2lVarN = u7kVar.n(b2lVar, new p3l(u3lVar, s3lVar));
        }
        return (b2lVarN == null && b2lVar.T() == p6l.b) ? u7kVar.n(b2lVar, u3lVar) : b2lVarN;
    }

    public final xg p() {
        return this.w;
    }

    public final int q() {
        return this.b.size() - this.n;
    }

    public final b2l r(int i) {
        return (b2l) this.c.get(Integer.valueOf(i));
    }

    public final int s(p6l p6lVar) {
        return t(p6lVar == p6l.b);
    }

    public final int t(boolean z) {
        return z ? this.n : this.b.size() - this.n;
    }

    public final void u(int i, int i2) {
        ArrayList arrayList = this.b;
        b2l b2lVar = (b2l) arrayList.remove(i);
        arrayList.add(i2, b2lVar);
        h7f h7fVar = this.q;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            try {
                ((j6l) g7fVarH.next()).h(b2lVar, i2);
            } catch (RuntimeException e) {
                ks3.D(e);
            }
        }
        if (((ArrayList) this.d.b).isEmpty()) {
            exg.d(this);
        }
    }

    public final void v(a2l a2lVar) {
        this.s.a.c(a2lVar);
    }

    @Override // defpackage.w6f
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void H(j6l j6lVar) {
        b2l b2lVar;
        this.q.c(j6lVar);
        if (!(j6lVar instanceof f6l) || (b2lVar = this.o) == null) {
            return;
        }
        ((d7l) b2lVar).H(((f6l) j6lVar).a);
    }

    public final void y(b2l b2lVar, boolean z) {
        Handler handler = this.t;
        if (b2lVar == this.p) {
            this.p = null;
        }
        if (((d7l) b2lVar).j.m()) {
            int i = this.n - 1;
            this.n = i;
            if (i == 0) {
                this.l.getClass();
                i7f i7fVar = hj.a;
                N.Mgtu0Tn5();
                vl8.b.a.clear();
                j4c j4cVar = OperaBrowserContext.b;
                N.MGrsowqE(true);
                j14.t(true, (yqd) null);
            }
        }
        boolean z2 = false;
        byte b = 21;
        try {
            h7f h7fVar = this.q;
            h7fVar.getClass();
            g7f g7fVar = new g7f(h7fVar);
            while (g7fVar.hasNext()) {
                try {
                    ((j6l) g7fVar.next()).L(b2lVar, z);
                } catch (RuntimeException e) {
                    ks3.D(e);
                }
            }
        } finally {
            handler.post(new wr9(b, this, b2lVar, z2));
        }
    }

    public final void z() {
        Iterator it = Collections.unmodifiableList(this.b).iterator();
        while (it.hasNext()) {
            ((d7l) ((b2l) it.next())).u();
        }
    }
}
