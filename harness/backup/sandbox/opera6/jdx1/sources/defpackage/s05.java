package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class s05 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ u05 a;
    public final /* synthetic */ x05 b;

    public s05(x05 x05Var, u05 u05Var) {
        this.b = x05Var;
        this.a = u05Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        u05 u05Var = this.a;
        x05.e(fFloatValue, u05Var);
        x05 x05Var = this.b;
        x05Var.a(fFloatValue, u05Var, false);
        x05Var.invalidateSelf();
    }
}
