package defpackage;

/* loaded from: classes.dex */
public final class an extends lim {
    public final h7f a = new h7f();
    public boolean b;

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        this.b = false;
        g7f g7fVar = new g7f(this.a);
        while (g7fVar.hasNext()) {
            ((dr) g7fVar.next()).d(false);
        }
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        this.b = true;
        g7f g7fVar = new g7f(this.a);
        while (g7fVar.hasNext()) {
            ((dr) g7fVar.next()).d(true);
        }
    }
}
