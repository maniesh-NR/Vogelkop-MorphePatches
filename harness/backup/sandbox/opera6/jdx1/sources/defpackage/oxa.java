package defpackage;

/* loaded from: classes.dex */
public final class oxa implements ez8 {
    public final jva a;
    public final boolean b;
    public final dd6 c;

    public oxa(jva jvaVar, boolean z, dd6 dd6Var) {
        this.a = jvaVar;
        this.b = z;
        this.c = dd6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxa)) {
            return false;
        }
        oxa oxaVar = (oxa) obj;
        return this.a.equals(oxaVar.a) && this.b == oxaVar.b && this.c == oxaVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + fki.k(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ")";
    }
}
