package defpackage;

/* loaded from: classes.dex */
public final class k1n {
    public final boolean a;
    public final j1n b;
    public final byte c;
    public final nc6[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public /* synthetic */ k1n() {
        this(false, j1n.a);
    }

    public k1n(boolean z) {
        this(z, j1n.b);
    }

    public k1n(boolean z, j1n j1nVar) {
        byte b;
        this.a = z;
        this.b = j1nVar;
        if (z && j1nVar.equals(j1n.a)) {
            qp2.n("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = j1nVar.ordinal();
        if (iOrdinal == 0) {
            b = 3;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                throw null;
            }
            b = 2;
        }
        this.c = b;
        this.d = new nc6[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.e + 1) % 20;
        this.e = i;
        nc6[] nc6VarArr = this.d;
        nc6 nc6Var = nc6VarArr[i];
        if (nc6Var != null) {
            nc6Var.a = j;
            nc6Var.b = f;
        } else {
            nc6 nc6Var2 = new nc6();
            nc6Var2.a = j;
            nc6Var2.b = f;
            nc6VarArr[i] = nc6Var2;
        }
    }

    public final float b() {
        boolean z;
        j1n j1nVar;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float fSignum;
        int i3 = this.e;
        nc6[] nc6VarArr = this.d;
        nc6 nc6Var = nc6VarArr[i3];
        if (nc6Var == null) {
            return 0.0f;
        }
        int i4 = 0;
        nc6 nc6Var2 = nc6Var;
        do {
            nc6 nc6Var3 = nc6VarArr[i3];
            z = this.a;
            j1nVar = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (nc6Var3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = 0.0f;
            } else {
                long j = nc6Var.a;
                i = i4;
                f = 0.0f;
                long j2 = nc6Var3.a;
                float f3 = j - j2;
                fArr2 = fArr3;
                i2 = 1;
                float fAbs = Math.abs(j2 - nc6Var2.a);
                nc6Var2 = (j1nVar == j1n.a || z) ? nc6Var3 : nc6Var;
                if (f3 <= 100.0f && fAbs <= 40.0f) {
                    fArr2[i] = nc6Var3.b;
                    fArr[i] = -f3;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 < this.c) {
            return f;
        }
        int iOrdinal = j1nVar.ordinal();
        if (iOrdinal == 0) {
            try {
                float[] fArr4 = this.h;
                ocp.n(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            fSignum = f2;
        } else {
            if (iOrdinal != i2) {
                h9o.p();
                return f;
            }
            int i5 = i4 - i2;
            float f4 = fArr[i5];
            int i6 = i5;
            float f5 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f6 = fArr[i7];
                if (f4 != f6) {
                    float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
                    float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f))))) + f5;
                    if (i6 == i5) {
                        fAbs2 *= 0.5f;
                    }
                    f5 = fAbs2;
                }
                i6--;
                f4 = f6;
            }
            fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
        }
        return fSignum * 1000.0f;
    }

    public final float c(float f) {
        if (f <= 0.0f) {
            a8b.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fB = b();
        if (fB == 0.0f || Float.isNaN(fB)) {
            return 0.0f;
        }
        if (fB <= 0.0f) {
            float f2 = -f;
            if (fB < f2) {
                return f2;
            }
        } else if (fB > f) {
            return f;
        }
        return fB;
    }
}
