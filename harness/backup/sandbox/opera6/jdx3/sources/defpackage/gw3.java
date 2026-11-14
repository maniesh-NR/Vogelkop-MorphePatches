package defpackage;

import android.app.Dialog;

/* loaded from: classes.dex */
public final /* synthetic */ class gw3 implements qcf, vwh {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tw3 b;

    public /* synthetic */ gw3(tw3 tw3Var, byte b) {
        this.a = b;
        this.b = tw3Var;
    }

    @Override // defpackage.qcf
    public final void a(Dialog dialog) {
        byte b = this.a;
        tw3 tw3Var = this.b;
        switch (b) {
            case 0:
                tw3Var.a.h().v(dialog);
                break;
            case 1:
            default:
                tw3Var.a.h().v(dialog);
                break;
            case 2:
                tw3Var.a.h().v(dialog);
                break;
            case 3:
                tw3Var.a.h().v(dialog);
                break;
        }
    }

    @Override // defpackage.vwh
    public final void f(o93 o93Var) {
        ysj ysjVarJ0 = this.b.b.J0();
        ysjVarJ0.getClass();
        ysjVarJ0.b(o93Var, ijm.b);
    }
}
