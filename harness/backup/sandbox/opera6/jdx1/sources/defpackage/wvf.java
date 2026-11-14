package defpackage;

/* loaded from: classes.dex */
public final class wvf extends b8e implements e3c {
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        int iM = vfdVar.M(this.q) + vfdVar.M(this.o);
        int iM2 = vfdVar.M(this.r) + vfdVar.M(this.p);
        ifg ifgVarN = pfdVar.N(ap5.i(-iM, -iM2, j));
        return vfdVar.b0(ap5.g(ifgVarN.a + iM, j), ap5.f(ifgVarN.b + iM2, j), n08.a, new vvf(this, ifgVarN, (byte) 0));
    }
}
