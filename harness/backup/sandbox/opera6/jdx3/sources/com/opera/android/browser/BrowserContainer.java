package com.opera.android.browser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.InputFilterFrameLayout;
import defpackage.f2c;
import defpackage.ix3;

/* loaded from: classes.dex */
public class BrowserContainer extends InputFilterFrameLayout {
    public int d;
    public View e;

    public BrowserContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.opera.android.custom_views.LayoutDirectionFrameLayout
    /* renamed from: a */
    public final f2c generateLayoutParams(AttributeSet attributeSet) {
        return new ix3(getContext(), attributeSet);
    }

    @Override // com.opera.android.custom_views.LayoutDirectionFrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ix3;
    }

    public final void e(int i, boolean z) {
        int i2 = this.d;
        if (z) {
            this.d = i2 | i;
        } else {
            this.d = i2 & (~i);
        }
    }

    @Override // com.opera.android.custom_views.LayoutDirectionFrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ix3();
    }

    @Override // com.opera.android.custom_views.LayoutDirectionFrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new ix3();
    }

    @Override // com.opera.android.custom_views.LayoutDirectionFrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ix3(getContext(), attributeSet);
    }

    @Override // com.opera.android.custom_views.LayoutDirectionFrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ix3 ? new ix3((ix3) layoutParams) : layoutParams instanceof f2c ? new ix3((f2c) layoutParams) : layoutParams instanceof FrameLayout.LayoutParams ? new ix3((FrameLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ix3((ViewGroup.MarginLayoutParams) layoutParams) : new ix3(layoutParams);
    }

    @Override // com.opera.android.custom_views.LayoutDirectionFrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ix3(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            d3o d3oVar = g3o.g((View) null, windowInsets).a;
            ix3 ix3Var = (ix3) childAt.getLayoutParams();
            int i2 = (ix3Var.b & 1) == 1 ? 0 : d3oVar.i(647).b;
            int i3 = (ix3Var.b & 2) == 2 ? 0 : d3oVar.i(647).d;
            if (i2 != ((FrameLayout.LayoutParams) ix3Var).topMargin || i3 != ((FrameLayout.LayoutParams) ix3Var).bottomMargin) {
                ((FrameLayout.LayoutParams) ix3Var).topMargin = i2;
                ((FrameLayout.LayoutParams) ix3Var).bottomMargin = i3;
                childAt.setLayoutParams(ix3Var);
            }
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    @Override // com.opera.android.custom_views.LayoutDirectionFrameLayout, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.d
            r1 = r0 & 2
            r2 = 0
            r3 = 2
            if (r1 != r3) goto L11
            r1 = r0 & 4
            r3 = 4
            if (r1 == r3) goto L11
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L12
        L11:
            r1 = r2
        L12:
            android.view.View r0 = r4.e
            if (r0 != 0) goto L23
            java.util.WeakHashMap r0 = r5n.a
            r0 = 2131362758(0x7f0a03c6, float:1.8345306E38)
            java.lang.Object r0 = m5n.f(r4, r0)
            android.view.View r0 = (android.view.View) r0
            r4.e = r0
        L23:
            if (r1 != 0) goto L27
            r2 = 8
        L27:
            r0.setVisibility(r2)
            super.onMeasure(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.browser.BrowserContainer.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        view.requestApplyInsets();
    }
}
