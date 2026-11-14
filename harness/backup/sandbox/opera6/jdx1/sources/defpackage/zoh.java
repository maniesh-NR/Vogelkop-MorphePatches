package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zoh implements x63, fvb, z6g {
    public final String c;
    public final boolean d;
    public final f3d e;
    public final a73 f;
    public final a73 g;
    public final t89 h;
    public boolean k;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final d14 i = new d14((byte) 1);
    public a73 j = null;

    public zoh(f3d f3dVar, c73 c73Var, aph aphVar) {
        this.c = aphVar.b;
        this.d = aphVar.d;
        this.e = f3dVar;
        a73 a73VarD = aphVar.e.D();
        this.f = a73VarD;
        a73 a73VarD2 = ((dd1) aphVar.f).D();
        this.g = a73VarD2;
        a73 a73VarD3 = aphVar.c.D();
        this.h = (t89) a73VarD3;
        c73Var.g(a73VarD);
        c73Var.g(a73VarD2);
        c73Var.g(a73VarD3);
        a73VarD.a(this);
        a73VarD2.a(this);
        a73VarD3.a(this);
    }

    @Override // defpackage.x63
    public final void a() {
        this.k = false;
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // defpackage.wp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L34
            java.lang.Object r0 = r0.get(r6)
            wp5 r0 = (defpackage.wp5) r0
            boolean r1 = r0 instanceof defpackage.h7m
            if (r1 == 0) goto L27
            r1 = r0
            h7m r1 = (defpackage.h7m) r1
            int r2 = r1.c
            r3 = 1
            if (r2 != r3) goto L27
            d14 r0 = r4.i
            java.util.ArrayList r0 = r0.a
            r0.add(r1)
            r1.c(r4)
            goto L31
        L27:
            boolean r1 = r0 instanceof defpackage.y8i
            if (r1 == 0) goto L31
            y8i r0 = (defpackage.y8i) r0
            a73 r0 = r0.b
            r4.j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zoh.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.evb
    public final void c(dvb dvbVar, int i, ArrayList arrayList, dvb dvbVar2) {
        l1e.e(dvbVar, i, arrayList, dvbVar2, this);
    }

    @Override // defpackage.evb
    public final void d(ua7 ua7Var, Object obj) {
        if (obj == k3d.g) {
            this.g.j(ua7Var);
        } else if (obj == k3d.i) {
            this.f.j(ua7Var);
        } else if (obj == k3d.h) {
            this.h.j(ua7Var);
        }
    }

    @Override // defpackage.z6g
    public final Path e() {
        float f;
        a73 a73Var;
        boolean z = this.k;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.g.e();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        t89 t89Var = this.h;
        float fK = t89Var == null ? 0.0f : t89Var.k();
        if (fK == 0.0f && (a73Var = this.j) != null) {
            fK = Math.min(((Float) a73Var.e()).floatValue(), Math.min(f2, f3));
        }
        float fMin = Math.min(f2, f3);
        if (fK > fMin) {
            fK = fMin;
        }
        PointF pointF2 = (PointF) this.f.e();
        path.moveTo(pointF2.x + f2, (pointF2.y - f3) + fK);
        path.lineTo(pointF2.x + f2, (pointF2.y + f3) - fK);
        RectF rectF = this.b;
        if (fK > 0.0f) {
            float f4 = pointF2.x + f2;
            float f5 = fK * 2.0f;
            f = 2.0f;
            float f6 = pointF2.y + f3;
            rectF.set(f4 - f5, f6 - f5, f4, f6);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointF2.x - f2) + fK, pointF2.y + f3);
        if (fK > 0.0f) {
            float f7 = pointF2.x - f2;
            float f8 = pointF2.y + f3;
            float f9 = fK * f;
            rectF.set(f7, f8 - f9, f9 + f7, f8);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f2, (pointF2.y - f3) + fK);
        if (fK > 0.0f) {
            float f10 = pointF2.x - f2;
            float f11 = pointF2.y - f3;
            float f12 = fK * f;
            rectF.set(f10, f11, f10 + f12, f12 + f11);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f2) - fK, pointF2.y - f3);
        if (fK > 0.0f) {
            float f13 = pointF2.x + f2;
            float f14 = fK * f;
            float f15 = pointF2.y - f3;
            rectF.set(f13 - f14, f15, f13, f14 + f15);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.a(path);
        this.k = true;
        return path;
    }

    @Override // defpackage.wp5
    public final String getName() {
        return this.c;
    }
}
