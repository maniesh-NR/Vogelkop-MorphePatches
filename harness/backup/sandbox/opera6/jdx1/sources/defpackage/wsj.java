package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wsj implements Function2 {
    public final /* synthetic */ ue5 a;
    public final /* synthetic */ ue5 b;
    public final /* synthetic */ ue5 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public wsj(ue5 ue5Var, ue5 ue5Var2, ue5 ue5Var3, long j, long j2) {
        this.a = ue5Var;
        this.b = ue5Var2;
        this.c = ue5Var3;
        this.d = j;
        this.e = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            kfo.c(ijl.a.a(abm.a(dtj.h, vt9Var)), gyg.P(969655473, new vsj(this.a, this.b, this.c, abm.a(dtj.b, vt9Var), this.d, this.e), vt9Var), vt9Var, 56);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
