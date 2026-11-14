package defpackage;

/* loaded from: classes.dex */
public final class y77 {
    public final boolean a;
    public final boolean b;
    public final cwi c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final byte g;

    public y77(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        cwi cwiVar = cwi.a;
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        this.a = z;
        this.b = z2;
        this.c = cwiVar;
        this.d = z3;
        this.e = z4;
        this.f = "";
        this.g = (byte) 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y77)) {
            return false;
        }
        y77 y77Var = (y77) obj;
        return this.a == y77Var.a && this.b == y77Var.b && this.c == y77Var.c && this.d == y77Var.d && this.e == y77Var.e && this.g == y77Var.g;
    }

    public final int hashCode() {
        return (fki.k(fki.k((this.c.hashCode() + fki.k(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }
}
