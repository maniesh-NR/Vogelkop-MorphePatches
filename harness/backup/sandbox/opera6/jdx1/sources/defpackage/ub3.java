package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ub3 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ br9 c;

    public /* synthetic */ ub3(Object obj, br9 br9Var, byte b) {
        this.a = b;
        this.b = obj;
        this.c = br9Var;
    }

    public /* synthetic */ ub3(ue5 ue5Var, Object obj, byte b) {
        this.a = b;
        this.c = ue5Var;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        switch (this.a) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Number) obj2).intValue();
                String str = (String) this.b;
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z7e z7eVar = z7e.b;
                    boolean zF = vt9Var.f(str);
                    Object objK = vt9Var.K();
                    if (zF || objK == hh5.a) {
                        objK = new tx0(str, (byte) 9);
                        vt9Var.g0(objK);
                    }
                    c8e c8eVarA = h0j.a(z7eVar, false, (Function1) objK);
                    ue5 ue5Var = (ue5) this.c;
                    tfd tfdVarC = nr3.c(rbe.b, false);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarA);
                    bh5.To.getClass();
                    fza fzaVar = m3c.S;
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(fzaVar);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, tfdVarC, ujp.f);
                    y4h.o(vt9Var, oagVarL, ujp.e);
                    ah5 ah5Var = ujp.g;
                    if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                        vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
                    }
                    y4h.o(vt9Var, c8eVarP, ujp.d);
                    o18.r(0, ue5Var, vt9Var, true);
                } else {
                    vt9Var.Q();
                }
                return Unit.a;
            case 1:
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c8e c8eVarW = a26.W(mpj.a(z7e.b, b24.c, b24.d), (zvf) this.b);
                    ydp ydpVar = b72.e;
                    sd3 sd3Var = rbe.l;
                    cr9 cr9Var = this.c;
                    o9i o9iVarA = m9i.a(ydpVar, sd3Var, vt9Var2, 54);
                    int iHashCode2 = Long.hashCode(vt9Var2.T);
                    oag oagVarL2 = vt9Var2.l();
                    c8e c8eVarP2 = qyn.P(vt9Var2, c8eVarW);
                    bh5.To.getClass();
                    fza fzaVar2 = m3c.S;
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(fzaVar2);
                    } else {
                        vt9Var2.j0();
                    }
                    y4h.o(vt9Var2, o9iVarA, ujp.f);
                    y4h.o(vt9Var2, oagVarL2, ujp.e);
                    ah5 ah5Var2 = ujp.g;
                    if (vt9Var2.S || !Intrinsics.a(vt9Var2.K(), Integer.valueOf(iHashCode2))) {
                        vep.x(iHashCode2, vt9Var2, iHashCode2, ah5Var2);
                    }
                    y4h.o(vt9Var2, c8eVarP2, ujp.d);
                    cr9Var.invoke(q9i.a, vt9Var2, 6);
                    vt9Var2.p(true);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 2:
                ih5 ih5Var3 = (ih5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ic4.g(((rhc) this.b).b, ric.j, (ue5) this.c, vt9Var3, 48);
                } else {
                    vt9Var3.Q();
                }
                return Unit.a;
            case 3:
                ih5 ih5Var4 = (ih5) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                vt9 vt9Var4 = (vt9) ih5Var4;
                if (vt9Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ijl.a(((wam) this.b).j, (ue5) this.c, vt9Var4, 0);
                } else {
                    vt9Var4.Q();
                }
                return Unit.a;
            case 4:
                ((List) obj).size();
                ((List) obj2).size();
                tn tnVar = ((t7i) this.b).i;
                synchronized (((j06) tnVar.b)) {
                    obj3 = tnVar.c;
                }
                Object obj4 = ((fx4) obj3).a.b;
                n6i n6iVar = obj4 instanceof n6i ? (n6i) obj4 : null;
                if (n6iVar != null) {
                    this.c.invoke(n6iVar);
                }
                return Unit.a;
            case 5:
                ih5 ih5Var5 = (ih5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                vt9 vt9Var5 = (vt9) ih5Var5;
                if (vt9Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ue5 ue5Var2 = (ue5) this.c;
                    ili iliVar = (ili) this.b;
                    z7e z7eVar2 = z7e.b;
                    tfd tfdVarC2 = nr3.c(rbe.b, false);
                    int iHashCode3 = Long.hashCode(vt9Var5.T);
                    oag oagVarL3 = vt9Var5.l();
                    c8e c8eVarP3 = qyn.P(vt9Var5, z7eVar2);
                    bh5.To.getClass();
                    fza fzaVar3 = m3c.S;
                    vt9Var5.a0();
                    if (vt9Var5.S) {
                        vt9Var5.k(fzaVar3);
                    } else {
                        vt9Var5.j0();
                    }
                    y4h.o(vt9Var5, tfdVarC2, ujp.f);
                    y4h.o(vt9Var5, oagVarL3, ujp.e);
                    ah5 ah5Var3 = ujp.g;
                    if (vt9Var5.S || !Intrinsics.a(vt9Var5.K(), Integer.valueOf(iHashCode3))) {
                        vep.x(iHashCode3, vt9Var5, iHashCode3, ah5Var3);
                    }
                    y4h.o(vt9Var5, c8eVarP3, ujp.d);
                    ue5Var2.invoke(iliVar, vt9Var5, 6);
                    vt9Var5.p(true);
                } else {
                    vt9Var5.Q();
                }
                return Unit.a;
            case 6:
                ih5 ih5Var6 = (ih5) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                vt9 vt9Var6 = (vt9) ih5Var6;
                if (vt9Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ((ue5) this.c).invoke((nsj) this.b, vt9Var6, 0);
                } else {
                    vt9Var6.Q();
                }
                return Unit.a;
            case 7:
                ih5 ih5Var7 = (ih5) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                vt9 vt9Var7 = (vt9) ih5Var7;
                if (vt9Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ((ue5) this.c).invoke((dhl) this.b, vt9Var7, 6);
                } else {
                    vt9Var7.Q();
                }
                return Unit.a;
            default:
                ih5 ih5Var8 = (ih5) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                vt9 vt9Var8 = (vt9) ih5Var8;
                if (vt9Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    z7e z7eVar3 = z7e.b;
                    afe afeVar = (afe) this.b;
                    Object objK2 = vt9Var8.K();
                    if (objK2 == hh5.a) {
                        objK2 = new gb1(afeVar, (byte) 19);
                        vt9Var8.g0(objK2);
                    }
                    c8e c8eVarH = na2.H(z7eVar3, (Function1) objK2);
                    ue5 ue5Var3 = (ue5) this.c;
                    tfd tfdVarC3 = nr3.c(rbe.b, false);
                    int iHashCode4 = Long.hashCode(vt9Var8.T);
                    oag oagVarL4 = vt9Var8.l();
                    c8e c8eVarP4 = qyn.P(vt9Var8, c8eVarH);
                    bh5.To.getClass();
                    fza fzaVar4 = m3c.S;
                    vt9Var8.a0();
                    if (vt9Var8.S) {
                        vt9Var8.k(fzaVar4);
                    } else {
                        vt9Var8.j0();
                    }
                    y4h.o(vt9Var8, tfdVarC3, ujp.f);
                    y4h.o(vt9Var8, oagVarL4, ujp.e);
                    ah5 ah5Var4 = ujp.g;
                    if (vt9Var8.S || !Intrinsics.a(vt9Var8.K(), Integer.valueOf(iHashCode4))) {
                        vep.x(iHashCode4, vt9Var8, iHashCode4, ah5Var4);
                    }
                    y4h.o(vt9Var8, c8eVarP4, ujp.d);
                    o18.r(0, ue5Var3, vt9Var8, true);
                } else {
                    vt9Var8.Q();
                }
                return Unit.a;
        }
    }
}
