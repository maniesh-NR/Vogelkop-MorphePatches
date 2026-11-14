package defpackage;

/* loaded from: classes.dex */
public final class ndo {
    public final boolean a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public ndo(boolean z, float f, int i, float f2, float f3, float f4, float f5) {
        this.a = z;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndo)) {
            return false;
        }
        ndo ndoVar = (ndo) obj;
        return this.a == ndoVar.a && Float.compare(this.b, ndoVar.b) == 0 && this.c == ndoVar.c && Float.compare(this.d, ndoVar.d) == 0 && Float.compare(this.e, ndoVar.e) == 0 && Float.compare(this.f, ndoVar.f) == 0 && Float.compare(this.g, ndoVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + sko.d(this.f, sko.d(this.e, sko.d(this.d, rfp.c(this.c, sko.d(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
