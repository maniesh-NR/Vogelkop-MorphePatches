package com.opera.android.search;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.StatusBarDrawingFrameLayout;
import defpackage.hc;

/* loaded from: classes.dex */
public class SuggestionsContainer extends StatusBarDrawingFrameLayout {
    public final hc m;

    public SuggestionsContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        hc hcVar = new hc();
        this.m = hcVar;
        setBackground(hcVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        int left = childAt.getLeft();
        int top = childAt.getTop();
        int width = childAt.getWidth();
        int height = childAt.getHeight();
        hc hcVar = this.m;
        ((Rect) hcVar.b).set(left, top, width + left, height + top);
        hcVar.invalidateSelf();
    }
}
