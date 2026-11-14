package com.opera.android.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.g;
import defpackage.lph;
import defpackage.vph;

/* loaded from: classes.dex */
public class StackLayoutManager extends f {
    @Override // androidx.recyclerview.widget.f
    public final lph generateDefaultLayoutParams() {
        return new lph(-2, -1);
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.f
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        recyclerView.A0(this);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onLayoutChildren(g gVar, vph vphVar) {
        int iB = vphVar.b();
        if (iB != 0) {
            detachAndScrapAttachedViews(gVar);
            int measuredWidth = p(gVar, 0, 0).getMeasuredWidth();
            for (int i = 1; i < iB; i++) {
                p(gVar, i, measuredWidth);
            }
        }
    }

    public final View p(g gVar, int i, int i2) {
        View viewD = gVar.d(i);
        int iMin = Math.min(i, 2);
        addView(viewD);
        measureChildWithMargins(viewD, 0, 0);
        double d = iMin;
        viewD.setScaleX((float) Math.pow(0.95d, d));
        viewD.setScaleY((float) Math.pow(0.95d, d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewD.getLayoutParams();
        int iMax = Math.max(0, (i2 - viewD.getMeasuredWidth()) / 2);
        layoutDecoratedWithMargins(viewD, iMax, 0, viewD.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + iMax, viewD.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
        viewD.setVisibility(i > 2 ? 4 : 0);
        return viewD;
    }
}
