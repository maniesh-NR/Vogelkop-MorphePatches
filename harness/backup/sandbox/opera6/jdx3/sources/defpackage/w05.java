package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class w05 extends Drawable {
    public final /* synthetic */ byte a;
    public final float b;
    public float c;
    public final Paint d;
    public Object e;

    public w05() {
        this.a = (byte) 0;
        this.b = -0.5f;
        this.d = new Paint(1);
        this.e = new v05(new Rect(), new int[]{0}, new float[]{0.0f});
    }

    public w05(float f, float f2, float f3, float f4, float f5) {
        this.a = (byte) 1;
        float f6 = (f3 / 2.0f) + f4 + f5;
        this.b = f6;
        float f7 = f + f2;
        this.c = f7;
        this.d = new Paint(2);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(f3);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setShadowLayer(f4, 0.0f, f5, p37.j0(0.25f, -16777216));
        int iCeil = (int) Math.ceil((f6 * 2.0f) + f7);
        float f8 = f7 + f6;
        Path path = new Path();
        float f9 = f6 + f;
        float f10 = f9 + f2;
        path.moveTo(f6, f10);
        path.lineTo(f6, f9);
        float f11 = 2.0f * f;
        float f12 = f6 + f11;
        path.arcTo(new RectF(f6, f6, f12, f12), 180.0f, 90.0f);
        path.lineTo(f10, f6);
        Path path2 = new Path();
        float f13 = f8 - f;
        float f14 = f13 - f2;
        path2.moveTo(f14, f6);
        path2.lineTo(f13, f6);
        float f15 = f8 - f11;
        path2.arcTo(new RectF(f15, f6, f8, f12), 270.0f, 90.0f);
        path2.lineTo(f8, f10);
        Path path3 = new Path();
        path3.moveTo(f8, f14);
        path3.lineTo(f8, f13);
        path3.arcTo(new RectF(f15, f15, f8, f8), 0.0f, 90.0f);
        path3.lineTo(f14, f8);
        Path path4 = new Path();
        path4.moveTo(f10, f8);
        path4.lineTo(f9, f8);
        path4.arcTo(new RectF(f6, f15, f12, f8), 90.0f, 90.0f);
        path4.lineTo(f6, f14);
        List<Path> listAsList = Arrays.asList(path, path2, path3, path4);
        ArrayList arrayList = new ArrayList(k95.o(listAsList, 10));
        for (Path path5 : listAsList) {
            Bitmap bitmapU = z5i.u(iCeil, iCeil, Bitmap.Config.ARGB_8888);
            if (bitmapU != null) {
                new Canvas(bitmapU).drawPath(path5, paint);
            } else {
                bitmapU = null;
            }
            arrayList.add(bitmapU);
        }
        this.e = arrayList;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        float f = this.b;
        switch (b) {
            case 0:
                Paint paint = this.d;
                if (paint.getShader() == null) {
                    float fExactCenterX = ((v05) this.e).a.exactCenterX();
                    float fExactCenterY = ((v05) this.e).a.exactCenterY();
                    v05 v05Var = (v05) this.e;
                    SweepGradient sweepGradient = new SweepGradient(fExactCenterX, fExactCenterY, v05Var.b, v05Var.c);
                    Matrix matrix = new Matrix();
                    matrix.preRotate(-90.0f, ((v05) this.e).a.exactCenterX(), ((v05) this.e).a.exactCenterY());
                    sweepGradient.setLocalMatrix(matrix);
                    paint.setShader(sweepGradient);
                }
                Rect rect = ((v05) this.e).a;
                canvas.drawArc(rect.left + f, rect.top + f, rect.right - f, rect.bottom - f, -90.0f, djh.b(this.c, 0.0f, 1.0f) * 360.0f, true, paint);
                break;
            default:
                float f2 = this.c;
                float f3 = getBounds().left;
                float f4 = getBounds().top;
                float f5 = getBounds().right;
                float f6 = getBounds().bottom;
                ArrayList arrayList = (ArrayList) this.e;
                Bitmap bitmap = (Bitmap) arrayList.get(0);
                Paint paint2 = this.d;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, f3 - f, f4 - f, paint2);
                }
                Bitmap bitmap2 = (Bitmap) arrayList.get(1);
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, (f5 - f) - f2, f4 - f, paint2);
                }
                Bitmap bitmap3 = (Bitmap) arrayList.get(2);
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, (f5 - f) - f2, (f6 - f) - f2, paint2);
                }
                Bitmap bitmap4 = (Bitmap) arrayList.get(3);
                if (bitmap4 != null) {
                    canvas.drawBitmap(bitmap4, f3 - f, (f6 - f) - f2, paint2);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        switch (this.a) {
            case 0:
                return this.d.getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        byte b = this.a;
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 0:
                v05 v05VarA = v05.a((v05) this.e, new Rect(rect), null, null, 6);
                if (!v05VarA.equals((v05) this.e)) {
                    this.e = v05VarA;
                    this.d.setShader(null);
                    invalidateSelf();
                    break;
                }
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        byte b = this.a;
        Paint paint = this.d;
        switch (b) {
            case 0:
                if (i != paint.getAlpha()) {
                    paint.setAlpha(i);
                    invalidateSelf();
                    break;
                }
                break;
            default:
                paint.setAlpha(i);
                invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.d.setColorFilter(colorFilter);
                invalidateSelf();
                break;
            default:
                this.d.setColorFilter(colorFilter);
                invalidateSelf();
                break;
        }
    }
}
