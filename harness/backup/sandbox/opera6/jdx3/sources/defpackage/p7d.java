package defpackage;

/* loaded from: classes.dex */
public final class p7d {
    public final byte a;
    public final boolean b;
    public final rxh c;
    public final pxh d;

    /* JADX WARN: Multi-variable type inference failed */
    public p7d(int i, boolean z, rxh rxhVar, pxh pxhVar) {
        this.a = i;
        this.b = z;
        this.c = rxhVar;
        this.d = pxhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7d)) {
            return false;
        }
        p7d p7dVar = (p7d) obj;
        return this.a == p7dVar.a && this.b == p7dVar.b && this.c.equals(p7dVar.c) && this.d.equals(p7dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rfp.c(this.c.a, fki.k(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "";
    }
}
