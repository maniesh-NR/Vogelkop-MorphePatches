package defpackage;

/* loaded from: classes.dex */
public final class yj3 {
    public final boolean a;
    public final xj3 b;

    public yj3(boolean z, xj3 xj3Var) {
        this.a = z;
        this.b = xj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj3)) {
            return false;
        }
        yj3 yj3Var = (yj3) obj;
        return this.a == yj3Var.a && this.b.equals(yj3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
