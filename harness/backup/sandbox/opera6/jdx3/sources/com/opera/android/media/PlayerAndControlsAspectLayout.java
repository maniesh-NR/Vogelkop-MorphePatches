package com.opera.android.media;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class PlayerAndControlsAspectLayout extends ViewGroup {
    public static final Point[] b = {new Point(2, 1), new Point(16, 9), new Point(3, 2), new Point(4, 2)};
    public float a;

    public PlayerAndControlsAspectLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0.45f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, measuredHeight, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + measuredHeight);
            measuredHeight += childAt.getMeasuredHeight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Point point;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        measureChild(childAt2, i, 0);
        int iMin = Math.min(childAt2.getMeasuredHeight(), size2);
        float f = 0.0f;
        int i4 = -1;
        while (true) {
            Point[] pointArr = b;
            if (i3 >= pointArr.length) {
                point = pointArr[i4];
                break;
            }
            Point point2 = pointArr[i3];
            float f2 = size * (point2.y / point2.x);
            float f3 = size2;
            float fAbs = Math.abs(this.a - (f2 / f3));
            if (f2 + iMin > f3) {
                point = null;
                break;
            }
            if (i4 == -1 || fAbs < f) {
                i4 = i3;
                f = fAbs;
            }
            i3++;
        }
        int i5 = point != null ? (point.y * size) / point.x : size2 - iMin;
        measureChild(childAt, i, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        measureChild(childAt2, i, View.MeasureSpec.makeMeasureSpec(size2 - i5, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
