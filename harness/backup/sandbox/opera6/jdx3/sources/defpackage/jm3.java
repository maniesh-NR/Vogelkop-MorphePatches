package defpackage;

/* loaded from: classes.dex */
public final class jm3 {
    public boolean a;
    public long b;
    public nl3 c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm3)) {
            return false;
        }
        jm3 jm3Var = (jm3) obj;
        return this.a == jm3Var.a && this.b == jm3Var.b && this.c == jm3Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
