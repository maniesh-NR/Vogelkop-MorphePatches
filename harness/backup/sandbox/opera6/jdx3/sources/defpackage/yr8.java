package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes.dex */
public final class yr8 {
    public final Context a;
    public final xr8 b;
    public final gjf c;
    public final int d;
    public final zzj e;
    public hq8 f;
    public jl6 g;
    public gk6 h;
    public wr8 i;
    public int j;
    public String k;
    public vmj l;

    public yr8(Context context, xr8 xr8Var, gjf gjfVar, int i, zzj zzjVar) {
        this.a = context;
        this.b = xr8Var;
        this.c = gjfVar;
        this.d = i;
        this.e = zzjVar;
    }

    public final void a(Canvas canvas, int i, int i2, int i3, int i4) {
        jl6 jl6Var = this.g;
        if (jl6Var != null) {
            jl6Var.c = this.b.i();
            this.g.g(canvas, i, i2, i3, i4);
            return;
        }
        gk6 gk6Var = this.h;
        if (gk6Var != null) {
            gk6Var.setBounds(i, i2, i3, i4);
            this.h.draw(canvas);
            return;
        }
        vmj vmjVar = this.l;
        if (vmjVar != null) {
            vmjVar.setBounds(i, i2, i3, i4);
            this.l.draw(canvas);
        }
    }

    public final void b(int i, String str, boolean z, boolean z2) {
        this.i = new wr8(this, z2, z, str, i);
        dwh dwhVarG = qbe.G(this.a, i, str);
        if (z2) {
            dwhVarG.i(3, new int[0]);
        }
        if (z) {
            dwhVarG.h(1, new int[0]);
        }
        dwhVarG.f(this.i);
    }

    public final void c(ifd ifdVar) {
        if (ifdVar instanceof nnj) {
            i(false);
        } else if (ifdVar instanceof tnj) {
            File file = ((tnj) ifdVar).a;
            int iV = this.b.v();
            oya.b(file.getAbsolutePath(), iV, iV, 0, 0, new qq6(this, (byte) 12));
        }
    }

    public final void d(Bitmap bitmap) {
        jl6 jl6Var;
        xr8 xr8Var = this.b;
        if (bitmap != null) {
            jl6Var = new jl6(bitmap, this.c, this.d, xr8Var.i());
        } else {
            jl6Var = null;
        }
        this.g = jl6Var;
        this.i = null;
        if (jl6Var == null) {
            xr8Var.l();
            i(false);
        } else {
            xr8Var.h();
        }
        xr8Var.invalidate();
    }

    public final void e() {
        wr8 wr8Var = this.i;
        if (wr8Var != null) {
            yne.b.a(wr8Var);
            this.i = null;
        }
        this.g = null;
        this.h = null;
    }

    public final void f(boolean z) {
        gk6 gk6VarT;
        hq8 hq8Var = this.f;
        if (hq8Var == null) {
            return;
        }
        String strG = hq8Var.g();
        boolean zIsEmpty = TextUtils.isEmpty(strG);
        boolean z2 = false;
        xr8 xr8Var = this.b;
        if (!zIsEmpty) {
            int iS = xr8Var.s();
            if (!z && this.j == iS) {
                xr8Var.h();
                return;
            }
            this.j = iS;
            e();
            if (!strG.startsWith("/") && !strG.startsWith("file://")) {
                z2 = true;
            }
            b(iS, strG, z, z2);
            return;
        }
        hq8 hq8Var2 = this.f;
        p6l p6lVar = p6l.a;
        String strI = hq8Var2.i(p6lVar);
        hk6.e.getClass();
        if (!a36.p(strI)) {
            zzj zzjVar = this.e;
            if (zzjVar == null) {
                i(z);
                return;
            }
            e();
            hq8 hq8Var3 = this.f;
            if (hq8Var3 == null) {
                i(false);
                return;
            }
            ifd ifdVarF = zzjVar.a.f(zzj.a(hq8Var3), new tu7((Object) this, (byte) 9));
            if (ifdVarF == null) {
                g(false);
                return;
            } else {
                c(ifdVarF);
                return;
            }
        }
        e();
        String strI2 = this.f.i(p6lVar);
        int iV = xr8Var.v();
        hk6 hk6VarS = a36.s(strI2);
        if (hk6VarS != null) {
            int i = hk6VarS.b;
            Integer num = hk6VarS.c;
            int i2 = gk6.j;
            gk6VarT = s16.t(this.a, i, num, iV, 0, 48);
            gk6VarT.f = xr8Var.i();
        } else {
            gk6VarT = null;
        }
        this.g = null;
        this.h = gk6VarT;
        this.i = null;
        if (gk6VarT == null) {
            xr8Var.l();
            i(false);
        } else {
            xr8Var.h();
        }
        xr8Var.invalidate();
    }

    public final void g(boolean z) {
        if (this.f != null) {
            xr8 xr8Var = this.b;
            String strP = xr8Var.p();
            if (!TextUtils.equals(this.k, strP) || z) {
                this.k = strP;
                this.l = xr8Var.k(strP);
                xr8Var.invalidate();
            }
        }
    }

    public final void h() {
        gk6 gk6Var = this.h;
        if (gk6Var != null) {
            Context context = this.a;
            xr8 xr8Var = this.b;
            gk6Var.a(xr8Var.i(), context);
            gk6 gk6Var2 = this.h;
            this.g = null;
            this.h = gk6Var2;
            this.i = null;
            if (gk6Var2 == null) {
                xr8Var.l();
                i(false);
            } else {
                xr8Var.h();
            }
            xr8Var.invalidate();
        }
    }

    public final void i(boolean z) {
        e();
        g(z);
        this.b.h();
    }
}
