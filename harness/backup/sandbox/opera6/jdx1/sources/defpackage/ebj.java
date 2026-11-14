package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ebj extends c73 {
    public final hq5 A;
    public final gi5 B;

    public ebj(f3d f3dVar, t1c t1cVar, gi5 gi5Var, p2d p2dVar) {
        super(f3dVar, t1cVar);
        this.B = gi5Var;
        hq5 hq5Var = new hq5(f3dVar, this, new abj("__container", t1cVar.a, false), p2dVar);
        this.A = hq5Var;
        List list = Collections.EMPTY_LIST;
        hq5Var.b(list, list);
    }

    @Override // defpackage.c73, defpackage.ql7
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        this.A.f(rectF, this.n, z);
    }

    @Override // defpackage.c73
    public final void j(Canvas canvas, Matrix matrix, int i) {
        this.A.h(canvas, matrix, i);
    }

    @Override // defpackage.c73
    public final zy9 k() {
        zy9 zy9Var = this.p.w;
        return zy9Var != null ? zy9Var : this.B.p.w;
    }

    @Override // defpackage.c73
    public final wjh l() {
        wjh wjhVar = this.p.x;
        return wjhVar != null ? wjhVar : this.B.p.x;
    }

    @Override // defpackage.c73
    public final void p(dvb dvbVar, int i, ArrayList arrayList, dvb dvbVar2) {
        this.A.c(dvbVar, i, arrayList, dvbVar2);
    }
}
