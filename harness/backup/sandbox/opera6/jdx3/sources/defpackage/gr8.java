package defpackage;

/* loaded from: classes.dex */
public final class gr8 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gr8(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr8)) {
            return false;
        }
        gr8 gr8Var = (gr8) obj;
        return this.a == gr8Var.a && this.b == gr8Var.b && this.c == gr8Var.c && this.d == gr8Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rfp.c(this.c, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
