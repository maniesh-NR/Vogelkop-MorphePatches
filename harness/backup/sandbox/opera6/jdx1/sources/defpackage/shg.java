package defpackage;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class shg {
    public static final jrd u = new jrd(new Object());
    public final gql a;
    public final jrd b;
    public final long c;
    public final long d;
    public final int e;
    public final zh8 f;
    public final boolean g;
    public final fyl h;
    public final pyl i;
    public final List j;
    public final jrd k;
    public final boolean l;
    public final int m;
    public final int n;
    public final thg o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public shg(gql gqlVar, jrd jrdVar, long j, long j2, int i, zh8 zh8Var, boolean z, fyl fylVar, pyl pylVar, List list, jrd jrdVar2, boolean z2, int i2, int i3, thg thgVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = gqlVar;
        this.b = jrdVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = zh8Var;
        this.g = z;
        this.h = fylVar;
        this.i = pylVar;
        this.j = list;
        this.k = jrdVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = thgVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static shg k(pyl pylVar) {
        cql cqlVar = gql.a;
        fyl fylVar = fyl.d;
        a1b a1bVar = h1b.b;
        csh cshVar = csh.e;
        thg thgVar = thg.d;
        jrd jrdVar = u;
        return new shg(cqlVar, jrdVar, -9223372036854775807L, 0L, 1, null, false, fylVar, pylVar, cshVar, jrdVar, false, 1, 0, thgVar, 0L, 0L, 0L, 0L, false);
    }

    public final shg a() {
        return new shg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final shg b(boolean z) {
        return new shg(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final shg c(jrd jrdVar) {
        return new shg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, jrdVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final shg d(jrd jrdVar, long j, long j2, long j3, long j4, fyl fylVar, pyl pylVar, List list) {
        return new shg(this.a, jrdVar, j2, j3, this.e, this.f, this.g, fylVar, pylVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final shg e(int i, int i2, boolean z) {
        return new shg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final shg f(zh8 zh8Var) {
        return new shg(this.a, this.b, this.c, this.d, this.e, zh8Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final shg g(thg thgVar) {
        return new shg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, thgVar, this.q, this.r, this.s, this.t, this.p);
    }

    public final shg h(int i) {
        return new shg(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final shg i(boolean z) {
        return new shg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final shg j(gql gqlVar) {
        return new shg(gqlVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return tym.N(tym.c0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
