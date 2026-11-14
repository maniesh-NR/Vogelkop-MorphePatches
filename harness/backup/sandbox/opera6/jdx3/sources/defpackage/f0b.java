package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class f0b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ydb c;

    public f0b(ydb ydbVar, float f, float f2) {
        this.c = ydbVar;
        this.a = f;
        this.b = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = this.a;
        float f2 = this.b;
        ydb ydbVar = this.c;
        ydbVar.o(fFloatValue, f, f2);
        ydbVar.postInvalidateOnAnimation();
    }
}
