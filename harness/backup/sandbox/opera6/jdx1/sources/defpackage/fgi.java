package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class fgi extends mzg {
    public final /* synthetic */ byte b;
    public float c;
    public final float d;
    public final /* synthetic */ igi e;
    public final Object f;

    public fgi(igi igiVar, float f, float f2) {
        this.b = (byte) 1;
        this.e = igiVar;
        this.f = new RectF();
        this.c = f;
        this.d = f2;
    }

    public fgi(igi igiVar, float f, float f2, Path path) {
        this.b = (byte) 0;
        this.e = igiVar;
        this.c = f;
        this.d = f2;
        this.f = path;
    }

    public final boolean e(ufi ufiVar) {
        switch (this.b) {
            case 0:
                return !(ufiVar instanceof vfi);
            default:
                if (!(ufiVar instanceof vfi)) {
                    return true;
                }
                hfi hfiVarD = ufiVar.a.D(((vfi) ufiVar).n);
                if (hfiVarD == null) {
                    return false;
                }
                tei teiVar = (tei) hfiVarD;
                cgi cgiVar = new cgi(teiVar.o);
                Matrix matrix = teiVar.n;
                Path path = cgiVar.a;
                if (matrix != null) {
                    path.transform(matrix);
                }
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                ((RectF) this.f).union(rectF);
                return false;
        }
    }

    public final void n(String str) {
        String str2;
        byte b = this.b;
        Object obj = this.f;
        igi igiVar = this.e;
        switch (b) {
            case 0:
                if (igiVar.K0()) {
                    Path path = new Path();
                    str2 = str;
                    ((ggi) igiVar.d).d.getTextPath(str2, 0, str.length(), this.c, this.d, path);
                    ((Path) obj).addPath(path);
                } else {
                    str2 = str;
                }
                this.c = ((ggi) igiVar.d).d.measureText(str2) + this.c;
                break;
            default:
                if (igiVar.K0()) {
                    Rect rect = new Rect();
                    ((ggi) igiVar.d).d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.c, this.d);
                    ((RectF) obj).union(rectF);
                }
                this.c = ((ggi) igiVar.d).d.measureText(str) + this.c;
                break;
        }
    }
}
