package defpackage;

/* loaded from: classes.dex */
public final class sn2 {
    public final eo2 a;
    public final int b;

    public sn2(eo2 eo2Var, int i) {
        this.a = eo2Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sn2)) {
            return false;
        }
        sn2 sn2Var = (sn2) obj;
        return this.a.equals(sn2Var.a) && this.b == sn2Var.b;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return p3p.k(this.b, "}", sb);
    }
}
