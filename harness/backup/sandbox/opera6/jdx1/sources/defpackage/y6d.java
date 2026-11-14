package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class y6d implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hyf b;
    public final /* synthetic */ String c;

    public /* synthetic */ y6d(hyf hyfVar, String str, byte b) {
        this.a = b;
        this.b = hyfVar;
        this.c = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rd3 rd3Var = rbe.o;
                    x62 x62Var = new x62(8.0f, true, new t40((byte) 19));
                    c8e c8eVarZ = a26.Z(mpj.a, 0.0f, 12.0f, 1);
                    db5 db5VarA = cb5.a(x62Var, rd3Var, vt9Var, 54);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarZ);
                    bh5.To.getClass();
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(m3c.S);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, db5VarA, ujp.f);
                    y4h.o(vt9Var, oagVarL, ujp.e);
                    y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
                    y4h.m(vt9Var);
                    y4h.o(vt9Var, c8eVarP, ujp.d);
                    c8e c8eVarH = mpj.h(z7e.b, 24.0f);
                    hp7 hp7Var = ua5.a;
                    wta.b(this.b, null, c8eVarH, ((sa5) vt9Var.j(hp7Var)).a, vt9Var, 440, 0);
                    ijl.b(this.c, null, ((sa5) vt9Var.j(hp7Var)).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).l, vt9Var, 0, 0, 131066);
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
                    unf unfVar = pof.a;
                    wta.b(this.b, this.c, null, pof.a(vt9Var2).a.f(), vt9Var2, 8, 4);
                } else {
                    vt9Var2.Q();
                }
                break;
            case 2:
                ih5 ih5Var3 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    unf unfVar2 = pof.a;
                    wta.b(this.b, this.c, null, pof.a(vt9Var3).a.f(), vt9Var3, 8, 4);
                } else {
                    vt9Var3.Q();
                }
                break;
            default:
                ih5 ih5Var4 = (ih5) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                vt9 vt9Var4 = (vt9) ih5Var4;
                if (vt9Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    unf unfVar3 = pof.a;
                    wta.b(this.b, this.c, null, pof.a(vt9Var4).a.f(), vt9Var4, 8, 4);
                } else {
                    vt9Var4.Q();
                }
                break;
        }
        return Unit.a;
    }
}
