package defpackage;

import ads_mobile_sdk.cg0;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class mso implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cg0 b;

    public /* synthetic */ mso(cg0 cg0Var, byte b) {
        this.a = b;
        this.b = cg0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        cg0 cg0Var = this.b;
        switch (b) {
            case 0:
                cg0Var.k.set(false);
                break;
            case 1:
                cg0Var.k.set(false);
                break;
            default:
                cg0Var.k.set(false);
                break;
        }
    }
}
