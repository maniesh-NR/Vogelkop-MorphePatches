package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.uk6;

/* loaded from: classes.dex */
public class SideMarginContainer extends ViewGroup {
    public uk6 a;
    public final m9f b;
    public final boolean c;

    public SideMarginContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new m9f(this);
        this.c = true;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            int measuredWidth = ((i3 - i) - childAt.getMeasuredWidth()) / 2;
            childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iE = this.c ? this.b.e() : 0;
        View childAt = getChildAt(0);
        boolean z = iE > 0;
        int i3 = size - (iE << 1);
        childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), 0);
        if (getLayoutParams().height == -1 && childAt.getMeasuredHeight() < size2) {
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, childAt.getMeasuredHeight());
        uk6 uk6Var = this.a;
        if (uk6Var != null) {
            ((FadingScrollView) uk6Var.b).c.f(z);
        }
    }
}
