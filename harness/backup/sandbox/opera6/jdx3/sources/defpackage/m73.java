package defpackage;

/* loaded from: classes.dex */
public abstract class m73 extends lim implements ysd {
    public boolean a;

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        zsd.b.a.add(this);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        zsd.b.a.remove(this);
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        this.a = false;
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        this.a = true;
    }
}
