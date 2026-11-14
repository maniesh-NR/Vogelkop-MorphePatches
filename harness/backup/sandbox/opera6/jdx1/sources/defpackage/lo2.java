package defpackage;

/* loaded from: classes.dex */
public final class lo2 {
    public final mo2 a;
    public final int b;

    public lo2(mo2 mo2Var, int i) {
        if (mo2Var == null) {
            t3p.q("Null quality");
            throw null;
        }
        this.a = mo2Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lo2) {
            lo2 lo2Var = (lo2) obj;
            if (this.a.equals(lo2Var.a) && this.b == lo2Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.a);
        sb.append(", aspectRatio=");
        return p3p.k(this.b, "}", sb);
    }
}
