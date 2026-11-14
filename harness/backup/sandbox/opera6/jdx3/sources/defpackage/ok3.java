package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Shader;
import android.util.TypedValue;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ok3 extends f83 {
    public static final /* synthetic */ int m = 0;
    public final Matrix i;
    public final i97 j;
    public final PointF k;
    public Bitmap l;

    public ok3(List list) {
        super(list, eya.b);
        this.h.setColor(-1);
        this.h.setFilterBitmap(true);
        this.h.setMaskFilter(new BlurMaskFilter(24.0f, BlurMaskFilter.Blur.NORMAL));
        this.i = new Matrix();
        this.j = new i97(null, 7);
        this.k = new PointF(1.0f, 1.0f);
    }

    @Override // defpackage.f83, defpackage.fya
    public final void b(Canvas canvas, kk7 kk7Var) {
        i97 i97Var = kk7Var.b;
        PointF pointF = i97Var.a;
        float f = pointF.x;
        float f2 = pointF.y;
        pointF.set(i97.e);
        f(kk7Var.a.getResources(), kk7Var.c, i97Var);
        pointF.set(f, f2);
        super.b(canvas, kk7Var);
    }

    public final Paint f(Resources resources, Bitmap bitmap, i97 i97Var) {
        float fApplyDimension = (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics());
        float f = i97Var.c;
        PointF pointF = i97Var.a;
        PointF pointF2 = i97Var.b;
        float f2 = fApplyDimension * f;
        Paint paint = this.h;
        paint.setStrokeWidth(f2);
        i97 i97Var2 = this.j;
        if (bitmap == null) {
            paint.setShader(null);
            this.l = null;
            i97Var2.a();
            return paint;
        }
        boolean zA = Intrinsics.a(this.l, bitmap);
        PointF pointF3 = this.k;
        if (!zA) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.l = bitmap;
            i97Var2.a();
            pointF3.set(1.0f, 1.0f);
        }
        float width = pointF2.x / bitmap.getWidth();
        float height = pointF2.y / bitmap.getHeight();
        PointF pointF4 = i97.e;
        PointF pointF5 = i97Var2.a;
        PointF pointF6 = i97Var2.b;
        if (Math.abs(pointF5.x - pointF.x) < 0.001f && Math.abs(pointF5.y - pointF.y) < 0.001f && Math.abs(pointF6.x - pointF2.x) < 0.001f && Math.abs(pointF6.y - pointF2.y) < 0.001f && Math.abs(i97Var2.c - i97Var.c) < 0.001f && c26.C(pointF3.x, width) && c26.C(pointF3.y, height)) {
            return paint;
        }
        Matrix matrix = this.i;
        matrix.reset();
        if (!pointF.equals(i97.e)) {
            matrix.postTranslate(pointF.x, pointF.y);
        }
        matrix.preScale(width, height);
        paint.getShader().setLocalMatrix(matrix);
        i97Var2.a.set(pointF);
        pointF6.set(pointF2);
        i97Var2.c = i97Var.c;
        i97Var2.d.set(i97Var.d);
        pointF3.set(width, height);
        return paint;
    }
}
