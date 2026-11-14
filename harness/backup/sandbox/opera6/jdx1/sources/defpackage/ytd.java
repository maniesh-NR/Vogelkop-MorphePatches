package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ytd implements Function2 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ue5 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public ytd(b3m b3mVar, ue5 ue5Var, ytl ytlVar) {
        this.c = b3mVar;
        this.b = ue5Var;
        this.d = ytlVar;
    }

    public ytd(c8e c8eVar, voi voiVar, ue5 ue5Var) {
        this.c = c8eVar;
        this.d = voiVar;
        this.b = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Function0 function0 = m3c.S;
        Object obj3 = this.d;
        ue5 ue5Var = this.b;
        Object obj4 = this.c;
        byte b2 = 2;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Number) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c8e c8eVarZ = a26.Z((c8e) obj4, 0.0f, 8.0f, 1);
                    uhb uhbVar = uhb.a;
                    c8e c8eVarS0 = oup.s0(na2.Y(c8eVarZ), (voi) obj3, true, true);
                    db5 db5VarA = cb5.a(b72.c, rbe.n, vt9Var, 0);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarS0);
                    bh5.To.getClass();
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, db5VarA, ujp.f);
                    y4h.o(vt9Var, oagVarL, ujp.e);
                    ah5 ah5Var = ujp.g;
                    if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                        vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
                    }
                    y4h.o(vt9Var, c8eVarP, ujp.d);
                    ue5Var.invoke(eb5.a, vt9Var, 6);
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
                    gh5 gh5Var = new gh5(uup.d, new kx4((b3m) obj4, b2));
                    ytl ytlVar = (ytl) obj3;
                    tfd tfdVarC = nr3.c(rbe.b, false);
                    int iHashCode2 = Long.hashCode(vt9Var2.T);
                    oag oagVarL2 = vt9Var2.l();
                    c8e c8eVarP2 = qyn.P(vt9Var2, gh5Var);
                    bh5.To.getClass();
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(function0);
                    } else {
                        vt9Var2.j0();
                    }
                    y4h.o(vt9Var2, tfdVarC, ujp.f);
                    y4h.o(vt9Var2, oagVarL2, ujp.e);
                    ah5 ah5Var2 = ujp.g;
                    if (vt9Var2.S || !Intrinsics.a(vt9Var2.K(), Integer.valueOf(iHashCode2))) {
                        vep.x(iHashCode2, vt9Var2, iHashCode2, ah5Var2);
                    }
                    y4h.o(vt9Var2, c8eVarP2, ujp.d);
                    ue5Var.invoke(ytlVar, vt9Var2, 6);
                    vt9Var2.p(true);
                } else {
                    vt9Var2.Q();
                }
                break;
        }
        return Unit.a;
    }
}
