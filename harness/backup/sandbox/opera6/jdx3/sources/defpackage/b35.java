package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class b35 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e35 b;

    public /* synthetic */ b35(e35 e35Var, byte b) {
        this.a = b;
        this.b = e35Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        e35 e35Var = this.b;
        switch (b) {
            case 0:
                new d35(e35Var).run();
                break;
            case 1:
                e35Var.l0(false);
                break;
            default:
                e35Var.J0();
                break;
        }
    }
}
