package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.opera.android.widget.RoundedImageView;

/* loaded from: classes.dex */
public final class b9i extends Drawable {
    public final Paint a;
    public final Bitmap b;
    public final BitmapShader c;
    public final Matrix d;
    public Path e;
    public final /* synthetic */ RoundedImageView f;

    public b9i(RoundedImageView roundedImageView, Bitmap bitmap) {
        this.f = roundedImageView;
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = new Matrix();
        this.b = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.c = bitmapShader;
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        int i;
        Rect bounds = getBounds();
        float fWidth = bounds.width();
        Bitmap bitmap = this.b;
        float fMax = Math.max(fWidth / bitmap.getWidth(), bounds.height() / bitmap.getHeight());
        Matrix matrix = this.d;
        matrix.setTranslate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(bounds.centerX(), bounds.centerY());
        this.c.setLocalMatrix(matrix);
        RoundedImageView roundedImageView = this.f;
        int i2 = roundedImageView.k;
        int i3 = roundedImageView.l;
        Paint paint = this.a;
        if (i2 == i3) {
            float f2 = i2;
            canvas.drawRoundRect(bounds.left, bounds.top, bounds.right, bounds.bottom, f2, f2, paint);
            return;
        }
        if (getLayoutDirection() == 1) {
            f = roundedImageView.l;
            i = roundedImageView.k;
        } else {
            f = roundedImageView.k;
            i = roundedImageView.l;
        }
        float f3 = i;
        Path path = this.e;
        if (path == null) {
            path = new Path();
            this.e = path;
        }
        path.rewind();
        this.e.moveTo(bounds.right, bounds.top + f3);
        Path path2 = this.e;
        float f4 = bounds.right;
        float f5 = bounds.top;
        int i4 = RoundedImageView.n;
        float f6 = f3 * 0.5522848f;
        float f7 = f4 - f3;
        path2.cubicTo(f4, (f5 + f3) - f6, f7 + f6, f5, f7, f5);
        this.e.lineTo(bounds.left + f, bounds.top);
        Path path3 = this.e;
        float f8 = bounds.left;
        float f9 = 0.5522848f * f;
        float f10 = bounds.top;
        float f11 = f10 + f;
        path3.cubicTo((f8 + f) - f9, f10, f8, f11 - f9, f8, f11);
        this.e.lineTo(bounds.left, bounds.bottom - f);
        Path path4 = this.e;
        float f12 = bounds.left;
        float f13 = bounds.bottom;
        float f14 = f12 + f;
        path4.cubicTo(f12, (f13 - f) + f9, f14 - f9, f13, f14, f13);
        this.e.lineTo(bounds.right - f3, bounds.bottom);
        Path path5 = this.e;
        float f15 = bounds.right;
        float f16 = bounds.bottom;
        float f17 = f16 - f3;
        path5.cubicTo((f15 - f3) + f6, f16, f15, f17 + f6, f15, f17);
        this.e.close();
        canvas.drawPath(this.e, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
