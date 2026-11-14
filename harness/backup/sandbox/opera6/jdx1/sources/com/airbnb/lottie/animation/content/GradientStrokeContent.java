package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import defpackage.a73;
import defpackage.c73;
import defpackage.f3d;
import defpackage.g2a;
import defpackage.h2a;
import defpackage.j1d;
import defpackage.k3d;
import defpackage.p2a;
import defpackage.q93;
import defpackage.zzm;

/* loaded from: classes.dex */
public class GradientStrokeContent extends q93 {
    private final j1d linearGradientCache;
    public final String r;
    private final j1d radialGradientCache;
    public final boolean s;
    public final RectF t;
    public final int u;
    public final int v;
    public final h2a w;
    public final h2a x;
    public final h2a y;
    public zzm z;

    /* JADX WARN: Illegal instructions before constructor call */
    public GradientStrokeContent(f3d f3dVar, c73 c73Var, p2a p2aVar) {
        Paint.Join join;
        Paint.Join join2;
        int iA = vep.A(p2aVar.h);
        Paint.Cap cap = iA != 0 ? iA != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iA2 = vep.A(p2aVar.i);
        if (iA2 == 0) {
            join = Paint.Join.MITER;
        } else if (iA2 == 1) {
            join = Paint.Join.ROUND;
        } else {
            if (iA2 != 2) {
                join2 = null;
                super(f3dVar, c73Var, cap, join2, p2aVar.j, p2aVar.d, p2aVar.g, p2aVar.k, p2aVar.l);
                this.linearGradientCache = new j1d((Object) null);
                this.radialGradientCache = new j1d((Object) null);
                this.t = new RectF();
                this.r = p2aVar.a;
                this.u = p2aVar.b;
                this.s = p2aVar.m;
                this.v = (int) (f3dVar.a.b() / 32.0f);
                a73 a73VarD = p2aVar.c.D();
                this.w = (h2a) a73VarD;
                a73VarD.a(this);
                c73Var.g(a73VarD);
                a73 a73VarD2 = p2aVar.e.D();
                this.x = (h2a) a73VarD2;
                a73VarD2.a(this);
                c73Var.g(a73VarD2);
                a73 a73VarD3 = p2aVar.f.D();
                this.y = (h2a) a73VarD3;
                a73VarD3.a(this);
                c73Var.g(a73VarD3);
            }
            join = Paint.Join.BEVEL;
        }
        join2 = join;
        super(f3dVar, c73Var, cap, join2, p2aVar.j, p2aVar.d, p2aVar.g, p2aVar.k, p2aVar.l);
        this.linearGradientCache = new j1d((Object) null);
        this.radialGradientCache = new j1d((Object) null);
        this.t = new RectF();
        this.r = p2aVar.a;
        this.u = p2aVar.b;
        this.s = p2aVar.m;
        this.v = (int) (f3dVar.a.b() / 32.0f);
        a73 a73VarD4 = p2aVar.c.D();
        this.w = (h2a) a73VarD4;
        a73VarD4.a(this);
        c73Var.g(a73VarD4);
        a73 a73VarD22 = p2aVar.e.D();
        this.x = (h2a) a73VarD22;
        a73VarD22.a(this);
        c73Var.g(a73VarD22);
        a73 a73VarD32 = p2aVar.f.D();
        this.y = (h2a) a73VarD32;
        a73VarD32.a(this);
        c73Var.g(a73VarD32);
    }

    @Override // defpackage.q93, defpackage.evb
    public final void d(ua7 ua7Var, Object obj) {
        super.d(ua7Var, obj);
        if (obj == k3d.G) {
            zzm zzmVar = this.z;
            c73 c73Var = this.f;
            if (zzmVar != null) {
                c73Var.o(zzmVar);
            }
            if (ua7Var == null) {
                this.z = null;
                return;
            }
            zzm zzmVar2 = new zzm(ua7Var, null);
            this.z = zzmVar2;
            zzmVar2.a(this);
            c73Var.g(this.z);
        }
    }

    public final int[] g(int[] iArr) {
        zzm zzmVar = this.z;
        if (zzmVar != null) {
            Integer[] numArr = (Integer[]) zzmVar.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.wp5
    public final String getName() {
        return this.r;
    }

    @Override // defpackage.q93, defpackage.ql7
    public final void h(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.s) {
            return;
        }
        f(this.t, matrix, false);
        int i2 = this.u;
        h2a h2aVar = this.w;
        h2a h2aVar2 = this.y;
        h2a h2aVar3 = this.x;
        if (i2 == 1) {
            long jI = i();
            shader = (LinearGradient) this.linearGradientCache.c(jI);
            if (shader == null) {
                PointF pointF = (PointF) h2aVar3.e();
                PointF pointF2 = (PointF) h2aVar2.e();
                g2a g2aVar = (g2a) h2aVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, g(g2aVar.b), g2aVar.a, Shader.TileMode.CLAMP);
                this.linearGradientCache.g(jI, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            shader = (RadialGradient) this.radialGradientCache.c(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) h2aVar3.e();
                PointF pointF4 = (PointF) h2aVar2.e();
                g2a g2aVar2 = (g2a) h2aVar.e();
                int[] iArrG = g(g2aVar2.b);
                float[] fArr = g2aVar2.a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrG, fArr, Shader.TileMode.CLAMP);
                this.radialGradientCache.g(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.i.setShader(shader);
        super.h(canvas, matrix, i);
    }

    public final int i() {
        float f = this.x.d;
        float f2 = this.v;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.y.d * f2);
        int iRound3 = Math.round(this.w.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
