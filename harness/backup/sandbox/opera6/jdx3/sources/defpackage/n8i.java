package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class n8i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int f = 0;
    public final ValueAnimator a;
    public final p8i b;
    public final Paint c;
    public final boolean d;
    public short e;

    public n8i(p8i p8iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.a = valueAnimator;
        Paint paint = new Paint();
        this.c = paint;
        this.b = p8iVar;
        this.d = Color.alpha(p8iVar.a.getPixel(0, 0)) == 0;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        valueAnimator.setDuration(200L);
        valueAnimator.setIntValues(this.e);
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
        int iIntValue = !this.d ? 0 : ((Integer) this.a.getAnimatedValue()).intValue();
        Paint paint = this.c;
        if (paint.getAlpha() != iIntValue) {
            paint.setAlpha(iIntValue);
            this.b.invalidateSelf();
        }
    }
}
