package com.opera.android.browser;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes.dex */
public final class AutosubmitExtension {
    public static final HashMap a = new HashMap();
    public static final Random b = new Random();

    public static boolean isValid(@NonNull String str) {
        HashMap map = a;
        Long l = (Long) map.get(str);
        if (l == null) {
            return false;
        }
        if (SystemClock.uptimeMillis() < l.longValue()) {
            return true;
        }
        map.remove(str);
        return false;
    }

    public static void reportError(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).L().c.R(28, str);
    }
}
