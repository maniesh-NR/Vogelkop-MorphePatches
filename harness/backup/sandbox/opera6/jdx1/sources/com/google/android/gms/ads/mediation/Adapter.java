package com.google.android.gms.ads.mediation;

import ads_mobile_sdk.i2;
import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J$\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0016J$\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00162\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0012H\u0016J$\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00162\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00180\u0012H\u0016J$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u001c2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0012H\u0016J$\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020 2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0012H\u0016J$\u0010#\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020 2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0\u0012H\u0016J$\u0010%\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020&2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u0012H\u0016J$\u0010)\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020&2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u0012H\u0016¨\u0006+"}, d2 = {"Lcom/google/android/gms/ads/mediation/Adapter;", "Lcom/google/android/gms/ads/mediation/MediationExtrasReceiver;", "()V", "getSDKVersionInfo", "Lcom/google/android/gms/ads/VersionInfo;", "getVersionInfo", "initialize", "", "context", "Landroid/content/Context;", "callback", "Lcom/google/android/gms/ads/mediation/InitializationCompleteCallback;", "configurations", "", "Lcom/google/android/gms/ads/mediation/MediationConfiguration;", "loadAppOpenAd", "adConfiguration", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAd;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "loadBannerAd", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "loadInterscrollerAd", "Lcom/google/android/gms/ads/mediation/MediationInterscrollerAd;", "loadInterstitialAd", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAd;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdCallback;", "loadNativeAd", "Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;", "Lcom/google/android/gms/ads/mediation/UnifiedNativeAdMapper;", "Lcom/google/android/gms/ads/mediation/MediationNativeAdCallback;", "loadNativeAdMapper", "Lcom/google/android/gms/ads/mediation/NativeAdMapper;", "loadRewardedAd", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAd;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdCallback;", "loadRewardedInterstitialAd", "Companion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Adapter implements MediationExtrasReceiver {

    @NotNull
    public static final String ERROR_MESSAGE_METHOD_NOT_FOUND = "Method is not found";

    @NotNull
    public abstract VersionInfo getSDKVersionInfo();

    @NotNull
    public abstract VersionInfo getVersionInfo();

    public abstract void initialize(@NotNull Context context, @NotNull InitializationCompleteCallback callback, @NotNull List<MediationConfiguration> configurations);

    public void loadAppOpenAd(@NotNull MediationAppOpenAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> callback) {
        i2[] i2VarArr = i2.b;
        callback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support app open ads."), AdError.GOOGLE_MOBILE_ADS_DOMAIN));
    }

    public void loadBannerAd(@NotNull MediationBannerAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> callback) {
        i2[] i2VarArr = i2.b;
        callback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support banner ads."), AdError.GOOGLE_MOBILE_ADS_DOMAIN));
    }

    public void loadInterscrollerAd(@NotNull MediationBannerAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<MediationInterscrollerAd, MediationBannerAdCallback> callback) {
        i2[] i2VarArr = i2.b;
        callback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support interscroller ads."), AdError.GOOGLE_MOBILE_ADS_DOMAIN));
    }

    public void loadInterstitialAd(@NotNull MediationInterstitialAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> callback) {
        i2[] i2VarArr = i2.b;
        callback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support interstitial ads."), AdError.GOOGLE_MOBILE_ADS_DOMAIN));
    }

    public void loadNativeAd(@NotNull MediationNativeAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> callback) {
        i2[] i2VarArr = i2.b;
        callback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support native ads."), AdError.GOOGLE_MOBILE_ADS_DOMAIN));
    }

    public void loadNativeAdMapper(@NotNull MediationNativeAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> callback) {
        throw new IllegalStateException(ERROR_MESSAGE_METHOD_NOT_FOUND);
    }

    public void loadRewardedAd(@NotNull MediationRewardedAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> callback) {
        i2[] i2VarArr = i2.b;
        callback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support rewarded ads."), AdError.GOOGLE_MOBILE_ADS_DOMAIN));
    }

    public void loadRewardedInterstitialAd(@NotNull MediationRewardedAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> callback) {
        i2[] i2VarArr = i2.b;
        callback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), AdError.GOOGLE_MOBILE_ADS_DOMAIN));
    }
}
