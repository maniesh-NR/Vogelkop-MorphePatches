package com.google.ads.interactivemedia.v3.impl;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.internal.zzur;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AdsRequestImpl$MutePlayState {
    private static final /* synthetic */ AdsRequestImpl$MutePlayState[] $VALUES;

    @NonNull
    @zzur(zza = "muted")
    public static final AdsRequestImpl$MutePlayState MUTED;

    @NonNull
    @zzur(zza = "unknown")
    public static final AdsRequestImpl$MutePlayState UNKNOWN;

    @NonNull
    @zzur(zza = "unmuted")
    public static final AdsRequestImpl$MutePlayState UNMUTED;

    static {
        AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState = new AdsRequestImpl$MutePlayState("MUTED", 0);
        MUTED = adsRequestImpl$MutePlayState;
        AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState2 = new AdsRequestImpl$MutePlayState("UNKNOWN", 1);
        UNKNOWN = adsRequestImpl$MutePlayState2;
        AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState3 = new AdsRequestImpl$MutePlayState("UNMUTED", 2);
        UNMUTED = adsRequestImpl$MutePlayState3;
        $VALUES = new AdsRequestImpl$MutePlayState[]{adsRequestImpl$MutePlayState, adsRequestImpl$MutePlayState2, adsRequestImpl$MutePlayState3};
    }

    @NonNull
    public static AdsRequestImpl$MutePlayState[] values() {
        return (AdsRequestImpl$MutePlayState[]) $VALUES.clone();
    }
}
