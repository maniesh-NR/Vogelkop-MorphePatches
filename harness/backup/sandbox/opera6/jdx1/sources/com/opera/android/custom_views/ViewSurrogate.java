package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.ho5;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/custom_views/ViewSurrogate;", "Lho5;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewSurrogate extends ho5 {
    public final int h;
    public View i;

    public ViewSurrogate(@NotNull Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet, 0);
        this.a = new int[32];
        this.g = new HashMap();
        this.c = context;
        h(attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.V, 0, 0);
        this.h = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        TypedValue typedValue = new TypedValue();
        if (typedArrayObtainStyledAttributes.getValue(84, typedValue) || typedValue.type == 16 || typedArrayObtainStyledAttributes.getValue(94, typedValue) || typedValue.type == 16) {
            typedArrayObtainStyledAttributes.recycle();
        } else {
            qp2.n("");
            throw null;
        }
    }

    @Override // android.view.View
    public final int getBaseline() {
        View view = this.i;
        if (view == null) {
            view = null;
        }
        return view.getBaseline();
    }

    @Override // defpackage.ho5
    public final void n() {
        View view = this.i;
        if (view == null) {
            view = null;
        }
        Point pointQ = q9n.q(view, (ConstraintLayout) getParent());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int i = marginLayoutParams.leftMargin;
        int i2 = pointQ.x;
        if (i == i2 && marginLayoutParams.topMargin == pointQ.y) {
            if (p()) {
                return;
            }
            requestLayout();
        } else {
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.topMargin = pointQ.y;
            requestLayout();
        }
    }

    @Override // defpackage.ho5, android.view.View
    public final void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        View viewFindViewById = ((ConstraintLayout) getParent()).findViewById(this.h);
        if (viewFindViewById != null) {
            this.i = viewFindViewById;
        } else {
            qp2.n("");
        }
    }

    @Override // defpackage.ho5, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
        if (p()) {
            return;
        }
        View view = this.i;
        if (view == null) {
            view = null;
        }
        int width = view.getWidth();
        View view2 = this.i;
        setMeasuredDimension(width, (view2 != null ? view2 : null).getHeight());
    }

    public final boolean p() {
        int width = getWidth();
        View view = this.i;
        if (view == null) {
            view = null;
        }
        if (width != view.getWidth()) {
            return false;
        }
        int height = getHeight();
        View view2 = this.i;
        return height == (view2 != null ? view2 : null).getHeight();
    }
}
