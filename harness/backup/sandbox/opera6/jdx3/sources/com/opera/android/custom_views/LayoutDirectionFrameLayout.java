package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.f2c;
import defpackage.k2c;
import defpackage.l2c;
import defpackage.m2c;

/* loaded from: classes.dex */
public class LayoutDirectionFrameLayout extends FrameLayout implements k2c {
    public final l2c a;
    public final fr b;

    public LayoutDirectionFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new l2c(this, this, attributeSet);
        fr frVarF = fr.f(context, attributeSet);
        this.b = frVarF;
        if (frVarF != null) {
            frVarF.e(this);
        }
    }

    public LayoutDirectionFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new l2c(this, this, attributeSet);
        fr frVarF = fr.f(context, attributeSet);
        this.b = frVarF;
        if (frVarF != null) {
            frVarF.e(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f2c generateLayoutParams(AttributeSet attributeSet) {
        return new f2c(getContext(), attributeSet);
    }

    @Override // defpackage.k2c
    public final l2c b() {
        return this.a;
    }

    public final void c() {
        fr frVar = this.b;
        if (frVar != null) {
            frVar.e(this);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Object layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof m2c) {
                ((m2c) layoutParams).a(childAt, this);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f2c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new f2c();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f2c ? new f2c((f2c) layoutParams) : layoutParams instanceof FrameLayout.LayoutParams ? new f2c((FrameLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f2c((ViewGroup.MarginLayoutParams) layoutParams) : new f2c(layoutParams);
    }

    @Override // defpackage.k2c
    public final void i(int i) {
        if (i == 0) {
            setLayoutDirection(0);
        } else if (i == 1) {
            setLayoutDirection(1);
        }
        c();
        requestLayout();
        cs5.P(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        c();
        super.onMeasure(i, i2);
    }
}
