package defpackage;

/* loaded from: classes.dex */
public final class nql implements i1i {
    public final long b;
    public final i1i c;

    public nql(long j, i1i i1iVar) {
        jpo.i("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = i1iVar;
    }

    @Override // defpackage.i1i
    public final long a() {
        return this.b;
    }

    @Override // defpackage.i1i
    public final h1i b(df4 df4Var) {
        h1i h1iVarB = this.c.b(df4Var);
        long j = this.b;
        return (j <= 0 || df4Var.b < j - ((long) h1iVarB.a)) ? h1iVarB : h1i.d;
    }
}
