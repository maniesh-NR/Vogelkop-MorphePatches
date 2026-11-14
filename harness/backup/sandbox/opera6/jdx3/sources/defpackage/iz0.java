package defpackage;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class iz0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ zp1 c;

    public /* synthetic */ iz0(Object obj, zp1 zp1Var, byte b) {
        this.a = b;
        this.b = obj;
        this.c = zp1Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        bz0 bz0Var = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                nz0 nz0Var = (nz0) obj;
                hjm hjmVar = nz0Var.mDismissReason;
                nz0Var.onDismissDialog(bz0Var, hjmVar);
                nz0Var.finish(hjmVar);
                break;
            default:
                ((av2) obj).f(((ev2) bz0Var).z);
                break;
        }
    }
}
