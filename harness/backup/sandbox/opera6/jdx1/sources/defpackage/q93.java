package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class q93 implements x63, fvb, ql7 {
    public final f3d e;
    public final c73 f;
    public final float[] h;
    public final ezb i;
    public final t89 j;
    public final ka5 k;
    public final ArrayList l;
    public final t89 m;
    public zzm n;
    public a73 o;
    public float p;
    public final om7 q;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public q93(f3d f3dVar, c73 c73Var, Paint.Cap cap, Paint.Join join, float f, dd1 dd1Var, ed1 ed1Var, ArrayList arrayList, ed1 ed1Var2) {
        ezb ezbVar = new ezb((byte) 0, 1);
        this.i = ezbVar;
        this.p = 0.0f;
        this.e = f3dVar;
        this.f = c73Var;
        ezbVar.setStyle(Paint.Style.STROKE);
        ezbVar.setStrokeCap(cap);
        ezbVar.setStrokeJoin(join);
        ezbVar.setStrokeMiter(f);
        this.k = (ka5) dd1Var.D();
        this.j = (t89) ed1Var.D();
        if (ed1Var2 == null) {
            this.m = null;
        } else {
            this.m = (t89) ed1Var2.D();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((ed1) arrayList.get(i)).D());
        }
        c73Var.g(this.k);
        c73Var.g(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            c73Var.g((a73) this.l.get(i2));
        }
        t89 t89Var = this.m;
        if (t89Var != null) {
            c73Var.g(t89Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((a73) this.l.get(i3)).a(this);
        }
        t89 t89Var2 = this.m;
        if (t89Var2 != null) {
            t89Var2.a(this);
        }
        if (c73Var.k() != null) {
            a73 a73VarD = ((ed1) c73Var.k().a).D();
            this.o = a73VarD;
            a73VarD.a(this);
            c73Var.g(this.o);
        }
        if (c73Var.l() != null) {
            this.q = new om7(this, c73Var, c73Var.l());
        }
    }

    @Override // defpackage.x63
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // defpackage.wp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            r3 = 2
            if (r0 < 0) goto L21
            java.lang.Object r4 = r8.get(r0)
            wp5 r4 = (defpackage.wp5) r4
            boolean r5 = r4 instanceof defpackage.h7m
            if (r5 == 0) goto L1e
            h7m r4 = (defpackage.h7m) r4
            int r5 = r4.c
            if (r5 != r3) goto L1e
            r2 = r4
        L1e:
            int r0 = r0 + (-1)
            goto La
        L21:
            if (r2 == 0) goto L26
            r2.c(r7)
        L26:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2c:
            java.util.ArrayList r0 = r7.g
            if (r8 < 0) goto L65
            java.lang.Object r4 = r9.get(r8)
            wp5 r4 = (defpackage.wp5) r4
            boolean r5 = r4 instanceof defpackage.h7m
            if (r5 == 0) goto L50
            r5 = r4
            h7m r5 = (defpackage.h7m) r5
            int r6 = r5.c
            if (r6 != r3) goto L50
            if (r1 == 0) goto L46
            r0.add(r1)
        L46:
            p93 r0 = new p93
            r0.<init>(r5)
            r5.c(r7)
            r1 = r0
            goto L62
        L50:
            boolean r0 = r4 instanceof defpackage.z6g
            if (r0 == 0) goto L62
            if (r1 != 0) goto L5b
            p93 r1 = new p93
            r1.<init>(r2)
        L5b:
            java.util.ArrayList r0 = r1.a
            z6g r4 = (defpackage.z6g) r4
            r0.add(r4)
        L62:
            int r8 = r8 + (-1)
            goto L2c
        L65:
            if (r1 == 0) goto L6a
            r0.add(r1)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q93.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.evb
    public final void c(dvb dvbVar, int i, ArrayList arrayList, dvb dvbVar2) {
        l1e.e(dvbVar, i, arrayList, dvbVar2, this);
    }

    public void d(ua7 ua7Var, Object obj) {
        PointF pointF = k3d.a;
        if (obj == 4) {
            this.k.j(ua7Var);
            return;
        }
        if (obj == k3d.n) {
            this.j.j(ua7Var);
            return;
        }
        ColorFilter colorFilter = k3d.F;
        c73 c73Var = this.f;
        if (obj == colorFilter) {
            zzm zzmVar = this.n;
            if (zzmVar != null) {
                c73Var.o(zzmVar);
            }
            if (ua7Var == null) {
                this.n = null;
                return;
            }
            zzm zzmVar2 = new zzm(ua7Var, null);
            this.n = zzmVar2;
            zzmVar2.a(this);
            c73Var.g(this.n);
            return;
        }
        if (obj == k3d.e) {
            a73 a73Var = this.o;
            if (a73Var != null) {
                a73Var.j(ua7Var);
                return;
            }
            zzm zzmVar3 = new zzm(ua7Var, null);
            this.o = zzmVar3;
            zzmVar3.a(this);
            c73Var.g(this.o);
            return;
        }
        om7 om7Var = this.q;
        if (obj == 5 && om7Var != null) {
            om7Var.b.j(ua7Var);
            return;
        }
        if (obj == k3d.B && om7Var != null) {
            om7Var.c(ua7Var);
            return;
        }
        if (obj == k3d.C && om7Var != null) {
            om7Var.d.j(ua7Var);
            return;
        }
        if (obj == k3d.D && om7Var != null) {
            om7Var.e.j(ua7Var);
        } else {
            if (obj != k3d.E || om7Var == null) {
                return;
            }
            om7Var.f.j(ua7Var);
        }
    }

    @Override // defpackage.ql7
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fK = this.j.k() / 2.0f;
                rectF2.set(rectF2.left - fK, rectF2.top - fK, rectF2.right + fK, rectF2.bottom + fK);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            p93 p93Var = (p93) arrayList.get(i);
            for (int i2 = 0; i2 < p93Var.a.size(); i2++) {
                path.addPath(((z6g) p93Var.a.get(i2)).e(), matrix);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q93.h(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
