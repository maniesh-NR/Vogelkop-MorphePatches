package defpackage;

/* loaded from: classes.dex */
public final class c7g extends v7g {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public c7g(float f, float f2, boolean z, boolean z2, float f3, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7g)) {
            return false;
        }
        c7g c7gVar = (c7g) obj;
        return Float.compare(this.c, c7gVar.c) == 0 && Float.compare(this.d, c7gVar.d) == 0 && Float.compare(this.e, c7gVar.e) == 0 && this.f == c7gVar.f && this.g == c7gVar.g && Float.compare(this.h, c7gVar.h) == 0 && Float.compare(this.i, c7gVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + sko.d(this.h, fki.k(fki.k(sko.d(this.e, sko.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbP = am2.p("ArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        sbP.append(this.e);
        sbP.append(", isMoreThanHalf=");
        sbP.append(this.f);
        sbP.append(", isPositiveArc=");
        sbP.append(this.g);
        sbP.append(", arcStartX=");
        sbP.append(this.h);
        sbP.append(", arcStartY=");
        return am2.n(sbP, this.i, ")");
    }
}
