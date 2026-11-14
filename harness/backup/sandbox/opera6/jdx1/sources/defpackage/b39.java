package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b39 implements ql7, x63, fvb {
    public final Path a;
    public final ezb b;
    public final c73 c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final ka5 g;
    public final ka5 h;
    public zzm i;
    public final f3d j;
    public a73 k;
    public float l;
    public final om7 m;

    public b39(f3d f3dVar, c73 c73Var, yaj yajVar) {
        Path path = new Path();
        this.a = path;
        ezb ezbVar = new ezb((byte) 0, 1);
        this.b = ezbVar;
        this.f = new ArrayList();
        this.c = c73Var;
        String str = yajVar.c;
        dd1 dd1Var = yajVar.e;
        dd1 dd1Var2 = yajVar.d;
        this.d = str;
        this.e = yajVar.f;
        this.j = f3dVar;
        if (c73Var.k() != null) {
            a73 a73VarD = ((ed1) c73Var.k().a).D();
            this.k = a73VarD;
            a73VarD.a(this);
            c73Var.g(this.k);
        }
        if (c73Var.l() != null) {
            this.m = new om7(this, c73Var, c73Var.l());
        }
        if (dd1Var2 == null) {
            this.g = null;
            this.h = null;
            return;
        }
        int iA = vep.A(c73Var.p.y);
        lh3 lh3Var = iA != 2 ? iA != 3 ? iA != 4 ? iA != 5 ? iA != 16 ? null : lh3.m : lh3.r : lh3.q : lh3.p : lh3.o;
        ezbVar.setBlendMode(lh3Var != null ? qyn.R(lh3Var) : null);
        path.setFillType(yajVar.b);
        a73 a73VarD2 = dd1Var2.D();
        this.g = (ka5) a73VarD2;
        a73VarD2.a(this);
        c73Var.g(a73VarD2);
        a73 a73VarD3 = dd1Var.D();
        this.h = (ka5) a73VarD3;
        a73VarD3.a(this);
        c73Var.g(a73VarD3);
    }

    @Override // defpackage.x63
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.wp5
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            wp5 wp5Var = (wp5) list2.get(i);
            if (wp5Var instanceof z6g) {
                this.f.add((z6g) wp5Var);
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
        if (obj == 1) {
            this.g.j(ua7Var);
            return;
        }
        if (obj == 4) {
            this.h.j(ua7Var);
            return;
        }
        ColorFilter colorFilter = k3d.F;
        c73 c73Var = this.c;
        if (obj == colorFilter) {
            zzm zzmVar = this.i;
            if (zzmVar != null) {
                c73Var.o(zzmVar);
            }
            if (ua7Var == null) {
                this.i = null;
                return;
            }
            zzm zzmVar2 = new zzm(ua7Var, null);
            this.i = zzmVar2;
            zzmVar2.a(this);
            c73Var.g(this.i);
            return;
        }
        if (obj == k3d.e) {
            a73 a73Var = this.k;
            if (a73Var != null) {
                a73Var.j(ua7Var);
                return;
            }
            zzm zzmVar3 = new zzm(ua7Var, null);
            this.k = zzmVar3;
            zzmVar3.a(this);
            c73Var.g(this.k);
            return;
        }
        om7 om7Var = this.m;
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
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
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

    @Override // defpackage.wp5
    public final String getName() {
        return this.d;
    }

    @Override // defpackage.ql7
    public final void h(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        ka5 ka5Var = this.g;
        int iK = ka5Var.k(ka5Var.c.h(), ka5Var.c());
        PointF pointF = l1e.a;
        int i2 = 0;
        int iMax = (Math.max(0, Math.min(255, (int) ((((i / 255.0f) * ((Integer) this.h.e()).intValue()) / 100.0f) * 255.0f))) << 24) | (iK & 16777215);
        ezb ezbVar = this.b;
        ezbVar.setColor(iMax);
        zzm zzmVar = this.i;
        if (zzmVar != null) {
            ezbVar.setColorFilter((ColorFilter) zzmVar.e());
        }
        a73 a73Var = this.k;
        if (a73Var != null) {
            float fFloatValue = ((Float) a73Var.e()).floatValue();
            if (fFloatValue == 0.0f) {
                ezbVar.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                c73 c73Var = this.c;
                if (c73Var.y == fFloatValue) {
                    blurMaskFilter = c73Var.z;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    c73Var.z = blurMaskFilter2;
                    c73Var.y = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                ezbVar.setMaskFilter(blurMaskFilter);
            }
            this.l = fFloatValue;
        }
        om7 om7Var = this.m;
        if (om7Var != null) {
            om7Var.b(ezbVar);
        }
        Path path = this.a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, ezbVar);
                return;
            } else {
                path.addPath(((z6g) arrayList.get(i2)).e(), matrix);
                i2++;
            }
        }
    }
}
