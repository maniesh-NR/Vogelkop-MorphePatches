package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class gcd extends Drawable {
    public final Paint a;
    public final Bitmap b;
    public final gjf c;

    public gcd(Bitmap bitmap, gjf gjfVar) {
        Paint paint = new Paint(3);
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        this.b = bitmap;
        this.c = gjfVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth = getBounds().width();
        Bitmap bitmap = this.b;
        float width = fWidth / bitmap.getWidth();
        float fHeight = getBounds().height() / bitmap.getHeight();
        Paint paint = this.a;
        if (width == 1.0f && fHeight == 1.0f) {
            paint.getShader().setLocalMatrix(null);
        } else {
            float fMax = Math.max(width, fHeight);
            Matrix matrix = new Matrix();
            matrix.setScale(fMax, fMax);
            paint.getShader().setLocalMatrix(matrix);
        }
        Path path = new Path(this.c.b(getBounds().width(), 0).c);
        path.offset(getBounds().left, getBounds().top);
        canvas.drawPath(path, paint);
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
