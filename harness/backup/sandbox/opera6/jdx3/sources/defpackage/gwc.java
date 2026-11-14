package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class gwc implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ja2 b;

    public /* synthetic */ gwc(ja2 ja2Var, byte b) {
        this.a = b;
        this.b = ja2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ja2 ja2Var = this.b;
        switch (b) {
            case 0:
                ((fwc) ja2Var).e.run();
                break;
            case 1:
                ((fwc) ja2Var).f.run();
                break;
            case 2:
                ((iwc) ja2Var).d.run();
                break;
            case 3:
                ((jwc) ja2Var).f.run();
                break;
            case 4:
                ((kwc) ja2Var).d.run();
                break;
            default:
                ((p6o) ja2Var).f.invoke();
                break;
        }
    }
}
