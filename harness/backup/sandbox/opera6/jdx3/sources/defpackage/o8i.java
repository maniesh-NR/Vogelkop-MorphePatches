package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class o8i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public final ValueAnimator a;
    public final p8i b;

    public o8i(p8i p8iVar, int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.a = valueAnimator;
        this.b = p8iVar;
        valueAnimator.setDuration(200L);
        valueAnimator.setIntValues(i);
        valueAnimator.setInterpolator(s8i.d);
        valueAnimator.end();
        valueAnimator.addListener(this);
        valueAnimator.addUpdateListener(this);
        onAnimationUpdate(valueAnimator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.invalidateSelf();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.invalidateSelf();
    }
}
