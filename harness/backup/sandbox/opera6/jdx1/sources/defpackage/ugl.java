package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ugl implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ lde b;
    public final /* synthetic */ sgl c;
    public final /* synthetic */ paj d;

    public ugl(boolean z, lde ldeVar, sgl sglVar, paj pajVar) {
        this.a = z;
        this.b = ldeVar;
        this.c = sglVar;
        this.d = pajVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            ulp.n.w(this.a, this.b, this.c, this.d, vt9Var, 114822144);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
