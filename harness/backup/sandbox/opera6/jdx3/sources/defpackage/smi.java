package defpackage;

/* loaded from: classes.dex */
public final class smi extends tsd implements w6f {
    public final knl m;
    public final j3i n;

    public smi(knl knlVar, j3i j3iVar) {
        super(((pde) j3iVar.b).g());
        this.m = knlVar;
        this.n = j3iVar;
        knlVar.a(new zu7(this, (byte) 1));
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        knl knlVar = this.m;
        knlVar.getClass();
        knlVar.a((zu7) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.m.H((zu7) obj);
    }

    @Override // defpackage.tsd
    public final void l() {
        super.l();
        this.m.c();
    }

    @Override // defpackage.tsd
    public final void m() {
        super.m();
        this.m.b();
    }
}
