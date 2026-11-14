package com.opera.android.custom_views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public class CircleImageView extends StylingImageView {
    public int k;
    public int l;
    public int m;
    public final Paint n;
    public final Paint o;
    public final Matrix p;
    public Bitmap q;
    public BitmapShader r;
    public Bitmap s;

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.n = paint;
        this.o = new Paint(1);
        this.p = new Matrix();
        paint.setColor(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.custom_views.StylingImageView
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Bitmap bitmap2 = this.q;
                if (bitmap2 != null && (bitmap2.getWidth() != intrinsicWidth || this.q.getHeight() != intrinsicHeight)) {
                    this.q.recycle();
                    this.q = null;
                }
                Bitmap bitmap3 = this.q;
                if (bitmap3 == null) {
                    Bitmap bitmapU = z5i.u(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                    this.q = bitmapU;
                    if (bitmapU == null) {
                        bitmap = null;
                    }
                } else {
                    bitmap3.eraseColor(0);
                }
                Canvas canvas2 = new Canvas(this.q);
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable.draw(canvas2);
                bitmap = this.q;
            }
            if (bitmap == null) {
                return;
            }
            float fMax = (this.k * 2.0f) / Math.max(Math.min(bitmap.getWidth(), bitmap.getHeight()), 1);
            Matrix matrix = this.p;
            matrix.setScale(fMax, fMax);
            matrix.postTranslate((getMeasuredWidth() - (bitmap.getWidth() * fMax)) / 2.0f, (getMeasuredHeight() - (bitmap.getHeight() * fMax)) / 2.0f);
            if (this.r != null && this.s != bitmap) {
                this.r = null;
                this.s = null;
            }
            BitmapShader bitmapShader = this.r;
            if (bitmapShader == null) {
                bitmapShader = new BitmapShader(bitmap, Shader.TileMode.MIRROR, Shader.TileMode.REPEAT);
                this.r = bitmapShader;
                this.s = bitmap;
            }
            bitmapShader.setLocalMatrix(matrix);
            BitmapShader bitmapShader2 = this.r;
            Paint paint = this.o;
            paint.setShader(bitmapShader2);
            int i = this.l;
            canvas.drawCircle(i, i, i, this.n);
            int i2 = this.k;
            int i3 = this.m;
            canvas.drawCircle(i2 + i3, i3 + i2, i2, paint);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
        int iIntValue = ((Integer) Collections.max(Arrays.asList(Integer.valueOf(getPaddingTop()), Integer.valueOf(getPaddingRight()), Integer.valueOf(getPaddingBottom()), Integer.valueOf(getPaddingLeft())))).intValue();
        this.m = iIntValue;
        int i3 = iMin / 2;
        this.k = i3 - iIntValue;
        this.l = i3;
        setMeasuredDimension(iMin, iMin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBackgroundColor(int i) {
        this.n.setColor(i);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setColorFilter(ColorFilter colorFilter) {
        this.o.setColorFilter(colorFilter);
        invalidate();
    }
}
