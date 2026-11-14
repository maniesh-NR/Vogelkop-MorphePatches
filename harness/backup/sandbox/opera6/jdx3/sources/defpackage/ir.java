package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.leanplum.internal.ResourceQualifiers;

/* loaded from: classes.dex */
public final class ir extends Drawable implements Drawable.Callback {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Drawable f;
    public final er g;
    public final gr h;
    public float i;
    public float j;
    public final Paint k;

    public ir(int i, int i2, int i3, int i4, int i5, Drawable drawable, er erVar, gr grVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = drawable;
        this.g = erVar;
        this.h = grVar;
        this.i = 1.0f;
        this.j = 1.0f;
        this.k = new Paint(1);
    }

    public ir(int i, int i2, int i3, int i4, int i5, Drawable drawable, er erVar, gr grVar, int i6) {
        this(i, i2, i3, i4, (i6 & 16) != 0 ? 0 : i5, drawable, erVar, (i6 & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0 ? new qs7((byte) 15) : grVar);
    }

    public final void a() {
        int iWidth = getBounds().width();
        int i = this.e << 1;
        float f = this.j;
        er erVar = this.g;
        this.f.setBounds(0, 0, erVar.c(f, iWidth - i), erVar.a(this.j, getBounds().height() - i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = this.b;
        Paint paint = this.k;
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        float f = getBounds().left;
        float f2 = getBounds().top;
        float f3 = getBounds().right;
        float f4 = getBounds().bottom;
        int i2 = this.a;
        float f5 = i2;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
        int i3 = getBounds().left;
        int i4 = this.e;
        int i5 = i3 + i4;
        int i6 = getBounds().top + i4;
        int i7 = (getBounds().right - i4) - i5;
        int i8 = (getBounds().bottom - i4) - i6;
        float f6 = i7;
        Drawable drawable = this.f;
        float f7 = i8;
        float fMin = Math.min(f6 / drawable.getBounds().width(), f7 / drawable.getBounds().height());
        canvas.save();
        float f8 = i5;
        if (fMin < 1.0f) {
            canvas.translate(((f6 - (drawable.getBounds().width() * fMin)) / 2.0f) + f8, ((f7 - (drawable.getBounds().height() * fMin)) / 2.0f) + i6);
            canvas.scale(fMin, fMin);
        } else {
            canvas.translate(((i7 - drawable.getBounds().width()) / 2.0f) + f8, ((i8 - drawable.getBounds().height()) / 2.0f) + i6);
        }
        drawable.draw(canvas);
        canvas.restore();
        if (drawable.getBounds().width() >= getBounds().width() || drawable.getBounds().height() >= getBounds().height()) {
            paint.setColor(p37.a0(this.i, this.c));
            paint.setStyle(Paint.Style.STROKE);
            float f9 = this.d;
            paint.setStrokeWidth(f9);
            float f10 = f9 / 2.0f;
            float f11 = i2 - f10;
            canvas.drawRoundRect(getBounds().left + f10, getBounds().top + f10, getBounds().right - f10, getBounds().bottom - f10, f11, f11, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr) | this.f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
