package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d3a implements Closeable {
    public final ld4 a;
    public final u9d b;
    public final Map c;
    public final List d;
    public final nx5 e;
    public final a64 f;
    public final x79 g;
    public final Object h;
    public volatile boolean i;
    public pyl j;
    public lvh k;
    public final Map l;
    public Map m;
    public final af2 n;
    public lvh o;
    public Map p;
    public Map q;
    public Map r;
    public final List s;
    public pyl t;

    public d3a(ld4 ld4Var, u9d u9dVar, Map map, ArrayList arrayList, List list, nx5 nx5Var, dx5 dx5Var) {
        this.a = ld4Var;
        this.b = u9dVar;
        this.c = map;
        this.d = list;
        this.e = nx5Var;
        a64 a64VarB = sgb.b(e.a(dx5Var, new jx5("CXCP-GraphLoop")));
        this.f = a64VarB;
        ci7 ci7Var = new ci7(1, this, d3a.class, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", 0, (byte) 6);
        s2 s2Var = new s2(2, this, d3a.class, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 11);
        x79 x79Var = new x79();
        x79Var.a = ci7Var;
        x79Var.b = s2Var;
        x79Var.c = c26.i(false);
        x79Var.d = xf8.h(Integer.MAX_VALUE, null, new rmg(x79Var, (byte) 3), 2);
        x79Var.e = new i72();
        if (!((af2) x79Var.c).a()) {
            qp2.n("ProcessingQueue cannot be re-started!");
            throw null;
        }
        if (na2.B(a64VarB, null, null, new agb((byte) 15, (mt5) null, x79Var), 3).isCancelled()) {
            x79Var.S((Throwable) null);
        }
        this.g = x79Var;
        this.h = new Object();
        n08 n08Var = n08.a;
        this.l = n08Var;
        this.m = n08Var;
        this.n = c26.i(true);
        this.p = n08Var;
        this.q = n08Var;
        this.r = map;
        this.s = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            if (this.i) {
                return;
            }
            this.i = true;
            pyl pylVar = this.j;
            if (pylVar != null) {
                na2.B(this.e, null, null, new a3a(pylVar, null, (byte) 0), 3);
            }
            this.j = null;
            this.g.b0(r2a.c);
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                ((z2a) this.d.get(i)).c();
            }
        }
    }

    public final void h(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lvh lvhVar = (lvh) arrayList.get(i);
            List list = this.s;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((ivh) list.get(i2)).E(lvhVar);
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            lvh lvhVar2 = (lvh) arrayList.get(i3);
            int size4 = lvhVar2.d.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((ivh) lvhVar2.d.get(i4)).E(lvhVar2);
            }
        }
    }

    public final boolean k(boolean z, List list, Map map) {
        Map mapG;
        pyl pylVar = this.t;
        if (pylVar == null) {
            return false;
        }
        Map map2 = this.p;
        if (map.isEmpty()) {
            mapG = this.r;
        } else {
            u9d u9dVar = new u9d();
            u9dVar.putAll(this.q);
            u9dVar.putAll(map);
            u9dVar.putAll(this.c);
            mapG = u9dVar.g();
        }
        Map map3 = mapG;
        boolean zW = pylVar.w(z, list, this.b, map2, map3, this.s);
        if (!zW) {
            if (z) {
                Objects.toString(CollectionsKt.Z(list));
                return zW;
            }
            if (map.isEmpty()) {
                Objects.toString(list);
                return zW;
            }
            Objects.toString(CollectionsKt.Z(list));
            map.toString();
        }
        return zW;
    }

    public final lvh l() {
        lvh lvhVar;
        synchronized (this.h) {
            lvhVar = this.k;
        }
        return lvhVar;
    }

    public final void m(List list, int i, s2a s2aVar, boolean z) {
        if (this.n.b() && k(false, s2aVar.a, n08.a)) {
            list.remove(i);
            return;
        }
        if (!z || i <= 0) {
            return;
        }
        int i2 = i - 1;
        if (((y2a) list.get(i2)) instanceof v2a) {
            n(i2, list, false);
        } else {
            qp2.n("Check failed.");
        }
    }

    public final void n(int i, List list, boolean z) {
        int i2;
        int i3 = i;
        while (true) {
            int i4 = 0;
            if (-1 >= i3) {
                if (!z || (i2 = i + 1) >= list.size()) {
                    return;
                }
                y2a y2aVar = (y2a) list.get(i2);
                if (y2aVar instanceof s2a) {
                    m(list, i2, (s2a) y2aVar, false);
                    return;
                } else {
                    if (y2aVar instanceof x2a) {
                        q(list, i2, (x2a) y2aVar);
                        return;
                    }
                    return;
                }
            }
            y2a y2aVar2 = (y2a) list.get(i3);
            if (y2aVar2 instanceof v2a) {
                lvh lvhVar = ((v2a) y2aVar2).a;
                if (k(true, Collections.singletonList(lvhVar), n08.a)) {
                    this.o = lvhVar;
                    list.remove(i3);
                    while (i4 < i3) {
                        if (((y2a) list.get(i4)) instanceof v2a) {
                            list.remove(i4);
                            i3--;
                        } else {
                            i4++;
                        }
                    }
                    return;
                }
            }
            i3--;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00cb -> B:35:0x00eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e9 -> B:34:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00f8 -> B:37:0x00f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.util.List r18, int r19, defpackage.w2a r20, mt5 r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3a.o(java.util.List, int, w2a, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r13.v() != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00de, code lost:
    
        if (r13.v() == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a4 -> B:46:0x00e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00cb -> B:45:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00de -> B:45:0x00e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.util.List r12, mt5 r13) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3a.p(java.util.List, mt5):java.lang.Object");
    }

    public final void q(List list, int i, x2a x2aVar) {
        lvh lvhVar = this.o;
        if (lvhVar == null && i == 0) {
            list.remove(i);
            return;
        }
        if (this.n.b() && lvhVar != null && k(false, Collections.singletonList(lvhVar), x2aVar.a)) {
            list.remove(i);
            return;
        }
        if (i > 0) {
            int i2 = i - 1;
            if (((y2a) list.get(i2)) instanceof v2a) {
                n(i2, list, false);
            } else {
                qp2.n("Check failed.");
            }
        }
    }

    public final boolean r() {
        Boolean boolValueOf;
        pyl pylVar = this.t;
        if (pylVar == null) {
            return false;
        }
        lvh lvhVar = this.o;
        if (lvhVar != null) {
            boolValueOf = Boolean.valueOf(pylVar.w(true, Collections.singletonList(lvhVar), this.b, this.p, this.r, this.s));
        } else {
            boolValueOf = null;
        }
        return Intrinsics.a(boolValueOf, Boolean.TRUE);
    }

    public final void s(boolean z) {
        this.n.a = z ? 1 : 0;
        if (z) {
            this.g.b0(r2a.b);
        }
    }

    public final void t(pyl pylVar) {
        synchronized (this.h) {
            pyl pylVar2 = this.j;
            this.j = pylVar;
            if (this.i) {
                this.j = null;
                if (pylVar != null) {
                    na2.B(this.e, null, null, new a3a(pylVar, null, (byte) 1), 3);
                }
                return;
            }
            if (pylVar2 != pylVar) {
                this.g.b0(new w2a(pylVar2, pylVar));
            }
            if (pylVar == null) {
                int size = this.d.size();
                for (int i = 0; i < size; i++) {
                    ((z2a) this.d.get(i)).b();
                }
            }
        }
    }

    public final String toString() {
        return "GraphLoop(" + this.a + ')';
    }
}
