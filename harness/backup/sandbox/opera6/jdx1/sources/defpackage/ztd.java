package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ztd implements Function2 {
    public final /* synthetic */ otd a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ue5 c;

    public ztd(otd otdVar, boolean z, ue5 ue5Var) {
        this.a = otdVar;
        this.b = z;
        this.c = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        byte b = 1;
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            vt9Var.W(-864293207);
            vt9Var.p(false);
            hp7 hp7Var = aq5.a;
            boolean z = this.b;
            otd otdVar = this.a;
            kfo.c(hp7Var.a(new u95(z ? otdVar.a : otdVar.d)), gyg.P(-893579015, new jk4(this.c, b), vt9Var), vt9Var, 56);
            vt9Var.W(-863072055);
            vt9Var.p(false);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
