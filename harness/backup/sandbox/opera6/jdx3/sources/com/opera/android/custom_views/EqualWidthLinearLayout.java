package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.eal;
import defpackage.yt7;

/* loaded from: classes.dex */
public class EqualWidthLinearLayout extends LayoutDirectionLinearLayout {
    public eal c;

    public EqualWidthLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getOrientation() != 1) {
            return;
        }
        yt7.k("Vertical orientation not supported");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        eal ealVar = this.c;
        if (ealVar == null || !ealVar.onTouch(this, motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount;
        int i5 = 1;
        boolean z2 = getLayoutDirection() == 1;
        int paddingLeft = ((i3 - i) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        int childCount2 = getChildCount();
        int paddingLeft2 = getPaddingLeft();
        int i6 = childCount2;
        for (int i7 = 0; i7 < childCount2; i7++) {
            if (getChildAt(i7).getVisibility() == 8) {
                i6--;
            }
        }
        if (z2) {
            childCount = getChildCount() - 1;
            i5 = -1;
        } else {
            childCount = 0;
        }
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt = getChildAt((i5 * i8) + childCount);
            if (childAt.getVisibility() != 8) {
                int i9 = paddingLeft / i6;
                i6--;
                int measuredWidth = ((i9 - childAt.getMeasuredWidth()) / 2) + paddingLeft2;
                int measuredHeight = ((paddingTop - childAt.getMeasuredHeight()) / 2) + getPaddingTop();
                childAt.layout(measuredWidth, measuredHeight, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + measuredHeight);
                paddingLeft -= i9;
                paddingLeft2 += i9;
            }
        }
    }

    @Override // com.opera.android.custom_views.LayoutDirectionLinearLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        int i3 = childCount;
        for (int i4 = 0; i4 < childCount; i4++) {
            if (getChildAt(i4).getVisibility() == 8) {
                i3--;
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i6 = size / i3;
                i3--;
                size -= i6;
                childAt.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), 0, layoutParams.width), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), layoutParams.height));
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        eal ealVar = this.c;
        return ealVar != null ? zOnTouchEvent | ealVar.onTouch(this, motionEvent) : zOnTouchEvent;
    }
}
