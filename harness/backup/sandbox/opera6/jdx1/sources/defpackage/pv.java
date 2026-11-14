package defpackage;

import ads_mobile_sdk.e3;
import ads_mobile_sdk.vz;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class pv extends kuk implements Function1 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv(byte b, mt5 mt5Var, Object obj) {
        super(1, mt5Var);
        this.t = b;
        this.v = obj;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        Object obj = this.v;
        switch (b) {
            case 0:
                return new pv((byte) 0, mt5Var, (qv) obj);
            case 1:
                return new pv((byte) 1, mt5Var, (dp6) obj);
            case 2:
                return new pv((byte) 2, mt5Var, (ra4) obj);
            case 3:
                return new pv((byte) 3, mt5Var, (rj4) obj);
            case 4:
                return new pv((byte) 4, mt5Var, (tdj) obj);
            case 5:
                return new pv((byte) 5, mt5Var, (dj2) obj);
            case 6:
                return new pv((byte) 6, mt5Var, (tl7) obj);
            case 7:
                return new pv((byte) 7, mt5Var, (qe6) obj);
            case 8:
                return new pv((byte) 8, mt5Var, (d06) obj);
            case 9:
                return new pv((byte) 9, mt5Var, (qb7) obj);
            case 10:
                return new pv((byte) 10, mt5Var, (ot6) obj);
            case 11:
                return new pv((byte) 11, mt5Var, (fr6) obj);
            case 12:
                return new pv((byte) 12, mt5Var, (pad) obj);
            case 13:
                return new pv((byte) 13, mt5Var, (ala) obj);
            case 14:
                return new pv((byte) 14, mt5Var, (k51) obj);
            case 15:
                return new pv((byte) 15, mt5Var, (Function1) obj);
            case 16:
                return new pv((byte) 16, mt5Var, (rr1) obj);
            case 17:
                return new pv((byte) 17, mt5Var, (gmc) obj);
            case 18:
                return new pv((byte) 18, mt5Var, (cck) obj);
            case 19:
                return new pv((byte) 19, mt5Var, (rbi) obj);
            case 20:
                return new pv((byte) 20, mt5Var, (ztl) obj);
            case 21:
                return new pv((byte) 21, mt5Var, (ism) obj);
            case 22:
                return new pv((byte) 22, mt5Var, (i07) obj);
            case 23:
                return new pv((byte) 23, mt5Var, (e3) obj);
            default:
                return new pv((byte) 24, mt5Var, (Application) obj);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.t;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 1:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 2:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 3:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 4:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 5:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 6:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 7:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 8:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 9:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 10:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 11:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 12:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 13:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 14:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 15:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 16:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 17:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 18:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 19:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 20:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 21:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 22:
                return new pv((byte) 22, (mt5) obj, (i07) obj2).invokeSuspend(Unit.a);
            case 23:
                return new pv((byte) 23, (mt5) obj, (e3) obj2).invokeSuspend(Unit.a);
            default:
                return create((mt5) obj).invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kbb */
    public final Object invokeSuspend(Object obj) throws m2, kbb {
        Context context;
        final byte b = 0;
        mt5 mt5Var = null;
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (z) {
                    if (z) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                qv qvVar = (qv) this.v;
                c5o c5oVar = (c5o) qvVar.e;
                Map mapB = qvVar.b();
                this.u = true;
                Object objB = ((eqa) c5oVar.a).b(((u7d) c5oVar.b).a() + "/tcfac/acp.json", mapB, this);
                return objB == px5Var ? px5Var : objB;
            case 1:
                Enum r0 = px5.a;
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
                ne5 ne5VarA = ((dp6) this.v).a();
                this.u = true;
                Enum enumH = ne5VarA.H(this);
                return enumH == r0 ? r0 : enumH;
            case 2:
                px5 px5Var2 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    ra4 ra4Var = (ra4) this.v;
                    this.u = true;
                    Object objA = ra4Var.l.A(this);
                    if (objA != px5Var2) {
                        objA = Unit.a;
                    }
                    if (objA == px5Var2) {
                        return px5Var2;
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
                px5 px5Var3 = px5.a;
                boolean z4 = this.u;
                if (z4) {
                    if (z4) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                rj4 rj4Var = (rj4) this.v;
                this.u = true;
                Object objG = rj4Var.g(this);
                return objG == px5Var3 ? px5Var3 : objG;
            case 4:
                Unit unit = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    tdj tdjVar = (tdj) this.v;
                    this.u = true;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) tdjVar.e.getValue()).edit();
                    LinkedHashSet linkedHashSet = tdjVar.f;
                    if (linkedHashSet == null) {
                        editorEdit.clear();
                    } else {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove((String) it.next());
                        }
                    }
                    if (!editorEdit.commit()) {
                        s49.m("Unable to delete migrated keys from SharedPreferences.");
                        return null;
                    }
                    if (((SharedPreferences) tdjVar.e.getValue()).getAll().isEmpty() && (context = tdjVar.c) != null) {
                        context.deleteSharedPreferences(tdjVar.d);
                    }
                    if (linkedHashSet != null) {
                        linkedHashSet.clear();
                    }
                    if (Unit.a == unit) {
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
                px5 px5Var4 = px5.a;
                boolean z6 = this.u;
                if (z6) {
                    if (z6) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                dj2 dj2Var = (dj2) this.v;
                this.u = true;
                Object objInvoke = dj2Var.invoke(this);
                return objInvoke == px5Var4 ? px5Var4 : objInvoke;
            case 6:
                va1 va1Var = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    uqh.a(ggb.class);
                    r51 r51Var = (tl7) this.v;
                    this.u = true;
                    r51 r51Var2 = r51Var;
                    r51Var2.getClass();
                    va1 va1Var2 = new va1(new yo9(r51Var2.a, "momi.db", new q51(new hp2((byte) 12), new a50[0]), false, false), null, 20);
                    if (va1Var2 == va1Var) {
                        return va1Var;
                    }
                    obj = va1Var2;
                } else {
                    if (!z7) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                uqh.a(ggb.class);
                return new ggb((va1) obj);
            case 7:
                px5 px5Var5 = px5.a;
                boolean z8 = this.u;
                if (z8) {
                    if (z8) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                jg8 jg8Var = (jg8) vml.e.d;
                bz1 bz1Var = new bz1((byte) 5, (mt5) null, (qe6) this.v);
                this.u = true;
                Object objZ = na2.Z(jg8Var, bz1Var, this);
                return objZ == px5Var5 ? px5Var5 : objZ;
            case 8:
                px5 px5Var6 = px5.a;
                boolean z9 = this.u;
                if (!z9) {
                    ybh.y(obj);
                    ip6 ip6Var = (ip6) ((d06) this.v).a;
                    this.u = true;
                    Object objC = ip6Var.a.c(this);
                    if (objC != px5Var6) {
                        objC = Unit.a;
                    }
                    if (objC == px5Var6) {
                        return px5Var6;
                    }
                } else {
                    if (!z9) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 9:
                Enum r02 = px5.a;
                boolean z10 = this.u;
                if (z10) {
                    if (z10) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                ne5 ne5Var = (ne5) ((qb7) this.v).c;
                this.u = true;
                Enum enumH2 = ne5Var.H(this);
                return enumH2 == r02 ? r02 : enumH2;
            case 10:
                Enum r03 = px5.a;
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
                ne5 ne5Var2 = ((ot6) this.v).e;
                this.u = true;
                Enum enumH3 = ne5Var2.H(this);
                return enumH3 == r03 ? r03 : enumH3;
            case 11:
                px5 px5Var7 = px5.a;
                boolean z12 = this.u;
                if (!z12) {
                    ybh.y(obj);
                    fr6 fr6Var = (fr6) this.v;
                    this.u = true;
                    obj = kfo.w(fr6Var, Charsets.UTF_8, this);
                    if (obj == px5Var7) {
                        return px5Var7;
                    }
                } else {
                    if (!z12) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                crb crbVar = grb.a;
                crbVar.getClass();
                return crbVar.a((String) obj, ji1.Companion.serializer());
            case 12:
                px5 px5Var8 = px5.a;
                boolean z13 = this.u;
                if (!z13) {
                    ybh.y(obj);
                    if (!fr3.Q((Context) ((pad) this.v).b, "android.permission.ACCESS_COARSE_LOCATION") && !fr3.Q((Context) ((pad) this.v).b, "android.permission.ACCESS_FINE_LOCATION")) {
                        throw new kbb();
                    }
                    if (((LocationManager) ((zyk) ((pad) this.v).c).getValue()).isProviderEnabled("network")) {
                        pad padVar = (pad) this.v;
                        this.u = true;
                        nh4 nh4Var = new nh4(1, hib.b(this));
                        nh4Var.s();
                        CancellationSignal cancellationSignal = new CancellationSignal();
                        nh4Var.u(new v91(cancellationSignal, (byte) 6));
                        LocationManager locationManager = (LocationManager) ((zyk) padVar.c).getValue();
                        Executor mainExecutor = ((Context) padVar.b).getMainExecutor();
                        final ms7 ms7Var = new ms7(nh4Var, (byte) 3);
                        int i = uxc.a;
                        if (Build.VERSION.SDK_INT >= 30) {
                            r9n.k(locationManager, cancellationSignal, mainExecutor, ms7Var);
                        } else {
                            cancellationSignal.throwIfCanceled();
                            final Location lastKnownLocation = locationManager.getLastKnownLocation("network");
                            if (lastKnownLocation == null || SystemClock.elapsedRealtime() - (lastKnownLocation.getElapsedRealtimeNanos() / 1000000) >= 10000) {
                                txc txcVar = new txc(locationManager, mainExecutor, ms7Var);
                                locationManager.requestLocationUpdates("network", 0L, 0.0f, (LocationListener) txcVar, Looper.getMainLooper());
                                cancellationSignal.setOnCancelListener(new mg5(txcVar, (byte) 3));
                                synchronized (txcVar) {
                                    if (!txcVar.e) {
                                        Runnable dnbVar = new dnb(txcVar, (byte) 13);
                                        txcVar.f = dnbVar;
                                        txcVar.c.postDelayed(dnbVar, 30000L);
                                    }
                                }
                            } else {
                                mainExecutor.execute(new Runnable() { // from class: sxc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b2 = b;
                                        Location location = lastKnownLocation;
                                        ms7 ms7Var2 = ms7Var;
                                        switch (b2) {
                                            case 0:
                                                ms7Var2.accept(location);
                                                break;
                                            default:
                                                ms7Var2.accept(location);
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                        Object objQ = nh4Var.q();
                        return objQ == px5Var8 ? px5Var8 : objQ;
                    }
                } else {
                    if (z13) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 13:
                px5 px5Var9 = px5.a;
                boolean z14 = this.u;
                if (z14) {
                    if (z14) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                plh plhVar = (plh) ((d06) ((ala) this.v).c).a;
                this.u = true;
                Object objE = cs5.E(plhVar, this);
                return objE == px5Var9 ? px5Var9 : objE;
            case 14:
                px5 px5Var10 = px5.a;
                boolean z15 = this.u;
                if (z15) {
                    if (z15) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                Function1 function1 = (k51) this.v;
                this.u = true;
                Object objT = zi4.C(getContext()).t(function1, this);
                return objT == px5Var10 ? px5Var10 : objT;
            case 15:
                px5 px5Var11 = px5.a;
                boolean z16 = this.u;
                if (z16) {
                    if (z16) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                Function1 function12 = (Function1) this.v;
                this.u = true;
                Object objT2 = zi4.C(getContext()).t(function12, this);
                return objT2 == px5Var11 ? px5Var11 : objT2;
            case 16:
                rr1 rr1Var = (rr1) this.v;
                px5 px5Var12 = px5.a;
                boolean z17 = this.u;
                if (!z17) {
                    ybh.y(obj);
                    rf4 rf4Var = new rf4((byte) 9, mt5Var, rr1Var);
                    this.u = true;
                    obj = rr1Var.F0(rf4Var, this);
                    if (obj == px5Var12) {
                        return px5Var12;
                    }
                } else {
                    if (!z17) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                ((Number) obj).longValue();
                rr1Var.u0(-591856194, new g8c((byte) 2));
                return obj;
            case 17:
                px5 px5Var13 = px5.a;
                boolean z18 = this.u;
                if (!z18) {
                    ybh.y(obj);
                    wlc wlcVar = (wlc) ((gmc) this.v).a.get();
                    List listSingletonList = Collections.singletonList(oi9.f);
                    this.u = true;
                    if (wlcVar.b(listSingletonList, this) == px5Var13) {
                        return px5Var13;
                    }
                } else {
                    if (!z18) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 18:
                px5 px5Var14 = px5.a;
                boolean z19 = this.u;
                if (z19) {
                    if (z19) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                cck cckVar = (cck) this.v;
                this.u = true;
                Object objC2 = cckVar.c(this);
                return objC2 == px5Var14 ? px5Var14 : objC2;
            case 19:
                px5 px5Var15 = px5.a;
                boolean z20 = this.u;
                if (z20) {
                    if (z20) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                rbi rbiVar = (rbi) this.v;
                d7h d7hVar = (d7h) rbiVar.e;
                Map mapB2 = rbiVar.b();
                this.u = true;
                Object objB2 = ((eqa) d7hVar.b).b(sko.u(((u7d) d7hVar.c).a(), "/gvl/v3/en.json"), mapB2, this);
                return objB2 == px5Var15 ? px5Var15 : objB2;
            case 20:
                px5 px5Var16 = px5.a;
                boolean z21 = this.u;
                if (!z21) {
                    ybh.y(obj);
                    ztl ztlVar = (ztl) this.v;
                    this.u = true;
                    nh4 nh4Var2 = new nh4(1, hib.b(this));
                    nh4Var2.s();
                    ztlVar.b.c.setValue(Boolean.TRUE);
                    ztlVar.c = nh4Var2;
                    if (nh4Var2.q() == px5Var16) {
                        return px5Var16;
                    }
                } else {
                    if (!z21) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 21:
                px5 px5Var17 = px5.a;
                boolean z22 = this.u;
                try {
                    if (!z22) {
                        ybh.y(obj);
                        nd4 nd4VarA = ((ism) this.v).c.a();
                        this.u = true;
                        obj = nd4VarA.k(this);
                        if (obj == px5Var17) {
                            return px5Var17;
                        }
                    } else {
                        if (!z22) {
                            qp2.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybh.y(obj);
                    }
                    AutoCloseable autoCloseable = (AutoCloseable) obj;
                    try {
                        cd5 cd5VarM = ((qd4) autoCloseable).m();
                        fr3.t(autoCloseable, null);
                        return cd5VarM;
                    } finally {
                    }
                } catch (CancellationException unused) {
                    return ism.l;
                }
            case 22:
                px5 px5Var18 = px5.a;
                boolean z23 = this.u;
                if (z23) {
                    if (z23) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                i07 i07Var = (i07) this.v;
                this.u = true;
                Object objA2 = i07Var.A(this);
                return objA2 == px5Var18 ? px5Var18 : objA2;
            case 23:
                px5 px5Var19 = px5.a;
                boolean z24 = this.u;
                if (z24) {
                    if (z24) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                vz vzVar = ((e3) this.v).l;
                this.u = true;
                Object objW = vzVar.w(this);
                return objW == px5Var19 ? px5Var19 : objW;
            default:
                px5 px5Var20 = px5.a;
                boolean z25 = this.u;
                if (!z25) {
                    ybh.y(obj);
                    cv6 cv6Var = bb7.a;
                    d7a d7aVar = s6d.a;
                    dno dnoVar = new dno((Application) this.v, (mt5) null, (byte) 0);
                    this.u = true;
                    obj = na2.Z(d7aVar, dnoVar, this);
                    if (obj == px5Var20) {
                        return px5Var20;
                    }
                } else {
                    if (!z25) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                exo exoVar = (exo) obj;
                nxg.g("scheduleSend", "sending data for events, size: " + exoVar.f.size());
                dap dapVar = dap.a;
                dap.d("https://t.adx.opera.com/sdk/event", new cno(exoVar, (byte) 0), k0l.I, cdp.Iq);
                return exoVar.f;
        }
    }
}
