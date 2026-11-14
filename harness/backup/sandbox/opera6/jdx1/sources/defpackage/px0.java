package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class px0 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ px0(c8e c8eVar, afe afeVar, ue5 ue5Var, fb3 fb3Var) {
        this.a = (byte) 3;
        this.c = c8eVar;
        this.d = afeVar;
        this.b = ue5Var;
        this.e = fb3Var;
    }

    public /* synthetic */ px0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ px0(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ px0(td3 td3Var, Function0 function0, gog gogVar, ue5 ue5Var, int i) {
        this.a = (byte) 1;
        this.c = td3Var;
        this.d = function0;
        this.e = gogVar;
        this.b = ue5Var;
    }

    public /* synthetic */ px0(ue5 ue5Var, c8e c8eVar, ue5 ue5Var2, x62 x62Var, int i) {
        this.a = (byte) 10;
        this.b = ue5Var;
        this.d = c8eVar;
        this.c = ue5Var2;
        this.e = x62Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    public final Object invoke(Object obj, Object obj2) throws oye {
        v62 v62Var;
        ue5 ue5Var;
        ue5 ue5Var2;
        td3 td3Var;
        float f;
        Function2 function2;
        ?? r14;
        v62 v62Var2;
        vt9 vt9Var;
        boolean z;
        byte b = this.a;
        Function0 function0 = m3c.S;
        zpa zpaVar = hh5.a;
        byte b2 = 2;
        byte b3 = 1;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ue5 ue5Var3 = (ue5) obj6;
                ue5 ue5Var4 = (ue5) obj5;
                ue5 ue5Var5 = (ue5) obj4;
                ue5 ue5Var6 = (ue5) obj3;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                td3 td3Var2 = rbe.b;
                vt9 vt9Var2 = (vt9) ih5Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    voi voiVarQ0 = oup.q0(vt9Var2);
                    rd3 rd3Var = rbe.n;
                    v62 v62Var3 = b72.c;
                    db5 db5VarA = cb5.a(v62Var3, rd3Var, vt9Var2, 0);
                    int iHashCode = Long.hashCode(vt9Var2.T);
                    oag oagVarL = vt9Var2.l();
                    z7e z7eVar = z7e.b;
                    c8e c8eVarP = qyn.P(vt9Var2, z7eVar);
                    bh5.To.getClass();
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(function0);
                    } else {
                        vt9Var2.j0();
                    }
                    ah5 ah5Var = ujp.f;
                    y4h.o(vt9Var2, db5VarA, ah5Var);
                    Function2 function22 = ujp.e;
                    y4h.o(vt9Var2, oagVarL, function22);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    ah5 ah5Var2 = ujp.g;
                    y4h.o(vt9Var2, numValueOf, ah5Var2);
                    y4h.m(vt9Var2);
                    ah5 ah5Var3 = ujp.d;
                    y4h.o(vt9Var2, c8eVarP, ah5Var3);
                    if (ue5Var3 == null) {
                        vt9Var2.W(-876266494);
                        vt9Var2.p(false);
                        ue5Var = ue5Var5;
                        ue5Var2 = ue5Var4;
                        td3Var = td3Var2;
                        v62Var = v62Var3;
                    } else {
                        vt9Var2.W(-876266493);
                        v62Var = v62Var3;
                        kga kgaVar = new kga(rbe.o);
                        pof.b.getClass();
                        c8e c8eVarB0 = a26.b0(kgaVar, 0.0f, 24.0f, 0.0f, 16.0f, 5);
                        ue5Var = ue5Var5;
                        tfd tfdVarC = nr3.c(td3Var2, false);
                        ue5Var2 = ue5Var4;
                        td3Var = td3Var2;
                        int iHashCode2 = Long.hashCode(vt9Var2.T);
                        oag oagVarL2 = vt9Var2.l();
                        c8e c8eVarP2 = qyn.P(vt9Var2, c8eVarB0);
                        vt9Var2.a0();
                        if (vt9Var2.S) {
                            vt9Var2.k(function0);
                        } else {
                            vt9Var2.j0();
                        }
                        y4h.o(vt9Var2, tfdVarC, ah5Var);
                        y4h.o(vt9Var2, oagVarL2, function22);
                        u35.j(iHashCode2, vt9Var2, ah5Var2, vt9Var2);
                        y4h.o(vt9Var2, c8eVarP2, ah5Var3);
                        ue5Var3.invoke(vt9Var2, 0);
                        vt9Var2.p(true);
                        vt9Var2.p(false);
                    }
                    if (ue5Var3 == null) {
                        pof.b.getClass();
                        f = 24.0f;
                    } else {
                        f = 0.0f;
                    }
                    pof.b.getClass();
                    c8e c8eVarB02 = a26.b0(z7eVar, 0.0f, f, 0.0f, 16.0f, 5);
                    tfd tfdVarC2 = nr3.c(td3Var, false);
                    int iHashCode3 = Long.hashCode(vt9Var2.T);
                    oag oagVarL3 = vt9Var2.l();
                    c8e c8eVarP3 = qyn.P(vt9Var2, c8eVarB02);
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(function0);
                    } else {
                        vt9Var2.j0();
                    }
                    y4h.o(vt9Var2, tfdVarC2, ah5Var);
                    y4h.o(vt9Var2, oagVarL3, function22);
                    u35.j(iHashCode3, vt9Var2, ah5Var2, vt9Var2);
                    y4h.o(vt9Var2, c8eVarP3, ah5Var3);
                    ue5Var6.invoke(vt9Var2, 0);
                    vt9Var2.p(true);
                    if (voiVarQ0.c()) {
                        vt9Var2.W(110302875);
                        function2 = function22;
                        v62Var2 = v62Var;
                        scd.d(null, 0.0f, 0L, vt9Var2, 0, 7);
                        vt9Var = vt9Var2;
                        r14 = 0;
                    } else {
                        vt9 vt9Var3 = vt9Var2;
                        function2 = function22;
                        r14 = 0;
                        v62Var2 = v62Var;
                        vt9Var3.W(-875559910);
                        vt9Var = vt9Var3;
                    }
                    vt9Var.p(r14);
                    c8e c8eVarS0 = oup.s0(new g4c(1.0f, r14), voiVarQ0, true, true);
                    db5 db5VarA2 = cb5.a(v62Var2, rd3Var, vt9Var, r14);
                    int iHashCode4 = Long.hashCode(vt9Var.T);
                    oag oagVarL4 = vt9Var.l();
                    c8e c8eVarP4 = qyn.P(vt9Var, c8eVarS0);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, db5VarA2, ah5Var);
                    y4h.o(vt9Var, oagVarL4, function2);
                    u35.j(iHashCode4, vt9Var, ah5Var2, vt9Var);
                    y4h.o(vt9Var, c8eVarP4, ah5Var3);
                    ue5Var2.invoke(eb5.a, vt9Var, 6);
                    vt9Var.p(true);
                    if (voiVarQ0.d()) {
                        vt9Var.W(110321435);
                        scd.d(null, 0.0f, 0L, vt9Var, 0, 7);
                        z = false;
                    } else {
                        z = false;
                        vt9Var.W(-874984550);
                    }
                    vt9Var.p(z);
                    i39 i39Var = mpj.a;
                    pof.c.getClass();
                    c8e c8eVarA0 = a26.a0(i39Var, 8.0f, 8.0f, 24.0f, 18.0f);
                    o9i o9iVarA = m9i.a(b72.b, rbe.k, vt9Var, 6);
                    int iHashCode5 = Long.hashCode(vt9Var.T);
                    oag oagVarL5 = vt9Var.l();
                    c8e c8eVarP5 = qyn.P(vt9Var, c8eVarA0);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, o9iVarA, ah5Var);
                    y4h.o(vt9Var, oagVarL5, function2);
                    u35.j(iHashCode5, vt9Var, ah5Var2, vt9Var);
                    y4h.o(vt9Var, c8eVarP5, ah5Var3);
                    ue5Var.invoke(q9i.a, vt9Var, 6);
                    vt9Var.p(true);
                    vt9Var.p(true);
                } else {
                    vt9Var2.Q();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                w91.b((td3) obj5, (Function0) obj4, (gog) obj3, (ue5) obj6, (ih5) obj, aoh.m(28039));
                break;
            case 2:
                ((Integer) obj2).getClass();
                wxe.c((String) obj6, (Function0) obj5, (u8i) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 3:
                c8e c8eVar = (c8e) obj5;
                afe afeVar = (afe) obj4;
                ue5 ue5Var7 = (ue5) obj6;
                fb3 fb3Var = (fb3) obj3;
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var4 = (vt9) ih5Var2;
                if (vt9Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objK = vt9Var4.K();
                    if (objK == zpaVar) {
                        objK = new gb1(afeVar, b3);
                        vt9Var4.g0(objK);
                    }
                    c8e c8eVarH = na2.H(c8eVar, (Function1) objK);
                    tfd tfdVarC3 = nr3.c(rbe.b, true);
                    int iHashCode6 = Long.hashCode(vt9Var4.T);
                    oag oagVarL6 = vt9Var4.l();
                    c8e c8eVarP6 = qyn.P(vt9Var4, c8eVarH);
                    bh5.To.getClass();
                    vt9Var4.a0();
                    if (vt9Var4.S) {
                        vt9Var4.k(function0);
                    } else {
                        vt9Var4.j0();
                    }
                    y4h.o(vt9Var4, tfdVarC3, ujp.f);
                    y4h.o(vt9Var4, oagVarL6, ujp.e);
                    y4h.o(vt9Var4, Integer.valueOf(iHashCode6), ujp.g);
                    y4h.m(vt9Var4);
                    y4h.o(vt9Var4, c8eVarP6, ujp.d);
                    ue5Var7.invoke(vt9Var4, 0);
                    Object objK2 = vt9Var4.K();
                    if (objK2 == zpaVar) {
                        objK2 = new ox0(afeVar, (byte) 4);
                        vt9Var4.g0(objK2);
                    }
                    fb3Var.b((Function0) objK2, vt9Var4, 6);
                    vt9Var4.p(true);
                } else {
                    vt9Var4.Q();
                }
                break;
            case 4:
                List list = (List) obj6;
                Function1 function1 = (Function1) obj5;
                afe afeVar2 = (afe) obj4;
                afe afeVar3 = (afe) obj3;
                ih5 ih5Var3 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var5 = (vt9) ih5Var3;
                if (vt9Var5.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zH = vt9Var5.h(list) | vt9Var5.f(function1);
                    Object objK3 = vt9Var5.K();
                    if (zH || objK3 == zpaVar) {
                        rg rgVar = new rg(list, function1, afeVar2, afeVar3, (byte) 4);
                        vt9Var5.g0(rgVar);
                        objK3 = rgVar;
                    }
                    sgb.c(null, null, null, null, null, null, false, null, (Function1) objK3, vt9Var5, 0, 511);
                } else {
                    vt9Var5.Q();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                nb6.c((c8e) obj6, (hyf) obj5, (String) obj4, (String) obj3, (ih5) obj, aoh.m(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                sfe.i((vtb) obj6, (c8e) obj5, (u5c) obj4, (m5c) obj3, (ih5) obj, aoh.m(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                qbe.g((g1b) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (ih5) obj, aoh.m(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                qbe.h((hyf) obj6, (String) obj5, (Function0) obj4, (c8e) obj3, (ih5) obj, aoh.m(9));
                break;
            case 9:
                ((Integer) obj2).getClass();
                vtp.h((e2e) obj6, (mk8) obj5, (Function1) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                lcp.g((ue5) obj6, (c8e) obj4, (ue5) obj5, (x62) obj3, (ih5) obj, aoh.m(7));
                break;
            case 11:
                break;
            case 12:
                ((Integer) obj2).getClass();
                jpo.c((String) obj6, (dl7) obj5, (String) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 13:
                String str = (String) obj6;
                Function0 function02 = (Function0) obj5;
                rul rulVar = (rul) obj4;
                Function0 function03 = (Function0) obj3;
                ih5 ih5Var4 = (ih5) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                vt9 vt9Var6 = (vt9) ih5Var4;
                if (vt9Var6.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zi4.f(str, function02, null, null, null, null, null, rulVar, gyg.P(1518390015, new y35(function03, b2), vt9Var6), vt9Var6, 100663296, 124);
                } else {
                    vt9Var6.Q();
                }
                break;
            case 14:
                t0g t0gVar = (t0g) obj6;
                y8k y8kVar = (y8k) obj5;
                ch5 ch5Var = (ch5) obj4;
                afe afeVar4 = (afe) obj3;
                ih5 ih5Var5 = (ih5) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                vt9 vt9Var7 = (vt9) ih5Var5;
                if (vt9Var7.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    t9k t9kVar = (t9k) afeVar4.getValue();
                    boolean zBooleanValue = ((Boolean) t0gVar.getValue()).booleanValue();
                    boolean zH2 = vt9Var7.h(y8kVar);
                    Object objK4 = vt9Var7.K();
                    if (zH2 || objK4 == zpaVar) {
                        objK4 = new dnj(y8kVar, (byte) 14);
                        vt9Var7.g0(objK4);
                    }
                    Function0 function04 = (Function0) objK4;
                    boolean zH3 = vt9Var7.h(y8kVar) | vt9Var7.h(ch5Var);
                    Object objK5 = vt9Var7.K();
                    if (zH3 || objK5 == zpaVar) {
                        objK5 = new x8k(y8kVar, ch5Var, (byte) 0);
                        vt9Var7.g0(objK5);
                    }
                    Function0 function05 = (Function0) objK5;
                    boolean zH4 = vt9Var7.h(y8kVar) | vt9Var7.h(ch5Var);
                    Object objK6 = vt9Var7.K();
                    if (zH4 || objK6 == zpaVar) {
                        objK6 = new x8k(y8kVar, ch5Var, (byte) 1);
                        vt9Var7.g0(objK6);
                    }
                    b9k.a(function04, function05, (Function0) objK6, t9kVar, zBooleanValue, vt9Var7, 4096);
                } else {
                    vt9Var7.Q();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                kfo.o((n01) obj6, (n01) obj5, (n01) obj4, (n01) obj3, (ih5) obj, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
