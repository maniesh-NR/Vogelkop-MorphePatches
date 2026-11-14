package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class lkn extends Drawable {
    public static final sjn j = new sjn(8);
    public final xkn a;
    public final Paint b;
    public final Matrix c;
    public Bitmap d;
    public final int e;
    public final y1n f;
    public BitmapShader g;
    public LinearGradient h;
    public final zjn i;

    public lkn(xkn xknVar, Bitmap bitmap, int i, y1n y1nVar) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Matrix();
        this.i = new zjn();
        this.a = xknVar;
        paint.setFilterBitmap(true);
        this.d = bitmap;
        this.e = i;
        this.f = y1nVar;
    }

    public final int a() {
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return 0;
    }

    public final int b() {
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return 0;
    }

    public final void c(Context context) {
        String str = this.a.a;
        zjn zjnVar = this.i;
        zjnVar.getClass();
        SharedPreferences sharedPreferences = ru9.c(context).a;
        if (str.equals(sharedPreferences.getString("wallpaper.adjust.id", null))) {
            zjnVar.a = sharedPreferences.getFloat("wallpaper.adjust.scale", zjnVar.a);
            zjnVar.b = sharedPreferences.getFloat("wallpaper.adjust.pivotx", zjnVar.b);
            zjnVar.c = sharedPreferences.getFloat("wallpaper.adjust.pivoty", zjnVar.c);
        }
    }

    public void d(Canvas canvas) {
        Rect bounds = getBounds();
        Bitmap bitmap = this.d;
        int i = this.e;
        Paint paint = this.b;
        if (bitmap == null) {
            Rect bounds2 = getBounds();
            xkn xknVar = this.a;
            int i2 = xknVar.d;
            int i3 = xknVar.e;
            if (i2 != i3) {
                if (this.h == null) {
                    float f = bounds2.left;
                    this.h = new LinearGradient(f, bounds2.top, f, bounds2.bottom, new int[]{xknVar.d, i3}, (float[]) null, Shader.TileMode.CLAMP);
                }
                paint.setColor(-1);
                paint.setShader(this.h);
            } else {
                paint.setColor(i2);
            }
            float f2 = i;
            canvas.drawRoundRect(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom, f2, f2, paint);
            return;
        }
        if (this.g == null) {
            Bitmap bitmap2 = this.d;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
            this.g = bitmapShader;
            paint.setShader(bitmapShader);
        }
        int width = this.d.getWidth();
        int height = this.d.getHeight();
        zjn zjnVar = this.i;
        float fA = zjnVar.a(bounds, width, height);
        float f3 = (-width) * zjnVar.b;
        float f4 = (-height) * zjnVar.c;
        Matrix matrix = this.c;
        matrix.setTranslate(f3, f4);
        matrix.postScale(fA, fA);
        matrix.postTranslate((bounds.width() * zjnVar.b) + bounds.left, (bounds.height() * zjnVar.c) + bounds.top);
        this.g.setLocalMatrix(matrix);
        canvas.drawRoundRect(bounds.left, bounds.top, bounds.right, bounds.bottom, i, i, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f.run();
        d(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.e > 0 ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(getBounds(), this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
