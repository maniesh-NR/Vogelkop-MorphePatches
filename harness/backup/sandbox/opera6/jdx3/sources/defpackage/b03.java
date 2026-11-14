package defpackage;

/* loaded from: classes.dex */
public final class b03 {
    public final int a;
    public final int b;
    public final int c;

    public b03(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b03)) {
            return false;
        }
        b03 b03Var = (b03) obj;
        return this.a == b03Var.a && this.b == b03Var.b && this.c == b03Var.c;
    }

    public final int hashCode() {
        return rfp.c(this.c, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
