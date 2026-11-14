package com.google.android.gms.ads;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/gms/ads/AgeRestrictedTreatment;", "", "", "a", "I", "getValue", "()I", "value", "UNSPECIFIED", "CHILD", "TEEN", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public enum AgeRestrictedTreatment {
    UNSPECIFIED(0),
    CHILD(1),
    TEEN(2);


    /* renamed from: a, reason: from kotlin metadata */
    private final int value;

    AgeRestrictedTreatment(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
