package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import defpackage.l4c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFc1jSDK implements AFc1qSDK {

    @NotNull
    private final AFc1hSDK<SharedPreferences> getMediationNetwork;

    @NotNull
    private final l4c getMonetizationNetwork = z4c.b(new AnonymousClass5());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/SharedPreferences;", "l_", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1jSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends ozb implements Function0<SharedPreferences> {
        public AnonymousClass5() {
            super(0);
        }

        @NotNull
        /* renamed from: l_, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) AFc1jSDK.this.getMediationNetwork.getMonetizationNetwork.invoke();
        }
    }

    public AFc1jSDK(@NotNull AFc1hSDK<SharedPreferences> aFc1hSDK) {
        this.getMediationNetwork = aFc1hSDK;
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final int AFAdRevenueData(String str, int i) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getInt(str, i);
        } catch (ClassCastException e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, sko.j("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final String AFAdRevenueData(String str, String str2) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getString(str, str2);
        } catch (ClassCastException e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, sko.j("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final long getCurrencyIso4217Code(String str, long j) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getLong(str, j);
        } catch (ClassCastException e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, sko.j("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getCurrencyIso4217Code(String str, boolean z) {
        j.d((SharedPreferences) this.getMonetizationNetwork.getValue(), str, z);
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(String str, int i) {
        j.b((SharedPreferences) this.getMonetizationNetwork.getValue(), str, i);
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(String str, String str2) {
        j.c((SharedPreferences) this.getMonetizationNetwork.getValue(), str, str2);
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMediationNetwork(String str) {
        return ((SharedPreferences) this.getMonetizationNetwork.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMediationNetwork(String str, boolean z) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getBoolean(str, z);
        } catch (ClassCastException e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, sko.j("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return z;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMonetizationNetwork(String str) {
        j.a((SharedPreferences) this.getMonetizationNetwork.getValue(), str);
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMonetizationNetwork(String str, long j) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putLong(str, j).apply();
    }
}
