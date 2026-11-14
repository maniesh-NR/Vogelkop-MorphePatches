package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class q91 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aog b;
    public final /* synthetic */ afe c;

    public /* synthetic */ q91(aog aogVar, afe afeVar, byte b) {
        this.a = b;
        this.b = aogVar;
        this.c = afeVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        afe afeVar = this.c;
        aog aogVar = this.b;
        byte b2 = 1;
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kfo.c(w91.b.a(Boolean.TRUE), gyg.P(1022273628, new q91(aogVar, afeVar, b2), vt9Var), vt9Var, 56);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                vt9 vt9Var2 = (vt9) ih5Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objK = vt9Var2.K();
                    zpa zpaVar = hh5.a;
                    if (objK == zpaVar) {
                        objK = new k51((byte) 2);
                        vt9Var2.g0(objK);
                    }
                    c8e c8eVarA = h0j.a(z7e.b, false, (Function1) objK);
                    boolean zH = vt9Var2.h(aogVar);
                    Object objK2 = vt9Var2.K();
                    if (zH || objK2 == zpaVar) {
                        objK2 = new p91(aogVar, (byte) 0);
                        vt9Var2.g0(objK2);
                    }
                    c8e c8eVarO = y9m.o(scd.b0(c8eVarA, (Function1) objK2), ((Boolean) aogVar.t.getValue()).booleanValue() ? 1.0f : 0.0f);
                    Function2 function2 = (Function2) afeVar.getValue();
                    Object objK3 = vt9Var2.K();
                    if (objK3 == zpaVar) {
                        objK3 = m51.c;
                        vt9Var2.g0(objK3);
                    }
                    tfd tfdVar = (tfd) objK3;
                    int iHashCode = Long.hashCode(vt9Var2.T);
                    oag oagVarL = vt9Var2.l();
                    c8e c8eVarP = qyn.P(vt9Var2, c8eVarO);
                    bh5.To.getClass();
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(m3c.S);
                    } else {
                        vt9Var2.j0();
                    }
                    y4h.o(vt9Var2, tfdVar, ujp.f);
                    y4h.o(vt9Var2, oagVarL, ujp.e);
                    y4h.o(vt9Var2, Integer.valueOf(iHashCode), ujp.g);
                    y4h.m(vt9Var2);
                    y4h.o(vt9Var2, c8eVarP, ujp.d);
                    function2.invoke(vt9Var2, 0);
                    vt9Var2.p(true);
                } else {
                    vt9Var2.Q();
                }
                break;
        }
        return Unit.a;
    }
}
