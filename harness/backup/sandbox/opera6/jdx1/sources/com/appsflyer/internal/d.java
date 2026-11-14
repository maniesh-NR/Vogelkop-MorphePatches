package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((AFa1tSDK) obj3).d_((Context) obj2, (Intent) obj);
                break;
            case 1:
                AFd1uSDK.getMediationNetwork((AFd1uSDK) obj3, (Throwable) obj2, (String) obj);
                break;
            default:
                ((AFj1sSDK) obj3).getMonetizationNetwork((AFi1aSDK) obj2, (Runnable) obj);
                break;
        }
    }
}
