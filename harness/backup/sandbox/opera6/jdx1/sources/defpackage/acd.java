package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class acd extends b8e implements e3c, lk7, nf9 {
    public final i37 A;
    public short q;
    public float r;
    public d3k v;
    public q3a w;
    public final t0g x;
    public byte o = 3;
    public short p = 1200;
    public final q0g s = new q0g(0);
    public final q0g t = new q0g(0);
    public final t0g u = hyg.k(Boolean.FALSE);
    public final t0g y = hyg.k(new ybd());
    public final cd1 z = ui6.a(0.0f);

    /* JADX WARN: Multi-variable type inference failed */
    public acd(int i, uac uacVar, float f) {
        this.q = i;
        this.r = f;
        this.x = hyg.k(uacVar);
        this.A = luj.b(new gv8(uacVar, this, (byte) 25));
    }

    @Override // defpackage.e3c
    public final int E(o1d o1dVar, pfd pfdVar, int i) {
        return pfdVar.c(Integer.MAX_VALUE);
    }

    @Override // defpackage.b8e
    public final void L0() {
        q3a q3aVar = this.w;
        a71 a71Var = ui6.f0(this).x;
        if (q3aVar != null) {
            a71Var.b(q3aVar);
        }
        this.w = a71Var.a();
        U0();
    }

    @Override // defpackage.b8e
    public final void M0() {
        d3k d3kVar = this.v;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.v = null;
        q3a q3aVar = this.w;
        if (q3aVar != null) {
            ui6.f0(this).x.b(q3aVar);
            this.w = null;
        }
    }

    @Override // defpackage.e3c
    public final int N(o1d o1dVar, pfd pfdVar, int i) {
        return 0;
    }

    public final int T0() {
        return ((Number) this.A.getValue()).intValue();
    }

    public final void U0() {
        d3k d3kVar = this.v;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        if (this.n) {
            this.v = na2.B(H0(), null, null, new p71(d3kVar, this, (mt5) null, (byte) 15), 3);
        }
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        ifg ifgVarN = pfdVar.N(yo5.a(0, Integer.MAX_VALUE, 0, 0, 13, j));
        int iG = ap5.g(ifgVarN.a, j);
        q0g q0gVar = this.t;
        q0gVar.i(iG);
        this.s.i(ifgVarN.a);
        return vfdVar.b0(q0gVar.h(), ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 9));
    }

    @Override // defpackage.e3c
    public final int f(o1d o1dVar, pfd pfdVar, int i) {
        return pfdVar.J(i);
    }

    @Override // defpackage.nf9
    public final void r(qg9 qg9Var) {
        this.u.setValue(Boolean.valueOf(qg9Var.d()));
    }

    @Override // defpackage.e3c
    public final int r0(o1d o1dVar, pfd pfdVar, int i) {
        return pfdVar.z(Integer.MAX_VALUE);
    }

    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) {
        float fH;
        float fFloatValue;
        int iH;
        long j;
        uh4 uh4Var = o3cVar.a;
        int iA = gh7.a(this.r, 0.0f);
        q0g q0gVar = this.t;
        cd1 cd1Var = this.z;
        q0g q0gVar2 = this.s;
        if (iA > 0) {
            int iOrdinal = o3cVar.getLayoutDirection().ordinal();
            if (iOrdinal == 0) {
                fH = ((Number) cd1Var.d()).floatValue();
            } else if (iOrdinal != 1) {
                h9o.p();
                return;
            } else {
                fFloatValue = (-((Number) cd1Var.d()).floatValue()) + (q0gVar2.h() << 1) + T0();
                iH = q0gVar.h();
                fH = fFloatValue - iH;
            }
        } else {
            int iOrdinal2 = o3cVar.getLayoutDirection().ordinal();
            if (iOrdinal2 == 0) {
                fH = (-((Number) cd1Var.d()).floatValue()) + q0gVar2.h() + T0();
            } else if (iOrdinal2 != 1) {
                h9o.p();
                return;
            } else {
                fFloatValue = ((Number) cd1Var.d()).floatValue() + q0gVar2.h();
                iH = q0gVar.h();
                fH = fFloatValue - iH;
            }
        }
        float f = fH;
        boolean z = f < ((float) q0gVar2.h());
        boolean z2 = ((float) q0gVar.h()) + f > ((float) (T0() + q0gVar2.h()));
        float fT0 = T0() + q0gVar2.h();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (uh4Var.e() & 4294967295L));
        q3a q3aVar = this.w;
        if (q3aVar != null) {
            j = 4294967295L;
            q3aVar.e(o3cVar, o3cVar.getLayoutDirection(), (q0gVar2.h() << 32) | (zed.b(fIntBitsToFloat) & 4294967295L), new yo7(o3cVar, o3cVar.b, new rkc(o3cVar, (byte) 15), (byte) 6));
        } else {
            j = 4294967295L;
        }
        float fH2 = q0gVar.h();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (uh4Var.e() & j));
        d5o d5oVar = uh4Var.b;
        long jD = d5oVar.D();
        d5oVar.A().j();
        try {
            ((wth) d5oVar.a).q(0.0f, 0.0f, fH2, fIntBitsToFloat2, 1);
            float f2 = -f;
            ((wth) uh4Var.b.a).P(f2, 0.0f);
            try {
                q3a q3aVar2 = this.w;
                if (q3aVar2 != null) {
                    if (z) {
                        cs5.x(o3cVar, q3aVar2);
                    }
                    if (z2) {
                        ((wth) uh4Var.b.a).P(fT0, 0.0f);
                        try {
                            cs5.x(o3cVar, q3aVar2);
                            ((wth) uh4Var.b.a).P(-fT0, -0.0f);
                        } finally {
                        }
                    }
                } else {
                    if (z) {
                        o3cVar.a();
                    }
                    if (z2) {
                        ((wth) uh4Var.b.a).P(fT0, 0.0f);
                        try {
                            o3cVar.a();
                            ((wth) uh4Var.b.a).P(-fT0, -0.0f);
                        } finally {
                        }
                    }
                }
            } finally {
                ((wth) uh4Var.b.a).P(-f2, -0.0f);
            }
        } finally {
            am2.w(d5oVar, jD);
        }
    }
}
