package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.PushedContentHandler;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class xv1 {
    public final j4c A;
    public final j4c A0;
    public final j4c B;
    public final j4c B0;
    public final j4c C;
    public final j4c C0;
    public final j4c D;
    public final j4c D0;
    public final j4c E;
    public final j4c E0;
    public final j4c F;
    public final j4c F0;
    public final j4c G;
    public final j4c G0;
    public final j4c H;
    public final j4c H0;
    public final j4c I;
    public final j4c I0;
    public final j4c J;
    public final j4c J0;
    public final j4c K;
    public final j4c K0;
    public final j4c L;
    public final j4c L0;
    public final j4c M;
    public final j4c M0;
    public final j4c N;
    public final j4c N0;
    public final j4c O;
    public final j4c O0;
    public final j4c P;
    public final j4c P0;
    public final j4c Q;
    public final j4c Q0;
    public final j4c R;
    public final j4c R0;
    public final j4c S;
    public final j4c S0;
    public final j4c T;
    public final j4c T0;
    public final j4c U;
    public final j4c U0;
    public final j4c V;
    public final j4c V0;
    public final j4c W;
    public final j4c W0;
    public final j4c X;
    public final j4c X0;
    public final j4c Y;
    public final j4c Y0;
    public final j4c Z;
    public final j4c Z0;
    public final OperaApplication a;
    public final qv1 a0;
    public final j4c a1;
    public final j4c b;
    public final j4c b0;
    public final j4c b1;
    public final j4c c;
    public final j4c c0;
    public final j4c c1;
    public final j4c d;
    public final j4c d0;
    public final j4c d1;
    public final j4c e;
    public final j4c e0;
    public final j4c e1;
    public final g92 f;
    public final j4c f0;
    public final j4c f1;
    public final j4c g;
    public final j4c g0;
    public final j4c g1;
    public final j4c h;
    public final j4c h0;
    public final j4c h1;
    public final j4c i;
    public final j4c i0;
    public final j4c i1;
    public final j4c j;
    public final j4c j0;
    public final j4c j1;
    public final j4c k;
    public final j4c k0;
    public final j4c k1;
    public final j4c l;
    public final j4c l0;
    public final j4c l1;
    public final j4c m;
    public final j4c m0;
    public final j4c m1;
    public final j4c n;
    public final j4c n0;
    public final j4c n1;
    public final j4c o;
    public final j4c o0;
    public final j4c o1;
    public final j4c p;
    public final j4c p0;
    public final j4c p1;
    public final j4c q;
    public final j4c q0;
    public final j4c q1;
    public final j4c r;
    public final j4c r0;
    public final j4c r1;
    public final j4c s;
    public final j4c s0;
    public final j4c s1;
    public final j4c t;
    public final j4c t0;
    public final j4c u;
    public final j4c u0;
    public final j4c v;
    public final j4c v0;
    public final j4c w;
    public final j4c w0;
    public final t1 x;
    public final j4c x0;
    public final j4c y;
    public final j4c y0;
    public final j4c z;
    public final j4c z0;

    public xv1(OperaApplication operaApplication) {
        this.a = operaApplication;
        final byte b = 0;
        final byte b2 = 1;
        this.b = new j4c(new hv1(this, b), (byte) 1);
        final byte b3 = 19;
        this.c = new j4c(new nv1(this, b3), (byte) 1);
        this.d = new j4c(new qv1(this, b), (byte) 1);
        final byte b4 = 12;
        j4c j4cVar = new j4c(new qv1(this, b4), (byte) 1);
        this.e = j4cVar;
        final byte b5 = 23;
        this.f = new g92(j4cVar, new k51(b5));
        this.g = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b6 = b2;
                byte b7 = 1;
                byte b8 = 0;
                xv1 xv1Var = this.b;
                switch (b6) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b8), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b7), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b8), new iv1(xv1Var, b7));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.h = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b6 = b4;
                byte b7 = 1;
                byte b8 = 0;
                xv1 xv1Var = this.b;
                switch (b6) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b8), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b7), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b8), new iv1(xv1Var, b7));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.i = new j4c(new uu1(b5), (byte) 1);
        final byte b6 = 10;
        this.j = new j4c(new hv1(this, b6), (byte) 1);
        this.k = new j4c(new hv1(this, b5), (byte) 1);
        final byte b7 = 22;
        this.l = new j4c(new hv1(this, b7), (byte) 1);
        byte b8 = 13;
        this.m = new j4c(new uu1(b8), (byte) 1);
        this.n = new j4c(new nv1(this, b4), (byte) 1);
        this.o = new j4c(new nv1(this, b8), (byte) 1);
        final byte b9 = 14;
        this.p = new j4c(new uu1(b9), (byte) 1);
        this.q = new j4c(new nv1(this, b9), (byte) 1);
        final byte b10 = 15;
        this.r = new j4c(new nv1(this, b10), (byte) 1);
        this.s = new j4c(new nv1(this, (byte) 16), (byte) 1);
        final byte b11 = 18;
        this.t = new j4c(new nv1(this, b11), (byte) 1);
        this.u = new j4c(new uu1(b10), (byte) 1);
        final byte b12 = 20;
        this.v = new j4c(new nv1(this, b12), (byte) 1);
        final byte b13 = 21;
        this.w = new j4c(new nv1(this, b13), (byte) 1);
        nx1 nx1Var = i0i.a;
        this.x = new t1(operaApplication, b8);
        this.y = new j4c(new nv1(this, b7), (byte) 1);
        this.z = new j4c(new nv1(this, b5), (byte) 1);
        this.A = new j4c(new nv1(this, (byte) 24), (byte) 1);
        this.B = new j4c(new nv1(this, (byte) 25), (byte) 1);
        this.C = new j4c(new nv1(this, (byte) 26), (byte) 1);
        this.D = new j4c(new nv1(this, (byte) 27), (byte) 1);
        this.E = new j4c(new nv1(this, (byte) 28), (byte) 1);
        this.F = new j4c(new nv1(this, (byte) 29), (byte) 1);
        this.G = new j4c(new qv1(this, b2), (byte) 1);
        this.H = new j4c(new qv1(this, (byte) 2), (byte) 1);
        this.I = new j4c(new qv1(this, (byte) 3), (byte) 1);
        final byte b14 = 4;
        this.J = new j4c(new qv1(this, b14), (byte) 1);
        this.K = new j4c(new qv1(this, (byte) 5), (byte) 1);
        this.L = new j4c(new qv1(this, (byte) 6), (byte) 1);
        this.M = new j4c(new qv1(this, (byte) 8), (byte) 1);
        this.N = new j4c(new qv1(this, (byte) 9), (byte) 1);
        this.O = new j4c(new qv1(this, b6), (byte) 1);
        this.P = new j4c(new qv1(this, (byte) 11), (byte) 1);
        this.Q = new j4c(new qv1(this, b8), (byte) 1);
        final byte b15 = 17;
        this.R = new j4c(new uu1(b15), (byte) 1);
        this.S = new j4c(new qv1(this, b9), (byte) 1);
        this.T = new j4c(new qv1(this, b10), (byte) 1);
        this.U = new j4c(new uu1(b11), (byte) 1);
        this.V = new j4c(new qv1(this, b15), (byte) 1);
        this.W = new j4c(new qv1(this, b11), (byte) 1);
        this.X = new j4c(new qv1(this, b3), (byte) 1);
        this.Y = new j4c(new uu1(b3), (byte) 1);
        this.Z = new j4c(new qv1(this, b12), (byte) 1);
        this.a0 = new qv1(this, b13);
        this.b0 = new j4c(new qv1(this, b7), (byte) 1);
        this.c0 = new j4c(new qv1(this, b5), (byte) 1);
        this.d0 = new j4c(new qv1(this, (byte) 24), (byte) 1);
        this.e0 = new j4c(new qv1(this, (byte) 26), (byte) 1);
        this.f0 = new j4c(new qv1(this, (byte) 27), (byte) 1);
        this.g0 = new j4c(new uu1(b12), (byte) 1);
        this.h0 = new j4c(new qv1(this, (byte) 28), (byte) 1);
        this.i0 = new j4c(new qv1(this, (byte) 29), (byte) 1);
        this.j0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        final byte b16 = 2;
        this.k0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b16;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        final byte b17 = 3;
        this.l0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b17;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.m0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b14;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        final byte b18 = 5;
        this.n0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b18;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        final byte b19 = 6;
        this.o0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b19;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        final byte b20 = 7;
        this.p0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b20;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        final byte b21 = 8;
        this.q0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b21;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        final byte b22 = 9;
        this.r0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b22;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.s0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b6;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        final byte b23 = 11;
        this.t0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b23;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.u0 = new j4c(new uu1(b7), (byte) 1);
        final byte b24 = 13;
        this.v0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b24;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.w0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b10;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        final byte b25 = 16;
        this.x0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b25;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.y0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b15;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.z0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b11;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.A0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b3;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.B0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b12;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.C0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b13;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.D0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b7;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.E0 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b5;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.F0 = new j4c(new hv1(this, b2), (byte) 1);
        this.G0 = new j4c(new hv1(this, (byte) 2), (byte) 1);
        this.H0 = new j4c(new hv1(this, (byte) 3), (byte) 1);
        this.I0 = new j4c(new hv1(this, b14), (byte) 1);
        this.J0 = new j4c(new hv1(this, (byte) 5), (byte) 1);
        this.K0 = new j4c(new hv1(this, (byte) 6), (byte) 1);
        this.L0 = new j4c(new hv1(this, b20), (byte) 1);
        this.M0 = new j4c(new hv1(this, (byte) 8), (byte) 1);
        this.N0 = new j4c(new hv1(this, (byte) 9), (byte) 1);
        this.O0 = new j4c(new hv1(this, (byte) 12), (byte) 1);
        this.P0 = new j4c(new hv1(this, (byte) 13), (byte) 1);
        this.Q0 = new j4c(new hv1(this, b9), (byte) 1);
        this.R0 = new j4c(new hv1(this, b10), (byte) 1);
        this.S0 = new j4c(new hv1(this, (byte) 16), (byte) 1);
        this.T0 = new j4c(new hv1(this, b15), (byte) 1);
        this.U0 = new j4c(new hv1(this, b11), (byte) 1);
        this.V0 = new j4c(new hv1(this, b3), (byte) 1);
        this.W0 = new j4c(new hv1(this, b12), (byte) 1);
        this.X0 = new j4c(new hv1(this, b13), (byte) 1);
        this.Y0 = new j4c(new nv1(this, (byte) 8), (byte) 1);
        this.Z0 = new j4c(new nv1(this, b15), (byte) 1);
        byte b26 = 16;
        this.a1 = new j4c(new uu1(b26), (byte) 1);
        this.b1 = new j4c(new qv1(this, b20), (byte) 1);
        this.c1 = new j4c(new qv1(this, b26), (byte) 1);
        this.d1 = new j4c(new qv1(this, (byte) 25), (byte) 1);
        this.e1 = new j4c(new uu1(b13), (byte) 1);
        this.f1 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b9;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        final byte b27 = 24;
        this.g1 = new j4c(new esk(this) { // from class: rv1
            public final /* synthetic */ xv1 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b62 = b27;
                byte b72 = 1;
                byte b82 = 0;
                xv1 xv1Var = this.b;
                switch (b62) {
                    case 0:
                        SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                        ite iteVar = hte.k;
                        return new dse(settingsManager, na2.w(xv1Var.a));
                    case 1:
                        OperaApplication operaApplication2 = xv1Var.a;
                        umi umiVar = vml.d;
                        SettingsManager settingsManagerJ = operaApplication2.J();
                        kv0 kv0Var = mv0.k;
                        return new yk6(operaApplication2, umiVar, settingsManagerJ, no7.n(operaApplication2, mv0.l, mv0.n), dj9.t(operaApplication2), operaApplication2.c(), ru9.c(operaApplication2), operaApplication2.L().c, operaApplication2.L().d);
                    case 2:
                        OperaApplication operaApplication3 = xv1Var.a;
                        return new fue(operaApplication3, operaApplication3.y(), operaApplication3.J());
                    case 3:
                        return new x0f(xv1Var.a, vml.d);
                    case 4:
                        OperaApplication operaApplication4 = xv1Var.a;
                        return new ldf(operaApplication4, vml.d, operaApplication4.L().d, operaApplication4.L().g);
                    case 5:
                        nx5 nx5Var = (nx5) xv1Var.i.get();
                        OperaApplication operaApplication5 = xv1Var.a;
                        return new sdf(nx5Var, operaApplication5.J(), (udf) xv1Var.o0.get(), ((lpe) xv1Var.i0.get()).k, operaApplication5.h());
                    case 6:
                        return new udf(xv1Var.a, vml.d);
                    case 7:
                        return new zgf(vml.d, xv1Var.s);
                    case 8:
                        return new n6g(xv1Var.a);
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        OperaApplication operaApplication6 = xv1Var.a;
                        return new vbg(operaApplication6, vml.d, operaApplication6.L().c, operaApplication6.L().d);
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        return new ohg(xv1Var.a);
                    case 11:
                        OperaApplication operaApplication7 = xv1Var.a;
                        return new jtg(operaApplication7, vml.d, tvg.t(operaApplication7), ufn.t(operaApplication7), xv1Var.s1);
                    case 12:
                        return new vk6(xv1Var.a, vml.d);
                    case 13:
                        return new gmk((slk) xv1Var.Y0.get());
                    case 14:
                        return new n7l(xv1Var.a, vml.d);
                    case 15:
                        OperaApplication operaApplication8 = xv1Var.a;
                        umi umiVar2 = vml.d;
                        SettingsManager settingsManagerJ2 = operaApplication8.J();
                        vwn vwnVar = (vwn) operaApplication8.r.n1.get();
                        operaApplication8.o();
                        return new PushedContentHandler(operaApplication8, umiVar2, settingsManagerJ2, vwnVar, (lpe) operaApplication8.A.get(), operaApplication8.L().c, operaApplication8.L().d);
                    case 16:
                        return new pch((udf) xv1Var.o0.get());
                    case 17:
                        vqi vqiVar = (vqi) xv1Var.N0.get();
                        SettingsManager settingsManager2 = (SettingsManager) xv1Var.P0.get();
                        pdh pdhVar = new pdh((pqi) xv1Var.K0.get(), (ndh) xv1Var.z0.get());
                        OperaApplication operaApplication9 = xv1Var.a;
                        return new mdh(vqiVar, settingsManager2, pdhVar, (cul) operaApplication9.r.g1.get(), ((qdh) xv1Var.A0.get()).b, operaApplication9.L().d, ((lpe) xv1Var.i0.get()).c, new nv1(xv1Var, b82), v1.u(operaApplication9));
                    case SizeUtil.textSize0_1 /* 18 */:
                        return new odh(xv1Var.a, vml.d);
                    case 19:
                        return new qdh(xne.b, new ghf(xv1Var.f.get(), (Object) new uu1(b72), (Object) new hv1(xv1Var, (byte) 24), (byte) 8));
                    case SizeUtil.textSize0 /* 20 */:
                        return new glh(xv1Var.a, vml.d, (syd) xv1Var.D0.get());
                    case 21:
                        OperaApplication operaApplication10 = xv1Var.a;
                        return new olh(operaApplication10.H(), operaApplication10.J(), vml.d);
                    case SizeUtil.textSize1 /* 22 */:
                        OperaApplication operaApplication11 = xv1Var.a;
                        return new syd(operaApplication11, vml.d, operaApplication11.J());
                    case 23:
                        return new k3i(new iv1(xv1Var, b82), new iv1(xv1Var, b72));
                    default:
                        return new cul(xv1Var.a, vml.d);
                }
            }
        }, (byte) 1);
        this.h1 = new j4c(new hv1(this, (byte) 11), (byte) 1);
        this.i1 = new j4c(new hv1(this, (byte) 29), (byte) 1);
        this.j1 = new j4c(new jv1(this, (byte) 5), (byte) 1);
        this.k1 = new j4c(new jv1(this, (byte) 13), (byte) 1);
        this.l1 = new j4c(new jv1(this, b3), (byte) 1);
        this.m1 = new j4c(new jv1(this, (byte) 26), (byte) 1);
        this.n1 = new j4c(new nv1(this, b14), (byte) 1);
        this.o1 = new j4c(new nv1(this, (byte) 6), (byte) 1);
        this.p1 = new j4c(new nv1(this, b20), (byte) 1);
        this.q1 = new j4c(new nv1(this, (byte) 9), (byte) 1);
        this.r1 = new j4c(new nv1(this, b6), (byte) 1);
        this.s1 = new j4c(new nv1(this, (byte) 11), (byte) 1);
    }
}
