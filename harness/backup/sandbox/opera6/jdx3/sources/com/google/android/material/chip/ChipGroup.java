package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import defpackage.tw2;
import defpackage.u59;
import defpackage.ux4;
import defpackage.wx4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ChipGroup extends ViewGroup {
    public int a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public final int f;
    public vx4 g;
    public final ev4 h;
    public final int i;
    public final wx4 j;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        Context contextG0 = wxe.g0(context, attributeSet, 2130969017, 2132084849);
        super(contextG0, attributeSet, 2130969017);
        this.c = false;
        TypedArray typedArrayObtainStyledAttributes = contextG0.getTheme().obtainStyledAttributes(attributeSet, ihh.q, 0, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        ev4 ev4Var = new ev4((byte) 0);
        this.h = ev4Var;
        this.j = new wx4(this, (byte) 0);
        TypedArray typedArrayA0 = scd.a0(getContext(), attributeSet, ihh.g, 2130969017, 2132084849, new int[0]);
        int dimensionPixelOffset = typedArrayA0.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = typedArrayA0.getDimensionPixelOffset(2, dimensionPixelOffset);
        if (this.e != dimensionPixelOffset2) {
            this.e = dimensionPixelOffset2;
            this.b = dimensionPixelOffset2;
            requestLayout();
        }
        int dimensionPixelOffset3 = typedArrayA0.getDimensionPixelOffset(3, dimensionPixelOffset);
        if (this.f != dimensionPixelOffset3) {
            this.f = dimensionPixelOffset3;
            this.a = dimensionPixelOffset3;
            requestLayout();
        }
        this.c = typedArrayA0.getBoolean(5, false);
        boolean z = typedArrayA0.getBoolean(6, false);
        if (ev4Var.b != z) {
            ev4Var.b = z;
            boolean zIsEmpty = ((HashSet) ev4Var.e).isEmpty();
            Iterator it = ((HashMap) ev4Var.d).values().iterator();
            while (it.hasNext()) {
                ev4Var.n((Chip) it.next(), false);
            }
            if (!zIsEmpty) {
                ev4Var.h();
            }
        }
        this.h.c = typedArrayA0.getBoolean(4, false);
        this.i = typedArrayA0.getResourceId(0, -1);
        typedArrayA0.recycle();
        this.h.f = new tw2((Object) this, (byte) 18);
        super.setOnHierarchyChangeListener(this.j);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof ux4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ux4(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ux4(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ux4(layoutParams);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            ev4 ev4Var = this.h;
            Chip chip = (Chip) ((HashMap) ev4Var.d).get(Integer.valueOf(i));
            if (chip == null || !ev4Var.c(chip)) {
                return;
            }
            ev4Var.h();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        if (this.c) {
            i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        accessibilityNodeInfoCompat.v(u59.M(this.d, i, this.h.b ? 1 : 2, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int marginEnd;
        int marginStart;
        boolean z2;
        int i5 = 0;
        if (getChildCount() == 0) {
            this.d = 0;
            return;
        }
        boolean z3 = true;
        this.d = 1;
        boolean z4 = getLayoutDirection() == 1;
        if (z4) {
            paddingLeft = getPaddingRight();
            paddingRight = getPaddingLeft();
        } else {
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i6 = 0;
        int measuredWidth = paddingLeft;
        int i7 = paddingTop;
        while (i6 < getChildCount()) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(2131364112, -1);
                z2 = z3;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = i5;
                    marginStart = marginEnd;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                int i8 = i3 - i;
                z2 = z3;
                int i9 = i8 - paddingRight;
                if (!this.c && measuredWidth2 > i9) {
                    measuredWidth2 = childAt.getMeasuredWidth() + paddingLeft + marginStart;
                    i7 = paddingTop + this.a;
                    this.d++;
                    measuredWidth = paddingLeft;
                }
                childAt.setTag(2131364112, Integer.valueOf(this.d - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (z4) {
                    childAt.layout(i8 - measuredWidth2, i7, (i8 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i7, measuredWidth2, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.b;
                paddingTop = measuredHeight;
            }
            i6++;
            z3 = z2;
            i5 = 0;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i5 - getPaddingRight();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin;
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i9 = i3;
                if (childAt.getMeasuredWidth() + paddingLeft + i4 > paddingRight && !this.c) {
                    paddingLeft = getPaddingLeft();
                    i6 = paddingTop + this.a;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i4;
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i4 + i9 + this.b + paddingLeft;
                if (i8 == getChildCount() - 1) {
                    i7 += i9;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i7;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(paddingRight2, size);
        } else if (mode != 1073741824) {
            size = paddingRight2;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j.b = onHierarchyChangeListener;
    }
}
