package com.appsflyer;

import com.appsflyer.internal.AFg1gSDK;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                AFLogger.getMediationNetwork((AFg1gSDK[]) obj);
                break;
            case 1:
                AFLogger.getCurrencyIso4217Code((AFg1gSDK[]) obj);
                break;
            default:
                AFLogger.getMediationNetwork((Function1) obj);
                break;
        }
    }
}
