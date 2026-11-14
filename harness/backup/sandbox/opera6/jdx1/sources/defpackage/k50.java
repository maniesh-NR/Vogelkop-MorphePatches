package defpackage;

import ads_mobile_sdk.bv0;
import ads_mobile_sdk.cy0;
import ads_mobile_sdk.dl;
import ads_mobile_sdk.f72;
import ads_mobile_sdk.fo;
import ads_mobile_sdk.fs0;
import ads_mobile_sdk.gj1;
import ads_mobile_sdk.hv0;
import ads_mobile_sdk.ji;
import ads_mobile_sdk.oa;
import ads_mobile_sdk.q6;
import ads_mobile_sdk.qr0;
import ads_mobile_sdk.r62;
import ads_mobile_sdk.s52;
import ads_mobile_sdk.sb;
import ads_mobile_sdk.sy0;
import ads_mobile_sdk.td0;
import ads_mobile_sdk.uo2;
import ads_mobile_sdk.vd1;
import ads_mobile_sdk.vz;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class k50 extends kuk implements Function1 {
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(dl dlVar, Uri uri, mt5 mt5Var) {
        super(1, mt5Var);
        this.t = (byte) 13;
        this.w = dlVar;
        this.x = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(ism ismVar, Map map, sj5 sj5Var, mt5 mt5Var) {
        super(1, mt5Var);
        this.t = (byte) 10;
        yrm yrmVar = yrm.a;
        this.v = ismVar;
        this.w = map;
        this.x = sj5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k50(Object obj, Object obj2, Object obj3, mt5 mt5Var, byte b) {
        super(1, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        Object obj = this.w;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                return new k50((qv) this.v, (String) obj, (List) obj2, mt5Var, (byte) 0);
            case 1:
                return new k50((a21) this.v, this.w, (dr9) obj2, mt5Var, (byte) 1);
            case 2:
                return new k50((v63) this.v, (ppb) obj, (nx5) obj2, mt5Var, (byte) 2);
            case 3:
                return new k50((mn4) this.v, (String) obj, (w8e) obj2, mt5Var, (byte) 3);
            case 4:
                return new k50((rr1) this.v, (Function1) obj, (rda) obj2, mt5Var, (byte) 4);
            case 5:
                return new k50((t0c) this.v, (String) obj, (String) obj2, mt5Var, (byte) 5);
            case 6:
                return new k50((rr1) this.v, (Function1) obj, (y2e) obj2, mt5Var, (byte) 6);
            case 7:
                return new k50((j3g) this.v, (s1m) obj, (Function2) obj2, mt5Var, (byte) 7);
            case 8:
                return new k50((rr1) this.v, (Function1) obj, (c4h) obj2, mt5Var, (byte) 8);
            case 9:
                return new k50((s8j) this.v, (String) obj, (String) obj2, mt5Var, (byte) 9);
            case 10:
                ism ismVar = (ism) this.v;
                yrm yrmVar = yrm.a;
                return new k50(ismVar, (Map) obj, (sj5) obj2, mt5Var);
            case 11:
                return new k50((ism) this.v, (eb4) obj, (Map) obj2, mt5Var, (byte) 11);
            case 12:
                return new k50((rr1) this.v, (Function1) obj, (lxm) obj2, mt5Var, (byte) 12);
            case 13:
                return new k50((dl) obj, (Uri) obj2, mt5Var);
            case 14:
                return new k50((sy0) this.v, (f72) obj, (gj1) obj2, mt5Var, (byte) 14);
            case 15:
                return new k50((sb) this.v, (String) obj, (oa) obj2, mt5Var, (byte) 15);
            case 16:
                return new k50((r62) this.v, (ViewGroup) obj, (fs0) obj2, mt5Var, (byte) 16);
            case 17:
                return new k50((td0) this.v, (ji) obj, (zq) obj2, mt5Var, (byte) 17);
            default:
                return new k50((cr9) this.v, (cy0) obj, (q6) obj2, mt5Var, (byte) 18);
        }
    }

    public final Object invoke(Object obj) {
        switch (this.t) {
            case 13:
                break;
        }
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Uri.Builder builder;
        int i = 0;
        mt5 mt5Var = null;
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (z) {
                    if (z) {
                        ybh.y(obj);
                        break;
                    } else {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    ybh.y(obj);
                    qv qvVar = (qv) this.v;
                    qb7 qb7Var = (qb7) qvVar.e;
                    String str = (String) this.w;
                    List list = (List) this.x;
                    Map mapB = qvVar.b();
                    this.u = true;
                    Object objO = qb7Var.o(str, list, mapB, this);
                    if (objO == px5Var) {
                        break;
                    }
                }
                break;
            case 1:
                a21 a21Var = (a21) this.v;
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    a21Var.p(this.w);
                    s11 s11Var = new s11(a21Var, (byte) 3);
                    s3 s3Var = new s3(this.x, (Object) a21Var, mt5Var, (byte) 6);
                    this.u = true;
                    if (rm5.P(s11Var, s3Var, this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 2:
                v63 v63Var = (v63) this.v;
                crb crbVar = v63Var.c;
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    Object objA = crbVar.a(((ppb) this.w).c, v63Var.d);
                    this.u = true;
                    obj = v63Var.b(objA, this);
                    if (obj == px5Var3) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                sgb.w((nx5) this.x);
                break;
            case 3:
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    an4 an4Var = ((mn4) this.v).b;
                    String str2 = (String) this.w;
                    w8e w8eVar = (w8e) this.x;
                    this.u = true;
                    if (an4Var.a(str2, w8eVar, this) == px5Var4) {
                        break;
                    }
                } else if (!z4) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 4:
                rr1 rr1Var = (rr1) this.v;
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    hz1 hz1Var = new hz1(rr1Var, (Function1) this.w, (rda) this.x, (mt5) null, (byte) 14);
                    this.u = true;
                    obj = rr1Var.F0(hz1Var, this);
                    if (obj == px5Var5) {
                        break;
                    }
                } else if (!z5) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                rr1Var.u0(740000574, new q9a((byte) 10));
                break;
            case 5:
                px5 px5Var6 = px5.a;
                boolean z6 = this.u;
                if (z6) {
                    if (z6) {
                        ybh.y(obj);
                        break;
                    } else {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    ybh.y(obj);
                    t0c t0cVar = (t0c) this.v;
                    wzb wzbVar = t0cVar.d;
                    String str3 = (String) this.w;
                    String str4 = (String) this.x;
                    Map mapB2 = t0cVar.b();
                    this.u = true;
                    Object objA2 = wzbVar.a(str3, str4, mapB2, this);
                    if (objA2 == px5Var6) {
                        break;
                    }
                }
                break;
            case 6:
                rr1 rr1Var2 = (rr1) this.v;
                px5 px5Var7 = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    hz1 hz1Var2 = new hz1(rr1Var2, (Function1) this.w, (y2e) this.x, (mt5) null, (byte) 19);
                    this.u = true;
                    obj = rr1Var2.F0(hz1Var2, this);
                    if (obj == px5Var7) {
                        break;
                    }
                } else if (!z7) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                rr1Var2.u0(67872855, new uvc((byte) 24));
                break;
            case 7:
                px5 px5Var8 = px5.a;
                boolean z8 = this.u;
                if (z8) {
                    if (z8) {
                        ybh.y(obj);
                        break;
                    } else {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    ybh.y(obj);
                    j3g j3gVar = (j3g) this.v;
                    s1m s1mVar = (s1m) this.w;
                    Function2 function2 = (Function2) this.x;
                    this.u = true;
                    Object objD = j3gVar.d(s1mVar, function2, this);
                    if (objD == px5Var8) {
                        break;
                    }
                }
                break;
            case 8:
                rr1 rr1Var3 = (rr1) this.v;
                px5 px5Var9 = px5.a;
                boolean z9 = this.u;
                if (!z9) {
                    ybh.y(obj);
                    hz1 hz1Var3 = new hz1(rr1Var3, (Function1) this.w, (c4h) this.x, (mt5) null, (byte) 25);
                    this.u = true;
                    obj = rr1Var3.F0(hz1Var3, this);
                    if (obj == px5Var9) {
                        break;
                    }
                } else if (!z9) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                rr1Var3.u0(-201166572, new m3g((byte) 29));
                break;
            case 9:
                px5 px5Var10 = px5.a;
                boolean z10 = this.u;
                if (z10) {
                    if (z10) {
                        ybh.y(obj);
                        break;
                    } else {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    ybh.y(obj);
                    s8j s8jVar = (s8j) this.v;
                    iuh iuhVar = s8jVar.d;
                    String str5 = (String) this.w;
                    String str6 = (String) this.x;
                    String str7 = s8jVar.e;
                    Map mapB3 = s8jVar.b();
                    this.u = true;
                    String strA = ((u7d) iuhVar.c).a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(strA);
                    sb.append("/settings/");
                    sb.append(str5);
                    sb.append("/");
                    sb.append(str6);
                    Object objB = ((eqa) iuhVar.b).b(p3p.n(sb, "/", str7, ".json"), mapB3, this);
                    if (objB == px5Var10) {
                        break;
                    }
                }
                break;
            case 10:
                px5 px5Var11 = px5.a;
                boolean z11 = this.u;
                if (z11) {
                    if (z11) {
                        ybh.y(obj);
                        break;
                    } else {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    ybh.y(obj);
                    ism ismVar = (ism) this.v;
                    yrm yrmVar = yrm.a;
                    Map map = (Map) this.w;
                    sj5 sj5Var = (sj5) this.x;
                    this.u = true;
                    cd5 cd5Var = ism.l;
                    Object objQ = ismVar.q(map, sj5Var, this);
                    if (objQ == px5Var11) {
                        break;
                    }
                }
                break;
            case 11:
                ism ismVar2 = (ism) this.v;
                px5 px5Var12 = px5.a;
                boolean z12 = this.u;
                if (z12) {
                    if (z12) {
                        ybh.y(obj);
                        break;
                    } else {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    ybh.y(obj);
                    LinkedHashMap linkedHashMap = ismVar2.k;
                    yrm yrmVar2 = yrm.c;
                    cd5 cd5Var2 = ism.l;
                    eb4 eb4Var = (eb4) this.w;
                    u59 u59Var = new u59((byte) 20);
                    u59Var.K(eb4Var);
                    linkedHashMap.put(yrmVar2, new bsm(u59Var, new LinkedHashMap((Map) this.x), (wwh) null, 12));
                    bsm bsmVarO = ism.o(ismVar2.k);
                    this.u = true;
                    Object objR = ismVar2.r(bsmVarO, null, this);
                    if (objR == px5Var12) {
                        break;
                    }
                }
                break;
            case 12:
                rr1 rr1Var4 = (rr1) this.v;
                px5 px5Var13 = px5.a;
                boolean z13 = this.u;
                if (!z13) {
                    ybh.y(obj);
                    sbl sblVar = new sbl(rr1Var4, (Function1) this.w, (lxm) this.x, null, (byte) 6);
                    this.u = true;
                    obj = rr1Var4.F0(sblVar, this);
                    if (obj == px5Var13) {
                        break;
                    }
                } else if (!z13) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                rr1Var4.u0(-976349853, new qjl((byte) 27));
                break;
            case 13:
                fo foVar = fo.a$23;
                px5 px5Var14 = px5.a;
                boolean z14 = this.u;
                if (!z14) {
                    ybh.y(obj);
                    boolean zM = c.m(((Uri) this.x).getQueryParameter("ase"), "3", false);
                    Uri uri = (Uri) this.x;
                    if (zM) {
                        Uri.Builder builderBuildUpon = uri.buildUpon();
                        ((dl) this.w).d.getClass();
                        String strValueOf = String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
                        qr0 qr0Var = ((dl) this.w).e;
                        qr0Var.getClass();
                        builderBuildUpon.appendQueryParameter((String) qr0Var.a("gads:debug_key_param_for_ara", "uk", foVar), strValueOf);
                        MotionEvent motionEvent = ((dl) this.w).b.a;
                        dl dlVar = (dl) this.w;
                        if (motionEvent == null) {
                            qr0 qr0Var2 = dlVar.e;
                            qr0Var2.getClass();
                            break;
                        } else {
                            Uri uri2 = (Uri) this.x;
                            Uri.Builder builderBuildUpon2 = builderBuildUpon.build().buildUpon();
                            builderBuildUpon2.appendQueryParameter("asr", "1");
                            qr0 qr0Var3 = dlVar.e;
                            qr0Var3.getClass();
                            builderBuildUpon2.appendQueryParameter((String) qr0Var3.a("gads:nis_param_for_ara", "nis", foVar), "12");
                            if (c.m(uri2.getQueryParameter("asrd"), "1", false)) {
                                qr0 qr0Var4 = dlVar.e;
                                qr0Var4.getClass();
                                builderBuildUpon2.authority((String) qr0Var4.a("gads:source_registration_domain_for_ara", "www.googleadservices.com", foVar));
                            }
                            Uri uriBuild = builderBuildUpon2.build();
                            vz vzVar = ((dl) this.w).c;
                            this.v = builderBuildUpon;
                            this.u = true;
                            vzVar.getClass();
                            Object objA3 = vz.a(vzVar, uriBuild, motionEvent, (nt5) this);
                            if (objA3 == px5Var14) {
                                break;
                            } else {
                                builder = builderBuildUpon;
                                obj = objA3;
                            }
                        }
                    }
                } else if (!z14) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    builder = (Uri.Builder) this.v;
                    ybh.y(obj);
                }
                rap rapVar = (rap) obj;
                if (rapVar == null) {
                    break;
                } else {
                    boolean z15 = rapVar instanceof hv0;
                    dl dlVar2 = (dl) this.w;
                    if (z15) {
                        qr0 qr0Var5 = dlVar2.e;
                        qr0Var5.getClass();
                        break;
                    } else if (rapVar instanceof bv0) {
                        bv0 bv0Var = (bv0) rapVar;
                        dlVar2.f.a("AttributionReportingManager.handleRegisterSource", bv0Var.c);
                        boolean z16 = bv0Var.c instanceof IllegalStateException;
                        qr0 qr0Var6 = ((dl) this.w).e;
                        if (z16) {
                            qr0Var6.getClass();
                            break;
                        } else {
                            qr0Var6.getClass();
                            break;
                        }
                    } else {
                        qr0 qr0Var7 = dlVar2.e;
                        qr0Var7.getClass();
                        break;
                    }
                }
                break;
            case 14:
                sy0 sy0Var = (sy0) this.v;
                px5 px5Var15 = px5.a;
                boolean z17 = this.u;
                if (!z17) {
                    ybh.y(obj);
                    sy0Var.getClass();
                    cy0 cy0Var = sy0Var.a;
                    ArrayList arrayList = new ArrayList();
                    int childCount = sy0Var.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = sy0Var.getChildAt(i2);
                        if (!Intrinsics.a(childAt, cy0Var)) {
                            arrayList.add(childAt);
                        }
                    }
                    f72 f72Var = (f72) this.w;
                    gj1 gj1Var = (gj1) this.x;
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        s52 s52Var = f72Var.c;
                        fs0 fs0Var = fs0.c;
                        s52Var.getClass();
                    }
                    prb prbVar = new prb();
                    this.u = true;
                    if (cy0Var.a(prbVar, "onSdkLoaded", this) == px5Var15) {
                        break;
                    }
                } else if (!z17) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 15:
                px5 px5Var16 = px5.a;
                boolean z18 = this.u;
                if (z18) {
                    if (z18) {
                        ybh.y(obj);
                        break;
                    } else {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    ybh.y(obj);
                    sb sbVar = (sb) this.v;
                    String str8 = (String) this.w;
                    oa oaVar = (oa) this.x;
                    this.u = true;
                    Object objA4 = sb.a(sbVar, str8, oaVar, (nt5) this);
                    if (objA4 == px5Var16) {
                        break;
                    }
                }
                break;
            case 16:
                px5 px5Var17 = px5.a;
                boolean z19 = this.u;
                if (z19) {
                    if (z19) {
                        ybh.y(obj);
                        break;
                    } else {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    ybh.y(obj);
                    f72 f72Var2 = ((r62) this.v).g;
                    ViewGroup viewGroup = (ViewGroup) this.w;
                    fs0 fs0Var2 = (fs0) this.x;
                    this.u = true;
                    f72Var2.getClass();
                    Object objA5 = f72.a(f72Var2, viewGroup, fs0Var2, (nt5) this);
                    if (objA5 == px5Var17) {
                        break;
                    }
                }
                break;
            case 17:
                td0 td0Var = (td0) this.v;
                Unit unit = px5.a;
                boolean z20 = this.u;
                if (!z20) {
                    ybh.y(obj);
                    uo2 uo2Var = (uo2) td0Var.k.get();
                    vd1 vd1Var = new vd1((ji) this.w, new udj((byte) 28, mt5Var, (Object) td0Var));
                    zq zqVar = (zq) this.x;
                    this.u = true;
                    uo2Var.A = zqVar;
                    uo2Var.x = vd1Var;
                    uo2Var.a(vd1Var);
                    if (Unit.a == unit) {
                        break;
                    }
                } else if (!z20) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var18 = px5.a;
                boolean z21 = this.u;
                if (!z21) {
                    ybh.y(obj);
                    cr9 cr9Var = (cr9) this.v;
                    cy0 cy0Var2 = (cy0) this.w;
                    q6 q6Var = (q6) this.x;
                    this.u = true;
                    if (cr9Var.invoke(cy0Var2, q6Var, this) == px5Var18) {
                        break;
                    }
                } else if (!z21) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
        }
        return Unit.a;
    }
}
