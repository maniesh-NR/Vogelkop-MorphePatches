package defpackage;

/* loaded from: classes.dex */
public final class quj extends yak {
    public tag c;
    public int d;

    public quj(long j, tag tagVar) {
        super(j);
        this.c = tagVar;
    }

    @Override // defpackage.yak
    public final void a(yak yakVar) {
        quj qujVar = (quj) yakVar;
        synchronized (gyg.g) {
            this.c = qujVar.c;
            this.d = qujVar.d;
        }
    }

    @Override // defpackage.yak
    public final yak b(long j) {
        return new quj(j, this.c);
    }
}
