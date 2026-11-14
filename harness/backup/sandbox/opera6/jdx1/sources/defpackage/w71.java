package defpackage;

/* loaded from: classes.dex */
public final class w71 implements as6 {
    public final lcc a;
    public final gb3 b;

    public w71(lcc lccVar, gb3 gb3Var) {
        this.a = lccVar;
        this.b = gb3Var;
    }

    public final void W(ndc ndcVar) {
        this.a.onCreate();
    }

    public final void onDestroy(ndc ndcVar) {
        this.a.onDestroy();
        this.b.invoke();
    }

    public final void onPause(ndc ndcVar) {
        this.a.onPause();
    }

    public final void onResume(ndc ndcVar) {
        this.a.onResume();
    }

    public final void onStart(ndc ndcVar) {
        this.a.onStart();
    }

    public final void onStop(ndc ndcVar) {
        this.a.onStop();
    }
}
