package com.opera.android.browser.autofill;

import androidx.annotation.NonNull;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class AutofillHelper {
    public static void callBooleanCallback(@NonNull Callback callback, boolean z) {
        callback.run(Boolean.valueOf(z));
    }
}
