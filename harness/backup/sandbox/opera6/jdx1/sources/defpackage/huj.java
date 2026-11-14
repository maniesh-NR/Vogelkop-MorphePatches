package defpackage;

/* loaded from: classes.dex */
public final class huj extends yak {
    public Object c;

    public huj(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.yak
    public final void a(yak yakVar) {
        this.c = ((huj) yakVar).c;
    }

    @Override // defpackage.yak
    public final yak b(long j) {
        return new huj(j, this.c);
    }
}
