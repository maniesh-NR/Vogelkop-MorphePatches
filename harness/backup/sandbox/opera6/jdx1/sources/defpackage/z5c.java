package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class z5c implements y5c {
    public final /* synthetic */ gu6 a;
    public final /* synthetic */ boolean b;

    public z5c(gu6 gu6Var, boolean z) {
        this.a = gu6Var;
        this.b = z;
    }

    @Override // defpackage.y5c
    public final int a() {
        gu6 gu6Var = this.a;
        return (-gu6Var.m().f) + gu6Var.m().d;
    }

    @Override // defpackage.y5c
    public final float b() {
        gu6 gu6Var = this.a;
        return uxf.a(gu6Var.m(), gu6Var.n());
    }

    @Override // defpackage.y5c
    public final c95 c() {
        boolean z = this.b;
        gu6 gu6Var = this.a;
        return z ? new c95(gu6Var.n(), 1) : new c95(1, gu6Var.n());
    }

    @Override // defpackage.y5c
    public final int d() {
        gu6 gu6Var = this.a;
        return (int) (gu6Var.m().e == fsf.a ? gu6Var.m().g() & 4294967295L : gu6Var.m().g() >> 32);
    }

    @Override // defpackage.y5c
    public final float e() {
        return mkh.p(this.a);
    }

    @Override // defpackage.y5c
    public final Object f(int i, oca ocaVar) {
        gu6 gu6Var = this.a;
        Object objB = gu6Var.b(gfe.a, new oca(gu6Var, i, null, (byte) 2), ocaVar);
        px5 px5Var = px5.a;
        if (objB != px5Var) {
            objB = Unit.a;
        }
        return objB == px5Var ? objB : Unit.a;
    }
}
