package defpackage;

/* loaded from: classes.dex */
public final class h8i {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        ioh.b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public h8i(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8i)) {
            return false;
        }
        h8i h8iVar = (h8i) obj;
        return Float.compare(this.a, h8iVar.a) == 0 && Float.compare(this.b, h8iVar.b) == 0 && Float.compare(this.c, h8iVar.c) == 0 && Float.compare(this.d, h8iVar.d) == 0 && nb6.r(this.e, h8iVar.e) && nb6.r(this.f, h8iVar.f) && nb6.r(this.g, h8iVar.g) && nb6.r(this.h, h8iVar.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + z1m.e(z1m.e(z1m.e(sko.d(this.d, sko.d(this.c, sko.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strM0 = scd.m0(this.a);
        String strM02 = scd.m0(this.b);
        String strM03 = scd.m0(this.c);
        String strM04 = scd.m0(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(strM0);
        sb.append(", ");
        sb.append(strM02);
        sb.append(", ");
        sb.append(strM03);
        String strL = z1m.l(sb, ", ", strM04);
        long j = this.e;
        long j2 = this.f;
        boolean zR = nb6.r(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (zR && nb6.r(j2, j3) && nb6.r(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return sko.l("RoundRect(rect=", strL, ", radius=", scd.m0(Float.intBitsToFloat(i)), ")");
            }
            String strM05 = scd.m0(Float.intBitsToFloat(i));
            return z1m.l(z1m.n("RoundRect(rect=", strL, ", x=", strM05, ", y="), scd.m0(Float.intBitsToFloat(i2)), ")");
        }
        String strV = nb6.V(j);
        String strV2 = nb6.V(j2);
        String strV3 = nb6.V(j3);
        String strV4 = nb6.V(j4);
        StringBuilder sbN = z1m.n("RoundRect(rect=", strL, ", topLeft=", strV, ", topRight=");
        z1m.t(sbN, strV2, ", bottomRight=", strV3, ", bottomLeft=");
        return z1m.l(sbN, strV4, ")");
    }
}
