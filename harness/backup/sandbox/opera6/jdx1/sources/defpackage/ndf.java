package defpackage;

/* loaded from: classes.dex */
public final class ndf {
    public final long a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public ndf(long j, int i, float f, float f2, float f3, float f4, float f5) {
        this.a = j;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndf)) {
            return false;
        }
        ndf ndfVar = (ndf) obj;
        return gcb.a(this.a, ndfVar.a) && this.b == ndfVar.b && gh7.b(this.c, ndfVar.c) && Float.compare(this.d, ndfVar.d) == 0 && Float.compare(this.e, ndfVar.e) == 0 && Float.compare(this.f, ndfVar.f) == 0 && Float.compare(this.g, ndfVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + sko.d(this.f, sko.d(this.e, sko.d(this.d, sko.d(this.c, rfp.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
