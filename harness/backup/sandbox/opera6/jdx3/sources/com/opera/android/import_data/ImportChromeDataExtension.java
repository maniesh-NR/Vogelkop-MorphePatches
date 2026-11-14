package com.opera.android.import_data;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.opera.android.OperaApplication;
import defpackage.x5f;

/* loaded from: classes.dex */
public final class ImportChromeDataExtension {
    public static void reportError(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        if (str.startsWith("passwords:")) {
            x5fVar.R(9, str);
        } else {
            x5fVar.R(7, str);
        }
    }
}
