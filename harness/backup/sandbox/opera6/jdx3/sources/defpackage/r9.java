package defpackage;

/* loaded from: classes.dex */
public final class r9 {
    public final ndo a;
    public final boolean b;
    public final int c;

    public r9(ndo ndoVar, boolean z, int i) {
        this.a = ndoVar;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9)) {
            return false;
        }
        r9 r9Var = (r9) obj;
        return this.a.equals(r9Var.a) && this.b == r9Var.b && this.c == r9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fki.k(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
