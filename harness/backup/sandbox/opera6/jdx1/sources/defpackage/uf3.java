package defpackage;

/* loaded from: classes.dex */
public final class uf3 implements twi {
    public final wf3 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public uf3(wf3 wf3Var, long j, long j2, long j3, long j4, long j5) {
        this.a = wf3Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.twi
    public final long getDurationUs() {
        return this.b;
    }

    @Override // defpackage.twi
    public final swi getSeekPoints(long j) {
        vwi vwiVar = new vwi(j, vf3.a(this.a.e(j), 0L, this.c, this.d, this.e, this.f));
        return new swi(vwiVar, vwiVar);
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        return true;
    }
}
