package com.opera.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public class AspectRatioLayout extends ViewGroup {
    public Size a;
    public Size b;

    public AspectRatioLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final Size a(int i, int i2) {
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        float width = this.a != null ? r3.getWidth() / this.a.getHeight() : f3;
        if (f3 < width) {
            i2 = Math.round(f / width);
        } else {
            i = Math.round(f2 * width);
        }
        return new Size(i, i2);
    }

    public final void b(Size size) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size.getHeight(), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = ((i3 - i) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (!Objects.equals(this.b, this.a)) {
            b(a(paddingLeft, paddingTop));
            this.b = this.a;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = ((paddingLeft - childAt.getMeasuredWidth()) / 2) + getPaddingLeft();
                int measuredHeight = ((paddingTop - childAt.getMeasuredHeight()) / 2) + getPaddingTop();
                childAt.layout(measuredWidth, measuredHeight, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + measuredHeight);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 0 || View.MeasureSpec.getMode(i2) == 0) {
            super.onMeasure(i, i2);
            return;
        }
        b(a((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()));
        this.b = this.a;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }
}
