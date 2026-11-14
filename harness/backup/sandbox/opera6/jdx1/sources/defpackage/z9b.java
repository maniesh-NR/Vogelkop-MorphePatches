package defpackage;

/* loaded from: classes.dex */
public class z9b extends u9b implements e3c {
    public g2o q;

    public z9b(g2o g2oVar) {
        this.q = g2oVar;
    }

    @Override // defpackage.u9b
    public final g2o T0(g2o g2oVar) {
        return new tlm(g2oVar, this.q);
    }

    @Override // defpackage.u9b
    public final void U0() {
        super.U0();
        nb6.F(this);
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        int iD = this.p.d(vfdVar, vfdVar.getLayoutDirection()) - this.o.d(vfdVar, vfdVar.getLayoutDirection());
        int iA = this.p.a(vfdVar) - this.o.a(vfdVar);
        int iB = (this.p.b(vfdVar, vfdVar.getLayoutDirection()) - this.o.b(vfdVar, vfdVar.getLayoutDirection())) + iD;
        int iC = (this.p.c(vfdVar) - this.o.c(vfdVar)) + iA;
        ifg ifgVarN = pfdVar.N(ap5.i(-iB, -iC, j));
        return vfdVar.b0(ap5.g(ifgVarN.a + iB, j), ap5.f(ifgVarN.b + iC, j), n08.a, new y9b(ifgVarN, iD, iA, (byte) 0));
    }
}
