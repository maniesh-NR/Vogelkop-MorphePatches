package defpackage;

/* loaded from: classes.dex */
public final class awf extends b8e implements e3c {
    public xvf o;

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        float fB = this.o.b(vfdVar.getLayoutDirection());
        float fD = this.o.d();
        float fC = this.o.c(vfdVar.getLayoutDirection());
        float fA = this.o.a();
        if (!((gh7.a(fB, 0.0f) >= 0) & (gh7.a(fD, 0.0f) >= 0) & (gh7.a(fC, 0.0f) >= 0) & (gh7.a(fA, 0.0f) >= 0))) {
            y7b.a("Padding must be non-negative");
        }
        int iM = vfdVar.M(fB);
        int iM2 = vfdVar.M(fC) + iM;
        int iM3 = vfdVar.M(fD);
        int iM4 = vfdVar.M(fA) + iM3;
        ifg ifgVarN = pfdVar.N(ap5.i(-iM2, -iM4, j));
        return vfdVar.b0(ap5.g(ifgVarN.a + iM2, j), ap5.f(ifgVarN.b + iM4, j), n08.a, new y9b(ifgVarN, iM, iM3, (byte) 2));
    }
}
