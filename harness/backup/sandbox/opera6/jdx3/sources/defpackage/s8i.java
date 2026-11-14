package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class s8i extends Drawable {
    public static final PathInterpolator d = new PathInterpolator(0.33f, 0.0f, 1.0f, 1.0f);
    public static final float e = 0.5522848f;
    public final Bitmap a;
    public final int b;
    public final Paint c;

    public s8i(Bitmap bitmap, int i) {
        this.a = bitmap;
        this.b = i;
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        setBounds(0, 0, getIntrinsicWidth(), getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.b;
        return i == 0 ? this.a.getHeight() : i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.b;
        return i == 0 ? this.a.getWidth() : i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (this.a.hasAlpha() || this.c.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }
}
