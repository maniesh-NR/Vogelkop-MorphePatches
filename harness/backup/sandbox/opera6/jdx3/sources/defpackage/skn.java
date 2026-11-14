package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class skn implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ukn b;

    public /* synthetic */ skn(ukn uknVar, byte b) {
        this.a = b;
        this.b = uknVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ukn uknVar = this.b;
        switch (b) {
            case 0:
                uknVar.G0();
                break;
            default:
                uknVar.y.n(false, false);
                break;
        }
    }
}
