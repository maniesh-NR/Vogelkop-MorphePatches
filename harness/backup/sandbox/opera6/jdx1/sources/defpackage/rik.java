package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class rik extends q93 {
    public final c73 r;
    public final String s;
    public final boolean t;
    public final ka5 u;
    public zzm v;

    /* JADX WARN: Illegal instructions before constructor call */
    public rik(f3d f3dVar, c73 c73Var, qbj qbjVar) {
        int iA = vep.A(qbjVar.g);
        Paint.Cap cap = iA != 0 ? iA != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iA2 = vep.A(qbjVar.h);
        super(f3dVar, c73Var, cap, iA2 != 0 ? iA2 != 1 ? iA2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, qbjVar.i, qbjVar.e, qbjVar.f, qbjVar.c, qbjVar.b);
        this.r = c73Var;
        this.s = qbjVar.a;
        this.t = qbjVar.j;
        a73 a73VarD = qbjVar.d.D();
        this.u = (ka5) a73VarD;
        a73VarD.a(this);
        c73Var.g(a73VarD);
    }

    @Override // defpackage.q93, defpackage.evb
    public final void d(ua7 ua7Var, Object obj) {
        super.d(ua7Var, obj);
        PointF pointF = k3d.a;
        ka5 ka5Var = this.u;
        if (obj == 2) {
            ka5Var.j(ua7Var);
            return;
        }
        if (obj == k3d.F) {
            zzm zzmVar = this.v;
            c73 c73Var = this.r;
            if (zzmVar != null) {
                c73Var.o(zzmVar);
            }
            if (ua7Var == null) {
                this.v = null;
                return;
            }
            zzm zzmVar2 = new zzm(ua7Var, null);
            this.v = zzmVar2;
            zzmVar2.a(this);
            c73Var.g(ka5Var);
        }
    }

    @Override // defpackage.wp5
    public final String getName() {
        return this.s;
    }

    @Override // defpackage.q93, defpackage.ql7
    public final void h(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        ka5 ka5Var = this.u;
        int iK = ka5Var.k(ka5Var.c.h(), ka5Var.c());
        ezb ezbVar = this.i;
        ezbVar.setColor(iK);
        zzm zzmVar = this.v;
        if (zzmVar != null) {
            ezbVar.setColorFilter((ColorFilter) zzmVar.e());
        }
        super.h(canvas, matrix, i);
    }
}
