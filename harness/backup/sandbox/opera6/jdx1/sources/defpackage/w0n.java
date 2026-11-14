package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class w0n extends hyf {
    public final t0g f = hyg.k(new bpj(0));
    public final t0g g = hyg.k(Boolean.FALSE);
    public final p0n h;
    public final t0g i;
    public float j;
    public kh3 k;

    public w0n(y4a y4aVar) {
        p0n p0nVar = new p0n(y4aVar);
        p0nVar.f = new p7l(this, (byte) 29);
        this.h = p0nVar;
        this.i = new t0g(Unit.a, qs7.g);
        this.j = 1.0f;
    }

    @Override // defpackage.hyf
    public final boolean d(float f) {
        this.j = f;
        return true;
    }

    @Override // defpackage.hyf
    public final boolean e(kh3 kh3Var) {
        this.k = kh3Var;
        return true;
    }

    @Override // defpackage.hyf
    public final long h() {
        return ((bpj) this.f.getValue()).a;
    }

    @Override // defpackage.hyf
    public final void i(mk7 mk7Var) {
        kh3 kh3Var = this.k;
        p0n p0nVar = this.h;
        if (kh3Var == null) {
            kh3Var = (kh3) p0nVar.g.getValue();
        }
        if (((Boolean) this.g.getValue()).booleanValue() && mk7Var.getLayoutDirection() == d2c.b) {
            long jW0 = mk7Var.w0();
            d5o d5oVarS0 = mk7Var.s0();
            long jD = d5oVarS0.D();
            d5oVarS0.A().j();
            try {
                ((wth) d5oVarS0.a).N(-1.0f, 1.0f, jW0);
                p0nVar.e(mk7Var, this.j, kh3Var);
            } finally {
                am2.w(d5oVarS0, jD);
            }
        } else {
            p0nVar.e(mk7Var, this.j, kh3Var);
        }
        this.i.getValue();
    }
}
