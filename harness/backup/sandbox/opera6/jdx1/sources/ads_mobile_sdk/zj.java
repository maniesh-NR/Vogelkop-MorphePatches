package ads_mobile_sdk;

import androidx.webkit.Profile;
import defpackage.a6p;
import defpackage.glp;
import defpackage.hmo;
import defpackage.nip;
import defpackage.prb;
import defpackage.qd6;
import defpackage.t3p;
import defpackage.trp;
import defpackage.ybh;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes.dex */
public final class zj extends kuk implements Function2 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(wm0 wm0Var, String str, boolean z, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 8;
        this.b = wm0Var;
        this.c = str;
        this.a = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(Profile profile, yq3 yq3Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 1;
        this.b = yq3Var;
        this.c = profile;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zj(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(prb prbVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 3;
        this.c = prbVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new zj(this.b, obj2, mt5Var, (byte) 0);
            case 1:
                return new zj((Profile) obj2, (yq3) this.b, mt5Var);
            case 2:
                return new zj(this.b, obj2, mt5Var, (byte) 2);
            case 3:
                zj zjVar = new zj((prb) obj2, mt5Var);
                zjVar.b = obj;
                return zjVar;
            case 4:
                return new zj(this.b, obj2, mt5Var, (byte) 4);
            case 5:
                return new zj(this.b, obj2, mt5Var, (byte) 5);
            case 6:
                return new zj(this.b, obj2, mt5Var, (byte) 6);
            case 7:
                return new zj(this.b, obj2, mt5Var, (byte) 7);
            case 8:
                return new zj((wm0) this.b, (String) obj2, this.a, mt5Var);
            case 9:
                return new zj(this.b, obj2, mt5Var, (byte) 9);
            case 10:
                return new zj(this.b, obj2, mt5Var, (byte) 10);
            default:
                return new zj(this.b, obj2, mt5Var, (byte) 11);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, pxb, IllegalArgumentException, InvocationTargetException {
        byte b = this.t;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return new zj(this.b, obj3, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new zj((Profile) obj3, (yq3) this.b, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return new zj(this.b, obj3, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            case 3:
                return create((ue1) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return new zj(this.b, obj3, (mt5) obj2, (byte) 4).invokeSuspend(Unit.a);
            case 5:
                return new zj(this.b, obj3, (mt5) obj2, (byte) 5).invokeSuspend(Unit.a);
            case 6:
                return new zj(this.b, obj3, (mt5) obj2, (byte) 6).invokeSuspend(Unit.a);
            case 7:
                return new zj(this.b, obj3, (mt5) obj2, (byte) 7).invokeSuspend(Unit.a);
            case 8:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 9:
                new zj(this.b, obj3, (mt5) obj2, (byte) 9).invokeSuspend(Unit.a);
                return px5.a;
            case 10:
                return new zj(this.b, obj3, (mt5) obj2, (byte) 10).invokeSuspend(Unit.a);
            default:
                return new zj(this.b, obj3, (mt5) obj2, (byte) 11).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) throws IllegalAccessException, pxb, IllegalArgumentException, InvocationTargetException {
        mt5 mt5Var = null;
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    aj ajVar = ((dk) this.b).b;
                    xi xiVar = (xi) this.c;
                    this.a = true;
                    Object objA = ((qd6) ajVar.a.get()).a(new hmo((byte) 4, mt5Var, xiVar), this);
                    if (objA != px5Var) {
                        objA = Unit.a;
                    }
                    if (objA == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    yq3 yq3Var = (yq3) this.b;
                    Profile profile = (Profile) this.c;
                    this.a = true;
                    if (yq3Var.a(profile, (nt5) this) == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.a;
                if (!z3) {
                    ybh.y(obj);
                    s01 s01Var = (s01) this.b;
                    trp trpVar = (trp) this.c;
                    this.a = true;
                    nh4 nh4Var = new nh4(1, hib.b(this));
                    nh4Var.s();
                    o01 o01Var = new o01(new AtomicBoolean(false), nh4Var);
                    synchronized (((kma) s01Var.c.getValue())) {
                        tpp tppVar = (kma) s01Var.c.getValue();
                        List listI = j95.i(trpVar);
                        gpp gppVar = (lup) tppVar.c.zza();
                        gppVar.getClass();
                        gppVar.b.q(new defpackage.iv(gppVar, listI, o01Var, false, (byte) 21));
                    }
                    if (nh4Var.q() == px5Var3) {
                        return px5Var3;
                    }
                } else {
                    if (!z3) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 3:
                px5 px5Var4 = px5.a;
                boolean z4 = this.a;
                if (!z4) {
                    ybh.y(obj);
                    ue1 ue1Var = (ue1) this.b;
                    prb prbVar = (prb) this.c;
                    this.a = true;
                    if (ue1Var.a(prbVar, this) == px5Var4) {
                        return px5Var4;
                    }
                } else {
                    if (!z4) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 4:
                Unit unit = px5.a;
                boolean z5 = this.a;
                if (!z5) {
                    ybh.y(obj);
                    bq1 bq1Var = ((t12) this.b).a;
                    cy0 cy0Var = (cy0) this.c;
                    this.a = true;
                    if (bq1Var.a(cy0Var) == unit) {
                        return unit;
                    }
                } else {
                    if (!z5) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 5:
                px5 px5Var5 = px5.a;
                boolean z6 = this.a;
                if (!z6) {
                    ybh.y(obj);
                    prb prbVarA = bw2.a((pqb) this.b);
                    if (prbVarA == null) {
                        return null;
                    }
                    w8 w8Var = (w8) this.c;
                    this.a = true;
                    obj = w8.a(w8Var, prbVarA, (nt5) this);
                    if (obj == px5Var5) {
                        return px5Var5;
                    }
                } else {
                    if (!z6) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return (a6p) obj;
            case 6:
                Unit unit2 = px5.a;
                boolean z7 = this.a;
                if (!z7) {
                    ybh.y(obj);
                    nip nipVar = ((ae3) this.b).d;
                    e7 e7Var = new e7(this.c, (byte) 27);
                    this.a = true;
                    if (nipVar.a(e7Var, this) == unit2) {
                        return unit2;
                    }
                } else {
                    if (!z7) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 7:
                px5 px5Var6 = px5.a;
                boolean z8 = this.a;
                if (!z8) {
                    ybh.y(obj);
                    bq1 bq1Var2 = ((vr1) this.b).a;
                    cy0 cy0Var2 = (cy0) this.c;
                    this.a = true;
                    bq1Var2.getClass();
                    if (bq1.a(cy0Var2, "setOrientationProperties is only valid for fullscreen or expanded webviews.", "setOrientationProperties", this) == px5Var6) {
                        return px5Var6;
                    }
                } else {
                    if (!z8) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 8:
                px5 px5Var7 = px5.a;
                ybh.y(obj);
                bn0 bn0Var = ((wm0) this.b).b;
                String str = (String) this.c;
                boolean z9 = this.a;
                bn0Var.getClass();
                zyk zykVar = bn0Var.e;
                try {
                    if (zykVar.getValue() != null) {
                        Class.forName(bn0Var.d.N()).getMethod(z9 ? "beginAdUnitExposure" : "endAdUnitExposure", String.class).invoke(zykVar.getValue(), str);
                    }
                } catch (Exception e) {
                    bn0Var.b.a("FirebaseAnalyticsAdapter.invokeMethod AdUnitExposure", (Throwable) e);
                }
                return Unit.a;
            case 9:
                px5 px5Var8 = px5.a;
                boolean z10 = this.a;
                if (!z10) {
                    ybh.y(obj);
                    gdj gdjVar = ((on2) this.b).l;
                    os2 os2Var = new os2((d3k) this.c, (byte) 1);
                    this.a = true;
                    if (gdjVar.collect(os2Var, this) == px5Var8) {
                        return px5Var8;
                    }
                } else {
                    if (!z10) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                t3p.v();
                return null;
            case 10:
                px5 px5Var9 = px5.a;
                boolean z11 = this.a;
                if (!z11) {
                    ybh.y(obj);
                    glp glpVar = ((h21) this.b).f;
                    if (glpVar != null) {
                        Map allHeaders = ((UrlResponseInfo) this.c).getAllHeaders();
                        this.a = true;
                        if (glpVar.a(allHeaders, (mt5) this) == px5Var9) {
                            return px5Var9;
                        }
                    }
                } else {
                    if (!z11) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            default:
                px5 px5Var10 = px5.a;
                boolean z12 = this.a;
                if (!z12) {
                    ybh.y(obj);
                    bz0 bz0Var = (bz0) this.b;
                    this.a = true;
                    obj = bz0Var.e.A(this);
                    if (obj == px5Var10) {
                        return px5Var10;
                    }
                } else {
                    if (!z12) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                String str2 = (String) obj;
                if (str2 == null) {
                    throw new mv0(new ev0("Immersive video media data does not exist.", ae1.a));
                }
                ((it1) this.c).r.putString("mediaUrl", str2);
                return Unit.a;
        }
    }
}
