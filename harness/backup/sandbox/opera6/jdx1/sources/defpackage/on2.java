package defpackage;

/* loaded from: classes.dex */
public final class on2 {
    public static final on2 c = new on2(mo2.k, 0);
    public final mo2 a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public on2(mo2 mo2Var, int i) {
        if (mo2Var == null) {
            t3p.q("Null fallbackQuality");
            throw null;
        }
        this.a = mo2Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof on2)) {
            return false;
        }
        on2 on2Var = (on2) obj;
        return this.a.equals(on2Var.a) && this.b == on2Var.b;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.a);
        sb.append(", fallbackRule=");
        return p3p.k(this.b ? 1 : 0, "}", sb);
    }
}
