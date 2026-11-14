package com.opera.android.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.av8;
import defpackage.cv8;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class FeedScrollViewContentWrapper extends ViewGroup {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public av8 f;

    public FeedScrollViewContentWrapper(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        if (childAt2.getVisibility() != 8) {
            int measuredHeight = (getMeasuredHeight() - childAt2.getMeasuredHeight()) - this.c;
            childAt2.layout(0, measuredHeight, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight() + measuredHeight);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.opera.android.feed.FeedScrollView] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        int size = View.MeasureSpec.getSize(i);
        ?? r3 = (FeedScrollView) getParent();
        int paddingTop = (r3.E - r3.getPaddingTop()) - r3.getPaddingBottom();
        av8 av8Var = this.f;
        if (av8Var != null) {
            cv8 cv8Var = av8Var.a;
            ijc ijcVar = cv8Var.w;
            Size size2 = new Size(size, paddingTop - cv8Var.D.b);
            if (!Intrinsics.a((Size) ijcVar.i, size2)) {
                ijcVar.i = size2;
                ijcVar.h();
            }
            cv8Var.m.b();
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        int measuredHeight = childAt.getMeasuredHeight();
        boolean z = childAt2.getVisibility() != 8;
        this.e = z;
        if (z) {
            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((paddingTop - this.c) - this.a, 1073741824));
            setMeasuredDimension(size, Math.max(paddingTop, childAt2.getMeasuredHeight() + this.c + measuredHeight));
            return;
        }
        int i3 = measuredHeight + this.b;
        if (i3 <= paddingTop) {
            setMeasuredDimension(size, paddingTop);
        } else {
            setMeasuredDimension(size, Math.max(paddingTop + this.d, i3));
        }
    }
}
