package defpackage;

/* loaded from: classes.dex */
public final class uli {
    public final lxh a;
    public final rxh b;

    public uli(lxh lxhVar, rxh rxhVar) {
        this.a = lxhVar;
        this.b = rxhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uli)) {
            return false;
        }
        uli uliVar = (uli) obj;
        return this.a.equals(uliVar.a) && this.b.equals(uliVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
