package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class yz3 extends x6g {
    public final Point e;

    public yz3(int i, int i2, int i3, float f, Drawable drawable, Point point) {
        super(drawable, i, i2);
        this.e = point;
        if (i3 == 0) {
            float f2 = i;
            this.b.moveTo(f2, 0.0f);
            float f3 = i2;
            float f4 = f3 / 2.0f;
            this.b.lineTo(f, f4 - f);
            this.b.quadTo(0.0f, f4, f, f4 + f);
            this.b.lineTo(f2, f3);
            this.b.close();
            return;
        }
        if (i3 == 1) {
            float f5 = i2;
            this.b.moveTo(0.0f, f5);
            float f6 = i;
            float f7 = f6 / 2.0f;
            this.b.lineTo(f7 - f, f);
            this.b.quadTo(f7, 0.0f, f7 + f, f);
            this.b.lineTo(f6, f5);
            this.b.close();
            return;
        }
        if (i3 == 2) {
            this.b.moveTo(0.0f, 0.0f);
            float f8 = i;
            float f9 = f8 - f;
            float f10 = i2;
            float f11 = f10 / 2.0f;
            this.b.lineTo(f9, f11 - f);
            this.b.quadTo(f8, f11, f9, f + f11);
            this.b.lineTo(0.0f, f10);
            this.b.close();
            return;
        }
        if (i3 != 3) {
            return;
        }
        this.b.moveTo(0.0f, 0.0f);
        float f12 = i;
        float f13 = f12 / 2.0f;
        float f14 = i2;
        float f15 = f14 - f;
        this.b.lineTo(f13 - f, f15);
        this.b.quadTo(f13, f14, f + f13, f15);
        this.b.lineTo(f12, 0.0f);
        this.b.close();
    }

    @Override // defpackage.x6g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.clipPath(this.b);
        Point point = this.e;
        canvas.translate(point.x, point.y);
        this.a.draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
