package com.opera.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;
import defpackage.bi;
import defpackage.rn9;

/* loaded from: classes.dex */
public class AspectRatioFrameLayout extends LayoutDirectionFrameLayout {
    public static final /* synthetic */ int d = 0;
    public final rn9 c;

    public AspectRatioFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        rn9 rn9Var = new rn9(new bi(this, (byte) 28));
        this.c = rn9Var;
        rn9Var.B(context, attributeSet);
    }

    public final /* synthetic */ void d(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // com.opera.android.custom_views.LayoutDirectionFrameLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.c.H(i, i2)) {
            int mode = View.MeasureSpec.getMode(i);
            boolean z = mode == 1073741824 || (mode == Integer.MIN_VALUE && View.MeasureSpec.getMode(i2) != 1073741824);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int iMax = 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                iMax = Math.max(iMax, z ? childAt.getMeasuredHeight() : childAt.getMeasuredWidth());
            }
            if (z) {
                if (measuredHeight >= iMax) {
                    return;
                } else {
                    measuredHeight = iMax;
                }
            } else if (measuredWidth >= iMax) {
                return;
            } else {
                measuredWidth = iMax;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }
}
