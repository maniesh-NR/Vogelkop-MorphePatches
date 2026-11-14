package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ol5 extends nz0 {
    public final nrl a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public boolean g;

    public ol5(int i, int i2, int i3, nl5 nl5Var, boolean z) {
        super(false, false);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = 2132018111;
        this.a = new nrl(nl5Var);
        this.f = z;
    }

    public ol5(int i, int i2, nl5 nl5Var) {
        this(0, i, i2, nl5Var, false);
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(this.e);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(this.d);
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        az0Var.a(this.c);
        int i = this.b;
        if (i != 0) {
            az0Var.b(i);
        }
    }

    @Override // defpackage.nz0
    public final void onDialogCreated(bz0 bz0Var) {
        bz0Var.setCanceledOnTouchOutside(this.f);
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        this.a.b(3);
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        this.a.b(2);
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        this.a.b(1);
    }

    @Override // defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) {
        q9n.h(bz0Var.getContext());
    }

    @Override // defpackage.nz0
    public final boolean useTapStealingProtection() {
        return this.g;
    }
}
