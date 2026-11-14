package defpackage;

/* loaded from: classes.dex */
public final class bw0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public bw0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw0)) {
            return false;
        }
        bw0 bw0Var = (bw0) obj;
        return this.a == bw0Var.a && this.b == bw0Var.b && this.c == bw0Var.c && this.d == bw0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rfp.c(this.c, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
