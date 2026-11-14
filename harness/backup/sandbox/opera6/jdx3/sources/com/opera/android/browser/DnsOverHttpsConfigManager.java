package com.opera.android.browser;

import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import defpackage.wc7;

/* loaded from: classes.dex */
public final class DnsOverHttpsConfigManager {
    public static int getSecureDnsMode() {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        return ((wc7) ((OperaApplication) context.getApplicationContext()).r.B.get()).a();
    }

    @NonNull
    public static String getServerTemplate() {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        return ((wc7) ((OperaApplication) context.getApplicationContext()).r.B.get()).b();
    }

    public static void onProbeResult(@NonNull Callback callback, boolean z) {
        callback.run(Boolean.valueOf(z));
    }
}
