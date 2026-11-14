package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vsj implements Function2 {
    public final /* synthetic */ ue5 a;
    public final /* synthetic */ ue5 b;
    public final /* synthetic */ ue5 c;
    public final /* synthetic */ ikl d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public vsj(ue5 ue5Var, ue5 ue5Var2, ue5 ue5Var3, ikl iklVar, long j, long j2) {
        this.a = ue5Var;
        this.b = ue5Var2;
        this.c = ue5Var3;
        this.d = iklVar;
        this.e = j;
        this.f = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            vt9Var.W(-168976609);
            ioh.a(this.b, this.a, this.c, this.d, this.e, this.f, vt9Var, 0);
            vt9Var.p(false);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
