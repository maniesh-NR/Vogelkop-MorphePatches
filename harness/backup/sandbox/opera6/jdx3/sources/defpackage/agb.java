package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class agb extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ agb(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ agb(Callback callback, boolean z, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = callback;
        this.u = z;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                return new agb((byte) 0, mt5Var, (dgb) obj2);
            case 1:
                return new agb((byte) 1, mt5Var, (rmb) obj2);
            case 2:
                return new agb((byte) 2, mt5Var, (c5o) obj2);
            case 3:
                return new agb((byte) 3, mt5Var, (gmc) obj2);
            case 4:
                return new agb((byte) 4, mt5Var, (acd) obj2);
            case 5:
                return new agb((byte) 5, mt5Var, (lrh) obj2);
            case 6:
                return new agb((byte) 6, mt5Var, (b6e) obj2);
            case 7:
                return new agb((byte) 7, mt5Var, (v6e) obj2);
            case 8:
                return new agb((byte) 8, mt5Var, (cd1) obj2);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new agb((byte) 9, mt5Var, (sae) obj2);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new agb((byte) 10, mt5Var, (cq5) obj2);
            case 11:
                return new agb((y0a) obj2, this.u, mt5Var, (byte) 11);
            case 12:
                return new agb((Callback) obj2, this.u, mt5Var, (byte) 12);
            case 13:
                return new agb((byte) 13, mt5Var, (z9f) obj2);
            case 14:
                return new agb((byte) 14, mt5Var, (OperaApplication) obj2);
            case 15:
                return new agb((byte) 15, mt5Var, (x79) obj2);
            case 16:
                return new agb((byte) 16, mt5Var, (x79) obj2);
            case 17:
                return new agb((byte) 17, mt5Var, (kt5) obj2);
            case SizeUtil.textSize0_1 /* 18 */:
                return new agb((byte) 18, mt5Var, (r2i) obj2);
            case 19:
                return new agb((byte) 19, mt5Var, (s2i) obj2);
            case SizeUtil.textSize0 /* 20 */:
                return new agb((byte) 20, mt5Var, (String) obj2);
            case 21:
                return new agb((byte) 21, mt5Var, (t2i) obj2);
            case SizeUtil.textSize1 /* 22 */:
                return new agb((byte) 22, mt5Var, (shf) obj2);
            case 23:
                return new agb((byte) 23, mt5Var, (x4i) obj2);
            case SizeUtil.textSize2 /* 24 */:
                return new agb((byte) 24, mt5Var, (bij) obj2);
            case 25:
                return new agb((byte) 25, mt5Var, (fij) obj2);
            case 26:
                return new agb((byte) 26, mt5Var, (g1k) obj2);
            case 27:
                return new agb((byte) 27, mt5Var, (jek) obj2);
            case 28:
                return new agb((byte) 28, mt5Var, (va1) obj2);
            default:
                return new agb((byte) 29, mt5Var, (p46) obj2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r0v58, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    public final Object invokeSuspend(Object obj) {
        Object objH;
        Map mapA;
        Object objA;
        Iterator it;
        Object objQ;
        Object objW;
        byte b = this.t;
        byte b2 = 18;
        byte b3 = 23;
        byte b4 = 15;
        int i = 2;
        byte b5 = 14;
        Object obj2 = this.v;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    es1 es1Var = ((dgb) obj2).b;
                    this.u = true;
                    if (es1Var.j(this) == px5Var) {
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
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    f99 data = ((rmb) obj2).d.getData();
                    this.u = true;
                    objH = cs5.H(data, this);
                    if (objH == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objH = obj;
                }
                lee leeVar = (lee) objH;
                return (leeVar == null || (mapA = leeVar.a()) == null) ? n08.a : mapA;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    xe1 xe1Var = (xe1) ((c5o) obj2).b;
                    Float f = new Float(0.0f);
                    a2k a2kVarR = rm5.R(0.0f, 400.0f, new Float(0.5f), 1);
                    this.u = true;
                    if (mfh.j(xe1Var, f, a2kVarR, true, (Function1) null, this, 8) == px5Var3) {
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
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    gmc gmcVar = (gmc) obj2;
                    pv pvVar = new pv((byte) 17, (mt5) null, gmcVar);
                    this.u = true;
                    if (gmcVar.a(pvVar, this) == px5Var4) {
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
                acd acdVar = (acd) obj2;
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    xd6 xd6VarO = dyg.o(new q4b(acdVar, b3));
                    hz1 hz1Var = new hz1((byte) 18, (mt5) null, acdVar);
                    this.u = true;
                    if (j14.v(xd6VarO, hz1Var, this) == px5Var5) {
                        return px5Var5;
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
                px5 px5Var6 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    this.u = true;
                    objA = ((lrh) obj2).a(this);
                    if (objA == px5Var6) {
                        return px5Var6;
                    }
                } else {
                    if (!z6) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objA = obj;
                }
                return ((krh) objA).b;
            case 6:
                px5 px5Var7 = px5.a;
                boolean z7 = this.u;
                if (z7) {
                    if (z7) {
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
                ((b6e) obj2).a.a(new bha(nh4Var, (byte) 2));
                Object objQ2 = nh4Var.q();
                return objQ2 != px5Var7 ? objQ2 : px5Var7;
            case 7:
                px5 px5Var8 = px5.a;
                boolean z8 = this.u;
                if (!z8) {
                    ybh.y(obj);
                    cd1 cd1Var = ((v6e) obj2).Z;
                    Float f2 = new Float(0.0f);
                    this.u = true;
                    if (cd1.a(cd1Var, f2, (we1) null, this, 14) == px5Var8) {
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
                px5 px5Var9 = px5.a;
                boolean z9 = this.u;
                if (!z9) {
                    ybh.y(obj);
                    Float f3 = new Float(0.0f);
                    this.u = true;
                    if (cd1.a((cd1) obj2, f3, (we1) null, this, 14) == px5Var9) {
                        return px5Var9;
                    }
                } else {
                    if (!z9) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
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
                p04 p04Var = ((sae) obj2).g;
                this.u = true;
                Object objQ3 = sgb.q(new qmb((byte) 14, (mt5) null, p04Var), this);
                return objQ3 != px5Var10 ? objQ3 : px5Var10;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                px5 px5Var11 = px5.a;
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
                jdj jdjVar = (jdj) ((cq5) obj2).d;
                this.u = true;
                Object objE = cs5.E(jdjVar, this);
                return objE != px5Var11 ? objE : px5Var11;
            case 11:
                px5 px5Var12 = px5.a;
                ybh.y(obj);
                ((y0a) obj2).run(Boolean.valueOf(this.u));
                return Unit.a;
            case 12:
                px5 px5Var13 = px5.a;
                ybh.y(obj);
                ((Callback) obj2).run(Boolean.valueOf(this.u));
                return Unit.a;
            case 13:
                z9f z9fVar = (z9f) obj2;
                Map map = z9fVar.i;
                px5 px5Var14 = px5.a;
                boolean z12 = this.u;
                try {
                    if (!z12) {
                        ybh.y(obj);
                        unb unbVarU = o0g.U(z9fVar.g);
                        this.u = true;
                        if (unbVarU.Z(this) == px5Var14) {
                            return px5Var14;
                        }
                    } else {
                        if (!z12) {
                            qp2.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybh.y(obj);
                    }
                    while (it.hasNext()) {
                        t9f t9fVar = (t9f) ((Map.Entry) it.next()).getValue();
                        t9fVar.E.a.evictAll();
                        t9fVar.a.a().shutdown();
                    }
                    return Unit.a;
                } finally {
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        t9f t9fVar2 = (t9f) ((Map.Entry) it.next()).getValue();
                        t9fVar2.E.a.evictAll();
                        t9fVar2.a.a().shutdown();
                    }
                }
            case 14:
                px5 px5Var15 = px5.a;
                boolean z13 = this.u;
                if (z13) {
                    if (z13) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                kze kzeVar = ((OperaApplication) obj2).M().c.g;
                xf xfVar = new xf(i, mt5Var, b2);
                this.u = true;
                Object objW2 = xf8.w(kzeVar, xfVar, this);
                return objW2 != px5Var15 ? objW2 : px5Var15;
            case 15:
                px5 px5Var16 = px5.a;
                boolean z14 = this.u;
                if (!z14) {
                    ybh.y(obj);
                    this.u = true;
                    ((x79) obj2).Q(this);
                    return px5Var16;
                }
                if (z14) {
                    ybh.y(obj);
                    return Unit.a;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                px5 px5Var17 = px5.a;
                boolean z15 = this.u;
                if (!z15) {
                    ybh.y(obj);
                    this.u = true;
                    if (zch.z(new mz9((byte) 16, (mt5) null, (x79) obj2), this) == px5Var17) {
                        return px5Var17;
                    }
                } else {
                    if (!z15) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 17:
                px5 px5Var18 = px5.a;
                boolean z16 = this.u;
                if (!z16) {
                    ybh.y(obj);
                    this.u = true;
                    if (((kt5) obj2).a(this) == px5Var18) {
                        return px5Var18;
                    }
                } else {
                    if (!z16) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                r2i r2iVar = (r2i) obj2;
                px5 px5Var19 = px5.a;
                boolean z17 = this.u;
                if (!z17) {
                    ybh.y(obj);
                    f99 f99VarG = r2iVar.a.g();
                    o71 o71Var = new o71(r2iVar, b5);
                    this.u = true;
                    if (f99VarG.collect(o71Var, this) == px5Var19) {
                        return px5Var19;
                    }
                } else {
                    if (!z17) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 19:
                s2i s2iVar = (s2i) obj2;
                px5 px5Var20 = px5.a;
                boolean z18 = this.u;
                if (!z18) {
                    ybh.y(obj);
                    long j = s2iVar.d;
                    this.u = true;
                    if (nb6.q(j, this) == px5Var20) {
                        return px5Var20;
                    }
                } else {
                    if (!z18) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                s2iVar.a.n(nkh.a);
                s2iVar.c = null;
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                px5 px5Var21 = px5.a;
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
                deg degVar = yne.b;
                long j2 = x3i.g;
                r8h r8hVar = new r8h(degVar, (String) obj2, (mt5) null, (byte) 7);
                this.u = true;
                Object objX = uyg.x(j2, r8hVar, this);
                return objX != px5Var21 ? objX : px5Var21;
            case 21:
                px5 px5Var22 = px5.a;
                boolean z20 = this.u;
                if (!z20) {
                    ybh.y(obj);
                    this.u = true;
                    if (((t2i) obj2).h(this) == px5Var22) {
                        return px5Var22;
                    }
                } else {
                    if (!z20) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                px5 px5Var23 = px5.a;
                boolean z21 = this.u;
                if (!z21) {
                    ybh.y(obj);
                    y3i y3iVar = (y3i) ((j4c) ((shf) obj2).a).get();
                    this.u = true;
                    if (y3iVar.i(this) == px5Var23) {
                        return px5Var23;
                    }
                } else {
                    if (!z21) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    Object obj3 = ((t0i) obj).a;
                }
                p0i p0iVar = t0i.b;
                return Unit.a;
            case 23:
                x4i x4iVar = (x4i) obj2;
                px5 px5Var24 = px5.a;
                boolean z22 = this.u;
                if (!z22) {
                    ybh.y(obj);
                    f99 f99VarD = x4iVar.a.d();
                    o71 o71Var2 = new o71(x4iVar, b4);
                    this.u = true;
                    if (f99VarD.collect(o71Var2, this) == px5Var24) {
                        return px5Var24;
                    }
                } else {
                    if (!z22) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                fp1 fp1Var = ((bij) obj2).a;
                px5 px5Var25 = px5.a;
                boolean z23 = this.u;
                if (!z23) {
                    ybh.y(obj);
                    String[] strArr = OperaApplication.K;
                    slk slkVarM = ((OperaApplication) fp1Var.getApplication()).M();
                    this.u = true;
                    objQ = bwg.q(slkVarM, this);
                    if (objQ == px5Var25) {
                        return px5Var25;
                    }
                } else {
                    if (!z23) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objQ = obj;
                }
                if (((Boolean) objQ).booleanValue()) {
                    int i2 = bij.b;
                    new zhj(new wzg(mt5Var, i8d.class, (byte) 4), null, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(fp1Var);
                }
                return Unit.a;
            case 25:
                fij fijVar = (fij) obj2;
                ?? r0 = fijVar.a;
                px5 px5Var26 = px5.a;
                boolean z24 = this.u;
                if (!z24) {
                    ybh.y(obj);
                    String[] strArr2 = OperaApplication.K;
                    kze kzeVar2 = ((OperaApplication) r0.getApplication()).M().c.g;
                    xf xfVar2 = new xf(i, mt5Var, b3);
                    this.u = true;
                    objW = xf8.w(kzeVar2, xfVar2, this);
                    if (objW == px5Var26) {
                        return px5Var26;
                    }
                } else {
                    if (!z24) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objW = obj;
                }
                qtg qtgVar = (qtg) objW;
                int i3 = fijVar.c;
                int i4 = qtgVar.a;
                if (i4 == -1) {
                    return Unit.a;
                }
                if (i4 == 1) {
                    i3 = qtgVar.b;
                } else if (i4 == 2) {
                    return Unit.a;
                }
                if (i3 <= 0) {
                    return Unit.a;
                }
                ((gjm) r0.F0().b.invoke()).e(new ptg(5, fijVar.d, fijVar.b, i3), false);
                return Unit.a;
            case 26:
                px5 px5Var27 = px5.a;
                boolean z25 = this.u;
                if (!z25) {
                    ybh.y(obj);
                    this.u = true;
                    if (((g1k) obj2).g(this) == px5Var27) {
                        return px5Var27;
                    }
                } else {
                    if (!z25) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 27:
                px5 px5Var28 = px5.a;
                boolean z26 = this.u;
                if (!z26) {
                    ybh.y(obj);
                    this.u = true;
                    if (((jek) obj2).c(this) == px5Var28) {
                        return px5Var28;
                    }
                } else {
                    if (!z26) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 28:
                px5 px5Var29 = px5.a;
                boolean z27 = this.u;
                if (!z27) {
                    ybh.y(obj);
                    fgh fghVar = new fgh(new t78((byte) 1, (mt5) null, (va1) obj2));
                    this.u = true;
                    if (fghVar.b.invoke(this) == px5Var29) {
                        return px5Var29;
                    }
                } else {
                    if (!z27) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            default:
                px5 px5Var30 = px5.a;
                boolean z28 = this.u;
                if (!z28) {
                    ybh.y(obj);
                    p46 p46Var = (p46) obj2;
                    this.u = true;
                    p46Var.getClass();
                    Object objQ4 = sgb.q(new vr((byte) 15, (mt5) null, p46Var), this);
                    if (objQ4 != px5Var30) {
                        objQ4 = Unit.a;
                    }
                    if (objQ4 == px5Var30) {
                        return px5Var30;
                    }
                } else {
                    if (!z28) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
        }
    }
}
