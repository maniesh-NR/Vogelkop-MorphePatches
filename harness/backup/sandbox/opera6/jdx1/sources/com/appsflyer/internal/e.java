package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                AFa1tSDK.getRevenue((AFc1dSDK) obj);
                break;
            default:
                ((AFd1mSDK) obj).getMonetizationNetwork();
                break;
        }
    }
}
