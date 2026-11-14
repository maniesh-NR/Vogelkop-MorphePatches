package defpackage;

/* loaded from: classes.dex */
public final class q7g extends v7g {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public q7g(float f, float f2, float f3, float f4) {
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
        if (!(obj instanceof q7g)) {
            return false;
        }
        q7g q7gVar = (q7g) obj;
        return Float.compare(this.c, q7gVar.c) == 0 && Float.compare(this.d, q7gVar.d) == 0 && Float.compare(this.e, q7gVar.e) == 0 && Float.compare(this.f, q7gVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + sko.d(this.e, sko.d(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = am2.p("RelativeQuadTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        sbP.append(this.e);
        sbP.append(", dy2=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }
}
