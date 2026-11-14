package com.opera.android.favorites;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.sta;
import defpackage.tta;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/favorites/FavoriteGridLinearLayout;", "Landroid/widget/LinearLayout;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FavoriteGridLinearLayout extends LinearLayout {
    public tta a;

    public FavoriteGridLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (getChildCount() != 0) {
            int measuredWidth = getChildAt(0).getMeasuredWidth();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            tta ttaVar = this.a;
            if (ttaVar == null) {
                i5 = 1;
            } else {
                int measuredWidth2 = getMeasuredWidth();
                int paddingLeft = getPaddingLeft();
                sta staVar = ttaVar.h;
                int i6 = staVar.a;
                int i7 = measuredWidth2 - (paddingLeft << 1);
                int i8 = ttaVar.c;
                int i9 = i8;
                i5 = 1;
                while (i5 < 16 && i9 + i6 + i8 <= i7) {
                    i9 += i6 + i8;
                    i5++;
                }
                if (i5 > 1) {
                    djh.c((i7 - (i8 * i5)) / (i5 - 1), i6, staVar.b);
                }
            }
            int i10 = measuredWidth + (i5 > 1 ? (width - (i5 * measuredWidth)) / (i5 - 1) : 0);
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                int measuredWidth3 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (getLayoutDirection() == 1) {
                    int width2 = (getWidth() - getPaddingRight()) - (i11 * i10);
                    childAt.layout(width2 - measuredWidth3, getPaddingTop(), width2, getPaddingTop() + measuredHeight);
                } else {
                    int paddingLeft2 = (i11 * i10) + getPaddingLeft();
                    childAt.layout(paddingLeft2, getPaddingTop(), measuredWidth3 + paddingLeft2, getPaddingTop() + measuredHeight);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int iMax = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
            }
        }
        setMeasuredDimension(size, View.resolveSize(getPaddingBottom() + getPaddingTop() + iMax, i2));
    }
}
