package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.z61;

/* loaded from: classes.dex */
public class HiddenFragmentContainer extends FrameLayout {
    public final z61 a;
    public int b;

    public HiddenFragmentContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = new z61(this, (byte) 12);
    }
}
