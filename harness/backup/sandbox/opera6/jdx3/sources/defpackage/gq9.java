package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class gq9 implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ hq9 a;

    public gq9(hq9 hq9Var) {
        this.a = hq9Var;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        hq9 hq9Var = this.a;
        xy0 xy0Var = hq9Var.i;
        if (i != hq9Var.h) {
            xy0Var.removeMessages(3);
            xy0Var.sendEmptyMessage(3);
        }
    }
}
