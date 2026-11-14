package com.google.android.gms.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB+\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001a\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001cJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/google/android/gms/ads/AdError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "I", "getCode", "()I", "code", "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "c", "getDomain", "domain", "d", "Lcom/google/android/gms/ads/AdError;", "getCause", "()Lcom/google/android/gms/ads/AdError;", "cause", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V", "(ILjava/lang/String;Ljava/lang/String;)V", "Companion", "ads_mobile_sdk/i2", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AdError {

    @NotNull
    public static final String GOOGLE_MOBILE_ADS_DOMAIN = "com.google.android.libraries.ads.mobile.sdk";

    @NotNull
    public static final String UNDEFINED_DOMAIN = "undefined";

    /* renamed from: a, reason: from kotlin metadata */
    private final int code;

    /* renamed from: b, reason: from kotlin metadata */
    private final String message;

    /* renamed from: c, reason: from kotlin metadata */
    private final String domain;

    /* renamed from: d, reason: from kotlin metadata */
    private final AdError cause;

    public AdError(int i, @NotNull String str, @NotNull String str2) {
        this(i, str, str2, null);
    }

    public AdError(int i, @NotNull String str, @NotNull String str2, AdError adError) {
        this.code = i;
        this.message = str;
        this.domain = str2;
        this.cause = adError;
    }

    public boolean equals(Object other) {
        if (!(other instanceof AdError)) {
            return false;
        }
        AdError adError = (AdError) other;
        return this.code == adError.code && Intrinsics.a(this.message, adError.message) && Intrinsics.a(this.domain, adError.domain) && Intrinsics.a(this.cause, adError.cause);
    }

    public final AdError getCause() {
        return this.cause;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }
}
