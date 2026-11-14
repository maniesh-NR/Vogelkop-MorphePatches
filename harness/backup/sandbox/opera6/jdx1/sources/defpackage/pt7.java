package defpackage;

/* loaded from: classes.dex */
public final class pt7 {
    public final ot7 a;
    public final boolean b;

    public pt7(ot7 ot7Var, boolean z) {
        this.a = ot7Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt7)) {
            return false;
        }
        pt7 pt7Var = (pt7) obj;
        return this.a == pt7Var.a && this.b == pt7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
