package defpackage;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class hx0 implements Function2 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hx0(Function0 function0, Function0 function02, Function0 function03, t9k t9kVar, boolean z, int i) {
        this.e = function0;
        this.c = function02;
        this.d = function03;
        this.f = t9kVar;
        this.b = z;
    }

    public /* synthetic */ hx0(rx8 rx8Var, afe afeVar, Function0 function0, Function1 function1, boolean z) {
        this.c = rx8Var;
        this.d = afeVar;
        this.e = function0;
        this.f = function1;
        this.b = z;
    }

    public /* synthetic */ hx0(ulp ulpVar, boolean z, lde ldeVar, sgl sglVar, paj pajVar, int i) {
        this.c = ulpVar;
        this.b = z;
        this.d = ldeVar;
        this.e = sglVar;
        this.f = pajVar;
    }

    public /* synthetic */ hx0(boolean z, hyf hyfVar, u95 u95Var, c8e c8eVar, sf1 sf1Var) {
        this.b = z;
        this.c = hyfVar;
        this.d = u95Var;
        this.e = c8eVar;
        this.f = sf1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j;
        byte b = this.a;
        boolean z = this.b;
        byte b2 = 1;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                rx8 rx8Var = (rx8) obj6;
                afe afeVar = (afe) obj5;
                Function0 function0 = (Function0) obj4;
                Function1 function1 = (Function1) obj3;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hkf hkfVar = hkf.a;
                    oup.J(vt9Var, 6);
                    byte b3 = 4;
                    if (((Boolean) afeVar.getValue()).booleanValue()) {
                        vt9Var.W(2045401505);
                        Object objK = vt9Var.K();
                        zpa zpaVar = hh5.a;
                        if (objK == zpaVar) {
                            objK = new ox0(afeVar, (byte) 0);
                            vt9Var.g0(objK);
                        }
                        nb6.b(false, (Function0) objK, vt9Var, 48, 1);
                        WeakHashMap weakHashMap = k3o.x;
                        zc1 zc1Var = fac.m(vt9Var).c;
                        boolean z2 = zc1Var.e().d > 0;
                        Object objK2 = vt9Var.K();
                        if (objK2 == zpaVar) {
                            objK2 = hyg.k(Boolean.FALSE);
                            vt9Var.g0(objK2);
                        }
                        afe afeVar2 = (afe) objK2;
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        boolean zG = vt9Var.g(z2);
                        Object objK3 = vt9Var.K();
                        if (zG || objK3 == zpaVar) {
                            rx0 rx0Var = new rx0(z2, afeVar2, afeVar, null, (byte) 0);
                            vt9Var.g0(rx0Var);
                            objK3 = rx0Var;
                        }
                        rm5.e(vt9Var, boolValueOf, (Function2) objK3);
                        String strA = rx8Var.a();
                        boolean zF = vt9Var.f(rx8Var);
                        Object objK4 = vt9Var.K();
                        if (zF || objK4 == zpaVar) {
                            objK4 = new jx0(rx8Var, (byte) 4);
                            vt9Var.g0(objK4);
                        }
                        Function1 function12 = (Function1) objK4;
                        Object objK5 = vt9Var.K();
                        if (objK5 == zpaVar) {
                            objK5 = new ox0(afeVar, (byte) 1);
                            vt9Var.g0(objK5);
                        }
                        zi4.b(strA, function12, (Function0) objK5, null, mzg.q(vt9Var, 2132017435), u35.g(rx8Var.a().length(), " / 500"), 500, vt9Var, 1573248);
                        vt9Var.p(false);
                    } else {
                        vt9Var.W(2046614008);
                        yi4.f((c8e) null, qbe.E(vt9Var) ? fsp.a : null, fsp.b, gyg.P(-899118761, new f23(function0, function1, rx8Var, b3), vt9Var), (u8i) null, 0L, gyg.P(-1209234109, new a9k(b2, rx8Var, afeVar, z), vt9Var), vt9Var, 12586368);
                        vt9Var.p(false);
                    }
                } else {
                    vt9Var.Q();
                }
                break;
            case 1:
                hyf hyfVar = (hyf) obj6;
                u95 u95Var = (u95) obj5;
                c8e c8eVar = (c8e) obj4;
                sf1 sf1Var = (sf1) obj3;
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z7e z7eVar = z7e.b;
                    if (z) {
                        vt9Var2.W(-1641633188);
                        v4h.a(mpj.h(z7eVar, 24.0f), ((u95) vt9Var2.j(aq5.a)).a, 2.5f, 0L, 0, 0.0f, vt9Var2, 390, 56);
                        vt9Var2.p(false);
                    } else {
                        vt9Var2.W(-1641412437);
                        if (hyfVar != null) {
                            vt9Var2.W(-1641377934);
                            if (u95Var == null) {
                                vt9Var2.W(-745678773);
                                j = ((u95) vt9Var2.j(aq5.a)).a;
                                vt9Var2.p(false);
                            } else {
                                vt9Var2.W(-745679734);
                                vt9Var2.p(false);
                                j = u95Var.a;
                            }
                            wta.b(hyfVar, null, c8eVar, j, vt9Var2, 56, 0);
                            ocp.c(vt9Var2, mpj.h(z7eVar, 8.0f));
                            vt9Var2.p(false);
                        } else {
                            vt9Var2.W(-1641058882);
                            vt9Var2.p(false);
                        }
                        ijl.c(sf1Var, null, 0L, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, null, vt9Var2, 0, 24960, 503806);
                        vt9Var2.p(false);
                    }
                } else {
                    vt9Var2.Q();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                b9k.a((Function0) obj4, (Function0) obj6, (Function0) obj5, (t9k) obj3, this.b, (ih5) obj, aoh.m(4097));
                break;
            default:
                ((Integer) obj2).getClass();
                ((ulp) obj6).w(this.b, (lde) obj5, (sgl) obj4, (paj) obj3, (ih5) obj, aoh.m(114822145));
                break;
        }
        return Unit.a;
    }
}
