package defpackage;

/* loaded from: classes.dex */
public final class no3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public no3(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no3)) {
            return false;
        }
        no3 no3Var = (no3) obj;
        return this.a == no3Var.a && this.b == no3Var.b && this.c == no3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fki.k(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
