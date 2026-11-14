package defpackage;

/* loaded from: classes.dex */
public final class bge implements ivj {
    public long a;
    public final /* synthetic */ fge b;

    public bge(fge fgeVar) {
        this.b = fgeVar;
    }

    @Override // defpackage.ivj
    public final void a() {
        fge fgeVar = this.b;
        if (fgeVar.A == null || System.currentTimeMillis() - this.a < 500) {
            return;
        }
        fgeVar.A.requestFocus();
    }

    @Override // defpackage.ivj
    public final void b() {
        this.b.F.requestFocus();
    }
}
