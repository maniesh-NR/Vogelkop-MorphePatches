package defpackage;

/* loaded from: classes.dex */
public final class j78 implements m78 {
    public final qxh a;
    public final rxh b;

    public j78(qxh qxhVar, rxh rxhVar) {
        this.a = qxhVar;
        this.b = rxhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j78)) {
            return false;
        }
        j78 j78Var = (j78) obj;
        return this.a.equals(j78Var.a) && this.b.equals(j78Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
