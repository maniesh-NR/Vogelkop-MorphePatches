package defpackage;

/* loaded from: classes.dex */
public final class nc2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final qxh f;

    public nc2(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, qxh qxhVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = qxhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc2)) {
            return false;
        }
        nc2 nc2Var = (nc2) obj;
        return this.a == nc2Var.a && this.b == nc2Var.b && this.c == nc2Var.c && this.d == nc2Var.d && this.e == nc2Var.e && this.f.equals(nc2Var.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + ((((((Boolean.hashCode(this.e) + fki.k(fki.k(fki.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31) + 1237) * 31) + 1237) * 31);
    }

    public final String toString() {
        return "";
    }
}
