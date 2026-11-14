package defpackage;

/* loaded from: classes.dex */
public final class gch extends lim implements lch {
    public hch a;

    @Override // defpackage.lch
    public final void m(boolean z) {
        hch hchVar = this.a;
        if (hchVar != null) {
            hchVar.getLifecycle().b(this);
            this.a.f0();
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.a = null;
    }
}
