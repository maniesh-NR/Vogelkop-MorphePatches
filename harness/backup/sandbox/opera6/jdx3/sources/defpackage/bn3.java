package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class bn3 extends nz0 {
    public final wm3 a;
    public final int b;

    public bn3(wm3 wm3Var, int i) {
        super(false, false);
        this.a = wm3Var;
        this.b = i;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132018111);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132018378);
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        az0Var.a.f = az0Var.getContext().getResources().getString(2132018073, Integer.valueOf(this.b));
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        this.a.run();
    }
}
