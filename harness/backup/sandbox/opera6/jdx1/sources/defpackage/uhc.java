package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class uhc implements Function2 {
    public final /* synthetic */ ue5 a;
    public final /* synthetic */ ue5 b;
    public final /* synthetic */ ue5 c;
    public final /* synthetic */ ue5 d;
    public final /* synthetic */ ue5 e;

    public uhc(ue5 ue5Var, ue5 ue5Var2, ue5 ue5Var3, ue5 ue5Var4, ue5 ue5Var5) {
        this.a = ue5Var;
        this.b = ue5Var2;
        this.c = ue5Var3;
        this.d = ue5Var4;
        this.e = ue5Var5;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            ic4.e(this.a, this.b, this.c, this.d, this.e, vt9Var, 384);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
