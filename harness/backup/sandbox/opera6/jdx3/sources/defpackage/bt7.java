package defpackage;

/* loaded from: classes.dex */
public final class bt7 {
    public final int a;
    public final boolean b;
    public final int c;
    public final nil d;
    public final boolean e;
    public final int f;

    public bt7(int i, boolean z, int i2, nil nilVar, boolean z2, int i3) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = nilVar;
        this.e = z2;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt7)) {
            return false;
        }
        bt7 bt7Var = (bt7) obj;
        return this.a == bt7Var.a && this.b == bt7Var.b && this.c == bt7Var.c && this.d == bt7Var.d && this.e == bt7Var.e && this.f == bt7Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + fki.k((this.d.hashCode() + rfp.c(this.c, fki.k(Integer.hashCode(this.a) * 31, 31, this.b), 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "";
    }
}
