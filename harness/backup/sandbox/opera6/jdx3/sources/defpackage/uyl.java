package defpackage;

/* loaded from: classes.dex */
public final class uyl {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;

    public uyl(int i, int i2, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyl)) {
            return false;
        }
        uyl uylVar = (uyl) obj;
        return this.a == uylVar.a && this.b == uylVar.b && this.c == uylVar.c && this.d == uylVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fki.k(rfp.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
