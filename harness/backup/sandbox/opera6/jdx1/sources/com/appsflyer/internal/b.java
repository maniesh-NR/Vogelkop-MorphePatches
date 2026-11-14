package com.appsflyer.internal;

import com.appsflyer.internal.AFd1vSDK;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements AFd1vSDK.AFa1ySDK, AFf1mSDK, OnSuccessListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ b(Object obj) {
        this.a = obj;
    }

    @Override // com.appsflyer.internal.AFd1vSDK.AFa1ySDK
    public final void onConfigurationChanged(boolean z) {
        ((AFa1tSDK) this.a).getMonetizationNetwork(z);
    }

    @Override // com.appsflyer.internal.AFf1mSDK
    public final void onRemoteConfigUpdateFinished(AFf1nSDK aFf1nSDK) {
        ((AFa1tSDK) this.a).getCurrencyIso4217Code(aFf1nSDK);
    }

    public final void onSuccess(Object obj) {
        AFb1cSDK.AFAdRevenueData((AFb1cSDK) this.a, (AppSetIdInfo) obj);
    }
}
