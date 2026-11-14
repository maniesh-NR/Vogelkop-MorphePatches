package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class e0b implements ValueAnimator.AnimatorUpdateListener {
    public float a = 0.0f;
    public float b = 0.0f;
    public final /* synthetic */ ValueAnimator c;
    public final /* synthetic */ ValueAnimator d;
    public final /* synthetic */ ydb e;

    public e0b(ydb ydbVar, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        this.e = ydbVar;
        this.c = valueAnimator;
        this.d = valueAnimator2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) this.c.getAnimatedValue()).floatValue();
        float fFloatValue2 = ((Float) this.d.getAnimatedValue()).floatValue();
        double d = fFloatValue - this.a;
        double d2 = fFloatValue2 - this.b;
        ydb ydbVar = this.e;
        ydbVar.k(d, d2);
        this.a = fFloatValue;
        this.b = fFloatValue2;
        ydbVar.postInvalidateOnAnimation();
    }
}
