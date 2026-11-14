package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class ddc implements idc, nx5 {
    public final tcc a;
    public final CoroutineContext b;

    public ddc(tcc tccVar, CoroutineContext coroutineContext) {
        this.a = tccVar;
        this.b = coroutineContext;
        if (((qdc) tccVar).i == qcc.a) {
            o0g.q(coroutineContext, null);
        }
    }

    @Override // defpackage.idc
    public final void E(ndc ndcVar, occ occVar) {
        tcc tccVar = this.a;
        if (((qdc) tccVar).i.compareTo(qcc.a) <= 0) {
            tccVar.b(this);
            o0g.q(this.b, null);
        }
    }

    public final CoroutineContext l() {
        return this.b;
    }
}
