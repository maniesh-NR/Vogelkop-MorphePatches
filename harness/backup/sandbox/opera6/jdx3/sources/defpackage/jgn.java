package defpackage;

/* loaded from: classes.dex */
public final class jgn {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;

    public jgn(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgn)) {
            return false;
        }
        jgn jgnVar = (jgn) obj;
        return this.a == jgnVar.a && this.b == jgnVar.b && this.c == jgnVar.c && this.d == jgnVar.d && this.e == jgnVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + rfp.c(this.d, rfp.c(this.c, fki.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
