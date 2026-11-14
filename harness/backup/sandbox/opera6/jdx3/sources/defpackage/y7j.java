package defpackage;

import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y7j implements lkf {
    public final b59 A;
    public final gw3 B;
    public final lw3 C;
    public final j4c D;
    public final z7j a;
    public final gjm b;
    public final mw3 c;
    public final lw3 d;
    public final lw3 e;
    public final ew3 f;
    public final mw3 g;
    public final mw3 h;
    public final lw3 i;
    public final nw3 j;
    public final ow3 k;
    public final lw3 l;
    public final lw3 m;
    public final mw3 n;
    public final mw3 o;
    public final Lazy p;
    public final cq5 q;
    public final nw3 r;
    public final mw3 s;
    public final mw3 t;
    public final lw3 u;
    public final mw3 v;
    public final mw3 w;
    public final umi x;
    public final mw3 y;
    public final Lazy z;

    public y7j(z7j z7jVar, gjm gjmVar, mw3 mw3Var, kw3 kw3Var, lw3 lw3Var, lw3 lw3Var2, ew3 ew3Var, mw3 mw3Var2, mw3 mw3Var3, lw3 lw3Var3, nw3 nw3Var, ow3 ow3Var, lw3 lw3Var4, lw3 lw3Var5, mw3 mw3Var4, mw3 mw3Var5, Lazy lazy, cq5 cq5Var, nw3 nw3Var2, mw3 mw3Var6, mw3 mw3Var7, lw3 lw3Var6, mw3 mw3Var8, mw3 mw3Var9, umi umiVar, mw3 mw3Var10, Lazy lazy2, b59 b59Var, gw3 gw3Var, lw3 lw3Var7, j4c j4cVar) {
        this.a = z7jVar;
        this.b = gjmVar;
        this.c = mw3Var;
        this.d = lw3Var;
        this.e = lw3Var2;
        this.f = ew3Var;
        this.g = mw3Var2;
        this.h = mw3Var3;
        this.i = lw3Var3;
        this.j = nw3Var;
        this.k = ow3Var;
        this.l = lw3Var4;
        this.m = lw3Var5;
        this.n = mw3Var4;
        this.o = mw3Var5;
        this.p = lazy;
        this.q = cq5Var;
        this.r = nw3Var2;
        this.s = mw3Var6;
        this.t = mw3Var7;
        this.u = lw3Var6;
        this.v = mw3Var8;
        this.w = mw3Var9;
        this.x = umiVar;
        this.y = mw3Var10;
        this.z = lazy2;
        this.A = b59Var;
        this.B = gw3Var;
        this.C = lw3Var7;
        this.D = j4cVar;
    }

    public final Fragment b(Class cls) {
        OperaApplication operaApplication = this.l.b;
        OperaApplication operaApplication2 = this.d.b;
        boolean zA = Intrinsics.a(cls, u2.class);
        gjm gjmVar = this.b;
        if (zA) {
            return new u2(gjmVar);
        }
        if (Intrinsics.a(cls, p9.class)) {
            return new p9(gjmVar);
        }
        if (Intrinsics.a(cls, g01.class)) {
            return new g01(s9g.h, gjmVar, operaApplication2.J());
        }
        if (Intrinsics.a(cls, pu1.class)) {
            return new pu1(gjmVar);
        }
        if (Intrinsics.a(cls, ts1.class)) {
            return new ts1(operaApplication2.J(), this.u.b.k());
        }
        if (Intrinsics.a(cls, ht1.class)) {
            return new ht1((it1) this.A.get(), this.x, gjmVar, this.B);
        }
        boolean zA2 = Intrinsics.a(cls, wo3.class);
        mw3 mw3Var = this.t;
        mw3 mw3Var2 = this.v;
        nw3 nw3Var = this.r;
        if (zA2) {
            return new wo3(operaApplication2.J(), (ru9) mw3Var2.get(), (z77) mw3Var.get(), (orm) nw3Var.get(), (fw3) this.D.get(), (k6l) this.w.get());
        }
        if (Intrinsics.a(cls, gy3.class)) {
            return new gy3(gjmVar);
        }
        if (Intrinsics.a(cls, dm8.class)) {
            return new dm8(gjmVar, operaApplication2.J(), s9g.h, (vo7) this.z.get());
        }
        if (Intrinsics.a(cls, c29.class)) {
            return new c29(gjmVar);
        }
        if (Intrinsics.a(cls, fw9.class)) {
            return new fw9(gjmVar);
        }
        if (Intrinsics.a(cls, caa.class)) {
            return new caa(gjmVar);
        }
        if (Intrinsics.a(cls, dda.class)) {
            return new dda(gjmVar);
        }
        if (Intrinsics.a(cls, crd.class)) {
            return new crd(gjmVar);
        }
        if (Intrinsics.a(cls, a3f.class)) {
            return new a3f(gjmVar);
        }
        boolean zA3 = Intrinsics.a(cls, f1c.class);
        mw3 mw3Var3 = this.c;
        z7j z7jVar = this.a;
        if (zA3) {
            v3m v3mVarO = this.i.b.O();
            return new f1c(operaApplication2.J(), this.e.b.I(), new j1c(z7jVar.q.b.J(), (SharedPreferences) z7jVar.j.get(), v3mVarO, (jbn) z7jVar.y.get()), v3mVarO, (g0c) mw3Var3.get());
        }
        if (Intrinsics.a(cls, pte.class)) {
            yqa yqaVar = new yqa((byte) 21);
            return new pte(this.b, (skm) this.j.get(), z7jVar.d(yqaVar), yqaVar, this.x, (orm) nw3Var.get());
        }
        if (Intrinsics.a(cls, hcg.class)) {
            return new hcg(gjmVar, (d7h) this.k.get());
        }
        if (Intrinsics.a(cls, azg.class)) {
            return new azg(gjmVar);
        }
        if (Intrinsics.a(cls, isi.class)) {
            return new isi(gjmVar);
        }
        if (Intrinsics.a(cls, kc2.class)) {
            return new kc2(gjmVar, (g0c) mw3Var3.get());
        }
        if (Intrinsics.a(cls, k6j.class)) {
            return new k6j();
        }
        if (Intrinsics.a(cls, c9j.class)) {
            return new c9j();
        }
        if (Intrinsics.a(cls, ooj.class)) {
            return new ooj((qoj) this.g.get(), new jvg(z7jVar.u.b.O()));
        }
        if (Intrinsics.a(cls, jdo.class)) {
            return new jdo(operaApplication2.J(), this.C);
        }
        boolean zA4 = Intrinsics.a(cls, g9g.class);
        mw3 mw3Var4 = this.n;
        if (zA4) {
            return new g9g(this.b, s9g.h, (b9g) this.h.get(), this.z, mw3Var4, operaApplication2.J());
        }
        if (Intrinsics.a(cls, v7k.class)) {
            return new v7k(gjmVar);
        }
        if (Intrinsics.a(cls, uxk.class)) {
            return new uxk();
        }
        if (Intrinsics.a(cls, awi.class)) {
            return new awi(gjmVar, operaApplication.R(), (wc7) this.m.get(), (ysj) mw3Var4.get());
        }
        boolean zA5 = Intrinsics.a(cls, wyl.class);
        mw3 mw3Var5 = this.o;
        if (zA5) {
            return new wyl(operaApplication2.J(), (tni) mw3Var5.get());
        }
        if (Intrinsics.a(cls, rbn.class)) {
            return new rbn(this.p, this.q);
        }
        boolean zA6 = Intrinsics.a(cls, tc6.class);
        ew3 ew3Var = this.f;
        mw3 mw3Var6 = this.s;
        if (zA6) {
            return new tc6(operaApplication2.J(), operaApplication.R(), (orm) nw3Var.get(), (xi5) mw3Var6.get(), (z77) mw3Var.get(), (d8j) ew3Var.get());
        }
        if (!Intrinsics.a(cls, wk.class)) {
            if (Intrinsics.a(cls, lj.class) || !Intrinsics.a(cls, lk.class)) {
                return null;
            }
            return new lk(mw3Var4);
        }
        SettingsManager settingsManagerJ = operaApplication2.J();
        tni tniVar = (tni) mw3Var5.get();
        xi5 xi5Var = (xi5) mw3Var6.get();
        mw3Var2.get();
        return new wk(this.b, settingsManagerJ, tniVar, xi5Var, (d8j) ew3Var.get(), (rj) this.y.get());
    }
}
