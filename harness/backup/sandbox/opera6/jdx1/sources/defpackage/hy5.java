package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class hy5 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ey5 b;

    public /* synthetic */ hy5(ey5 ey5Var, byte b) {
        this.a = b;
        this.b = ey5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Function0 function0 = m3c.S;
        ey5 ey5Var = this.b;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c8e c8eVarD = a26.Y(z7e.b, 16.0f, 12.0f).d(mpj.a);
                    o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarD);
                    bh5.To.getClass();
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, o9iVarA, ujp.f);
                    y4h.o(vt9Var, oagVarL, ujp.e);
                    y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
                    y4h.m(vt9Var);
                    y4h.o(vt9Var, c8eVarP, ujp.d);
                    x7d.b(ey5Var.c, null, vt9Var, 0, 2);
                    String str = ey5Var.a;
                    g4c g4cVar = new g4c(1.0f, true);
                    hp7 hp7Var = abm.a;
                    ijl.b(str, g4cVar, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).k, vt9Var, 0, 0, 131068);
                    ijl.b(ey5Var.b, null, ((sa5) vt9Var.j(ua5.a)).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).k, vt9Var, 0, 0, 131066);
                    vt9Var.p(true);
                } else {
                    vt9Var.Q();
                }
                break;
            case 1:
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str2 = ey5Var != null ? ey5Var.c : null;
                    if (str2 == null) {
                        vt9Var2.W(-1961646307);
                    } else {
                        vt9Var2.W(-1961646306);
                        x7d.b(str2, a26.b0(z7e.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), vt9Var2, 48, 0);
                    }
                    vt9Var2.p(false);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                ih5 ih5Var3 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sd3 sd3Var = rbe.l;
                    z7e z7eVar = z7e.b;
                    c8e c8eVarB0 = a26.b0(z7eVar, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    o9i o9iVarA2 = m9i.a(b72.a, sd3Var, vt9Var3, 48);
                    int iHashCode2 = Long.hashCode(vt9Var3.T);
                    oag oagVarL2 = vt9Var3.l();
                    c8e c8eVarP2 = qyn.P(vt9Var3, c8eVarB0);
                    bh5.To.getClass();
                    vt9Var3.a0();
                    if (vt9Var3.S) {
                        vt9Var3.k(function0);
                    } else {
                        vt9Var3.j0();
                    }
                    y4h.o(vt9Var3, o9iVarA2, ujp.f);
                    y4h.o(vt9Var3, oagVarL2, ujp.e);
                    y4h.o(vt9Var3, Integer.valueOf(iHashCode2), ujp.g);
                    y4h.m(vt9Var3);
                    y4h.o(vt9Var3, c8eVarP2, ujp.d);
                    ijl.b(ey5Var != null ? ey5Var.b : "", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var3.j(abm.a)).j, vt9Var3, 0, 0, 131070);
                    scd.j(a26.Z(mpj.c(z7eVar, 24.0f), 8.0f, 0.0f, 2), 0.0f, 0L, vt9Var3, 6);
                    vt9Var3.p(true);
                } else {
                    vt9Var3.Q();
                }
                break;
        }
        return Unit.a;
    }
}
