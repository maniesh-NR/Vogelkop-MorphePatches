package defpackage;

/* loaded from: classes.dex */
public abstract class ei9 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile fxj b = new fxj(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.e(115, new fi9(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.e(130, new fi9(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.e(150, new fi9(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.e(180, new fi9(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.e(200, new fi9(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.a[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        c8b.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static di9 a(float f) {
        float f2;
        di9 fi9Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        fxj fxjVar = b;
        int i = (int) (f * 100.0f);
        fxjVar.getClass();
        di9 di9Var = (di9) y9m.u(fxjVar, i);
        if (di9Var != null) {
            return di9Var;
        }
        fxj fxjVar2 = b;
        int iF = x1p.f(fxjVar2.c, i, fxjVar2.a);
        fxj fxjVar3 = b;
        if (iF >= 0) {
            return (di9) fxjVar3.f(iF);
        }
        int i2 = -(iF + 1);
        int i3 = i2 - 1;
        if (i2 >= fxjVar3.c) {
            fi9 fi9Var2 = new fi9(new float[]{1.0f}, new float[]{f});
            b(f, fi9Var2);
            return fi9Var2;
        }
        if (i3 < 0) {
            fi9Var = new fi9(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = b.a[i3] / 100.0f;
            fi9Var = (di9) b.f(i3);
        }
        float f3 = b.a[i2] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        di9 di9Var2 = (di9) b.f(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fB = fi9Var.b(f4);
            fArr2[i4] = ((di9Var2.b(f4) - fB) * fMax) + fB;
        }
        fi9 fi9Var3 = new fi9(fArr, fArr2);
        b(f, fi9Var3);
        return fi9Var3;
    }

    public static void b(float f, fi9 fi9Var) {
        synchronized (c) {
            fxj fxjVarC = b.clone();
            fxjVarC.e((int) (f * 100.0f), fi9Var);
            b = fxjVarC;
        }
    }
}
