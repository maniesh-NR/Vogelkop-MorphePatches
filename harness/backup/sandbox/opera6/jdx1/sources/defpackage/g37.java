package defpackage;

/* loaded from: classes.dex */
public final class g37 {
    public static final g37 c = new g37(0, 0);
    public final long a;
    public final long b;

    public g37(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g37) {
            g37 g37Var = (g37) obj;
            return gcb.a(this.a, g37Var.a) && this.b == g37Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
