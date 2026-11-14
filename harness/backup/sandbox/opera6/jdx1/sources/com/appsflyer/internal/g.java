package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AFb1lSDK b;

    public /* synthetic */ g(AFb1lSDK aFb1lSDK, byte b) {
        this.a = b;
        this.b = aFb1lSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        AFb1lSDK aFb1lSDK = this.b;
        switch (b) {
            case 0:
                AFb1lSDK.getRevenue(aFb1lSDK);
                break;
            default:
                AFb1lSDK.AFAdRevenueData(aFb1lSDK);
                break;
        }
    }
}
