package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class khl implements cr9 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ uac c;
    public final /* synthetic */ lde d;
    public final /* synthetic */ ue5 e;
    public final /* synthetic */ ue5 f;
    public final /* synthetic */ ue5 g;
    public final /* synthetic */ ue5 h;
    public final /* synthetic */ paj i;
    public final /* synthetic */ sgl j;

    public khl(String str, boolean z, uac uacVar, lde ldeVar, ue5 ue5Var, ue5 ue5Var2, ue5 ue5Var3, ue5 ue5Var4, paj pajVar, sgl sglVar) {
        this.a = str;
        this.b = z;
        this.c = uacVar;
        this.d = ldeVar;
        this.e = ue5Var;
        this.f = ue5Var2;
        this.g = ue5Var3;
        this.h = ue5Var4;
        this.i = pajVar;
        this.j = sglVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function2 function2 = (Function2) obj;
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((vt9) ih5Var).h(function2) ? 4 : 2;
        }
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            ulp.n.x(this.a, function2, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null, null, vt9Var, (iIntValue << 3) & 112);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
