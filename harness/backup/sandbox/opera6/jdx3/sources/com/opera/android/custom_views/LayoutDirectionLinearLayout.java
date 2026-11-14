package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.g2c;
import defpackage.k2c;
import defpackage.l2c;
import defpackage.m2c;

/* loaded from: classes.dex */
public class LayoutDirectionLinearLayout extends LinearLayout implements k2c {
    public l2c a;
    public fr b;

    public LayoutDirectionLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    public LayoutDirectionLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        d(context, attributeSet);
    }

    @Override // defpackage.k2c
    public final l2c b() {
        return this.a;
    }

    public final void d(Context context, AttributeSet attributeSet) {
        this.a = new l2c(this, this, attributeSet);
        fr frVarF = fr.f(context, attributeSet);
        this.b = frVarF;
        if (frVarF != null) {
            frVarF.e(this);
        }
    }

    public final void e() {
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

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g2c(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g2c(getContext(), attributeSet);
    }

    @Override // defpackage.k2c
    public final void i(int i) {
        if (i == 0) {
            setLayoutDirection(0);
        } else if (i == 1) {
            setLayoutDirection(1);
        }
        e();
        requestLayout();
        cs5.P(this);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        e();
        super.onMeasure(i, i2);
    }
}
