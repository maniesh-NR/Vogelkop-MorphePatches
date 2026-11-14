package defpackage;

/* loaded from: classes.dex */
public final class qs1 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public qs1(int i, int i2, boolean z, boolean z2, long j) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs1)) {
            return false;
        }
        qs1 qs1Var = (qs1) obj;
        return this.a == qs1Var.a && this.b == qs1Var.b && this.c == qs1Var.c && this.d == qs1Var.d && this.e == qs1Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + fki.k(fki.k(rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "";
    }
}
