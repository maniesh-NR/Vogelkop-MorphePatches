package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class n6n implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tjn b;

    public /* synthetic */ n6n(tjn tjnVar, byte b) {
        this.a = b;
        this.b = tjnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        tjn tjnVar = this.b;
        switch (b) {
            case 0:
                tjnVar.i(view);
                break;
            case 1:
                tjnVar.b();
                break;
            case 2:
                tjnVar.g();
                break;
            default:
                tjnVar.k(view);
                break;
        }
    }
}
