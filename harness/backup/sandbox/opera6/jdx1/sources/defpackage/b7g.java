package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b7g extends awb {
    public final PointF i;
    public final float[] j;
    public final PathMeasure k;
    public a7g l;

    public b7g(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    @Override // defpackage.a73
    public final Object f(zvb zvbVar, float f) {
        float f2;
        a7g a7gVar = (a7g) zvbVar;
        Path path = a7gVar.q;
        if (path == null) {
            return (PointF) zvbVar.b;
        }
        ua7 ua7Var = this.e;
        if (ua7Var != null) {
            f2 = f;
            PointF pointF = (PointF) ua7Var.z(a7gVar.g, a7gVar.h.floatValue(), (PointF) a7gVar.b, (PointF) a7gVar.c, d(), f2, this.d);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        a7g a7gVar2 = this.l;
        PathMeasure pathMeasure = this.k;
        if (a7gVar2 != a7gVar) {
            pathMeasure.setPath(path, false);
            this.l = a7gVar;
        }
        float length = pathMeasure.getLength() * f2;
        float[] fArr = this.j;
        pathMeasure.getPosTan(length, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f3, f4);
        return pointF2;
    }
}
