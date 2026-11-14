package com.opera.android.custom_views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import defpackage.i2c;
import defpackage.k2c;
import defpackage.l2c;
import defpackage.m2c;

/* loaded from: classes.dex */
public class LayoutDirectionRelativeLayout extends RelativeLayout implements k2c {
    public l2c a;
    public fr b;
    public int c;

    public LayoutDirectionRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.a = new l2c(this, this, attributeSet);
        fr frVarF = fr.f(context, attributeSet);
        this.b = frVarF;
        if (frVarF != null) {
            frVarF.e(this);
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.maxWidth});
            this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.k2c
    public final l2c b() {
        return this.a;
    }

    public final void c() {
        fr frVar = this.b;
        if (frVar != null) {
            frVar.e(this);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Object layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof m2c) {
                ((m2c) layoutParams).a(childAt, this);
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof i2c;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new i2c(getContext(), attributeSet);
    }

    @Override // defpackage.k2c
    public final void i(int i) {
        if (i == 0) {
            setLayoutDirection(0);
        } else if (i == 1) {
            setLayoutDirection(1);
        }
        c();
        requestLayout();
        cs5.P(this);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        c();
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.c;
        if (i3 > 0 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.c, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }
}
