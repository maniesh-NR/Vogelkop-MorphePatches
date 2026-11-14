package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class kz0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Dialog c;

    public /* synthetic */ kz0(Object obj, Dialog dialog, byte b) {
        this.a = b;
        this.b = obj;
        this.c = dialog;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        bz0 bz0Var = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((nz0) obj).onShowDialog(bz0Var);
                break;
            case 1:
                ((c63) obj).i0(bz0Var.getContext().getResources().getConfiguration().screenHeightDp >= 500);
                break;
            default:
                bz0 bz0Var2 = bz0Var;
                bz0Var2.f(-1).setOnClickListener(new yk4((l18) obj, bz0Var2));
                break;
        }
    }
}
