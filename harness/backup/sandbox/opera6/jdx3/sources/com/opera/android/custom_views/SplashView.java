package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.ssi;

/* loaded from: classes.dex */
public class SplashView extends FrameLayout {
    public SplashView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        postDelayed(new ssi(this, (byte) 5), 400L);
    }
}
