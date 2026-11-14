package defpackage;

/* loaded from: classes.dex */
public final class rsi {
    public final boolean a;
    public final boolean b;
    public final rxh c;
    public final lxh d;

    public rsi(boolean z, boolean z2, rxh rxhVar, lxh lxhVar) {
        this.a = z;
        this.b = z2;
        this.c = rxhVar;
        this.d = lxhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsi)) {
            return false;
        }
        rsi rsiVar = (rsi) obj;
        return this.a == rsiVar.a && this.b == rsiVar.b && this.c.equals(rsiVar.c) && this.d.equals(rsiVar.d);
    }

    public final int hashCode() {
        return Integer.hashCode(this.d.a) + rfp.c(this.c.a, fki.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "";
    }
}
