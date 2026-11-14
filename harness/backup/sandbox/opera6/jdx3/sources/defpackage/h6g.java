package defpackage;

/* loaded from: classes.dex */
public final class h6g {
    public final jji a;
    public final boolean b;
    public final ns2 c;
    public final ryc d;
    public final lxk e;
    public final int f;
    public final boolean g;
    public final boolean h;

    public h6g(jji jjiVar, boolean z, ns2 ns2Var, ryc rycVar, lxk lxkVar, int i, boolean z2, boolean z3) {
        this.a = jjiVar;
        this.b = z;
        this.c = ns2Var;
        this.d = rycVar;
        this.e = lxkVar;
        this.f = i;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6g)) {
            return false;
        }
        h6g h6gVar = (h6g) obj;
        return this.a == h6gVar.a && this.b == h6gVar.b && this.c.equals(h6gVar.c) && this.d.equals(h6gVar.d) && this.e.equals(h6gVar.e) && this.f == h6gVar.f && this.g == h6gVar.g && this.h == h6gVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + fki.k(rfp.c(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + fki.k(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31), 31, this.g);
    }

    public final String toString() {
        return "";
    }
}
