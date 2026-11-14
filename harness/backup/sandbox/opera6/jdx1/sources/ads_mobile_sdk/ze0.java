package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import defpackage.cs5;
import defpackage.dbh;
import defpackage.jso;
import defpackage.rep;
import defpackage.rnp;
import defpackage.scd;
import defpackage.t3p;
import defpackage.tso;
import defpackage.xf8;
import defpackage.z1m;
import defpackage.zzo;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ze0 implements rep {
    public final tso A;
    public final tso B;
    public final tso C;
    public final ob1 D;
    public final ob1 E;
    public final tso F;
    public final tso G;
    public final tso H;
    public final tso I;
    public final tso J;
    public final tso L;
    public final tso M;
    public final fn1 N;
    public final tso O;
    public final tso S;
    public final tso T;
    public final rh U;
    public final tso V;
    public final tso W;
    public final sb0 a;
    public final tso b = new nj0(xf8.s);
    public final ob1 c;
    public final ob1 d;
    public final n90 e;
    public final n90 f;
    public final n90 g;
    public final tso h;
    public final ob1 i;
    public final a3 j;
    public final ob1 k;
    public final ob1 l;
    public final ob1 m;
    public final tso n;
    public final ob1 o;
    public final ah0 p;
    public final ob1 q;
    public final tso r;
    public final mw s;
    public final b23 t;
    public final tso u;
    public final tso v;
    public final ob1 w;
    public final az1 x;
    public final tso y;
    public final tso z;

    public ze0(sb0 sb0Var, defpackage.r83 r83Var, av2 av2Var, Integer num, a2 a2Var, xv xvVar, n13 n13Var, eq2 eq2Var, ih1 ih1Var, dt2 dt2Var, s8 s8Var, ve2 ve2Var, v31 v31Var, zzo zzoVar, it1 it1Var) {
        this.a = sb0Var;
        this.c = ob1.a(a2Var);
        this.d = ob1.a(xvVar);
        this.e = new n90(ob1.a(eq2Var));
        this.f = new n90(ob1.a(ih1Var));
        this.g = new n90(ob1.a(dt2Var));
        this.h = new nj0(new bt(this.e, this.f, this.g, new n90(ob1.a(s8Var)), (byte) 7, false));
        ob1 ob1Var = jso.a;
        this.i = ob1Var;
        this.j = new a3(this.c, this.d, sb0Var.b4, (byte) 4);
        this.k = ob1Var;
        this.l = ob1.a(n13Var);
        this.m = ob1.a(num);
        this.n = new nj0(scd.s);
        this.o = ob1.a(ve2Var);
        this.p = new ah0();
        ob1 ob1VarA = ob1.a(av2Var);
        this.q = ob1VarA;
        this.r = new nj0(new e6(ob1VarA, (byte) 15));
        this.s = new mw(ob1Var, (byte) 8);
        int i = b23.c;
        List listF = dbh.f(1);
        List listF2 = dbh.f(1);
        listF.add(this.r);
        listF2.add(this.s);
        this.t = new b23(listF, listF2);
        ob1 ob1VarA2 = ob1.a(v31Var);
        tso tsoVar = sb0Var.G;
        tso tsoVar2 = sb0Var.R3;
        tso tsoVar3 = sb0Var.S;
        a3 a3Var = this.j;
        ob1 ob1Var2 = this.k;
        ob1 ob1Var3 = this.l;
        ob1 ob1Var4 = this.c;
        tso tsoVar4 = this.h;
        ob1 ob1Var5 = this.m;
        tso tsoVar5 = sb0Var.h;
        tso tsoVar6 = this.n;
        tso tsoVar7 = sb0Var.C4;
        ob1 ob1Var6 = this.o;
        ah0 ah0Var = this.p;
        tso tsoVar8 = sb0Var.f2;
        b23 b23Var = this.t;
        tso tsoVar9 = sb0Var.t;
        this.u = new nj0(new mi3(tsoVar, tsoVar2, tsoVar3, a3Var, ob1Var2, ob1Var3, ob1Var4, tsoVar4, ob1Var5, tsoVar5, tsoVar6, tsoVar7, ob1Var6, ah0Var, tsoVar8, b23Var, tsoVar9, ob1VarA2));
        this.v = new nj0(new hk(sb0Var.u, tsoVar9, tsoVar4, tsoVar, (byte) 3));
        ob1 ob1VarA3 = ob1.a(r83Var);
        this.w = ob1VarA3;
        this.x = new az1(sb0Var.P3, ob1VarA3, (tso) this.q, (byte) 10);
        this.y = new nj0(new am(sb0Var.r3, ob1VarA3, (byte) 12));
        tso tsoVarA = h93.a(new am(sb0Var.f, sb0Var.t, (byte) 24));
        ob1 ob1Var7 = sb0Var.f;
        ob1 ob1Var8 = this.c;
        tso tsoVar10 = sb0Var.D4;
        tso tsoVar11 = sb0Var.t;
        tso tsoVar12 = sb0Var.G;
        ah0 ah0Var2 = sb0Var.F;
        ah0 ah0Var3 = sb0Var.u;
        this.z = new nj0(new ef2(ob1Var7, ob1Var8, tsoVar10, tsoVar11, tsoVar12, tsoVarA, ah0Var2, ah0Var3, sb0Var.E));
        tso tsoVar13 = sb0Var.a0;
        ob1 ob1Var9 = this.q;
        this.A = new nj0(new p3(tsoVar13, ob1Var9, sb0Var.b0, (byte) 0));
        this.B = new nj0(new gh2(sb0Var.P0, ah0Var3, ob1Var9, tsoVar11, tsoVar12, (byte) 0));
        this.C = new nj0(new kx1(this.l, sb0Var.z0, sb0Var.c4, this.w, ob1Var9, ob1Var, sb0Var.s, ah0Var2));
        ob1 ob1Var10 = fn1.b;
        e7 e7Var = new e7(9);
        e7Var.a("TrackingPingMonitorAsAdEventListener", this.u);
        e7Var.a("DelegatingAdEventListener", this.v);
        e7Var.a("RequestThrottlerV2AdMonitor", this.x);
        e7Var.a("AdStatsTrackerListener", this.y);
        e7Var.a("CustomTabsConnectionInitializationTask", sb0Var.T1);
        e7Var.a("PlayPrewarmListener", this.z);
        e7Var.a("AdLifecycleTrackerListener", this.A);
        e7Var.a("PreloadAdCloseListener", this.B);
        e7Var.a("PersistentCacheAdMonitor", this.C);
        ah0.a(this.p, new nj0(new a3(sb0Var.u, new fn1((LinkedHashMap) e7Var.a), this.c, (byte) 0)));
        this.D = ob1.a(it1Var);
        ob1 ob1VarA4 = ob1.a(zzoVar);
        this.E = ob1VarA4;
        ah0 ah0Var4 = sb0Var.u;
        ah0 ah0Var5 = this.p;
        ob1 ob1Var11 = this.c;
        nj0 nj0Var = new nj0(new xs(ah0Var4, ob1VarA4, ah0Var5, ob1Var11, sb0Var.m1));
        this.F = nj0Var;
        ob1 ob1Var12 = this.D;
        nj0 nj0Var2 = new nj0(new vh(ob1Var12, (byte) 21));
        this.G = nj0Var2;
        tso tsoVar14 = sb0Var.x;
        tso tsoVar15 = sb0Var.t;
        tso tsoVar16 = sb0Var.y1;
        ob1 ob1Var13 = this.w;
        this.H = new nj0(new be2(tsoVar14, ah0Var4, ob1Var12, tsoVar15, nj0Var2, tsoVar16, ob1Var13, cs5.l, (byte) 3));
        this.I = new nj0(new cn0(ob1Var13, sb0Var.u0, ob1Var11, ah0Var4));
        this.J = new nj0(new o8(nj0Var, (byte) 2));
        LinkedHashMap linkedHashMapC = dbh.c(2);
        tso tsoVar17 = this.I;
        if (tsoVar17 == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC.put("FirebaseAnalyticsAdEventListener", tsoVar17);
        tso tsoVar18 = this.J;
        if (tsoVar18 == null) {
            t3p.q("provider");
            throw null;
        }
        this.L = new nj0(new aa(sb0Var.x, z1m.i(linkedHashMapC, "NativeAdViewVisibilityChangedEventListener", tsoVar18, linkedHashMapC), (byte) 2));
        this.M = new nj0(new az1(sb0Var.t, this.F, this.q, (byte) 0));
        LinkedHashMap linkedHashMapC2 = dbh.c(1);
        tso tsoVar19 = this.M;
        if (tsoVar19 == null) {
            t3p.q("provider");
            throw null;
        }
        this.N = z1m.i(linkedHashMapC2, "NativeMediaViewFullyVisibleEventListener", tsoVar19, linkedHashMapC2);
        sb0 sb0Var2 = this.a;
        this.O = new nj0(new aa(sb0Var2.x, this.N, (byte) 4));
        ob1 ob1Var14 = fn1.b;
        LinkedHashMap linkedHashMapC3 = dbh.c(2);
        tso tsoVar20 = this.L;
        if (tsoVar20 == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC3.put("AdVisibilityChangedEventEmitter", tsoVar20);
        tso tsoVar21 = this.O;
        if (tsoVar21 == null) {
            t3p.q("provider");
            throw null;
        }
        fn1 fn1VarI = z1m.i(linkedHashMapC3, "MediaViewFullyVisibleEventEmitter", tsoVar21, linkedHashMapC3);
        tso tsoVar22 = sb0Var2.x;
        nj0 nj0Var3 = new nj0(new aa(tsoVar22, fn1VarI, (byte) 0));
        ob1 ob1Var15 = sb0Var2.f;
        tso tsoVar23 = sb0Var2.V1;
        tso tsoVar24 = sb0Var2.h;
        tso tsoVar25 = sb0Var2.t;
        tso tsoVar26 = sb0Var2.E;
        ob1 ob1Var16 = this.c;
        nj0 nj0Var4 = new nj0(new p3(new nj0(new be2(ob1Var15, tsoVar22, nj0Var3, tsoVar23, tsoVar24, tsoVar25, tsoVar26, ob1Var16)), this.J, this.M, (byte) 12));
        nj0 nj0Var5 = new nj0(new g8(sb0Var2.z, ob1Var16, sb0Var2.R, sb0Var2.I, this.q, tsoVar25));
        ah0 ah0Var6 = sb0Var2.u;
        tso tsoVar27 = sb0Var2.E2;
        ob1 ob1Var17 = this.w;
        tso tsoVar28 = this.h;
        bc bcVar = new bc(tsoVar25, new nj0(new dm0(ob1Var15, ah0Var6, tsoVar27, tsoVar25, ob1Var17, ob1Var16, tsoVar28)), (byte) 24);
        tso tsoVar29 = this.b;
        ob1 ob1Var18 = this.d;
        ob1 ob1Var19 = this.i;
        ah0 ah0Var7 = this.p;
        tso tsoVar30 = this.v;
        ob1 ob1Var20 = this.D;
        this.S = new nj0(new wz(tsoVar22, tsoVar29, ob1Var16, ob1Var18, tsoVar28, ob1Var19, ah0Var7, tsoVar30, ob1Var20, this.F, this.H, nj0Var4, this.G, ob1Var, sb0Var2.b0, nj0Var5, sb0Var2.F, this.o, tsoVar25, ob1Var17, bcVar));
        this.T = new nj0(new gf3(ah0Var6, fn1.b, (byte) 1));
        this.U = new rh(new nj0(new am(ob1Var20, tsoVar22, (byte) 20)), (byte) 10);
        LinkedHashMap linkedHashMapC4 = dbh.c(1);
        rh rhVar = this.U;
        if (rhVar == null) {
            t3p.q("provider");
            throw null;
        }
        linkedHashMapC4.put("provideThirdPartyVideoEventListener", rhVar);
        this.V = new nj0(new gf3(sb0Var2.u, new fn1(linkedHashMapC4), (byte) 0));
        n90 n90Var = new n90(this.E);
        ah0 ah0Var8 = sb0Var2.u;
        ob1 ob1Var21 = this.c;
        this.W = new nj0(new be3(ah0Var8, ob1Var21, this.p, this.T, this.V, n90Var));
        new z0(sb0Var2.O, ob1Var21, sb0Var2.t, sb0Var2.w, (byte) 4);
    }

    @Override // defpackage.rep
    public final rnp a() {
        return (InternalNativeAd) this.S.get();
    }

    @Override // defpackage.rep
    public final ae3 f() {
        return (ae3) this.W.get();
    }
}
