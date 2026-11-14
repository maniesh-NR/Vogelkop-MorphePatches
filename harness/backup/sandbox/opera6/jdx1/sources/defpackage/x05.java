package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class x05 extends Drawable implements Animatable {
    public static final LinearInterpolator g = new LinearInterpolator();
    public static final zp8 h = new zp8();
    public static final int[] i = {-16777216};
    public final u05 a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;

    public x05(Context context) {
        context.getClass();
        this.c = context.getResources();
        u05 u05Var = new u05();
        this.a = u05Var;
        u05Var.i = i;
        u05Var.a(0);
        u05Var.h = 2.5f;
        u05Var.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new s05(this, u05Var));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(g);
        valueAnimatorOfFloat.addListener(new t05(this, u05Var));
        this.d = valueAnimatorOfFloat;
    }

    public static void e(float f, u05 u05Var) {
        if (f <= 0.75f) {
            u05Var.u = u05Var.i[u05Var.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = u05Var.i;
        int i2 = u05Var.j;
        int i3 = iArr[i2];
        int i4 = iArr[(i2 + 1) % iArr.length];
        u05Var.u = ((((i3 >> 24) & 255) + ((int) ((((i4 >> 24) & 255) - r1) * f2))) << 24) | ((((i3 >> 16) & 255) + ((int) ((((i4 >> 16) & 255) - r3) * f2))) << 16) | ((((i3 >> 8) & 255) + ((int) ((((i4 >> 8) & 255) - r4) * f2))) << 8) | ((i3 & 255) + ((int) (f2 * ((i4 & 255) - r2))));
    }

    public final void a(float f, u05 u05Var, boolean z) {
        float interpolation;
        if (this.f) {
            e(f, u05Var);
            float fFloor = (float) (Math.floor(u05Var.m / 0.8f) + 1.0d);
            float f2 = u05Var.k;
            float f3 = u05Var.l;
            u05Var.e = (((f3 - 0.01f) - f2) * f) + f2;
            u05Var.f = f3;
            float f4 = u05Var.m;
            u05Var.g = v0g.g(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = u05Var.m;
            float interpolation2 = u05Var.k;
            zp8 zp8Var = h;
            if (f < 0.5f) {
                interpolation = (zp8Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                float f6 = interpolation2 + 0.79f;
                interpolation2 = f6 - (((1.0f - zp8Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.e) * 216.0f;
            u05Var.e = interpolation2;
            u05Var.f = interpolation;
            u05Var.g = f7;
            this.b = f8;
        }
    }

    public final void b(int... iArr) {
        u05 u05Var = this.a;
        u05Var.i = iArr;
        u05Var.a(0);
        u05Var.a(0);
        invalidateSelf();
    }

    public final void c(float f, float f2, float f3, float f4) {
        float f5 = this.c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        u05 u05Var = this.a;
        u05Var.h = f6;
        u05Var.b.setStrokeWidth(f6);
        u05Var.q = f * f5;
        u05Var.a(0);
        u05Var.r = (int) (f3 * f5);
        u05Var.s = (int) (f4 * f5);
    }

    public final void d(int i2) {
        if (i2 == 0) {
            c(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            c(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        u05 u05Var = this.a;
        Paint paint = u05Var.b;
        RectF rectF = u05Var.a;
        float f = u05Var.q;
        float fMin = (u05Var.h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((u05Var.r * u05Var.p) / 2.0f, u05Var.h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = u05Var.e;
        float f3 = u05Var.g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((u05Var.f + f3) * 360.0f) - f4;
        paint.setColor(u05Var.u);
        paint.setAlpha(u05Var.t);
        float f6 = u05Var.h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, u05Var.d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = u05Var.c;
        if (u05Var.n) {
            Path path = u05Var.o;
            if (path == null) {
                Path path2 = new Path();
                u05Var.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (u05Var.r * u05Var.p) / 2.0f;
            u05Var.o.moveTo(0.0f, 0.0f);
            u05Var.o.lineTo(u05Var.r * u05Var.p, 0.0f);
            Path path3 = u05Var.o;
            float f9 = u05Var.r;
            float f10 = u05Var.p;
            path3.lineTo((f9 * f10) / 2.0f, u05Var.s * f10);
            u05Var.o.offset((rectF.centerX() + fMin2) - f8, (u05Var.h / 2.0f) + rectF.centerY());
            u05Var.o.close();
            paint2.setColor(u05Var.u);
            paint2.setAlpha(u05Var.t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(u05Var.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.a.t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.d;
        valueAnimator.cancel();
        u05 u05Var = this.a;
        float f = u05Var.e;
        u05Var.k = f;
        float f2 = u05Var.f;
        u05Var.l = f2;
        u05Var.m = u05Var.g;
        if (f2 != f) {
            this.f = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        u05Var.a(0);
        u05Var.k = 0.0f;
        u05Var.l = 0.0f;
        u05Var.m = 0.0f;
        u05Var.e = 0.0f;
        u05Var.f = 0.0f;
        u05Var.g = 0.0f;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.cancel();
        this.b = 0.0f;
        u05 u05Var = this.a;
        if (u05Var.n) {
            u05Var.n = false;
        }
        u05Var.a(0);
        u05Var.k = 0.0f;
        u05Var.l = 0.0f;
        u05Var.m = 0.0f;
        u05Var.e = 0.0f;
        u05Var.f = 0.0f;
        u05Var.g = 0.0f;
        invalidateSelf();
    }
}
