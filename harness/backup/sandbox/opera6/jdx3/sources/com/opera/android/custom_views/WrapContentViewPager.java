package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import defpackage.khh;

/* loaded from: classes.dex */
public class WrapContentViewPager extends LayoutDirectionViewPager {
    public final boolean c;

    public WrapContentViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.X);
        this.c = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = 0;
        if (getChildCount() > 0) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i));
            if (this.c) {
                View childAt = getChildAt(0);
                childAt.measure(iMakeMeasureSpec, 0);
                iMin = childAt.getMeasuredHeight();
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt2 = getChildAt(i4);
                    childAt2.measure(iMakeMeasureSpec, 0);
                    int measuredHeight = childAt2.getMeasuredHeight();
                    if (measuredHeight > i3) {
                        i3 = measuredHeight;
                    }
                }
                iMin = i3;
            }
        } else if (isInEditMode()) {
            iMin = (int) (getResources().getDisplayMetrics().density * 300.0f);
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            iMin = size;
        } else if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(size, iMin);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
    }

    @Override // com.opera.android.custom_views.LayoutDirectionViewPager
    public final void setAdapter(PagerAdapter pagerAdapter) {
        super.setAdapter(pagerAdapter);
        if (this.c) {
            return;
        }
        setOffscreenPageLimit(pagerAdapter.getCount());
    }
}
