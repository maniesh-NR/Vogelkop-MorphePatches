package defpackage;

/* loaded from: classes.dex */
public final class ap3 {
    public final zo3 a;
    public final boolean b;
    public final boolean c;

    public ap3(zo3 zo3Var, boolean z, boolean z2) {
        this.a = zo3Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap3)) {
            return false;
        }
        ap3 ap3Var = (ap3) obj;
        return this.a.equals(ap3Var.a) && this.b == ap3Var.b && this.c == ap3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fki.k(Integer.hashCode(this.a.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
