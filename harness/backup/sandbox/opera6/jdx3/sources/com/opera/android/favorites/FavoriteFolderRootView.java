package com.opera.android.favorites;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.bn7;
import defpackage.ixj;
import defpackage.lf1;

/* loaded from: classes.dex */
public class FavoriteFolderRootView extends ViewGroup {
    public final int a;
    public i3j b;
    public final int[] c;
    public final Rect d;
    public bn7 e;
    public View f;
    public boolean g;

    public FavoriteFolderRootView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new int[2];
        this.d = new Rect();
        this.a = context.getResources().getDimensionPixelSize(2131165759);
    }

    public final ValueAnimator a() {
        this.e = null;
        int width = (this.f.getWidth() / 2) + this.f.getLeft();
        int height = (this.f.getHeight() / 2) + this.f.getTop();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this.f.animate();
        Rect rect = this.d;
        viewPropertyAnimatorAnimate.translationX((rect.centerX() - width) * 0.100000024f).translationY((rect.centerY() - height) * 0.100000024f).scaleX(0.9f).scaleY(0.9f).alpha(0.0f).setDuration(100L).start();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        return valueAnimatorOfFloat;
    }

    public final void b(bn7 bn7Var) {
        if (this.d.isEmpty()) {
            this.e = bn7Var;
            return;
        }
        int width = (this.f.getWidth() / 2) + this.f.getLeft();
        int height = (this.f.getHeight() / 2) + this.f.getTop();
        this.f.setAlpha(0.5f);
        this.f.setScaleX(0.85f);
        this.f.setScaleY(0.85f);
        this.f.setTranslationX((r0.centerX() - width) * 0.14999998f);
        this.f.setTranslationY((r0.centerY() - height) * 0.14999998f);
        this.f.animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(150L).setInterpolator(lf1.d).withEndAction(bn7Var);
    }

    public final ixj c() {
        if (isInEditMode()) {
            return new ixj(10000, null, 0, 0);
        }
        ixj ixjVarC = this.b.c();
        return getParent() == null ? ixjVarC : ixjVarC.a(ixj.b((View) getParent()));
    }

    public final void d(int i, int i2, ixj ixjVar) {
        int i3 = ixjVar.c;
        int i4 = this.a;
        int i5 = ixjVar.d + i4;
        this.f.measure(View.MeasureSpec.makeMeasureSpec(Math.min(i - (i4 << 1), ixjVar.a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((i2 - (i3 + i4)) - i5, Integer.MIN_VALUE));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f = getChildAt(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int height;
        ixj ixjVarC = c();
        if (z) {
            d(i3 - i, i4 - i2, ixjVarC);
        }
        int i5 = ixjVarC.c;
        Rect rect = ixjVarC.b;
        int i6 = this.a;
        int i7 = i5 + i6;
        int i8 = ixjVarC.d + i6;
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        if (rect != null) {
            int[] iArr = this.c;
            getLocationInWindow(iArr);
            Rect rect2 = this.d;
            rect2.set(rect);
            rect2.offset(-iArr[0], -iArr[1]);
            int iCenterX = rect2.centerX() - (measuredWidth / 2);
            int iCenterY = rect2.centerY() - (measuredHeight / 2);
            width = nb6.j(iCenterX, i6, (getWidth() - i6) - measuredWidth);
            height = nb6.j(iCenterY, i7, (getHeight() - i8) - measuredHeight);
        } else {
            width = (getWidth() - measuredWidth) / 2;
            height = i7 + ((((getHeight() - measuredHeight) - i8) - i7) / 2);
        }
        if (!this.g) {
            this.f.layout(width, height, measuredWidth + width, measuredHeight + height);
        }
        bn7 bn7Var = this.e;
        if (bn7Var != null) {
            this.e = null;
            b(bn7Var);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        d(size, size2, c());
        setMeasuredDimension(size, size2);
    }
}
