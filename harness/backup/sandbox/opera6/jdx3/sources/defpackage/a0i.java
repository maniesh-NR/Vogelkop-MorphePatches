package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class a0i extends nz0 {
    public bz0 a;
    public final pjg b;
    public final y1n c;
    public boolean d;
    public boolean e;

    public a0i(pjg pjgVar, y1n y1nVar) {
        super(false, false);
        this.b = pjgVar;
        this.c = y1nVar;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132020043);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132022064);
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        az0Var.b(2132021700);
        Context context = az0Var.getContext();
        yq1 yq1VarJ = phj.J(context);
        phj.b0(yq1VarJ, context.getString(2132021698) + "\n\n" + context.getString(2132021699), new zzh(this, (byte) 0));
        az0Var.setView(yq1VarJ);
    }

    @Override // defpackage.nz0
    public final void onDialogCreated(bz0 bz0Var) {
        super.onDialogCreated(bz0Var);
        this.a = bz0Var;
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        this.a = null;
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) throws Resources.NotFoundException {
        y1n y1nVar;
        pjg pjgVar;
        super.onFinished(hjmVar);
        if (this.d && (pjgVar = this.b) != null) {
            pjgVar.run();
        }
        if (!this.e || (y1nVar = this.c) == null) {
            return;
        }
        y1nVar.run();
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        this.d = true;
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        this.e = true;
    }
}
