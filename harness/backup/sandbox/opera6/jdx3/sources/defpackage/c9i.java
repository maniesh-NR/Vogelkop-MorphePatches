package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c9i extends Drawable {
    public final float a;
    public int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public int g;
    public final Paint h;

    public /* synthetic */ c9i(float f, int i) {
        this(f, i, -1, -1, 0, 0.0f);
    }

    public c9i(float f, int i, int i2, int i3, int i4, float f2) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f2;
        this.g = 255;
        this.h = new Paint(1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setColor(p37.a0(this.g / 255.0f, this.b));
        float f3 = this.f;
        int i = this.e;
        float f4 = (f3 <= 0.0f || i == 0 || Color.alpha(i) != 255) ? 0.0f : 0.5f;
        float f5 = getBounds().left + f4;
        float f6 = getBounds().top + f4;
        float f7 = getBounds().right - f4;
        float f8 = getBounds().bottom - f4;
        float f9 = this.a;
        float f10 = f9 - f4;
        if (f10 < 0.0f) {
            f = 0.0f;
            canvas2 = canvas;
            f2 = 0.0f;
        } else {
            f = f10;
            f2 = f;
            canvas2 = canvas;
        }
        canvas2.drawRoundRect(f5, f6, f7, f8, f, f2, paint);
        if (f3 <= 0.0f || i == 0) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(p37.a0(this.g / 255.0f, i));
        paint.setStrokeWidth(f3);
        float f11 = f3 / 2.0f;
        float f12 = getBounds().left + f11;
        float f13 = getBounds().top + f11;
        float f14 = getBounds().right - f11;
        float f15 = getBounds().bottom - f11;
        float f16 = f9 - f11;
        float f17 = f16 < 0.0f ? 0.0f : f16;
        canvas2.drawRoundRect(f12, f13, f14, f15, f17, f17, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.h.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.h;
        if (Intrinsics.a(colorFilter, paint.getColorFilter())) {
            return;
        }
        paint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
