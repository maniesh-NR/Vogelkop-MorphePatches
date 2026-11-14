package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rtk implements Function2 {
    public final /* synthetic */ c8e a;
    public final /* synthetic */ paj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ go3 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Function2 g;

    public rtk(c8e c8eVar, paj pajVar, long j, float f, go3 go3Var, float f2, Function2 function2) {
        this.a = c8eVar;
        this.b = pajVar;
        this.c = j;
        this.d = f;
        this.e = go3Var;
        this.f = f2;
        this.g = function2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            c8e c8eVarC = utk.c(this.a, this.b, utk.d(this.c, this.d, vt9Var), this.e, ((n27) vt9Var.j(mi5.h)).o0(this.f));
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = new r4k((byte) 26);
                vt9Var.g0(objK);
            }
            c8e c8eVarA = h0j.a(c8eVarC, false, (Function1) objK);
            Unit unit = Unit.a;
            Object objK2 = vt9Var.K();
            if (objK2 == zpaVar) {
                objK2 = qv6.e;
                vt9Var.g0(objK2);
            }
            c8e c8eVarA2 = ruk.a(c8eVarA, unit, (PointerInputEventHandler) objK2);
            tfd tfdVarC = nr3.c(rbe.b, true);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarA2);
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
            this.g.invoke(vt9Var, 0);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
