package com.google.android.gms.ads;

import ads_mobile_sdk.cu2;
import ads_mobile_sdk.ru0;
import ads_mobile_sdk.sb0;
import ads_mobile_sdk.vq;
import ads_mobile_sdk.wq;
import defpackage.c50;
import defpackage.cwh;
import defpackage.xgp;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/gms/ads/MobileAds;", "", "Lcom/google/android/gms/ads/RequestConfiguration;", "getRequestConfiguration", "()Lcom/google/android/gms/ads/RequestConfiguration;", "Lcom/google/android/gms/ads/VersionInfo;", "getVersion", "()Lcom/google/android/gms/ads/VersionInfo;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MobileAds {

    @NotNull
    public static final MobileAds INSTANCE = new MobileAds();

    private MobileAds() {
    }

    @NotNull
    public static final RequestConfiguration getRequestConfiguration() {
        xgp.a.getClass();
        cwh cwhVarA = ((cu2) ((sb0) ru0.a()).a1.get()).a();
        cwhVarA.getClass();
        awh awhVar = awh.a;
        bwh bwhVar = bwh.a;
        String str = cwhVarA.a.a;
        ArrayList arrayList = cwhVarA.b;
        String strName = c50.UNSPECIFIED.name();
        AgeRestrictedTreatment ageRestrictedTreatment = AgeRestrictedTreatment.UNSPECIFIED;
        return new RequestConfiguration(-1, -1, str, arrayList, (AgeRestrictedTreatment) Enum.valueOf(AgeRestrictedTreatment.class, strName));
    }

    @NotNull
    public static final VersionInfo getVersion() {
        wq wqVar = vq.a;
        return new VersionInfo(1, 3, 1);
    }
}
