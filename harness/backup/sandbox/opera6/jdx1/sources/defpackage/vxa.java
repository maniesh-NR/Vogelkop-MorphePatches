package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class vxa extends c73 {
    public final ezb A;
    public final Rect B;
    public final Rect C;
    public final h3d D;
    public zzm E;
    public zzm F;

    public vxa(f3d f3dVar, t1c t1cVar) {
        super(f3dVar, t1cVar);
        this.A = new ezb((byte) 0, 3);
        this.B = new Rect();
        this.C = new Rect();
        String str = t1cVar.g;
        p2d p2dVar = f3dVar.a;
        this.D = p2dVar == null ? null : (h3d) p2dVar.d.get(str);
    }

    @Override // defpackage.c73, defpackage.evb
    public final void d(ua7 ua7Var, Object obj) {
        super.d(ua7Var, obj);
        if (obj == k3d.F) {
            if (ua7Var == null) {
                this.E = null;
                return;
            } else {
                this.E = new zzm(ua7Var, null);
                return;
            }
        }
        if (obj == k3d.I) {
            if (ua7Var == null) {
                this.F = null;
            } else {
                this.F = new zzm(ua7Var, null);
            }
        }
    }

    @Override // defpackage.c73, defpackage.ql7
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        if (this.D != null) {
            float fC = dzm.c();
            rectF.set(0.0f, 0.0f, r3.a * fC, r3.b * fC);
            this.n.mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
    @Override // defpackage.c73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxa.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
