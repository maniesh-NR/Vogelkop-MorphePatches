package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vj8 implements Function2 {
    public final /* synthetic */ yj8 a;
    public final /* synthetic */ c8e b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ cfe d;
    public final /* synthetic */ afe e;
    public final /* synthetic */ voi f;
    public final /* synthetic */ paj g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ ue5 j;

    public vj8(yj8 yj8Var, c8e c8eVar, boolean z, cfe cfeVar, afe afeVar, voi voiVar, paj pajVar, long j, float f, ue5 ue5Var) {
        this.a = yj8Var;
        this.b = c8eVar;
        this.c = z;
        this.d = cfeVar;
        this.e = afeVar;
        this.f = voiVar;
        this.g = pajVar;
        this.h = j;
        this.i = f;
        this.j = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            yj8 yj8Var = this.a;
            k1g.c(yi4.F(this.b, new a9k(this.c, yj8Var.j, yj8Var.k)), this.d, this.e, this.f, this.g, this.h, this.i, this.j, vt9Var, 384);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
