package defpackage;

import android.content.Context;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class z7j {
    public final mw3 A;
    public final lw3 B;
    public final lw3 C;
    public final mw3 D;
    public final et3 E;
    public final eq6 F;
    public final plh G;
    public final plh H;
    public final Lazy I;
    public final j4c J;
    public final Context a;
    public final nw3 b;
    public final wv1 c;
    public final j4c d;
    public final lw3 e;
    public final Lazy f;
    public final Lazy g;
    public final lw3 h;
    public final g92 i;
    public final ew3 j;
    public final lw3 k;
    public final lw3 l;
    public final ew3 m;
    public final ew3 n;
    public final ew3 o;
    public final lw3 p;
    public final lw3 q;
    public final Lazy r;
    public final nw3 s;
    public final ew3 t;
    public final lw3 u;
    public final lw3 v;
    public final Lazy w;
    public final ew3 x;
    public final Lazy y;
    public final zv3 z;

    public z7j(Context context, nw3 nw3Var, wv1 wv1Var, j4c j4cVar, lw3 lw3Var, Lazy lazy, Lazy lazy2, lw3 lw3Var2, g92 g92Var, ew3 ew3Var, kw3 kw3Var, lw3 lw3Var3, lw3 lw3Var4, ew3 ew3Var2, ew3 ew3Var3, ew3 ew3Var4, lw3 lw3Var5, lw3 lw3Var6, Lazy lazy3, nw3 nw3Var2, ew3 ew3Var5, lw3 lw3Var7, lw3 lw3Var8, Lazy lazy4, ew3 ew3Var6, Lazy lazy5, zv3 zv3Var, mw3 mw3Var, lw3 lw3Var9, lw3 lw3Var10, mw3 mw3Var2, et3 et3Var, eq6 eq6Var, plh plhVar, plh plhVar2, Lazy lazy6, j4c j4cVar2) {
        this.a = context;
        this.b = nw3Var;
        this.c = wv1Var;
        this.d = j4cVar;
        this.e = lw3Var;
        this.f = lazy;
        this.g = lazy2;
        this.h = lw3Var2;
        this.i = g92Var;
        this.j = ew3Var;
        this.k = lw3Var3;
        this.l = lw3Var4;
        this.m = ew3Var2;
        this.n = ew3Var3;
        this.o = ew3Var4;
        this.p = lw3Var5;
        this.q = lw3Var6;
        this.r = lazy3;
        this.s = nw3Var2;
        this.t = ew3Var5;
        this.u = lw3Var7;
        this.v = lw3Var8;
        this.w = lazy4;
        this.x = ew3Var6;
        this.y = lazy5;
        this.z = zv3Var;
        this.A = mw3Var;
        this.B = lw3Var9;
        this.C = lw3Var10;
        this.D = mw3Var2;
        this.E = et3Var;
        this.F = eq6Var;
        this.G = plhVar;
        this.H = plhVar2;
        this.I = lazy6;
        this.J = j4cVar2;
    }

    public final yu1 a() {
        return new yu1(this.q.b.J(), (ev1) this.r.get(), (nzk) this.t.get(), (dxe) this.m.get(), new jjg(this, (byte) 6));
    }

    public final ami b() {
        return new ami(this.q.b.J(), (fw3) this.J.get(), this.a.getResources(), (jt3) this.z.get());
    }

    public final ny3 c() {
        return new ny3(this.q.b.J(), (mm6) this.g.get(), this.u.b.O(), dj9.t(this.B.b), (ekc) this.C.get());
    }

    public final wte d(yqa yqaVar) {
        return new wte(this.a, this.q.b.J(), (dyf) this.n.get(), yqaVar, this.k.b.y(), this.l.b.z());
    }

    public final psi e() {
        SettingsManager settingsManagerJ = this.q.b.J();
        xnh xnhVar = (xnh) this.o.get();
        q6e q6eVarI = this.p.b.I();
        j4c j4cVar = this.d;
        f99 f99VarT = xf8.t(((yk6) j4cVar.get()).i);
        f99 f99VarT2 = xf8.t(((yk6) j4cVar.get()).j);
        f99 f99VarT3 = xf8.t((ekc) this.e.get());
        Context context = this.a;
        return new psi(settingsManagerJ, xnhVar, q6eVarI, f99VarT, f99VarT2, f99VarT3, jbf.t(context), wok.t(context), this.x, this.G, this.H);
    }

    public final b8k f() {
        OperaApplication operaApplication = this.q.b;
        mgh mghVar = new mgh(operaApplication.J(), (ru9) this.A.get(), (byte) 4);
        return new b8k(this.a, operaApplication.J(), (qln) this.w.get(), (xnh) this.o.get(), ((xnc) this.i.get()).a, this.l.b.z(), ((u8k) this.E.invoke()).d, mghVar, xf8.u((f99) ((zyk) ((u7k) this.F.a).a).getValue()), (ikc) this.D.get(), ((jt3) this.z.get()).f, (ikc) this.I.get());
    }

    public final zxk g() {
        return new zxk(this.s.b.N(), this.q.b.J(), this.b.b.b(), (som) this.v.get(), this.h.b.s());
    }
}
