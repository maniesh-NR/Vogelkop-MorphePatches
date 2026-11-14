package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class hyf {
    public zg a;
    public boolean b;
    public kh3 c;
    public float d = 1.0f;
    public d2c e = d2c.a;

    public boolean d(float f) {
        return false;
    }

    public boolean e(kh3 kh3Var) {
        return false;
    }

    public void f(d2c d2cVar) {
    }

    public final void g(mk7 mk7Var, long j, float f, kh3 kh3Var) {
        if (this.d != f) {
            if (!d(f)) {
                zg zgVarD = this.a;
                if (f == 1.0f) {
                    if (zgVarD != null) {
                        zgVarD.B(f);
                    }
                    this.b = false;
                } else {
                    if (zgVarD == null) {
                        zgVarD = na2.d();
                        this.a = zgVarD;
                    }
                    zgVarD.B(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
        if (!Intrinsics.a(this.c, kh3Var)) {
            if (!e(kh3Var)) {
                zg zgVarD2 = this.a;
                if (kh3Var == null) {
                    if (zgVarD2 != null) {
                        zgVarD2.E(null);
                    }
                    this.b = false;
                } else {
                    if (zgVarD2 == null) {
                        zgVarD2 = na2.d();
                        this.a = zgVarD2;
                    }
                    zgVarD2.E(kh3Var);
                    this.b = true;
                }
            }
            this.c = kh3Var;
        }
        d2c layoutDirection = mk7Var.getLayoutDirection();
        if (this.e != layoutDirection) {
            f(layoutDirection);
            this.e = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (mk7Var.e() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (mk7Var.e() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((wth) mk7Var.s0().a).I(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
                        voh vohVarA = bwg.a(0L, (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L));
                        sh4 sh4VarA = mk7Var.s0().A();
                        zg zgVarD3 = this.a;
                        if (zgVarD3 == null) {
                            zgVarD3 = na2.d();
                            this.a = zgVarD3;
                        }
                        try {
                            sh4VarA.k(vohVarA, zgVarD3);
                            i(mk7Var);
                            sh4VarA.f();
                        } catch (Throwable th) {
                            sh4VarA.f();
                            throw th;
                        }
                    } else {
                        i(mk7Var);
                    }
                }
            } finally {
                ((wth) mk7Var.s0().a).I(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public long h() {
        return 9205357640488583168L;
    }

    public abstract void i(mk7 mk7Var);
}
