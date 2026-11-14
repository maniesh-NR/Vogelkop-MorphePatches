package defpackage;

/* loaded from: classes.dex */
public final class nxj extends n6h {
    public final kxj a;
    public final int b;
    public final int c;
    public final int d;
    public final sxj e;
    public final cyj f;

    public nxj(kxj kxjVar, int i, int i2, int i3, sxj sxjVar, cyj cyjVar) {
        this.a = kxjVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = sxjVar;
        this.f = cyjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxj)) {
            return false;
        }
        nxj nxjVar = (nxj) obj;
        return this.a.equals(nxjVar.a) && this.b == nxjVar.b && this.c == nxjVar.c && this.d == nxjVar.d && this.e.equals(nxjVar.e) && this.f.equals(nxjVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + rfp.c(this.d, rfp.c(this.c, rfp.c(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
