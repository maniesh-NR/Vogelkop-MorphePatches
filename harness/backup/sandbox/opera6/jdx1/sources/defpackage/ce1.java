package defpackage;

/* loaded from: classes.dex */
public final class ce1 extends vhb {
    public q2m p;
    public afe q;
    public de1 r;
    public ifg s;
    public ifg t;
    public long u;
    public long v;
    public final ae1 w;
    public final ae1 x;
    public long y;

    public ce1(q2m q2mVar, afe afeVar, de1 de1Var) {
        super((byte) 1);
        this.p = q2mVar;
        this.q = afeVar;
        this.r = de1Var;
        this.u = 0L;
        this.v = 0L;
        this.w = new ae1(this, (byte) 1);
        this.x = new ae1(this, (byte) 0);
        this.y = -9223372034707292160L;
    }

    @Override // defpackage.b8e
    public final void N0() {
        this.y = -9223372034707292160L;
    }

    @Override // defpackage.vhb, defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        long j2;
        ifg ifgVarN = pfdVar.N(j);
        if (vfdVar.F()) {
            j2 = (ifgVarN.a << 32) | (ifgVarN.b & 4294967295L);
        } else {
            q2m q2mVar = this.p;
            int i = ifgVarN.a;
            if (q2mVar == null) {
                j2 = (i << 32) | (ifgVarN.b & 4294967295L);
                this.y = j2;
            } else {
                long j3 = (i << 32) | (ifgVarN.b & 4294967295L);
                p2m p2mVarA = q2mVar.a(new ae1(this, j3), null, null, new be1(this, j3, (byte) 0));
                j2 = ((gcb) p2mVarA.getValue()).a;
                this.y = ((gcb) p2mVarA.getValue()).a;
            }
        }
        if (vfdVar.F()) {
            this.s = ifgVarN;
            this.u = j2;
            return vfdVar.b0((int) (j2 >> 32), (int) (j2 & 4294967295L), n08.a, this.w);
        }
        this.t = ifgVarN;
        this.v = j2;
        return vfdVar.b0((int) (j2 >> 32), (int) (j2 & 4294967295L), n08.a, this.x);
    }
}
