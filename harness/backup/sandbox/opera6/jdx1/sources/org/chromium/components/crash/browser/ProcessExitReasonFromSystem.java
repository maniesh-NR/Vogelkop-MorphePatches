package org.chromium.components.crash.browser;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.os.Build;
import defpackage.t8;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessExitReasonFromSystem {
    public static void recordExitReasonToUma(int i, String str) {
        Integer num = null;
        int reason = -1;
        if (Build.VERSION.SDK_INT >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) t8.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, i, 1);
            if (!historicalProcessExitReasons.isEmpty() && historicalProcessExitReasons.get(0) != null && h9o.d(historicalProcessExitReasons.get(0)).getPid() == i) {
                reason = h9o.d(historicalProcessExitReasons.get(0)).getReason();
            }
        }
        switch (reason) {
            case -1:
                num = 14;
                break;
            case 0:
                num = 11;
                break;
            case 1:
                num = 5;
                break;
            case 2:
                num = 10;
                break;
            case 3:
                num = 7;
                break;
            case 4:
                num = 1;
                break;
            case 5:
                num = 2;
                break;
            case 6:
                num = 0;
                break;
            case 7:
                num = 6;
                break;
            case 8:
                num = 9;
                break;
            case 9:
                num = 4;
                break;
            case 10:
                num = 12;
                break;
            case 11:
                num = 13;
                break;
            case 12:
                num = 3;
                break;
            case 13:
                num = 8;
                break;
            case 14:
                num = 15;
                break;
            case 15:
                num = 16;
                break;
            case 16:
                num = 17;
                break;
        }
        if (num != null) {
            ioh.y(num.intValue(), 18, str);
        }
    }
}
