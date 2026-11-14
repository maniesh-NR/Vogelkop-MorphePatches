package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class jq4 extends Drawable {
    public final int a;
    public final Paint b;
    public final Paint c;
    public final Bitmap d;
    public final BitmapShader e;
    public final Matrix f;
    public final float g;
    public final byte h;

    public jq4(float f, int i, int i2, Bitmap bitmap) {
        BitmapShader bitmapShader;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.f = new Matrix();
        this.a = i;
        this.g = f;
        this.h = (byte) 2;
        this.d = bitmap;
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            bitmapShader = null;
        }
        this.e = bitmapShader;
        paint2.setFilterBitmap(true);
        paint2.setShader(bitmapShader);
        paint.setColor(i2);
    }

    public final void a(Canvas canvas, Rect rect, Paint paint) {
        byte b = this.h;
        if (b == 0) {
            int i = rect.left;
            int i2 = rect.right;
            int i3 = this.a;
            float f = this.g;
            if (i3 == 0) {
                i = (int) (i - f);
            } else {
                i2 = (int) (i2 + f);
            }
            canvas.drawRoundRect(i, rect.top, i2, rect.bottom, f, f, paint);
            return;
        }
        if (b == 1) {
            float f2 = rect.left;
            float f3 = rect.top;
            float f4 = rect.right;
            float f5 = rect.bottom;
            float f6 = this.g;
            canvas.drawRoundRect(f2, f3, f4, f5 + f6, f6, f6, paint);
            return;
        }
        if (b != 2) {
            return;
        }
        float f7 = rect.left;
        float f8 = rect.top;
        float f9 = rect.right;
        float f10 = rect.bottom;
        float f11 = this.g;
        canvas.drawRoundRect(f7, f8, f9, f10, f11, f11, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        BitmapShader bitmapShader;
        Rect bounds = getBounds();
        canvas.save();
        canvas.clipRect(bounds.left, bounds.top, bounds.right, bounds.bottom);
        a(canvas, bounds, this.b);
        if (this.d != null && (bitmapShader = this.e) != null) {
            float fMax = Math.max(bounds.width() / r1.getWidth(), bounds.height() / r1.getHeight());
            Matrix matrix = this.f;
            matrix.setTranslate((-r1.getWidth()) / 2.0f, (-r1.getHeight()) / 2.0f);
            matrix.postScale(fMax, fMax);
            matrix.postTranslate(bounds.centerX(), bounds.centerY());
            bitmapShader.setLocalMatrix(matrix);
            a(canvas, bounds, this.c);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
