package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ar implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dr b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ar(dr drVar, boolean z, byte b) {
        this.a = b;
        this.b = drVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        dr drVar = this.b;
        switch (b) {
            case 0:
                drVar.f = z;
                break;
            default:
                drVar.e = z;
                break;
        }
    }
}
