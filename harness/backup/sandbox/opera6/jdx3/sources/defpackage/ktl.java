package defpackage;

/* loaded from: classes.dex */
public final class ktl implements as6 {
    public final jtl a;
    public a5n b;

    public ktl(jtl jtlVar) {
        this.a = jtlVar;
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.b = null;
    }
}
