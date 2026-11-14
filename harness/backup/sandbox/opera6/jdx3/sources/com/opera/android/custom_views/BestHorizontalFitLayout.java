package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class BestHorizontalFitLayout extends ViewGroup {
    public View a;

    public BestHorizontalFitLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.a;
        if (view != null) {
            view.layout(getPaddingLeft(), getPaddingTop(), this.a.getMeasuredWidth() + getPaddingLeft(), this.a.getMeasuredHeight() + getPaddingTop());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = size - paddingBottom;
        int childCount = getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        View view = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                if (mode != 0) {
                    measureChild(childAt, 0, i2);
                    if (childAt.getMeasuredWidth() > i3) {
                        view = childAt;
                    }
                }
                view = childAt;
                break;
            }
        }
        View view2 = this.a;
        if (view2 != null && view2.getVisibility() == 0) {
            this.a.setVisibility(4);
        }
        if (view != null) {
            view.setVisibility(0);
        }
        this.a = view;
        if (view == null) {
            setMeasuredDimension(0, 0);
        } else {
            measureChild(view, i, i2);
            setMeasuredDimension(view.getMeasuredWidth() + paddingBottom, view.getMeasuredHeight() + paddingRight);
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        view.setVisibility(4);
    }
}
