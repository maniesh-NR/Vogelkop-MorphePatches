package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class rjk extends i17 implements omg, nf9, mg9 {
    public Function0 q;
    public boolean r;
    public final vuk s;

    public rjk(Function0 function0) throws pxb {
        this.q = function0;
        u51 u51Var = new u51(this, (byte) 5);
        fmg fmgVar = ruk.a;
        vuk vukVar = new vuk(null, null, u51Var);
        T0(vukVar);
        this.s = vukVar;
    }

    @Override // defpackage.omg
    public final long Y() {
        lh7 lh7Var = jpo.g;
        n27 n27Var = ui6.e0(this).y;
        lh7Var.getClass();
        int i = uwl.b;
        return y4h.l(n27Var.M(10.0f), n27Var.M(40.0f), n27Var.M(10.0f), n27Var.M(40.0f));
    }

    @Override // defpackage.omg
    public final void g0() {
        this.s.g0();
    }

    @Override // defpackage.omg
    public final void n(fmg fmgVar, gmg gmgVar, long j) {
        this.s.n(fmgVar, gmgVar, j);
    }

    @Override // defpackage.nf9
    public final void r(qg9 qg9Var) {
        this.r = qg9Var.g();
    }
}
