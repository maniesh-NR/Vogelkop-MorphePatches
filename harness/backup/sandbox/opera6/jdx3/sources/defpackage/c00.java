package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes.dex */
public final class c00 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public c00(SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains("advertising_id")) {
            this.a = sharedPreferences.getString("advertising_id", null);
            this.b = sharedPreferences.getBoolean("limit_ad_tracking", false);
            this.c = false;
        } else {
            this.a = null;
            this.b = false;
            this.c = true;
        }
    }

    public c00(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = false;
    }

    public static c00 a(AdvertisingIdClient.Info info) {
        if (info == null) {
            return null;
        }
        return new c00(info.getId(), info.isLimitAdTrackingEnabled());
    }
}
