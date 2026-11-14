package defpackage;

/* loaded from: classes.dex */
public final class pdc {
    public qcc a;
    public idc b;

    public final void a(ndc ndcVar, occ occVar) {
        qcc qccVarD = occVar.d();
        qcc qccVar = this.a;
        if (qccVarD.compareTo(qccVar) < 0) {
            qccVar = qccVarD;
        }
        this.a = qccVar;
        this.b.E(ndcVar, occVar);
        this.a = qccVarD;
    }
}
