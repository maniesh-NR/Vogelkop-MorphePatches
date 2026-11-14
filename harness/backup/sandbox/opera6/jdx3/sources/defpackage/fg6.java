package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.leanplum.utils.SizeUtil;
import com.opera.android.firebase.OperaFirebaseMessagingService;
import com.opera.android.history.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class fg6 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg6(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg6(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg6(qn6 qn6Var, s71 s71Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 5;
        gfe gfeVar = gfe.a;
        this.v = qn6Var;
        this.w = s71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg6(u07 u07Var, mt5 mt5Var, List list) {
        super(2, mt5Var);
        this.t = (byte) 6;
        yrm yrmVar = yrm.a;
        this.v = u07Var;
        this.w = list;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                fg6 fg6Var = new fg6((byte) 0, mt5Var, obj2);
                fg6Var.v = obj;
                return fg6Var;
            case 1:
                fg6 fg6Var2 = new fg6((byte) 1, mt5Var, obj2);
                fg6Var2.v = obj;
                return fg6Var2;
            case 2:
                return new fg6((ggb) this.v, (b2h) obj2, mt5Var, (byte) 2);
            case 3:
                fg6 fg6Var3 = new fg6((byte) 3, mt5Var, obj2);
                fg6Var3.v = obj;
                return fg6Var3;
            case 4:
                return new fg6((Uri) this.v, (OperaFirebaseMessagingService) obj2, mt5Var, (byte) 4);
            case 5:
                qn6 qn6Var = (qn6) this.v;
                gfe gfeVar = gfe.a;
                return new fg6(qn6Var, (s71) obj2, mt5Var);
            case 6:
                yrm yrmVar = yrm.a;
                return new fg6((u07) this.v, mt5Var, (List) obj2);
            case 7:
                return new fg6((x47) this.v, (Boolean) obj2, mt5Var, (byte) 7);
            case 8:
                return new fg6((x47) this.v, (gpm) obj2, mt5Var, (byte) 8);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new fg6((x47) this.v, (b2h) obj2, mt5Var, (byte) 9);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                fg6 fg6Var4 = new fg6((byte) 10, mt5Var, obj2);
                fg6Var4.v = obj;
                return fg6Var4;
            case 11:
                return new fg6((plh) this.v, (wd7) obj2, mt5Var, (byte) 11);
            case 12:
                fg6 fg6Var5 = new fg6((byte) 12, mt5Var, obj2);
                fg6Var5.v = obj;
                return fg6Var5;
            case 13:
                return new fg6((fd8) this.v, (fb8) obj2, mt5Var, (byte) 13);
            case 14:
                return new fg6((zs8) this.v, (String) obj2, mt5Var, (byte) 14);
            case 15:
                return new fg6((ua7) this.v, (jd4) obj2, mt5Var, (byte) 15);
            case 16:
                return new fg6((f99) this.v, (z1h) obj2, mt5Var, (byte) 16);
            case 17:
                fg6 fg6Var6 = new fg6((byte) 17, mt5Var, obj2);
                fg6Var6.v = obj;
                return fg6Var6;
            case SizeUtil.textSize0_1 /* 18 */:
                return new fg6((ti9) this.v, (Collection) obj2, mt5Var, (byte) 18);
            case 19:
                fg6 fg6Var7 = new fg6((byte) 19, mt5Var, obj2);
                fg6Var7.v = obj;
                return fg6Var7;
            case SizeUtil.textSize0 /* 20 */:
                return new fg6((ndc) this.v, (z8b) obj2, mt5Var, (byte) 20);
            case 21:
                fg6 fg6Var8 = new fg6((byte) 21, mt5Var, obj2);
                fg6Var8.v = obj;
                return fg6Var8;
            case SizeUtil.textSize1 /* 22 */:
                return new fg6((u6c) this.v, (Function1) obj2, mt5Var, (byte) 22);
            case 23:
                return new fg6((e) this.v, (zda) obj2, mt5Var, (byte) 23);
            case SizeUtil.textSize2 /* 24 */:
                return new fg6((zna) this.v, (ami) obj2, mt5Var, (byte) 24);
            case 25:
                return new fg6((hz1) this.v, (fr6) obj2, mt5Var, (byte) 25);
            case 26:
                return new fg6((xbf) this.v, (lxa) obj2, mt5Var, (byte) 26);
            case 27:
                return new fg6((z8b) this.v, (Uri) obj2, mt5Var, (byte) 27);
            case 28:
                fg6 fg6Var9 = new fg6((byte) 28, mt5Var, obj2);
                fg6Var9.v = obj;
                return fg6Var9;
            default:
                return new fg6((rmb) this.v, (Function1) obj2, mt5Var, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((ggb) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((ggb) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((yuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((ggb) obj, (mt5) obj2).invokeSuspend(Unit.a);
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
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return create((lrl) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 11:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 12:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 13:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 14:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 15:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 16:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 17:
                return create((hkc) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case SizeUtil.textSize0_1 /* 18 */:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 19:
                return create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case SizeUtil.textSize0 /* 20 */:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 21:
                return create((String) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case SizeUtil.textSize1 /* 22 */:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 23:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case SizeUtil.textSize2 /* 24 */:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 25:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 26:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 27:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 28:
                return create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: d45 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [lk6] */
    /* JADX WARN: Type inference failed for: r23v12, types: [int] */
    public final Object invokeSuspend(Object obj) throws d45, Resources.NotFoundException {
        Object obj2;
        Object value;
        Object value2;
        Object objE;
        lf8 lf8Var;
        t94 t94Var;
        Object objA;
        String str;
        Object objC;
        Object objC2;
        Object objA2;
        int i = 10;
        byte b = 5;
        byte b2 = 0;
        zA0 = false;
        boolean zA0 = false;
        switch (this.t) {
            case 0:
                ggb ggbVar = (ggb) this.v;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    rr1 rr1Var = ggbVar.k;
                    t8g t8gVar = (t8g) this.w;
                    String str2 = t8gVar.a;
                    String str3 = t8gVar.b;
                    String str4 = t8gVar.c;
                    this.v = null;
                    this.u = true;
                    if (rr1Var.X0(str2, str3, str4, this) == px5Var) {
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
                ggb ggbVar2 = (ggb) this.v;
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
                rr1 rr1Var2 = ggbVar2.c;
                String str5 = ((gpm) this.w).g;
                this.v = null;
                this.u = true;
                Object objG1 = rr1Var2.g1(str5, this);
                return objG1 == px5Var2 ? px5Var2 : objG1;
            case 2:
                b2h b2hVar = (b2h) this.w;
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    rr1 rr1Var3 = ((ggb) this.v).h;
                    String strName = b2hVar.d.name();
                    String str6 = b2hVar.a;
                    String str7 = b2hVar.b;
                    this.u = true;
                    if (rr1Var3.p1(strName, str6, str7, this) == px5Var3) {
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
                ggb ggbVar3 = (ggb) this.v;
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    rr1 rr1Var4 = ggbVar3.h;
                    fg6 fg6Var = new fg6(ggbVar3, (b2h) this.w, uri, (byte) 2);
                    this.v = null;
                    this.u = true;
                    if (upj.B(rr1Var4, fg6Var, this) == px5Var4) {
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
                Enum r0 = px5.a;
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
                ?? r1 = lk6.a;
                Uri uri = (Uri) this.v;
                FirebaseMessagingService firebaseMessagingService = (OperaFirebaseMessagingService) this.w;
                this.u = true;
                Enum enumD = r1.d(uri, firebaseMessagingService, this);
                return enumD != r0 ? enumD : r0;
            case 5:
                px5 px5Var5 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    qn6 qn6Var = (qn6) this.v;
                    mfe mfeVar = qn6Var.c;
                    y11 y11Var = qn6Var.b;
                    gfe gfeVar = gfe.b;
                    s71 s71Var = (s71) this.w;
                    this.u = true;
                    mfeVar.getClass();
                    if (sgb.q(new lfe(gfeVar, mfeVar, s71Var, y11Var, (mt5) null), this) == px5Var5) {
                        return px5Var5;
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
                px5 px5Var6 = px5.a;
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
                ism ismVarN = ((u07) this.v).n();
                List list = (List) this.w;
                yrm yrmVar = yrm.a;
                cd5 cd5VarK = ismVarN.k(list);
                this.u = true;
                Object objA3 = cd5VarK.A(this);
                return objA3 != px5Var6 ? objA3 : px5Var6;
            case 7:
                px5 px5Var7 = px5.a;
                boolean z8 = this.u;
                if (!z8) {
                    ybh.y(obj);
                    es1 es1Var = ((x47) this.v).d;
                    Boolean bool = (Boolean) this.w;
                    this.u = true;
                    if (es1Var.d(bool, this) == px5Var7) {
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
                gpm gpmVar = (gpm) this.w;
                x47 x47Var = (x47) this.v;
                px5 px5Var8 = px5.a;
                boolean z9 = this.u;
                if (!z9) {
                    ybh.y(obj);
                    es1 es1Var2 = x47Var.d;
                    this.u = true;
                    if (es1Var2.h(gpmVar, this) == px5Var8) {
                        return px5Var8;
                    }
                } else {
                    if (!z9) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                x47Var.e.c.invoke(gpmVar);
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                b2h b2hVar2 = (b2h) this.w;
                x47 x47Var2 = (x47) this.v;
                px5 px5Var9 = px5.a;
                boolean z10 = this.u;
                if (!z10) {
                    ybh.y(obj);
                    h5e h5eVar = x47Var2.h;
                    this.u = true;
                    Object objM = h5eVar.m(b2hVar2, this);
                    if (objM == px5Var9) {
                        return px5Var9;
                    }
                    obj2 = objM;
                } else {
                    if (!z10) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    obj2 = ((t0i) obj).a;
                }
                Throwable thD = t0i.d(obj2);
                if (thD != null) {
                    nak nakVar = x47Var2.l;
                    do {
                        value2 = nakVar.getValue();
                    } while (!nakVar.h(value2, hn9.v(ynh.j("Failed to purchase an item"), thD)));
                    return Unit.a;
                }
                nak nakVar2 = x47Var2.l;
                do {
                    value = nakVar2.getValue();
                } while (!nakVar2.h(value, new eum(ynh.j("Item " + b2hVar2.a + " purchased"))));
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                qb7 qb7Var = (qb7) this.w;
                lrl lrlVar = (lrl) this.v;
                px5 px5Var10 = px5.a;
                boolean z11 = this.u;
                if (!z11) {
                    ybh.y(obj);
                    ((ArrayList) qb7Var.a).add(lrlVar);
                    this.v = null;
                    this.u = true;
                    if (qb7Var.w(this) == px5Var10) {
                        return px5Var10;
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
                wd7 wd7Var = (wd7) this.w;
                px5 px5Var11 = px5.a;
                boolean z12 = this.u;
                if (!z12) {
                    ybh.y(obj);
                    plh plhVar = (plh) this.v;
                    this.u = true;
                    objE = cs5.E(plhVar, this);
                    if (objE == px5Var11) {
                        return px5Var11;
                    }
                } else {
                    if (!z12) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objE = obj;
                }
                rd7 rd7Var = (rd7) objE;
                if (!wd7Var.h && rd7Var.b() > 0 && wd7Var.f.nextInt(rd7Var.b()) == 0) {
                    long jB = rd7Var.b();
                    wd7Var.i = true;
                    wd7Var.j = jB;
                    wd7Var.d.W(wd7Var.k);
                    wd7Var.e.F(wd7Var.l);
                    w1h.l(wd7Var.a, wd7Var.b, "dvt", new bg1[]{new td7(wd7Var, (byte) 0)});
                }
                return Unit.a;
            case 12:
                nx5 nx5Var = (nx5) this.v;
                px5 px5Var12 = px5.a;
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
                no7 no7Var = (no7) this.w;
                this.v = nx5Var;
                this.u = true;
                nh4 nh4Var = new nh4(1, hib.b(this));
                nh4Var.s();
                p1 p1Var = new p1(no7Var, nh4Var, (byte) 6);
                no7Var.F(p1Var);
                nh4Var.u(new qh7(nx5Var, no7Var, p1Var, (byte) 1));
                Object objQ = nh4Var.q();
                return objQ == px5Var12 ? px5Var12 : objQ;
            case 13:
                Unit unit = px5.a;
                boolean z14 = this.u;
                if (!z14) {
                    ybh.y(obj);
                    hzc hzcVarC = hzc.c.c("EventReporter");
                    fb8 fb8Var = (fb8) this.w;
                    String str8 = hzcVarC.b;
                    eaj eajVar = eaj.b;
                    if (hzcVarC.a.a.compareTo(eajVar) <= 0) {
                        hzcVarC.b(eajVar, str8, "Reporting event: " + fb8Var, (Throwable) null);
                    }
                    mg6 mg6Var = ((fd8) this.v).c;
                    qpb qpbVar = rpb.d;
                    ya8 ya8Var = (fb8) this.w;
                    if (ya8Var instanceof ya8) {
                        lf8Var = new lf8(Collections.singletonList(new re8(ya8Var.a)), (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 4094);
                    } else if (ya8Var instanceof db8) {
                        lf8Var = new lf8((List) null, Collections.singletonList(new kf8(((db8) ya8Var).a)), (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 4093);
                    } else if (ya8Var instanceof xa8) {
                        xa8 xa8Var = (xa8) ya8Var;
                        lf8Var = new lf8((List) null, (List) null, Collections.singletonList(new ne8(xa8Var.a, xa8Var.b, xa8Var.c, xa8Var.d)), (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 4091);
                    } else if (ya8Var instanceof za8) {
                        lf8Var = new lf8((List) null, (List) null, (List) null, Collections.singletonList(new we8(((za8) ya8Var).a)), (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 4087);
                    } else if (ya8Var instanceof ua8) {
                        ua8 ua8Var = (ua8) ya8Var;
                        lf8Var = new lf8((List) null, (List) null, (List) null, (List) null, Collections.singletonList(new yd8(ua8Var.a, ua8Var.b)), (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 4079);
                    } else if (ya8Var instanceof ab8) {
                        lf8Var = new lf8((List) null, (List) null, (List) null, (List) null, (List) null, Collections.singletonList(new ze8(((ab8) ya8Var).a)), (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 4063);
                    } else if (ya8Var instanceof bb8) {
                        bb8 bb8Var = (bb8) ya8Var;
                        lf8Var = new lf8((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, Collections.singletonList(new cf8(bb8Var.a, bb8Var.b)), (List) null, (List) null, (List) null, (List) null, (List) null, 4031);
                    } else if (ya8Var instanceof ta8) {
                        lf8Var = new lf8((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, Collections.singletonList(new td8(((ta8) ya8Var).a)), (List) null, (List) null, (List) null, (List) null, 3967);
                    } else if (ya8Var instanceof sa8) {
                        lf8Var = new lf8((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, Collections.singletonList(new qd8(((sa8) ya8Var).a)), (List) null, (List) null, (List) null, 3839);
                    } else if (ya8Var instanceof va8) {
                        va8 va8Var = (va8) ya8Var;
                        lf8Var = new lf8((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, Collections.singletonList(new ee8(va8Var.a, va8Var.b)), (List) null, (List) null, 3583);
                    } else if (ya8Var instanceof cb8) {
                        lf8Var = new lf8((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, Collections.singletonList(new ff8(((cb8) ya8Var).a)), (List) null, 3071);
                    } else {
                        if (!(ya8Var instanceof wa8)) {
                            h9o.p();
                            return null;
                        }
                        wa8 wa8Var = (wa8) ya8Var;
                        lf8Var = new lf8((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, Collections.singletonList(new ke8(wa8Var.a, wa8Var.b)), 2047);
                    }
                    qpbVar.getClass();
                    byte[] bytes = qpbVar.b(lf8Var, lf8.Companion.serializer()).getBytes(Charsets.UTF_8);
                    this.u = true;
                    mg6Var.getClass();
                    ?? J = mg6Var.j(new s3(mg6Var, bytes, (mt5) null, (byte) 19), this);
                    Unit unit2 = J;
                    if (J != unit) {
                        unit2 = Unit.a;
                    }
                    if (unit2 == unit) {
                        return unit;
                    }
                } else {
                    if (!z14) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 14:
                px5 px5Var13 = px5.a;
                boolean z15 = this.u;
                if (!z15) {
                    ybh.y(obj);
                    es1 es1Var3 = ((zs8) this.v).b;
                    String str9 = (String) this.w;
                    this.u = true;
                    if (es1Var3.e(str9, this) == px5Var13) {
                        return px5Var13;
                    }
                } else {
                    if (!z15) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 15:
                px5 px5Var14 = px5.a;
                boolean z16 = this.u;
                if (!z16) {
                    ybh.y(obj);
                    qe4 qe4Var = (qe4) ((ua7) this.v).c;
                    fd4 fd4Var = ((jd4) this.w).a;
                    this.u = true;
                    synchronized (qe4Var.c) {
                        if (qe4Var.d) {
                            throw new IllegalStateException("Check failed.");
                        }
                        t94Var = ((mb4) ((m7h) qe4Var.a.v).get()).e;
                    }
                    if (t94Var == null) {
                        qp2.n("Required value was null.");
                        return null;
                    }
                    objA = t94Var.a(fd4Var, this);
                    if (objA == px5Var14) {
                        return px5Var14;
                    }
                } else {
                    if (!z16) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objA = obj;
                }
                jd4 jd4Var = (jd4) this.w;
                cl5 cl5Var = (cl5) objA;
                int i2 = cl5Var.a;
                if (gyg.G(3, "CXCP")) {
                    List list2 = jd4Var.a.b;
                    ArrayList arrayList = new ArrayList(k95.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        List<ruf> list3 = ((bg4) it.next()).a;
                        ArrayList arrayList2 = new ArrayList(k95.o(list3, 10));
                        for (ruf rufVar : list3) {
                            arrayList2.add("size=" + rufVar.a + ", format=" + ((Object) rfk.b(rufVar.b)) + ", dynamicRangeProfile" + rufVar.e);
                        }
                        arrayList.add(arrayList2);
                    }
                    Objects.toString(jd4Var.a.g);
                    arrayList.toString();
                }
                return Boolean.valueOf(cl5Var.a == 1);
            case 16:
                px5 px5Var15 = px5.a;
                boolean z17 = this.u;
                if (!z17) {
                    ybh.y(obj);
                    f99 f99Var = (f99) this.v;
                    o71 o71Var = new o71((z1h) this.w, (byte) 4);
                    this.u = true;
                    if (f99Var.collect(o71Var, this) == px5Var15) {
                        return px5Var15;
                    }
                } else {
                    if (!z17) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 17:
                px5 px5Var16 = px5.a;
                boolean z18 = this.u;
                if (!z18) {
                    ybh.y(obj);
                    hkc hkcVar = (hkc) this.v;
                    f99 f99Var2 = (f99) this.w;
                    o71 o71Var2 = new o71(hkcVar, b);
                    this.u = true;
                    if (f99Var2.collect(o71Var2, this) == px5Var16) {
                        return px5Var16;
                    }
                } else {
                    if (!z18) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                ti9 ti9Var = (ti9) this.v;
                px5 px5Var17 = px5.a;
                boolean z19 = this.u;
                if (!z19) {
                    ybh.y(obj);
                    tpc tpcVar = (tpc) ti9Var.d.g();
                    if (tpcVar != null && (str = (String) ti9Var.e.g()) != null) {
                        sfo sfoVar = (sfo) ti9Var.i.c.getValue();
                        String str10 = tpcVar.a;
                        String strP = CollectionsKt.P((Collection) this.w, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62);
                        this.u = true;
                        objC = sfoVar.c("ofa", str10, strP, str, "start_page", this);
                        if (objC == px5Var17) {
                            return px5Var17;
                        }
                    }
                    return Unit.a;
                }
                if (!z19) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                objC = ((t0i) obj).a;
                cd3 cd3Var = t0i.d(objC) == null ? (cd3) objC : null;
                int i3 = ti9.t;
                nak nakVar3 = ti9Var.l;
                if (cd3Var != null) {
                    Map map = cd3Var.b;
                    if (!map.isEmpty()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) nakVar3.getValue());
                        String str11 = cd3Var.a;
                        boolean z20 = false;
                        for (Map.Entry entry : map.entrySet()) {
                            String str12 = (String) entry.getKey();
                            fd3 fd3Var = (fd3) entry.getValue();
                            Long lK0 = StringsKt.k0(str12);
                            long jLongValue = lK0 != null ? lK0.longValue() : 0L;
                            List list4 = (List) linkedHashMap.get(Long.valueOf(jLongValue));
                            String str13 = fd3Var.b;
                            List list5 = fd3Var.c;
                            ArrayList arrayList3 = new ArrayList(k95.o(list5, i));
                            byte b3 = b2;
                            for (Object obj3 : list5) {
                                ?? r23 = b3 + 1;
                                if (b3 < 0) {
                                    j95.n();
                                    throw null;
                                }
                                id3 id3Var = (id3) obj3;
                                arrayList3.add(new vc8(id3Var.a, str11, str13, jLongValue, id3Var.b, id3Var.d, id3Var.f, id3Var.g, b3));
                                b3 = r23;
                            }
                            if (list4 == null || !list4.equals(arrayList3)) {
                                linkedHashMap.put(Long.valueOf(jLongValue), arrayList3);
                                z20 = true;
                            }
                            i = 10;
                            b2 = 0;
                        }
                        if (z20) {
                            nakVar3.k((Object) null, linkedHashMap);
                        }
                    }
                }
                return Unit.a;
            case 19:
                eq9 eq9Var = (eq9) this.w;
                z1h z1hVar = (z1h) this.v;
                px5 px5Var18 = px5.a;
                boolean z21 = this.u;
                if (!z21) {
                    ybh.y(obj);
                    fq9 fq9Var = new fq9(z1hVar, eq9Var);
                    eq9Var.a(fq9Var);
                    gv8 gv8Var = new gv8(eq9Var, fq9Var, b);
                    this.v = null;
                    this.u = true;
                    if (w1h.h(z1hVar, gv8Var, this) == px5Var18) {
                        return px5Var18;
                    }
                } else {
                    if (!z21) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                px5 px5Var19 = px5.a;
                boolean z22 = this.u;
                if (!z22) {
                    ybh.y(obj);
                    tcc lifecycle = ((ndc) this.v).getLifecycle();
                    qcc qccVar = qcc.e;
                    yf yfVar = new yf((byte) 26, (mt5) null, (z8b) this.w);
                    this.u = true;
                    if (m5h.v(lifecycle, qccVar, yfVar, this) == px5Var19) {
                        return px5Var19;
                    }
                } else {
                    if (!z22) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 21:
                String str14 = (String) this.v;
                px5 px5Var20 = px5.a;
                boolean z23 = this.u;
                if (!z23) {
                    ybh.y(obj);
                    if (str14 != null) {
                        pca pcaVar = (pca) this.w;
                        this.v = null;
                        this.u = true;
                        if (pcaVar.f(str14, this) == px5Var20) {
                            return px5Var20;
                        }
                    }
                } else {
                    if (!z23) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                px5 px5Var21 = px5.a;
                boolean z24 = this.u;
                if (!z24) {
                    ybh.y(obj);
                    xd6 xd6VarO = dyg.o(new nda((u6c) this.v, (byte) 0));
                    o71 o71Var3 = new o71((Function1) this.w, (byte) 8);
                    this.u = true;
                    if (xd6VarO.collect(o71Var3, this) == px5Var21) {
                        return px5Var21;
                    }
                } else {
                    if (!z24) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 23:
                px5 px5Var22 = px5.a;
                boolean z25 = this.u;
                if (!z25) {
                    ybh.y(obj);
                    tz1 tz1Var = ((e) this.v).b;
                    jz1 jz1Var = ((yda) ((zda) this.w)).a;
                    this.u = true;
                    bw3 bw3Var = tz1Var.d;
                    String str15 = jz1Var.a;
                    String str16 = jz1Var.b;
                    l6e l6eVarC = bw3Var.a.c(9223372036854775805L);
                    l42 l42Var = l6eVarC instanceof l42 ? (l42) l6eVarC : null;
                    uri = l42Var != null ? Uri.parse(l42Var.r(str16, str15)) : null;
                    if (uri == null || (objC2 = tz1Var.b.c(uri, this)) != px5Var22) {
                        objC2 = Unit.a;
                    }
                    if (objC2 == px5Var22) {
                        return px5Var22;
                    }
                } else {
                    if (!z25) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                zna znaVar = (zna) this.v;
                px5 px5Var23 = px5.a;
                boolean z26 = this.u;
                if (z26) {
                    if (z26) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                unb unbVar = znaVar.l().get(ulp.h);
                if (!(unbVar != null ? unbVar.isActive() : false)) {
                    throw new d45("Client already closed", (byte) 0);
                }
                ami amiVar = (ami) this.w;
                this.u = true;
                Object objH = znaVar.h(amiVar, this);
                return objH == px5Var23 ? px5Var23 : objH;
            case 25:
                px5 px5Var24 = px5.a;
                boolean z27 = this.u;
                if (z27) {
                    if (z27) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                hz1 hz1Var = (hz1) this.v;
                fr6 fr6Var = (fr6) this.w;
                this.u = true;
                Object objInvoke = hz1Var.invoke(fr6Var, this);
                return objInvoke != px5Var24 ? objInvoke : px5Var24;
            case 26:
                px5 px5Var25 = px5.a;
                boolean z28 = this.u;
                if (z28) {
                    if (z28) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                xbf xbfVar = (xbf) this.v;
                luf lufVar = ((lxa) this.w).r;
                Point point = lufVar.c;
                qnn qnnVar = lufVar.f;
                this.u = true;
                Object objD = xbfVar.D(point, qnnVar, this);
                return objD != px5Var25 ? objD : px5Var25;
            case 27:
                px5 px5Var26 = px5.a;
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
                z8b z8bVar = (z8b) this.v;
                Uri uri2 = (Uri) this.w;
                this.u = true;
                Object objJ = z8bVar.J(uri2, this);
                return objJ != px5Var26 ? objJ : px5Var26;
            case 28:
                z1h z1hVar2 = (z1h) this.v;
                px5 px5Var27 = px5.a;
                boolean z30 = this.u;
                if (!z30) {
                    ybh.y(obj);
                    wjb wjbVar = new wjb(z1hVar2, b2);
                    k6l k6lVar = (k6l) ((mt3) this.w).invoke();
                    k6lVar.w.a(wjbVar);
                    b2l b2lVar = k6lVar.o;
                    String url = b2lVar != null ? ((d7l) b2lVar).j.getUrl() : null;
                    if (url != null && url.length() != 0) {
                        zA0 = z5i.a0(url);
                    }
                    z1hVar2.b(Boolean.valueOf(zA0));
                    gv8 gv8Var2 = new gv8(k6lVar, wjbVar, (byte) 11);
                    this.v = null;
                    this.u = true;
                    if (w1h.h(z1hVar2, gv8Var2, this) == px5Var27) {
                        return px5Var27;
                    }
                } else {
                    if (!z30) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            default:
                rmb rmbVar = (rmb) this.v;
                ThreadLocal threadLocal = rmbVar.c;
                px5 px5Var28 = px5.a;
                boolean z31 = this.u;
                try {
                    if (!z31) {
                        ybh.y(obj);
                        Object obj4 = threadLocal.get();
                        Boolean bool2 = Boolean.TRUE;
                        if (Intrinsics.a(obj4, bool2)) {
                            qp2.n("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                            return null;
                        }
                        threadLocal.set(bool2);
                        qd6 qd6Var = rmbVar.d;
                        m76 m76Var = new m76((Function1) this.w, (mt5) null, (byte) 3);
                        this.u = true;
                        objA2 = qd6Var.a(new fsg(m76Var, (mt5) null, (byte) 1), this);
                        if (objA2 == px5Var28) {
                            return px5Var28;
                        }
                    } else {
                        if (!z31) {
                            qp2.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybh.y(obj);
                        objA2 = obj;
                    }
                    return (lee) objA2;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
        }
    }
}
