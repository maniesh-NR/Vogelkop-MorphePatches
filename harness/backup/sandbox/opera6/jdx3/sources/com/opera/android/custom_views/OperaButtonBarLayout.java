package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.khh;

/* loaded from: classes.dex */
public class OperaButtonBarLayout extends LayoutDirectionLinearLayout {
    public final int c;
    public int d;

    public OperaButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        int i = context.getResources().getConfiguration().screenHeightDp >= 320 ? 1 : 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.t);
        this.c = typedArrayObtainStyledAttributes.getInt(0, i);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r9) {
        /*
            r8 = this;
            r8.setOrientation(r9)
            r0 = 1
            int r1 = r8.c
            if (r9 == 0) goto Le
            if (r1 != r0) goto Le
            r2 = 8388613(0x800005, float:1.175495E-38)
            goto L10
        Le:
            r2 = 80
        L10:
            r8.setGravity(r2)
            r2 = 2131364511(0x7f0a0a9f, float:1.8348861E38)
            android.view.View r2 = r8.findViewById(r2)
            if (r2 == 0) goto L25
            if (r9 == 0) goto L21
            r3 = 8
            goto L22
        L21:
            r3 = 4
        L22:
            r2.setVisibility(r3)
        L25:
            int r2 = r8.getChildCount()
            int r2 = r2 - r0
            r0 = r2
        L2b:
            if (r0 < 0) goto L89
            android.view.View r3 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r5 = 2131363769(0x7f0a07b9, float:1.8347356E38)
            r6 = 2131363770(0x7f0a07ba, float:1.8347358E38)
            if (r9 == 0) goto L61
            int r7 = r4.getMarginStart()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.setTag(r6, r7)
            int r6 = r4.getMarginEnd()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.setTag(r5, r6)
            r5 = 0
            r4.setMarginStart(r5)
            r4.setMarginEnd(r5)
            r5 = 2
            if (r1 != r5) goto L7b
            r5 = -1
            goto L7c
        L61:
            java.lang.Object r6 = r3.getTag(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setMarginStart(r6)
            java.lang.Object r5 = r3.getTag(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setMarginEnd(r5)
        L7b:
            r5 = -2
        L7c:
            r4.width = r5
            r3.setLayoutParams(r4)
            if (r0 == r2) goto L86
            r8.bringChildToFront(r3)
        L86:
            int r0 = r0 + (-1)
            goto L2b
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.custom_views.OperaButtonBarLayout.f(boolean):void");
    }

    @Override // com.opera.android.custom_views.LayoutDirectionLinearLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.d;
        boolean z = false;
        int i4 = this.c;
        boolean z2 = true;
        if (size > i3 && getOrientation() == 1 && i4 == 1) {
            f(false);
        }
        this.d = size;
        if (i4 == 1 && View.MeasureSpec.getMode(i) == 1073741824) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        } else {
            iMakeMeasureSpec = i;
        }
        if (i4 == 2 && getOrientation() != 1) {
            f(true);
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (i4 == 1 && getOrientation() != 1 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            f(true);
        } else {
            z2 = z;
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }
}
