package defpackage;

/* loaded from: classes.dex */
public final class ckc extends dkc implements idc {
    public final ndc e;
    public final /* synthetic */ ekc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckc(ekc ekcVar, ndc ndcVar, f7f f7fVar) {
        super(ekcVar, f7fVar);
        this.f = ekcVar;
        this.e = ndcVar;
    }

    @Override // defpackage.idc
    public final void E(ndc ndcVar, occ occVar) {
        ndc ndcVar2 = this.e;
        qcc qccVar = ((qdc) ndcVar2.getLifecycle()).i;
        if (qccVar == qcc.a) {
            this.f.p(this.a);
            return;
        }
        qcc qccVar2 = null;
        while (qccVar2 != qccVar) {
            a(d());
            qccVar2 = qccVar;
            qccVar = ((qdc) ndcVar2.getLifecycle()).i;
        }
    }

    @Override // defpackage.dkc
    public final void b() {
        this.e.getLifecycle().b(this);
    }

    @Override // defpackage.dkc
    public final boolean c(ndc ndcVar) {
        return this.e == ndcVar;
    }

    @Override // defpackage.dkc
    public final boolean d() {
        return ((qdc) this.e.getLifecycle()).i.d(qcc.d);
    }
}
