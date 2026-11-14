package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class eo9 implements AutoCloseable, ivh {
    public final xfk a;
    public final do9 b;
    public final euf c = new euf(n65.c, huf.b);
    public final LinkedHashMap d;
    public final Set e;

    public eo9(xfk xfkVar, do9 do9Var, boolean z) {
        this.a = xfkVar;
        this.b = do9Var;
        u9d u9dVar = xfkVar.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(qbd.a(u9dVar.i));
        Iterator it = u9dVar.entrySet().iterator();
        if (!it.hasNext()) {
            this.d = linkedHashMap;
            Set setKeySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList(k95.o(setKeySet, 10));
            Iterator it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                cg4 cg4VarH = this.a.h(((yfk) it2.next()).a);
                if (cg4VarH == null) {
                    qp2.n("Required value was null.");
                    throw null;
                }
                arrayList.add(cg4VarH);
            }
            this.e = CollectionsKt.n0(arrayList);
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        int i = ((yfk) entry.getKey()).a;
        sya syaVar = (sya) entry.getValue();
        cg4 cg4VarH2 = this.a.h(i);
        if (cg4VarH2 == null) {
            qp2.n("Required value was null.");
            throw null;
        }
        bg4 bg4VarK = this.a.k(i);
        bg4VarK.getClass();
        List list = bg4VarK.a;
        int i2 = Build.VERSION.SDK_INT;
        if (z) {
            if (i2 < 33) {
                throw null;
            }
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                throw null;
            }
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ((ruf) it3.next()).getClass();
            }
            throw null;
        }
        if (i2 >= 33) {
            List list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    ((ruf) it4.next()).getClass();
                }
            }
        }
        huf hufVar = huf.b;
        u9d u9dVar2 = new u9d();
        ArrayList arrayList2 = cg4VarH2.b;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            u9dVar2.put(new fuf(((wfk) obj).a), new euf(n65.b, hufVar));
        }
        u9dVar2.g();
        syaVar.getClass();
        throw null;
    }

    @Override // defpackage.ivh
    public final void D(owh owhVar, long j, w61 w61Var) throws Exception {
        this.c.k(j, w61Var);
    }

    @Override // defpackage.ivh
    public final void E(lvh lvhVar) {
        this.b.h();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
        this.c.close();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Map) it.next()).values().iterator();
            while (it2.hasNext()) {
                ((euf) it2.next()).close();
            }
        }
    }

    @Override // defpackage.ivh
    public final void h(owh owhVar, long j, int i, int i2) {
        Map map = (Map) this.d.get(new yfk(i));
        if (map != null) {
            if (this.a.k(i) == null) {
                qp2.n("Required value was null.");
            } else {
                if (!map.containsKey(new fuf(i2))) {
                    qp2.n("Check failed.");
                    return;
                }
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((euf) it.next()).h(j);
                }
            }
        }
    }

    @Override // defpackage.ivh
    public final void r(owh owhVar, long j, long j2) throws Exception {
        lo9 lo9Var = new lo9(owhVar, j, j2, this.e);
        this.c.l(j, j2, j, lo9Var.d);
        ehc ehcVar = lo9Var.e;
        int iD = ehcVar.d();
        for (int i = 0; i < iD; i++) {
            jo9 jo9Var = (jo9) ehcVar.get(i);
            Object obj = this.d.get(new yfk(jo9Var.o));
            if (obj == null) {
                qp2.n("Required value was null.");
                return;
            }
            Object obj2 = ((Map) obj).get(new fuf(jo9Var.p));
            if (obj2 == null) {
                qp2.n("Required value was null.");
                return;
            }
            euf eufVar = (euf) obj2;
            eufVar.l(j, j2, j2, jo9Var);
            if (!owhVar.K().keySet().contains(new yfk(jo9Var.o))) {
                eufVar.h(lo9Var.a);
            }
        }
        fo9 fo9Var = new fo9(lo9Var);
        if (!owhVar.Q()) {
            this.b.h();
        }
        fo9Var.h();
    }

    @Override // defpackage.ivh
    public final void t(owh owhVar, long j, hwh hwhVar) throws Exception {
        this.c.k(j, new ouf(10));
        if (hwhVar.m()) {
            return;
        }
        for (yfk yfkVar : owhVar.K().keySet()) {
            int i = yfkVar.a;
            Map map = (Map) this.d.get(yfkVar);
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((euf) it.next()).h(j);
                }
            }
        }
    }
}
