package defpackage;

/* loaded from: classes.dex */
public final class jom implements as6 {
    public final zoo a;

    public jom(zoo zooVar) {
        this.a = zooVar;
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        h9o h9oVar = (h9o) this.a.a;
        if (h9oVar != null) {
            h9oVar.c(true);
        }
    }

    @Override // defpackage.as6
    public final void onStop(ndc ndcVar) {
        h9o h9oVar = (h9o) this.a.a;
        if (h9oVar != null) {
            h9oVar.c(false);
        }
    }
}
