package com.opera.android.browser;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import defpackage.mdb;

/* loaded from: classes.dex */
public final class ServiceTabLauncher {
    public static void launchTab(int i, boolean z, @NonNull String str, int i2, @NonNull String str2, int i3, @NonNull String str3) {
        Intent intentB = mdb.b(t8.a);
        intentB.setAction("com.opera.android.SERVICE_TAB_LAUNCH");
        intentB.setData(Uri.parse(str));
        if (z) {
            i2 = 8;
        }
        intentB.putExtra("com.opera.android.launchRequestId", i).putExtra("com.opera.android.disposition", i2).putExtra("com.opera.android.referrer", str2).putExtra("com.opera.android.referrerPolicy", i3).putExtra("com.opera.android.extraHeaders", str3);
        t8.a.startActivity(intentB);
    }
}
