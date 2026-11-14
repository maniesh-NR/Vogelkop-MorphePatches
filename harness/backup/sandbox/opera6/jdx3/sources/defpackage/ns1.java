package defpackage;

/* loaded from: classes.dex */
public final class ns1 {
    public final boolean a;
    public final rxh b;

    public ns1(boolean z, rxh rxhVar) {
        this.a = z;
        this.b = rxhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns1)) {
            return false;
        }
        ns1 ns1Var = (ns1) obj;
        return this.a == ns1Var.a && this.b.equals(ns1Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
