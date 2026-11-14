package defpackage;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class prl extends ua7 {
    public PointF e;

    @Override // defpackage.ua7
    public final Object y(g3d g3dVar) {
        float f = ((PointF) g3dVar.c).x;
        float f2 = ((PointF) g3dVar.d).x;
        float fB = djh.b(g3dVar.f, 0.0f, 1.0f);
        if (f > f2) {
            fB = 1.0f - fB;
        }
        PointF pointF = this.e;
        PointF pointF2 = new PointF(Math.abs(f - f2) * fB, 0.0f);
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }
}
