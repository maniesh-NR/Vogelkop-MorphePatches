package defpackage;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class mz0 implements DialogInterface.OnClickListener {
    public final bz0 a;
    public final /* synthetic */ nz0 b;

    public mz0(nz0 nz0Var, bz0 bz0Var) {
        this.b = nz0Var;
        this.a = bz0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        hjm hjmVar = hjm.a;
        nz0 nz0Var = this.b;
        nz0Var.mDismissReason = hjmVar;
        bz0 bz0Var = this.a;
        if (i == -3) {
            nz0Var.onNeutralButtonClicked(bz0Var);
        } else if (i == -2) {
            nz0Var.onNegativeButtonClicked(bz0Var);
        } else {
            if (i != -1) {
                return;
            }
            nz0Var.onPositiveButtonClicked(bz0Var);
        }
    }
}
