package defpackage;

/* loaded from: classes.dex */
public final class rkl {
    public static final skl[] b = {new skl(0), new skl(4294967296L), new skl(8589934592L)};
    public static final long c = rih.s(0, Float.NaN);
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long jB = b(j);
        if (skl.a(jB, 0L)) {
            return "Unspecified";
        }
        if (skl.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!skl.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rkl) {
            return this.a == ((rkl) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
