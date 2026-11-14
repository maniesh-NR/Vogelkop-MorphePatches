package defpackage;

/* loaded from: classes.dex */
public final class pkd {
    public final jrd a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public pkd(jrd jrdVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        z4o.w(!z5 || z3);
        z4o.w(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        z4o.w(z6);
        this.a = jrdVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final pkd a(long j) {
        if (j == this.c) {
            return this;
        }
        return new pkd(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final pkd b(long j) {
        if (j == this.b) {
            return this;
        }
        return new pkd(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pkd.class != obj.getClass()) {
            return false;
        }
        pkd pkdVar = (pkd) obj;
        return this.b == pkdVar.b && this.c == pkdVar.c && this.d == pkdVar.d && this.e == pkdVar.e && this.f == pkdVar.f && this.g == pkdVar.g && this.h == pkdVar.h && this.i == pkdVar.i && this.j == pkdVar.j && this.a.equals(pkdVar.a);
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
