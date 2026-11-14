package com.opera.android.custom_views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import defpackage.xy4;

/* loaded from: classes.dex */
public class TopPaddingFadingScrollView extends FadingScrollView {
    public final xy4 d;

    public TopPaddingFadingScrollView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new xy4(this, context);
    }

    @Override // com.opera.android.custom_views.FadingScrollView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xy4 xy4Var = this.d;
        TopPaddingFadingScrollView topPaddingFadingScrollView = (TopPaddingFadingScrollView) xy4Var.d;
        if (!xy4Var.c) {
            View childAt = xy4Var.e;
            if (childAt == null) {
                childAt = topPaddingFadingScrollView.getChildAt(0);
                xy4Var.e = childAt;
            }
            if (childAt != null && ((topPaddingFadingScrollView.canScrollVertically(-1) || topPaddingFadingScrollView.canScrollVertically(1)) && !xy4Var.b)) {
                xy4Var.a(true);
            }
            xy4Var.c = true;
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        xy4 xy4Var = this.d;
        boolean z = xy4Var.b;
        if (z && z) {
            xy4Var.a(false);
        }
        xy4Var.c = false;
    }
}
