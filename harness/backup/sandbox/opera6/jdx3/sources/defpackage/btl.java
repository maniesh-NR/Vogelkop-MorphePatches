package defpackage;

/* loaded from: classes.dex */
public final class btl {
    public final b7j a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final op0 e;

    public btl(b7j b7jVar, boolean z, boolean z2, boolean z3, op0 op0Var) {
        this.a = b7jVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = op0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof btl) {
            btl btlVar = (btl) obj;
            return this.a == btlVar.a && this.b == btlVar.b && this.c == btlVar.c && this.d == btlVar.d && this.e == btlVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + fki.k(fki.k(fki.k(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "";
    }
}
