package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;", "Lcom/google/android/gms/ads/mediation/MediationAdapter;", "getBannerView", "Landroid/view/View;", "requestBannerAd", "", "context", "Landroid/content/Context;", "listener", "Lcom/google/android/gms/ads/mediation/MediationBannerListener;", "serverParameters", "Landroid/os/Bundle;", "adSize", "Lcom/google/android/gms/ads/AdSize;", "mediationAdRequest", "Lcom/google/android/gms/ads/mediation/MediationAdRequest;", "mediationExtras", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@f37
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends MediationAdapter {
    View getBannerView();

    void requestBannerAd(@NotNull Context context, @NotNull MediationBannerListener listener, @NotNull Bundle serverParameters, @NotNull AdSize adSize, @NotNull MediationAdRequest mediationAdRequest, Bundle mediationExtras);
}
