package defpackage;

/* loaded from: classes.dex */
public final class yc6 {
    public final boolean a;
    public final long b;
    public final int c;
    public final int d;

    public yc6(int i, int i2, long j, boolean z) {
        this.a = z;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc6)) {
            return false;
        }
        yc6 yc6Var = (yc6) obj;
        return this.a == yc6Var.a && this.b == yc6Var.b && this.c == yc6Var.c && this.d == yc6Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rfp.c(this.c, z1m.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "";
    }
}
