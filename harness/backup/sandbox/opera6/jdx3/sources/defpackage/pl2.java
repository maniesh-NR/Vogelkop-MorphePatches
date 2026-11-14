package defpackage;

/* loaded from: classes.dex */
public final class pl2 {
    public final int a;
    public final int b;

    public pl2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl2)) {
            return false;
        }
        pl2 pl2Var = (pl2) obj;
        return this.a == pl2Var.a && this.b == pl2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
