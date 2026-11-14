package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class cy4 implements Function2 {
    public final /* synthetic */ gyi a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ue5 d;
    public final /* synthetic */ ikl e;
    public final /* synthetic */ ue5 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ zvf h;

    public cy4(gyi gyiVar, boolean z, boolean z2, ue5 ue5Var, ikl iklVar, ue5 ue5Var2, float f, zvf zvfVar) {
        this.a = gyiVar;
        this.b = z;
        this.c = z2;
        this.d = ue5Var;
        this.e = iklVar;
        this.f = ue5Var2;
        this.g = f;
        this.h = zvfVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            gyi gyiVar = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            ey4.a(this.d, this.e, !z ? gyiVar.f : !z2 ? gyiVar.b : gyiVar.k, this.f, !z ? gyiVar.g : !z2 ? gyiVar.c : gyiVar.l, !z ? gyiVar.h : !z2 ? gyiVar.d : gyiVar.m, this.g, this.h, vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
