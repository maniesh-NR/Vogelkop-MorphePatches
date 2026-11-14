package defpackage;

/* loaded from: classes.dex */
public final class c02 {
    public final a02 a;
    public final b02 b;

    public c02(a02 a02Var, b02 b02Var) {
        this.a = a02Var;
        this.b = b02Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c02)) {
            return false;
        }
        c02 c02Var = (c02) obj;
        return this.a == c02Var.a && this.b == c02Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
