package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class eqn implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lqn b;

    public /* synthetic */ eqn(lqn lqnVar, byte b) {
        this.a = b;
        this.b = lqnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        lqn lqnVar = this.b;
        switch (b) {
            case 0:
                lqnVar.w.k(b80.d);
                break;
            case 1:
                lqnVar.K0();
                break;
            case 2:
                vsn vsnVar = lqnVar.w;
                s62 s62Var = vsnVar.c;
                qyj qyjVarF = s62Var.f();
                qyjVarF.f();
                qyjVarF.m();
                s62Var.c().a(t52.k, null);
                vsnVar.k.c(l60.c);
                break;
            default:
                new xw(((tsn) xf8.B(r3.w.q).g()).a.e, (Object) new lrk(1, this.b, lqn.class, "onMenuItemClick", "onMenuItemClick(Landroid/view/MenuItem;)Z", 0, (byte) 20), (byte) 12).p(view);
                break;
        }
    }
}
