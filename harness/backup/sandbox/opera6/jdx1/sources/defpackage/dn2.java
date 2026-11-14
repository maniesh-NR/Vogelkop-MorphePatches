package defpackage;

/* loaded from: classes.dex */
public final class dn2 {
    public final co2 a;
    public final co2 b;

    public dn2(co2 co2Var, co2 co2Var2) {
        this.a = co2Var;
        this.b = co2Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dn2)) {
            return false;
        }
        dn2 dn2Var = (dn2) obj;
        return this.a.equals(dn2Var.a) && this.b.equals(dn2Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
