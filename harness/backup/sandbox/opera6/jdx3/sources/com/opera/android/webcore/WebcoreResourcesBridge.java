package com.opera.android.webcore;

import androidx.annotation.NonNull;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class WebcoreResourcesBridge {
    public static void notifyVersion(@NonNull Callback callback, @NonNull String str) {
        callback.run(str);
    }
}
