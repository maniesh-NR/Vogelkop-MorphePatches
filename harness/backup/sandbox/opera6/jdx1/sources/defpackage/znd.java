package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class znd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aod b;

    public /* synthetic */ znd(aod aodVar, byte b) {
        this.a = b;
        this.b = aodVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        this.b.b();
    }
}
