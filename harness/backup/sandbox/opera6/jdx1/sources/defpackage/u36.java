package defpackage;

/* loaded from: classes.dex */
public final class u36 implements vq7 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public u36(float f, float f2, float f3, float f4) {
        int iP0;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            StringBuilder sbP = am2.p("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f, ", ", f2, ", ");
            sbP.append(f3);
            sbP.append(", ");
            sbP.append(f4);
            sbP.append(".");
            dpg.a(sbP.toString());
        }
        float[] fArr = new float[5];
        float f5 = (f2 - 0.0f) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            iP0 = d2 == d3 ? 0 : o0g.P0((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int iP02 = o0g.P0((float) ((-(d6 + d7)) / d5), fArr, 0);
            iP0 = o0g.P0((float) ((d6 - d7) / d5), fArr, iP02) + iP02;
            if (iP0 > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iP0--;
                }
            }
        }
        float f10 = (f6 - f5) * 2.0f;
        int iP03 = o0g.P0((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, iP0) + iP0;
        float fMin = 0.0f;
        float fMax = 1.0f;
        for (int i = 0; i < iP03; i++) {
            float f11 = fArr[i];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - 0.0f) * f11) + (((f4 - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
            fMin = Math.min(fMin, f12);
            fMax = Math.max(fMax, f12);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
        this.e = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x022d A[PHI: r3
      0x022d: PHI (r3v27 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v31 float), (r3v36 float) binds: [B:120:0x022b, B:110:0x01fc, B:86:0x01b2, B:43:0x00de, B:20:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189 A[PHI: r12
      0x0189: PHI (r12v26 float) = (r12v25 float), (r12v37 float) binds: [B:64:0x0159, B:76:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.vq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c(float r27) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u36.c(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u36)) {
            return false;
        }
        u36 u36Var = (u36) obj;
        return this.a == u36Var.a && this.b == u36Var.b && this.c == u36Var.c && this.d == u36Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sko.d(this.c, sko.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = am2.p("CubicBezierEasing(a=", this.a, ", b=", this.b, ", c=");
        sbP.append(this.c);
        sbP.append(", d=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
