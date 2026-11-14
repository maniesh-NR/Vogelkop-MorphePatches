package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH'J\u0015\u0010\n\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "MediationAdT", "MediationAdCallbackT", "", "onFailure", "", "adError", "Lcom/google/android/gms/ads/AdError;", "failure", "", "onSuccess", "ad", "(Ljava/lang/Object;)Ljava/lang/Object;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(@NotNull AdError adError);

    @f37
    void onFailure(@NotNull String failure);

    MediationAdCallbackT onSuccess(MediationAdT ad);
}
