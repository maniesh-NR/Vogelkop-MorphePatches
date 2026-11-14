package defpackage;

import ads_mobile_sdk.a2;
import ads_mobile_sdk.av0;
import ads_mobile_sdk.bn0;
import ads_mobile_sdk.cy0;
import ads_mobile_sdk.gn0;
import ads_mobile_sdk.hg0;
import ads_mobile_sdk.kn;
import ads_mobile_sdk.sb;
import ads_mobile_sdk.sy0;
import ads_mobile_sdk.ue1;
import ads_mobile_sdk.xu0;
import ads_mobile_sdk.ym0;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bhj extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public Object w;
    public final /* synthetic */ Object x;
    public Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhj(gn0 gn0Var, ym0 ym0Var, Bundle bundle, String str, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 6;
        this.v = gn0Var;
        this.w = ym0Var;
        this.y = bundle;
        this.x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bhj(Object obj, Serializable serializable, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
        this.x = serializable;
        this.y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bhj(Object obj, Object obj2, Object obj3, Object obj4, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bhj(String str, Object obj, mt5 mt5Var, Object obj2, Object obj3, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.x = str;
        this.v = obj;
        this.w = obj2;
        this.y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhj(String str, String str2, UUID uuid, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 10;
        this.x = str;
        this.w = str2;
        this.y = uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhj(mt5 mt5Var, on onVar, sb sbVar, Set set) {
        super(2, mt5Var);
        this.t = (byte) 8;
        this.v = onVar;
        this.w = sbVar;
        this.x = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhj(shf shfVar, String str, String str2, String str3, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 2;
        this.v = shfVar;
        this.x = str;
        this.w = str2;
        this.y = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhj(w6o w6oVar, String str, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 5;
        this.y = w6oVar;
        this.x = str;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                return new bhj(this.v, this.w, obj2, this.y, mt5Var, (byte) 0);
            case 1:
                bhj bhjVar = new bhj(this.w, (Serializable) obj2, this.y, mt5Var, (byte) 1);
                bhjVar.v = obj;
                return bhjVar;
            case 2:
                return new bhj((shf) this.v, (String) obj2, (String) this.w, (String) this.y, mt5Var);
            case 3:
                bhj bhjVar2 = new bhj(this.w, (Serializable) obj2, this.y, mt5Var, (byte) 3);
                bhjVar2.v = obj;
                return bhjVar2;
            case 4:
                return new bhj(this.v, this.w, obj2, this.y, mt5Var, (byte) 4);
            case 5:
                return new bhj((w6o) this.y, (String) obj2, mt5Var);
            case 6:
                return new bhj((gn0) this.v, (ym0) this.w, (Bundle) this.y, (String) obj2, mt5Var);
            case 7:
                return new bhj((String) obj2, this.v, mt5Var, this.w, this.y, (byte) 7);
            case 8:
                return new bhj(mt5Var, (on) this.v, (sb) this.w, (Set) obj2);
            case 9:
                return new bhj(this.v, this.w, obj2, this.y, mt5Var, (byte) 9);
            case 10:
                bhj bhjVar3 = new bhj((String) obj2, (String) this.w, (UUID) this.y, mt5Var);
                bhjVar3.v = obj;
                return bhjVar3;
            default:
                return new bhj((String) obj2, this.v, mt5Var, this.w, this.y, (byte) 11);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((syh) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 5:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 6:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 7:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 8:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 9:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 10:
                return create((ue1) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objI;
        Boolean bool;
        Object objA;
        nak nakVar;
        on onVar;
        Object objA2;
        byte b = this.t;
        Object obj3 = this.x;
        byte b2 = 1;
        switch (b) {
            case 0:
                i9c i9cVar = (i9c) this.y;
                String str = (String) obj3;
                kvh kvhVar = (kvh) this.w;
                ehj ehjVar = (ehj) this.v;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    esd esdVar = ehj.j;
                    obj2 = ((t0i) vtp.R(((t9f) ehjVar.c.getValue()).c(kvhVar), new bli((byte) 21), new bli((byte) 22), 0, 0L, 120)).a;
                    if (str != null && (t0i.d(obj2) instanceof fgj)) {
                        ghj ghjVar = (ghj) i9cVar.d;
                        ghjVar.e = null;
                        String str2 = (String) i9cVar.g;
                        if (str2 != null) {
                            i9cVar.g = null;
                            ghjVar.b(str2);
                        }
                        fvh fvhVarB = kvhVar.b();
                        this.u = true;
                        objI = ehjVar.i(fvhVarB, i9cVar, str, this);
                        if (objI == px5Var) {
                            return px5Var;
                        }
                    }
                    return new t0i(obj2);
                }
                if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                objI = ((t0i) obj).a;
                obj2 = objI;
                return new t0i(obj2);
            case 1:
                syh syhVar = (syh) this.v;
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                fl6 fl6Var = (fl6) this.y;
                this.v = null;
                this.u = true;
                Object objL = uyg.l((shk) this.w, (ArrayList) obj3, fl6Var, syhVar, this);
                return objL == px5Var2 ? px5Var2 : objL;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (z3) {
                    if (z3) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                shf shfVar = (shf) this.v;
                String str3 = (String) this.w;
                String str4 = (String) this.y;
                this.u = true;
                nh4 nh4Var = new nh4(1, hib.b(this));
                nh4Var.s();
                ((wth) shfVar.a).w(new ay1((String) obj3, str3, str4, shfVar, new bha(nh4Var, (byte) 8), (byte) 4));
                Object objQ = nh4Var.q();
                return objQ == px5Var3 ? px5Var3 : objQ;
            case 3:
                pmg pmgVar = (pmg) this.w;
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    x1j x1jVar = new x1j((nx5) this.v, new lwg(pmgVar), (dk7) obj3, (Function1) this.y, null);
                    this.u = true;
                    if (z4o.n(pmgVar, x1jVar, this) == px5Var4) {
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
                wl9 wl9Var = (wl9) this.y;
                ndc ndcVar = (ndc) obj3;
                hoh hohVar = (hoh) this.w;
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                try {
                    if (!z5) {
                        ybh.y(obj);
                        aae aaeVar = (aae) ((pqh) this.v).a;
                        if (aaeVar != null) {
                            aaeVar.b = sgb.b(hohVar.x);
                        }
                        this.u = true;
                        Object objZ = na2.Z(hohVar.a, new r71(hohVar, new goh(hohVar, null), zi4.C(getContext()), null, (byte) 9), this);
                        if (objZ != px5Var5) {
                            objZ = Unit.a;
                        }
                        if (objZ != px5Var5) {
                            objZ = Unit.a;
                        }
                        if (objZ == px5Var5) {
                            return px5Var5;
                        }
                    } else {
                        if (!z5) {
                            qp2.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybh.y(obj);
                    }
                    ndcVar.getLifecycle().b(wl9Var);
                    return Unit.a;
                } catch (Throwable th) {
                    ndcVar.getLifecycle().b(wl9Var);
                    throw th;
                }
            case 5:
                w6o w6oVar = (w6o) this.y;
                px5 px5Var6 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    bool = (Boolean) w6oVar.c.d.g();
                    nak nakVar2 = w6oVar.i;
                    this.v = bool;
                    this.w = nakVar2;
                    this.u = true;
                    objA = w6oVar.a((String) obj3, this);
                    if (objA == px5Var6) {
                        return px5Var6;
                    }
                    nakVar = nakVar2;
                } else {
                    if (!z6) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nakVar = (nak) this.w;
                    Boolean bool2 = (Boolean) this.v;
                    ybh.y(obj);
                    bool = bool2;
                    objA = obj;
                }
                Set set = (Set) objA;
                if (set.isEmpty()) {
                    objA = null;
                } else if (bool.booleanValue()) {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            if (w6oVar.b(((r7o) it.next()).b)) {
                                objA = null;
                            }
                        }
                    }
                }
                Set set3 = (Set) objA;
                rk4 rk4Var = set3 != null ? new rk4(set3) : wze.a;
                nakVar.getClass();
                nakVar.k((Object) null, rk4Var);
                return Unit.a;
            case 6:
                Unit unit = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    bn0 bn0Var = ((gn0) this.v).a;
                    this.u = true;
                    bn0Var.getClass();
                    if (bn0.a(bn0Var, (ym0) this.w, (Bundle) this.y, (String) obj3) == unit) {
                        return unit;
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
                px5 px5Var7 = px5.a;
                boolean z8 = this.u;
                if (!z8) {
                    ybh.y(obj);
                    vr3 vr3Var = xu0.a;
                    sko.t("Invoking function [onAdFailedToLoad] on listener [", (String) obj3, "]", (Throwable) null);
                    r7p r7pVar = (r7p) this.v;
                    av0 av0Var = (av0) this.w;
                    xzh xzhVar = (xzh) this.y;
                    this.u = true;
                    if (r7pVar.a(av0Var, xzhVar, this) == px5Var7) {
                        return px5Var7;
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
                px5 px5Var8 = px5.a;
                boolean z9 = this.u;
                if (!z9) {
                    ybh.y(obj);
                    onVar = (on) this.v;
                    sb sbVar = (sb) this.w;
                    this.y = onVar;
                    this.u = true;
                    sbVar.getClass();
                    objA2 = sb.a(sbVar, (Set) obj3, (nt5) this);
                    if (objA2 == px5Var8) {
                        return px5Var8;
                    }
                } else {
                    if (!z9) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    on onVar2 = (on) this.y;
                    ybh.y(obj);
                    onVar = onVar2;
                    objA2 = obj;
                }
                vml.e(new pn(onVar.a, b2));
                return Unit.a;
            case 9:
                px5 px5Var9 = px5.a;
                boolean z10 = this.u;
                if (!z10) {
                    ybh.y(obj);
                    kn knVar = (kn) this.v;
                    sy0 sy0Var = (sy0) this.w;
                    a2 a2Var = knVar.f;
                    hg0 hg0VarB = ((fyo) obj3).b();
                    this.u = true;
                    if (bfp.c(knVar, sy0Var, a2Var, hg0VarB, this) == px5Var9) {
                        return px5Var9;
                    }
                } else {
                    if (!z10) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                ((cy0) this.y).onPause();
                return Unit.a;
            case 10:
                px5 px5Var10 = px5.a;
                boolean z11 = this.u;
                if (z11) {
                    if (z11) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                ue1 ue1Var = (ue1) this.v;
                String str5 = (String) this.w;
                UUID uuid = (UUID) this.y;
                this.u = true;
                ue1Var.getClass();
                Object objA3 = ue1.a(ue1Var, (String) obj3, str5, uuid, this);
                return objA3 == px5Var10 ? px5Var10 : objA3;
            default:
                Unit unit2 = px5.a;
                boolean z12 = this.u;
                if (!z12) {
                    ybh.y(obj);
                    vr3 vr3Var2 = xu0.a;
                    sko.t("Invoking function [onAppEvent] on listener [", (String) obj3, "]", (Throwable) null);
                    rko rkoVar = (rko) this.v;
                    String str6 = (String) this.w;
                    String str7 = (String) this.y;
                    this.u = true;
                    if (rkoVar.a(str6, str7, this) == unit2) {
                        return unit2;
                    }
                } else {
                    if (!z12) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
        }
    }
}
