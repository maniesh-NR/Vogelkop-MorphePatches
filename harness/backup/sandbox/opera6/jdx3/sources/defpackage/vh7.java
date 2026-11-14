package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final /* synthetic */ class vh7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xh7 b;

    public /* synthetic */ vh7(xh7 xh7Var, byte b) {
        this.a = b;
        this.b = xh7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        xh7 xh7Var = this.b;
        switch (b) {
            case 0:
                xh7Var.c();
                break;
            case 1:
                xh7Var.c();
                break;
            case 2:
                xh7Var.c();
                break;
            default:
                xh7Var.c();
                break;
        }
    }
}
