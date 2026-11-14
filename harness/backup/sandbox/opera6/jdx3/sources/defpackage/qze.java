package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class qze implements as6 {
    public final /* synthetic */ sze a;

    public qze(sze szeVar) {
        this.a = szeVar;
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        sze szeVar = this.a;
        na2.B(szeVar.a, (CoroutineContext) null, (rx5) null, new pze(szeVar, null, (byte) 0), 3);
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        sze szeVar = this.a;
        na2.B(szeVar.a, (CoroutineContext) null, (rx5) null, new pze(szeVar, null, (byte) 1), 3);
    }
}
