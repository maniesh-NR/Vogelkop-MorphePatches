package defpackage;

/* loaded from: classes.dex */
public final class o65 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public o65(int i, int i2, int i3, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o65)) {
            return false;
        }
        o65 o65Var = (o65) obj;
        return this.a.equals(o65Var.a) && this.b == o65Var.b && this.c == o65Var.c && this.d == o65Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rfp.c(this.c, rfp.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
