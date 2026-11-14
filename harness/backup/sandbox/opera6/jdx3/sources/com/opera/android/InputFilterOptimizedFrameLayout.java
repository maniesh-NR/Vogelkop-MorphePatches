package com.opera.android;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.fan;
import defpackage.jrf;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class InputFilterOptimizedFrameLayout extends FrameLayout {
    public final int a;
    public final ArrayList b;

    public InputFilterOptimizedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Integer.MAX_VALUE;
        this.b = new ArrayList();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return InputFilterFrameLayout.d(motionEvent) && fan.b(this, this, (int) motionEvent.getX(), (int) motionEvent.getY()) != null;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (fan.b(this, this, (int) motionEvent.getX(), (int) motionEvent.getY()) != null) {
            return true;
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        InputFilterOptimizedFrameLayout inputFilterOptimizedFrameLayout = this;
        int size = View.MeasureSpec.getSize(i2);
        int i6 = inputFilterOptimizedFrameLayout.a;
        int iMakeMeasureSpec = size > i6 ? View.MeasureSpec.makeMeasureSpec(i6, View.MeasureSpec.getMode(i2)) : i2;
        int childCount = inputFilterOptimizedFrameLayout.getChildCount();
        boolean z2 = (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(iMakeMeasureSpec) == 1073741824) ? false : true;
        ArrayList arrayList = inputFilterOptimizedFrameLayout.b;
        arrayList.clear();
        int paddingLeft = inputFilterOptimizedFrameLayout.getPaddingLeft();
        int paddingRight = inputFilterOptimizedFrameLayout.getPaddingRight();
        int paddingTop = inputFilterOptimizedFrameLayout.getPaddingTop();
        int paddingBottom = inputFilterOptimizedFrameLayout.getPaddingBottom();
        int i7 = 0;
        int i8 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i8 < childCount) {
            View childAt = inputFilterOptimizedFrameLayout.getChildAt(i8);
            if (inputFilterOptimizedFrameLayout.getMeasureAllChildren()) {
                i3 = childCount;
            } else {
                i3 = childCount;
                if (childAt.getVisibility() == 8) {
                    z = z2;
                    i4 = paddingLeft;
                }
                i8++;
                childCount = i3;
                z2 = z;
                paddingLeft = i4;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            z = z2;
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingLeft + paddingRight + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width);
            i4 = paddingLeft;
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, paddingTop + paddingBottom + layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height);
            childAt.measure(childMeasureSpec, childMeasureSpec2);
            iMax = Math.max(iMax, childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            iMax2 = Math.max(iMax2, childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            int iCombineMeasuredStates = View.combineMeasuredStates(i7, childAt.getMeasuredState());
            if (z) {
                i5 = iCombineMeasuredStates;
                if (layoutParams.width == -1 || layoutParams.height == -1) {
                    arrayList.add(new jrf(childAt, childMeasureSpec, childMeasureSpec2));
                }
            } else {
                i5 = iCombineMeasuredStates;
            }
            i7 = i5;
            i8++;
            childCount = i3;
            z2 = z;
            paddingLeft = i4;
        }
        int i9 = paddingLeft;
        int i10 = i9 + paddingRight;
        int i11 = paddingTop + paddingBottom;
        int iMax3 = Math.max(iMax2 + i11, inputFilterOptimizedFrameLayout.getSuggestedMinimumHeight());
        int iMax4 = Math.max(iMax + i10, inputFilterOptimizedFrameLayout.getSuggestedMinimumWidth());
        Drawable foreground = inputFilterOptimizedFrameLayout.getForeground();
        if (foreground != null) {
            iMax3 = Math.max(iMax3, foreground.getMinimumHeight());
            iMax4 = Math.max(iMax4, foreground.getMinimumWidth());
        }
        inputFilterOptimizedFrameLayout.setMeasuredDimension(View.resolveSizeAndState(iMax4, i, i7), View.resolveSizeAndState(iMax3, iMakeMeasureSpec, i7 << 16));
        int size2 = arrayList.size();
        if (size2 > 1) {
            int i12 = 0;
            while (i12 < size2) {
                jrf jrfVar = (jrf) arrayList.get(i12);
                View view = jrfVar.a;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int i13 = marginLayoutParams.width;
                int iMakeMeasureSpec2 = i13 == -1 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (((inputFilterOptimizedFrameLayout.getMeasuredWidth() - i9) - paddingRight) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin), 1073741824) : ViewGroup.getChildMeasureSpec(i, marginLayoutParams.leftMargin + i10 + marginLayoutParams.rightMargin, i13);
                int i14 = marginLayoutParams.height;
                int iMakeMeasureSpec3 = i14 == -1 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredHeight() - paddingTop) - paddingBottom) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin), 1073741824) : ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, marginLayoutParams.topMargin + i11 + marginLayoutParams.bottomMargin, i14);
                if (jrfVar.b != iMakeMeasureSpec2 || jrfVar.c != iMakeMeasureSpec3) {
                    view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                }
                i12++;
                inputFilterOptimizedFrameLayout = this;
            }
        }
        arrayList.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon pointerIconOnResolvePointerIcon = super.onResolvePointerIcon(motionEvent, i);
        return (pointerIconOnResolvePointerIcon != null || fan.b(this, this, (int) motionEvent.getX(), (int) motionEvent.getY()) == null) ? pointerIconOnResolvePointerIcon : PointerIcon.getSystemIcon(getContext(), 1000);
    }
}
