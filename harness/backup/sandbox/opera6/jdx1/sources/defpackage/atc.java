package defpackage;

/* loaded from: classes.dex */
public final class atc extends ode implements tsc {
    public final wsc l;
    public ndc m;
    public q59 n;

    public atc(wsc wscVar) {
        this.l = wscVar;
        wscVar.registerListener(0, this);
    }

    @Override // defpackage.ekc
    public final void l() {
        if (ctc.c(2)) {
            toString();
        }
        this.l.startLoading();
    }

    @Override // defpackage.ekc
    public final void m() {
        if (ctc.c(2)) {
            toString();
        }
        this.l.stopLoading();
    }

    @Override // defpackage.ekc
    public final void p(f7f f7fVar) {
        super.p(f7fVar);
        this.m = null;
        this.n = null;
    }

    public final void s() {
        ndc ndcVar = this.m;
        q59 q59Var = this.n;
        if (ndcVar == null || q59Var == null) {
            return;
        }
        super.p(q59Var);
        j(ndcVar, q59Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        wsc wscVar = this.l;
        sb.append(wscVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(wscVar)));
        sb.append("}}");
        return sb.toString();
    }
}
