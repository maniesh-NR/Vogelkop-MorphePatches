package defpackage;

/* loaded from: classes.dex */
public final class bdc implements mdc {
    public final cdc a;
    public final ndc b;

    public bdc(ndc ndcVar, cdc cdcVar) {
        this.b = ndcVar;
        this.a = cdcVar;
    }

    @ucf(occ.ON_DESTROY)
    public void onDestroy(ndc ndcVar) {
        this.a.m(ndcVar);
    }

    @ucf(occ.ON_START)
    public void onStart(ndc ndcVar) {
        this.a.g(ndcVar);
    }

    @ucf(occ.ON_STOP)
    public void onStop(ndc ndcVar) {
        this.a.h(ndcVar);
    }
}
