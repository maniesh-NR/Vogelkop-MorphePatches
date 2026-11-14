package defpackage;

/* loaded from: classes.dex */
public final class fdb implements cdb {
    public final wth a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;

    public fdb(wth wthVar, String str, int i, boolean z, int i2) {
        this.a = wthVar;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = i2;
    }

    @Override // defpackage.cdb
    public final void execute() {
        ac8.a(new xxh());
        this.a.K(this.b, this.c, this.d, this.e, false, null);
    }
}
