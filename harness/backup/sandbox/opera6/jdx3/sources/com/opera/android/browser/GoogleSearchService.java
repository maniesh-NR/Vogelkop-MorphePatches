package com.opera.android.browser;

import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import defpackage.lqm;
import defpackage.x5f;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class GoogleSearchService {
    public static void reportAiModeQuery(@NonNull GURL gurl) {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        operaApplication.L().d.h(gurl.g(), lqm.k, null, true);
        x5f x5fVar = operaApplication.L().c;
        String strG = gurl.g();
        if (x5fVar.h) {
            x5fVar.g(strG, null, true);
        }
    }
}
