package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class sn implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bp b;

    public /* synthetic */ sn(bp bpVar, byte b) {
        this.a = b;
        this.b = bpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bp bpVar = this.b;
        switch (b) {
            case 0:
                bpVar.V();
                break;
            case 1:
                bpVar.W();
                break;
            case 2:
                bpVar.V();
                break;
            case 3:
                bpVar.W();
                break;
            case 4:
                bpVar.V();
                break;
            case 5:
                bpVar.W();
                break;
            case 6:
                bpVar.V();
                break;
            default:
                bpVar.W();
                break;
        }
    }
}
