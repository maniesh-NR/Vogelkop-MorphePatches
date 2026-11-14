package com.opera.android.feed;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/feed/FeedContainerView;", "Landroid/widget/LinearLayout;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FeedContainerView extends LinearLayout {
    public int a;

    public FeedContainerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i = this.a;
        int width = getWidth() - this.a;
        int height = getHeight();
        int iSave = canvas.save();
        canvas.clipRect(i, 0, width, height);
        try {
            super.dispatchDraw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
