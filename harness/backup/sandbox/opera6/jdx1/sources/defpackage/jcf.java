package defpackage;

/* loaded from: classes.dex */
public final class jcf implements idc, AutoCloseable {
    public final /* synthetic */ fcf a;
    public final /* synthetic */ tcc b;

    public jcf(fcf fcfVar, kcf kcfVar, tcc tccVar) {
        this.a = fcfVar;
        this.b = tccVar;
    }

    @Override // defpackage.idc
    public final void E(ndc ndcVar, occ occVar) {
        occ occVar2 = occ.ON_START;
        fcf fcfVar = this.a;
        if (occVar == occVar2) {
            fcfVar.g(true);
        } else if (occVar == occ.ON_STOP) {
            fcfVar.g(false);
        }
        if (occVar == occ.ON_DESTROY) {
            fcfVar.e();
            this.b.b(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.b(this);
    }
}
