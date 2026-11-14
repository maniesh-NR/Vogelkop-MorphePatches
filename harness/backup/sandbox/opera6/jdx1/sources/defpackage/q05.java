package defpackage;

import ads_mobile_sdk.pd;

/* loaded from: classes.dex */
public final class q05 extends hyf {
    public final hyf f;
    public final long g;

    public q05(hyf hyfVar, long j) {
        this.f = hyfVar;
        this.g = j;
    }

    @Override // defpackage.hyf
    public final void i(mk7 mk7Var) {
        mk7 mk7Var2;
        hyf hyfVar = this.f;
        if (hyfVar != null) {
            mk7Var2 = mk7Var;
            hyfVar.g(mk7Var2, mk7Var.e(), 1.0f, null);
        } else {
            mk7Var2 = mk7Var;
        }
        float fO0 = mk7Var2.o0(1.0f);
        mk7 mk7Var3 = mk7Var2;
        mk7.I(mk7Var3, this.g, (bpj.c(mk7Var2.e()) - fO0) / 2.0f, 0L, new qik(0, 0, fO0, 0.0f, 30), pd.i1);
    }
}
