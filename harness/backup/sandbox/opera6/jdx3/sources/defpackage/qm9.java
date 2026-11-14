package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class qm9 implements vwh, btj {
    public final View a;
    public final nv6 b = new nv6(this);
    public o93 c;
    public gtj d;
    public mim e;
    public boolean f;
    public View g;

    public qm9(View view) {
        this.a = view;
    }

    @Override // defpackage.btj
    public final void I() {
        this.f = true;
        o93 o93Var = this.c;
        if (o93Var != null) {
            o93Var.b(hjm.b, 3);
            this.c = null;
        }
        this.f = false;
    }

    @Override // defpackage.vwh
    public final void f(o93 o93Var) {
        I();
        this.c = o93Var;
        o93Var.b = this.b;
        gtj gtjVarE = o93Var.e(this.a);
        gtjVarE.a.a(new pt(o93Var, (byte) 1));
        this.d = gtjVarE;
        gtjVarE.j();
    }

    @Override // defpackage.btj
    public final int z(o93 o93Var, mim mimVar) {
        this.e = mimVar;
        if (this.c != null) {
            return 2;
        }
        this.c = o93Var;
        o93Var.b = this.b;
        View view = this.a;
        gtj gtjVarE = o93Var.e(view);
        gtjVarE.a.a(new pt(o93Var, (byte) 1));
        this.d = gtjVarE;
        View view2 = this.g;
        if (view2 != null) {
            gtjVarE.a.f(view2);
        }
        if (view.getElevation() > 0.0f) {
            this.d.b(view);
        }
        this.d.j();
        return 1;
    }
}
