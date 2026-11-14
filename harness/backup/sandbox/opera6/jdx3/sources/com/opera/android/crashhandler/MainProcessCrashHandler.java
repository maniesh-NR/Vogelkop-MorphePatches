package com.opera.android.crashhandler;

import J.N;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import com.leanplum.internal.Clock;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import defpackage.ay;
import defpackage.eq6;
import defpackage.f13;
import defpackage.hvj;
import defpackage.is3;
import defpackage.ks3;
import defpackage.pz5;
import defpackage.qz5;
import defpackage.sko;
import defpackage.tz5;
import defpackage.vml;
import defpackage.wom;
import defpackage.yzb;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.chromium.components.crash.browser.ChildProcessCrashObserver;

/* loaded from: classes.dex */
public final class MainProcessCrashHandler implements qz5 {
    public final wom a;
    public final is3 b;
    public final int c = Process.myPid();
    public final ay d;
    public final ks3 e;

    public MainProcessCrashHandler(OperaApplication operaApplication, wom womVar, is3 is3Var, ks3 ks3Var) {
        this.a = womVar;
        this.b = is3Var;
        this.e = ks3Var;
        ay ayVar = new ay(this, operaApplication);
        Lazy.e(ayVar, vml.d);
        this.d = ayVar;
    }

    public final void a(long j) {
        int i = this.c;
        if (j == i) {
            ScheduledExecutorService scheduledExecutorService = vml.a;
            Thread thread = Looper.getMainLooper().getThread();
            StackTraceElement[] stackTrace = thread.getStackTrace();
            Exception exc = new Exception("Auxiliary stack, thread=" + thread.getName());
            exc.setStackTrace(stackTrace);
            exc.printStackTrace();
            return;
        }
        Runtime runtime = Runtime.getRuntime();
        Locale locale = Locale.ROOT;
        String strReplace = xvg.z(runtime.exec("cat /proc/" + i + "/task/" + j + "/comm").getInputStream()).replace("\n", "");
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            String name = entry.getKey().getName();
            if (name != null && name.startsWith(strReplace)) {
                Thread key = entry.getKey();
                StackTraceElement[] value = entry.getValue();
                Exception exc2 = new Exception("Auxiliary stack, thread=" + key.getName());
                exc2.setStackTrace(value);
                exc2.printStackTrace();
            }
        }
    }

    public final void b(File file) {
        String strConcat;
        try {
            synchronized ("https://crashstats-collector.opera.com/collector/submit") {
                new eq6(file).Q(this.e);
                this.a.c();
                Pattern pattern = pz5.b;
                file.delete();
            }
        } catch (IOException unused) {
            Pattern pattern2 = pz5.b;
            String path = file.getPath();
            int iB = pz5.b(path);
            if (iB >= 0) {
                int i = iB + 1;
                strConcat = path.replace(sko.i(iB, ".try"), ".try" + i);
            } else {
                strConcat = path.concat(".try1");
            }
            if (!file.renameTo(new File(strConcat))) {
                strConcat = null;
            }
            if (strConcat == null) {
                file.delete();
                return;
            }
            int iB2 = pz5.b(strConcat);
            if (iB2 < 0) {
                iB2 = 0;
            }
            if (iB2 >= 3) {
                new File(strConcat).delete();
            }
        } catch (Throwable th) {
            Pattern pattern3 = pz5.b;
            file.delete();
            throw th;
        }
    }

    @Override // defpackage.qz5
    public final void d() {
        pz5 pz5Var = (pz5) this.d.get();
        pz5Var.getClass();
        N.MkFw6nJp(this, new File(pz5Var.a, "Crashpad").getAbsolutePath(), "CrashReporter");
        ChildProcessCrashObserver.a = new yzb(this, (byte) 16);
        rz5.a.flushToNative();
    }

    @Override // defpackage.qz5
    public final void g(is3 is3Var) {
        pz5 pz5Var = (pz5) this.d.get();
        int i = 0;
        for (File file : pz5Var.a(null)) {
            if ((new Date().getTime() - file.lastModified()) / Clock.DAY_MILLIS > 30) {
                file.delete();
            } else if (i < 10) {
                i++;
            } else {
                file.delete();
            }
        }
        File[] fileArrA = pz5Var.a(pz5.c);
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrA) {
            int iB = pz5.b(file2.getName());
            if (iB < 0) {
                iB = 0;
            }
            if (iB < 3) {
                arrayList.add(file2);
            }
        }
        for (File file3 : (File[]) arrayList.toArray(new File[arrayList.size()])) {
            try {
                if (this.a.d()) {
                    file3.delete();
                } else {
                    b(file3);
                }
            } catch (Throwable th) {
                is3Var.a.H(th);
            }
        }
    }

    @Override // defpackage.qz5
    public final void h(HashMap map) {
        tz5.d(false);
        if (this.a.d()) {
            return;
        }
        pz5 pz5Var = (pz5) this.d.get();
        pz5Var.getClass();
        File file = new File(new File(pz5Var.a, "crash_dumps"), (UUID.randomUUID().toString() + ".dmp" + Process.myPid()).concat(".try0"));
        if (new sxd(file, map, (byte) 0).a().booleanValue()) {
            try {
                b(file);
                return;
            } catch (f13 unused) {
            }
        }
        hvj hvjVar = new hvj(this.e);
        try {
            hvjVar.h(new URL("https://crashstats-collector.opera.com/collector/submit"));
            hvjVar.m(map);
            hvjVar.l();
        } catch (IOException unused2) {
        } catch (Throwable th) {
            xvg.l(hvjVar);
            throw th;
        }
        xvg.l(hvjVar);
    }

    public final void onNativeCrash(long j) {
        try {
            a(j);
        } catch (Throwable unused) {
        }
        tz5.d(true);
        if (this.a.d()) {
            return;
        }
        CrashReportProcessingService.c(10L, (Context) this.b.a.b);
    }
}
