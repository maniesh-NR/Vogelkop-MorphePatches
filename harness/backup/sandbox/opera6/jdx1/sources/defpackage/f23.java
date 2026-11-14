package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.obml.Platform;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class f23 implements cr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f23(g3e g3eVar, Function2 function2, Function1 function1) {
        this.a = (byte) 11;
        this.b = g3eVar;
        this.d = function2;
        this.c = function1;
    }

    public /* synthetic */ f23(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        td3 td3Var;
        u8i u8iVarB;
        boolean z2;
        boolean z3;
        zh zhVar;
        byte b = this.a;
        Function0 function0 = m3c.S;
        zpa zpaVar = hh5.a;
        z7e z7eVar = z7e.b;
        int i = 0;
        byte b2 = 1;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                dyh dyhVar = (dyh) obj6;
                j23 j23Var = (j23) obj5;
                Function2 function2 = (Function2) obj4;
                ih5 ih5Var = (ih5) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c8e c8eVarB = sfe.B(z7eVar, dyhVar.a, null, 6);
                    tfd tfdVarC = nr3.c(rbe.b, false);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarB);
                    bh5.To.getClass();
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    ah5 ah5Var = ujp.f;
                    y4h.o(vt9Var, tfdVarC, ah5Var);
                    ah5 ah5Var2 = ujp.e;
                    y4h.o(vt9Var, oagVarL, ah5Var2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    ah5 ah5Var3 = ujp.g;
                    y4h.o(vt9Var, numValueOf, ah5Var3);
                    y4h.m(vt9Var);
                    ah5 ah5Var4 = ujp.d;
                    y4h.o(vt9Var, c8eVarP, ah5Var4);
                    i39 i39Var = mpj.a;
                    uhb uhbVar = uhb.a;
                    c8e c8eVarZ = na2.z(i39Var);
                    o9i o9iVarA = m9i.a(b72.a, rbe.l, vt9Var, 48);
                    int iHashCode2 = Long.hashCode(vt9Var.T);
                    oag oagVarL2 = vt9Var.l();
                    c8e c8eVarP2 = qyn.P(vt9Var, c8eVarZ);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, o9iVarA, ah5Var);
                    y4h.o(vt9Var, oagVarL2, ah5Var2);
                    u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
                    y4h.o(vt9Var, c8eVarP2, ah5Var4);
                    c8e c8eVarA0 = a26.a0(new g4c(1.0f, true), 16.0f, 12.0f, 8.0f, 16.0f);
                    db5 db5VarA = cb5.a(b72.c, rbe.n, vt9Var, 0);
                    int iHashCode3 = Long.hashCode(vt9Var.T);
                    oag oagVarL3 = vt9Var.l();
                    c8e c8eVarP3 = qyn.P(vt9Var, c8eVarA0);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, db5VarA, ah5Var);
                    y4h.o(vt9Var, oagVarL3, ah5Var2);
                    u35.j(iHashCode3, vt9Var, ah5Var3, vt9Var);
                    y4h.o(vt9Var, c8eVarP3, ah5Var4);
                    String str = j23Var.b;
                    o13 o13Var = j23Var.i;
                    hp7 hp7Var = abm.a;
                    ijl.b(str, gyg.k(), dyhVar.b, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, ((wam) vt9Var.j(hp7Var)).h, vt9Var, 48, 24576, 114680);
                    ocp.c(vt9Var, mpj.c(z7eVar, 2.0f));
                    ijl.b(j23Var.c, null, dyhVar.b, 0L, null, 0L, null, null, 0L, 2, false, 2, 2, ((wam) vt9Var.j(hp7Var)).k, vt9Var, 0, 221568, 77818);
                    ec ecVar = j23Var.f;
                    String str2 = ecVar != null ? ecVar.a : null;
                    if (str2 == null) {
                        vt9Var.W(-1541013778);
                        vt9Var.p(false);
                        z = false;
                    } else {
                        vt9Var.W(-1541013777);
                        ocp.c(vt9Var, mpj.c(z7eVar, 12.0f));
                        boolean zF = vt9Var.f(function2) | vt9Var.f(j23Var);
                        Object objK = vt9Var.K();
                        if (zF || objK == zpaVar) {
                            objK = new g23(function2, j23Var, (byte) 0);
                            vt9Var.g0(objK);
                        }
                        zvf zvfVar = b24.a;
                        yi4.a((Function0) objK, (c8e) null, false, (paj) null, b24.b(dyhVar.c, dyhVar.d, 0L, 0L, vt9Var, 12), (e24) null, (go3) null, (zvf) null, gyg.P(1377030241, new h23(str2, (byte) 0), vt9Var), vt9Var, 805306368, 494);
                        z = false;
                        vt9Var.p(false);
                    }
                    vt9Var.p(true);
                    gpm gpmVar = j23Var.h;
                    if (gpmVar == null) {
                        vt9Var.W(367860736);
                        vt9Var.p(z);
                    } else {
                        vt9Var.W(367860737);
                        wxe.b(gpmVar, o13Var, mpj.l(z7eVar, 108.0f).d(mpj.b), vt9Var, 384);
                        vt9Var.p(z);
                    }
                    vt9Var.p(true);
                    ec ecVar2 = j23Var.g;
                    String str3 = ecVar2 != null ? ecVar2.a : null;
                    if (str3 == null) {
                        vt9Var.W(715680148);
                        vt9Var.p(z);
                        z2 = true;
                    } else {
                        vt9Var.W(715680149);
                        if (o13Var == o13.c) {
                            td3Var = rbe.d;
                            u8iVarB = v8i.b(7);
                        } else {
                            td3Var = rbe.j;
                            u8iVarB = v8i.b(14);
                        }
                        u8i u8iVar = u8iVarB;
                        c8e c8eVarA = as3.a.a(z7eVar, td3Var);
                        boolean zF2 = vt9Var.f(function2) | vt9Var.f(j23Var);
                        Object objK2 = vt9Var.K();
                        if (zF2 || objK2 == zpaVar) {
                            z2 = true;
                            objK2 = new g23(function2, j23Var, (byte) 1);
                            vt9Var.g0(objK2);
                        } else {
                            z2 = true;
                        }
                        wxe.c(str3, (Function0) objK2, u8iVar, c8eVarA, vt9Var, 0);
                        vt9Var.p(false);
                    }
                    vt9Var.p(z2);
                } else {
                    vt9Var.Q();
                }
                return Unit.a;
            case 1:
                ue5 ue5Var = (ue5) obj6;
                String str4 = (String) obj5;
                String str5 = (String) obj4;
                ih5 ih5Var2 = (ih5) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c8e c8eVarA02 = a26.a0(mpj.a, 12.0f, 10.0f, 12.0f, 12.0f);
                    db5 db5VarA2 = cb5.a(b72.c, rbe.n, vt9Var2, 0);
                    int iHashCode4 = Long.hashCode(vt9Var2.T);
                    oag oagVarL4 = vt9Var2.l();
                    c8e c8eVarP4 = qyn.P(vt9Var2, c8eVarA02);
                    bh5.To.getClass();
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(function0);
                    } else {
                        vt9Var2.j0();
                    }
                    ah5 ah5Var5 = ujp.f;
                    y4h.o(vt9Var2, db5VarA2, ah5Var5);
                    ah5 ah5Var6 = ujp.e;
                    y4h.o(vt9Var2, oagVarL4, ah5Var6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    ah5 ah5Var7 = ujp.g;
                    y4h.o(vt9Var2, numValueOf2, ah5Var7);
                    y4h.m(vt9Var2);
                    ah5 ah5Var8 = ujp.d;
                    y4h.o(vt9Var2, c8eVarP4, ah5Var8);
                    sd3 sd3Var = rbe.l;
                    o9i o9iVarA2 = m9i.a(new x62(8.0f, true, new t40((byte) 19)), sd3Var, vt9Var2, 54);
                    int iHashCode5 = Long.hashCode(vt9Var2.T);
                    oag oagVarL5 = vt9Var2.l();
                    z7e z7eVar2 = z7e.b;
                    c8e c8eVarP5 = qyn.P(vt9Var2, z7eVar2);
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(function0);
                    } else {
                        vt9Var2.j0();
                    }
                    y4h.o(vt9Var2, o9iVarA2, ah5Var5);
                    y4h.o(vt9Var2, oagVarL5, ah5Var6);
                    u35.j(iHashCode5, vt9Var2, ah5Var7, vt9Var2);
                    y4h.o(vt9Var2, c8eVarP5, ah5Var8);
                    hp7 hp7Var2 = abm.a;
                    ijl.b(str4, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var2)).k, vt9Var2, 0, 0, 131070);
                    q9i q9iVar = q9i.a;
                    ijl.b(str5, q9iVar.a(1.0f, true), 0L, 0L, null, 0L, null, new pel(6), 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var2)).k, vt9Var2, 0, 0, 130044);
                    vt9Var2.p(true);
                    if (ue5Var != null) {
                        vt9Var2.W(1268199846);
                        scd.d(a26.b0(z7eVar2, 0.0f, 10.0f, 0.0f, 12.0f, 5), 0.0f, 0L, vt9Var2, 6, 6);
                        o9i o9iVarA3 = m9i.a(new x62(8.0f, true, new t40((byte) 19)), sd3Var, vt9Var2, 54);
                        int iHashCode6 = Long.hashCode(vt9Var2.T);
                        oag oagVarL6 = vt9Var2.l();
                        c8e c8eVarP6 = qyn.P(vt9Var2, z7eVar2);
                        vt9Var2.a0();
                        if (vt9Var2.S) {
                            vt9Var2.k(function0);
                        } else {
                            vt9Var2.j0();
                        }
                        y4h.o(vt9Var2, o9iVarA3, ah5Var5);
                        y4h.o(vt9Var2, oagVarL6, ah5Var6);
                        u35.j(iHashCode6, vt9Var2, ah5Var7, vt9Var2);
                        y4h.o(vt9Var2, c8eVarP6, ah5Var8);
                        wta.a(y9m.N(), null, mpj.h(z7eVar2, 16.0f), ((sa5) vt9Var2.j(ua5.a)).s, vt9Var2, 432, 0);
                        ue5Var.invoke(q9iVar, vt9Var2, 6);
                        z3 = true;
                        vt9Var2.p(true);
                        vt9Var2.p(false);
                    } else {
                        z3 = true;
                        vt9Var2.W(1268787017);
                        vt9Var2.p(false);
                    }
                    vt9Var2.p(z3);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 2:
                String str6 = (String) obj6;
                dl7 dl7Var = (dl7) obj5;
                String str7 = (String) obj4;
                ih5 ih5Var3 = (ih5) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    rd3 rd3Var = rbe.o;
                    x62 x62Var = new x62(4.0f, true, new t40((byte) 19));
                    c8e c8eVarY = a26.Y(mpj.a, 8.0f, 12.0f);
                    db5 db5VarA3 = cb5.a(x62Var, rd3Var, vt9Var3, 54);
                    int iHashCode7 = Long.hashCode(vt9Var3.T);
                    oag oagVarL7 = vt9Var3.l();
                    c8e c8eVarP7 = qyn.P(vt9Var3, c8eVarY);
                    bh5.To.getClass();
                    vt9Var3.a0();
                    if (vt9Var3.S) {
                        vt9Var3.k(function0);
                    } else {
                        vt9Var3.j0();
                    }
                    ah5 ah5Var9 = ujp.f;
                    y4h.o(vt9Var3, db5VarA3, ah5Var9);
                    ah5 ah5Var10 = ujp.e;
                    y4h.o(vt9Var3, oagVarL7, ah5Var10);
                    Integer numValueOf3 = Integer.valueOf(iHashCode7);
                    ah5 ah5Var11 = ujp.g;
                    y4h.o(vt9Var3, numValueOf3, ah5Var11);
                    y4h.m(vt9Var3);
                    ah5 ah5Var12 = ujp.d;
                    y4h.o(vt9Var3, c8eVarP7, ah5Var12);
                    hp7 hp7Var3 = abm.a;
                    ikl iklVar = ((wam) vt9Var3.j(hp7Var3)).l;
                    hp7 hp7Var4 = ua5.a;
                    ijl.b(str6, null, ((sa5) vt9Var3.j(hp7Var4)).s, 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, iklVar, vt9Var3, 0, 0, 130042);
                    o9i o9iVarA4 = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var3, 54);
                    int iHashCode8 = Long.hashCode(vt9Var3.T);
                    oag oagVarL8 = vt9Var3.l();
                    c8e c8eVarP8 = qyn.P(vt9Var3, z7eVar);
                    vt9Var3.a0();
                    if (vt9Var3.S) {
                        vt9Var3.k(function0);
                    } else {
                        vt9Var3.j0();
                    }
                    y4h.o(vt9Var3, o9iVarA4, ah5Var9);
                    y4h.o(vt9Var3, oagVarL8, ah5Var10);
                    u35.j(iHashCode8, vt9Var3, ah5Var11, vt9Var3);
                    y4h.o(vt9Var3, c8eVarP8, ah5Var12);
                    xf8.j(iza.a(dl7Var, vt9Var3), null, mpj.h(z7eVar, 16.0f), null, null, 0.0f, null, vt9Var3, 440, 120);
                    ijl.b(str7, null, ((sa5) vt9Var3.j(hp7Var4)).q, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, ((wam) vt9Var3.j(hp7Var3)).j, vt9Var3, 0, 24576, 114682);
                    vt9Var3.p(true);
                    vt9Var3.p(true);
                } else {
                    vt9Var3.Q();
                }
                return Unit.a;
            case 3:
                myn mynVar = (myn) obj6;
                ayn aynVar = (ayn) obj5;
                kxn kxnVar = (kxn) obj4;
                xvf xvfVar = (xvf) obj;
                ih5 ih5Var4 = (ih5) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((vt9) ih5Var4).f(xvfVar) ? 4 : 2;
                }
                vt9 vt9Var4 = (vt9) ih5Var4;
                if (vt9Var4.N(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    c8e c8eVarW = a26.W(z7eVar, xvfVar);
                    tfd tfdVarC2 = nr3.c(rbe.b, false);
                    int iHashCode9 = Long.hashCode(vt9Var4.T);
                    oag oagVarL9 = vt9Var4.l();
                    c8e c8eVarP9 = qyn.P(vt9Var4, c8eVarW);
                    bh5.To.getClass();
                    vt9Var4.a0();
                    if (vt9Var4.S) {
                        vt9Var4.k(function0);
                    } else {
                        vt9Var4.j0();
                    }
                    y4h.o(vt9Var4, tfdVarC2, ujp.f);
                    y4h.o(vt9Var4, oagVarL9, ujp.e);
                    y4h.o(vt9Var4, Integer.valueOf(iHashCode9), ujp.g);
                    y4h.m(vt9Var4);
                    y4h.o(vt9Var4, c8eVarP9, ujp.d);
                    i39 i39Var2 = mpj.c;
                    Object objK3 = vt9Var4.K();
                    Object obj7 = objK3;
                    if (objK3 == zpaVar) {
                        v8g v8gVar = new v8g();
                        vt9Var4.g0(v8gVar);
                        obj7 = v8gVar;
                    }
                    v8g v8gVar2 = (v8g) obj7;
                    sh shVar = new sh(b2);
                    boolean zH = vt9Var4.h(v8gVar2);
                    Object objK4 = vt9Var4.K();
                    Object obj8 = objK4;
                    if (zH || objK4 == zpaVar) {
                        o5f o5fVar = new o5f(v8gVar2, (byte) 27);
                        vt9Var4.g0(o5fVar);
                        obj8 = o5fVar;
                    }
                    hyg.o(shVar, vt9Var4);
                    afe afeVarO = hyg.o((Function1) obj8, vt9Var4);
                    Object[] objArr = new Object[0];
                    Object objK5 = vt9Var4.K();
                    Object obj9 = objK5;
                    if (objK5 == zpaVar) {
                        lb lbVar = new lb((byte) 3);
                        vt9Var4.g0(lbVar);
                        obj9 = lbVar;
                    }
                    String str8 = (String) w1h.t(objArr, (Function0) obj9, vt9Var4);
                    di diVar = (di) vt9Var4.j(mtc.a);
                    if (diVar == null) {
                        vt9Var4.W(1213380307);
                        Object baseContext = (Context) vt9Var4.j(j41.b);
                        while (true) {
                            if (!(baseContext instanceof ContextWrapper)) {
                                baseContext = null;
                            } else if (!(baseContext instanceof di)) {
                                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                            }
                        }
                        diVar = (di) baseContext;
                    } else {
                        vt9Var4.W(1213379439);
                    }
                    vt9Var4.p(false);
                    if (diVar == null) {
                        qp2.n("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
                        return null;
                    }
                    zh activityResultRegistry = diVar.getActivityResultRegistry();
                    Object objK6 = vt9Var4.K();
                    Object obj10 = objK6;
                    if (objK6 == zpaVar) {
                        uh uhVar = new uh();
                        vt9Var4.g0(uhVar);
                        obj10 = uhVar;
                    }
                    uh uhVar2 = (uh) obj10;
                    Object objK7 = vt9Var4.K();
                    Object obj11 = objK7;
                    if (objK7 == zpaVar) {
                        b9d b9dVar = new b9d(uhVar2);
                        vt9Var4.g0(b9dVar);
                        obj11 = b9dVar;
                    }
                    b9d b9dVar2 = (b9d) obj11;
                    boolean zH2 = vt9Var4.h(uhVar2) | vt9Var4.h(activityResultRegistry) | vt9Var4.f(str8) | vt9Var4.h(shVar) | vt9Var4.f(afeVarO);
                    Object objK8 = vt9Var4.K();
                    if (zH2 || objK8 == zpaVar) {
                        objK8 = new ai(uhVar2, activityResultRegistry, str8, shVar, afeVarO, (byte) 0);
                        zhVar = activityResultRegistry;
                        vt9Var4.g0(objK8);
                    } else {
                        zhVar = activityResultRegistry;
                    }
                    Function1 function1 = (Function1) objK8;
                    boolean zF3 = vt9Var4.f(zhVar) | vt9Var4.f(str8) | vt9Var4.f(shVar);
                    Object objK9 = vt9Var4.K();
                    Object obj12 = objK9;
                    if (zF3 || objK9 == zpaVar) {
                        tb7 tb7Var = new tb7(function1);
                        vt9Var4.g0(tb7Var);
                        obj12 = tb7Var;
                    }
                    boolean zF4 = vt9Var4.f(b9dVar2);
                    Object objK10 = vt9Var4.K();
                    Object obj13 = objK10;
                    if (zF4 || objK10 == zpaVar) {
                        ihg ihgVar = new ihg(new a19(new hda(v8gVar2, b9dVar2, (byte) 24)));
                        vt9Var4.g0(ihgVar);
                        obj13 = ihgVar;
                    }
                    nxg.a(mynVar, i39Var2, false, aynVar, kxnVar, null, null, (ihg) obj13, vt9Var4, 24632);
                    vt9Var4.p(true);
                } else {
                    vt9Var4.Q();
                }
                return Unit.a;
            case 4:
                Function0 function02 = (Function0) obj6;
                Function1 function12 = (Function1) obj5;
                rx8 rx8Var = (rx8) obj4;
                ih5 ih5Var5 = (ih5) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                vt9 vt9Var5 = (vt9) ih5Var5;
                if (vt9Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    String strQ = mzg.q(vt9Var5, 2132018111);
                    smf smfVar = smf.d;
                    scd.f(function02, strQ, null, false, false, smfVar, null, null, null, null, null, null, null, null, vt9Var5, 196608, 0, 16348);
                    boolean zF5 = vt9Var5.f(function12) | vt9Var5.f(rx8Var);
                    Object objK11 = vt9Var5.K();
                    if (zF5 || objK11 == zpaVar) {
                        objK11 = new x2((byte) 7, rx8Var, function12);
                        vt9Var5.g0(objK11);
                    }
                    scd.f((Function0) objK11, mzg.q(vt9Var5, 2132019049), null, false, false, smfVar, null, null, null, null, null, null, null, null, vt9Var5, 196608, 0, 16348);
                } else {
                    vt9Var5.Q();
                }
                return Unit.a;
            case 5:
                b22 b22Var = (b22) obj6;
                d7l d7lVar = (b2l) obj5;
                ChromiumContent chromiumContent = (ChromiumContent) obj4;
                lsc lscVar = (lsc) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                if (zBooleanValue) {
                    uv0.b((uv0) b22Var.y.get(), ((ksc) lscVar).a, d7lVar.j.m() ? 2 : 3, d7lVar, true, zBooleanValue2, (oc2) null, 32);
                } else {
                    chromiumContent.v(lscVar);
                }
                return Unit.a;
            case 6:
                g1b g1bVar = (g1b) obj6;
                Integer num = (Integer) obj5;
                Function0 function03 = (Function0) obj4;
                ih5 ih5Var6 = (ih5) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                vt9 vt9Var6 = (vt9) ih5Var6;
                if (vt9Var6.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    z5i.e(g1bVar, num, function03, vt9Var6, 0);
                } else {
                    vt9Var6.Q();
                }
                return Unit.a;
            case 7:
                p04 p04Var = (p04) obj5;
                byi byiVar = (byi) obj4;
                if (obj6 != r04.l) {
                    mkh.j(p04Var.b, obj6, byiVar.a);
                }
                return Unit.a;
            case 8:
                g1b g1bVar2 = (g1b) obj6;
                Function1 function13 = (Function1) obj5;
                afe afeVar = (afe) obj4;
                ih5 ih5Var7 = (ih5) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                vt9 vt9Var7 = (vt9) ih5Var7;
                if (vt9Var7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    for (Object obj14 : g1bVar2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            j95.n();
                            throw null;
                        }
                        ue5 ue5VarP = gyg.P(-1261972678, new lx0((String) obj14, (byte) 7), vt9Var7);
                        boolean zF6 = vt9Var7.f(function13) | vt9Var7.d(i);
                        Object objK12 = vt9Var7.K();
                        if (zF6 || objK12 == zpaVar) {
                            objK12 = new q14(function13, i, afeVar, (byte) 1);
                            vt9Var7.g0(objK12);
                        }
                        a81.a(ue5VarP, (Function0) objK12, null, false, null, null, vt9Var7, 6);
                        i = i2;
                    }
                } else {
                    vt9Var7.Q();
                }
                return Unit.a;
            case 9:
                gca gcaVar = (gca) obj6;
                Function0 function04 = (Function0) obj5;
                Function0 function05 = (Function0) obj4;
                ih5 ih5Var8 = (ih5) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                vt9 vt9Var8 = (vt9) ih5Var8;
                if (!vt9Var8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    vt9Var8.Q();
                } else if (gcaVar instanceof eca) {
                    vt9Var8.W(-1872359838);
                    y9m.k(vt9Var8, 0);
                    vt9Var8.p(false);
                } else {
                    if (!(gcaVar instanceof fca)) {
                        throw fki.m(vt9Var8, -1872361625, false);
                    }
                    vt9Var8.W(-1872357295);
                    y9m.l(((fca) gcaVar).a, function04, function05, vt9Var8, 0);
                    vt9Var8.p(false);
                }
                return Unit.a;
            case 10:
                String str9 = (String) obj6;
                String str10 = (String) obj5;
                Function0 function06 = (Function0) obj4;
                ih5 ih5Var9 = (ih5) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                vt9 vt9Var9 = (vt9) ih5Var9;
                if (vt9Var9.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    p37.h(str9, str10, function06, vt9Var9, 0);
                } else {
                    vt9Var9.Q();
                }
                return Unit.a;
            case 11:
                g3e g3eVar = (g3e) obj6;
                Function2 function22 = (Function2) obj4;
                Function1 function14 = (Function1) obj5;
                ih5 ih5Var10 = (ih5) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                vt9 vt9Var10 = (vt9) ih5Var10;
                if (vt9Var10.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    o0g.a(g3eVar.a, function22, function14, null, vt9Var10, 48);
                } else {
                    vt9Var10.Q();
                }
                return Unit.a;
            case 12:
                d2c d2cVar = (d2c) obj6;
                ue5 ue5Var2 = (ue5) obj5;
                ue5 ue5Var3 = (ue5) obj4;
                wd9 wd9Var = (wd9) obj;
                ih5 ih5Var11 = (ih5) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((vt9) ih5Var11).f(wd9Var) ? 4 : 2;
                }
                vt9 vt9Var11 = (vt9) ih5Var11;
                if (vt9Var11.N(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    kfo.c(mi5.n.a(d2cVar), gyg.P(-1977170230, new g9(ue5Var2, wd9Var, ue5Var3, (byte) 23), vt9Var11), vt9Var11, 56);
                } else {
                    vt9Var11.Q();
                }
                return Unit.a;
            case 13:
                Function1 function15 = (Function1) obj6;
                sqi sqiVar = (sqi) obj5;
                List list = (List) obj4;
                cj9 cj9Var = (cj9) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                uvg uvgVar = (uvg) obj3;
                String str11 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
                String str12 = cj9Var.a;
                String upperCase = str12 != null ? str12.toUpperCase(Locale.ROOT) : null;
                if (upperCase == null) {
                    upperCase = "";
                }
                String str13 = upperCase;
                String upperCase2 = ((String) sqiVar.b.get()).toUpperCase(Locale.ROOT);
                String str14 = ((Boolean) sqiVar.c.get()).booleanValue() ? "chromebook" : "android";
                String strB = aik.b(cj9Var.e, "default");
                String str15 = (String) sqiVar.d.get();
                String str16 = (String) sqiVar.f.get();
                String strC = Platform.c();
                String str17 = (String) sqiVar.e.get();
                Set setA = sqiVar.g.a();
                String string = UUID.randomUUID().toString();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str18 = (String) sqiVar.i.get();
                function15.invoke(new jqi(str11, str13, upperCase2, str14, strB, str15, str16, strC, str17, setA, string, jCurrentTimeMillis, iIntValue12, list, str18 == null ? "default" : str18, (String) sqiVar.j.get(), (String) sqiVar.k.get(), (String) sqiVar.l.get(), uvgVar == uvg.d ? "premium" : "free", (String) sqiVar.n.get(), Boolean.FALSE, (Integer) sqiVar.o.get()));
                return Unit.a;
            default:
                sek sekVar = (sek) obj6;
                Function0 function07 = (Function0) obj5;
                Function0 function08 = (Function0) obj4;
                ih5 ih5Var12 = (ih5) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                vt9 vt9Var12 = (vt9) ih5Var12;
                if (vt9Var12.N(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    kfo.q(sekVar, function07, function08, a26.X(wxe.Q(z7eVar), 24.0f), vt9Var12, 0, 0);
                } else {
                    vt9Var12.Q();
                }
                return Unit.a;
        }
    }
}
