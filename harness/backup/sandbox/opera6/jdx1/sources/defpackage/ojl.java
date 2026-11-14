package defpackage;

/* loaded from: classes.dex */
public final class ojl {
    public final njl a;
    public b2c b = null;
    public b2c c;

    public ojl(njl njlVar, b2c b2cVar) {
        this.a = njlVar;
        this.c = b2cVar;
    }

    public final long a(long j) {
        voh vohVarY;
        b2c b2cVar = this.b;
        voh vohVar = voh.e;
        if (b2cVar != null) {
            if (b2cVar.f()) {
                b2c b2cVar2 = this.c;
                vohVarY = b2cVar2 != null ? b2cVar2.y(b2cVar, true) : null;
            } else {
                vohVarY = vohVar;
            }
            if (vohVarY != null) {
                vohVar = vohVarY;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = vohVar.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = vohVar.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = vohVar.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = vohVar.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        njl njlVar = this.a;
        int iE = njlVar.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= njlVar.e(iE) && Float.intBitsToFloat(i) <= njlVar.f(iE);
    }

    public final long d(long j) {
        b2c b2cVar;
        b2c b2cVar2 = this.b;
        if (b2cVar2 != null) {
            if (!b2cVar2.f()) {
                b2cVar2 = null;
            }
            if (b2cVar2 != null && (b2cVar = this.c) != null) {
                b2c b2cVar3 = b2cVar.f() ? b2cVar : null;
                if (b2cVar3 != null) {
                    return b2cVar2.v(b2cVar3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        b2c b2cVar;
        b2c b2cVar2 = this.b;
        if (b2cVar2 != null) {
            if (!b2cVar2.f()) {
                b2cVar2 = null;
            }
            if (b2cVar2 != null && (b2cVar = this.c) != null) {
                b2c b2cVar3 = b2cVar.f() ? b2cVar : null;
                if (b2cVar3 != null) {
                    return b2cVar3.v(b2cVar2, j);
                }
            }
        }
        return j;
    }
}
