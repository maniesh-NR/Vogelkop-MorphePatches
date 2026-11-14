package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class msj implements cr9 {
    public final /* synthetic */ nsj a;
    public final /* synthetic */ nsj b;
    public final /* synthetic */ eo8 c;
    public final /* synthetic */ String d;

    public msj(nsj nsjVar, nsj nsjVar2, eo8 eo8Var, String str) {
        this.a = nsjVar;
        this.b = nsjVar2;
        this.c = eo8Var;
        this.d = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function2 function2 = (Function2) obj;
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((vt9) ih5Var).h(function2) ? 4 : 2;
        }
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            nsj nsjVar = this.b;
            nsj nsjVar2 = this.a;
            boolean zA = Intrinsics.a(nsjVar2, nsjVar);
            a2k a2kVarY = nb6.Y(jae.d, vt9Var);
            boolean zF = vt9Var.f(nsjVar2);
            Object obj4 = this.c;
            boolean zH = zF | vt9Var.h(obj4);
            Object objK = vt9Var.K();
            Object obj5 = hh5.a;
            if (zH || objK == obj5) {
                objK = new s4f(nsjVar2, obj4, (byte) 24);
                vt9Var.g0(objK);
            }
            Function0 function0 = (Function0) objK;
            Object objK2 = vt9Var.K();
            if (objK2 == obj5) {
                objK2 = ui6.a(!zA ? 1.0f : 0.0f);
                vt9Var.g0(objK2);
            }
            cd1 cd1Var = (cd1) objK2;
            Boolean boolValueOf = Boolean.valueOf(zA);
            boolean zH2 = vt9Var.h(cd1Var) | vt9Var.g(zA) | vt9Var.h(a2kVarY) | vt9Var.f(function0);
            Object objK3 = vt9Var.K();
            if (zH2 || objK3 == obj5) {
                Object vf6Var = new vf6(cd1Var, zA, a2kVarY, function0, (mt5) null);
                vt9Var.g0(vf6Var);
                objK3 = vf6Var;
            }
            rm5.e(vt9Var, boolValueOf, (Function2) objK3);
            xe1 xe1Var = cd1Var.c;
            a2k a2kVarY2 = nb6.Y(jae.b, vt9Var);
            Object objK4 = vt9Var.K();
            if (objK4 == obj5) {
                objK4 = ui6.a(zA ? 0.8f : 1.0f);
                vt9Var.g0(objK4);
            }
            cd1 cd1Var2 = (cd1) objK4;
            Boolean boolValueOf2 = Boolean.valueOf(zA);
            boolean zH3 = vt9Var.h(cd1Var2) | vt9Var.g(zA) | vt9Var.h(a2kVarY2);
            Object objK5 = vt9Var.K();
            if (zH3 || objK5 == obj5) {
                objK5 = new t07(cd1Var2, zA, a2kVarY2, (mt5) null);
                vt9Var.g0(objK5);
            }
            rm5.e(vt9Var, boolValueOf2, (Function2) objK5);
            xe1 xe1Var2 = cd1Var2.c;
            c8e c8eVarP = z5i.P(z7e.b, ((Number) xe1Var2.b.getValue()).floatValue(), ((Number) xe1Var2.b.getValue()).floatValue(), ((Number) xe1Var.b.getValue()).floatValue(), 0.0f, null, 131064);
            boolean zG = vt9Var.g(zA) | vt9Var.f(nsjVar2);
            String str = this.d;
            boolean zF2 = zG | vt9Var.f(str);
            Object objK6 = vt9Var.K();
            if (zF2 || objK6 == obj5) {
                objK6 = new v2e(zA, str, nsjVar2);
                vt9Var.g0(objK6);
            }
            c8e c8eVarA = h0j.a(c8eVarP, false, (Function1) objK6);
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, c8eVarA);
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
            y4h.o(vt9Var, c8eVarP2, ujp.d);
            function2.invoke(vt9Var, Integer.valueOf(iIntValue & 14));
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
