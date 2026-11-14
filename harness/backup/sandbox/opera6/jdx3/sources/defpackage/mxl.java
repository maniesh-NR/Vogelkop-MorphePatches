package defpackage;

/* loaded from: classes.dex */
public final class mxl extends gxl {
    public final bf9 a;
    public final x5f b;

    public mxl(bf9 bf9Var, x5f x5fVar) {
        this.a = bf9Var;
        this.b = x5fVar;
    }

    public final void a() {
        boolean z = this.a.r() == 2;
        x5f x5fVar = this.b;
        if (x5fVar.h) {
            xt0 xt0Var = new xt0(2443, 1, 5);
            h66 h66Var = (h66) xt0Var.n(3);
            if (h66Var == null) {
                xt0Var.q(3, 1, new h66(2443, 1, 14));
                h66Var = (h66) xt0Var.n(3);
            }
            h66Var.r(8, 1, z);
            x56 x56VarF = zpa.F();
            x56VarF.q(41, 1, xt0Var);
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.gxl, defpackage.hxl
    public final void i() {
        a();
    }

    @Override // defpackage.gxl, defpackage.hxl
    public final void x(int i) {
        a();
    }
}
