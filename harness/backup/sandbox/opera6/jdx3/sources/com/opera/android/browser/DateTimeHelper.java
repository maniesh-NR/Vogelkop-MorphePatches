package com.opera.android.browser;

import android.content.ActivityNotFoundException;
import android.content.Intent;

/* loaded from: classes.dex */
public final class DateTimeHelper {
    public static void openDateAndTimeSettings() {
        Intent intent = new Intent("android.settings.DATE_SETTINGS");
        try {
            intent.addFlags(268435456);
            t8.a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
