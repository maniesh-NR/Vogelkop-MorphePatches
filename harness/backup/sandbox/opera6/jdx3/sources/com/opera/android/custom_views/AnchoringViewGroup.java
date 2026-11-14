package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.bar.OmniButtonView;
import defpackage.bp;
import defpackage.j21;
import defpackage.k21;
import defpackage.khh;

/* loaded from: classes.dex */
public class AnchoringViewGroup extends ViewGroup {
    public final int[] a;
    public final Rect b;
    public final Rect c;
    public final j21 d;
    public bp e;

    public AnchoringViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = new int[2];
        this.b = new Rect();
        this.c = new Rect();
        this.d = new j21(this, (byte) 0);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof k21) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new k21(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        k21 k21Var = new k21(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.b);
        k21Var.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return k21Var;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof k21)) {
            return new k21(layoutParams);
        }
        k21 k21Var = (k21) layoutParams;
        k21 k21Var2 = new k21(k21Var);
        k21Var2.a = k21Var.a;
        return k21Var2;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        k21 k21Var = (k21) view.getLayoutParams();
        int i3 = k21Var.a;
        if (i3 > 0) {
            size = Math.min(size, i3);
        }
        if (this.e != null) {
            Rect rect = this.c;
            int i4 = rect.left;
            Rect rect2 = this.b;
            int paddingLeft = (i4 - rect2.left) - getPaddingLeft();
            int paddingRight = (rect2.right - rect.right) - getPaddingRight();
            int paddingTop = (rect.top - rect2.top) - getPaddingTop();
            int paddingBottom = (rect2.bottom - rect.bottom) - getPaddingBottom();
            size = Math.min(size, Math.max(paddingLeft, paddingRight));
            size2 = Math.min(size2, Math.max(paddingTop, paddingBottom));
        }
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), getPaddingRight() + getPaddingLeft(), ((ViewGroup.LayoutParams) k21Var).width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), getPaddingBottom() + getPaddingTop(), ((ViewGroup.LayoutParams) k21Var).height));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bp bpVar = this.e;
        if (bpVar != null) {
            ((OmniButtonView) bpVar.b).getViewTreeObserver().removeOnGlobalLayoutListener(this.d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        bp bpVar = this.e;
        int[] iArr = this.a;
        Rect rect = this.c;
        if (bpVar != null) {
            OmniButtonView omniButtonView = (OmniButtonView) bpVar.b;
            omniButtonView.getLocationInWindow(iArr);
            int i5 = iArr[0];
            rect.set(i5, iArr[1], omniButtonView.getWidth() + i5, omniButtonView.getHeight() + iArr[1]);
            bp bpVar2 = this.e;
            bpVar2.getClass();
            rect.inset(0, bpVar2.a);
            this.e.getClass();
            rect.inset(rect.width(), 0);
            this.e.getClass();
        }
        getLocationInWindow(iArr);
        int i6 = iArr[0];
        int i7 = iArr[1];
        int width = getWidth() + i6;
        int height = getHeight() + iArr[1];
        Rect rect2 = this.b;
        rect2.set(i6, i7, width, height);
        measureChildren(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8).getVisibility() != 8) {
                View childAt = getChildAt(i8);
                if (this.e == null) {
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                } else {
                    int paddingLeft = (rect.left - rect2.left) - getPaddingLeft();
                    int paddingRight = (rect2.right - rect.right) - getPaddingRight();
                    int paddingTop = (rect.top - rect2.top) - getPaddingTop();
                    int paddingBottom = (rect2.bottom - rect.bottom) - getPaddingBottom();
                    bp bpVar3 = this.e;
                    int i9 = rect.centerX() < rect2.centerX() ? 5 : 3;
                    int i10 = rect.centerY() < rect2.centerY() ? 80 : 48;
                    bpVar3.getClass();
                    int absoluteGravity = Gravity.getAbsoluteGravity(i9 | i10, ((OmniButtonView) bpVar3.b).getLayoutDirection());
                    int i11 = absoluteGravity & 7;
                    boolean z2 = ((i11 == 0 || i11 == 3) && paddingLeft >= childAt.getMeasuredWidth()) || ((i11 == 0 || i11 == 3 || paddingRight < childAt.getMeasuredWidth()) && paddingLeft > paddingRight);
                    int i12 = absoluteGravity & 112;
                    boolean z3 = ((i12 == 0 || i12 == 48) && paddingTop >= childAt.getMeasuredHeight()) || ((i12 == 0 || i12 == 48 || paddingBottom < childAt.getMeasuredHeight()) && paddingTop > paddingBottom);
                    int measuredWidth = z2 ? rect.left - childAt.getMeasuredWidth() : rect.right;
                    int measuredHeight = z3 ? rect.top - childAt.getMeasuredHeight() : rect.bottom;
                    int i13 = measuredWidth - rect2.left;
                    int i14 = measuredHeight - rect2.top;
                    childAt.layout(i13, i14, childAt.getMeasuredWidth() + i13, childAt.getMeasuredHeight() + i14);
                }
            }
        }
    }
}
