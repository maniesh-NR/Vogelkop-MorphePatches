package defpackage;

/* loaded from: classes.dex */
public final class wl8 extends xl8 {
    public boolean d;

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        this.d = false;
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        if (this.d) {
            return;
        }
        b(ndcVar.getLifecycle());
    }
}
