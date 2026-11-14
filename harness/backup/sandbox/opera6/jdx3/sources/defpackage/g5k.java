package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class g5k extends k8 {
    public final k5k o;
    public final xnh p;
    public final s9i q;

    public g5k(k5k k5kVar, xnh xnhVar, x5f x5fVar, s9i s9iVar, boolean z) {
        super(x5fVar, z ? new f5k(k5kVar) : null);
        this.o = k5kVar;
        this.p = xnhVar;
        this.q = s9iVar;
    }

    @Override // defpackage.k8
    public final boolean Y(mq mqVar) {
        return ((Set) this.q.d).contains(mqVar);
    }

    @Override // defpackage.k8
    public final void d0(mq mqVar) {
        if (s0(mqVar) || !mqVar.i(lq.a)) {
            return;
        }
        boolean z = false;
        boolean zG = mqVar.g(true, false);
        k5k k5kVar = this.o;
        if (zG) {
            k5kVar.f(mqVar);
            if (mqVar.j()) {
                return;
            } else {
                z = true;
            }
        }
        if (!((wnh) this.p.i()).a(16)) {
            if (!z) {
                return;
            }
            if (!k5kVar.h) {
                mqVar.g.t(mqVar.c);
                return;
            }
        }
        for (j5k j5kVar : k5kVar.c.values()) {
            ArrayDeque arrayDeque = j5kVar.b;
            if (j5kVar.a.contains(mqVar)) {
                if (arrayDeque.contains(mqVar)) {
                    return;
                }
                arrayDeque.add(mqVar);
                List list = mqVar.f;
                h5k h5kVar = j5kVar.e.b;
                i5k i5kVar = new i5k(j5kVar, list);
                HashMap map = (HashMap) h5kVar.b;
                boolean z2 = h5kVar.a;
                String str = i5kVar.a;
                if (!z2 && ((HashSet) h5kVar.c).add(str)) {
                    h5kVar.i(i5kVar);
                    return;
                }
                ArrayList arrayList = (ArrayList) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    map.put(str, arrayList);
                }
                arrayList.add(i5kVar);
                return;
            }
        }
    }

    @Override // defpackage.k8
    public final void f0(mq mqVar) {
        if (((wnh) this.p.i()).a(16)) {
            Iterator it = this.o.c.values().iterator();
            while (it.hasNext()) {
                ((j5k) it.next()).b.remove(mqVar);
            }
        }
    }

    @Override // defpackage.k8
    public final void g0(mq mqVar) {
        super.g0(mqVar);
        ((Set) this.q.d).remove(mqVar);
    }

    @Override // defpackage.k8
    public final void p0(mq mqVar) {
        if (s0(mqVar)) {
            return;
        }
        boolean zI = mqVar.i(lq.a);
        k5k k5kVar = this.o;
        if ((!zI || ((wnh) this.p.i()).a(16) || k5kVar.h) && mqVar.g(true, false)) {
            k5kVar.f(mqVar);
        }
    }

    public final boolean s0(mq mqVar) {
        o1 o1Var;
        s9i s9iVar = this.q;
        il ilVar = (il) s9iVar.e;
        if (ilVar == null) {
            ilVar = ((cy) ((vzk) s9iVar.c).a).c().h;
            s9iVar.e = ilVar;
        }
        if (ilVar == null || (o1Var = ilVar.f) == null || !o1Var.b.equals(mqVar.c.c)) {
            return false;
        }
        i16 i16Var = (i16) s9iVar.b;
        o1 o1Var2 = ((il) s9iVar.e).f;
        boolean zA = i16Var.A(o1Var2.c, o1Var2.d);
        Set set = (Set) s9iVar.d;
        if (zA) {
            set.remove(mqVar);
            return false;
        }
        set.add(mqVar);
        if (mqVar instanceof no) {
            no noVar = (no) mqVar;
            if (noVar.n) {
                noVar.q = true;
            }
        }
        return true;
    }
}
