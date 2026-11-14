package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;

/* loaded from: classes.dex */
public final class bxg {
    public static final PointF e = new PointF(2.0f, 2.0f);
    public final ywg b;
    public Matrix d;
    public Rational a = null;
    public Rect c = null;

    public bxg(ywg ywgVar) {
        this.b = ywgVar;
    }

    public final gyd a(float f, float f2, float f3) {
        PointF pointF;
        float[] fArr = {f, f2};
        synchronized (this) {
            Matrix matrix = this.d;
            if (matrix == null) {
                pointF = e;
            } else {
                matrix.mapPoints(fArr);
                pointF = new PointF(fArr[0], fArr[1]);
            }
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        Rational rational = this.a;
        gyd gydVar = new gyd();
        gydVar.a = f4;
        gydVar.b = f5;
        gydVar.c = f3;
        gydVar.d = rational;
        return gydVar;
    }
}
