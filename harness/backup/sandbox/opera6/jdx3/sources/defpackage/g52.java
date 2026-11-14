package defpackage;

/* loaded from: classes.dex */
public final class g52 {
    public final boolean a;
    public final boolean b;
    public final int c;

    public g52(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g52)) {
            return false;
        }
        g52 g52Var = (g52) obj;
        return this.a == g52Var.a && this.b == g52Var.b && this.c == g52Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fki.k(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
