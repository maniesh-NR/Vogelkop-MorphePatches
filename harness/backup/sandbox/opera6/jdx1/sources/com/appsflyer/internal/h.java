package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                AFb1lSDK.getCurrencyIso4217Code((AFb1lSDK) obj2, (AFh1qSDK) obj);
                break;
            case 1:
                ((AFj1pSDK) obj2).G_((SensorEvent) obj);
                break;
            case 2:
                AFj1uSDK.getMonetizationNetwork((AFj1uSDK) obj2, (Context) obj);
                break;
            case 3:
                ((AFj1vSDK) obj2).getCurrencyIso4217Code((Context) obj);
                break;
            default:
                AFj1zSDK.getMonetizationNetwork((AFj1zSDK) obj2, (Context) obj);
                break;
        }
    }
}
