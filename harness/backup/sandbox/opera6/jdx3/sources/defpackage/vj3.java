package defpackage;

/* loaded from: classes.dex */
public final class vj3 {
    public final sj3 a;
    public final tj3 b;

    public vj3(sj3 sj3Var, tj3 tj3Var) {
        this.a = sj3Var;
        this.b = tj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj3)) {
            return false;
        }
        vj3 vj3Var = (vj3) obj;
        return this.a == vj3Var.a && this.b.equals(vj3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
