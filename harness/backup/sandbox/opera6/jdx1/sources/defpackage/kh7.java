package defpackage;

/* loaded from: classes.dex */
public final class kh7 {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kh7) {
            return this.a == ((kh7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        return j != 9205357640488583168L ? sko.k(gh7.c(b(j)), " x ", gh7.c(a(j))) : "DpSize.Unspecified";
    }
}
