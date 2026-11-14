package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* loaded from: classes.dex */
public final class a31 implements sh4 {
    public Canvas a = b31.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.sh4
    public final void a(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.sh4
    public final void b(float f, float f2, float f3, float f4, float f5, float f6, zg zgVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) zgVar.b);
    }

    @Override // defpackage.sh4
    public final void c(j71 j71Var, zg zgVar) {
        this.a.drawBitmap(oup.L(j71Var), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) zgVar.b);
    }

    @Override // defpackage.sh4
    public final void d(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.sh4
    public final void e(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.sh4
    public final void f() {
        this.a.restore();
    }

    @Override // defpackage.sh4
    public final void g(j71 j71Var, long j, long j2, long j3, zg zgVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapL = oup.L(j71Var);
        Rect rect = this.b;
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapL, rect, rect2, (Paint) zgVar.b);
    }

    @Override // defpackage.sh4
    public final void h() {
        this.a.enableZ();
    }

    @Override // defpackage.sh4
    public final void i(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.sh4
    public final void j() {
        this.a.save();
    }

    @Override // defpackage.sh4
    public final void k(voh vohVar, zg zgVar) {
        this.a.saveLayer(vohVar.a, vohVar.b, vohVar.c, vohVar.d, (Paint) zgVar.b, 31);
    }

    @Override // defpackage.sh4
    public final void l() {
        this.a.disableZ();
    }

    @Override // defpackage.sh4
    public final void m(float[] fArr) {
        if (p37.S(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        i41.f0(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.sh4
    public final void n(d91 d91Var) {
        Canvas canvas = this.a;
        if (d91Var != null) {
            canvas.clipPath(d91Var.a, Region.Op.INTERSECT);
        } else {
            yt7.k("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.sh4
    public final void o(float f, float f2, float f3, float f4, zg zgVar) {
        this.a.drawRect(f, f2, f3, f4, na2.y(zgVar));
    }

    @Override // defpackage.sh4
    public final void p(float f, long j, zg zgVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) zgVar.b);
    }

    @Override // defpackage.sh4
    public final void q(d91 d91Var, zg zgVar) {
        Canvas canvas = this.a;
        if (d91Var instanceof d91) {
            canvas.drawPath(d91Var.a, na2.y(zgVar));
        } else {
            yt7.k("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.sh4
    public final void s(long j, long j2, zg zgVar) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) zgVar.b);
    }

    @Override // defpackage.sh4
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, zg zgVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) zgVar.b);
    }
}
