package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.khh;

/* loaded from: classes.dex */
public class PercentWidthContainer extends FrameLayout {
    public boolean a;
    public final float b;
    public final float c;

    public PercentWidthContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 1.0f;
        this.c = 1.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.z);
            this.c = typedArrayObtainStyledAttributes.getFloat(0, this.c);
            this.b = typedArrayObtainStyledAttributes.getFloat(1, this.b);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int size = View.MeasureSpec.getSize(i);
        if (layoutParams.width != 0 || size <= 0) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec((int) (((size - getPaddingLeft()) - getPaddingRight()) * (this.a ? this.c : this.b)), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height));
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean z = configuration.orientation == 2;
        if (z == this.a) {
            return;
        }
        this.a = z;
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        boolean z = getResources().getConfiguration().orientation == 2;
        if (z == this.a) {
            return;
        }
        this.a = z;
        requestLayout();
    }
}
