package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;

/* loaded from: classes.dex */
public final class mij extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int e = 0;
    public View a;
    public final ViewParent b;
    public final ValueAnimator c;
    public int d;

    public mij(View view) {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.c = valueAnimator;
        this.d = -1;
        this.a = view;
        valueAnimator.setFloatValues(1.0f);
        this.b = view.getParent();
        valueAnimator.setDuration(view.getContext().getResources().getInteger(2131492999));
        valueAnimator.setInterpolator(lf1.g);
        valueAnimator.addListener(this);
        valueAnimator.addUpdateListener(this);
    }

    public final void a(boolean z, boolean z2) {
        int i = this.d;
        ValueAnimator valueAnimator = this.c;
        if (i == z) {
            if (z2 && valueAnimator.isRunning()) {
                valueAnimator.end();
                return;
            }
            return;
        }
        this.d = z ? 1 : 0;
        float fB = b();
        valueAnimator.cancel();
        valueAnimator.setFloatValues(fB, z ? 1.0f : 0.0f);
        View viewInflate = this.a;
        if (viewInflate instanceof ViewStub) {
            viewInflate = ((ViewStub) viewInflate).inflate();
            this.a = viewInflate;
        }
        viewInflate.setVisibility(0);
        if (z2) {
            valueAnimator.end();
        } else {
            valueAnimator.start();
        }
    }

    public final float b() {
        if (this.a.getVisibility() == 8) {
            return 0.0f;
        }
        return ((Float) this.c.getAnimatedValue()).floatValue();
    }

    public final int c() {
        if (this.a.getVisibility() == 8) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
        return Math.round(b() * (this.a.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (b() == 1.0f) {
            return;
        }
        this.a.setVisibility(8);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.requestLayout();
    }
}
