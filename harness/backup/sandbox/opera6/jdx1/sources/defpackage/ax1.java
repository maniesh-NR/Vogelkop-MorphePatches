package defpackage;

import ads_mobile_sdk.pd;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ax1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public float h;
    public float i;
    public final float[] j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final float q;
    public final float r;

    public ax1(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float f7 = f3;
        this.a = f;
        this.b = f2;
        this.c = f7;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        float f8 = f5 - f7;
        float f9 = f6 - f4;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f9 > 0.0f : i == 5 && f9 < 0.0f);
        float f10 = z2 ? -1.0f : 1.0f;
        this.m = f10;
        float f11 = 1.0f / (f2 - f);
        this.k = f11;
        float[] fArr = new float[pd.T0];
        this.j = fArr;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
            float fHypot = (float) Math.hypot(f9, f8);
            this.g = fHypot;
            this.l = fHypot * f11;
            this.q = f8 * f11;
            this.r = f9 * f11;
            this.n = Float.NaN;
            this.o = Float.NaN;
            z = true;
        } else {
            this.n = f8 * f10;
            this.o = f9 * (-f10);
            this.q = z2 ? f5 : f7;
            this.r = z2 ? f4 : f6;
            float f12 = f4 - f6;
            float[] fArr2 = sgb.a;
            float f13 = f12;
            int i4 = 1;
            float fHypot2 = 0.0f;
            float f14 = 0.0f;
            while (true) {
                double d = (float) (((i4 * 90.0d) / 90.0d) * 0.017453292519943295d);
                i2 = i3;
                float fSin = ((float) Math.sin(d)) * f8;
                float fCos = ((float) Math.cos(d)) * f12;
                fHypot2 += (float) Math.hypot(fSin - f14, fCos - f13);
                fArr2[i4] = fHypot2;
                if (i4 == 90) {
                    break;
                }
                i4++;
                f14 = fSin;
                f13 = fCos;
                i3 = i2;
            }
            this.g = fHypot2;
            int i5 = i2;
            while (true) {
                fArr2[i5] = fArr2[i5] / fHypot2;
                if (i5 == 90) {
                    break;
                } else {
                    i5++;
                }
            }
            for (int i6 = 0; i6 < 101; i6++) {
                float f15 = i6 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f15);
                if (iBinarySearch >= 0) {
                    fArr[i6] = iBinarySearch / 90.0f;
                } else if (iBinarySearch == -1) {
                    fArr[i6] = 0.0f;
                } else {
                    int i7 = -iBinarySearch;
                    int i8 = i7 - 2;
                    float f16 = i8;
                    float f17 = fArr2[i8];
                    fArr[i6] = (((f15 - f17) / (fArr2[i7 - i2] - f17)) + f16) / 90.0f;
                }
            }
            this.l = this.g * this.k;
            z = z3;
        }
        this.p = z;
    }

    public final float a() {
        float f = this.n * this.i;
        return f * this.m * (this.l / ((float) Math.hypot(f, (-this.o) * this.h)));
    }

    public final float b() {
        float f = this.n * this.i;
        float f2 = (-this.o) * this.h;
        return f2 * this.m * (this.l / ((float) Math.hypot(f, f2)));
    }

    public final void c(float f) {
        float f2 = (this.m == -1.0f ? this.b - f : f - this.a) * this.k;
        float fG = 0.0f;
        if (f2 > 0.0f) {
            fG = 1.0f;
            if (f2 < 1.0f) {
                float f3 = f2 * 100.0f;
                int i = (int) f3;
                float[] fArr = this.j;
                float f4 = fArr[i];
                fG = v0g.g(fArr[i + 1], f4, f3 - i, f4);
            }
        }
        double d = fG * 1.5707964f;
        this.h = (float) Math.sin(d);
        this.i = (float) Math.cos(d);
    }
}
