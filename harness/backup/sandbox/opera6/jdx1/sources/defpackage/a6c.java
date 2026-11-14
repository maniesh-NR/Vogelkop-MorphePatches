package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class a6c implements y5c {
    public final i37 a;
    public final /* synthetic */ u6c b;
    public final /* synthetic */ boolean c;

    public a6c(u6c u6cVar, boolean z) {
        this.b = u6cVar;
        this.c = z;
        this.a = luj.b(new nda(u6cVar, (byte) 2));
    }

    @Override // defpackage.y5c
    public final int a() {
        u6c u6cVar = this.b;
        return (-u6cVar.j().m) + u6cVar.j().q;
    }

    @Override // defpackage.y5c
    public final float b() {
        u6c u6cVar = this.b;
        int iH = (u6cVar.h() * 500) + u6cVar.i();
        return u6cVar.d() ? iH + 100.0f : iH;
    }

    @Override // defpackage.y5c
    public final c95 c() {
        boolean z = this.c;
        i37 i37Var = this.a;
        return z ? new c95(((Number) i37Var.getValue()).intValue(), 1) : new c95(1, ((Number) i37Var.getValue()).intValue());
    }

    @Override // defpackage.y5c
    public final int d() {
        u6c u6cVar = this.b;
        return (int) (u6cVar.j().p == fsf.a ? u6cVar.j().g() & 4294967295L : u6cVar.j().g() >> 32);
    }

    @Override // defpackage.y5c
    public final float e() {
        u6c u6cVar = this.b;
        return (u6cVar.h() * 500) + u6cVar.i();
    }

    @Override // defpackage.y5c
    public final Object f(int i, oca ocaVar) {
        Object objL = u6c.l(this.b, i, ocaVar);
        return objL == px5.a ? objL : Unit.a;
    }
}
