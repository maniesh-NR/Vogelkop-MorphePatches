package defpackage;

/* loaded from: classes.dex */
public final class gr5 extends b8e implements lk7, e3c, i0j {
    public td3 o;
    public kr5 p;
    public kh3 r;
    public String t;
    public cp5 u;
    public final od2 v;
    public float q = 1.0f;
    public boolean s = true;

    public gr5(od2 od2Var, td3 td3Var, kr5 kr5Var, kh3 kh3Var, String str, cp5 cp5Var) {
        this.o = td3Var;
        this.p = kr5Var;
        this.r = kh3Var;
        this.t = str;
        this.u = cp5Var;
        this.v = od2Var;
    }

    @Override // defpackage.e3c
    public final int E(o1d o1dVar, pfd pfdVar, int i) {
        long jB = ap5.b(0, i, 0, 0, 13);
        cp5 cp5Var = this.u;
        if (cp5Var != null) {
            cp5Var.h(jB);
        }
        if (this.v.h() == 9205357640488583168L) {
            return pfdVar.c(i);
        }
        long jU0 = U0(jB);
        return Math.max(yo5.i(jU0), pfdVar.c(i));
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.b8e
    public final void L0() {
        nx5 nx5VarH0 = H0();
        od2 od2Var = this.v;
        od2Var.l = nx5VarH0;
        od2Var.a();
    }

    @Override // defpackage.b8e
    public final void M0() {
        this.v.c();
    }

    @Override // defpackage.e3c
    public final int N(o1d o1dVar, pfd pfdVar, int i) {
        long jB = ap5.b(0, 0, 0, i, 7);
        cp5 cp5Var = this.u;
        if (cp5Var != null) {
            cp5Var.h(jB);
        }
        if (this.v.h() == 9205357640488583168L) {
            return pfdVar.E(i);
        }
        long jU0 = U0(jB);
        return Math.max(yo5.j(jU0), pfdVar.E(i));
    }

    @Override // defpackage.b8e
    public final void N0() {
        this.v.l(null);
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        String str = this.t;
        if (str != null) {
            o0j.d(q0jVar, str);
            o0j.h(q0jVar, 5);
        }
    }

    public final long T0(long j) {
        if (bpj.e(j)) {
            return 0L;
        }
        long jH = this.v.h();
        if (jH != 9205357640488583168L) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
            if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
            if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
            long jG = this.p.g(jFloatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (jG >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & jG))) <= Float.MAX_VALUE) {
                return fac.G(jFloatToRawIntBits, jG);
            }
        }
        return j;
    }

    public final long U0(long j) {
        float fJ;
        int i;
        float fB;
        boolean zF = yo5.f(j);
        boolean zE = yo5.e(j);
        if (!zF || !zE) {
            boolean z = yo5.d(j) && yo5.c(j);
            od2 od2Var = this.v;
            long jH = od2Var.h();
            if (jH != 9205357640488583168L) {
                if (z && (zF || zE)) {
                    fJ = yo5.h(j);
                    i = yo5.g(j);
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
                    if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                        int i2 = kzm.b;
                        fJ = djh.b(fIntBitsToFloat, yo5.j(j), yo5.h(j));
                    } else {
                        fJ = yo5.j(j);
                    }
                    if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                        int i3 = kzm.b;
                        fB = djh.b(fIntBitsToFloat2, yo5.i(j), yo5.g(j));
                        long jT0 = T0((Float.floatToRawIntBits(fJ) << 32) | (Float.floatToRawIntBits(fB) & 4294967295L));
                        return yo5.a(ap5.g(zed.b(Float.intBitsToFloat((int) (jT0 >> 32))), j), 0, ap5.f(zed.b(Float.intBitsToFloat((int) (jT0 & 4294967295L))), j), 0, 10, j);
                    }
                    i = yo5.i(j);
                }
                fB = i;
                long jT02 = T0((Float.floatToRawIntBits(fJ) << 32) | (Float.floatToRawIntBits(fB) & 4294967295L));
                return yo5.a(ap5.g(zed.b(Float.intBitsToFloat((int) (jT02 >> 32))), j), 0, ap5.f(zed.b(Float.intBitsToFloat((int) (jT02 & 4294967295L))), j), 0, 10, j);
            }
            if (z && ((nd2) od2Var.t.a.getValue()).a() != null) {
                return yo5.a(yo5.h(j), 0, yo5.g(j), 0, 10, j);
            }
        }
        return j;
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        cp5 cp5Var = this.u;
        if (cp5Var != null) {
            cp5Var.h(j);
        }
        ifg ifgVarN = pfdVar.N(U0(j));
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 0));
    }

    @Override // defpackage.e3c
    public final int f(o1d o1dVar, pfd pfdVar, int i) {
        long jB = ap5.b(0, 0, 0, i, 7);
        cp5 cp5Var = this.u;
        if (cp5Var != null) {
            cp5Var.h(jB);
        }
        if (this.v.h() == 9205357640488583168L) {
            return pfdVar.J(i);
        }
        long jU0 = U0(jB);
        return Math.max(yo5.j(jU0), pfdVar.J(i));
    }

    @Override // defpackage.e3c
    public final int r0(o1d o1dVar, pfd pfdVar, int i) {
        long jB = ap5.b(0, i, 0, 0, 13);
        cp5 cp5Var = this.u;
        if (cp5Var != null) {
            cp5Var.h(jB);
        }
        if (this.v.h() == 9205357640488583168L) {
            return pfdVar.z(i);
        }
        long jU0 = U0(jB);
        return Math.max(yo5.i(jU0), pfdVar.z(i));
    }

    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) {
        uh4 uh4Var = o3cVar.a;
        long jT0 = T0(uh4Var.e());
        long jA = this.o.a(kzm.b(jT0), kzm.b(uh4Var.e()), o3cVar.getLayoutDirection());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        d5o d5oVar = uh4Var.b;
        long jD = d5oVar.D();
        d5oVar.A().j();
        try {
            wth wthVar = (wth) d5oVar.a;
            d5o d5oVar2 = (d5o) wthVar.b;
            if (this.s) {
                wthVar.q(0.0f, 0.0f, Float.intBitsToFloat((int) (d5oVar2.D() >> 32)), Float.intBitsToFloat((int) (d5oVar2.D() & 4294967295L)), 1);
            }
            wthVar.P(i, i2);
            this.v.g(o3cVar, jT0, this.q, this.r);
            d5oVar.A().f();
            d5oVar.K(jD);
            o3cVar.a();
        } catch (Throwable th) {
            am2.w(d5oVar, jD);
            throw th;
        }
    }
}
