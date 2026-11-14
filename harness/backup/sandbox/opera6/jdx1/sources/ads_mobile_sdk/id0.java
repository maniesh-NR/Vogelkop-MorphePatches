package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import defpackage.a26;
import defpackage.aib;
import defpackage.dbh;
import defpackage.eop;
import defpackage.hlo;
import defpackage.jso;
import defpackage.kyo;
import defpackage.l1b;
import defpackage.prb;
import defpackage.qyn;
import defpackage.rnp;
import defpackage.scd;
import defpackage.t3p;
import defpackage.tso;
import defpackage.uie;
import defpackage.xf8;
import defpackage.yko;
import defpackage.z1m;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class id0 implements eop {
    public final tso A;
    public final tso A0;
    public final a3 B;
    public final tso B0;
    public final tso C;
    public final tso C0;
    public final am D;
    public final tso D0;
    public final m E;
    public final tso E0;
    public final tso F;
    public final tso F0;
    public final am G;
    public final tso G0;
    public final ah0 H;
    public final tso H0;
    public final fs I;
    public final tso I0;
    public final tso J;
    public final tso J0;
    public final fp2 K;
    public final tso K0;
    public final ob1 L;
    public final tso L0;
    public final b M;
    public final tso M0;
    public final tso N;
    public final tso O;
    public final b P;
    public final ej Q;
    public final tso Q0;
    public final hf R;
    public final ah0 S;
    public final tso S0;
    public final da T;
    public final tso T0;
    public final hf U;
    public final tso U0;
    public final hf V;
    public final tso V0;
    public final mw W;
    public final tso W0;
    public final b X;
    public final tso X0;
    public final ej Y;
    public final tso Y0;
    public final ek3 Z;
    public final tso Z0;
    public final a2 a;
    public final mw a0;
    public final tso a1;
    public final sb0 b;
    public final m b0;
    public final tso b1;
    public final tso c = new nj0(xf8.s);
    public final xl c0;
    public final tso c1;
    public final ob1 d;
    public final cx0 d0;
    public final tso d1;
    public final ob1 e;
    public final tso e0;
    public final tso e1;
    public final n90 f;
    public final tso f0;
    public final tso f1;
    public final n90 g;
    public final o8 g0;
    public final tso g1;
    public final n90 h;
    public final fn1 h0;
    public final tso h1;
    public final tso i;
    public final m i0;
    public final tso i1;
    public final ob1 j;
    public final tso j0;
    public final tso j1;
    public final n90 k;
    public final ob1 k0;
    public final tso k1;
    public final tso l;
    public final tso l0;
    public final tso l1;
    public final ob1 m;
    public final da m0;
    public final tso m1;
    public final ah0 n;
    public final n90 n0;
    public final tso n1;
    public final da o;
    public final ob1 o0;
    public final tso p;
    public final ob1 p0;
    public final ej q;
    public final tso q0;
    public final tso r;
    public final tso r0;
    public final ob1 s;
    public final mw s0;
    public final ob1 t;
    public final b23 t0;
    public final ob1 u;
    public final tso u0;
    public final ob1 v;
    public final ob1 v0;
    public final tso w;
    public final az1 w0;
    public final ob1 x;
    public final tso x0;
    public final tso y;
    public final tso y0;
    public final tso z;
    public final tso z0;

    public id0(sb0 sb0Var, defpackage.r83 r83Var, av2 av2Var, Integer num, a2 a2Var, xv xvVar, n13 n13Var, eq2 eq2Var, ih1 ih1Var, dt2 dt2Var, s8 s8Var, ve2 ve2Var, v31 v31Var, kyo kyoVar, it1 it1Var, PerAdNativeJavscriptEngineJsContext perAdNativeJavscriptEngineJsContext, q70 q70Var, prb prbVar, uie uieVar, cy0 cy0Var, cy0 cy0Var2) {
        this.b = sb0Var;
        this.a = a2Var;
        this.d = ob1.a(a2Var);
        this.e = ob1.a(xvVar);
        this.f = new n90(ob1.a(eq2Var));
        this.g = new n90(ob1.a(ih1Var));
        this.h = new n90(ob1.a(dt2Var));
        this.i = new nj0(new bt(this.f, this.g, this.h, new n90(ob1.a(s8Var)), (byte) 7, false));
        ob1 ob1VarA = ob1.a(cy0Var2);
        this.j = ob1VarA;
        n90 n90Var = new n90(ob1VarA);
        this.k = n90Var;
        byte b = 8;
        this.l = new nj0(new p3(sb0Var.B4, n90Var, sb0Var.x, b));
        ob1 ob1Var = jso.a;
        this.m = ob1Var;
        ah0 ah0Var = new ah0();
        this.n = ah0Var;
        this.o = new da(ah0Var, (byte) 2);
        ob1 ob1Var2 = fn1.b;
        byte b2 = 1;
        LinkedHashMap linkedHashMapC = dbh.c(1);
        da daVar = this.o;
        if (daVar == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC.put("AdEventListener", daVar);
        fn1 fn1Var = new fn1(linkedHashMapC);
        ah0 ah0Var2 = sb0Var.u;
        nj0 nj0Var = new nj0(new nt2(sb0Var.B4, sb0Var.x, ah0Var2, this.l, this.m, sb0Var.E, new nj0(new s3(ah0Var2, fn1Var, (byte) 2))));
        this.p = nj0Var;
        byte b3 = 3;
        this.q = new ej(new nj0(new za3(nj0Var, b3)), b);
        this.r = new nj0(aib.o);
        this.s = ob1.a(prbVar);
        this.t = ob1.a(it1Var);
        this.u = ob1.a(uieVar);
        this.v = ob1.a(kyoVar);
        this.w = new nj0(fsp.j);
        ob1 ob1VarA2 = ob1.a(av2Var);
        this.x = ob1VarA2;
        tso tsoVar = sb0Var.z;
        ob1 ob1Var3 = this.d;
        tso tsoVar2 = sb0Var.R;
        tso tsoVar3 = sb0Var.I;
        tso tsoVar4 = sb0Var.t;
        nj0 nj0Var2 = new nj0(new g8(tsoVar, ob1Var3, tsoVar2, tsoVar3, ob1VarA2, tsoVar4));
        this.y = nj0Var2;
        tso tsoVar5 = sb0Var.w;
        ah0 ah0Var3 = sb0Var.u;
        this.z = new nj0(new be2(tsoVar5, ah0Var3, this.s, ob1Var3, sb0Var.O, this.t, tsoVar4, nj0Var2));
        this.A = new nj0(new hk(ah0Var3, tsoVar4, this.i, sb0Var.G, (byte) 3));
        byte b4 = 4;
        this.B = new a3(ob1Var3, this.e, sb0Var.b4, b4);
        nj0 nj0Var3 = new nj0(new ej(this.v, (byte) 12));
        this.C = nj0Var3;
        this.D = new am(ob1Var3, (tso) nj0Var3, (byte) 27);
        ob1 ob1Var4 = fn1.b;
        LinkedHashMap linkedHashMapC2 = dbh.c(1);
        am amVar = this.D;
        if (amVar == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC2.put("/sendMessageToSdk", amVar);
        this.E = new m(new fn1(linkedHashMapC2), (byte) 13);
        LinkedHashMap linkedHashMapC3 = dbh.c(1);
        m mVar = this.E;
        if (mVar == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC3.put("GmsgHandlerInstaller", mVar);
        this.F = new nj0(new a3(sb0Var.G, sb0Var.d0, new m(new fn1(linkedHashMapC3), (byte) 18), b2));
        ob1 ob1Var5 = this.d;
        this.G = new am(ob1Var5, this.C, (byte) 19);
        ah0 ah0Var4 = new ah0();
        this.H = ah0Var4;
        this.I = new fs(ob1Var5, ah0Var4, b4);
        nj0 nj0Var4 = new nj0(qyn.i);
        this.J = nj0Var4;
        this.K = new fp2(sb0Var.f, sb0Var.x, sb0Var.w, sb0Var.u, sb0Var.t, sb0Var.F, sb0Var.z, this.m, this.x, ob1Var5, sb0Var.E, this.n, this.z, sb0Var.R, nj0Var4);
        this.L = ob1.a(q70Var);
        this.M = new b(new nj0(new da(this.n, (byte) 14)), (byte) 8);
        this.N = new nj0(new el((tso) this.B, this.w, sb0Var.l0, sb0Var.v0, sb0Var.t, sb0Var.F, (byte) 0));
        sb0 sb0Var2 = this.b;
        nj0 nj0Var5 = new nj0(new et(sb0Var2.S, this.n, this.N, sb0Var2.C4, this.d, (byte) 0));
        this.O = nj0Var5;
        this.P = new b(nj0Var5, (byte) 19);
        this.Q = new ej(sb0Var2.s4, (byte) 22);
        byte b5 = 7;
        this.R = new hf(sb0Var2.O2, b5);
        ah0 ah0Var5 = new ah0();
        this.S = ah0Var5;
        this.T = new da(ah0Var5, (byte) 9);
        this.U = new hf(sb0Var2.h0, (byte) 18);
        this.V = new hf(sb0Var2.r4, (byte) 25);
        this.W = new mw(sb0Var2.q4, (byte) 6);
        this.X = new b(sb0Var2.e1, (byte) 27);
        this.Y = new ej(sb0Var2.c1, b5);
        this.Z = new ek3((byte) 0);
        this.a0 = new mw(new nj0(new b(this.J, (byte) 11)), (byte) 19);
        ob1 ob1Var6 = fn1.b;
        e7 e7Var = new e7(12);
        e7Var.a("/appEvent", this.M);
        e7Var.a("/click", this.P);
        e7Var.a("/delayPageLoaded", this.Q);
        e7Var.a("/httpTrack", this.R);
        e7Var.a("/open", this.T);
        e7Var.a("/result", this.U);
        e7Var.a("/video", this.V);
        e7Var.a("/videoMeta", this.W);
        e7Var.a("/close", this.X);
        e7Var.a("/customClose", this.Y);
        e7Var.a("/delayPageClosed", this.Z);
        e7Var.a("/backButton", this.a0);
        this.b0 = new m(new fn1((LinkedHashMap) e7Var.a), (byte) 1);
        LinkedHashMap linkedHashMapC4 = dbh.c(3);
        m mVar2 = this.b0;
        if (mVar2 == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC4.put("GmsgHandlerInstaller", mVar2);
        linkedHashMapC4.put("SetFollowUrls", yi4.T);
        linkedHashMapC4.put("SetExpanded", a26.n);
        m mVar3 = new m(new fn1(linkedHashMapC4), (byte) 8);
        ob1 ob1Var7 = sb0Var2.f;
        tso tsoVar6 = sb0Var2.x;
        tso tsoVar7 = sb0Var2.w;
        ah0 ah0Var6 = sb0Var2.u;
        tso tsoVar8 = sb0Var2.t;
        ah0 ah0Var7 = sb0Var2.F;
        tso tsoVar9 = sb0Var2.z;
        ob1 ob1Var8 = this.x;
        ob1 ob1Var9 = this.d;
        tso tsoVar10 = sb0Var2.E;
        ah0 ah0Var8 = this.n;
        tso tsoVar11 = this.z;
        tso tsoVar12 = sb0Var2.R;
        ob1 ob1Var10 = this.L;
        tso tsoVar13 = this.i;
        tso tsoVar14 = sb0Var2.d0;
        tso tsoVar15 = this.J;
        tso tsoVar16 = sb0Var2.G;
        this.c0 = new xl(ob1Var7, tsoVar6, tsoVar7, ah0Var6, tsoVar8, ah0Var7, tsoVar9, ob1Var8, ob1Var9, tsoVar10, ah0Var8, tsoVar11, tsoVar12, ob1Var10, tsoVar13, tsoVar14, mVar3, tsoVar15, tsoVar16);
        ob1 ob1Var11 = this.e;
        this.d0 = new cx0(ob1Var9, ob1Var11, sb0Var2.A1, sb0Var2.Y2, tsoVar8, (byte) 1);
        this.e0 = new nj0(new xs(ob1Var9, sb0Var2.h, ob1Var11, ah0Var6, tsoVar16));
        tso tsoVarA = h93.a(new am(ob1Var7, tsoVar8, (byte) 24));
        this.f0 = tsoVarA;
        ah0.a(this.S, new nj0(new e91(sb0Var2.f, sb0Var2.t, sb0Var2.R, sb0Var2.S, this.n, sb0Var2.E, this.K, this.c0, this.p, this.N, this.x, sb0Var2.S1, sb0Var2.C4, this.d, this.y, this.d0, this.e0, tsoVarA, sb0Var2.F, this.e)));
        this.g0 = new o8(this.S, (byte) 13);
        LinkedHashMap linkedHashMapC5 = dbh.c(3);
        am amVar2 = this.G;
        if (amVar2 == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC5.put("/sendMessageToSdk", amVar2);
        fs fsVar = this.I;
        if (fsVar == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC5.put("/hideValidatorOverlay", fsVar);
        o8 o8Var = this.g0;
        if (o8Var == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC5.put("/open", o8Var);
        this.h0 = new fn1(linkedHashMapC5);
        sb0 sb0Var3 = this.b;
        this.i0 = new m(this.h0, (byte) 6);
        ob1 ob1Var12 = fn1.b;
        LinkedHashMap linkedHashMapC6 = dbh.c(1);
        m mVar4 = this.i0;
        if (mVar4 == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC6.put("GmsgHandlerInstaller", mVar4);
        this.j0 = new nj0(new a3(sb0Var3.G, sb0Var3.d0, new m(new fn1(linkedHashMapC6), (byte) 9), b3));
        ob1 ob1VarA3 = ob1.a(ve2Var);
        this.k0 = ob1VarA3;
        ob1 ob1Var13 = this.s;
        tso tsoVar17 = sb0Var3.x;
        nj0 nj0Var6 = new nj0(new rp0(ob1Var13, tsoVar17, sb0Var3.u, sb0Var3.S, this.t, sb0Var3.m1, this.u, sb0Var3.G, this.i, sb0Var3.h, this.v, this.w, this.z, this.A, this.B, this.n, this.F, this.j0, this.x, this.d, sb0Var3.d, sb0Var3.t, this.y, sb0Var3.F, ob1VarA3));
        this.l0 = nj0Var6;
        ah0.a(this.H, new nj0(new p3(tsoVar17, this.r, nj0Var6, (byte) 9)));
        byte b6 = 15;
        this.m0 = new da(this.H, b6);
        this.n0 = new n90(ob1.a(cy0Var));
        this.o0 = ob1.a(n13Var);
        this.p0 = ob1.a(num);
        this.q0 = new nj0(scd.s);
        this.r0 = new nj0(new e6(this.x, b6));
        this.s0 = new mw(new n90(this.u), (byte) 8);
        int i = b23.c;
        List listF = dbh.f(1);
        List listF2 = dbh.f(1);
        listF.add(this.r0);
        listF2.add(this.s0);
        this.t0 = new b23(listF, listF2);
        this.u0 = new nj0(new mi3(sb0Var3.G, sb0Var3.R3, sb0Var3.S, this.B, this.n0, this.o0, this.d, this.i, this.p0, sb0Var3.h, this.q0, sb0Var3.C4, this.k0, this.n, sb0Var3.f2, this.t0, sb0Var3.t, ob1.a(v31Var)));
        ob1 ob1VarA4 = ob1.a(r83Var);
        this.v0 = ob1VarA4;
        tso tsoVar18 = sb0Var3.P3;
        ob1 ob1Var14 = this.x;
        this.w0 = new az1(tsoVar18, ob1VarA4, (tso) ob1Var14, (byte) 10);
        this.x0 = new nj0(new am(sb0Var3.r3, ob1VarA4, (byte) 12));
        ob1 ob1Var15 = sb0Var3.f;
        ob1 ob1Var16 = this.d;
        tso tsoVar19 = sb0Var3.D4;
        tso tsoVar20 = sb0Var3.t;
        tso tsoVar21 = sb0Var3.G;
        tso tsoVar22 = this.f0;
        ah0 ah0Var9 = sb0Var3.F;
        ah0 ah0Var10 = sb0Var3.u;
        this.y0 = new nj0(new ef2(ob1Var15, ob1Var16, tsoVar19, tsoVar20, tsoVar21, tsoVar22, ah0Var9, ah0Var10, sb0Var3.E));
        this.z0 = new nj0(new p3(sb0Var3.a0, ob1Var14, sb0Var3.b0, (byte) 0));
        this.A0 = new nj0(new gh2(sb0Var3.P0, ah0Var10, ob1Var14, tsoVar20, tsoVar21, (byte) 0));
        ob1 ob1Var17 = this.o0;
        sb0 sb0Var4 = this.b;
        this.B0 = new nj0(new kx1(ob1Var17, sb0Var4.z0, sb0Var4.c4, this.v0, this.x, ob1Var, sb0Var4.s, sb0Var4.F));
        this.C0 = new nj0(new e6(this.v, (byte) 9));
        this.D0 = new nj0(new ej(this.F, (byte) 1));
        this.E0 = new nj0(new am(this.j, this.z, (byte) 17));
        ob1 ob1Var18 = fn1.b;
        e7 e7Var2 = new e7(16);
        e7Var2.a("MraidAdEventListener", this.q);
        e7Var2.a("hideValidatorOverlayGmsgHandlerAsAdEventListener", this.m0);
        e7Var2.a("TrackingPingMonitorAsAdEventListener", this.u0);
        e7Var2.a("DelegatingAdEventListener", this.A);
        e7Var2.a("RequestThrottlerV2AdMonitor", this.w0);
        e7Var2.a("AdStatsTrackerListener", this.x0);
        e7Var2.a("CustomTabsConnectionInitializationTask", sb0Var4.T1);
        e7Var2.a("PlayPrewarmListener", this.y0);
        e7Var2.a("AdLifecycleTrackerListener", this.z0);
        e7Var2.a("PreloadAdCloseListener", this.A0);
        e7Var2.a("PersistentCacheAdMonitor", this.B0);
        e7Var2.a("NativeJavascriptEngineLifeCycleMonitor", this.C0);
        e7Var2.a("NativeOnePointFiveOverlayMonitor", this.D0);
        e7Var2.a("SafeBrowsingLifecycleMonitor", this.y);
        e7Var2.a("OmidMonitorAsAdEventListener", this.z);
        e7Var2.a("WebViewLifecycleMonitor", this.E0);
        ah0.a(this.n, new nj0(new a3(sb0Var4.u, new fn1((LinkedHashMap) e7Var2.a), this.d, (byte) 0)));
        ob1 ob1Var19 = this.t;
        nj0 nj0Var7 = new nj0(new vh(ob1Var19, (byte) 21));
        this.F0 = nj0Var7;
        tso tsoVar23 = sb0Var4.x;
        ah0 ah0Var11 = sb0Var4.u;
        tso tsoVar24 = sb0Var4.t;
        tso tsoVar25 = sb0Var4.y1;
        ob1 ob1Var20 = this.v0;
        this.G0 = new nj0(new be2(tsoVar23, ah0Var11, ob1Var19, tsoVar24, nj0Var7, tsoVar25, ob1Var20, this.s, (byte) 3));
        this.H0 = new nj0(new cn0(ob1Var20, sb0Var4.u0, this.d, ah0Var11));
        this.I0 = new nj0(new o8(this.l0, (byte) 2));
        LinkedHashMap linkedHashMapC7 = dbh.c(2);
        tso tsoVar26 = this.H0;
        if (tsoVar26 == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC7.put("FirebaseAnalyticsAdEventListener", tsoVar26);
        tso tsoVar27 = this.I0;
        if (tsoVar27 == null) {
            t3p.q("provider");
            throw null;
        }
        this.J0 = new nj0(new aa(sb0Var4.x, z1m.i(linkedHashMapC7, "NativeAdViewVisibilityChangedEventListener", tsoVar27, linkedHashMapC7), (byte) 2));
        this.K0 = new nj0(new az1(sb0Var4.t, this.l0, this.x, (byte) 0));
        LinkedHashMap linkedHashMapC8 = dbh.c(1);
        tso tsoVar28 = this.K0;
        if (tsoVar28 == null) {
            t3p.q("provider");
            throw null;
        }
        this.L0 = new nj0(new aa(sb0Var4.x, z1m.i(linkedHashMapC8, "NativeMediaViewFullyVisibleEventListener", tsoVar28, linkedHashMapC8), (byte) 4));
        LinkedHashMap linkedHashMapC9 = dbh.c(2);
        tso tsoVar29 = this.J0;
        if (tsoVar29 == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC9.put("AdVisibilityChangedEventEmitter", tsoVar29);
        tso tsoVar30 = this.L0;
        if (tsoVar30 == null) {
            t3p.q("provider");
            throw null;
        }
        fn1 fn1VarI = z1m.i(linkedHashMapC9, "MediaViewFullyVisibleEventEmitter", tsoVar30, linkedHashMapC9);
        tso tsoVar31 = sb0Var4.x;
        this.M0 = new nj0(new p3(new nj0(new be2(sb0Var4.f, tsoVar31, new nj0(new aa(tsoVar31, fn1VarI, (byte) 0)), sb0Var4.V1, sb0Var4.h, sb0Var4.t, sb0Var4.E, this.d)), this.I0, this.K0, (byte) 12));
        n90 n90Var2 = new n90(ob1.a(perAdNativeJavscriptEngineJsContext));
        ob1 ob1Var21 = sb0Var4.f;
        ah0 ah0Var12 = sb0Var4.u;
        tso tsoVar32 = sb0Var4.E2;
        tso tsoVar33 = sb0Var4.t;
        ob1 ob1Var22 = this.v0;
        ob1 ob1Var23 = this.d;
        tso tsoVar34 = this.i;
        this.Q0 = new nj0(new wz(sb0Var4.x, this.c, ob1Var23, this.e, tsoVar34, this.k, this.n, this.A, this.t, this.l0, this.G0, this.M0, this.F0, n90Var2, sb0Var4.b0, this.y, sb0Var4.F, this.k0, tsoVar33, ob1Var22, new bc(tsoVar33, new nj0(new dm0(ob1Var21, ah0Var12, tsoVar32, tsoVar33, ob1Var22, ob1Var23, tsoVar34)), (byte) 24)));
        sb0 sb0Var5 = this.b;
        ah0 ah0Var13 = sb0Var5.u;
        ob1 ob1Var24 = fn1.b;
        nj0 nj0Var8 = new nj0(new gf3(ah0Var13, ob1Var24, (byte) 1));
        nj0 nj0Var9 = new nj0(new gf3(ah0Var13, ob1Var24, (byte) 0));
        ob1 ob1Var25 = this.d;
        ah0 ah0Var14 = this.n;
        this.S0 = new nj0(new be3(ah0Var13, ob1Var25, ah0Var14, nj0Var8, nj0Var9, ob1Var));
        tso tsoVar35 = sb0Var5.O;
        tso tsoVar36 = sb0Var5.t;
        tso tsoVar37 = sb0Var5.w;
        new z0(tsoVar35, ob1Var25, tsoVar36, tsoVar37, (byte) 4);
        this.T0 = new nj0(new da(ah0Var14, (byte) 11));
        this.U0 = new nj0(new da(ah0Var14, (byte) 19));
        this.V0 = new nj0(new da(ah0Var14, (byte) 27));
        this.W0 = new nj0(new fh((tso) ah0Var14, (hlo) this.B, (byte) 1));
        tso tsoVar38 = this.l0;
        ob1 ob1Var26 = this.v;
        this.X0 = new nj0(new am(tsoVar38, ob1Var26, (byte) 26));
        ob1 ob1Var27 = sb0Var5.f;
        tso tsoVar39 = sb0Var5.z;
        tso tsoVar40 = this.c;
        tso tsoVar41 = sb0Var5.H0;
        n90 n90Var3 = this.k;
        nj0 nj0Var10 = new nj0(new am1(ob1Var27, tsoVar39, tsoVar40, tsoVar41, (tso) n90Var3, sb0Var5.h, (byte) 5));
        this.Y0 = nj0Var10;
        this.Z0 = new nj0(new p3(tsoVar37, tsoVar38, nj0Var10, (byte) 4));
        tso tsoVar42 = sb0Var5.x;
        this.a1 = new nj0(new p3(tsoVar42, tsoVar38, nj0Var10, (byte) 3));
        this.b1 = new nj0(new am(sb0Var5.u0, ob1Var25, (byte) 10));
        this.c1 = new nj0(new am1(tsoVar36, tsoVar38, ob1Var26, sb0Var5.m1, tsoVar42, this.r, (byte) 0));
        this.d1 = new nj0(new bc(tsoVar37, tsoVar38, (byte) 21));
        this.e1 = new nj0(new am(tsoVar38, this.t, (byte) 22));
        this.f1 = new nj0(new b(nj0Var10, (byte) 7));
        this.g1 = new nj0(new o8(nj0Var10, (byte) 10));
        this.h1 = new nj0(new mw(tsoVar38, (byte) 9));
        this.i1 = new nj0(new mw(tsoVar38, (byte) 20));
        this.j1 = new nj0(new u12(n90Var3, tsoVar42, tsoVar36));
        this.k1 = new nj0(new zv(tsoVar42, n90Var3, (byte) 1));
        LinkedHashMap linkedHashMapC10 = dbh.c(2);
        tso tsoVar43 = this.j1;
        if (tsoVar43 == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC10.put("WebViewPauseResumeListener", tsoVar43);
        tso tsoVar44 = this.k1;
        if (tsoVar44 == null) {
            t3p.q("provider");
            throw null;
        }
        this.l1 = new nj0(new aa(sb0Var5.x, z1m.i(linkedHashMapC10, "WebViewVisibilityChangedAfmaEventListener", tsoVar44, linkedHashMapC10), (byte) 3));
        sb0 sb0Var6 = this.b;
        this.m1 = new nj0(new u12(sb0Var6.B4, this.k, sb0Var6.x));
        ob1 ob1Var28 = fn1.b;
        LinkedHashMap linkedHashMapC11 = dbh.c(4);
        tso tsoVar45 = this.l1;
        if (tsoVar45 == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC11.put("WebViewVisibilityChangedEventEmitter", tsoVar45);
        tso tsoVar46 = this.l;
        if (tsoVar46 == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC11.put("MraidViewabilityEventListener", tsoVar46);
        tso tsoVar47 = this.Y0;
        if (tsoVar47 == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC11.put("NativeVideoViewabilityMonitor", tsoVar47);
        tso tsoVar48 = this.m1;
        if (tsoVar48 == null) {
            t3p.q("provider");
            throw null;
        }
        fn1 fn1VarI2 = z1m.i(linkedHashMapC11, "NativeVideoMraidViewabilityEventListener", tsoVar48, linkedHashMapC11);
        tso tsoVar49 = sb0Var6.x;
        this.n1 = new nj0(new fa(sb0Var6.f, tsoVar49, (tso) new nj0(new aa(tsoVar49, fn1VarI2, (byte) 1)), sb0Var6.V1, this.k, sb0Var6.h, sb0Var6.t, this.x, sb0Var6.E, this.d));
    }

    @Override // defpackage.rep
    public final rnp a() {
        return (InternalNativeAd) this.Q0.get();
    }

    @Override // defpackage.eop
    public final yko d() {
        k1b k1bVarG = l1b.g(12);
        f92 f92Var = (f92) this.S.get();
        a2 a2Var = this.a;
        k1bVarG.e("/open", new sg2(a2Var, f92Var, (byte) 1));
        k1bVarG.e("/click", new sg2(a2Var, (dt) this.O.get(), (byte) 1));
        k1bVarG.e("/nativeAdCustomClick", new sg2(a2Var, (j80) this.T0.get(), (byte) 1));
        k1bVarG.e("/clickRecorded", new sg2(a2Var, (ox1) this.U0.get(), (byte) 1));
        k1bVarG.e("/nativeImpression", new sg2(a2Var, (xx1) this.V0.get(), (byte) 1));
        k1bVarG.e("/nativeImpressionFlowControl", new sg2(a2Var, (zx1) this.W0.get(), (byte) 1));
        k1bVarG.e("/loadHtml", new sg2(a2Var, (tl1) this.X0.get(), (byte) 1));
        k1bVarG.e("/showOverlay", new sg2(a2Var, (h33) this.Z0.get(), (byte) 1));
        k1bVarG.e("/hideOverlay", new sg2(a2Var, (h01) this.a1.get(), (byte) 1));
        k1bVarG.e("/logScionEvent", new sg2(a2Var, (im1) this.b1.get(), (byte) 1));
        k1bVarG.e("/loadNativeAdPolicyViolations", new sg2(a2Var, (zl1) this.c1.get(), (byte) 1));
        k1bVarG.e("/showValidatorOverlay", new sg2(a2Var, (k33) this.d1.get(), (byte) 1));
        return new yko(hsh.m(1, new Object[]{"GmsgHandlerInstaller", new cg2(k1bVarG.b(true), (byte) 1)}, (k1b) null));
    }

    @Override // defpackage.rep
    public final ae3 f() {
        return (ae3) this.S0.get();
    }
}
