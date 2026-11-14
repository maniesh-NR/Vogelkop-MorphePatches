package defpackage;

/* loaded from: classes.dex */
public final class hki implements idc, AutoCloseable {
    public final String a;
    public final gki b;
    public boolean c;

    public hki(String str, gki gkiVar) {
        this.a = str;
        this.b = gkiVar;
    }

    @Override // defpackage.idc
    public final void E(ndc ndcVar, occ occVar) {
        if (occVar == occ.ON_DESTROY) {
            this.c = false;
            ndcVar.getLifecycle().b(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public final void h(pki pkiVar, tcc tccVar) {
        if (this.c) {
            qp2.n("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        tccVar.a(this);
        pkiVar.c(this.a, (y51) this.b.b.e);
    }
}
