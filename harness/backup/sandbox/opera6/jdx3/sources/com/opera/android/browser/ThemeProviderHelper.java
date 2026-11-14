package com.opera.android.browser;

import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import defpackage.g7j;

/* loaded from: classes.dex */
public final class ThemeProviderHelper {
    public static String a(SettingsManager settingsManager) {
        g7j g7jVarG = settingsManager.g();
        return "ofa-".concat(g7jVarG.ordinal() != 0 ? g7jVarG.d : "baseline");
    }

    @NonNull
    public static String getCssThemeClassNoIncognito() {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        return a(((OperaApplication) context.getApplicationContext()).J());
    }
}
