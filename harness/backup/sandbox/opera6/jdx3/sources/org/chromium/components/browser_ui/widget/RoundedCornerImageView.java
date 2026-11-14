package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RoundedCornerImageView extends AppCompatImageView {
    public final RectF a;
    public final Matrix b;
    public final Paint c;
    public Paint d;
    public final boolean e;
    public final RoundRectShape f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public RoundedCornerImageView(Context context, AttributeSet attributeSet) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        int color;
        float[] fArr;
        super(context, attributeSet, 0);
        this.a = new RectF();
        this.b = new Matrix();
        Paint paint = new Paint(1);
        this.c = paint;
        this.g = 0;
        this.e = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, phh.f, 0, 0);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
            dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            color = typedArrayObtainStyledAttributes.getColor(6, 0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
            dimensionPixelSize3 = 0;
            dimensionPixelSize4 = 0;
            color = 0;
        }
        WeakHashMap weakHashMap = r5n.a;
        if (getLayoutDirection() == 0) {
            float f = dimensionPixelSize;
            float f2 = dimensionPixelSize2;
            float f3 = dimensionPixelSize4;
            float f4 = dimensionPixelSize3;
            fArr = new float[]{f, f, f2, f2, f3, f3, f4, f4};
        } else {
            float f5 = dimensionPixelSize2;
            float f6 = dimensionPixelSize;
            float f7 = dimensionPixelSize3;
            float f8 = dimensionPixelSize4;
            fArr = new float[]{f5, f5, f6, f6, f7, f7, f8, f8};
        }
        this.f = new RoundRectShape(fArr, null, null);
        this.g = color;
        paint.setColor(color);
        invalidate();
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Drawable drawable = getDrawable();
        if (this.e) {
            boolean z = drawable instanceof ColorDrawable;
            Paint paint = this.c;
            if (z) {
                paint.setColor(((ColorDrawable) getDrawable()).getColor());
                this.d = null;
                return;
            }
            boolean z2 = drawable instanceof BitmapDrawable;
            int i = this.g;
            if (z2) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    paint.setColor(i);
                    this.d = new Paint(1);
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    Paint paint2 = this.d;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    return;
                }
            }
            paint.setColor(i);
            this.d = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:6:0x0031, B:8:0x0044, B:10:0x004f, B:12:0x0053, B:13:0x005a, B:15:0x0060, B:16:0x00a2), top: B:23:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            android.graphics.Paint r0 = r9.c
            android.graphics.RectF r1 = r9.a
            android.graphics.Matrix r2 = r9.b
            int r3 = r9.getWidth()
            int r4 = r9.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r9.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r9.getHeight()
            int r5 = r9.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r9.getPaddingBottom()
            int r4 = r4 - r5
            if (r3 <= 0) goto Lb0
            if (r4 <= 0) goto Lb0
            float r3 = (float) r3
            float r4 = (float) r4
            android.graphics.drawable.shapes.RoundRectShape r5 = r9.f
            r5.resize(r3, r4)
            int r3 = r10.save()
            int r4 = r9.getPaddingLeft()     // Catch: java.lang.Throwable -> Lab
            float r4 = (float) r4     // Catch: java.lang.Throwable -> Lab
            int r6 = r9.getPaddingTop()     // Catch: java.lang.Throwable -> Lab
            float r6 = (float) r6     // Catch: java.lang.Throwable -> Lab
            r10.translate(r4, r6)     // Catch: java.lang.Throwable -> Lab
            int r4 = r0.getColor()     // Catch: java.lang.Throwable -> Lab
            if (r4 == 0) goto L4f
            r5.draw(r10, r0)     // Catch: java.lang.Throwable -> Lab
            android.graphics.drawable.Drawable r0 = r9.getDrawable()     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> Lab
            if (r0 != 0) goto La7
        L4f:
            android.graphics.Paint r0 = r9.d     // Catch: java.lang.Throwable -> Lab
            if (r0 != 0) goto L5a
            r10.restoreToCount(r3)     // Catch: java.lang.Throwable -> Lab
            super/*android.view.View*/.onDraw(r10)     // Catch: java.lang.Throwable -> Lab
            goto La7
        L5a:
            android.graphics.Shader r0 = r0.getShader()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La2
            android.graphics.drawable.Drawable r4 = r9.getDrawable()     // Catch: java.lang.Throwable -> Lab
            r6 = r4
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6     // Catch: java.lang.Throwable -> Lab
            android.graphics.Bitmap r6 = r6.getBitmap()     // Catch: java.lang.Throwable -> Lab
            android.graphics.Matrix r7 = r9.getImageMatrix()     // Catch: java.lang.Throwable -> Lab
            r2.set(r7)     // Catch: java.lang.Throwable -> Lab
            int r7 = r4.getIntrinsicWidth()     // Catch: java.lang.Throwable -> Lab
            float r7 = (float) r7     // Catch: java.lang.Throwable -> Lab
            int r8 = r6.getWidth()     // Catch: java.lang.Throwable -> Lab
            float r8 = (float) r8     // Catch: java.lang.Throwable -> Lab
            float r7 = r7 / r8
            int r4 = r4.getIntrinsicHeight()     // Catch: java.lang.Throwable -> Lab
            float r4 = (float) r4     // Catch: java.lang.Throwable -> Lab
            int r8 = r6.getHeight()     // Catch: java.lang.Throwable -> Lab
            float r8 = (float) r8     // Catch: java.lang.Throwable -> Lab
            float r4 = r4 / r8
            r2.preScale(r7, r4)     // Catch: java.lang.Throwable -> Lab
            r0.setLocalMatrix(r2)     // Catch: java.lang.Throwable -> Lab
            int r0 = r6.getWidth()     // Catch: java.lang.Throwable -> Lab
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Lab
            int r4 = r6.getHeight()     // Catch: java.lang.Throwable -> Lab
            float r4 = (float) r4     // Catch: java.lang.Throwable -> Lab
            r6 = 0
            r1.set(r6, r6, r0, r4)     // Catch: java.lang.Throwable -> Lab
            r2.mapRect(r1)     // Catch: java.lang.Throwable -> Lab
            r10.clipRect(r1)     // Catch: java.lang.Throwable -> Lab
        La2:
            android.graphics.Paint r9 = r9.d     // Catch: java.lang.Throwable -> Lab
            r5.draw(r10, r9)     // Catch: java.lang.Throwable -> Lab
        La7:
            r10.restoreToCount(r3)
            return
        Lab:
            r9 = move-exception
            r10.restoreToCount(r3)
            throw r9
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.browser_ui.widget.RoundedCornerImageView.onDraw(android.graphics.Canvas):void");
    }

    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a();
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    public final void setImageResource(int i) {
        super.setImageResource(i);
        a();
    }
}
