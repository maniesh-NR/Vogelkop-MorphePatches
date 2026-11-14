package com.opera.ad.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import defpackage.jhh;

/* loaded from: classes.dex */
public class RoundedCornerImageView extends RestrainImageView {
    public int b;
    public final Matrix c;
    public final boolean d;
    public final Paint e;
    public Bitmap f;
    public BitmapShader g;
    public Bitmap h;
    public RectF i;
    public float j;

    public RoundedCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new Matrix();
        this.e = new Paint(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jhh.b);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.d = z;
        this.j = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            this.a = 1.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.ad.view.RoundedCornerImageView.onDraw(android.graphics.Canvas):void");
    }

    @Override // com.opera.ad.view.RestrainImageView, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = getWidth() / 2;
    }
}
