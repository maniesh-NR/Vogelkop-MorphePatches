package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s26 extends ozb implements Function2 {
    public final /* synthetic */ b3m i;
    public final /* synthetic */ h49 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ ue5 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s26(b3m b3mVar, h49 h49Var, Object obj, ue5 ue5Var) {
        super(2);
        this.i = b3mVar;
        this.j = h49Var;
        this.k = obj;
        this.l = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object objC;
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            q26 q26Var = new q26(this.j, (byte) 0);
            j8m j8mVar = a26.e;
            b3m b3mVar = this.i;
            boolean zG = b3mVar.g();
            zpa zpaVar = hh5.a;
            if (zG) {
                vt9Var.W(1666827533);
                vt9Var.p(false);
                objC = b3mVar.c();
            } else {
                vt9Var.W(1666573488);
                boolean zF = vt9Var.f(b3mVar);
                objC = vt9Var.K();
                if (zF || objC == zpaVar) {
                    ttj ttjVarT = bwg.t();
                    Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
                    ttj ttjVarX = bwg.x(ttjVarT);
                    try {
                        Object objC2 = b3mVar.c();
                        bwg.A(ttjVarT, ttjVarX, function1E);
                        vt9Var.g0(objC2);
                        objC = objC2;
                    } catch (Throwable th) {
                        bwg.A(ttjVarT, ttjVarX, function1E);
                        throw th;
                    }
                }
                vt9Var.p(false);
            }
            vt9Var.W(1378811975);
            Object obj3 = this.k;
            float f = Intrinsics.a(objC, obj3) ? 1.0f : 0.0f;
            vt9Var.p(false);
            Float fValueOf = Float.valueOf(f);
            boolean zF2 = vt9Var.f(b3mVar);
            Object objK = vt9Var.K();
            if (zF2 || objK == zpaVar) {
                objK = luj.b(new r26(b3mVar, (byte) 0));
                vt9Var.g0(objK);
            }
            Object value = ((iak) objK).getValue();
            vt9Var.W(1378811975);
            float f2 = Intrinsics.a(value, obj3) ? 1.0f : 0.0f;
            vt9Var.p(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zF3 = vt9Var.f(b3mVar);
            Object objK2 = vt9Var.K();
            if (zF3 || objK2 == zpaVar) {
                objK2 = luj.b(new r26(b3mVar, (byte) 1));
                vt9Var.g0(objK2);
            }
            w2m w2mVarN = r9h.n(b3mVar, fValueOf, fValueOf2, (h49) q26Var.invoke(((iak) objK2).getValue(), vt9Var, 0), j8mVar, vt9Var, 0);
            boolean zF4 = vt9Var.f(w2mVarN);
            Object objK3 = vt9Var.K();
            if (zF4 || objK3 == zpaVar) {
                objK3 = new b11((Object) w2mVarN, (byte) 9);
                vt9Var.g0(objK3);
            }
            c8e c8eVarN = z5i.N(z7e.b, (Function1) objK3);
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
            y4h.j(vt9Var, Integer.valueOf(iHashCode));
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            this.l.invoke(obj3, vt9Var, 0);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
