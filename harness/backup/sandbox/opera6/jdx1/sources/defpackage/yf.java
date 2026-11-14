package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class yf extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                return new yf((byte) 0, mt5Var, (zf) obj2);
            case 1:
                return new yf((byte) 1, mt5Var, (at1) obj2);
            case 2:
                return new yf((byte) 2, mt5Var, (xv1) obj2);
            case 3:
                return new yf((byte) 3, mt5Var, (igi) obj2);
            case 4:
                return new yf((byte) 4, mt5Var, (d44) obj2);
            case 5:
                return new yf((byte) 5, mt5Var, (BrowserActivity) obj2);
            case 6:
                return new yf((byte) 6, mt5Var, (oa4) obj2);
            case 7:
                return new yf((byte) 7, mt5Var, (mb4) obj2);
            case 8:
                return new yf((byte) 8, mt5Var, (z21) obj2);
            case 9:
                return new yf((byte) 9, mt5Var, (u0i) obj2);
            case 10:
                return new yf((byte) 10, mt5Var, (ie6) obj2);
            case 11:
                return new yf((byte) 11, mt5Var, (mn6) obj2);
            case 12:
                return new yf((byte) 12, mt5Var, (xm5) obj2);
            case 13:
                return new yf((byte) 13, mt5Var, (x77) obj2);
            case 14:
                return new yf((byte) 14, mt5Var, (qe6) obj2);
            case 15:
                return new yf((byte) 15, mt5Var, (eq6) obj2);
            case 16:
                return new yf((byte) 16, mt5Var, (k5o) obj2);
            case 17:
                return new yf((byte) 17, mt5Var, (qb7) obj2);
            case 18:
                yf yfVar = new yf((byte) 18, mt5Var, (l45) obj2);
                yfVar.u = ((Boolean) obj).booleanValue();
                return yfVar;
            case 19:
                return new yf((byte) 19, mt5Var, (x47) obj2);
            case 20:
                return new yf((byte) 20, mt5Var, (k73) obj2);
            case 21:
                return new yf((byte) 21, mt5Var, (r98) obj2);
            case 22:
                return new yf((byte) 22, mt5Var, (f99) obj2);
            case 23:
                return new yf((byte) 23, mt5Var, (ah9) obj2);
            case 24:
                return new yf((byte) 24, mt5Var, (cd2) obj2);
            case 25:
                yf yfVar2 = new yf((byte) 25, mt5Var, (ti9) obj2);
                yfVar2.u = ((Boolean) obj).booleanValue();
                return yfVar2;
            case 26:
                return new yf((byte) 26, mt5Var, (z8b) obj2);
            case 27:
                yf yfVar3 = new yf((byte) 27, mt5Var, (i16) obj2);
                yfVar3.u = ((Boolean) obj).booleanValue();
                return yfVar3;
            case 28:
                return new yf((byte) 28, mt5Var, (tah) obj2);
            default:
                return new yf((byte) 29, mt5Var, (fr6) obj2);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws m2, pxb {
        byte b = this.t;
        Object obj3 = this.v;
        switch (b) {
            case 18:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                yf yfVar = new yf((byte) 18, (mt5) obj2, (l45) obj3);
                yfVar.u = zBooleanValue;
                break;
            case 25:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                yf yfVar2 = new yf((byte) 25, (mt5) obj2, (ti9) obj3);
                yfVar2.u = zBooleanValue2;
                break;
            case 26:
                create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
                break;
            case 27:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                yf yfVar3 = new yf((byte) 27, (mt5) obj2, (i16) obj3);
                yfVar3.u = zBooleanValue3;
                break;
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws m2, pxb {
        agf agfVar;
        byte b = this.t;
        byte b2 = 2;
        Object obj2 = this.v;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                zf zfVar = (zf) obj2;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    nak nakVar = zfVar.a.t;
                    xf xfVar = new xf(2, (mt5) null, (byte) 0);
                    this.u = true;
                    if (cs5.F(nakVar, xfVar, this) == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                zfVar.d.k();
                return Unit.a;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    r2i r2iVar = ((at1) obj2).m;
                    this.u = true;
                    if (r2iVar.c(this) == px5Var2) {
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
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    plh plhVar = ((lpe) ((xv1) obj2).i0.get()).s;
                    this.u = true;
                    obj = cs5.E(plhVar, this);
                    if (obj == px5Var3) {
                        return px5Var3;
                    }
                } else {
                    if (!z3) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return ((i1a) obj).b();
            case 3:
                igi igiVar = (igi) obj2;
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    igiVar.getClass();
                    this.u = true;
                    if (nb6.p(5000L, this) == px5Var4) {
                        return px5Var4;
                    }
                } else {
                    if (!z4) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                if (!((hx5) igiVar.b).h()) {
                    d3k d3kVar = (d3k) igiVar.f;
                    if (d3kVar != null) {
                        d3kVar.k((CancellationException) null);
                    }
                    igiVar.f = null;
                }
                return Unit.a;
            case 4:
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                if (z5) {
                    if (z5) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                this.u = true;
                c44 c44Var = d44.a;
                Object objG = ((d44) obj2).g(1, this);
                return objG == px5Var5 ? px5Var5 : objG;
            case 5:
                px5 px5Var6 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    this.u = true;
                    int i = BrowserActivity.E1;
                    if (((BrowserActivity) obj2).V0(this) == px5Var6) {
                        return px5Var6;
                    }
                } else {
                    if (!z6) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 6:
                px5 px5Var7 = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    oa4 oa4Var = (oa4) obj2;
                    j94 j94Var = oa4Var.j;
                    o71 o71Var = new o71(oa4Var, (byte) 1);
                    this.u = true;
                    if (j94Var.collect(o71Var, this) == px5Var7) {
                        return px5Var7;
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
                px5 px5Var8 = px5.a;
                boolean z8 = this.u;
                if (!z8) {
                    ybh.y(obj);
                    this.u = true;
                    LinkedHashMap linkedHashMap = ((mb4) obj2).d;
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        t94 t94Var = (t94) ((Map.Entry) it.next()).getValue();
                        sgb.k(t94Var.b.f, null);
                        arrayList.add(na2.g(t94Var.a.a, null, null, new hz1((byte) 3, (mt5) null, t94Var), 3));
                    }
                    Object objB0 = cs5.b0(arrayList, this);
                    if (objB0 != px5.a) {
                        objB0 = Unit.a;
                    }
                    if (objB0 == px5Var8) {
                        return px5Var8;
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
                z21 z21Var = (z21) obj2;
                px5 px5Var9 = px5.a;
                boolean z9 = this.u;
                if (!z9) {
                    ybh.y(obj);
                    nak nakVar2 = z21Var.t;
                    xf xfVar2 = new xf(2, (mt5) null, (byte) 4);
                    this.u = true;
                    obj = cs5.F(nakVar2, xfVar2, this);
                    if (obj == px5Var9) {
                        return px5Var9;
                    }
                } else {
                    if (!z9) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                kf4 kf4Var = (kf4) obj;
                if (kf4Var instanceof pf4) {
                    agfVar = new agf(z21Var, null, 2);
                } else if (kf4Var instanceof of4) {
                    z21Var.a();
                    agfVar = new agf(null, ((of4) kf4Var).a, 1);
                } else {
                    if (!(kf4Var instanceof nf4)) {
                        if (!(kf4Var instanceof vf4)) {
                            h9o.p();
                            return null;
                        }
                        z21Var.a();
                        pza.i(kf4Var, "Unexpected CameraState: ");
                        return null;
                    }
                    z21Var.a();
                    agfVar = new agf(null, ((nf4) kf4Var).i, 1);
                }
                return agfVar;
            case 9:
                px5 px5Var10 = px5.a;
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
                cd5 cd5Var = ((u0i) obj2).c;
                this.u = true;
                Object objA = cd5Var.A(this);
                return objA == px5Var10 ? px5Var10 : objA;
            case 10:
                px5 px5Var11 = px5.a;
                boolean z11 = this.u;
                if (!z11) {
                    ybh.y(obj);
                    this.u = true;
                    if (((ie6) obj2).e(this) == px5Var11) {
                        return px5Var11;
                    }
                } else {
                    if (!z11) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 11:
                px5 px5Var12 = px5.a;
                boolean z12 = this.u;
                if (z12) {
                    if (z12) {
                        ybh.y(obj);
                        return Unit.a;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                nqh nqhVar = new nqh();
                nqh nqhVar2 = new nqh();
                nqh nqhVar3 = new nqh();
                mn6 mn6Var = (mn6) obj2;
                jdj jdjVar = mn6Var.o.a;
                as4 as4Var = new as4(nqhVar, nqhVar2, nqhVar3, mn6Var, (byte) 3);
                this.u = true;
                jdjVar.collect(as4Var, this);
                return px5Var12;
            case 12:
                px5 px5Var13 = px5.a;
                boolean z13 = this.u;
                if (!z13) {
                    ybh.y(obj);
                    this.u = true;
                    Object objZ = ((xm5) obj2).z(this);
                    return objZ == px5Var13 ? px5Var13 : objZ;
                }
                if (z13) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                px5 px5Var14 = px5.a;
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
                x77 x77Var = (x77) obj2;
                this.u = true;
                Object objZ2 = na2.Z((jg8) x77Var.c, new bz1((byte) 10, (mt5) null, x77Var), this);
                return objZ2 == px5Var14 ? px5Var14 : objZ2;
            case 14:
                px5 px5Var15 = px5.a;
                boolean z15 = this.u;
                if (!z15) {
                    ybh.y(obj);
                    this.u = true;
                    Object objO = ((qe6) obj2).O(this);
                    return objO == px5Var15 ? px5Var15 : objO;
                }
                if (z15) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                px5 px5Var16 = px5.a;
                boolean z16 = this.u;
                if (!z16) {
                    ybh.y(obj);
                    this.u = true;
                    Object objA2 = ((i88) ((eq6) obj2).a).a(this);
                    return objA2 == px5Var16 ? px5Var16 : objA2;
                }
                if (z16) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                px5 px5Var17 = px5.a;
                boolean z17 = this.u;
                if (z17) {
                    if (z17) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                k5o k5oVar = (k5o) obj2;
                this.u = true;
                Object objZ3 = na2.Z((jg8) k5oVar.b, new bz1((byte) 11, (mt5) null, k5oVar), this);
                return objZ3 == px5Var17 ? px5Var17 : objZ3;
            case 17:
                px5 px5Var18 = px5.a;
                boolean z18 = this.u;
                if (!z18) {
                    ybh.y(obj);
                    pv pvVar = new pv((byte) 9, mt5Var, (qb7) obj2);
                    this.u = true;
                    if (zch.A(pvVar, this) == px5Var18) {
                        return px5Var18;
                    }
                } else {
                    if (!z18) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    Object obj3 = ((t0i) obj).a;
                }
                return Unit.a;
            case 18:
                boolean z19 = this.u;
                px5 px5Var19 = px5.a;
                ybh.y(obj);
                dq6 dq6Var = (dq6) ((l45) obj2).c;
                if (!z19) {
                    d3k d3kVar2 = dq6Var.e;
                    if (d3kVar2 != null) {
                        d3kVar2.k((CancellationException) null);
                    }
                    dq6Var.e = null;
                } else if (dq6Var.e == null) {
                    dq6Var.e = na2.B(dq6Var.a, null, null, new rf4(b2, mt5Var, dq6Var), 3);
                }
                return Unit.a;
            case 19:
                px5 px5Var20 = px5.a;
                boolean z20 = this.u;
                if (!z20) {
                    ybh.y(obj);
                    this.u = true;
                    if (((x47) obj2).f(this) == px5Var20) {
                        return px5Var20;
                    }
                } else {
                    if (!z20) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 20:
                k73 k73Var = (k73) obj2;
                i07 i07Var = (i07) k73Var.e;
                px5 px5Var21 = px5.a;
                boolean z21 = this.u;
                if (!z21) {
                    ybh.y(obj);
                    if (i07Var.isActive()) {
                        this.u = true;
                        if (i07Var.Z(this) == px5Var21) {
                            return px5Var21;
                        }
                    }
                    pd6.a(17, (String) k73Var.b).delete();
                    return Unit.a;
                }
                if (!z21) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                pd6.a(17, (String) k73Var.b).delete();
                return Unit.a;
            case 21:
                px5 px5Var22 = px5.a;
                boolean z22 = this.u;
                if (z22) {
                    if (z22) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                String[] strArr = OperaApplication.K;
                f99 f99VarT = ((dp6) ((wbh) ((r98) obj2)).a.getApplicationContext().v.get()).b().t();
                this.u = true;
                Object objE = cs5.E(f99VarT, this);
                return objE == px5Var22 ? px5Var22 : objE;
            case 22:
                px5 px5Var23 = px5.a;
                boolean z23 = this.u;
                if (!z23) {
                    ybh.y(obj);
                    this.u = true;
                    Object objCollect = ((f99) obj2).collect(zze.a, this);
                    if (objCollect != px5Var23) {
                        objCollect = Unit.a;
                    }
                    if (objCollect == px5Var23) {
                        return px5Var23;
                    }
                } else {
                    if (!z23) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 23:
                px5 px5Var24 = px5.a;
                boolean z24 = this.u;
                if (!z24) {
                    ybh.y(obj);
                    this.u = true;
                    if (i41.g((ah9) obj2, null, this) == px5Var24) {
                        return px5Var24;
                    }
                } else {
                    if (!z24) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 24:
                px5 px5Var25 = px5.a;
                boolean z25 = this.u;
                if (!z25) {
                    ybh.y(obj);
                    this.u = true;
                    if (((cd2) obj2).b(this) == px5Var25) {
                        return px5Var25;
                    }
                } else {
                    if (!z25) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 25:
                boolean z26 = this.u;
                px5 px5Var26 = px5.a;
                ybh.y(obj);
                ti9 ti9Var = (ti9) obj2;
                hnc hncVar = ti9Var.c;
                kng kngVar = ti9Var.b;
                if (z26) {
                    if (!kngVar.c) {
                        kngVar.c = true;
                        kngVar.a();
                    }
                    if (!hncVar.r) {
                        hncVar.r = true;
                        if (hncVar.m == null) {
                            hncVar.b();
                        } else {
                            hncVar.p.B0(hncVar.b, 20L, TimeUnit.SECONDS);
                        }
                    }
                } else {
                    kngVar.c = false;
                    oml omlVar = kngVar.f;
                    if (omlVar != null) {
                        omlVar.cancel(false);
                        kngVar.f = null;
                    }
                    if (hncVar.r) {
                        hncVar.r = false;
                        hncVar.p.S();
                        q65 q65Var = hncVar.o;
                        if (q65Var != null) {
                            q65Var.S();
                        }
                        hncVar.o = null;
                    }
                }
                return Unit.a;
            case 26:
                px5 px5Var27 = px5.a;
                boolean z27 = this.u;
                if (z27) {
                    if (!z27) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    t3p.v();
                    return null;
                }
                ybh.y(obj);
                z8b z8bVar = (z8b) obj2;
                plh plhVar2 = ((v1a) z8bVar.a).f;
                o71 o71Var2 = new o71(z8bVar, (byte) 6);
                this.u = true;
                plhVar2.a.collect(o71Var2, this);
                return px5Var27;
            case 27:
                boolean z28 = this.u;
                px5 px5Var28 = px5.a;
                ybh.y(obj);
                ((i16) obj2).B(z28);
                return Unit.a;
            case 28:
                px5 px5Var29 = px5.a;
                boolean z29 = this.u;
                if (z29) {
                    if (z29) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                this.u = true;
                nh4 nh4Var = new nh4(1, hib.b(this));
                nh4Var.s();
                f03.T(((WebContentsWrapper) ((ChromiumContent) ((tah) obj2).d)).b, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new aha(nh4Var, (byte) 0), true);
                Object objQ = nh4Var.q();
                return objQ == px5Var29 ? px5Var29 : objQ;
            default:
                px5 px5Var30 = px5.a;
                boolean z30 = this.u;
                if (!z30) {
                    ybh.y(obj);
                    this.u = true;
                    Object objW = kfo.w((fr6) obj2, Charsets.UTF_8, this);
                    return objW == px5Var30 ? px5Var30 : objW;
                }
                if (z30) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
