package com.opera.android.browser.passwordmanager;

import androidx.annotation.NonNull;
import com.opera.android.browser.chromium.ChromiumContent;
import defpackage.nm2;

/* loaded from: classes.dex */
public final class AutoSigninSnackbar {
    public static void show(@NonNull ChromiumContent chromiumContent, @NonNull String str) {
        chromiumContent.p.e(new nm2(str, (byte) 0));
    }
}
