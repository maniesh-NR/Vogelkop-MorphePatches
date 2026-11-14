package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class gi5 extends c73 {
    public a73 A;
    public final ArrayList B;
    public final RectF C;
    public final RectF D;
    public float E;
    public boolean F;

    public gi5(f3d f3dVar, t1c t1cVar, List list, p2d p2dVar) {
        c73 c73Var;
        c73 gi5Var;
        String str;
        super(f3dVar, t1cVar);
        this.B = new ArrayList();
        this.C = new RectF();
        this.D = new RectF();
        this.F = true;
        ed1 ed1Var = t1cVar.s;
        if (ed1Var != null) {
            a73 a73VarD = ed1Var.D();
            this.A = a73VarD;
            g(a73VarD);
            this.A.a(this);
        } else {
            this.A = null;
        }
        j1d j1dVar = new j1d(p2dVar.h.size());
        int size = list.size() - 1;
        c73 c73Var2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < j1dVar.j(); i++) {
                    c73 c73Var3 = (c73) j1dVar.c(j1dVar.f(i));
                    if (c73Var3 != null && (c73Var = (c73) j1dVar.c(c73Var3.p.f)) != null) {
                        c73Var3.t = c73Var;
                    }
                }
                return;
            }
            t1c t1cVar2 = (t1c) list.get(size);
            int iA = vep.A(t1cVar2.e);
            if (iA == 0) {
                gi5Var = new gi5(f3dVar, t1cVar2, (List) p2dVar.c.get(t1cVar2.g), p2dVar);
            } else if (iA == 1) {
                gi5Var = new ovj(f3dVar, t1cVar2);
            } else if (iA == 2) {
                gi5Var = new vxa(f3dVar, t1cVar2);
            } else if (iA == 3) {
                gi5Var = new d4f(f3dVar, t1cVar2);
            } else if (iA == 4) {
                gi5Var = new ebj(f3dVar, t1cVar2, this, p2dVar);
            } else if (iA != 5) {
                switch (t1cVar2.e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                izc.b("Unknown layer type ".concat(str));
                gi5Var = null;
            } else {
                gi5Var = new kjl(f3dVar, t1cVar2);
            }
            if (gi5Var != null) {
                j1dVar.g(gi5Var.p.d, gi5Var);
                if (c73Var2 != null) {
                    c73Var2.s = gi5Var;
                    c73Var2 = null;
                } else {
                    this.B.add(0, gi5Var);
                    int iA2 = vep.A(t1cVar2.u);
                    if (iA2 == 1 || iA2 == 2) {
                        c73Var2 = gi5Var;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.c73, defpackage.evb
    public final void d(ua7 ua7Var, Object obj) {
        super.d(ua7Var, obj);
        if (obj == k3d.z) {
            if (ua7Var == null) {
                a73 a73Var = this.A;
                if (a73Var != null) {
                    a73Var.j(null);
                    return;
                }
                return;
            }
            zzm zzmVar = new zzm(ua7Var, null);
            this.A = zzmVar;
            zzmVar.a(this);
            g(this.A);
        }
    }

    @Override // defpackage.c73, defpackage.ql7
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.C;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((c73) arrayList.get(size)).f(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.c73
    public final void j(Canvas canvas, Matrix matrix, int i) {
        t1c t1cVar = this.p;
        float f = t1cVar.o;
        float f2 = t1cVar.p;
        RectF rectF = this.D;
        rectF.set(0.0f, 0.0f, f, f2);
        matrix.mapRect(rectF);
        this.o.getClass();
        canvas.save();
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.F || !"__container".equals(t1cVar.c)) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((c73) arrayList.get(size)).h(canvas, matrix, i);
            }
        }
        canvas.restore();
    }

    @Override // defpackage.c73
    public final void p(dvb dvbVar, int i, ArrayList arrayList, dvb dvbVar2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.B;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((c73) arrayList2.get(i2)).c(dvbVar, i, arrayList, dvbVar2);
            i2++;
        }
    }

    @Override // defpackage.c73
    public final void q(float f) {
        this.E = f;
        super.q(f);
        a73 a73Var = this.A;
        t1c t1cVar = this.p;
        if (a73Var != null) {
            p2d p2dVar = this.o.a;
            f = ((((Float) a73Var.e()).floatValue() * t1cVar.b.l) - t1cVar.b.j) / ((p2dVar.k - p2dVar.j) + 0.01f);
        }
        if (this.A == null) {
            float f2 = t1cVar.n;
            p2d p2dVar2 = t1cVar.b;
            f -= f2 / (p2dVar2.k - p2dVar2.j);
        }
        if (t1cVar.m != 0.0f && !"__container".equals(t1cVar.c)) {
            f /= t1cVar.m;
        }
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c73) arrayList.get(size)).q(f);
        }
    }
}
