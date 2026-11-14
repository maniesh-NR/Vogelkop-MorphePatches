package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AFj1nSDK b;

    public /* synthetic */ p(AFj1nSDK aFj1nSDK, byte b) {
        this.a = b;
        this.b = aFj1nSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        AFj1nSDK aFj1nSDK = this.b;
        switch (b) {
            case 0:
                aFj1nSDK.areAllFieldsValid();
                break;
            case 1:
                aFj1nSDK.component1();
                break;
            default:
                aFj1nSDK.component4();
                break;
        }
    }
}
