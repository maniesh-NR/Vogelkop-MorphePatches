package org.chromium.base;

import android.app.ActivityManager;

/* loaded from: classes.dex */
public final class SysUtils {
    public static Boolean a;
    public static Integer b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r5 = java.lang.Integer.parseInt(r4.group(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r5 > 1024) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r4.group(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        android.os.StrictMode.setThreadPolicy(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a() {
        /*
            java.lang.Integer r0 = org.chromium.base.SysUtils.b
            if (r0 != 0) goto L6e
            java.lang.String r0 = "^MemTotal:\\s+([0-9]+) kB$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L64
            java.lang.String r3 = "/proc/meminfo"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L64
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L55
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L55
        L1a:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L3a
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch: java.lang.Throwable -> L4b
            boolean r5 = r4.find()     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L1a
            r0 = 1
            java.lang.String r5 = r4.group(r0)     // Catch: java.lang.Throwable -> L4b
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L4b
            r6 = 1024(0x400, float:1.435E-42)
            if (r5 > r6) goto L41
            r4.group(r0)     // Catch: java.lang.Throwable -> L4b
        L3a:
            r3.close()     // Catch: java.lang.Throwable -> L55
            r2.close()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L64
            goto L64
        L41:
            r3.close()     // Catch: java.lang.Throwable -> L55
            r2.close()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L64
            android.os.StrictMode.setThreadPolicy(r1)
            goto L68
        L4b:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L55
        L54:
            throw r0     // Catch: java.lang.Throwable -> L55
        L55:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L64
        L5e:
            throw r0     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L64
        L5f:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)
            throw r0
        L64:
            android.os.StrictMode.setThreadPolicy(r1)
            r5 = 0
        L68:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            org.chromium.base.SysUtils.b = r0
        L6e:
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.SysUtils.a():int");
    }

    public static boolean b() {
        int iA;
        Boolean boolValueOf = a;
        if (boolValueOf == null) {
            CommandLine commandLine = CommandLine.d;
            boolean z = true;
            if (!commandLine.c("enable-low-end-device-mode") && (commandLine.c("disable-low-end-device-mode") || (iA = a()) <= 0 || iA / 1024 > 1024)) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
            a = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static int getLowMemoryDeviceThresholdMb() {
        return 1024;
    }

    public static boolean isProcessInBackground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Exception unused) {
        }
        return runningAppProcessInfo.importance >= 400;
    }
}
