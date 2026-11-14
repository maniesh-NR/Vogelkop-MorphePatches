package defpackage;

/* loaded from: classes.dex */
public final class jyf extends b8e implements e3c, lk7 {
    public hyf o;
    public boolean p;
    public td3 q;
    public kr5 r;
    public float s;
    public kh3 t;

    public static boolean U0(long j) {
        return !bpj.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean V0(long j) {
        return !bpj.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.e3c
    public final int E(o1d o1dVar, pfd pfdVar, int i) {
        if (!T0()) {
            return pfdVar.c(i);
        }
        long jW0 = W0(ap5.b(0, i, 0, 0, 13));
        return Math.max(yo5.i(jW0), pfdVar.c(i));
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.e3c
    public final int N(o1d o1dVar, pfd pfdVar, int i) {
        if (!T0()) {
            return pfdVar.E(i);
        }
        long jW0 = W0(ap5.b(0, 0, 0, i, 7));
        return Math.max(yo5.j(jW0), pfdVar.E(i));
    }

    public final boolean T0() {
        return this.p && this.o.h() != 9205357640488583168L;
    }

    public final long W0(long j) {
        boolean z = false;
        boolean z2 = yo5.d(j) && yo5.c(j);
        if (yo5.f(j) && yo5.e(j)) {
            z = true;
        }
        if ((!T0() && z2) || z) {
            return yo5.a(yo5.h(j), 0, yo5.g(j), 0, 10, j);
        }
        long jH = this.o.h();
        int iRound = V0(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : yo5.j(j);
        int iRound2 = U0(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : yo5.i(j);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(ap5.g(iRound, j)) << 32) | (Float.floatToRawIntBits(ap5.f(iRound2, j)) & 4294967295L);
        if (T0()) {
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(!V0(this.o.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.o.h() >> 32))) << 32) | (Float.floatToRawIntBits(!U0(this.o.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.o.h() & 4294967295L))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : fac.G(jFloatToRawIntBits2, this.r.g(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return yo5.a(ap5.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, ap5.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10, j);
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        ifg ifgVarN = pfdVar.N(W0(j));
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 10));
    }

    @Override // defpackage.e3c
    public final int f(o1d o1dVar, pfd pfdVar, int i) {
        if (!T0()) {
            return pfdVar.J(i);
        }
        long jW0 = W0(ap5.b(0, 0, 0, i, 7));
        return Math.max(yo5.j(jW0), pfdVar.J(i));
    }

    @Override // defpackage.e3c
    public final int r0(o1d o1dVar, pfd pfdVar, int i) {
        if (!T0()) {
            return pfdVar.z(i);
        }
        long jW0 = W0(ap5.b(0, i, 0, 0, 13));
        return Math.max(yo5.i(jW0), pfdVar.z(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.o + ", sizeToIntrinsics=" + this.p + ", alignment=" + this.q + ", alpha=" + this.s + ", colorFilter=" + this.t + ")";
    }

    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) {
        uh4 uh4Var = o3cVar.a;
        long jH = this.o.h();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(V0(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (uh4Var.e() >> 32))) << 32) | (Float.floatToRawIntBits(U0(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (uh4Var.e() & 4294967295L))) & 4294967295L);
        long jG = (Float.intBitsToFloat((int) (uh4Var.e() >> 32)) == 0.0f || Float.intBitsToFloat((int) (uh4Var.e() & 4294967295L)) == 0.0f) ? 0L : fac.G(jFloatToRawIntBits, this.r.g(jFloatToRawIntBits, uh4Var.e()));
        long jA = this.q.a((Math.round(Float.intBitsToFloat((int) (jG >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jG & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (uh4Var.e() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (uh4Var.e() & 4294967295L))) & 4294967295L), o3cVar.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((wth) uh4Var.b.a).P(f, f2);
        try {
            this.o.g(o3cVar, jG, this.s, this.t);
            ((wth) uh4Var.b.a).P(-f, -f2);
            o3cVar.a();
        } catch (Throwable th) {
            ((wth) uh4Var.b.a).P(-f, -f2);
            throw th;
        }
    }
}
