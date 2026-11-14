package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AFd1uSDK b;

    public /* synthetic */ l(AFd1uSDK aFd1uSDK, byte b) {
        this.a = b;
        this.b = aFd1uSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        AFd1uSDK aFd1uSDK = this.b;
        switch (b) {
            case 0:
                AFd1uSDK.AFAdRevenueData(aFd1uSDK);
                break;
            case 1:
                AFd1uSDK.getMediationNetwork(aFd1uSDK);
                break;
            default:
                AFd1uSDK.getMonetizationNetwork(aFd1uSDK);
                break;
        }
    }
}
