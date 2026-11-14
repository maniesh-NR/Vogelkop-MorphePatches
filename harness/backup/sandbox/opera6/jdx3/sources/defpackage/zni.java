package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class zni extends Drawable {
    public final yni a;
    public final float b;
    public final Bitmap c;
    public final Paint d;
    public final BitmapShader e;
    public final Matrix f;
    public final float g;
    public float h;

    public zni(yni yniVar, float f) {
        this.a = yniVar;
        this.b = f;
        Bitmap bitmap = yniVar.a;
        this.c = bitmap;
        Paint paint = new Paint(1);
        this.d = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.e = bitmapShader;
        this.f = new Matrix();
        this.g = 0.5f;
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float height = (this.a.b - this.h) * r1.a.getHeight();
        float fWidth = bounds.width();
        Bitmap bitmap = this.c;
        float fMax = Math.max(fWidth / bitmap.getWidth(), bounds.height() / (bitmap.getHeight() - height));
        float f = -bitmap.getWidth();
        float f2 = this.g;
        float f3 = ((-bitmap.getHeight()) * 0.0f) - height;
        Matrix matrix = this.f;
        matrix.setTranslate(f * f2, f3);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate((bounds.width() * f2) + bounds.left, (bounds.height() * 0.0f) + bounds.top);
        this.e.setLocalMatrix(matrix);
        float f4 = bounds.left;
        float f5 = bounds.top;
        float f6 = bounds.right;
        float f7 = bounds.bottom;
        float f8 = this.b;
        canvas.drawRoundRect(f4, f5, f6, f7, f8, f8, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(getBounds(), this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.d;
        if (i == paint.getAlpha()) {
            return;
        }
        paint.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
