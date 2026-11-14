package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uh4 implements mk7 {
    public final th4 a;
    public final d5o b;
    public zg c;
    public zg d;

    public uh4() {
        q27 q27Var = f03.e;
        d2c d2cVar = d2c.a;
        th4 th4Var = new th4();
        th4Var.a = q27Var;
        th4Var.b = d2cVar;
        th4Var.c = d08.a;
        th4Var.d = 0L;
        this.a = th4Var;
        d5o d5oVar = new d5o();
        d5oVar.c = this;
        d5oVar.a = new wth(d5oVar, (byte) 22);
        this.b = d5oVar;
    }

    public static zg a(uh4 uh4Var, long j, nk7 nk7Var, float f, int i) {
        zg zgVarD = uh4Var.d(nk7Var);
        Paint paint = (Paint) zgVarD.b;
        if (f != 1.0f) {
            j = u95.b(j, u95.c(j) * f);
        }
        long jA = x7o.a.a(paint);
        int i2 = u95.h;
        if (!jgm.a(jA, j)) {
            zgVarD.D(j);
        }
        if (((Shader) zgVarD.c) != null) {
            zgVarD.G(null);
        }
        if (!Intrinsics.a((kh3) zgVarD.d, null)) {
            zgVarD.E(null);
        }
        if (zgVarD.a != i) {
            zgVarD.C(i);
        }
        if (paint.isFilterBitmap()) {
            return zgVarD;
        }
        zgVarD.F(1);
        return zgVarD;
    }

    @Override // defpackage.mk7
    public final void C0(long j, long j2, long j3, float f, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.o(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), a(this, j, a39.a, f, i));
    }

    @Override // defpackage.mk7
    public final void H(long j, long j2, long j3, long j4, nk7 nk7Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, nk7Var, 1.0f, 3));
    }

    @Override // defpackage.mk7
    public final void L(j71 j71Var, long j, long j2, long j3, float f, kh3 kh3Var, int i) {
        this.a.c.g(j71Var, j, j2, j3, c(null, a39.a, f, kh3Var, 3, i));
    }

    @Override // defpackage.mk7
    public final void P(dz3 dz3Var, long j, long j2, float f, nk7 nk7Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.a.c.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i2), c(dz3Var, nk7Var, f, null, 3, 1));
    }

    @Override // defpackage.mk7
    public final void S(d91 d91Var, dz3 dz3Var, float f, nk7 nk7Var, int i) {
        this.a.c.q(d91Var, c(dz3Var, nk7Var, f, null, i, 1));
    }

    @Override // defpackage.mk7
    public final void T(d91 d91Var, long j, float f, nk7 nk7Var) {
        this.a.c.q(d91Var, a(this, j, nk7Var, f, 3));
    }

    @Override // defpackage.n27
    public final float b() {
        return this.a.a.b();
    }

    public final zg c(dz3 dz3Var, nk7 nk7Var, float f, kh3 kh3Var, int i, int i2) {
        zg zgVarD = d(nk7Var);
        Paint paint = (Paint) zgVarD.b;
        if (dz3Var != null) {
            dz3Var.a(f, e(), zgVarD);
        } else {
            if (((Shader) zgVarD.c) != null) {
                zgVarD.G(null);
            }
            long jA = x7o.a.a(paint);
            long j = u95.b;
            if (!jgm.a(jA, j)) {
                zgVarD.D(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                zgVarD.B(f);
            }
        }
        if (!Intrinsics.a((kh3) zgVarD.d, kh3Var)) {
            zgVarD.E(kh3Var);
        }
        if (zgVarD.a != i) {
            zgVarD.C(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return zgVarD;
        }
        zgVarD.F(i2);
        return zgVarD;
    }

    public final zg d(nk7 nk7Var) {
        if (Intrinsics.a(nk7Var, a39.a)) {
            zg zgVar = this.c;
            if (zgVar != null) {
                return zgVar;
            }
            zg zgVarD = na2.d();
            zgVarD.K(0);
            this.c = zgVarD;
            return zgVarD;
        }
        if (!(nk7Var instanceof qik)) {
            h9o.p();
            return null;
        }
        zg zgVarD2 = this.d;
        if (zgVarD2 == null) {
            zgVarD2 = na2.d();
            zgVarD2.K(1);
            this.d = zgVarD2;
        }
        Paint paint = (Paint) zgVarD2.b;
        float strokeWidth = paint.getStrokeWidth();
        qik qikVar = (qik) nk7Var;
        float f = qikVar.a;
        if (strokeWidth != f) {
            zgVarD2.J(f);
        }
        int iS = zgVarD2.s();
        int i = qikVar.c;
        if (iS != i) {
            zgVarD2.H(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = qikVar.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iT = zgVarD2.t();
        int i2 = qikVar.d;
        if (iT == i2) {
            return zgVarD2;
        }
        zgVarD2.I(i2);
        return zgVarD2;
    }

    @Override // defpackage.mk7
    public final d2c getLayoutDirection() {
        return this.a.b;
    }

    @Override // defpackage.mk7
    public final void h0(long j, float f, long j2, nk7 nk7Var) {
        this.a.c.p(f, j2, a(this, j, nk7Var, 1.0f, 3));
    }

    @Override // defpackage.mk7
    public final void m(long j, float f, float f2, long j2, long j3, float f3, nk7 nk7Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.b(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, nk7Var, f3, 3));
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.a.a.n0();
    }

    @Override // defpackage.mk7
    public final void q(long j, long j2, long j3, float f, int i) {
        sh4 sh4Var = this.a.c;
        zg zgVarD = this.d;
        if (zgVarD == null) {
            zgVarD = na2.d();
            zgVarD.K(1);
            this.d = zgVarD;
        }
        Paint paint = (Paint) zgVarD.b;
        long jA = x7o.a.a(paint);
        int i2 = u95.h;
        if (!jgm.a(jA, j)) {
            zgVarD.D(j);
        }
        if (((Shader) zgVarD.c) != null) {
            zgVarD.G(null);
        }
        if (!Intrinsics.a((kh3) zgVarD.d, null)) {
            zgVarD.E(null);
        }
        if (zgVarD.a != 3) {
            zgVarD.C(3);
        }
        if (paint.getStrokeWidth() != f) {
            zgVarD.J(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (zgVarD.s() != i) {
            zgVarD.H(i);
        }
        if (zgVarD.t() != 0) {
            zgVarD.I(0);
        }
        if (!paint.isFilterBitmap()) {
            zgVarD.F(1);
        }
        sh4Var.s(j2, j3, zgVarD);
    }

    @Override // defpackage.mk7
    public final d5o s0() {
        return this.b;
    }
}
