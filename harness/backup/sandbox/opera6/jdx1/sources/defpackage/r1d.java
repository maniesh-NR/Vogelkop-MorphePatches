package defpackage;

/* loaded from: classes.dex */
public final class r1d implements b2c {
    public final q1d a;

    public r1d(q1d q1dVar) {
        this.a = q1dVar;
    }

    @Override // defpackage.b2c
    public final long B(long j) {
        return this.a.u.B(y8f.e(j, a()));
    }

    @Override // defpackage.b2c
    public final void D(float[] fArr) {
        this.a.u.D(fArr);
    }

    @Override // defpackage.b2c
    public final long K(long j) {
        return this.a.u.K(y8f.e(j, a()));
    }

    @Override // defpackage.b2c
    public final b2c R() {
        q1d q1dVarX0;
        if (!f()) {
            a8b.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        wye wyeVar = ((wye) this.a.u.u.F.e).w;
        if (wyeVar == null || (q1dVarX0 = wyeVar.X0()) == null) {
            return null;
        }
        return q1dVarX0.x;
    }

    @Override // defpackage.b2c
    public final long U(long j) {
        return this.a.u.U(y8f.e(j, a()));
    }

    public final long a() {
        q1d q1dVar = this.a;
        q1d q1dVarN = alo.N(q1dVar);
        return y8f.d(x(q1dVarN.x, 0L), q1dVar.u.x(q1dVarN.u, 0L));
    }

    @Override // defpackage.b2c
    public final boolean f() {
        return this.a.u.Z0().n;
    }

    @Override // defpackage.b2c
    public final void g(b2c b2cVar, float[] fArr) {
        this.a.u.g(b2cVar, fArr);
    }

    @Override // defpackage.b2c
    public final long h() {
        q1d q1dVar = this.a;
        return (q1dVar.a << 32) | (q1dVar.b & 4294967295L);
    }

    @Override // defpackage.b2c
    public final long l(long j) {
        return y8f.e(this.a.u.l(j), a());
    }

    @Override // defpackage.b2c
    public final long v(b2c b2cVar, long j) {
        return x(b2cVar, j);
    }

    @Override // defpackage.b2c
    public final long w(long j) {
        return y8f.e(this.a.u.w(j), a());
    }

    @Override // defpackage.b2c
    public final long x(b2c b2cVar, long j) {
        boolean z = b2cVar instanceof r1d;
        q1d q1dVar = this.a;
        if (!z) {
            q1d q1dVarN = alo.N(q1dVar);
            r1d r1dVar = q1dVarN.x;
            wye wyeVar = q1dVarN.u;
            long jX = x(r1dVar, j);
            long j2 = q1dVarN.v;
            long jD = y8f.d(jX, (Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L));
            if (!wyeVar.Z0().n) {
                a8b.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            wyeVar.j1();
            wye wyeVar2 = wyeVar.w;
            if (wyeVar2 != null) {
                wyeVar = wyeVar2;
            }
            return y8f.e(jD, wyeVar.x(b2cVar, 0L));
        }
        q1d q1dVar2 = ((r1d) b2cVar).a;
        wye wyeVar3 = q1dVar2.u;
        wyeVar3.j1();
        q1d q1dVarX0 = q1dVar.u.V0(wyeVar3).X0();
        if (q1dVarX0 != null) {
            long jB = ybb.b(ybb.c(q1dVar2.Q0(q1dVarX0, false), scd.f0(j)), q1dVar.Q0(q1dVarX0, false));
            return (Float.floatToRawIntBits((int) (jB >> 32)) << 32) | (Float.floatToRawIntBits((int) (jB & 4294967295L)) & 4294967295L);
        }
        q1d q1dVarN2 = alo.N(q1dVar2);
        long jC = ybb.c(ybb.c(q1dVar2.Q0(q1dVarN2, false), q1dVarN2.v), scd.f0(j));
        q1d q1dVarN3 = alo.N(q1dVar);
        long jB2 = ybb.b(jC, ybb.c(q1dVar.Q0(q1dVarN3, false), q1dVarN3.v));
        return q1dVarN3.u.w.x(q1dVarN2.u.w, (Float.floatToRawIntBits((int) (jB2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (jB2 & 4294967295L)) & 4294967295L));
    }

    @Override // defpackage.b2c
    public final voh y(b2c b2cVar, boolean z) {
        return this.a.u.y(b2cVar, z);
    }
}
