package defpackage;

/* loaded from: classes.dex */
public final class o3c implements mk7 {
    public final uh4 a = new uh4();
    public lk7 b;

    @Override // defpackage.mk7
    public final void C0(long j, long j2, long j3, float f, int i) {
        this.a.C0(j, j2, j3, f, i);
    }

    @Override // defpackage.mk7
    public final void H(long j, long j2, long j3, long j4, nk7 nk7Var) {
        this.a.H(j, j2, j3, j4, nk7Var);
    }

    @Override // defpackage.mk7
    public final void L(j71 j71Var, long j, long j2, long j3, float f, kh3 kh3Var, int i) {
        this.a.L(j71Var, j, j2, j3, f, kh3Var, i);
    }

    @Override // defpackage.n27
    public final int M(float f) {
        return this.a.M(f);
    }

    @Override // defpackage.mk7
    public final void P(dz3 dz3Var, long j, long j2, float f, nk7 nk7Var) {
        this.a.P(dz3Var, j, j2, f, nk7Var);
    }

    @Override // defpackage.n27
    public final float Q(long j) {
        return this.a.Q(j);
    }

    @Override // defpackage.mk7
    public final void S(d91 d91Var, dz3 dz3Var, float f, nk7 nk7Var, int i) {
        this.a.S(d91Var, dz3Var, f, nk7Var, i);
    }

    @Override // defpackage.mk7
    public final void T(d91 d91Var, long j, float f, nk7 nk7Var) {
        this.a.T(d91Var, j, f, nk7Var);
    }

    public final void a() {
        uh4 uh4Var = this.a;
        d5o d5oVar = uh4Var.b;
        sh4 sh4VarA = uh4Var.b.A();
        f17 f17Var = this.b;
        if (f17Var == null) {
            throw vep.q("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        b8e b8eVar = (b8e) f17Var;
        b8e b8eVarU = b8eVar.a.f;
        if (b8eVarU == null || (b8eVarU.d & 4) == 0) {
            b8eVarU = null;
        } else {
            while (b8eVarU != null) {
                int i = b8eVarU.c;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    b8eVarU = b8eVarU.f;
                }
            }
            b8eVarU = null;
        }
        if (b8eVarU == null) {
            wye wyeVarC0 = ui6.c0(f17Var, 4);
            if (wyeVarC0.Z0() == b8eVar.a) {
                wyeVarC0 = wyeVarC0.v;
            }
            wyeVarC0.p1(sh4VarA, (q3a) d5oVar.b);
            return;
        }
        dfe dfeVar = null;
        while (b8eVarU != null) {
            if (b8eVarU instanceof lk7) {
                lk7 lk7Var = (lk7) b8eVarU;
                q3a q3aVar = (q3a) d5oVar.b;
                wye wyeVarC02 = ui6.c0(lk7Var, 4);
                long jG0 = fr3.g0(wyeVarC02.c);
                m3c m3cVar = wyeVarC02.u;
                m3cVar.getClass();
                p3c.a(m3cVar).o().s.c(sh4VarA, jG0, wyeVarC02, lk7Var, q3aVar);
            } else if ((b8eVarU.c & 4) != 0 && (b8eVarU instanceof i17)) {
                int i2 = 0;
                for (b8e b8eVar2 = ((i17) b8eVarU).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                    if ((b8eVar2.c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            b8eVarU = b8eVar2;
                        } else {
                            if (dfeVar == null) {
                                dfeVar = new dfe(new b8e[16]);
                            }
                            if (b8eVarU != null) {
                                dfeVar.c(b8eVarU);
                                b8eVarU = null;
                            }
                            dfeVar.c(b8eVar2);
                        }
                    }
                }
                if (i2 != 1) {
                }
            }
            b8eVarU = ui6.U(dfeVar);
        }
    }

    @Override // defpackage.n27
    public final float b() {
        return this.a.b();
    }

    public final void c(sh4 sh4Var, long j, wye wyeVar, lk7 lk7Var, q3a q3aVar) {
        lk7 lk7Var2 = this.b;
        this.b = lk7Var;
        d2c d2cVar = wyeVar.u.z;
        d5o d5oVar = this.a.b;
        th4 th4Var = ((uh4) d5oVar.c).a;
        n27 n27Var = th4Var.a;
        d2c d2cVar2 = th4Var.b;
        sh4 sh4VarA = d5oVar.A();
        long jD = d5oVar.D();
        q3a q3aVar2 = (q3a) d5oVar.b;
        d5oVar.I(wyeVar);
        d5oVar.J(d2cVar);
        d5oVar.H(sh4Var);
        d5oVar.K(j);
        d5oVar.b = q3aVar;
        sh4Var.j();
        try {
            lk7Var.v0(this);
            sh4Var.f();
            d5oVar.I(n27Var);
            d5oVar.J(d2cVar2);
            d5oVar.H(sh4VarA);
            d5oVar.K(jD);
            d5oVar.b = q3aVar2;
            this.b = lk7Var2;
        } catch (Throwable th) {
            sh4Var.f();
            d5oVar.I(n27Var);
            d5oVar.J(d2cVar2);
            d5oVar.H(sh4VarA);
            d5oVar.K(jD);
            d5oVar.b = q3aVar2;
            throw th;
        }
    }

    public final void d(dz3 dz3Var, long j, long j2, long j3, float f, nk7 nk7Var) {
        uh4 uh4Var = this.a;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        uh4Var.a.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), uh4Var.c(dz3Var, nk7Var, f, null, 3, 1));
    }

    @Override // defpackage.mk7
    public final long e() {
        return this.a.e();
    }

    @Override // defpackage.mk7
    public final d2c getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // defpackage.mk7
    public final void h0(long j, float f, long j2, nk7 nk7Var) {
        this.a.h0(j, f, j2, nk7Var);
    }

    @Override // defpackage.n27
    public final long j(float f) {
        return this.a.j(f);
    }

    @Override // defpackage.n27
    public final float j0(int i) {
        return this.a.j0(i);
    }

    @Override // defpackage.n27
    public final long k(long j) {
        return this.a.k(j);
    }

    @Override // defpackage.n27
    public final float k0(float f) {
        return f / this.a.b();
    }

    @Override // defpackage.mk7
    public final void m(long j, float f, float f2, long j2, long j3, float f3, nk7 nk7Var) {
        this.a.m(j, f, f2, j2, j3, f3, nk7Var);
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.a.n0();
    }

    @Override // defpackage.n27
    public final float o(long j) {
        return this.a.o(j);
    }

    @Override // defpackage.n27
    public final float o0(float f) {
        return this.a.b() * f;
    }

    @Override // defpackage.mk7
    public final void q(long j, long j2, long j3, float f, int i) {
        this.a.q(j, j2, j3, f, i);
    }

    @Override // defpackage.mk7
    public final d5o s0() {
        return this.a.b;
    }

    @Override // defpackage.n27
    public final int t0(long j) {
        return this.a.t0(j);
    }

    @Override // defpackage.n27
    public final long u(float f) {
        return this.a.u(f);
    }

    @Override // defpackage.mk7
    public final long w0() {
        return this.a.w0();
    }

    @Override // defpackage.n27
    public final long y0(long j) {
        return this.a.y0(j);
    }
}
