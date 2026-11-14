package com.opera.android.browser;

import android.content.Context;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import defpackage.c7j;
import defpackage.ozk;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class SystemFontBridge {
    public static boolean isEnabled() {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = ((OperaApplication) context.getApplicationContext()).J();
        settingsManagerJ.getClass();
        if (c7j.values()[settingsManagerJ.n("app_font")] != c7j.FOLLOW_SYSTEM) {
            return ozk.a.contains(Locale.getDefault().getLanguage());
        }
        Set set = ozk.a;
        return true;
    }
}
