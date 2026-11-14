package defpackage;

/* loaded from: classes.dex */
public final class fi7 {
    public final int a;
    public final int b;

    public fi7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi7)) {
            return false;
        }
        fi7 fi7Var = (fi7) obj;
        return this.a == fi7Var.a && this.b == fi7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
