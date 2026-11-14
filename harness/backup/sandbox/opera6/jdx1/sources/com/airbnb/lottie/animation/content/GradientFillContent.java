package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import defpackage.a73;
import defpackage.c73;
import defpackage.dvb;
import defpackage.ed1;
import defpackage.ezb;
import defpackage.f3d;
import defpackage.fvb;
import defpackage.g2a;
import defpackage.h2a;
import defpackage.j1d;
import defpackage.j2a;
import defpackage.k3d;
import defpackage.ka5;
import defpackage.l1e;
import defpackage.om7;
import defpackage.p2d;
import defpackage.ql7;
import defpackage.wp5;
import defpackage.x63;
import defpackage.z6g;
import defpackage.zzm;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class GradientFillContent implements ql7, x63, fvb {
    public final String a;
    public final boolean b;
    public final c73 c;
    public final Path d;
    public final ezb e;
    public final RectF f;
    public final ArrayList g;
    public final int h;
    public final h2a i;
    public final ka5 j;
    public final h2a k;
    public final h2a l;
    public zzm m;
    public zzm n;
    public final f3d o;
    public final int p;
    public a73 q;
    public float r;
    public final om7 s;
    private final j1d linearGradientCache = new j1d((Object) null);
    private final j1d radialGradientCache = new j1d((Object) null);

    public GradientFillContent(f3d f3dVar, p2d p2dVar, c73 c73Var, j2a j2aVar) {
        Path path = new Path();
        this.d = path;
        this.e = new ezb((byte) 0, 1);
        this.f = new RectF();
        this.g = new ArrayList();
        this.r = 0.0f;
        this.c = c73Var;
        this.a = j2aVar.g;
        this.b = j2aVar.h;
        this.o = f3dVar;
        this.h = j2aVar.a;
        path.setFillType(j2aVar.b);
        this.p = (int) (p2dVar.b() / 32.0f);
        a73 a73VarD = j2aVar.c.D();
        this.i = (h2a) a73VarD;
        a73VarD.a(this);
        c73Var.g(a73VarD);
        a73 a73VarD2 = j2aVar.d.D();
        this.j = (ka5) a73VarD2;
        a73VarD2.a(this);
        c73Var.g(a73VarD2);
        a73 a73VarD3 = j2aVar.e.D();
        this.k = (h2a) a73VarD3;
        a73VarD3.a(this);
        c73Var.g(a73VarD3);
        a73 a73VarD4 = j2aVar.f.D();
        this.l = (h2a) a73VarD4;
        a73VarD4.a(this);
        c73Var.g(a73VarD4);
        if (c73Var.k() != null) {
            a73 a73VarD5 = ((ed1) c73Var.k().a).D();
            this.q = a73VarD5;
            a73VarD5.a(this);
            c73Var.g(this.q);
        }
        if (c73Var.l() != null) {
            this.s = new om7(this, c73Var, c73Var.l());
        }
    }

    @Override // defpackage.x63
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.wp5
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            wp5 wp5Var = (wp5) list2.get(i);
            if (wp5Var instanceof z6g) {
                this.g.add((z6g) wp5Var);
            }
        }
    }

    @Override // defpackage.evb
    public final void c(dvb dvbVar, int i, ArrayList arrayList, dvb dvbVar2) {
        l1e.e(dvbVar, i, arrayList, dvbVar2, this);
    }

    @Override // defpackage.evb
    public final void d(ua7 ua7Var, Object obj) {
        PointF pointF = k3d.a;
        if (obj == 4) {
            this.j.j(ua7Var);
            return;
        }
        ColorFilter colorFilter = k3d.F;
        c73 c73Var = this.c;
        if (obj == colorFilter) {
            zzm zzmVar = this.m;
            if (zzmVar != null) {
                c73Var.o(zzmVar);
            }
            if (ua7Var == null) {
                this.m = null;
                return;
            }
            zzm zzmVar2 = new zzm(ua7Var, null);
            this.m = zzmVar2;
            zzmVar2.a(this);
            c73Var.g(this.m);
            return;
        }
        if (obj == k3d.G) {
            zzm zzmVar3 = this.n;
            if (zzmVar3 != null) {
                c73Var.o(zzmVar3);
            }
            if (ua7Var == null) {
                this.n = null;
                return;
            }
            this.linearGradientCache.b();
            this.radialGradientCache.b();
            zzm zzmVar4 = new zzm(ua7Var, null);
            this.n = zzmVar4;
            zzmVar4.a(this);
            c73Var.g(this.n);
            return;
        }
        if (obj == k3d.e) {
            a73 a73Var = this.q;
            if (a73Var != null) {
                a73Var.j(ua7Var);
                return;
            }
            zzm zzmVar5 = new zzm(ua7Var, null);
            this.q = zzmVar5;
            zzmVar5.a(this);
            c73Var.g(this.q);
            return;
        }
        om7 om7Var = this.s;
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
        Path path = this.d;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((z6g) arrayList.get(i)).e(), matrix);
                i++;
            }
        }
    }

    public final int[] g(int[] iArr) {
        zzm zzmVar = this.n;
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
        return this.a;
    }

    @Override // defpackage.ql7
    public final void h(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.b) {
            return;
        }
        Path path = this.d;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((z6g) arrayList.get(i2)).e(), matrix);
            i2++;
        }
        path.computeBounds(this.f, false);
        int i3 = this.h;
        h2a h2aVar = this.i;
        h2a h2aVar2 = this.l;
        h2a h2aVar3 = this.k;
        if (i3 == 1) {
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
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f, f2, fHypot, iArrG, fArr, Shader.TileMode.CLAMP);
                this.radialGradientCache.g(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        ezb ezbVar = this.e;
        ezbVar.setShader(shader);
        zzm zzmVar = this.m;
        if (zzmVar != null) {
            ezbVar.setColorFilter((ColorFilter) zzmVar.e());
        }
        a73 a73Var = this.q;
        if (a73Var != null) {
            float fFloatValue = ((Float) a73Var.e()).floatValue();
            if (fFloatValue == 0.0f) {
                ezbVar.setMaskFilter(null);
            } else if (fFloatValue != this.r) {
                ezbVar.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.r = fFloatValue;
        }
        om7 om7Var = this.s;
        if (om7Var != null) {
            om7Var.b(ezbVar);
        }
        PointF pointF5 = l1e.a;
        ezbVar.setAlpha(Math.max(0, Math.min(255, (int) ((((i / 255.0f) * ((Integer) this.j.e()).intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(path, ezbVar);
    }

    public final int i() {
        float f = this.k.d;
        float f2 = this.p;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.l.d * f2);
        int iRound3 = Math.round(this.i.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
