package com.opera.android.browser;

import android.content.Context;
import com.opera.android.OperaApplication;
import defpackage.x41;

/* loaded from: classes.dex */
public final class IntentSignalsFromNative {
    public static void reportInNormalMode(long j) {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        if (!operaApplication.J().i("collect_website_categories") || operaApplication.R().d.a()) {
            return;
        }
        operaApplication.L().f.a(new x41(j, (byte) 18));
    }
}
