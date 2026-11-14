package defpackage;

/* loaded from: classes.dex */
public final class sak extends yak {
    public j6 c;
    public int d;
    public int e;

    public sak(long j, j6 j6Var) {
        super(j);
        this.c = j6Var;
    }

    @Override // defpackage.yak
    public final void a(yak yakVar) {
        synchronized (k1g.f) {
            this.c = ((sak) yakVar).c;
            this.d = ((sak) yakVar).d;
            this.e = ((sak) yakVar).e;
        }
    }

    @Override // defpackage.yak
    public final yak b(long j) {
        return new sak(j, this.c);
    }
}
