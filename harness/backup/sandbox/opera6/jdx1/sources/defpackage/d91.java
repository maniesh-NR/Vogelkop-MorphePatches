package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class d91 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public d91(Path path) {
        this.a = path;
    }

    public static void a(d91 d91Var, d91 d91Var2) {
        Path path = d91Var.a;
        if (d91Var2 != null) {
            path.addPath(d91Var2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            yt7.k("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(d91 d91Var, voh vohVar) {
        u6g[] u6gVarArr = u6g.a;
        float f = vohVar.a;
        float f2 = vohVar.d;
        float f3 = vohVar.c;
        float f4 = vohVar.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            f91.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = d91Var.b;
        if (rectF == null) {
            rectF = new RectF();
            d91Var.b = rectF;
        }
        rectF.set(f, f4, f3, f2);
        d91Var.a.addRect(d91Var.b, Path.Direction.CCW);
    }

    public static void c(d91 d91Var, h8i h8iVar) {
        u6g[] u6gVarArr = u6g.a;
        RectF rectF = d91Var.b;
        if (rectF == null) {
            rectF = new RectF();
            d91Var.b = rectF;
        }
        float f = h8iVar.a;
        long j = h8iVar.h;
        long j2 = h8iVar.g;
        long j3 = h8iVar.f;
        long j4 = h8iVar.e;
        rectF.set(f, h8iVar.b, h8iVar.c, h8iVar.d);
        float[] fArr = d91Var.c;
        if (fArr == null) {
            fArr = new float[8];
            d91Var.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        d91Var.a.addRoundRect(d91Var.b, d91Var.c, Path.Direction.CCW);
    }

    public final voh d() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new voh(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean f(d91 d91Var, d91 d91Var2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (d91Var instanceof d91) {
            Path path = d91Var.a;
            if (d91Var2 != null) {
                return this.a.op(path, d91Var2.a, op);
            }
        }
        yt7.k("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void g() {
        this.a.reset();
    }

    public final void h(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void i(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        this.d.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        this.a.transform(this.d);
    }
}
