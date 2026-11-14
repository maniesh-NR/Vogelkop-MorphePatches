package com.google.ads.interactivemedia.v3.impl;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.internal.zzur;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AdsRequestImpl$AutoPlayState {
    private static final /* synthetic */ AdsRequestImpl$AutoPlayState[] $VALUES;

    @NonNull
    @zzur(zza = "auto")
    public static final AdsRequestImpl$AutoPlayState AUTO;

    @NonNull
    @zzur(zza = "click")
    public static final AdsRequestImpl$AutoPlayState CLICK;

    @NonNull
    @zzur(zza = "unknown")
    public static final AdsRequestImpl$AutoPlayState UNKNOWN;

    static {
        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState = new AdsRequestImpl$AutoPlayState("AUTO", 0);
        AUTO = adsRequestImpl$AutoPlayState;
        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState2 = new AdsRequestImpl$AutoPlayState("CLICK", 1);
        CLICK = adsRequestImpl$AutoPlayState2;
        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState3 = new AdsRequestImpl$AutoPlayState("UNKNOWN", 2);
        UNKNOWN = adsRequestImpl$AutoPlayState3;
        $VALUES = new AdsRequestImpl$AutoPlayState[]{adsRequestImpl$AutoPlayState, adsRequestImpl$AutoPlayState2, adsRequestImpl$AutoPlayState3};
    }

    @NonNull
    public static AdsRequestImpl$AutoPlayState[] values() {
        return (AdsRequestImpl$AutoPlayState[]) $VALUES.clone();
    }
}
