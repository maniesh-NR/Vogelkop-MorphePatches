package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class LayoutDirectionSquareLinearLayout extends LayoutDirectionLinearLayout {
    public LayoutDirectionSquareLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.opera.android.custom_views.LayoutDirectionLinearLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        setMeasuredDimension(iMin, iMin);
    }
}
