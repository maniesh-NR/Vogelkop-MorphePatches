package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class l85 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o24 b;

    public /* synthetic */ l85(o24 o24Var, byte b) {
        this.a = b;
        this.b = o24Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        bf bfVar = bf.a;
        o24 o24Var = this.b;
        switch (b) {
            case 0:
                o24Var.b.a.invoke(view, new ef(bfVar));
                break;
            default:
                o24Var.b.a.invoke(view, new ef(bfVar));
                break;
        }
    }
}
