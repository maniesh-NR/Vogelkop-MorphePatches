package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class efa extends jfa {
    public final byte d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final vl7 q;
    public final h1b r;
    public final h1b s;
    public final l1b t;
    public final long u;
    public final dfa v;
    public final h1b w;

    /* JADX WARN: Multi-variable type inference failed */
    public efa(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, vl7 vl7Var, List list2, List list3, dfa dfaVar, Map map, List list4) {
        long j6;
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = vl7Var;
        this.r = h1b.s(list2);
        this.s = h1b.s(list3);
        this.t = l1b.h(map);
        this.w = h1b.s(list4);
        if (!list3.isEmpty()) {
            zea zeaVar = (zea) sfe.c0(list3);
            j6 = zeaVar.e + zeaVar.c;
            this.u = j6;
        } else if (list2.isEmpty()) {
            this.u = 0L;
            j6 = 0;
        } else {
            bfa bfaVar = (bfa) sfe.c0(list2);
            j6 = bfaVar.e + bfaVar.c;
            this.u = j6;
        }
        this.e = j != -9223372036854775807L ? j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j) : -9223372036854775807L;
        this.f = j >= 0;
        this.v = dfaVar;
    }

    @Override // defpackage.t39
    public final Object copy(List list) {
        return this;
    }
}
