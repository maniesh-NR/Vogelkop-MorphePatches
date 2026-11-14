package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class hq4 extends Drawable {
    public final f26 a;
    public final BitmapShader b;
    public final Paint c;
    public final Matrix d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq4(float f, int i, int i2, Bitmap bitmap) {
        this(bitmap, (i2 & 2) != 0 ? -1 : i, 0.5f, 0.5f, f);
        this.e = (byte) 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hq4(Bitmap bitmap, int i) {
        this(new gq4(bitmap, i, 0.5f, 0.5f));
        this.e = (byte) 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hq4(Bitmap bitmap, int i, float f, float f2, float f3) {
        this(new g26(bitmap, i, f, f2, f3));
        this.e = (byte) 1;
    }

    public hq4(f26 f26Var) {
        this.a = f26Var;
        Bitmap bitmap = f26Var.a;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.b = bitmapShader;
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        this.c = paint;
        this.d = new Matrix();
        paint.setShader(bitmapShader);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        f26 f26Var = this.a;
        Bitmap bitmap = f26Var.a;
        float f = f26Var.c;
        float f2 = f26Var.d;
        Rect bounds = getBounds();
        float fMax = Math.max(bounds.width() / bitmap.getWidth(), bounds.height() / bitmap.getHeight());
        Matrix matrix = this.d;
        matrix.setTranslate((-bitmap.getWidth()) * f, (-bitmap.getHeight()) * f2);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate((bounds.width() * f) + bounds.left, (bounds.height() * f2) + bounds.top);
        this.b.setLocalMatrix(matrix);
        byte b = this.e;
        Paint paint = this.c;
        switch (b) {
            case 0:
                canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), Math.min(bounds.width(), bounds.height()) / 2.0f, paint);
                break;
            default:
                RectF rectF = new RectF(bounds);
                float f3 = ((g26) f26Var).e;
                canvas.drawRoundRect(rectF, f3, f3, paint);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        switch (this.e) {
            case 0:
                outline.setOval(getBounds());
                break;
            default:
                outline.setRoundRect(getBounds(), ((g26) this.a).e);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.c;
        if (i == paint.getAlpha()) {
            return;
        }
        paint.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }
}
