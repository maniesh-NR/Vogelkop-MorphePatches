package defpackage;

import J.N;
import android.content.Context;
import com.opera.android.browser.chromium.PermissionDialogDelegate;

/* loaded from: classes.dex */
public final class u9g extends nz0 {
    public final int a;
    public final int b;
    public final String c;
    public final ole d;

    public u9g(int i, int i2, String str, ole oleVar) {
        super(false, false);
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = oleVar;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132018541);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132017536);
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        Context context = az0Var.getContext();
        az0 title = az0Var.setTitle(context.getResources().getString(this.a));
        title.a.f = context.getResources().getString(this.b, this.c);
    }

    @Override // defpackage.nz0
    public final void onDialogCreated(bz0 bz0Var) {
        bz0Var.setCanceledOnTouchOutside(false);
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        if (hjmVar == hjm.b) {
            N.MLtgcrys(((PermissionDialogDelegate) this.d.a).a);
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        N.MNhLbmh0(((PermissionDialogDelegate) this.d.a).a);
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        N.M9O4cgPp(((PermissionDialogDelegate) this.d.a).a);
    }

    @Override // defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) {
        phj.Q(bz0Var, true);
    }
}
