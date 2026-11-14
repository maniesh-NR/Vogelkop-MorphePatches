package com.opera.android.browser.chromium;

import androidx.annotation.NonNull;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class SavePageHelper {
    public static void callSavePageCallback(@NonNull Callback callback, long j) {
        callback.run(j >= 0 ? Long.valueOf(j) : null);
    }
}
