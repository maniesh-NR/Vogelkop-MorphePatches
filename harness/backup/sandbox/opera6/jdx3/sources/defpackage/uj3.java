package defpackage;

/* loaded from: classes.dex */
public final class uj3 {
    public final vj3 a;
    public final wj3 b;

    public uj3(vj3 vj3Var, wj3 wj3Var) {
        this.a = vj3Var;
        this.b = wj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj3)) {
            return false;
        }
        uj3 uj3Var = (uj3) obj;
        return this.a.equals(uj3Var.a) && this.b.equals(uj3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
