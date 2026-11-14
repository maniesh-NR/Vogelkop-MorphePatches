package org.chromium.components.crash.browser;

import android.content.Context;
import com.opera.android.crashhandler.CrashReportProcessingService;
import com.opera.android.crashhandler.MainProcessCrashHandler;
import defpackage.tz5;
import defpackage.yzb;

/* loaded from: classes.dex */
public final class ChildProcessCrashObserver {
    public static yzb a;

    public static void childCrashed(int i) {
        yzb yzbVar = a;
        if (yzbVar != null) {
            MainProcessCrashHandler mainProcessCrashHandler = (MainProcessCrashHandler) yzbVar.b;
            tz5.d(true);
            if (mainProcessCrashHandler.a.d()) {
                return;
            }
            CrashReportProcessingService.c(10L, (Context) mainProcessCrashHandler.b.a.b);
        }
    }
}
