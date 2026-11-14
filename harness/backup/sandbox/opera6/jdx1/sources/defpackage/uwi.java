package defpackage;

/* loaded from: classes.dex */
public final class uwi {
    public static final uwi c;
    public static final uwi d;
    public final long a;
    public final long b;

    static {
        uwi uwiVar = new uwi(0L, 0L);
        new uwi(Long.MAX_VALUE, Long.MAX_VALUE);
        c = new uwi(Long.MAX_VALUE, 0L);
        new uwi(0L, Long.MAX_VALUE);
        d = uwiVar;
    }

    public uwi(long j, long j2) {
        z4o.w(j >= 0);
        z4o.w(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        String str = tym.a;
        long j6 = j - j4;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j7 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j7 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j7 = Long.MIN_VALUE;
        }
        long jA = tym.a(j, j5);
        boolean z = j7 <= j2 && j2 <= jA;
        boolean z2 = j7 <= j3 && j3 <= jA;
        if (z) {
            if (!z2 || Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
        } else if (!z2) {
            return j7;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uwi.class == obj.getClass()) {
            uwi uwiVar = (uwi) obj;
            if (this.a == uwiVar.a && this.b == uwiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
