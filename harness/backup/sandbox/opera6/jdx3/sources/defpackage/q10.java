package defpackage;

/* loaded from: classes.dex */
public final class q10 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public q10(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q10)) {
            return false;
        }
        q10 q10Var = (q10) obj;
        return this.a == q10Var.a && this.b == q10Var.b && this.c == q10Var.c && this.d == q10Var.d && this.e == q10Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + rfp.c(this.d, rfp.c(this.c, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
