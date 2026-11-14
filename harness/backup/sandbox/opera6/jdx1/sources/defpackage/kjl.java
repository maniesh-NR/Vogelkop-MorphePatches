package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class kjl extends c73 {
    public final StringBuilder A;
    public final RectF B;
    public final Matrix C;
    public final ezb D;
    public final ezb E;
    public final HashMap F;
    public final j1d G;
    public final ArrayList H;
    public final ka5 I;
    public final f3d J;
    public final p2d K;
    public final ka5 L;
    public zzm M;
    public final ka5 N;
    public zzm O;
    public final t89 P;
    public zzm Q;
    public final t89 R;
    public zzm S;
    public zzm T;
    public zzm U;

    public kjl(f3d f3dVar, t1c t1cVar) {
        ed1 ed1Var;
        ed1 ed1Var2;
        dd1 dd1Var;
        dd1 dd1Var2;
        super(f3dVar, t1cVar);
        this.A = new StringBuilder(2);
        this.B = new RectF();
        this.C = new Matrix();
        ezb ezbVar = new ezb((byte) 1, 1);
        ezbVar.setStyle(Paint.Style.FILL);
        this.D = ezbVar;
        ezb ezbVar2 = new ezb((byte) 2, 1);
        ezbVar2.setStyle(Paint.Style.STROKE);
        this.E = ezbVar2;
        this.F = new HashMap();
        this.G = new j1d((Object) null);
        this.H = new ArrayList();
        this.J = f3dVar;
        this.K = t1cVar.b;
        ka5 ka5Var = new ka5((List) ((n1) t1cVar.q).b, (byte) 2);
        this.I = ka5Var;
        ka5Var.a(this);
        g(ka5Var);
        i3j i3jVar = t1cVar.r;
        if (i3jVar != null && (dd1Var2 = (dd1) i3jVar.a) != null) {
            a73 a73VarD = dd1Var2.D();
            this.L = (ka5) a73VarD;
            a73VarD.a(this);
            g(a73VarD);
        }
        if (i3jVar != null && (dd1Var = (dd1) i3jVar.b) != null) {
            a73 a73VarD2 = dd1Var.D();
            this.N = (ka5) a73VarD2;
            a73VarD2.a(this);
            g(a73VarD2);
        }
        if (i3jVar != null && (ed1Var2 = (ed1) i3jVar.c) != null) {
            a73 a73VarD3 = ed1Var2.D();
            this.P = (t89) a73VarD3;
            a73VarD3.a(this);
            g(a73VarD3);
        }
        if (i3jVar == null || (ed1Var = (ed1) i3jVar.d) == null) {
            return;
        }
        a73 a73VarD4 = ed1Var.D();
        this.R = (t89) a73VarD4;
        a73VarD4.a(this);
        g(a73VarD4);
    }

    public static void r(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    public static void s(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    public static void u(Canvas canvas, bd7 bd7Var, int i, float f) {
        PointF pointF = bd7Var.l;
        PointF pointF2 = bd7Var.m;
        float fC = dzm.c();
        float f2 = (i * bd7Var.f * fC) + (pointF == null ? 0.0f : (bd7Var.f * fC) + pointF.y);
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iA = vep.A(bd7Var.d);
        if (iA == 0) {
            canvas.translate(f3, f2);
        } else if (iA == 1) {
            canvas.translate((f3 + f4) - f, f2);
        } else {
            if (iA != 2) {
                return;
            }
            canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        }
    }

    @Override // defpackage.c73, defpackage.evb
    public final void d(ua7 ua7Var, Object obj) {
        super.d(ua7Var, obj);
        PointF pointF = k3d.a;
        if (obj == 1) {
            zzm zzmVar = this.M;
            if (zzmVar != null) {
                o(zzmVar);
            }
            if (ua7Var == null) {
                this.M = null;
                return;
            }
            zzm zzmVar2 = new zzm(ua7Var, null);
            this.M = zzmVar2;
            zzmVar2.a(this);
            g(this.M);
            return;
        }
        if (obj == 2) {
            zzm zzmVar3 = this.O;
            if (zzmVar3 != null) {
                o(zzmVar3);
            }
            if (ua7Var == null) {
                this.O = null;
                return;
            }
            zzm zzmVar4 = new zzm(ua7Var, null);
            this.O = zzmVar4;
            zzmVar4.a(this);
            g(this.O);
            return;
        }
        if (obj == k3d.n) {
            zzm zzmVar5 = this.Q;
            if (zzmVar5 != null) {
                o(zzmVar5);
            }
            if (ua7Var == null) {
                this.Q = null;
                return;
            }
            zzm zzmVar6 = new zzm(ua7Var, null);
            this.Q = zzmVar6;
            zzmVar6.a(this);
            g(this.Q);
            return;
        }
        if (obj == k3d.o) {
            zzm zzmVar7 = this.S;
            if (zzmVar7 != null) {
                o(zzmVar7);
            }
            if (ua7Var == null) {
                this.S = null;
                return;
            }
            zzm zzmVar8 = new zzm(ua7Var, null);
            this.S = zzmVar8;
            zzmVar8.a(this);
            g(this.S);
            return;
        }
        if (obj == k3d.A) {
            zzm zzmVar9 = this.T;
            if (zzmVar9 != null) {
                o(zzmVar9);
            }
            if (ua7Var == null) {
                this.T = null;
                return;
            }
            zzm zzmVar10 = new zzm(ua7Var, null);
            this.T = zzmVar10;
            zzmVar10.a(this);
            g(this.T);
            return;
        }
        if (obj != k3d.H) {
            if (obj == k3d.J) {
                ka5 ka5Var = this.I;
                ka5Var.getClass();
                ka5Var.j(new fjl(new g3d(), ua7Var, new bd7()));
                return;
            }
            return;
        }
        zzm zzmVar11 = this.U;
        if (zzmVar11 != null) {
            o(zzmVar11);
        }
        if (ua7Var == null) {
            this.U = null;
            return;
        }
        zzm zzmVar12 = new zzm(ua7Var, null);
        this.U = zzmVar12;
        zzmVar12.a(this);
        g(this.U);
    }

    @Override // defpackage.c73, defpackage.ql7
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        p2d p2dVar = this.K;
        rectF.set(0.0f, 0.0f, p2dVar.i.width(), p2dVar.i.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    @Override // defpackage.c73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjl.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final jjl t(int i) {
        ArrayList arrayList = this.H;
        for (int size = arrayList.size(); size < i; size++) {
            jjl jjlVar = new jjl();
            jjlVar.a = "";
            jjlVar.b = 0.0f;
            arrayList.add(jjlVar);
        }
        return (jjl) arrayList.get(i - 1);
    }

    public final List v(String str, float f, ih9 ih9Var, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                int iA = jh9.a(cCharAt, ih9Var.a, ih9Var.b);
                fxj fxjVar = this.K.f;
                fxjVar.getClass();
                jh9 jh9Var = (jh9) y9m.u(fxjVar, iA);
                if (jh9Var != null) {
                    fMeasureText = (dzm.c() * ((float) jh9Var.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.D.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                jjl jjlVarT = t(i);
                if (i3 == i2) {
                    jjlVarT.a = str.substring(i2, i4).trim();
                    jjlVarT.b = (f4 - fMeasureText) - ((r10.length() - r8.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    jjlVarT.a = str.substring(i2, i3 - 1).trim();
                    jjlVarT.b = ((f4 - f5) - ((r8.length() - r14.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            jjl jjlVarT2 = t(i);
            jjlVarT2.a = str.substring(i2);
            jjlVarT2.b = f4;
        }
        return this.H.subList(0, i);
    }
}
