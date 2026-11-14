package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mim implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim b;

    public /* synthetic */ mim(qim qimVar, byte b) {
        this.a = b;
        this.b = qimVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        this.b.a();
    }
}
