package com.opera.android.browser.background_sync;

import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: classes.dex */
public final class GooglePlayServicesChecker {
    public static boolean shouldDisableBackgroundSync() {
        boolean z = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(t8.a) == 0;
        ioh.t("BackgroundSync.LaunchTask.PlayServicesAvailable", z);
        return !z;
    }
}
