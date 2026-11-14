package com.opera.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.opera.android.custom_views.LayoutDirectionViewPager;
import defpackage.rn9;
import defpackage.va2;

/* loaded from: classes.dex */
public class AspectRatioViewPager extends LayoutDirectionViewPager {
    public static final /* synthetic */ int d = 0;
    public final rn9 c;

    public AspectRatioViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        rn9 rn9Var = new rn9(new va2(this, (byte) 0));
        this.c = rn9Var;
        rn9Var.B(context, attributeSet);
    }

    public final void onMeasure(int i, int i2) {
        this.c.H(i, i2);
    }

    public final /* synthetic */ void s(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
