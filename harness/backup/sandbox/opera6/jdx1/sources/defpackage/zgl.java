package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zgl implements Function2 {
    public final /* synthetic */ afe a;
    public final /* synthetic */ mhl b;
    public final /* synthetic */ zvf c;
    public final /* synthetic */ ue5 d;

    public zgl(afe afeVar, mhl mhlVar, zvf zvfVar, ue5 ue5Var) {
        this.a = afeVar;
        this.b = mhlVar;
        this.c = zvfVar;
        this.d = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            c8e c8eVarZ = j14.Z(z7e.b, "Container");
            u22 u22Var = new u22(this.a, afe.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 12);
            hn9.k(this.b);
            c8e c8eVarF = fr3.F(c8eVarZ, new yo7(u22Var, this.c, rbe.n, (byte) 26));
            tfd tfdVarC = nr3.c(rbe.b, true);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarF);
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
            o18.r(0, this.d, vt9Var, true);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
