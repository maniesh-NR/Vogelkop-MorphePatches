package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class v7i implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c8e b;
    public final /* synthetic */ j7i c;

    public /* synthetic */ v7i(c8e c8eVar, j7i j7iVar, byte b) {
        this.a = b;
        this.b = c8eVar;
        this.c = j7iVar;
    }

    public /* synthetic */ v7i(j7i j7iVar, c8e c8eVar, int i) {
        this.a = (byte) 2;
        this.c = j7iVar;
        this.b = c8eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = 0;
        c8e c8eVar = this.b;
        t7i t7iVar = this.c;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c8e c8eVarD = c8eVar.d(mpj.c);
                    hp7 hp7Var = ua5.a;
                    c8e c8eVarC = sfe.C(c8eVarD, ((sa5) vt9Var.j(hp7Var)).F, kfo.i);
                    tfd tfdVarC = nr3.c(rbe.c, false);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarC);
                    bh5.To.getClass();
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(m3c.S);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, tfdVarC, ujp.f);
                    y4h.o(vt9Var, oagVarL, ujp.e);
                    y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
                    y4h.m(vt9Var);
                    y4h.o(vt9Var, c8eVarP, ujp.d);
                    utk.a(null, null, ((sa5) vt9Var.j(hp7Var)).p, 0L, 0.0f, 0.0f, gyg.P(1824852189, new l7i(t7iVar, (byte) 3), vt9Var), vt9Var, 12582912, 123);
                    afe afeVarH = dyg.h(t7iVar.g, vt9Var);
                    nb7 nb7Var = (nb7) afeVarH.getValue();
                    String str = nb7Var != null ? nb7Var.a : null;
                    nb7 nb7Var2 = (nb7) afeVarH.getValue();
                    t0h.c(str, wxe.Q(as3.a.a(z7e.b, rbe.i)), nb7Var2 != null ? nb7Var2.b : null, vt9Var, 0);
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
                    lk8.b(false, gyg.P(-1326966050, new v7i(c8eVar, (j7i) t7iVar, b2), vt9Var2), vt9Var2, 48);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                coh.a(t7iVar, c8eVar, (ih5) obj, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
