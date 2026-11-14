package defpackage;

/* loaded from: classes.dex */
public final class fuj extends yak {
    public long c;

    public fuj(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.yak
    public final void a(yak yakVar) {
        this.c = ((fuj) yakVar).c;
    }

    @Override // defpackage.yak
    public final yak b(long j) {
        return new fuj(j, this.c);
    }
}
