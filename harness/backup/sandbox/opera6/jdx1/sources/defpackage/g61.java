package defpackage;

import ads_mobile_sdk.pd;

/* loaded from: classes.dex */
public abstract class g61 {
    public static final float[] a;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float[] fArr = new float[pd.T0];
        a = fArr;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f7 = i / 100.0f;
            float f8 = 1.0f;
            while (true) {
                f = ((f8 - f5) / 2.0f) + f5;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f9 = (((0.35000002f * f) + (0.175f * f2)) * f3) + f4;
                if (Math.abs(f9 - f7) < 1.0E-5d) {
                    break;
                } else if (f9 > f7) {
                    f8 = f;
                } else {
                    f5 = f;
                }
            }
            fArr[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f10 = 1.0f;
            while (true) {
                float f11 = ((f10 - f6) / 2.0f) + f6;
                float f12 = 1.0f - f11;
                float f13 = (f11 * f11 * f11) + (((f12 * 0.5f) + f11) * f11 * 3.0f * f12);
                if (Math.abs(f13 - f7) >= 1.0E-5d) {
                    if (f13 > f7) {
                        f10 = f11;
                    } else {
                        f6 = f11;
                    }
                }
            }
        }
        fArr[100] = 1.0f;
    }

    public static f61 a(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float fB = djh.b(f, 0.0f, 1.0f);
        int i = (int) (100.0f * fB);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = a;
            float f5 = fArr[i];
            float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            float fG = v0g.g(fB, f4, f6, f5);
            f2 = f6;
            f3 = fG;
        }
        return new f61(f3, f2);
    }
}
