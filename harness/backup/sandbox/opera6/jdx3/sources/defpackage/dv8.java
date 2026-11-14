package defpackage;

/* loaded from: classes.dex */
public final class dv8 {
    public final int a;
    public final int b;

    public dv8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv8)) {
            return false;
        }
        dv8 dv8Var = (dv8) obj;
        return this.a == dv8Var.a && this.b == dv8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
