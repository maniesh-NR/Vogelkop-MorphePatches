package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class ysm {
    public final qe4 a;
    public final tc4 b;
    public final c37 c;
    public final pdo d;
    public final t3d e;
    public final mf4 f;
    public final nv6 g;
    public final n7h h;
    public final yg4 i;
    public final kd4 j;
    public boolean n;
    public final jyd r;
    public final dtk s;
    public final rn9 t;
    public final qfl u;
    public volatile a21 v;
    public final ArrayList w;
    public final LinkedHashSet x;
    public final Object k = new Object();
    public final LinkedHashSet l = new LinkedHashSet();
    public final LinkedHashSet m = new LinkedHashSet();
    public boolean o = true;
    public boolean p = true;
    public final LinkedHashSet q = new LinkedHashSet();

    public ysm(qe4 qe4Var, tc4 tc4Var, c37 c37Var, pdo pdoVar, t3d t3dVar, Set set, y94 y94Var, mf4 mf4Var, nv6 nv6Var, n7h n7hVar, h28 h28Var, pe4 pe4Var, yg4 yg4Var, kd4 kd4Var, Context context, kb7 kb7Var) {
        this.a = qe4Var;
        this.b = tc4Var;
        this.c = c37Var;
        this.d = pdoVar;
        this.e = t3dVar;
        this.f = mf4Var;
        this.g = nv6Var;
        this.h = n7hVar;
        this.i = yg4Var;
        this.j = kd4Var;
        this.r = new jyd(pe4Var, new iyd(), kb7Var);
        ge4 ge4Var = pe4Var.b;
        this.s = new dtk(context, ge4Var, h28Var, et8.Zo);
        this.t = new rn9(ge4Var);
        this.u = new qfl(this, (byte) 20);
        this.w = new ArrayList();
        LinkedHashSet linkedHashSetM0 = CollectionsKt.m0(set);
        linkedHashSetM0.add(y94Var);
        this.x = linkedHashSetM0;
    }

    public final void a(qrm qrmVar) {
        synchronized (this.k) {
            if (this.m.add(qrmVar)) {
                l();
            }
        }
    }

    public final boolean b(LinkedHashSet linkedHashSet) {
        if (((Boolean) this.i.a.b(yg4.l, Boolean.TRUE)).booleanValue() && !this.l.contains(this.r) && j(linkedHashSet)) {
            c();
            return true;
        }
        if (!linkedHashSet.contains(this.r) || j(linkedHashSet)) {
            return false;
        }
        jyd jydVar = this.r;
        synchronized (this.k) {
            if (this.m.remove(jydVar)) {
                l();
            }
        }
        g(Collections.singletonList(jydVar));
        jydVar.F((zd4) this.g.get());
        return true;
    }

    public final void c() {
        zd4 zd4Var = (zd4) this.g.get();
        jyd jydVar = this.r;
        jydVar.b(zd4Var, null, null, null);
        jydVar.K();
        d(Collections.singletonList(jydVar));
        a(jydVar);
    }

    public final void d(List list) {
        synchronized (this.k) {
            if (!list.isEmpty()) {
                if (gyg.G(3, "CXCP")) {
                    list.toString();
                    toString();
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!this.l.contains((qrm) obj)) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((qrm) obj2).x();
                }
                if (this.l.addAll(list) && !b(CollectionsKt.N(this.l, this.m))) {
                    n();
                    this.e.a(CollectionsKt.k0(this.l));
                    k(this.l);
                }
                if (this.o) {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        ((qrm) obj3).u();
                    }
                } else {
                    this.q.addAll(arrayList);
                }
            } else if (gyg.G(5, "CXCP")) {
                toString();
            }
        }
    }

    public final Object e(kuk kukVar) {
        List listK0;
        synchronized (this.k) {
            f();
            this.r.B();
            listK0 = CollectionsKt.k0(this.w);
        }
        Object objB0 = cs5.b0(listK0, kukVar);
        return objB0 == px5.a ? objB0 : Unit.a;
    }

    public final void f() {
        d3k d3kVarD;
        wrm wrmVarH = h();
        this.v = null;
        tc4 tc4Var = this.b;
        ud4 ud4Var = (ud4) this.h.get();
        synchronized (tc4Var.b) {
            if (tc4Var.g) {
                ArrayList arrayList = tc4Var.e;
                ge4 ge4Var = (ge4) qyn.n0(ud4Var, uqh.a(ge4.class));
                String str = ge4Var != null ? ((ma4) ge4Var).a : null;
                sd4 sd4Var = str != null ? new sd4(str) : null;
                if (sd4Var == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.remove(sd4Var.a);
            }
        }
        if (wrmVarH != null) {
            if (wrmVarH.h.a()) {
                wrmVarH.c.close();
                d3kVarD = na2.B(wrmVarH.b.f, null, null, new vrm(null, wrmVarH), 3);
            } else {
                d3kVarD = sfe.d(Unit.a);
            }
            this.w.add(d3kVarD);
            d3kVarD.s(new gil(this, d3kVarD, (byte) 17));
        }
        synchronized (this.k) {
        }
    }

    public final void g(List list) {
        synchronized (this.k) {
            if (!list.isEmpty()) {
                if (gyg.G(3, "CXCP")) {
                    list.toString();
                    toString();
                }
                this.m.removeAll(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    qrm qrmVar = (qrm) it.next();
                    if (this.l.contains(qrmVar)) {
                        qrmVar.y();
                    }
                }
                if (!this.l.removeAll(list)) {
                    this.q.removeAll(list);
                } else if (!b(CollectionsKt.N(this.l, this.m))) {
                    if (this.l.isEmpty()) {
                        this.d.e(false);
                        this.e.a(l08.a);
                    } else {
                        n();
                        this.e.a(CollectionsKt.k0(this.l));
                    }
                    k(this.l);
                    this.q.removeAll(list);
                }
            } else if (gyg.G(5, "CXCP")) {
                toString();
            }
        }
    }

    public final wrm h() {
        a21 a21Var = this.v;
        if (a21Var != null) {
            return (wrm) ((m7h) a21Var.m).get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int i() {
        boolean z;
        synchronized (this.k) {
            tc4 tc4Var = this.b;
            synchronized (tc4Var.b) {
                z = tc4Var.f;
            }
        }
        return z == 2 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.util.LinkedHashSet r34) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysm.j(java.util.LinkedHashSet):boolean");
    }

    public final void k(LinkedHashSet linkedHashSet) {
        f();
        List listK0 = CollectionsKt.k0(linkedHashSet);
        if (listK0.isEmpty()) {
            for (trm trmVar : this.x) {
                trmVar.b(null);
                trmVar.reset();
            }
            return;
        }
        if (!this.o) {
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                ((trm) it.next()).b(null);
            }
        }
        o3a o3aVar = new o3a(this.f);
        synchronized (this.k) {
        }
        w3j w3jVar = new w3j(listK0, this.p);
        kd4 kd4Var = this.j;
        qfl qflVar = this.u;
        synchronized (this.k) {
        }
        srm srmVar = new srm(qflVar, o3aVar, w3jVar, z4c.b(new uef(w3jVar, kd4Var, o3aVar, (byte) 7)));
        if (!this.o) {
            tc4 tc4Var = this.b;
            ud4 ud4Var = (ud4) this.h.get();
            synchronized (tc4Var.b) {
                if (tc4Var.g) {
                    ArrayList arrayList = tc4Var.e;
                    ge4 ge4Var = (ge4) qyn.n0(ud4Var, uqh.a(ge4.class));
                    String str = ge4Var != null ? ((ma4) ge4Var).a : null;
                    sd4 sd4Var = str != null ? new sd4(str) : null;
                    if (sd4Var == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.add(sd4Var.a);
                    synchronized (tc4Var.b) {
                        tc4Var.d.getClass();
                    }
                }
            }
            return;
        }
        c37 c37Var = this.c;
        this.v = new a21((da6) c37Var.a, (fa6) c37Var.b, srmVar);
        wrm wrmVarH = h();
        if (wrmVarH == null) {
            qp2.n("Required value was null.");
            return;
        }
        na2.B(wrmVarH.b.f, null, null, new u6k((mt5) null, wrmVarH), 3);
        Iterator it2 = this.x.iterator();
        while (it2.hasNext()) {
            ((trm) it2.next()).b(wrmVarH.c);
        }
        na2.B(wrmVarH.b.f, null, null, new vrm(null, wrmVarH, this.n), 3);
        m(CollectionsKt.N(this.l, this.m));
        if (gyg.G(3, "CXCP")) {
            Objects.toString(this.q);
        }
        Iterator it3 = this.q.iterator();
        while (it3.hasNext()) {
            ((qrm) it3.next()).u();
        }
        this.q.clear();
    }

    public final void l() {
        if (this.l.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSetN = CollectionsKt.N(this.l, this.m);
        if (((Boolean) this.i.a.b(yg4.l, Boolean.TRUE)).booleanValue() && !this.l.contains(this.r) && j(linkedHashSetN)) {
            c();
            return;
        }
        if (!linkedHashSetN.contains(this.r) || j(linkedHashSetN)) {
            m(linkedHashSetN);
            return;
        }
        jyd jydVar = this.r;
        synchronized (this.k) {
            if (this.m.remove(jydVar)) {
                l();
            }
        }
        g(Collections.singletonList(jydVar));
        jydVar.F((zd4) this.g.get());
    }

    public final void m(LinkedHashSet linkedHashSet) {
        wrm wrmVarH = h();
        if (wrmVarH != null) {
            wrmVarH.c.d(linkedHashSet, this.p);
            for (trm trmVar : this.x) {
                if (trmVar instanceof xsm) {
                    ((xsm) trmVar).a(linkedHashSet);
                }
            }
        }
    }

    public final void n() {
        boolean z = false;
        LinkedHashSet linkedHashSet = this.l;
        if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Boolean) ((qrm) it.next()).h.b(qsm.Qp, Boolean.FALSE)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        this.d.e(z);
    }

    public final String toString() {
        return "UseCaseManager<" + this.j + '>';
    }
}
