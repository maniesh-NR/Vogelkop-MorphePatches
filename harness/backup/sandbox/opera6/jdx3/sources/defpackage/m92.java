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
public class m92 extends Drawable {
    public final Paint a;
    public final Bitmap b;
    public final BitmapShader c;
    public final Matrix d;
    public final int e;

    public m92(Bitmap bitmap, int i) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = new Matrix();
        this.e = i;
        this.b = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.c = bitmapShader;
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fWidth = bounds.width();
        Bitmap bitmap = this.b;
        float fMax = Math.max(fWidth / bitmap.getWidth(), bounds.height() / bitmap.getHeight());
        Matrix matrix = this.d;
        matrix.setTranslate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(bounds.centerX(), bounds.centerY());
        this.c.setLocalMatrix(matrix);
        float f = bounds.left;
        float f2 = bounds.top;
        float f3 = bounds.right;
        float f4 = bounds.bottom;
        int i = this.e;
        canvas.drawRoundRect(f, f2, f3, f4, i, i, this.a);
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
