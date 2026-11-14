package defpackage;

/* loaded from: classes.dex */
public final class lxj extends n6h {
    public final kxj a;
    public final int b;
    public final int c;
    public final sxj d;
    public final int e;

    public lxj(kxj kxjVar, int i, int i2, sxj sxjVar, int i3) {
        this.a = kxjVar;
        this.b = i;
        this.c = i2;
        this.d = sxjVar;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxj)) {
            return false;
        }
        lxj lxjVar = (lxj) obj;
        return this.a.equals(lxjVar.a) && this.b == lxjVar.b && this.c == lxjVar.c && this.d.equals(lxjVar.d) && this.e == lxjVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + rfp.c(this.c, rfp.c(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
