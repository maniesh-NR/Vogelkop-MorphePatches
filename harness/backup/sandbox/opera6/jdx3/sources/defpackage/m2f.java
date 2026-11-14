package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class m2f implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wub b;
    public final /* synthetic */ String c;

    public /* synthetic */ m2f(wub wubVar, String str, byte b) {
        this.a = b;
        this.b = wubVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        wub wubVar = this.b;
        switch (b) {
            case 0:
                ((l2f) wubVar.a).a(1, str);
                break;
            default:
                ((l2f) wubVar.a).b.deleteNotificationChannel(str);
                break;
        }
    }
}
