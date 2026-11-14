package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class r8h extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Object v;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8h(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8h(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8h(boolean z, x2d x2dVar, afe afeVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 18;
        this.u = z;
        this.v = x2dVar;
        this.w = afeVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                return new r8h(obj2, this.w, mt5Var, (byte) 0);
            case 1:
                return new r8h(obj2, this.w, mt5Var, (byte) 1);
            case 2:
                return new r8h(obj2, this.w, mt5Var, (byte) 2);
            case 3:
                return new r8h(obj2, this.w, mt5Var, (byte) 3);
            case 4:
                return new r8h(obj2, this.w, mt5Var, (byte) 4);
            case 5:
                return new r8h(obj2, this.w, mt5Var, (byte) 5);
            case 6:
                return new r8h(obj2, this.w, mt5Var, (byte) 6);
            case 7:
                return new r8h(obj2, this.w, mt5Var, (byte) 7);
            case 8:
                r8h r8hVar = new r8h((byte) 8, mt5Var, (fa1) obj2);
                r8hVar.w = obj;
                return r8hVar;
            case 9:
                return new r8h(obj2, this.w, mt5Var, (byte) 9);
            case 10:
                return new r8h(obj2, this.w, mt5Var, (byte) 10);
            case 11:
                return new r8h(obj2, this.w, mt5Var, (byte) 11);
            case 12:
                r8h r8hVar2 = new r8h((byte) 12, mt5Var, (psi) obj2);
                r8hVar2.w = obj;
                return r8hVar2;
            case 13:
                return new r8h(obj2, this.w, mt5Var, (byte) 13);
            case 14:
                return new r8h(obj2, this.w, mt5Var, (byte) 14);
            case 15:
                return new r8h(obj2, this.w, mt5Var, (byte) 15);
            case 16:
                return new r8h(obj2, this.w, mt5Var, (byte) 16);
            case 17:
                return new r8h(obj2, this.w, mt5Var, (byte) 17);
            case 18:
                return new r8h(this.u, (x2d) obj2, (afe) this.w, mt5Var);
            case 19:
                return new r8h(obj2, this.w, mt5Var, (byte) 19);
            case 20:
                return new r8h(obj2, this.w, mt5Var, (byte) 20);
            case 21:
                return new r8h(obj2, this.w, mt5Var, (byte) 21);
            case 22:
                return new r8h(obj2, this.w, mt5Var, (byte) 22);
            case 23:
                return new r8h(obj2, this.w, mt5Var, (byte) 23);
            case 24:
                return new r8h(obj2, this.w, mt5Var, (byte) 24);
            case 25:
                return new r8h(obj2, this.w, mt5Var, (byte) 25);
            case 26:
                return new r8h(obj2, this.w, mt5Var, (byte) 26);
            case 27:
                return new r8h(obj2, this.w, mt5Var, (byte) 27);
            case 28:
                r8h r8hVar3 = new r8h((byte) 28, mt5Var, (g7m) obj2);
                r8hVar3.w = obj;
                return r8hVar3;
            default:
                return new r8h(obj2, this.w, mt5Var, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
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
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 11:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 12:
                return create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 13:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 14:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 15:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 16:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 17:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 18:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 19:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 20:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 21:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 22:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 23:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 24:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 25:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 26:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 27:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 28:
                return create((g3g) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) throws m2 {
        Object objA;
        Object objA2;
        Object objJ;
        Object objE;
        Object objA3;
        long j;
        Object objN;
        Object objN2;
        Object objA4;
        Object objE2;
        Object next;
        Object objH;
        byte b = 20;
        String strD = null;
        switch (this.t) {
            case 0:
                Object obj2 = this.w;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    Objects.toString(obj2);
                    qmb qmbVar = (qmb) ((x79) this.v).b;
                    this.u = true;
                    if (qmbVar.invoke(obj2, this) == px5Var) {
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
                if (z2) {
                    if (z2) {
                        ybh.y(obj);
                        return Unit.a;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                plh plhVar = (plh) this.v;
                o71 o71Var = new o71((ych) this.w, (byte) 13);
                this.u = true;
                plhVar.collect(o71Var, this);
                return px5Var2;
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
                ylh ylhVar = (ylh) this.v;
                bza bzaVar = (bza) this.w;
                this.u = true;
                int i = ylh.e;
                Object objA5 = ylhVar.a(bzaVar, 1, this);
                return objA5 == px5Var3 ? px5Var3 : objA5;
            case 3:
                oxh oxhVar = (oxh) this.v;
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    zim zimVar = oxhVar.c;
                    this.u = true;
                    zimVar.getClass();
                    objA = zim.a("licenses/deps.json");
                    if (objA == px5Var4) {
                        return px5Var4;
                    }
                } else {
                    if (!z4) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objA = obj;
                }
                String strI = c.i((byte[]) objA);
                rpb rpbVar = oxhVar.a;
                rpbVar.getClass();
                List list = (List) rpbVar.a(strI, new k72(w27.Companion.serializer(), (byte) 0));
                dgg dggVar = (dgg) this.w;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    w27 w27Var = (w27) obj3;
                    String str = w27Var.i;
                    if (str == null || StringsKt.N(str) || w27Var.i.compareToIgnoreCase(dggVar.name()) == 0) {
                        arrayList.add(obj3);
                    }
                }
                return CollectionsKt.c0(new au9((byte) 16), arrayList);
            case 4:
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    zim zimVar2 = ((oxh) this.v).c;
                    String str2 = (String) this.w;
                    this.u = true;
                    zimVar2.getClass();
                    objA2 = zim.a(str2);
                    if (objA2 == px5Var5) {
                        return px5Var5;
                    }
                } else {
                    if (!z5) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objA2 = obj;
                }
                return c.i((byte[]) objA2);
            case 5:
                String str3 = ((jz5) this.w).a;
                h3i h3iVar = (h3i) this.v;
                px5 px5Var6 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    h5e h5eVar = h3iVar.d;
                    this.u = true;
                    objJ = h5eVar.j(str3, this);
                    if (objJ == px5Var6) {
                        return px5Var6;
                    }
                } else {
                    if (!z6) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objJ = ((t0i) obj).a;
                }
                p0i p0iVar = t0i.b;
                if (!(objJ instanceof q0i)) {
                    h3iVar.k(je8.c, str3);
                    nak nakVar = h3iVar.h;
                    hz5 hz5VarT = qbe.T((nz5) objJ, str3, h3iVar.e);
                    nakVar.getClass();
                    nakVar.k((Object) null, hz5VarT);
                }
                Throwable thD = t0i.d(objJ);
                if (thD != null) {
                    h3iVar.k(je8.d, str3);
                    h3iVar.h.j((Object) null);
                    nak nakVar2 = h3iVar.l;
                    dum dumVarV = hn9.v(ynh.i((shk) dhk.m.getValue()), thD);
                    nakVar2.getClass();
                    nakVar2.k((Object) null, dumVarV);
                }
                return Unit.a;
            case 6:
                px5 px5Var7 = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    h5e h5eVar2 = ((h3i) this.v).d;
                    c2h c2hVar = (c2h) this.w;
                    this.u = true;
                    objE = h5eVar2.E(c2hVar, this);
                    if (objE == px5Var7) {
                        return px5Var7;
                    }
                } else {
                    if (!z7) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objE = ((t0i) obj).a;
                }
                return new t0i(objE);
            case 7:
                deg degVar = (deg) this.v;
                px5 px5Var8 = px5.a;
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
                ArrayList arrayList2 = quk.a;
                dwh dwhVarI = degVar.i((String) this.w);
                this.u = true;
                Object objA6 = quk.a(dwhVarI, degVar, this);
                return objA6 == px5Var8 ? px5Var8 : objA6;
            case 8:
                px5 px5Var9 = px5.a;
                boolean z9 = this.u;
                if (z9) {
                    if (z9) {
                        ybh.y(obj);
                        return Unit.a;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                nx5 nx5Var = (nx5) this.w;
                fa1 fa1Var = (fa1) this.v;
                jdj jdjVar = fa1Var.o.a;
                o23 o23Var = new o23(fa1Var, nx5Var, (byte) 18);
                this.u = true;
                jdjVar.collect(o23Var, this);
                return px5Var9;
            case 9:
                px5 px5Var10 = px5.a;
                boolean z10 = this.u;
                if (!z10) {
                    ybh.y(obj);
                    u11 u11Var = new u11(this.v, this.w, (mt5) strD, b);
                    this.u = true;
                    objA3 = upj.A(u11Var, this);
                    if (objA3 == px5Var10) {
                        return px5Var10;
                    }
                } else {
                    if (!z10) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objA3 = ((t0i) obj).a;
                }
                Throwable thD2 = t0i.d(objA3);
                return thD2 == null ? (ow) objA3 : new lw(thD2);
            case 10:
                px5 px5Var11 = px5.a;
                boolean z11 = this.u;
                if (!z11) {
                    ybh.y(obj);
                    aj7 aj7Var = (aj7) this.v;
                    float f = aj7Var.b ? -1.0f : 1.0f;
                    spi spiVar = ((jpi) this.w).R;
                    long jF = i1n.f(aj7Var.a, f);
                    this.u = true;
                    if (spiVar.c(jF, false, this) == px5Var11) {
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
                psi psiVar = (psi) this.v;
                px5 px5Var12 = px5.a;
                boolean z12 = this.u;
                if (!z12) {
                    ybh.y(obj);
                    ur4 ur4VarA = ma9.a(new f99[]{psiVar.l, a26.h(psiVar.g), a26.h(psiVar.h), a26.h(psiVar.b), new z99(psiVar.j, new nsi(psiVar, (mt5) null, (byte) 0), (byte) 2), new z99(psiVar.k, new nsi(psiVar, (mt5) null, (byte) 1), (byte) 2), new z99(psiVar.d, new osi(psiVar, null, (byte) 0), (byte) 2), new z99(psiVar.e, new osi(psiVar, null, (byte) 1), (byte) 2), new z99(psiVar.f, new nsi(psiVar, (mt5) null, (byte) 2), (byte) 2)});
                    o71 o71Var2 = new o71((s4f) this.w, (byte) 16);
                    this.u = true;
                    if (ur4VarA.collect(o71Var2, this) == px5Var12) {
                        return px5Var12;
                    }
                } else {
                    if (!z12) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 12:
                psi psiVar2 = (psi) this.v;
                z1h z1hVar = (z1h) this.w;
                px5 px5Var13 = px5.a;
                boolean z13 = this.u;
                if (!z13) {
                    ybh.y(obj);
                    s4f s4fVar = new s4f(z1hVar, psiVar2, (byte) 20);
                    t00 t00Var = new t00(psiVar2, s4fVar, (byte) 2);
                    s4fVar.invoke();
                    na2.B(z1hVar, null, null, new r8h((Object) psiVar2, (Object) s4fVar, (mt5) strD, (byte) 11), 3);
                    psiVar2.a.a(t00Var);
                    s4f s4fVar2 = new s4f(psiVar2, t00Var, (byte) 21);
                    this.w = null;
                    this.u = true;
                    if (w1h.h(z1hVar, s4fVar2, this) == px5Var13) {
                        return px5Var13;
                    }
                } else {
                    if (!z13) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 13:
                px5 px5Var14 = px5.a;
                boolean z14 = this.u;
                if (!z14) {
                    ybh.y(obj);
                    f99 f99VarT = qbe.t(new z78((plh) this.v, (byte) 9));
                    o71 o71Var3 = new o71((SettingsManager) this.w, (byte) 17);
                    this.u = true;
                    if (f99VarT.collect(o71Var3, this) == px5Var14) {
                        return px5Var14;
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
                nsj nsjVar = (nsj) this.v;
                px5 px5Var15 = px5.a;
                boolean z15 = this.u;
                if (!z15) {
                    ybh.y(obj);
                    if (nsjVar != null) {
                        osj osjVar = nsjVar.a;
                        ksj ksjVar = osjVar.c;
                        boolean z16 = osjVar.b != null;
                        o21 o21Var = (o21) this.w;
                        int iOrdinal = ksjVar.ordinal();
                        long j2 = Long.MAX_VALUE;
                        if (iOrdinal == 0) {
                            j = 4000;
                        } else if (iOrdinal == 1) {
                            j = 10000;
                        } else {
                            if (iOrdinal != 2) {
                                h9o.p();
                                return null;
                            }
                            j = Long.MAX_VALUE;
                        }
                        if (o21Var == null || j >= 2147483647L) {
                            j2 = j;
                        } else {
                            int recommendedTimeoutMillis = o21Var.a.getRecommendedTimeoutMillis((int) j, z16 ? 7 : 3);
                            if (recommendedTimeoutMillis != Integer.MAX_VALUE) {
                                j2 = recommendedTimeoutMillis;
                            }
                        }
                        this.u = true;
                        if (nb6.p(j2, this) == px5Var15) {
                            return px5Var15;
                        }
                    }
                    return Unit.a;
                }
                if (!z15) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                nh4 nh4Var = nsjVar.b;
                if (nh4Var.r() instanceof c0f) {
                    p0i p0iVar2 = t0i.b;
                    nh4Var.resumeWith(ctj.a);
                }
                return Unit.a;
            case 15:
                px5 px5Var16 = px5.a;
                boolean z17 = this.u;
                if (!z17) {
                    ybh.y(obj);
                    f99 f99Var = (f99) this.v;
                    nuj nujVar = new nuj((y1h) this.w, (byte) 1);
                    this.u = true;
                    if (f99Var.collect(nujVar, this) == px5Var16) {
                        return px5Var16;
                    }
                } else {
                    if (!z17) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 16:
                g1k g1kVar = (g1k) this.v;
                px5 px5Var17 = px5.a;
                boolean z18 = this.u;
                if (!z18) {
                    ybh.y(obj);
                    h5e h5eVar3 = g1kVar.d;
                    b2h b2hVar = (b2h) this.w;
                    this.u = true;
                    objN = h5eVar3.n(b2hVar, this);
                    if (objN == px5Var17) {
                        return px5Var17;
                    }
                } else {
                    if (!z18) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objN = ((t0i) obj).a;
                }
                p0i p0iVar3 = t0i.b;
                if (!(objN instanceof q0i)) {
                    nak nakVar3 = g1kVar.h;
                    y0k y0kVar = new y0k(((q1k) objN).b);
                    nakVar3.getClass();
                    nakVar3.k((Object) null, y0kVar);
                }
                Throwable thD3 = t0i.d(objN);
                if (thD3 != null) {
                    g1kVar.h(thD3);
                    g1kVar.h.j((Object) null);
                }
                return Unit.a;
            case 17:
                px5 px5Var18 = px5.a;
                boolean z19 = this.u;
                if (!z19) {
                    ybh.y(obj);
                    fwf fwfVar = (fwf) this.v;
                    qcc qccVar = qcc.d;
                    bz1 bz1Var = new bz1((byte) 29, (mt5) null, (s6k) this.w);
                    this.u = true;
                    if (m5h.w(fwfVar, qccVar, bz1Var, this) == px5Var18) {
                        return px5Var18;
                    }
                } else {
                    if (!z19) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 18:
                px5 px5Var19 = px5.a;
                ybh.y(obj);
                x2d x2dVar = (x2d) this.v;
                Regex regex = b9k.b;
                if (((p2d) x2dVar.getValue()) != null && this.u) {
                    ((afe) this.w).setValue(Boolean.TRUE);
                }
                return Unit.a;
            case 19:
                px5 px5Var20 = px5.a;
                boolean z20 = this.u;
                if (!z20) {
                    ybh.y(obj);
                    cd1 cd1Var = (cd1) this.v;
                    Float f2 = new Float(0.0f);
                    e8m e8mVarX = rm5.X(784, 2, (u36) this.w);
                    this.u = true;
                    if (cd1.a(cd1Var, f2, e8mVarX, this, 12) == px5Var20) {
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
                px5 px5Var21 = px5.a;
                boolean z21 = this.u;
                if (!z21) {
                    ybh.y(obj);
                    cd1 cd1Var2 = (cd1) ((s14) this.v).d;
                    Float f3 = new Float(0.0f);
                    e8m e8mVar = (e8m) this.w;
                    this.u = true;
                    if (cd1.a(cd1Var2, f3, e8mVar, this, 12) == px5Var21) {
                        return px5Var21;
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
                cck cckVar = (cck) this.v;
                pna pnaVar = cckVar.h;
                gpm gpmVar = cckVar.j;
                byte[] bArr = (byte[]) this.w;
                spa spaVar = new spa();
                spaVar.b = apa.c;
                uyg.s(spaVar.a, gpmVar);
                if (bArr instanceof jtf) {
                    spaVar.d = bArr;
                    spaVar.a((x9m) null);
                } else {
                    spaVar.d = bArr;
                    s15 s15VarA = uqh.a(byte[].class);
                    try {
                        strD = uqh.d(byte[].class);
                    } catch (Throwable unused) {
                    }
                    z1m.p(s15VarA, strD, spaVar);
                }
                jf2 jf2Var = vpa.a;
                g9a g9aVar = spaVar.c;
                g9aVar.i("Content-Type", "application/x-osp");
                g9aVar.i("Authorization", "Basic ".concat(x33.b(x33.e, w1h.z(cckVar.i.concat(":"), Charsets.d))));
                spaVar.b = apa.c;
                yqa yqaVar = new yqa(spaVar, pnaVar, (byte) 0);
                this.u = true;
                Object objE3 = yqaVar.e(this);
                return objE3 == px5Var22 ? px5Var22 : objE3;
            case 22:
                zck zckVar = (zck) this.w;
                px5 px5Var23 = px5.a;
                boolean z23 = this.u;
                if (!z23) {
                    ybh.y(obj);
                    if (gyg.G(3, "CXCP")) {
                        Objects.toString(zckVar);
                    }
                    List list2 = (List) this.v;
                    this.u = true;
                    objN2 = cs5.n(list2, this);
                    if (objN2 == px5Var23) {
                        return px5Var23;
                    }
                } else {
                    if (!z23) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objN2 = obj;
                }
                if (gyg.G(3, "CXCP")) {
                    Objects.toString(zckVar);
                }
                return objN2;
            case 23:
                u8g u8gVar = (u8g) this.w;
                w6j w6jVar = (w6j) this.v;
                px5 px5Var24 = px5.a;
                boolean z24 = this.u;
                if (!z24) {
                    ybh.y(obj);
                    h5e h5eVar4 = (t3e) w6jVar.b;
                    long j3 = u8gVar.b;
                    this.u = true;
                    objA4 = h5eVar4.o.a(j3, this);
                    if (objA4 == px5Var24) {
                        return px5Var24;
                    }
                } else {
                    if (!z24) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objA4 = obj;
                }
                oa6 oa6Var = (oa6) objA4;
                ((nak) w6jVar.c).k((Object) null, new lek(oa6Var, u8gVar.a));
                Object obj4 = oa6Var.b;
                p0i p0iVar4 = t0i.b;
                if (!(obj4 instanceof q0i)) {
                    w6jVar.e = null;
                }
                return Unit.a;
            case 24:
                px5 px5Var25 = px5.a;
                boolean z25 = this.u;
                if (z25) {
                    if (z25) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                shf shfVar = (shf) this.v;
                String str4 = (String) this.w;
                this.u = true;
                nh4 nh4Var2 = new nh4(1, hib.b(this));
                nh4Var2.s();
                ((wth) shfVar.a).w(new s2g(str4, shfVar, new bha(nh4Var2, (byte) 6)));
                Object objQ = nh4Var2.q();
                return objQ == px5Var25 ? px5Var25 : objQ;
            case 25:
                px5 px5Var26 = px5.a;
                boolean z26 = this.u;
                if (!z26) {
                    ybh.y(obj);
                    hzc hzcVarC = hzc.c.c("TelemetryReporter");
                    String str5 = hzcVarC.b;
                    eaj eajVar = eaj.b;
                    if (hzcVarC.a.a.compareTo(eajVar) <= 0) {
                        hzcVarC.b(eajVar, str5, "Reporting telemetry event: DailyClaimError", null);
                    }
                    mg6 mg6Var = ((qdl) this.v).b;
                    String str6 = (String) this.w;
                    this.u = true;
                    mg6 mg6Var2 = mg6Var;
                    mg6Var2.getClass();
                    Object objJ2 = mg6Var2.j(new lf6(mg6Var2, str6, (mt5) null), this);
                    if (objJ2 != px5Var26) {
                        objJ2 = Unit.a;
                    }
                    if (objJ2 == px5Var26) {
                        return px5Var26;
                    }
                } else {
                    if (!z26) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                p04 p04Var = ((qdl) this.v).d;
                Unit unit = Unit.a;
                p04Var.b(unit);
                return unit;
            case 26:
                px5 px5Var27 = px5.a;
                boolean z27 = this.u;
                if (!z27) {
                    ybh.y(obj);
                    jdj jdjVar2 = ((krl) this.v).b;
                    lrl lrlVar = (lrl) this.w;
                    this.u = true;
                    if (jdjVar2.emit(lrlVar, this) == px5Var27) {
                        return px5Var27;
                    }
                } else {
                    if (!z27) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 27:
                j4c j4cVar = ((nzl) this.v).a;
                px5 px5Var28 = px5.a;
                boolean z28 = this.u;
                if (!z28) {
                    ybh.y(obj);
                    f99 f99VarM = ((y3i) j4cVar.get()).m();
                    this.u = true;
                    objE2 = cs5.E(f99VarM, this);
                    if (objE2 == px5Var28) {
                        return px5Var28;
                    }
                } else {
                    if (!z28) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objE2 = obj;
                }
                Map map = (Map) objE2;
                String str7 = (String) this.w;
                if (wqm.s(str7) || wqm.u(str7)) {
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.a((String) ((Map.Entry) next).getValue(), str7)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry != null) {
                        strD = (String) entry.getKey();
                    }
                }
                if (strD != null) {
                    ((y3i) j4cVar.get()).n(new gzl(strD));
                }
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
                g3g g3gVar = (g3g) this.w;
                g7m g7mVar = (g7m) this.v;
                this.u = true;
                Object objA7 = g7mVar.a(g3gVar, this);
                return objA7 == px5Var29 ? px5Var29 : objA7;
            default:
                fza fzaVar = (fza) this.w;
                px5 px5Var30 = px5.a;
                boolean z30 = this.u;
                try {
                    if (!z30) {
                        ybh.y(obj);
                        g7m g7mVar2 = (g7m) this.v;
                        this.u = true;
                        objH = g7mVar2.h(this);
                        if (objH == px5Var30) {
                            return px5Var30;
                        }
                    } else {
                        if (!z30) {
                            qp2.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybh.y(obj);
                        objH = obj;
                    }
                    fzaVar.getClass();
                    return Unit.a;
                } catch (Throwable th) {
                    fzaVar.getClass();
                    throw th;
                }
        }
    }
}
