package defpackage;

/* loaded from: classes.dex */
public final class jcg {
    public final zi4 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public jcg(zi4 zi4Var, int i, int i2, int i3, int i4, int i5) {
        this.a = zi4Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcg)) {
            return false;
        }
        jcg jcgVar = (jcg) obj;
        return this.a.equals(jcgVar.a) && this.b == jcgVar.b && this.c == jcgVar.c && this.d == jcgVar.d && this.e == jcgVar.e && this.f == jcgVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + rfp.c(this.e, rfp.c(this.d, rfp.c(this.c, rfp.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
