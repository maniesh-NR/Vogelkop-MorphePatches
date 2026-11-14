package defpackage;

/* loaded from: classes.dex */
public final class euj extends yak {
    public int c;

    public euj(long j, int i) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.yak
    public final void a(yak yakVar) {
        this.c = ((euj) yakVar).c;
    }

    @Override // defpackage.yak
    public final yak b(long j) {
        return new euj(j, this.c);
    }
}
