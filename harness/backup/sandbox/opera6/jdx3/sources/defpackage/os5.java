package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class os5 extends k73 {
    public final ns5 g;

    public os5(ns5 ns5Var, ViewGroup viewGroup, tn tnVar, g1j g1jVar, jv0 jv0Var) {
        super(viewGroup, tnVar, g1jVar, jv0Var, wln.h);
        this.g = ns5Var;
        ns5Var.h.add(0, this);
    }

    @Override // defpackage.k73
    public final boolean o() {
        this.g.h.remove(this);
        return true;
    }

    @Override // defpackage.k73
    public final void t(ge5 ge5Var) {
        this.g.t(ge5Var);
    }

    @Override // defpackage.k73
    public final void u(ge5 ge5Var) {
        this.g.u(ge5Var);
    }

    @Override // defpackage.k73
    public final void v(int i, ks5 ks5Var, ls5 ls5Var) {
        this.g.v(i, ks5Var, ls5Var);
    }
}
