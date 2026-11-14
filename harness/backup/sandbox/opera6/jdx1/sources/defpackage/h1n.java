package defpackage;

/* loaded from: classes.dex */
public final class h1n extends b8e implements lk7 {
    public q2m o;
    public x48 p;
    public vh8 q;
    public ndj r;

    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) {
        o3cVar.a();
        q2m q2mVar = this.o;
        g1n g1nVar = new g1n(this, (byte) 0);
        ndj ndjVar = this.r;
        p2m p2mVarA = q2mVar.a(g1nVar, ndjVar.a() ? new u95(ndjVar.e) : null, null, new g1n(this, (byte) 1));
        ndj ndjVar2 = this.r;
        long j = ((u95) p2mVarA.getValue()).a;
        p12 p12Var = ndjVar2.c;
        if (ndjVar2.b() && ((Boolean) ((t0g) p12Var.g).getValue()).booleanValue()) {
            j = ((u95) ((t0g) p12Var.h).getValue()).a;
        }
        long j2 = j;
        if (ndjVar2.b()) {
            ndjVar2.e = j2;
        }
        if (u95.c(j2) == 0.0f) {
            return;
        }
        a3m a3mVar = this.p.a;
        a3m a3mVar2 = this.q.a;
        mk7.z0(o3cVar, j2, 0L, 0.0f, 126);
    }
}
