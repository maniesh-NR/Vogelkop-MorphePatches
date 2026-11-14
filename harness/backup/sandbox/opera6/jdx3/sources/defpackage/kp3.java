package defpackage;

/* loaded from: classes.dex */
public final class kp3 {
    public final no3 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public kp3(no3 no3Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = no3Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp3)) {
            return false;
        }
        kp3 kp3Var = (kp3) obj;
        return this.a.equals(kp3Var.a) && this.b == kp3Var.b && this.c == kp3Var.c && this.d == kp3Var.d && this.e == kp3Var.e && this.f == kp3Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + fki.k(fki.k(fki.k(fki.k(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "";
    }
}
