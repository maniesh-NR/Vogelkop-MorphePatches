package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vhc implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rhc b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ vhc(rhc rhcVar, Function2 function2, byte b) {
        this.a = b;
        this.b = rhcVar;
        this.c = function2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Function0 function0 = m3c.S;
        rhc rhcVar = this.b;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Number) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c8e c8eVarB0 = a26.b0(z7e.b, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    tfd tfdVarC = nr3.c(rbe.b, false);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarB0);
                    bh5.To.getClass();
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function0);
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
                    kfo.c(aq5.a.a(new u95(rhcVar.c)), this.c, vt9Var, 8);
                    vt9Var.p(true);
                } else {
                    vt9Var.Q();
                }
                break;
            case 1:
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ic4.g(rhcVar.e, ric.o, this.c, vt9Var2, 48);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                ih5 ih5Var3 = (ih5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c8e c8eVarB02 = a26.b0(z7e.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    tfd tfdVarC2 = nr3.c(rbe.b, false);
                    int iHashCode2 = Long.hashCode(vt9Var3.T);
                    oag oagVarL2 = vt9Var3.l();
                    c8e c8eVarP2 = qyn.P(vt9Var3, c8eVarB02);
                    bh5.To.getClass();
                    vt9Var3.a0();
                    if (vt9Var3.S) {
                        vt9Var3.k(function0);
                    } else {
                        vt9Var3.j0();
                    }
                    y4h.o(vt9Var3, tfdVarC2, ujp.f);
                    y4h.o(vt9Var3, oagVarL2, ujp.e);
                    ah5 ah5Var2 = ujp.g;
                    if (vt9Var3.S || !Intrinsics.a(vt9Var3.K(), Integer.valueOf(iHashCode2))) {
                        vep.x(iHashCode2, vt9Var3, iHashCode2, ah5Var2);
                    }
                    y4h.o(vt9Var3, c8eVarP2, ujp.d);
                    ic4.g(rhcVar.f, ric.r, this.c, vt9Var3, 48);
                    vt9Var3.p(true);
                } else {
                    vt9Var3.Q();
                }
                break;
        }
        return Unit.a;
    }
}
