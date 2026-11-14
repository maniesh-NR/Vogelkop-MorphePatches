package com.opera.android.browser.chromium;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.browser.NavigationEntry;
import com.opera.android.browser.NavigationHistory;
import defpackage.gke;
import java.util.Map;

/* loaded from: classes.dex */
public final class NavigationHistoryBridge {
    public static void addToIdMap(@NonNull Map<Integer, Integer> map, @NonNull NavigationEntry navigationEntry, int i) {
        map.put(Integer.valueOf(navigationEntry.getId()), Integer.valueOf(i));
    }

    @NonNull
    public static NavigationEntry createNavigationEntry(int i, @NonNull String str, @NonNull String str2, @NonNull String str3, boolean z, @NonNull byte[] bArr, @Nullable byte[] bArr2) {
        return new gke(i, str, str2, str3, z, bArr, bArr2, (byte) 0);
    }

    public static int getCurrentEntryIndex(@NonNull NavigationHistory navigationHistory) {
        return navigationHistory.j();
    }

    @NonNull
    public static NavigationEntry getEntryAtIndex(@NonNull NavigationHistory navigationHistory, int i) {
        return navigationHistory.i(i);
    }

    public static int getEntryCount(@NonNull NavigationHistory navigationHistory) {
        return navigationHistory.d();
    }

    public static boolean getIsOverridingUserAgent(@NonNull NavigationEntry navigationEntry) {
        return navigationEntry.a();
    }

    @Nullable
    public static byte[] getPageState(@NonNull NavigationEntry navigationEntry) {
        return navigationEntry.c();
    }

    @NonNull
    public static String getTitle(@NonNull NavigationEntry navigationEntry) {
        return navigationEntry.getTitle();
    }

    @NonNull
    public static String getUrl(@NonNull NavigationEntry navigationEntry) {
        return navigationEntry.getUrl();
    }

    @Nullable
    public static byte[] getUserData(@NonNull NavigationEntry navigationEntry) {
        return navigationEntry.e();
    }

    @NonNull
    public static String getVirtualUrl(@NonNull NavigationEntry navigationEntry) {
        return navigationEntry.d();
    }
}
