package defpackage;

import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class ep1 implements pcf {
    public final /* synthetic */ fp1 a;

    public ep1(fp1 fp1Var) {
        this.a = fp1Var;
    }

    @Override // defpackage.pcf
    public final void a(xd5 xd5Var) {
        fp1 fp1Var = this.a;
        pp1 delegate = fp1Var.getDelegate();
        xp1 xp1Var = (xp1) delegate;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(xp1Var.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(xp1Var);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        fp1Var.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}
