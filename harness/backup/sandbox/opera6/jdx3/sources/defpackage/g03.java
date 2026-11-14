package defpackage;

/* loaded from: classes.dex */
public final class g03 {
    public final int a;
    public final int b;

    public g03(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g03)) {
            return false;
        }
        g03 g03Var = (g03) obj;
        return this.a == g03Var.a && this.b == g03Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
