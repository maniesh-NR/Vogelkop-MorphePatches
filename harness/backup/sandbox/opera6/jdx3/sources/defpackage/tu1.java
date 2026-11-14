package defpackage;

/* loaded from: classes.dex */
public final class tu1 {
    public final fll a;
    public final pxe b;
    public final boolean c;
    public final p37 d;
    public final boolean e;
    public final ns1 f;

    public tu1(fll fllVar, pxe pxeVar, boolean z, p37 p37Var, boolean z2, ns1 ns1Var) {
        this.a = fllVar;
        this.b = pxeVar;
        this.c = z;
        this.d = p37Var;
        this.e = z2;
        this.f = ns1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu1)) {
            return false;
        }
        tu1 tu1Var = (tu1) obj;
        return this.a.equals(tu1Var.a) && this.b.equals(tu1Var.b) && this.c == tu1Var.c && this.d.equals(tu1Var.d) && this.e == tu1Var.e && this.f.equals(tu1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + fki.k((this.d.hashCode() + fki.k((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        return "";
    }
}
