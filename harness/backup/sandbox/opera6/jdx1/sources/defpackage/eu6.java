package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class eu6 implements ble {
    public final gu6 a;
    public final d2c b;

    public eu6(gu6 gu6Var, d2c d2cVar) {
        fsf fsfVar = fsf.a;
        this.a = gu6Var;
        this.b = d2cVar;
    }

    @Override // defpackage.ble
    public final Object B0(long j, long j2, mt5 mt5Var) {
        fsf fsfVar = fsf.a;
        fsf fsfVar2 = fsf.a;
        return new i1n(i1n.a(j2, 0.0f, 0.0f, 1));
    }

    @Override // defpackage.ble
    public final long K(int i, long j, long j2) {
        if (i != 2) {
            return 0L;
        }
        fsf fsfVar = fsf.a;
        if (Float.intBitsToFloat((int) (j2 >> 32)) != 0.0f) {
            throw new CancellationException("Scroll cancelled");
        }
        return 0L;
    }

    @Override // defpackage.ble
    public final long v(int i, long j) {
        fsf fsfVar = fsf.a;
        if (i != 1) {
            return 0L;
        }
        gu6 gu6Var = this.a;
        if (Math.abs(gu6Var.l()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0L;
        }
        jxf jxfVarM = gu6Var.m();
        float fL = gu6Var.l() * gu6Var.o();
        float f = ((jxfVarM.b + jxfVarM.c) * (-Math.signum(gu6Var.l()))) + fL;
        if (gu6Var.l() > 0.0f) {
            fL = f;
            f = fL;
        }
        float fB = djh.b(Float.intBitsToFloat(i2), fL, f);
        boolean z = this.b == d2c.b;
        fv6 fv6Var = gu6Var.k;
        float fE = z ? fv6Var.e(fB) : -fv6Var.e(-fB);
        fsf fsfVar2 = fsf.a;
        return (Float.floatToRawIntBits(fE) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L);
    }
}
