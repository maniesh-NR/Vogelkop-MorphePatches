package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class l7i implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j7i b;

    public /* synthetic */ l7i(j7i j7iVar, byte b) {
        this.a = b;
        this.b = j7iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        t7i t7iVar = this.b;
        byte b2 = 2;
        byte b3 = 1;
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rof.a(gyg.P(1411166956, new l7i(t7iVar, b3), vt9Var), vt9Var, 6);
                } else {
                    vt9Var.Q();
                }
                break;
            case 1:
                vt9 vt9Var2 = (vt9) ih5Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hp7 hp7Var = zam.b;
                    unf unfVar = pof.a;
                    pof.b(vt9Var2);
                    kfo.d(new k7h[]{hp7Var.a((rwj) vt9Var2.j(nlf.a)), zam.a.a(pof.b(vt9Var2).f), bcj.a.a(zjf.a), bcj.b.a(pof.a.j)}, gyg.P(-599222356, new l7i(t7iVar, b2), vt9Var2), vt9Var2, 48);
                } else {
                    vt9Var2.Q();
                }
                break;
            case 2:
                vt9 vt9Var3 = (vt9) ih5Var;
                if (vt9Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    coh.a(t7iVar, null, vt9Var3, 0);
                } else {
                    vt9Var3.Q();
                }
                break;
            default:
                vt9 vt9Var4 = (vt9) ih5Var;
                if (vt9Var4.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z5i.c(t7iVar.i, null, vt9Var4, 3072);
                } else {
                    vt9Var4.Q();
                }
                break;
        }
        return Unit.a;
    }
}
