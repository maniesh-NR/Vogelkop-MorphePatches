package com.opera.android.widget;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.l2c;
import defpackage.mij;
import defpackage.q2c;
import defpackage.yqa;

/* loaded from: classes.dex */
public class SideActionsLayout extends q2c {
    public final yqa c;
    public mij d;
    public mij e;
    public mij f;
    public View g;

    public SideActionsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new l2c(this, this, attributeSet);
        fr frVarF = fr.f(context, attributeSet);
        this.b = frVarF;
        if (frVarF != null) {
            frVarF.e(this);
        }
        this.c = new yqa((byte) 22);
    }

    public final int e() {
        int iC = this.d.c();
        mij mijVar = this.e;
        if (mijVar != null) {
            iC += mijVar.c();
        }
        mij mijVar2 = this.d;
        int i = mij.e;
        float fB = mijVar2.b();
        mij mijVar3 = this.e;
        if (mijVar3 != null) {
            fB = Math.min(1.0f, mijVar3.b() + fB);
        }
        return Math.round((1.0f - fB) * 0.0f) + iC;
    }

    public final void f(mij mijVar, int i, int i2, int i3, boolean z) {
        if (mijVar.a.getVisibility() == 8) {
            return;
        }
        boolean z2 = mijVar == this.d || mijVar == this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mijVar.a.getLayoutParams();
        int iC = mijVar.c();
        int measuredWidth = mijVar.a.getMeasuredWidth();
        int measuredHeight = mijVar.a.getMeasuredHeight();
        View view = mijVar.a;
        int i4 = z == z2 ? ((i + iC) - measuredWidth) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin : (i3 - iC) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
        int i5 = i2 + marginLayoutParams.topMargin;
        mijVar.a.layout(i4, i5, measuredWidth + i4, measuredHeight + i5);
    }

    @Override // android.view.View
    public final void forceLayout() {
        super.forceLayout();
        yqa yqaVar = this.c;
        if (yqaVar != null) {
            ((Point) yqaVar.b).set(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public final void g(mij mijVar, int i, int i2) {
        if (mijVar.a.getVisibility() == 8) {
            return;
        }
        measureChildWithMargins(mijVar.a, i, 0, i2, 0);
    }

    public final void h(boolean z, boolean z2) {
        mij mijVar = this.d;
        if (isShown() && z2) {
            mijVar.a(z, false);
        } else {
            mijVar.a(z, true);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int childCount = getChildCount();
        if (childCount == 3) {
            this.d = new mij(getChildAt(0));
            this.g = getChildAt(1);
            this.f = new mij(getChildAt(2));
        } else if (childCount == 4) {
            this.d = new mij(getChildAt(0));
            this.e = new mij(getChildAt(1));
            this.g = getChildAt(2);
            this.f = new mij(getChildAt(3));
        }
        super.onFinishInflate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iRound;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        if (cs5.W(this)) {
            int iC = this.f.c();
            mij mijVar = this.f;
            int i7 = mij.e;
            iRound = iC + Math.round((1.0f - mijVar.b()) * 0.0f);
        } else {
            iRound = e();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
        int measuredWidth = this.g.getMeasuredWidth();
        int measuredHeight = this.g.getMeasuredHeight();
        int i8 = iRound + paddingLeft + marginLayoutParams.leftMargin;
        int i9 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + marginLayoutParams.topMargin;
        this.g.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
        boolean zW = cs5.W(this);
        boolean z2 = !zW;
        f(this.d, paddingLeft, paddingTop, paddingRight, z2);
        if (this.e != null) {
            if (this.d.a.getVisibility() != 8) {
                mij mijVar2 = this.d;
                if (zW) {
                    paddingRight = mijVar2.a.getLeft();
                } else {
                    paddingLeft = mijVar2.a.getRight();
                }
            }
            i5 = paddingLeft;
            i6 = paddingRight;
            f(this.e, i5, paddingTop, i6, z2);
        } else {
            i5 = paddingLeft;
            i6 = paddingRight;
        }
        f(this.f, i5, paddingTop, i6, z2);
    }

    @Override // defpackage.q2c, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        yqa yqaVar = this.c;
        Point point = (Point) yqaVar.b;
        Point point2 = (Point) yqaVar.c;
        Point point3 = (i == point.x && i2 == point.y) ? point2 : null;
        if (point3 != null) {
            setMeasuredDimension(point3.x, point3.y);
            return;
        }
        d();
        g(this.d, i, i2);
        mij mijVar = this.e;
        if (mijVar != null) {
            g(mijVar, i, i2);
        }
        g(this.f, i, i2);
        int size2 = View.MeasureSpec.getSize(i);
        int iE = e();
        int iC = this.f.c();
        mij mijVar2 = this.f;
        int i3 = mij.e;
        measureChildWithMargins(this.g, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), Math.round((1.0f - mijVar2.b()) * 0.0f) + iC + iE, i2, 0);
        if (View.MeasureSpec.getMode(i2) == 0) {
            int iMax = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            size = getPaddingBottom() + getPaddingTop() + iMax;
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size2, size);
        ((Point) yqaVar.b).set(i, i2);
        point2.set(size2, size);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        yqa yqaVar = this.c;
        if (yqaVar != null) {
            ((Point) yqaVar.b).set(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }
}
