package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class chl implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w2m b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ikl d;
    public final /* synthetic */ ue5 e;

    public /* synthetic */ chl(w2m w2mVar, long j, ikl iklVar, ue5 ue5Var, byte b) {
        this.a = b;
        this.b = w2mVar;
        this.c = j;
        this.d = iklVar;
        this.e = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Function0 function0 = m3c.S;
        zpa zpaVar = hh5.a;
        z7e z7eVar = z7e.b;
        w2m w2mVar = this.b;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Number) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = vt9Var.f(w2mVar);
                    Object objK = vt9Var.K();
                    if (zF || objK == zpaVar) {
                        objK = new ahl(w2mVar, (byte) 1);
                        vt9Var.g0(objK);
                    }
                    c8e c8eVarN = z5i.N(z7eVar, (Function1) objK);
                    tfd tfdVarC = nr3.c(rbe.b, false);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarN);
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
                    hn9.c(this.c, this.d, this.e, vt9Var, 0);
                    vt9Var.p(true);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zF2 = vt9Var2.f(w2mVar);
                    Object objK2 = vt9Var2.K();
                    if (zF2 || objK2 == zpaVar) {
                        objK2 = new ahl(w2mVar, (byte) 2);
                        vt9Var2.g0(objK2);
                    }
                    c8e c8eVarN2 = z5i.N(z7eVar, (Function1) objK2);
                    tfd tfdVarC2 = nr3.c(rbe.b, false);
                    int iHashCode2 = Long.hashCode(vt9Var2.T);
                    oag oagVarL2 = vt9Var2.l();
                    c8e c8eVarP2 = qyn.P(vt9Var2, c8eVarN2);
                    bh5.To.getClass();
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(function0);
                    } else {
                        vt9Var2.j0();
                    }
                    y4h.o(vt9Var2, tfdVarC2, ujp.f);
                    y4h.o(vt9Var2, oagVarL2, ujp.e);
                    ah5 ah5Var2 = ujp.g;
                    if (vt9Var2.S || !Intrinsics.a(vt9Var2.K(), Integer.valueOf(iHashCode2))) {
                        vep.x(iHashCode2, vt9Var2, iHashCode2, ah5Var2);
                    }
                    y4h.o(vt9Var2, c8eVarP2, ujp.d);
                    hn9.c(this.c, this.d, this.e, vt9Var2, 0);
                    vt9Var2.p(true);
                } else {
                    vt9Var2.Q();
                }
                break;
        }
        return Unit.a;
    }
}
