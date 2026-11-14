package defpackage;

/* loaded from: classes.dex */
public final class spl implements sc5 {
    public final long a;

    public /* synthetic */ spl(long j) {
        this.a = j;
    }

    public static long b(long j) {
        f9e.a.getClass();
        return ((j - 1) | 1) == Long.MAX_VALUE ? pn7.r(z4o.e0(j)) : z4o.w0(f9e.b(), j, un7.b);
    }

    public static long c(long j, sc5 sc5Var) {
        if (sc5Var instanceof spl) {
            long j2 = ((spl) sc5Var).a;
            f9e.a.getClass();
            return z4o.x0(j, j2, un7.b);
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + sc5Var);
    }

    public final long D(sc5 sc5Var) {
        return c(this.a, sc5Var);
    }

    public final long a() {
        return b(this.a);
    }

    public final /* bridge */ int compareTo(Object obj) {
        return qbe.p(this, (sc5) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof spl) {
            return this.a == ((spl) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final sc5 r0(long j) {
        f9e.a.getClass();
        return new spl(z4o.v0(this.a, j, un7.b));
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ')';
    }

    public final /* bridge */ int z0(sc5 sc5Var) {
        return qbe.p(this, sc5Var);
    }
}
