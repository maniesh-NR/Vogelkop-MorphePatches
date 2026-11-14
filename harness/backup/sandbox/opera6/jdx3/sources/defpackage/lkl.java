package defpackage;

/* loaded from: classes.dex */
public final class lkl {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public lkl(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkl)) {
            return false;
        }
        lkl lklVar = (lkl) obj;
        return this.a.equals(lklVar.a) && this.b == lklVar.b && this.c == lklVar.c && this.d == lklVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rfp.c(this.c, rfp.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
