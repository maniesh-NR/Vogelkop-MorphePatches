package defpackage;

/* loaded from: classes.dex */
public final class e98 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public e98(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e98)) {
            return false;
        }
        e98 e98Var = (e98) obj;
        return this.a == e98Var.a && this.b == e98Var.b && this.c == e98Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fki.k(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
