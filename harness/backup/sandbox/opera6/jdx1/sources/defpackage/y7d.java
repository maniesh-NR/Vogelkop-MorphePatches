package defpackage;

/* loaded from: classes.dex */
public final class y7d implements fog {
    public final wth a;
    public gcb b;
    public d2c c;
    public gcb d;
    public ybb e;

    public y7d(wth wthVar) {
        this.a = wthVar;
    }

    @Override // defpackage.fog
    public final long b(ccb ccbVar, long j, d2c d2cVar, long j2) {
        ybb ybbVar = this.e;
        if (ybbVar != null) {
            gcb gcbVar = this.b;
            if ((gcbVar == null ? false : gcb.a(gcbVar.a, j)) && this.c == d2cVar) {
                gcb gcbVar2 = this.d;
                if (gcbVar2 != null ? gcb.a(gcbVar2.a, j2) : false) {
                    return ybbVar.a;
                }
            }
        }
        long jB = this.a.b(ccbVar, j, d2cVar, j2);
        this.b = new gcb(j);
        this.c = d2cVar;
        this.d = new gcb(j2);
        this.e = new ybb(jB);
        return jB;
    }
}
