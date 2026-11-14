package com.opera.android.flow;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.dll;
import defpackage.fan;
import defpackage.g7f;
import defpackage.i7f;
import defpackage.in8;
import defpackage.lf1;
import defpackage.lzb;
import defpackage.nl2;
import defpackage.ob9;
import defpackage.q9n;
import defpackage.u8n;

/* loaded from: classes.dex */
public class MyFlowMessageRoot extends ViewGroup {
    public static final /* synthetic */ int l = 0;
    public final int a;
    public final int b;
    public final i7f c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public View g;
    public View h;
    public int i;
    public boolean j;
    public ValueAnimator k;

    public MyFlowMessageRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new i7f();
        this.i = 0;
        this.j = isInEditMode();
        this.a = fan.a(24.0f, context.getResources());
        this.b = fan.a(304.0f, context.getResources());
        lzb lzbVar = new lzb(this, (byte) 18);
        dll dllVarS = q9n.s(this);
        if (dllVarS != null) {
            u8n.b(dllVarS, this, lzbVar);
        }
        lzbVar.a(this);
    }

    public final void a(boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        if (!z2 && (valueAnimator = this.k) != null) {
            valueAnimator.cancel();
            this.k = null;
        }
        boolean z3 = this.j;
        if (z == z3) {
            return;
        }
        ValueAnimator valueAnimator2 = this.k;
        float fFloatValue = valueAnimator2 != null ? ((Float) valueAnimator2.getAnimatedValue()).floatValue() : z3 ? 1.0f : 0.0f;
        this.j = z;
        requestLayout();
        if (!z2) {
            this.h.setAlpha(z ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        this.k = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.k.setInterpolator(lf1.n);
        this.k.addUpdateListener(new nl2(this, (byte) 16));
        this.k.addListener(new in8((byte) 4, this, z));
        this.k.start();
    }

    public final void b(int i) {
        if (i != this.i) {
            this.i = i;
            requestLayout();
            i7f i7fVar = this.c;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ob9 ob9Var = (ob9) g7fVarC.next();
                if (ob9Var.a != i || !ob9Var.c) {
                    ob9Var.c = true;
                    ob9Var.a = i;
                    View view = (View) ob9Var.b.get();
                    if (view != null) {
                        ob9.b(i, view);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i = this.i;
        Drawable drawable = i != 0 ? i != 1 ? i != 2 ? null : this.f : this.d : this.e;
        if (drawable != null) {
            drawable.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
            drawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.d.setState(getDrawableState());
        this.e.setState(getDrawableState());
        this.f.setState(getDrawableState());
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = getChildAt(0);
        this.h = getChildAt(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zW = cs5.W(this);
        boolean z2 = true;
        boolean z3 = this.i == 1;
        if (zW ? z3 : !z3) {
            z2 = false;
        }
        int i5 = i3 - i;
        int measuredWidth = z2 ? i5 - this.g.getMeasuredWidth() : 0;
        View view = this.g;
        view.layout(measuredWidth, 0, view.getMeasuredWidth() + measuredWidth, this.g.getMeasuredHeight());
        int measuredWidth2 = z2 ? i5 - this.h.getMeasuredWidth() : 0;
        int height = this.g.getHeight();
        View view2 = this.h;
        view2.layout(measuredWidth2, height, view2.getMeasuredWidth() + measuredWidth2, this.h.getMeasuredHeight() + height);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        measureChildren(View.MeasureSpec.makeMeasureSpec(Math.min(size - this.a, this.b), Integer.MIN_VALUE), i2);
        int measuredHeight = this.g.getMeasuredHeight();
        float measuredHeight2 = this.h.getMeasuredHeight();
        ValueAnimator valueAnimator = this.k;
        setMeasuredDimension(size, Math.round((valueAnimator != null ? ((Float) valueAnimator.getAnimatedValue()).floatValue() : this.j ? 1.0f : 0.0f) * measuredHeight2) + measuredHeight);
    }
}
