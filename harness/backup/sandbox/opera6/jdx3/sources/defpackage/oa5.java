package defpackage;

/* loaded from: classes.dex */
public final class oa5 {
    public final int a;
    public final int b;

    public oa5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa5)) {
            return false;
        }
        oa5 oa5Var = (oa5) obj;
        return this.a == oa5Var.a && this.b == oa5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
