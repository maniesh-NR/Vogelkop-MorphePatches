package defpackage;

/* loaded from: classes.dex */
public final class e7g extends v7g {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public e7g(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7g)) {
            return false;
        }
        e7g e7gVar = (e7g) obj;
        return Float.compare(this.c, e7gVar.c) == 0 && Float.compare(this.d, e7gVar.d) == 0 && Float.compare(this.e, e7gVar.e) == 0 && Float.compare(this.f, e7gVar.f) == 0 && Float.compare(this.g, e7gVar.g) == 0 && Float.compare(this.h, e7gVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + sko.d(this.g, sko.d(this.f, sko.d(this.e, sko.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = am2.p("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        sbP.append(this.e);
        sbP.append(", y2=");
        sbP.append(this.f);
        sbP.append(", x3=");
        sbP.append(this.g);
        sbP.append(", y3=");
        sbP.append(this.h);
        sbP.append(")");
        return sbP.toString();
    }
}
