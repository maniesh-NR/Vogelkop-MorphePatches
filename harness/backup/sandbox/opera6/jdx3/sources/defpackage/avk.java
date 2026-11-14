package defpackage;

/* loaded from: classes.dex */
public final class avk {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public avk(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avk)) {
            return false;
        }
        avk avkVar = (avk) obj;
        return Float.compare(this.a, avkVar.a) == 0 && Float.compare(this.b, avkVar.b) == 0 && Float.compare(this.c, avkVar.c) == 0 && Float.compare(this.d, avkVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sko.d(this.c, sko.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = am2.p("ViewBox(left=", this.a, ", top=", this.b, ", right=");
        sbP.append(this.c);
        sbP.append(", bottom=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
