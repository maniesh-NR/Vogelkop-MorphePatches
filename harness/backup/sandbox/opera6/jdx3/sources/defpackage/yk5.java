package defpackage;

/* loaded from: classes.dex */
public final class yk5 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public yk5(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk5)) {
            return false;
        }
        yk5 yk5Var = (yk5) obj;
        return this.a == yk5Var.a && this.b == yk5Var.b && this.c == yk5Var.c && this.d == yk5Var.d && this.e == yk5Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + fki.k(fki.k(fki.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "";
    }
}
