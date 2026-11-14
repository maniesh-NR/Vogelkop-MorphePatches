package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jk4 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ue5 b;

    public /* synthetic */ jk4(ue5 ue5Var, byte b) {
        this.a = b;
        this.b = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        z7e z7eVar = z7e.b;
        Function0 function0 = m3c.S;
        ue5 ue5Var = this.b;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Number) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    db5 db5VarA = cb5.a(b72.c, rbe.n, vt9Var, 0);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, z7eVar);
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
            case 1:
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        y7b.a("invalid weight; must be greater than zero");
                    }
                    c8e c8eVarB0 = a26.b0(new g4c(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, 0.0f, 0.0f, 10);
                    tfd tfdVarC = nr3.c(rbe.b, false);
                    int iHashCode2 = Long.hashCode(vt9Var2.T);
                    oag oagVarL2 = vt9Var2.l();
                    c8e c8eVarP2 = qyn.P(vt9Var2, c8eVarB0);
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
                    o18.r(0, ue5Var, vt9Var2, true);
                } else {
                    vt9Var2.Q();
                }
                break;
            case 2:
                ih5 ih5Var3 = (ih5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tfd tfdVarC2 = nr3.c(rbe.b, false);
                    int iHashCode3 = Long.hashCode(vt9Var3.T);
                    oag oagVarL3 = vt9Var3.l();
                    c8e c8eVarP3 = qyn.P(vt9Var3, z7eVar);
                    bh5.To.getClass();
                    vt9Var3.a0();
                    if (vt9Var3.S) {
                        vt9Var3.k(function0);
                    } else {
                        vt9Var3.j0();
                    }
                    y4h.o(vt9Var3, tfdVarC2, ujp.f);
                    y4h.o(vt9Var3, oagVarL3, ujp.e);
                    ah5 ah5Var3 = ujp.g;
                    if (vt9Var3.S || !Intrinsics.a(vt9Var3.K(), Integer.valueOf(iHashCode3))) {
                        vep.x(iHashCode3, vt9Var3, iHashCode3, ah5Var3);
                    }
                    y4h.o(vt9Var3, c8eVarP3, ujp.d);
                    o18.r(0, ue5Var, vt9Var3, true);
                } else {
                    vt9Var3.Q();
                }
                break;
            case 3:
                ih5 ih5Var4 = (ih5) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                vt9 vt9Var4 = (vt9) ih5Var4;
                if (vt9Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tfd tfdVarC3 = nr3.c(rbe.b, false);
                    int iHashCode4 = Long.hashCode(vt9Var4.T);
                    oag oagVarL4 = vt9Var4.l();
                    c8e c8eVarP4 = qyn.P(vt9Var4, z7eVar);
                    bh5.To.getClass();
                    vt9Var4.a0();
                    if (vt9Var4.S) {
                        vt9Var4.k(function0);
                    } else {
                        vt9Var4.j0();
                    }
                    y4h.o(vt9Var4, tfdVarC3, ujp.f);
                    y4h.o(vt9Var4, oagVarL4, ujp.e);
                    ah5 ah5Var4 = ujp.g;
                    if (vt9Var4.S || !Intrinsics.a(vt9Var4.K(), Integer.valueOf(iHashCode4))) {
                        vep.x(iHashCode4, vt9Var4, iHashCode4, ah5Var4);
                    }
                    y4h.o(vt9Var4, c8eVarP4, ujp.d);
                    o18.r(0, ue5Var, vt9Var4, true);
                } else {
                    vt9Var4.Q();
                }
                break;
            case 4:
                ih5 ih5Var5 = (ih5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                vt9 vt9Var5 = (vt9) ih5Var5;
                if (vt9Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tfd tfdVarC4 = nr3.c(rbe.b, false);
                    int iHashCode5 = Long.hashCode(vt9Var5.T);
                    oag oagVarL5 = vt9Var5.l();
                    c8e c8eVarP5 = qyn.P(vt9Var5, z7eVar);
                    bh5.To.getClass();
                    vt9Var5.a0();
                    if (vt9Var5.S) {
                        vt9Var5.k(function0);
                    } else {
                        vt9Var5.j0();
                    }
                    y4h.o(vt9Var5, tfdVarC4, ujp.f);
                    y4h.o(vt9Var5, oagVarL5, ujp.e);
                    ah5 ah5Var5 = ujp.g;
                    if (vt9Var5.S || !Intrinsics.a(vt9Var5.K(), Integer.valueOf(iHashCode5))) {
                        vep.x(iHashCode5, vt9Var5, iHashCode5, ah5Var5);
                    }
                    y4h.o(vt9Var5, c8eVarP5, ujp.d);
                    o18.r(0, ue5Var, vt9Var5, true);
                } else {
                    vt9Var5.Q();
                }
                break;
            case 5:
                ih5 ih5Var6 = (ih5) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                vt9 vt9Var6 = (vt9) ih5Var6;
                if (vt9Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tfd tfdVarC5 = nr3.c(rbe.b, false);
                    int iHashCode6 = Long.hashCode(vt9Var6.T);
                    oag oagVarL6 = vt9Var6.l();
                    c8e c8eVarP6 = qyn.P(vt9Var6, z7eVar);
                    bh5.To.getClass();
                    vt9Var6.a0();
                    if (vt9Var6.S) {
                        vt9Var6.k(function0);
                    } else {
                        vt9Var6.j0();
                    }
                    y4h.o(vt9Var6, tfdVarC5, ujp.f);
                    y4h.o(vt9Var6, oagVarL6, ujp.e);
                    ah5 ah5Var6 = ujp.g;
                    if (vt9Var6.S || !Intrinsics.a(vt9Var6.K(), Integer.valueOf(iHashCode6))) {
                        vep.x(iHashCode6, vt9Var6, iHashCode6, ah5Var6);
                    }
                    y4h.o(vt9Var6, c8eVarP6, ujp.d);
                    o18.r(0, ue5Var, vt9Var6, true);
                } else {
                    vt9Var6.Q();
                }
                break;
            default:
                ih5 ih5Var7 = (ih5) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                vt9 vt9Var7 = (vt9) ih5Var7;
                if (vt9Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    c8e c8eVarZ = j14.Z(z7eVar, "Container");
                    tfd tfdVarC6 = nr3.c(rbe.b, true);
                    int iHashCode7 = Long.hashCode(vt9Var7.T);
                    oag oagVarL7 = vt9Var7.l();
                    c8e c8eVarP7 = qyn.P(vt9Var7, c8eVarZ);
                    bh5.To.getClass();
                    vt9Var7.a0();
                    if (vt9Var7.S) {
                        vt9Var7.k(function0);
                    } else {
                        vt9Var7.j0();
                    }
                    y4h.o(vt9Var7, tfdVarC6, ujp.f);
                    y4h.o(vt9Var7, oagVarL7, ujp.e);
                    ah5 ah5Var7 = ujp.g;
                    if (vt9Var7.S || !Intrinsics.a(vt9Var7.K(), Integer.valueOf(iHashCode7))) {
                        vep.x(iHashCode7, vt9Var7, iHashCode7, ah5Var7);
                    }
                    y4h.o(vt9Var7, c8eVarP7, ujp.d);
                    o18.r(0, ue5Var, vt9Var7, true);
                } else {
                    vt9Var7.Q();
                }
                break;
        }
        return Unit.a;
    }
}
