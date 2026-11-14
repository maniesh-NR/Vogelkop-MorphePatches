package defpackage;

/* loaded from: classes.dex */
public final class l7d extends lim {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m7d b;

    public /* synthetic */ l7d(m7d m7dVar, byte b) {
        this.a = b;
        this.b = m7dVar;
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        switch (this.a) {
            case 0:
                ndcVar.getLifecycle().b(this);
                this.b.d = null;
                break;
            default:
                super.onDestroy(ndcVar);
                break;
        }
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        switch (this.a) {
            case 1:
                ndcVar.getLifecycle().b(this);
                vml.c(new dnb(this.b, (byte) 19));
                break;
        }
    }
}
