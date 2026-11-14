package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bhl implements cr9 {
    public final /* synthetic */ w2m a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ikl c;
    public final /* synthetic */ ue5 d;

    public bhl(w2m w2mVar, long j, ikl iklVar, ue5 ue5Var) {
        this.a = w2mVar;
        this.b = j;
        this.c = iklVar;
        this.d = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c8e c8eVar = (c8e) obj;
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((vt9) ih5Var).f(c8eVar) ? 4 : 2;
        }
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            w2m w2mVar = this.a;
            boolean zF = vt9Var.f(w2mVar);
            Object objK = vt9Var.K();
            if (zF || objK == hh5.a) {
                objK = new ahl(w2mVar, (byte) 0);
                vt9Var.g0(objK);
            }
            c8e c8eVarN = z5i.N(c8eVar, (Function1) objK);
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarN);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
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
            hn9.c(this.b, this.c, this.d, vt9Var, 0);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
