package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/google/android/gms/ads/mediation/MediationNativeListener;", "", "onAdClicked", "", "adapter", "Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;", "onAdClosed", "onAdFailedToLoad", "adError", "Lcom/google/android/gms/ads/AdError;", "error", "", "onAdImpression", "onAdLeftApplication", "onAdLoaded", "unifiedNativeAdMapper", "Lcom/google/android/gms/ads/mediation/UnifiedNativeAdMapper;", "onAdOpened", "onVideoEnd", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@f37
/* loaded from: classes.dex */
public interface MediationNativeListener {
    void onAdClicked(@NotNull MediationNativeAdapter adapter);

    void onAdClosed(@NotNull MediationNativeAdapter adapter);

    @f37
    void onAdFailedToLoad(@NotNull MediationNativeAdapter adapter, int error);

    void onAdFailedToLoad(@NotNull MediationNativeAdapter adapter, @NotNull AdError adError);

    void onAdImpression(@NotNull MediationNativeAdapter adapter);

    void onAdLeftApplication(@NotNull MediationNativeAdapter adapter);

    void onAdLoaded(@NotNull MediationNativeAdapter adapter, @NotNull UnifiedNativeAdMapper unifiedNativeAdMapper);

    void onAdOpened(@NotNull MediationNativeAdapter adapter);

    void onVideoEnd(@NotNull MediationNativeAdapter adapter);
}
