package defpackage;

/* loaded from: classes.dex */
public final class b0k {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public b0k(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0k)) {
            return false;
        }
        b0k b0kVar = (b0k) obj;
        return this.a == b0kVar.a && this.b == b0kVar.b && this.c == b0kVar.c && this.d == b0kVar.d && this.e == b0kVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + rfp.c(this.d, rfp.c(this.c, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
