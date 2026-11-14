package defpackage;

/* loaded from: classes.dex */
public final class wap implements zcf {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Runnable b;

    public wap(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // defpackage.zcf
    public final void a(cm cmVar) {
        this.b.run();
    }

    @Override // defpackage.zcf
    public final void onSuccess() {
        this.a.run();
    }
}
