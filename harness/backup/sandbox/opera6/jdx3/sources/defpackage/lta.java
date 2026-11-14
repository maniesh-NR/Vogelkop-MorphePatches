package defpackage;

/* loaded from: classes.dex */
public final class lta implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ota b;

    public /* synthetic */ lta(ota otaVar, byte b) {
        this.a = b;
        this.b = otaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ota otaVar = this.b;
        switch (b) {
            case 0:
                otaVar.r.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(lf1.g).start();
                break;
            default:
                otaVar.v.removeView(otaVar);
                break;
        }
    }
}
