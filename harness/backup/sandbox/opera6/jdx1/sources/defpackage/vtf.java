package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vtf implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ lde c;
    public final /* synthetic */ sgl d;
    public final /* synthetic */ paj e;

    public vtf(boolean z, boolean z2, lde ldeVar, sgl sglVar, paj pajVar) {
        this.a = z;
        this.b = z2;
        this.c = ldeVar;
        this.d = sglVar;
        this.e = pajVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            rbe.v.b(this.a, this.b, this.c, null, this.d, this.e, 0.0f, 0.0f, vt9Var, 100663296, 200);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
