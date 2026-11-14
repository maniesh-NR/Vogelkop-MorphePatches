package defpackage;

/* loaded from: classes.dex */
public final class pcg {
    public final vd0 a;
    public final op0 b;

    public pcg(vd0 vd0Var, op0 op0Var) {
        this.a = vd0Var;
        this.b = op0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcg)) {
            return false;
        }
        pcg pcgVar = (pcg) obj;
        return this.a == pcgVar.a && this.b == pcgVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
