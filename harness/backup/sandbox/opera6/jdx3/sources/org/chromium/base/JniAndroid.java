package org.chromium.base;

import android.util.Log;
import defpackage.sko;

/* loaded from: classes.dex */
public final class JniAndroid {
    public static Throwable handleException(Throwable th, String str) {
        try {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new snb(sko.k("Native stack trace:", System.lineSeparator(), str), th));
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    public static String sanitizedStacktraceForUnhandledException(Throwable th) {
        try {
            try {
                return veg.b(Log.getStackTraceString(th));
            } catch (Throwable th2) {
                return "Error while getting stack trace: " + Log.getStackTraceString(th2);
            }
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }
}
