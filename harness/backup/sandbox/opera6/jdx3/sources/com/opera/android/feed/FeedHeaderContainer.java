package com.opera.android.feed;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.bn7;

/* loaded from: classes.dex */
public class FeedHeaderContainer extends FrameLayout {
    public final int a;
    public bn7 b;

    public FeedHeaderContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.a = Math.max(resources.getDimensionPixelSize(2131165724), resources.getDimensionPixelSize(2131167590));
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        return this.a;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        bn7 bn7Var = this.b;
        if (bn7Var != null) {
            bn7Var.run();
        }
    }
}
