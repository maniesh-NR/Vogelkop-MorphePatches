package defpackage;

/* loaded from: classes.dex */
public final class tbb {
    public final long a;

    public static long a(int i, int i2) {
        return (i << 32) | (i2 & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tbb) {
            return this.a == ((tbb) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return fki.s(sb, (int) (j & 4294967295L), ')');
    }
}
