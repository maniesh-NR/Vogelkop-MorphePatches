package defpackage;

/* loaded from: classes.dex */
public final class ree {
    public final /* synthetic */ byte a;
    public float b;
    public float c;
    public float d;
    public float e;

    public ree() {
        this.a = (byte) 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
    }

    public ree(float f, float f2, float f3, float f4) {
        this.a = (byte) 1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public ree(ree reeVar) {
        this.a = (byte) 1;
        this.b = reeVar.b;
        this.c = reeVar.c;
        this.d = reeVar.d;
        this.e = reeVar.e;
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.b = Math.max(f, this.b);
        this.c = Math.max(f2, this.c);
        this.d = Math.min(f3, this.d);
        this.e = Math.min(f4, this.e);
    }

    public final boolean b() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public final float c() {
        return this.b + this.d;
    }

    public final float d() {
        return this.c + this.e;
    }

    public final void e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.b += fIntBitsToFloat;
        this.c += fIntBitsToFloat2;
        this.d += fIntBitsToFloat;
        this.e += fIntBitsToFloat2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                String strM0 = scd.m0(this.b);
                String strM02 = scd.m0(this.c);
                return sko.n(z1m.n("MutableRect(", strM0, ", ", strM02, ", "), scd.m0(this.d), ", ", scd.m0(this.e), ")");
            default:
                StringBuilder sb = new StringBuilder("[");
                sb.append(this.b);
                sb.append(" ");
                sb.append(this.c);
                sb.append(" ");
                sb.append(this.d);
                sb.append(" ");
                return am2.n(sb, this.e, "]");
        }
    }
}
