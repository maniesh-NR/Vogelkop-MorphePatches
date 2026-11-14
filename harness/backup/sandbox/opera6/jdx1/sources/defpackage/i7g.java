package defpackage;

/* loaded from: classes.dex */
public final class i7g extends v7g {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public i7g(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7g)) {
            return false;
        }
        i7g i7gVar = (i7g) obj;
        return Float.compare(this.c, i7gVar.c) == 0 && Float.compare(this.d, i7gVar.d) == 0 && Float.compare(this.e, i7gVar.e) == 0 && Float.compare(this.f, i7gVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + sko.d(this.e, sko.d(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = am2.p("QuadTo(x1=", this.c, ", y1=", this.d, ", x2=");
        sbP.append(this.e);
        sbP.append(", y2=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }
}
