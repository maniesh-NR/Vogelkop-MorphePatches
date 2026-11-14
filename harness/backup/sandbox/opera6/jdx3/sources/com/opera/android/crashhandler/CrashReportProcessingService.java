package com.opera.android.crashhandler;

import J.N;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.fsp;
import defpackage.is3;
import defpackage.ks3;
import defpackage.pz5;
import defpackage.qz5;
import defpackage.tz5;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class CrashReportProcessingService extends ilf {
    public static void c(long j, Context context) {
        if (j == 0) {
            ilf.a(context, CrashReportProcessingService.class, 1012, new Intent("com.opera.android.crash.PROCESS_REPORTS"));
            return;
        }
        ((AlarmManager) context.getSystemService("alarm")).set(3, TimeUnit.SECONDS.toMillis(j) + SystemClock.elapsedRealtime(), PendingIntent.getService(context, 0, new Intent(context, (Class<?>) CrashReportProcessingService.class).setAction("com.opera.android.crash.DELAYED_PROCESS_REPORTS").setPackage(context.getPackageName()), 67108864));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Intent intent) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        boolean z;
        if (sfe.g0(this) || !"com.opera.android.crash.PROCESS_REPORTS".equals(intent.getAction())) {
            return;
        }
        File cacheDir = getApplicationContext().getCacheDir();
        pz5 pz5Var = new pz5(cacheDir);
        try {
            wbc.g.a();
            N.MjZjkDM7(new File(cacheDir, "Crashpad").getAbsolutePath(), new File(cacheDir, "crash_dumps").getAbsolutePath());
        } catch (UnsatisfiedLinkError | h1h unused) {
        }
        List listW = null;
        for (File file : pz5Var.a(pz5.b)) {
            HashMap map = new HashMap();
            try {
                map.put(OperaCrashKeys.c[35], tz5.b());
                if ((System.currentTimeMillis() - file.lastModified()) / 3600000 < 12) {
                    if (listW == null) {
                        try {
                            listW = k1g.w();
                        } catch (Exception unused2) {
                            listW = Collections.EMPTY_LIST;
                        }
                    }
                    if (!listW.isEmpty()) {
                        map.put("Logs", TextUtils.join("\n", listW));
                    }
                }
            } catch (Throwable unused3) {
                if (map.isEmpty()) {
                    file.renameTo(new File(file.getPath() + ".try0"));
                }
            }
            File file2 = new File(file.getAbsolutePath() + ".try0");
            File file3 = new File(file2.getAbsolutePath() + ".tmp");
            try {
                String strX = fsp.x(file);
                if (strX == null) {
                    strX = "--------------------------".concat(String.format(Locale.US, "%016x", new BigInteger(64, new Random())));
                    z = true;
                } else {
                    z = false;
                }
                String str = "--" + strX + "\r\n";
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                try {
                    fsp.K(bufferedOutputStream, map, str);
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    if (z) {
                        try {
                            try {
                                bufferedOutputStream.write(str.getBytes());
                                Locale locale = Locale.US;
                                bufferedOutputStream.write("Content-Disposition: form-data; name=\"IsEncapsulatedCrash\"\r\n\r\n1\r\n".getBytes());
                                bufferedOutputStream.write(str.getBytes());
                                bufferedOutputStream.write("Content-Disposition: form-data; name=\"upload_file_minidump\"; filename=\"dump\"\r\nContent-Type: application/octet-stream\r\n\r\n".getBytes());
                                xvg.n(bufferedInputStream, bufferedOutputStream);
                                bufferedOutputStream.write(("\r\n--" + strX + "--\r\n").getBytes());
                            } catch (Throwable th) {
                                th = th;
                                xvg.l(bufferedInputStream);
                                xvg.l(bufferedOutputStream);
                                throw th;
                            }
                        } catch (IOException unused4) {
                            file3.delete();
                            xvg.l(bufferedInputStream);
                            xvg.l(bufferedOutputStream);
                        }
                    } else {
                        xvg.n(bufferedInputStream, bufferedOutputStream);
                    }
                    xvg.l(bufferedInputStream);
                    xvg.l(bufferedOutputStream);
                    if (file3.renameTo(file2)) {
                        file.delete();
                    } else {
                        file3.delete();
                    }
                } catch (IOException unused5) {
                    bufferedInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = null;
                }
            } catch (IOException unused6) {
                bufferedInputStream = null;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
                bufferedOutputStream = null;
            }
        }
        ks3 ks3Var = ks3.k;
        ((qz5) ks3Var.g).g(new is3(ks3Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && "com.opera.android.crash.DELAYED_PROCESS_REPORTS".equals(intent.getAction())) {
            c(0L, getApplicationContext());
            stopSelf(i2);
        }
        return 2;
    }
}
