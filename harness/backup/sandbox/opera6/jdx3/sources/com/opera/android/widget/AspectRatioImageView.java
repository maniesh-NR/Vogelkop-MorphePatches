package com.opera.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.opera.android.custom_views.StylingImageView;
import defpackage.bi;
import defpackage.rn9;

/* loaded from: classes.dex */
public class AspectRatioImageView extends StylingImageView {
    public static final /* synthetic */ int l = 0;
    public final rn9 k;

    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        rn9 rn9Var = new rn9(new bi(this, (byte) 29));
        this.k = rn9Var;
        rn9Var.B(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void f(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
    }

    public final void onMeasure(int i, int i2) {
        this.k.H(i, i2);
    }
}
