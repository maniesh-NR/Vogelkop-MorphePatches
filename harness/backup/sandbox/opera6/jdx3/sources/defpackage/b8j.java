package defpackage;

import android.content.Context;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.history.HistoryManager;
import com.opera.android.history.f;
import com.opera.android.settings.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b8j implements mkf {
    public final ew3 A;
    public final mw3 B;
    public final ew3 C;
    public final j4c D;
    public final zv3 E;
    public final Lazy F;
    public final lw3 G;
    public final lw3 H;
    public final jjg I;
    public final mw3 J;
    public final lw3 K;
    public final lw3 L;
    public final sqi M;
    public final lw3 N;
    public final ew3 O;
    public final lw3 P;
    public final Lazy Q;
    public final ew3 R;
    public final ki S;
    public final mw3 T;
    public final nw3 U;
    public final mw3 V;
    public final kw3 W;
    public final mw3 X;
    public final lw3 Y;
    public final nw3 Z;
    public final z7j a;
    public final nw3 a0;
    public final umi b;
    public final ow3 b0;
    public final wjh c;
    public final lw3 c0;
    public final gjm d;
    public final ew3 d0;
    public final x0f e;
    public final Lazy e0;
    public final Context f;
    public final mw3 f0;
    public final nw3 g;
    public final mw3 g0;
    public final wv1 h;
    public final mw3 h0;
    public final kw3 i;
    public final lw3 i0;
    public final mw3 j;
    public final b59 j0;
    public final j4c k;
    public final zv3 k0;
    public final j4c l;
    public final lw3 l0;
    public final mw3 m;
    public final hw3 m0;
    public final zv3 n;
    public final hw3 n0;
    public final mw3 o;
    public final j4c o0;
    public final ew3 p;
    public final lw3 p0;
    public final lw3 q;
    public final j4c q0;
    public final Lazy r;
    public final Lazy s;
    public final lw3 t;
    public final mw3 u;
    public final lw3 v;
    public final Lazy w;
    public final mw3 x;
    public final lw3 y;
    public final mw3 z;

    public b8j(z7j z7jVar, umi umiVar, wjh wjhVar, gjm gjmVar, x0f x0fVar, Context context, nw3 nw3Var, wv1 wv1Var, kw3 kw3Var, mw3 mw3Var, j4c j4cVar, j4c j4cVar2, mw3 mw3Var2, zv3 zv3Var, mw3 mw3Var3, ew3 ew3Var, lw3 lw3Var, Lazy lazy, Lazy lazy2, lw3 lw3Var2, mw3 mw3Var4, lw3 lw3Var3, Lazy lazy3, mw3 mw3Var5, lw3 lw3Var4, mw3 mw3Var6, ew3 ew3Var2, mw3 mw3Var7, ew3 ew3Var3, j4c j4cVar3, lw3 lw3Var5, zv3 zv3Var2, Lazy lazy4, lw3 lw3Var6, lw3 lw3Var7, jjg jjgVar, mw3 mw3Var8, lw3 lw3Var8, lw3 lw3Var9, sqi sqiVar, lw3 lw3Var10, ew3 ew3Var4, lw3 lw3Var11, Lazy lazy5, ew3 ew3Var5, ki kiVar, mw3 mw3Var9, nw3 nw3Var2, mw3 mw3Var10, kw3 kw3Var2, mw3 mw3Var11, lw3 lw3Var12, nw3 nw3Var3, nw3 nw3Var4, ow3 ow3Var, lw3 lw3Var13, ew3 ew3Var6, Lazy lazy6, mw3 mw3Var12, mw3 mw3Var13, mw3 mw3Var14, lw3 lw3Var14, b59 b59Var, zv3 zv3Var3, lw3 lw3Var15, hw3 hw3Var, hw3 hw3Var2, j4c j4cVar4, lw3 lw3Var16, j4c j4cVar5) {
        this.a = z7jVar;
        this.b = umiVar;
        this.c = wjhVar;
        this.d = gjmVar;
        this.e = x0fVar;
        this.f = context;
        this.g = nw3Var;
        this.h = wv1Var;
        this.i = kw3Var;
        this.j = mw3Var;
        this.k = j4cVar;
        this.l = j4cVar2;
        this.m = mw3Var2;
        this.n = zv3Var;
        this.o = mw3Var3;
        this.p = ew3Var;
        this.q = lw3Var;
        this.r = lazy;
        this.s = lazy2;
        this.t = lw3Var2;
        this.u = mw3Var4;
        this.v = lw3Var3;
        this.w = lazy3;
        this.x = mw3Var5;
        this.y = lw3Var4;
        this.z = mw3Var6;
        this.A = ew3Var2;
        this.B = mw3Var7;
        this.C = ew3Var3;
        this.D = j4cVar3;
        this.E = zv3Var2;
        this.F = lazy4;
        this.G = lw3Var6;
        this.H = lw3Var7;
        this.I = jjgVar;
        this.J = mw3Var8;
        this.K = lw3Var8;
        this.L = lw3Var9;
        this.M = sqiVar;
        this.N = lw3Var10;
        this.O = ew3Var4;
        this.P = lw3Var11;
        this.Q = lazy5;
        this.R = ew3Var5;
        this.S = kiVar;
        this.T = mw3Var9;
        this.U = nw3Var2;
        this.V = mw3Var10;
        this.W = kw3Var2;
        this.X = mw3Var11;
        this.Y = lw3Var12;
        this.Z = nw3Var3;
        this.a0 = nw3Var4;
        this.b0 = ow3Var;
        this.c0 = lw3Var13;
        this.d0 = ew3Var6;
        this.e0 = lazy6;
        this.f0 = mw3Var12;
        this.g0 = mw3Var13;
        this.h0 = mw3Var14;
        this.i0 = lw3Var14;
        this.j0 = b59Var;
        this.k0 = zv3Var3;
        this.l0 = lw3Var15;
        this.m0 = hw3Var;
        this.n0 = hw3Var2;
        this.o0 = j4cVar4;
        this.p0 = lw3Var16;
        this.q0 = j4cVar5;
    }

    @Override // defpackage.mkf
    public final l7n a(Class cls) {
        OperaApplication operaApplication = this.c0.b;
        z7j z7jVar = this.a;
        nw3 nw3Var = z7jVar.s;
        lw3 lw3Var = z7jVar.q;
        OperaApplication operaApplication2 = this.P.b;
        boolean zA = Intrinsics.a(cls, d3.class);
        nw3 nw3Var2 = this.a0;
        ew3 ew3Var = this.R;
        if (zA) {
            Context context = this.f;
            return new d3(r9n.t(context).versionName, hom.t(context), this.G.b.F(), this.H.b.G(), (b1o) this.I.get(), (orm) nw3Var2.get(), (d8j) ew3Var.get());
        }
        if (Intrinsics.a(cls, t9.class)) {
            return new t9((d8j) ew3Var.get(), operaApplication2.J(), (bxk) this.K.get());
        }
        boolean zA2 = Intrinsics.a(cls, dv1.class);
        ew3 ew3Var2 = this.C;
        Lazy lazy = this.Q;
        mw3 mw3Var = this.B;
        mw3 mw3Var2 = this.f0;
        if (zA2) {
            return new dv1((xln) mw3Var2.get(), (zwe) mw3Var.get(), (g8j) ew3Var.get(), operaApplication2.J(), (ev1) lazy.get(), (dxe) ew3Var2.get(), z7jVar.a());
        }
        if (Intrinsics.a(cls, ms1.class)) {
            return new ms1(operaApplication2.J());
        }
        boolean zA3 = Intrinsics.a(cls, at1.class);
        Lazy lazy2 = this.r;
        mw3 mw3Var3 = this.x;
        if (zA3) {
            return new at1(operaApplication2.J(), (g8j) ew3Var.get(), this.q, this.d, (z77) this.g0.get(), (yl6) lazy2.get(), (ru9) mw3Var3.get(), this.b, (it1) this.j0.get(), (orm) nw3Var2.get(), (ekc) this.l0.get(), (r2i) this.m0.get(), (e4i) this.n0.get());
        }
        if (Intrinsics.a(cls, yo3.class)) {
            SettingsManager settingsManagerJ = operaApplication2.J();
            return new yo3(settingsManagerJ, (d8j) ew3Var.get(), z7jVar.b(), (jt3) this.k0.get());
        }
        boolean zA4 = Intrinsics.a(cls, oy3.class);
        nw3 nw3Var3 = this.Z;
        Lazy lazy3 = this.s;
        if (zA4) {
            return new oy3((g8j) ew3Var.get(), operaApplication2.J(), (ru9) mw3Var3.get(), (orm) nw3Var2.get(), (skm) nw3Var3.get(), (ysj) this.h0.get(), (mm6) lazy3.get(), z7jVar.c(), (g0c) this.z.get());
        }
        if (Intrinsics.a(cls, e29.class)) {
            return new e29((v61) this.u.get(), operaApplication2.J(), (d8j) ew3Var.get());
        }
        if (Intrinsics.a(cls, iw9.class)) {
            return new iw9(operaApplication2.J(), (ev1) lazy.get(), (g8j) ew3Var.get(), (swf) this.F.get(), (po3) this.n.get());
        }
        if (Intrinsics.a(cls, eaa.class)) {
            return new eaa((orm) nw3Var2.get(), (g8j) ew3Var.get());
        }
        boolean zA5 = Intrinsics.a(cls, f.class);
        j4c j4cVar = this.D;
        if (zA5) {
            return new f((orm) nw3Var2.get(), (HistoryManager) this.y.get(), (tz1) this.E.get(), sgb.b((jg8) this.c.d), operaApplication2.J(), (yk6) j4cVar.get(), this.k, (bw3) this.l.get());
        }
        if (Intrinsics.a(cls, d3f.class)) {
            return new d3f(operaApplication2.J(), (d8j) ew3Var.get(), this.e, (k3i) this.o0.get());
        }
        boolean zA6 = Intrinsics.a(cls, lcg.class);
        mw3 mw3Var4 = this.V;
        if (zA6) {
            return new lcg((jt2) this.m.get(), (hxk) mw3Var4.get(), operaApplication2.J(), new kcg(lw3Var.b.J(), z7jVar.b.b.b(), (xb) z7jVar.c.b.get(), nw3Var.b.N(), (rs2) z7jVar.f.get()), (d8j) ew3Var.get());
        }
        boolean zA7 = Intrinsics.a(cls, hzg.class);
        kw3 kw3Var = this.W;
        kw3 kw3Var2 = this.i;
        mw3 mw3Var5 = this.o;
        mw3 mw3Var6 = this.T;
        mw3 mw3Var7 = this.X;
        mw3 mw3Var8 = this.j;
        ew3 ew3Var3 = this.d0;
        if (zA7) {
            return new hzg((ben) ew3Var3.get(), (rj) mw3Var8.get(), (syl) mw3Var7.get(), (qoj) mw3Var6.get(), operaApplication2.J(), (d8j) ew3Var.get(), operaApplication.R(), (xi5) mw3Var5.get(), kw3Var2, kw3Var, (wc7) this.t.get(), this.J);
        }
        if (Intrinsics.a(cls, qsi.class)) {
            return new qsi((g8j) ew3Var.get(), operaApplication2.J(), z7jVar.e());
        }
        if (Intrinsics.a(cls, qc2.class)) {
            return new qc2(operaApplication2.J(), (g8j) ew3Var.get(), new igi(lw3Var.b.J(), (yk6) z7jVar.d.get()));
        }
        if (Intrinsics.a(cls, gqi.class)) {
            return new gqi(cqp.e0(this.L.b), this.M, (pqi) this.N.get());
        }
        if (Intrinsics.a(cls, daj.class)) {
            return new daj((d8j) ew3Var.get(), (ben) ew3Var3.get(), (wc6) this.p.get(), (rj) mw3Var8.get(), (syl) mw3Var7.get(), (zwe) mw3Var.get(), operaApplication2.J(), (ru9) mw3Var3.get(), operaApplication.R(), (xi5) mw3Var5.get(), kw3Var2, kw3Var, (dxe) ew3Var2.get(), (yk6) j4cVar.get(), (mm6) lazy3.get(), (yl6) lazy2.get(), this.p0);
        }
        if (Intrinsics.a(cls, o9j.class)) {
            return new o9j(this.b, (a21) this.S.get(), (oji) this.O.get(), (orm) nw3Var2.get());
        }
        if (Intrinsics.a(cls, wzj.class)) {
            return new wzj(operaApplication2.J(), (g8j) ew3Var.get(), new w6j(lw3Var.b.J(), nw3Var.b.N()));
        }
        if (Intrinsics.a(cls, c8k.class)) {
            return new c8k(operaApplication2.J(), (d8j) ew3Var.get(), z7jVar.f(), (qln) this.e0.get(), (xln) mw3Var2.get(), (wre) this.A.get(), (orm) nw3Var2.get(), (skm) nw3Var3.get(), new mgh(operaApplication2.J(), (ru9) mw3Var3.get(), (byte) 4));
        }
        if (Intrinsics.a(cls, dyk.class)) {
            return new dyk(operaApplication2.J(), (d8j) ew3Var.get(), z7jVar.g(), this.g.b.b(), (xb) this.h.b.get(), (d7h) this.b0.get(), this.U.b.N(), (kxk) mw3Var4.get(), this.v.b.s(), (xc9) this.w.get(), (som) this.Y.get());
        }
        if (Intrinsics.a(cls, nj.class) || Intrinsics.a(cls, kj.class) || Intrinsics.a(cls, mj.class)) {
            return null;
        }
        if (!Intrinsics.a(cls, pk.class)) {
            if (Intrinsics.a(cls, frd.class)) {
                return new frd(operaApplication2.J(), (d8j) ew3Var.get(), (qoj) mw3Var6.get(), new j3i(this, (byte) 19), ipe.G());
            }
            return null;
        }
        SettingsManager settingsManagerJ2 = operaApplication2.J();
        d8j d8jVar = (d8j) ew3Var.get();
        ri3 ri3Var = (ri3) this.i0.get();
        a8j a8jVar = a8j.a;
        return new pk(settingsManagerJ2, d8jVar, ri3Var);
    }
}
