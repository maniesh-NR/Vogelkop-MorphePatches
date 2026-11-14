package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class u41 implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ c8e c;

    public /* synthetic */ u41(long j, c8e c8eVar) {
        this.b = j;
        this.c = c8eVar;
    }

    public /* synthetic */ u41(long j, c8e c8eVar, int i) {
        this.b = j;
        this.c = c8eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        long j = this.b;
        ih5 ih5Var = (ih5) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c8e c8eVar = this.c;
                    if (j != 9205357640488583168L) {
                        vt9Var.W(-1244013944);
                        c8e c8eVarG = mpj.g(c8eVar, kh7.b(j), kh7.a(j), 0.0f, 0.0f, 12);
                        tfd tfdVarC = nr3.c(rbe.c, false);
                        int iHashCode = Long.hashCode(vt9Var.T);
                        oag oagVarL = vt9Var.l();
                        c8e c8eVarP = qyn.P(vt9Var, c8eVarG);
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
                        z41.b(0, 1, vt9Var, null);
                        vt9Var.p(true);
                        vt9Var.p(false);
                    } else {
                        vt9Var.W(-1243644858);
                        z41.b(0, 0, vt9Var, c8eVar);
                        vt9Var.p(false);
                    }
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                num.getClass();
                phj.p(j, this.c, ih5Var, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
