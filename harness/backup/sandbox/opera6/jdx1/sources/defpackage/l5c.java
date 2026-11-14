package defpackage;

import android.os.Build;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class l5c implements cr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l5c(afe afeVar, afe afeVar2, afe afeVar3, t2i t2iVar) {
        this.a = (byte) 2;
        this.e = afeVar;
        this.b = afeVar2;
        this.c = afeVar3;
        this.d = t2iVar;
    }

    public /* synthetic */ l5c(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ l5c(String str, afe afeVar, g1b g1bVar, Function1 function1) {
        this.a = (byte) 4;
        this.b = str;
        this.e = afeVar;
        this.c = g1bVar;
        this.d = function1;
    }

    public /* synthetic */ l5c(Function2 function2, rs5 rs5Var, cr9 cr9Var, Function0 function0) {
        this.a = (byte) 3;
        this.b = function2;
        this.c = rs5Var;
        this.d = cr9Var;
        this.e = function0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws oye {
        Object obj4;
        c8e c8eVarD;
        Object obj5;
        boolean z;
        String strQ;
        byte b = this.a;
        c8e c8eVarF = z7e.b;
        Object obj6 = hh5.a;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (b) {
            case 0:
                u5c u5cVar = (u5c) obj10;
                c8e c8eVar = (c8e) obj9;
                Object obj11 = (m5c) obj8;
                afe afeVar = (afe) obj7;
                sji sjiVar = (sji) obj;
                ((Integer) obj3).getClass();
                vt9 vt9Var = (vt9) ((ih5) obj2);
                Object objK = vt9Var.K();
                if (objK == obj6) {
                    objK = new j5c(sjiVar, new ox0(afeVar, (byte) 13));
                    vt9Var.g0(objK);
                }
                Object obj12 = (j5c) objK;
                Object objK2 = vt9Var.K();
                if (objK2 == obj6) {
                    s6h s6hVar = new s6h();
                    s6hVar.a = obj12;
                    zde zdeVar = n6f.a;
                    s6hVar.b = new zde();
                    objK2 = new hkk(s6hVar);
                    vt9Var.g0(objK2);
                }
                hkk hkkVar = (hkk) objK2;
                if (u5cVar != null) {
                    vt9Var.W(1743490539);
                    vt9Var.W(887527095);
                    String str = Build.FINGERPRINT;
                    if (str == null || !str.equals("robolectric")) {
                        vt9Var.W(1345729441);
                        View view = (View) vt9Var.j(j41.f);
                        boolean zF = vt9Var.f(view);
                        Object objK3 = vt9Var.K();
                        if (zF || objK3 == obj6) {
                            Object tag = view.getTag(2131362389);
                            Object x91Var = tag instanceof xsg ? (xsg) tag : null;
                            if (x91Var == null) {
                                x91Var = new x91(view);
                                view.setTag(2131362389, x91Var);
                            }
                            objK3 = x91Var;
                            vt9Var.g0(objK3);
                        }
                        obj5 = (xsg) objK3;
                        z = false;
                        vt9Var.p(false);
                    } else {
                        vt9Var.W(1345548711);
                        Object objK4 = vt9Var.K();
                        if (objK4 == obj6) {
                            objK4 = new ysg();
                            vt9Var.g0(objK4);
                        }
                        obj5 = (ysg) objK4;
                        z = false;
                        vt9Var.p(false);
                    }
                    Object obj13 = obj5;
                    vt9Var.p(z);
                    Object[] objArr = {u5cVar, obj12, hkkVar, obj13};
                    boolean zF2 = vt9Var.f(u5cVar) | vt9Var.h(obj12) | vt9Var.h(hkkVar) | vt9Var.h(obj13);
                    Object objK5 = vt9Var.K();
                    if (zF2 || objK5 == obj6) {
                        obj4 = obj12;
                        Object rgVar = new rg(u5cVar, obj4, hkkVar, obj13, (byte) 7);
                        vt9Var.g0(rgVar);
                        objK5 = rgVar;
                    } else {
                        obj4 = obj12;
                    }
                    rm5.c(objArr, (Function1) objK5, vt9Var);
                    vt9Var.p(false);
                } else {
                    obj4 = obj12;
                    vt9Var.W(1744076749);
                    vt9Var.p(false);
                }
                int i = v5c.a;
                if (u5cVar != null && (c8eVarD = c8eVar.d(new v5m(u5cVar))) != null) {
                    c8eVar = c8eVarD;
                }
                boolean zF3 = vt9Var.f(obj4) | vt9Var.f(obj11);
                Object objK6 = vt9Var.K();
                if (zF3 || objK6 == obj6) {
                    objK6 = new hda(obj4, obj11, (byte) 4);
                    vt9Var.g0(objK6);
                }
                dkk.b(hkkVar, c8eVar, (Function2) objK6, vt9Var, 8);
                return Unit.a;
            case 1:
                f2e f2eVar = (g2e) obj10;
                Function1 function1 = (Function1) obj9;
                mk8 mk8Var = (mk8) obj8;
                Function1 function12 = (Function1) obj7;
                ih5 ih5Var = (ih5) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                vt9 vt9Var2 = (vt9) ih5Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    i39 i39Var = mpj.a;
                    if (f2eVar instanceof f2e) {
                        vt9Var2.W(536725885);
                        gyg.g(f2eVar, function1, i39Var, false, vt9Var2, 384, 8);
                        vt9Var2.p(false);
                    } else {
                        if (!(f2eVar instanceof e2e)) {
                            throw fki.m(vt9Var2, 536724528, false);
                        }
                        vt9Var2.W(536731865);
                        vtp.i(mk8Var, (e2e) f2eVar, function1, function12, i39Var, vt9Var2, 24576);
                        vt9Var2.p(false);
                    }
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 2:
                afe afeVar2 = (afe) obj7;
                afe afeVar3 = (afe) obj10;
                afe afeVar4 = (afe) obj9;
                t2i t2iVar = (t2i) obj8;
                ih5 ih5Var2 = (ih5) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                vt9 vt9Var3 = (vt9) ih5Var2;
                if (vt9Var3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    u6c u6cVarA = x6c.a(0, vt9Var3, 3);
                    vtp.g(u6cVarA, (ad2) afeVar3.getValue(), vt9Var3, 0);
                    x62 x62Var = new x62(16.0f, true, new t40((byte) 19));
                    zvf zvfVarD = a26.d(16.0f, 5);
                    c8e c8eVarM = mpj.m(mpj.c, 560.0f, 1);
                    boolean zF4 = vt9Var3.f(afeVar2) | vt9Var3.f(afeVar3) | vt9Var3.f(afeVar4) | vt9Var3.h(t2iVar);
                    Object objK7 = vt9Var3.K();
                    if (zF4 || objK7 == obj6) {
                        Object rgVar2 = new rg(afeVar2, afeVar3, t2iVar, afeVar4, (byte) 14);
                        vt9Var3.g0(rgVar2);
                        objK7 = rgVar2;
                    }
                    sgb.c(c8eVarM, u6cVarA, zvfVarD, x62Var, null, null, false, null, (Function1) objK7, vt9Var3, 24960, 488);
                } else {
                    vt9Var3.Q();
                }
                return Unit.a;
            case 3:
                Function2 function2 = (Function2) obj10;
                rs5 rs5Var = (rs5) obj9;
                cr9 cr9Var = (cr9) obj8;
                Function0 function0 = (Function0) obj7;
                is5 is5Var = (is5) obj;
                ih5 ih5Var3 = (ih5) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((vt9) ih5Var3).f(is5Var) ? 4 : 2;
                }
                vt9 vt9Var4 = (vt9) ih5Var3;
                if (vt9Var4.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    String str2 = (String) function2.invoke(vt9Var4, 0);
                    if (StringsKt.N(str2)) {
                        d8b.c("Label must not be blank");
                    }
                    rs5Var.getClass();
                    f03.c.n(str2, Boolean.TRUE, is5Var, cr9Var, function0, vt9Var4, Integer.valueOf((iIntValue3 << 9) & 7168));
                } else {
                    vt9Var4.Q();
                }
                return Unit.a;
            case 4:
                String str3 = (String) obj10;
                afe afeVar5 = (afe) obj7;
                g1b g1bVar = (g1b) obj9;
                Function1 function13 = (Function1) obj8;
                yj8 yj8Var = (yj8) obj;
                ih5 ih5Var4 = (ih5) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    vt9 vt9Var5 = (vt9) ih5Var4;
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? vt9Var5.f(yj8Var) : vt9Var5.h(yj8Var) ? 4 : 2;
                }
                vt9 vt9Var6 = (vt9) ih5Var4;
                if (vt9Var6.N(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    if (str3 == null) {
                        str3 = "";
                    }
                    long jD = ua5.d(n39.v, vt9Var6);
                    long jD2 = ua5.d(n39.z, vt9Var6);
                    long jB = u95.b(ua5.d(n39.f, vt9Var6), n39.g);
                    long jD3 = ua5.d(n39.q, vt9Var6);
                    ta5 ta5Var = n39.c;
                    long jD4 = ua5.d(ta5Var, vt9Var6);
                    long jD5 = ua5.d(ta5Var, vt9Var6);
                    long jD6 = ua5.d(ta5Var, vt9Var6);
                    long jD7 = ua5.d(ta5Var, vt9Var6);
                    long jD8 = ua5.d(n39.b, vt9Var6);
                    long jD9 = ua5.d(n39.p, vt9Var6);
                    akl aklVar = (akl) vt9Var6.j(bkl.a);
                    long jD10 = ua5.d(n39.u, vt9Var6);
                    long jD11 = ua5.d(n39.a, vt9Var6);
                    long jB2 = u95.b(ua5.d(n39.d, vt9Var6), n39.e);
                    long jD12 = ua5.d(n39.o, vt9Var6);
                    long jD13 = ua5.d(n39.x, vt9Var6);
                    long jD14 = ua5.d(n39.B, vt9Var6);
                    long jB3 = u95.b(ua5.d(n39.i, vt9Var6), n39.j);
                    long jD15 = ua5.d(n39.s, vt9Var6);
                    long jD16 = ua5.d(n39.y, vt9Var6);
                    long jD17 = ua5.d(n39.D, vt9Var6);
                    long jB4 = u95.b(ua5.d(n39.m, vt9Var6), n39.n);
                    long jD18 = ua5.d(n39.t, vt9Var6);
                    long jD19 = ua5.d(n39.w, vt9Var6);
                    long jD20 = ua5.d(n39.A, vt9Var6);
                    long jD21 = ua5.d(n39.h, vt9Var6);
                    long jD22 = ua5.d(n39.r, vt9Var6);
                    ta5 ta5Var2 = n39.C;
                    long jD23 = ua5.d(ta5Var2, vt9Var6);
                    long jD24 = ua5.d(ta5Var2, vt9Var6);
                    ta5 ta5Var3 = n39.k;
                    long jD25 = ua5.d(ta5Var3, vt9Var6);
                    float f = n39.l;
                    sgl sglVarA = ulp.A(jD, jD2, jB, jD3, jD4, jD5, jD6, jD7, jD8, jD9, aklVar, jD10, jD11, jB2, jD12, jD13, jD14, jB3, jD15, jD16, jD17, jB4, jD18, jD19, jD20, jD21, jD22, jD23, jD24, u95.b(jD25, f), ua5.d(ta5Var2, vt9Var6), ua5.d(ta5Var2, vt9Var6), ua5.d(ta5Var2, vt9Var6), u95.b(ua5.d(ta5Var3, vt9Var6), f), ua5.d(ta5Var2, vt9Var6), ua5.d(ta5Var2, vt9Var6), ua5.d(ta5Var2, vt9Var6), u95.b(ua5.d(ta5Var3, vt9Var6), f), ua5.d(ta5Var2, vt9Var6), vt9Var6, 0, 15);
                    c8e c8eVarW = wxe.w(c8eVarF, yj8Var.a);
                    afe afeVar6 = yj8Var.h;
                    c8e c8eVarD2 = c8eVarW.d(new rj8(new ox0(afeVar6, (byte) 11)));
                    boolean z2 = yj8Var.b;
                    zb7 zb7Var = new zb7(afeVar6, yj8Var.i, z2);
                    String str4 = str3;
                    c8e c8eVarD3 = c8eVarD2.d(h0j.a(f03.N(ruk.a(c8eVarF, zb7Var, new u51(zb7Var, (byte) 1)), new m91(zb7Var, z2, yj8Var.c)), false, new ry7(z2, yj8Var.d, yj8Var.e, yj8Var.f, zb7Var, yj8Var.g)));
                    Object objK8 = vt9Var6.K();
                    if (objK8 == obj6) {
                        objK8 = new tb6((byte) 28);
                        vt9Var6.g0(objK8);
                    }
                    r9h.i(str4, (Function1) objK8, c8eVarD3, false, true, (ikl) null, (ue5) null, (ue5) null, gyg.P(-390320107, new g51(afeVar5, (byte) 1), vt9Var6), (ue5) null, (uac) null, (rvb) null, (ovb) null, 0, 0, (paj) null, sglVarA, vt9Var6, 805330992, 4193768);
                    boolean zBooleanValue = ((Boolean) afeVar5.getValue()).booleanValue();
                    Object objK9 = vt9Var6.K();
                    if (objK9 == obj6) {
                        objK9 = new ox0(afeVar5, (byte) 9);
                        vt9Var6.g0(objK9);
                    }
                    yj8Var.a(zBooleanValue, (Function0) objK9, null, null, false, null, 0L, 0.0f, gyg.P(-1538318800, new f23(g1bVar, function13, afeVar5, (byte) 8), vt9Var6), vt9Var6, 48, 6 | ((iIntValue4 << 3) & 112));
                } else {
                    vt9Var6.Q();
                }
                return Unit.a;
            case 5:
                g1b g1bVar2 = (g1b) obj10;
                Function1 function14 = (Function1) obj9;
                jbg jbgVar = (jbg) obj8;
                ruj rujVar = (ruj) obj7;
                xvf xvfVar = (xvf) obj;
                ih5 ih5Var5 = (ih5) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((vt9) ih5Var5).f(xvfVar) ? 4 : 2;
                }
                vt9 vt9Var7 = (vt9) ih5Var5;
                if (vt9Var7.N(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    c8e c8eVarW2 = a26.W(c8eVarF, xvfVar);
                    boolean zF5 = vt9Var7.f(g1bVar2) | vt9Var7.f(function14) | vt9Var7.f(jbgVar);
                    Object objK10 = vt9Var7.K();
                    if (zF5 || objK10 == obj6) {
                        objK10 = new rg(g1bVar2, rujVar, function14, jbgVar, (byte) 8);
                        vt9Var7.g0(objK10);
                    }
                    sgb.c(c8eVarW2, null, null, null, null, null, false, null, (Function1) objK10, vt9Var7, 0, 510);
                } else {
                    vt9Var7.Q();
                }
                return Unit.a;
            case 6:
                g1b g1bVar3 = (g1b) obj10;
                Function0 function02 = (Function0) obj9;
                Function0 function03 = (Function0) obj8;
                Function0 function04 = (Function0) obj7;
                ih5 ih5Var6 = (ih5) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                vt9 vt9Var8 = (vt9) ih5Var6;
                if (vt9Var8.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    qbe.g(g1bVar3, function02, function03, function04, vt9Var8, 0);
                } else {
                    vt9Var8.Q();
                }
                return Unit.a;
            case 7:
                erd erdVar = (erd) obj10;
                Function1 function15 = (Function1) obj9;
                Function0 function05 = (Function0) obj8;
                Function0 function06 = (Function0) obj7;
                ih5 ih5Var7 = (ih5) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                vt9 vt9Var9 = (vt9) ih5Var7;
                if (vt9Var9.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    c26.e(mzg.q(vt9Var9, 2132021262), mkh.w(1), mzg.q(vt9Var9, 2132021263), null, false, null, new gmf(erdVar.a, function15), 0, 0, null, vt9Var9, 0, 1976);
                    scd.d(j7h.n(vt9Var9, c8eVarF), 0.0f, 0L, vt9Var9, 0, 6);
                    c26.e(mzg.q(vt9Var9, 2132020583), mkh.w(2), mzg.q(vt9Var9, 2132021265), function05, false, null, null, 0, 0, null, vt9Var9, 0, 2032);
                    if (erdVar.c) {
                        vt9Var9.W(93319950);
                        String strQ2 = mzg.q(vt9Var9, 2132019072);
                        if (erdVar.b) {
                            vt9Var9.W(93444043);
                            strQ = mzg.q(vt9Var9, 2132020426);
                            vt9Var9.p(false);
                        } else {
                            vt9Var9.W(93540236);
                            strQ = mzg.q(vt9Var9, 2132020425);
                            vt9Var9.p(false);
                        }
                        c26.e(strQ2, mkh.w(3), strQ, function06, false, null, new emf(phj.h0(vt9Var9, 2131232166)), 0, 0, null, vt9Var9, 2097152, 1968);
                        vt9Var9.p(false);
                    } else {
                        vt9Var9.W(93937222);
                        vt9Var9.p(false);
                    }
                } else {
                    vt9Var9.Q();
                }
                return Unit.a;
            case 8:
                ang angVar = (ang) obj10;
                Function0 function07 = (Function0) obj9;
                Function1 function16 = (Function1) obj8;
                Function0 function08 = (Function0) obj7;
                ih5 ih5Var8 = (ih5) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                vt9 vt9Var10 = (vt9) ih5Var8;
                if (vt9Var10.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    gyg.a(angVar, function07, function16, function08, null, vt9Var10, 0);
                } else {
                    vt9Var10.Q();
                }
                return Unit.a;
            default:
                nvj nvjVar = (nvj) obj10;
                gbc gbcVar = (gbc) obj9;
                mil milVar = (mil) obj8;
                long j = milVar.b;
                i9f i9fVar = (i9f) obj7;
                c8e c8eVar2 = (c8e) obj;
                ((Integer) obj3).getClass();
                vt9 vt9Var11 = (vt9) ((ih5) obj2);
                vt9Var11.W(-84507373);
                boolean zBooleanValue2 = ((Boolean) vt9Var11.j(mi5.y)).booleanValue();
                boolean zG = vt9Var11.g(zBooleanValue2);
                Object objK11 = vt9Var11.K();
                if (zG || objK11 == obj6) {
                    objK11 = new p46(zBooleanValue2);
                    vt9Var11.g0(objK11);
                }
                p46 p46Var = (p46) objK11;
                boolean z3 = nvjVar.a != 16;
                if (((h7c) ((c2o) vt9Var11.j(mi5.u))).b() && gbcVar.b() && xjl.c(j) && z3) {
                    vt9Var11.W(-707487962);
                    sf1 sf1Var = milVar.a;
                    xjl xjlVar = new xjl(j);
                    boolean zH = vt9Var11.h(p46Var);
                    Object objK12 = vt9Var11.K();
                    if (zH || objK12 == obj6) {
                        objK12 = new agb((byte) 29, (mt5) null, p46Var);
                        vt9Var11.g0(objK12);
                    }
                    rm5.f(sf1Var, xjlVar, (Function2) objK12, vt9Var11);
                    boolean zH2 = vt9Var11.h(p46Var) | vt9Var11.h(i9fVar) | vt9Var11.f(milVar) | vt9Var11.h(gbcVar) | vt9Var11.f(nvjVar);
                    Object objK13 = vt9Var11.K();
                    if (zH2 || objK13 == obj6) {
                        objK13 = new ai(p46Var, i9fVar, milVar, gbcVar, nvjVar, (byte) 7);
                        vt9Var11.g0(objK13);
                    }
                    c8eVarF = fr3.F(c8eVar2, (Function1) objK13);
                    vt9Var11.p(false);
                } else {
                    vt9Var11.W(-705473241);
                    vt9Var11.p(false);
                }
                vt9Var11.p(false);
                return c8eVarF;
        }
    }
}
