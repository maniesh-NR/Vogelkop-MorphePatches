package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.opera.android.custom_views.PullSpinner;

/* loaded from: classes.dex */
public final class z9h {
    public int c;
    public float d;
    public float e;
    public final Paint h;
    public final Path i;
    public int a = 0;
    public int b = 0;
    public final RectF f = new RectF();
    public final RectF g = new RectF();

    public z9h() {
        Paint paint = new Paint();
        this.h = paint;
        Path path = new Path();
        this.i = path;
        paint.setAntiAlias(true);
        path.incReserve(4);
    }

    public final void a(Canvas canvas, float f, float f2) {
        int iSave = canvas.save();
        RectF rectF = this.f;
        float f3 = rectF.left;
        float f4 = this.d / 2.0f;
        canvas.translate(f3 + f4, f4 + rectF.top);
        canvas.rotate(f);
        float f5 = f2 * 3.0f * this.e;
        float fWidth = this.g.width() / 2.0f;
        Path path = this.i;
        path.rewind();
        float f6 = f5 / 2.0f;
        path.moveTo(fWidth - f6, -1.0f);
        path.lineTo(f6 + fWidth, -1.0f);
        path.lineTo(fWidth, f5 * 0.67f);
        path.close();
        int i = this.c;
        Paint paint = this.h;
        paint.setColor(i);
        canvas.drawPath(path, paint);
        canvas.restoreToCount(iSave);
    }

    public final void b(Canvas canvas, float f, float f2) {
        if (f2 == 0.0f) {
            return;
        }
        int i = this.c;
        Paint paint = this.h;
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(this.g, f, f2, false, paint);
        paint.setStyle(Paint.Style.FILL);
    }

    public final void c(Canvas canvas, float f, float f2) {
        float f3;
        int i = PullSpinner.u;
        float f4 = f2 * 2.0f;
        float f5 = (f4 > 1.0f ? 2.0f - f4 : f4) * 2.0f;
        if (f5 < 1.0f) {
            f3 = f5 * 0.5f * f5 * f5;
        } else {
            float f6 = f5 - 2.0f;
            f3 = ((f6 * f6 * f6) + 2.0f) * 0.5f;
        }
        float f7 = ((f3 * 0.7f) + 0.05f) * 360.0f;
        float f8 = (float) ((f2 <= 0.5f ? (f4 * 90.0f) + f : (((((f2 - 0.5f) * 2.0f) * 18.0f) + f) - f7) + 360.0f) % 360.0d);
        int i2 = this.a;
        if (i2 != 0) {
            Paint paint = this.h;
            paint.setColor(i2);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawOval(this.g, paint);
        }
        d(canvas);
        b(canvas, f8, f7);
    }

    public final void d(Canvas canvas) {
        int i = this.b;
        if (i == 0) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(this.g, 0.0f, 360.0f, false, paint);
        paint.setStyle(Paint.Style.FILL);
    }

    public final void e(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.d = f5;
        this.e = f6;
        RectF rectF = this.f;
        rectF.set(f, f2, f3, f4);
        RectF rectF2 = this.g;
        rectF2.set(rectF);
        float f8 = ((1.0f - f7) * this.d) / 2.0f;
        rectF2.inset(f8, f8);
        this.h.setStrokeWidth(f6);
    }
}
