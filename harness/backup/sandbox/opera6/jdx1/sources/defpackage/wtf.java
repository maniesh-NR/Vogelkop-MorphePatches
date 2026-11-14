package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wtf implements cr9 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ uac d;
    public final /* synthetic */ lde e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ue5 g;
    public final /* synthetic */ ue5 h;
    public final /* synthetic */ ue5 i;
    public final /* synthetic */ ue5 j;
    public final /* synthetic */ ue5 k;
    public final /* synthetic */ ue5 l;
    public final /* synthetic */ ue5 m;
    public final /* synthetic */ sgl n;
    public final /* synthetic */ paj o;

    public wtf(String str, boolean z, boolean z2, uac uacVar, lde ldeVar, boolean z3, ue5 ue5Var, ue5 ue5Var2, ue5 ue5Var3, ue5 ue5Var4, ue5 ue5Var5, ue5 ue5Var6, ue5 ue5Var7, sgl sglVar, paj pajVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = uacVar;
        this.e = ldeVar;
        this.f = z3;
        this.g = ue5Var;
        this.h = ue5Var2;
        this.i = ue5Var3;
        this.j = ue5Var4;
        this.k = ue5Var5;
        this.l = ue5Var6;
        this.m = ue5Var7;
        this.n = sglVar;
        this.o = pajVar;
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
            rbe rbeVar = rbe.v;
            paj pajVar = this.o;
            boolean z = this.b;
            boolean z2 = this.f;
            lde ldeVar = this.e;
            sgl sglVar = this.n;
            rbeVar.c(this.a, function2, z, this.c, this.d, ldeVar, z2, this.g, this.h, this.i, this.j, this.k, this.l, this.m, sglVar, null, gyg.P(-656940872, new vtf(z, z2, ldeVar, sglVar, pajVar), vt9Var), vt9Var, (iIntValue << 3) & 112);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
