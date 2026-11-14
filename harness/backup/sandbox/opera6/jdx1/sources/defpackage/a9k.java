package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a9k implements cr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a9k(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = obj2;
    }

    public /* synthetic */ a9k(boolean z, q0g q0gVar, q0g q0gVar2) {
        this.a = (byte) 2;
        this.b = z;
        this.d = q0gVar;
        this.c = q0gVar2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vt9 vt9Var;
        z14 z14VarB;
        Function0 function0;
        int iJ;
        int iH;
        byte b = this.a;
        z7e z7eVar = z7e.b;
        zpa zpaVar = hh5.a;
        boolean z = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                Function0 function02 = (Function0) obj5;
                afe afeVar = (afe) obj4;
                ih5 ih5Var = (ih5) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                vt9 vt9Var2 = (vt9) ih5Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strQ = mzg.q(vt9Var2, 2132020022);
                    boolean zBooleanValue = ((Boolean) afeVar.getValue()).booleanValue();
                    smf smfVar = smf.a;
                    rmf rmfVar = rmf.b;
                    if (((Boolean) afeVar.getValue()).booleanValue()) {
                        vt9Var2.W(-153681458);
                        zvf zvfVar = b24.a;
                        unf unfVar = pof.a;
                        z14VarB = b24.b(pof.a(vt9Var2).a.h(), pof.a(vt9Var2).a.j(), pof.a(vt9Var2).a.h(), pof.a(vt9Var2).a.j(), vt9Var2, 0);
                        vt9Var = vt9Var2;
                        vt9Var.p(false);
                    } else {
                        vt9Var = vt9Var2;
                        vt9Var.W(-153288750);
                        zvf zvfVar2 = b24.a;
                        unf unfVar2 = pof.a;
                        z14VarB = b24.b(pof.a(vt9Var).a.h(), pof.a(vt9Var).a.g(), pof.a(vt9Var).a.h(), pof.a(vt9Var).a.g(), vt9Var, 0);
                        vt9Var.p(false);
                    }
                    z14 z14Var = z14VarB;
                    c8e c8eVarB0 = a26.b0(mpj.m(z7eVar, 560.0f, 1).d(mpj.a), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    boolean zF = vt9Var.f(function02);
                    Object objK = vt9Var.K();
                    if (zF || objK == zpaVar) {
                        objK = new nx0(function02, (byte) 9);
                        vt9Var.g0(objK);
                    }
                    scd.f((Function0) objK, strQ, c8eVarB0, zBooleanValue, this.b, smfVar, rmfVar, z14Var, null, null, null, null, null, null, vt9Var, 1769856, 0, 16128);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 1:
                rx8 rx8Var = (rx8) obj5;
                afe afeVar2 = (afe) obj4;
                ih5 ih5Var2 = (ih5) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                vt9 vt9Var3 = (vt9) ih5Var2;
                if (vt9Var3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    if (z) {
                        vt9Var3.W(1892468358);
                        Object objK2 = vt9Var3.K();
                        if (objK2 == zpaVar) {
                            objK2 = new ox0(afeVar2, (byte) 2);
                            vt9Var3.g0(objK2);
                        }
                        function0 = (Function0) objK2;
                        vt9Var3.p(false);
                    } else {
                        vt9Var3.W(1892499450);
                        vt9Var3.p(false);
                        function0 = null;
                    }
                    yi4.c(rx8Var, function0, vt9Var3, 0, 0);
                } else {
                    vt9Var3.Q();
                }
                return Unit.a;
            case 2:
                vfd vfdVar = (vfd) obj;
                pfd pfdVar = (pfd) obj2;
                yo5 yo5Var = (yo5) obj3;
                int iG = ap5.g(((q0g) obj5).h(), yo5Var.a);
                long j = yo5Var.a;
                int iF = ap5.f(((q0g) obj4).h(), j);
                if (z) {
                    iJ = iG;
                    iH = iJ;
                } else {
                    iJ = yo5.j(j);
                    iH = yo5.h(j);
                }
                ifg ifgVarN = pfdVar.N(yo5.a(iJ, iH, 0, iF, 4, yo5Var.a));
                return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 4));
            case 3:
                Function0 function03 = (Function0) obj5;
                Function0 function04 = (Function0) obj4;
                ih5 ih5Var3 = (ih5) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                vt9 vt9Var4 = (vt9) ih5Var3;
                if (vt9Var4.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    vt9 vt9Var5 = vt9Var4;
                    ddh.a(function03, (c8e) null, nb6.e, vt9Var5, 384, 2);
                    if (z) {
                        vt9Var5.W(1846326092);
                        ddh.a(function04, (c8e) null, nb6.f, vt9Var5, 384, 2);
                        vt9Var5 = vt9Var5;
                        vt9Var5.p(false);
                    } else {
                        vt9Var5.W(1846532707);
                        vt9Var5.p(false);
                    }
                    ocp.c(vt9Var5, mpj.l(z7eVar, 4.0f));
                } else {
                    vt9Var4.Q();
                }
                return Unit.a;
            default:
                vhl vhlVar = (vhl) obj5;
                t0g t0gVar = vhlVar.f;
                lde ldeVar = (lde) obj4;
                ((Integer) obj3).getClass();
                vt9 vt9Var6 = (vt9) ((ih5) obj2);
                vt9Var6.W(-2137546592);
                boolean z2 = ((fsf) t0gVar.getValue()) == fsf.a || !(vt9Var6.j(mi5.n) == d2c.b);
                boolean zF2 = vt9Var6.f(vhlVar);
                Object objK3 = vt9Var6.K();
                if (zF2 || objK3 == zpaVar) {
                    objK3 = new qfl(vhlVar, (byte) 3);
                    vt9Var6.g0(objK3);
                }
                afe afeVarO = hyg.o((Function1) objK3, vt9Var6);
                Object objK4 = vt9Var6.K();
                if (objK4 == zpaVar) {
                    fv6 fv6Var = new fv6(new gb1(afeVarO, (byte) 16));
                    vt9Var6.g0(fv6Var);
                    objK4 = fv6Var;
                }
                kpi kpiVar = (kpi) objK4;
                boolean zF3 = vt9Var6.f(kpiVar) | vt9Var6.f(vhlVar);
                Object objK5 = vt9Var6.K();
                if (zF3 || objK5 == zpaVar) {
                    objK5 = new uhl(kpiVar, vhlVar);
                    vt9Var6.g0(objK5);
                }
                c8e c8eVarA = epi.a((uhl) objK5, (fsf) t0gVar.getValue(), z && vhlVar.b.h() != 0.0f, z2, ldeVar);
                vt9Var6.p(false);
                return c8eVarA;
        }
    }
}
