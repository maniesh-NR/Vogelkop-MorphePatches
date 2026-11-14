package com.opera.android.custom_views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.z5n;

/* loaded from: classes.dex */
public class Shadow extends View {
    public final z5n a;

    public Shadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = new z5n(this, context, attributeSet);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.a.a(canvas, this, 1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
