package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class zr implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ as b;

    public /* synthetic */ zr(as asVar, byte b) {
        this.a = b;
        this.b = asVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        as asVar = this.b;
        switch (b) {
            case 0:
                q9n.u(view);
                asVar.D.c(new px7(), asVar.getViewLifecycleOwner(), new pb(new z3(asVar, (byte) 7), (byte) 2));
                break;
            default:
                asVar.Q0();
                break;
        }
    }
}
