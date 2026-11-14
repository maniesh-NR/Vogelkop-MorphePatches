package defpackage;

/* loaded from: classes.dex */
public final class wud implements lcc {
    public final /* synthetic */ rcc a;
    public final /* synthetic */ jx4 b;
    public final /* synthetic */ rcc c;
    public final /* synthetic */ jx4 d;

    public wud(rcc rccVar, jx4 jx4Var, rcc rccVar2, jx4 jx4Var2) {
        this.a = rccVar;
        this.b = jx4Var;
        this.c = rccVar2;
        this.d = jx4Var2;
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
        this.a.g(this.b);
        this.c.g(this.d);
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }
}
