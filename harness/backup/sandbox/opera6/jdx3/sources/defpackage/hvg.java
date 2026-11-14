package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hvg implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ivg b;
    public final /* synthetic */ amk c;

    public /* synthetic */ hvg(ivg ivgVar, amk amkVar, byte b) {
        this.a = b;
        this.b = ivgVar;
        this.c = amkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        amk amkVar = this.c;
        ivg ivgVar = this.b;
        switch (b) {
            case 0:
                tah tahVar = (tah) ivgVar.c;
                ((dpf) ((xb) tahVar.e).e.g()).a(new jvg(tahVar, amkVar, (byte) 0));
                break;
            default:
                tah tahVar2 = (tah) ivgVar.c;
                ((dpf) ((xb) tahVar2.e).e.g()).a(new jvg(tahVar2, amkVar, (byte) 0));
                break;
        }
    }
}
