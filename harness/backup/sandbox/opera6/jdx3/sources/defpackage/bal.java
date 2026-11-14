package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final /* synthetic */ class bal implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gal b;

    public /* synthetic */ bal(gal galVar, byte b) {
        this.a = b;
        this.b = galVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        gal galVar = this.b;
        switch (b) {
            case 0:
                galVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                galVar.e();
                break;
            default:
                galVar.g.r((Float) valueAnimator.getAnimatedValue());
                galVar.d();
                break;
        }
    }
}
