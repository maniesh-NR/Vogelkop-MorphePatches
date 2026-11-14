package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AFj1sSDK b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ q(AFj1sSDK aFj1sSDK, Runnable runnable, byte b) {
        this.a = b;
        this.b = aFj1sSDK;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        AFj1sSDK aFj1sSDK = this.b;
        switch (b) {
            case 0:
                aFj1sSDK.getCurrencyIso4217Code(runnable);
                break;
            case 1:
                aFj1sSDK.getRevenue(runnable);
                break;
            case 2:
                aFj1sSDK.component2(runnable);
                break;
            default:
                aFj1sSDK.getMonetizationNetwork(runnable);
                break;
        }
    }
}
