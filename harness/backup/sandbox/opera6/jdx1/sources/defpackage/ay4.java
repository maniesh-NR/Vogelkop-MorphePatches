package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ay4 implements cr9 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public ay4(long j, sah sahVar) {
        this.b = j;
        this.c = sahVar;
    }

    public ay4(ue5 ue5Var, long j) {
        this.c = ue5Var;
        this.b = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ue5 ue5VarP;
        byte b = this.a;
        long j = this.b;
        zpa zpaVar = hh5.a;
        z7e z7eVar = z7e.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj2;
                ((Number) obj3).intValue();
                ue5 ue5Var = (ue5) obj4;
                zvf zvfVar = ey4.a;
                if (ue5Var != null) {
                    vt9 vt9Var = (vt9) ih5Var;
                    vt9Var.W(1575390813);
                    ue5VarP = gyg.P(-237350650, new dy4(j, ue5Var, (byte) 0), vt9Var);
                    vt9Var.p(false);
                } else {
                    vt9 vt9Var2 = (vt9) ih5Var;
                    vt9Var2.W(1575618259);
                    vt9Var2.p(false);
                    ue5VarP = null;
                }
                vt9 vt9Var3 = (vt9) ih5Var;
                Object objK = vt9Var3.K();
                if (objK == zpaVar) {
                    objK = hyg.k(ue5VarP);
                    vt9Var3.g0(objK);
                }
                afe afeVar = (afe) objK;
                if (ue5VarP != null) {
                    afeVar.setValue(ue5VarP);
                }
                tfd tfdVarC = nr3.c(rbe.f, false);
                int iT = mkh.t(ih5Var);
                vt9 vt9Var4 = (vt9) ih5Var;
                oag oagVarL = vt9Var4.l();
                c8e c8eVarP = qyn.P(ih5Var, z7eVar);
                bh5.To.getClass();
                vt9Var4.a0();
                if (vt9Var4.S) {
                    vt9Var4.k(m3c.S);
                } else {
                    vt9Var4.j0();
                }
                y4h.o(ih5Var, tfdVarC, ujp.f);
                y4h.o(ih5Var, oagVarL, ujp.e);
                ah5 ah5Var = ujp.g;
                if (vt9Var4.S || !Intrinsics.a(vt9Var4.K(), Integer.valueOf(iT))) {
                    vep.x(iT, vt9Var4, iT, ah5Var);
                }
                y4h.o(ih5Var, c8eVarP, ujp.d);
                Function2 function2 = (Function2) afeVar.getValue();
                if (function2 == null) {
                    vt9Var4.W(-1538103400);
                } else {
                    vt9Var4.W(-326710903);
                    function2.invoke(ih5Var, 0);
                }
                vt9Var4.p(false);
                vt9Var4.p(true);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ih5 ih5Var2 = (ih5) obj2;
                int iIntValue = ((Number) obj3).intValue();
                sah sahVar = (sah) obj4;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((vt9) ih5Var2).g(zBooleanValue) ? 4 : 2;
                }
                vt9 vt9Var5 = (vt9) ih5Var2;
                if (!vt9Var5.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    vt9Var5.Q();
                } else if (zBooleanValue) {
                    vt9Var5.W(-499784343);
                    v4h.a(mpj.h(z7eVar, 16.0f), this.b, 2.5f, 0L, 0, 0.0f, vt9Var5, 390, 56);
                    vt9Var5.p(false);
                } else {
                    vt9Var5.W(-499540745);
                    boolean zF = vt9Var5.f(sahVar);
                    Object objK2 = vt9Var5.K();
                    if (zF || objK2 == zpaVar) {
                        objK2 = new pv6(sahVar, (byte) 2);
                        vt9Var5.g0(objK2);
                    }
                    lah.a((u89) objK2, j, vt9Var5, 0);
                    vt9Var5.p(false);
                }
                break;
        }
        return Unit.a;
    }
}
