package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class y35 implements cr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ y35(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lde ldeVar;
        switch (this.a) {
            case 0:
                ((Integer) obj3).getClass();
                vt9 vt9Var = (vt9) ((ih5) obj2);
                vt9Var.W(-756081143);
                g6b g6bVar = (g6b) vt9Var.j(c6b.a);
                if (g6bVar != null) {
                    vt9Var.W(-1604682242);
                    vt9Var.p(false);
                    ldeVar = null;
                } else {
                    vt9Var.W(-1604549624);
                    Object objK = vt9Var.K();
                    if (objK == hh5.a) {
                        objK = new lde();
                        vt9Var.g0(objK);
                    }
                    ldeVar = (lde) objK;
                    vt9Var.p(false);
                }
                c8e c8eVarO = jpo.o(z7e.b, ldeVar, g6bVar, true, (q5i) null, this.b);
                vt9Var.p(false);
                return c8eVarO;
            case 1:
                ih5 ih5Var = (ih5) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                vt9 vt9Var2 = (vt9) ih5Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    f03.a(this.b, (c8e) null, false, (pta) null, (paj) null, ui6.i, vt9Var2, 1572864, 62);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 2:
                ih5 ih5Var2 = (ih5) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                vt9 vt9Var3 = (vt9) ih5Var2;
                if (vt9Var3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    f03.a(this.b, (c8e) null, false, (pta) null, (paj) null, k1g.b, vt9Var3, 1572864, 62);
                } else {
                    vt9Var3.Q();
                }
                return Unit.a;
            default:
                vfd vfdVar = (vfd) obj;
                pfd pfdVar = (pfd) obj2;
                yo5 yo5Var = (yo5) obj3;
                float f = ((gh7) this.b.invoke()).a;
                ifg ifgVarN = pfdVar.N(yo5.a(0, 0, ap5.f(gh7.b(f, Float.NaN) ? 0 : vfdVar.M(f), yo5Var.a), 0, 11, yo5Var.a));
                return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 15));
        }
    }
}
