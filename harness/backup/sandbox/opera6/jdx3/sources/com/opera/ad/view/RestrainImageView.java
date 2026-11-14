package com.opera.ad.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import defpackage.jhh;

/* loaded from: classes.dex */
public class RestrainImageView extends ImageView {
    public float a;

    public RestrainImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RestrainImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, -1);
        this.a = -1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jhh.a);
        this.a = typedArrayObtainStyledAttributes.getFloat(0, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.a < 0.0f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / this.a), 1073741824));
        }
    }
}
