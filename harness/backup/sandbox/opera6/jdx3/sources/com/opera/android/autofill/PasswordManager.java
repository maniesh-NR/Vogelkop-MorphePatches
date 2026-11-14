package com.opera.android.autofill;

import J.N;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.api.Callback;
import defpackage.a4g;
import defpackage.r4g;
import defpackage.w3g;
import java.util.ArrayList;
import java.util.List;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class PasswordManager {
    public static void a(Callback callback) {
        N.MJ5jx84_(callback, new ArrayList());
    }

    public static void addAndroidToList(@NonNull List<w3g> list, @NonNull GURL gurl, @NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable GURL gurl2) {
        list.add(new w3g(list.size(), gurl, str3, gurl.c(), gurl2, str, str2, str2.length() == 0 ? false : "android".equals(Uri.parse(str2).normalizeScheme().getScheme()), str2.length() != 0 ? "opera-user".equals(Uri.parse(str2).normalizeScheme().getScheme()) : false));
    }

    public static void addToList(@NonNull List<w3g> list, @NonNull GURL gurl, @NonNull String str, @NonNull String str2) {
        list.add(new w3g(list.size(), gurl, str, str2));
    }

    public static void callAddOrUpdateResultForError(@NonNull Callback callback) {
        callback.run(null);
    }

    public static void callAddOrUpdateResultForSuccess(@NonNull Callback callback, @NonNull GURL gurl, @NonNull String str, @NonNull String str2, boolean z) {
        callback.run(new r4g(new w3g(-1, gurl, str, str2), z));
    }

    public static void callBooleanCallback(@NonNull Callback callback, boolean z) {
        callback.run(Boolean.valueOf(z));
    }

    public static void callCallback(@NonNull Callback callback, long j, @NonNull List<w3g> list) {
        callback.run(new a4g(j, list));
    }
}
