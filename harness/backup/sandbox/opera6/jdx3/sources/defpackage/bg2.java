package defpackage;

/* loaded from: classes.dex */
public final class bg2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public bg2(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg2)) {
            return false;
        }
        bg2 bg2Var = (bg2) obj;
        return this.a == bg2Var.a && this.b == bg2Var.b && this.c == bg2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fki.k(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
