package defpackage;

/* loaded from: classes.dex */
public final class cbe implements jxd {
    public final float a;
    public final float b;

    public cbe(float f, float f2) {
        z4o.v("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cbe.class == obj.getClass()) {
            cbe cbeVar = (cbe) obj;
            if (this.a == cbeVar.a && this.b == cbeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + sko.d(this.a, 527, 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
