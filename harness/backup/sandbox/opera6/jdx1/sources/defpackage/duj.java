package defpackage;

/* loaded from: classes.dex */
public final class duj extends yak {
    public float c;

    public duj(long j, float f) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.yak
    public final void a(yak yakVar) {
        this.c = ((duj) yakVar).c;
    }

    @Override // defpackage.yak
    public final yak b(long j) {
        return new duj(j, this.c);
    }
}
