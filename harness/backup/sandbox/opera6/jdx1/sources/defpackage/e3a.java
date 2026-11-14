package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e3a {
    public final ld4 a;
    public final fd4 b;
    public final d3a c;
    public final List d;
    public final nak e;

    public e3a(hnl hnlVar, ld4 ld4Var, fd4 fd4Var, djc djcVar, List list, hb4 hb4Var) {
        this.a = ld4Var;
        this.b = fd4Var;
        this.d = fd4Var.k;
        u9d u9dVar = fd4Var.i;
        Map map = fd4Var.l;
        kxd kxdVar = re4.c;
        Object obj = u9dVar.get(kxdVar);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.a(obj, bool) || Intrinsics.a(map.get(kxdVar), bool)) {
            Objects.toString(kxdVar);
        }
        hd4 hd4Var = fd4Var.n;
        hb4Var.b.getClass();
        sa2 sa2Var = hd4Var.b;
        Set set = (Set) hb4.c.get(Build.MANUFACTURER);
        int i = (set == null || !set.contains(Build.DEVICE) || Build.VERSION.SDK_INT >= 34) ? 0 : 10;
        sa2Var.getClass();
        id4[] id4VarArr = id4.a;
        int iMax = Math.max(i, sa2Var.b);
        ji4 ji4Var = iMax != 0 ? new ji4(iMax) : null;
        d3a d3aVar = new d3a(ld4Var, u9dVar, map, CollectionsKt.V(j95.i(ji4Var), list), e82.p(new Object[]{djcVar, ji4Var}), hnlVar.a, hnlVar.h);
        this.c = d3aVar;
        if (ji4Var != null) {
            if (ji4Var.c != null) {
                qp2.n("GraphLoop has already been set!");
                throw null;
            }
            ji4Var.c = d3aVar;
            d3aVar.s(false);
            d3aVar.toString();
        }
        this.e = z4o.f(k3a.b);
    }

    public final void a(i3a i3aVar) {
        nak nakVar;
        Object value;
        n3a n3aVar;
        toString();
        Objects.toString(i3aVar);
        do {
            nakVar = this.e;
            value = nakVar.getValue();
            n3aVar = (n3a) value;
        } while (!nakVar.h(value, ((n3aVar instanceof l3a) || (n3aVar instanceof k3a)) ? k3a.b : i3aVar));
        for (o3a o3aVar : this.d) {
            mf4 mf4Var = o3aVar.a;
            nd4 nd4Var = o3aVar.b;
            if (nd4Var == null) {
                nd4Var = null;
            }
            mf4Var.b(nd4Var, i3aVar);
        }
    }

    public final void b() {
        toString();
        nak nakVar = this.e;
        k3a k3aVar = k3a.b;
        nakVar.k((Object) null, k3aVar);
        this.c.t(null);
        for (o3a o3aVar : this.d) {
            mf4 mf4Var = o3aVar.a;
            nd4 nd4Var = o3aVar.b;
            if (nd4Var == null) {
                nd4Var = null;
            }
            mf4Var.b(nd4Var, k3aVar);
        }
    }

    public final void c(lvh lvhVar) {
        d3a d3aVar = this.c;
        synchronized (d3aVar.h) {
            lvh lvhVar2 = d3aVar.k;
            d3aVar.k = lvhVar;
            if (lvhVar2 != null || lvhVar != null) {
                x79 x79Var = d3aVar.g;
                if (lvhVar != null) {
                    x79Var.b0(new v2a(lvhVar));
                } else {
                    x79Var.b0(r2a.d);
                }
            }
        }
        if (lvhVar == null) {
            int size = d3aVar.d.size();
            for (int i = 0; i < size; i++) {
                ((z2a) d3aVar.d.get(i)).a();
            }
        }
    }

    public final boolean d(Map map) {
        d3a d3aVar = this.c;
        if (d3aVar.l() != null) {
            return d3aVar.g.b0(new x2a(map));
        }
        qp2.n("Cannot submit parameters without an active repeating request!");
        return false;
    }

    public final void e(LinkedHashMap linkedHashMap) {
        d3a d3aVar = this.c;
        synchronized (d3aVar.h) {
            d3aVar.m = linkedHashMap;
            d3aVar.g.b0(new u2a(d3aVar.l, linkedHashMap));
        }
    }

    public final String toString() {
        return "GraphProcessor(cameraGraph: " + this.a + ')';
    }
}
