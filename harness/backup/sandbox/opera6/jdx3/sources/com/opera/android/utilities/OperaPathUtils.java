package com.opera.android.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.od6;
import defpackage.pd6;
import defpackage.snf;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class OperaPathUtils {
    @NonNull
    public static String getAriaUserImagesDir() {
        return snf.c;
    }

    @NonNull
    public static String getBannerBlockerFile() {
        return snf.a;
    }

    @Nullable
    public static String getBreamDataStoreDirectory() {
        try {
            FutureTask futureTask = pd6.a;
            return od6.a;
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    public static String getIntentSignalsDir() {
        return snf.e;
    }

    @NonNull
    public static String getSiteJsFile() {
        return snf.b;
    }
}
