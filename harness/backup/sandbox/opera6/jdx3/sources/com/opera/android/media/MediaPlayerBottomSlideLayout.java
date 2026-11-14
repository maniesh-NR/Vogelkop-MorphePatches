package com.opera.android.media;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import defpackage.cld;
import defpackage.kc;
import defpackage.lf1;
import defpackage.nl2;

/* loaded from: classes.dex */
public class MediaPlayerBottomSlideLayout extends ViewGroup {
    public static final /* synthetic */ int d = 0;
    public boolean a;
    public ValueAnimator b;
    public cld c;

    public MediaPlayerBottomSlideLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final float a() {
        ValueAnimator valueAnimator = this.b;
        return valueAnimator != null ? ((Float) valueAnimator.getAnimatedValue()).floatValue() : this.a ? 1.0f : 0.0f;
    }

    public final void b(boolean z) {
        if (z == this.a) {
            return;
        }
        float fA = a();
        float f = z ? 1.0f : 0.0f;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.a = z;
        ValueAnimator duration = ValueAnimator.ofFloat(fA, f).setDuration(300L);
        this.b = duration;
        duration.setInterpolator(lf1.d);
        this.b.addUpdateListener(new nl2(this, (byte) 15));
        this.b.addListener(new kc(this, (byte) 20));
        this.b.start();
    }

    public final void c() {
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        float fA = a();
        float height = (-a()) * getHeight();
        if (height != childAt.getTranslationY()) {
            childAt.setTranslationY(height);
            childAt2.setTranslationY(height);
            childAt.setEnabled(fA != 1.0f);
            childAt2.setEnabled(fA != 0.0f);
            cld cldVar = this.c;
            if (cldVar != null) {
                cldVar.run();
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        childAt2.layout(0, childAt.getBottom(), childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight() + childAt.getBottom());
        c();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        super.onMeasure(i, i2);
    }
}
