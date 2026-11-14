package org.chromium.components.variations.firstrun;

import android.util.Base64;
import com.appsflyer.internal.j;
import defpackage.ht5;

/* loaded from: classes.dex */
public final class VariationsSeedBridge {
    public static void clearFirstRunPrefs() {
        ht5.a.edit().remove("variations_seed_base64").remove("variations_seed_signature").remove("variations_seed_country").remove("variations_seed_date_ms").remove("variations_seed_is_gzip_compressed").apply();
    }

    public static String getVariationsFirstRunSeedCountry() {
        return ht5.a.getString("variations_seed_country", "");
    }

    public static byte[] getVariationsFirstRunSeedData() {
        return Base64.decode(ht5.a.getString("variations_seed_base64", ""), 2);
    }

    public static long getVariationsFirstRunSeedDate() {
        return ht5.a.getLong("variations_seed_date_ms", 0L);
    }

    public static boolean getVariationsFirstRunSeedIsGzipCompressed() {
        return ht5.a.getBoolean("variations_seed_is_gzip_compressed", false);
    }

    public static String getVariationsFirstRunSeedSignature() {
        return ht5.a.getString("variations_seed_signature", "");
    }

    public static boolean hasNativePref() {
        return ht5.a.getBoolean("variations_seed_native_stored", false);
    }

    public static void markVariationsSeedAsStored() {
        j.d(ht5.a, "variations_seed_native_stored", true);
    }

    public static void setVariationsFirstRunSeed(byte[] bArr, String str, String str2, long j, boolean z) {
        ht5.a.edit().putString("variations_seed_base64", Base64.encodeToString(bArr, 2)).putString("variations_seed_signature", str).putString("variations_seed_country", str2).putLong("variations_seed_date_ms", j).putBoolean("variations_seed_is_gzip_compressed", z).apply();
    }
}
