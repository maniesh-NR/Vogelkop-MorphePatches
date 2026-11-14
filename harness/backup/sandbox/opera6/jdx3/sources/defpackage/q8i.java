package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q8i extends s8i {
    public int f;
    public int g;
    public float[] h;
    public final RectF i;
    public Path j;

    public q8i(Bitmap bitmap, int i, int i2) {
        super(bitmap, 0);
        this.i = new RectF();
        a(i, i2);
    }

    public q8i(Bitmap bitmap, float[] fArr) {
        super(bitmap, 0);
        this.i = new RectF();
        this.h = fArr;
        this.j = new Path();
    }

    public final void a(int i, int i2) {
        if (this.f == i && this.g == i2 && this.h == null) {
            return;
        }
        this.f = i;
        this.g = i2;
        this.h = null;
        this.j = i != i2 ? new Path() : null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        Rect bounds = getBounds();
        RectF rectF = this.i;
        rectF.set(bounds);
        int i = this.f;
        int i2 = this.g;
        Path path = this.j;
        Paint paint = this.c;
        if (path == null) {
            float f5 = i;
            canvas.drawRoundRect(rectF, f5, f5, paint);
            return;
        }
        float[] fArr = this.h;
        if (fArr != null) {
            f = fArr[0];
            f2 = fArr[1];
            f4 = fArr[2];
            f3 = fArr[3];
        } else {
            f = i;
            f2 = i2;
            f3 = f;
            f4 = f2;
        }
        path.rewind();
        this.j.moveTo(rectF.right, rectF.top + f2);
        Path path2 = this.j;
        float f6 = rectF.right;
        float f7 = rectF.top;
        float f8 = s8i.e;
        path2.cubicTo(f6, (f7 + f2) - (f2 * f8), (f2 * f8) + (f6 - f2), f7, f6 - f2, f7);
        this.j.lineTo(rectF.left + f, rectF.top);
        Path path3 = this.j;
        float f9 = rectF.left;
        float f10 = rectF.top;
        path3.cubicTo((f9 + f) - (f * f8), f10, f9, (f10 + f) - (f * f8), f9, f10 + f);
        this.j.lineTo(rectF.left, rectF.bottom - f3);
        Path path4 = this.j;
        float f11 = rectF.left;
        float f12 = rectF.bottom;
        path4.cubicTo(f11, (f3 * f8) + (f12 - f3), (f11 + f3) - (f3 * f8), f12, f11 + f3, f12);
        this.j.lineTo(rectF.right - f4, rectF.bottom);
        Path path5 = this.j;
        float f13 = rectF.right;
        float f14 = rectF.bottom;
        path5.cubicTo((f4 * f8) + (f13 - f4), f14, f13, (f8 * f4) + (f14 - f4), f13, f14 - f4);
        this.j.close();
        canvas.drawPath(this.j, paint);
    }
}
