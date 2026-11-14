package ads_mobile_sdk;

import ads_mobile_sdk.ah3;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdError;
import defpackage.ffp;
import defpackage.kap;
import defpackage.mip;
import defpackage.p3p;
import defpackage.rf4;
import defpackage.scd;
import defpackage.w7p;
import defpackage.zso;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ah3 {
    public final Context a;
    public final qr0 b;
    public final mip c;
    public final mh3 d;
    public final kl0 e;
    public final i41 f;
    public final String g;
    public final String h;
    public final kap i;
    public final mi0 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean p;
    public int q;
    public Map o = n08.a;
    public final HashSet r = new HashSet();

    public ah3(Context context, qr0 qr0Var, mip mipVar, mh3 mh3Var, kl0 kl0Var, i41 i41Var, String str, String str2, kap kapVar, mi0 mi0Var) {
        this.a = context;
        this.b = qr0Var;
        this.c = mipVar;
        this.d = mh3Var;
        this.e = kl0Var;
        this.f = i41Var;
        this.g = str;
        this.h = str2;
        this.i = kapVar;
        this.j = mi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.ah3 r5, java.lang.String r6, t78 r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.tg3
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.tg3 r0 = (ads_mobile_sdk.tg3) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.tg3 r0 = new ads_mobile_sdk.tg3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            java.lang.String r6 = r0.b
            ads_mobile_sdk.ah3 r5 = r0.a
            defpackage.ybh.y(r8)     // Catch: java.lang.Exception -> L43
            return r8
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L32:
            defpackage.ybh.y(r8)
            r0.a = r5     // Catch: java.lang.Exception -> L43
            r0.b = r6     // Catch: java.lang.Exception -> L43
            r0.e = r4     // Catch: java.lang.Exception -> L43
            java.lang.Object r5 = r7.invoke(r0)     // Catch: java.lang.Exception -> L43
            if (r5 != r1) goto L42
            return r1
        L42:
            return r5
        L43:
            r7 = move-exception
            r5.a(r6, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ah3.c(ads_mobile_sdk.ah3, java.lang.String, t78, nt5):java.lang.Object");
    }

    public final void a(String str, Exception exc) {
        xu0.a(new m53(str, exc, (byte) 25));
        kl0 kl0Var = this.e;
        rg3 rg3Var = hh3.b().a;
        kh3 kh3Var = rg3Var != null ? rg3Var.a : null;
        this.c.getClass();
        kl0Var.a(new ml0(exc, str, kh3Var, true, System.currentTimeMillis(), rl1.b, true));
    }

    public final void a(String str, Throwable th) {
        xu0.a(new m53(str, th, (byte) 24));
        if (this.l) {
            kl0 kl0Var = this.e;
            rg3 rg3Var = hh3.b().a;
            kh3 kh3Var = rg3Var != null ? rg3Var.a : null;
            this.c.getClass();
            kl0Var.a(new ml0(th, str, kh3Var, true, System.currentTimeMillis(), rl1.b, false));
        }
    }

    public final void a(Throwable th) throws Throwable {
        if (this.p) {
            Throwable thC = zwg.c(th);
            boolean z = false;
            while (thC != null) {
                for (StackTraceElement stackTraceElement : thC.getStackTrace()) {
                    if (ah3.class.getName().equals(stackTraceElement.getClassName())) {
                        return;
                    }
                    String className = stackTraceElement.getClassName();
                    qr0 qr0Var = this.b;
                    qr0Var.getClass();
                    List list = (List) qr0Var.a("gads:uncaught_exception_handler_prefix", Arrays.asList("com.google", "ads_mobile_sdk", "org.chromium", "android.webkit"), fo.a$15);
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (kotlin.text.c.q(className, (String) it.next(), false)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                Throwable cause = thC.getCause();
                thC = cause != null ? zwg.c(cause) : null;
            }
            if (z) {
                if (this.q > 0) {
                    HashSet hashSet = this.r;
                    if (hashSet.size() >= this.q) {
                        return;
                    }
                    Throwable thC2 = zwg.c(th);
                    StringWriter stringWriter = new StringWriter();
                    thC2.printStackTrace(new PrintWriter(stringWriter));
                    String strB = zwg.b(stringWriter.toString());
                    if (strB == null) {
                        strB = "";
                    }
                    if (hashSet.contains(strB)) {
                        return;
                    } else {
                        hashSet.add(strB);
                    }
                }
                b(th);
            }
        }
    }

    public final void a(nx5 nx5Var) {
        String str;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo packageInfo;
        fo foVar = fo.a$7;
        Double dValueOf = Double.valueOf(0.1d);
        Double dValueOf2 = Double.valueOf(0.03d);
        mi0 mi0Var = this.j;
        mi0Var.b();
        nw.a = this;
        qr0 qr0Var = this.b;
        qr0Var.getClass();
        w7p w7pVar = (w7p) qr0Var.a;
        this.q = ((Number) qr0Var.a("gads:max_duplicate_crash:amount", (Object) 10, (Function1) fo.a$11)).intValue();
        Context context = this.a;
        String packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        if (packageManager2 == null || (packageInfo = packageManager2.getPackageInfo(context.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY)) == null || (str = packageInfo.versionName) == null) {
            str = "";
        }
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        String string = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY)) == null || (bundle = applicationInfo.metaData) == null) ? null : bundle.getString("com.google.unity.ads.UNITY_VERSION");
        zso zsoVarO = nw0.o();
        zsoVarO.b$1();
        nw0 nw0Var = (nw0) zsoVarO.b;
        nw0Var.getClass();
        nw0Var.os_ = 1;
        String str2 = Build.VERSION.RELEASE;
        zsoVarO.b$1();
        ((nw0) zsoVarO.b).q();
        String str3 = Build.MODEL;
        zsoVarO.b$1();
        ((nw0) zsoVarO.b).l(str3);
        int i = Build.VERSION.SDK_INT;
        zsoVarO.b$1();
        ((nw0) zsoVarO.b).targetVersion_ = i;
        zsoVarO.b$1();
        nw0 nw0Var2 = (nw0) zsoVarO.b;
        String str4 = this.g;
        nw0Var2.z(str4);
        zsoVarO.b$1();
        nw0 nw0Var3 = (nw0) zsoVarO.b;
        String str5 = this.h;
        nw0Var3.h(str5);
        zsoVarO.b$1();
        ((nw0) zsoVarO.b).e(packageName);
        zsoVarO.b$1();
        ((nw0) zsoVarO.b).f(str);
        String country = Locale.getDefault().getCountry();
        zsoVarO.b$1();
        ((nw0) zsoVarO.b).j(country);
        i41 i41Var = this.f;
        i41Var.a();
        wh0 wh0Var = (wh0) mi0Var.b.get();
        zsoVarO.b$1();
        nw0 nw0Var4 = (nw0) zsoVarO.b;
        nw0Var4.getClass();
        nw0Var4.deviceAdvertisedMemTier_ = wh0Var.getNumber();
        yh0 yh0Var = (yh0) mi0Var.c.get();
        zsoVarO.b$1();
        nw0 nw0Var5 = (nw0) zsoVarO.b;
        nw0Var5.getClass();
        nw0Var5.deviceAvailableProcessorTier_ = yh0Var.getNumber();
        xh0 xh0VarA = mi0Var.a();
        zsoVarO.b$1();
        nw0 nw0Var6 = (nw0) zsoVarO.b;
        nw0Var6.getClass();
        nw0Var6.deviceAvailableMemoryTier_ = xh0VarA.getNumber();
        boolean z = ((eo) w7pVar).r;
        zsoVarO.b$1();
        ((nw0) zsoVarO.b).isFirstSessionAfterInstall_ = z;
        boolean z2 = ((eo) w7pVar).p;
        zsoVarO.b$1();
        ((nw0) zsoVarO.b).hadCachedFlags_ = z2;
        boolean z3 = ((eo) w7pVar).q;
        zsoVarO.b$1();
        ((nw0) zsoVarO.b).wereCachedFlagsReset_ = z3;
        if (string != null) {
            zsoVarO.b$1();
            ((nw0) zsoVarO.b).E(string);
        }
        nw0 nw0Var7 = (nw0) zsoVarO.a();
        ffp ffpVarP = tv0.p();
        ffpVarP.b$1();
        tv0 tv0Var = (tv0) ffpVarP.b;
        tv0Var.getClass();
        tv0Var.os_ = p3p.d(2);
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).p(str2);
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).j(str3);
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).targetVersion_ = i;
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).t(str5);
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).d(str4);
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).f(packageName);
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).g(str);
        String country2 = Locale.getDefault().getCountry();
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).i(country2);
        if (string != null) {
            ffpVarP.b$1();
            ((tv0) ffpVarP.b).y(string);
        }
        i41Var.a();
        tv0 tv0Var2 = (tv0) ffpVarP.a();
        uih.a.getClass();
        k6 k6Var = uih.b;
        this.k = k6Var.i() < ((Number) qr0Var.a("gads:cui_monitoring_session_sample_rate", dValueOf2, foVar)).doubleValue();
        this.l = k6Var.i() < ((Number) qr0Var.a("gads:trapped_exception_monitoring_session_sample_rate", dValueOf2, foVar)).doubleValue();
        this.m = k6Var.i() < ((Number) qr0Var.a("gads:untrapped_exception_monitoring_session_sample_rate", dValueOf, foVar)).doubleValue();
        this.n = k6Var.i() < ((Number) qr0Var.a("gads:cui_monitoring_trace_failure_stacktrace_rate", Double.valueOf(0.01d), foVar)).doubleValue();
        Map mapH0 = qr0Var.h0();
        LinkedHashMap linkedHashMap = new LinkedHashMap(qbd.a(mapH0.size()));
        for (Map.Entry entry : mapH0.entrySet()) {
            Object key = entry.getKey();
            uih.a.getClass();
            linkedHashMap.put(key, Boolean.valueOf(uih.b.i() < ((Number) entry.getValue()).doubleValue()));
        }
        this.o = linkedHashMap;
        ws wsVar = (ws) this.i.get();
        double dDoubleValue = ((Number) qr0Var.a("gads:cui_monitoring_session_sample_rate", dValueOf2, foVar)).doubleValue();
        mh3 mh3Var = this.d;
        mh3Var.l = dDoubleValue;
        mh3Var.m = qr0Var.h0();
        mh3Var.a(nx5Var, nw0Var7, wsVar);
        kl0 kl0Var = this.e;
        kl0Var.getClass();
        qr0 qr0Var2 = kl0Var.c;
        qr0Var2.getClass();
        if (((Number) qr0Var2.a("gads:trapped_exception_monitoring_session_sample_rate", dValueOf2, foVar)).doubleValue() > 0.0d) {
            kl0Var.l = (long) (1.0d / ((Number) qr0Var2.a("gads:trapped_exception_monitoring_session_sample_rate", dValueOf2, foVar)).doubleValue());
        }
        if (((Number) qr0Var2.a("gads:untrapped_exception_monitoring_session_sample_rate", dValueOf, foVar)).doubleValue() > 0.0d) {
            kl0Var.m = (long) (1.0d / ((Number) qr0Var2.a("gads:untrapped_exception_monitoring_session_sample_rate", dValueOf, foVar)).doubleValue());
        }
        kl0Var.a(nx5Var, tv0Var2, wsVar);
        i41Var.a();
        boolean zBooleanValue = ((Boolean) qr0Var.a("gads:uncaught_exception_handler", Boolean.FALSE, fo.a)).booleanValue();
        this.p = zBooleanValue;
        if (zBooleanValue) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: zko
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    ah3 ah3Var = this.a;
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    try {
                        ah3Var.a(th);
                        if (uncaughtExceptionHandler == null) {
                            return;
                        }
                    } catch (Throwable unused2) {
                        if (uncaughtExceptionHandler == null) {
                            return;
                        }
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
            Thread thread = Looper.getMainLooper().getThread();
            thread.setUncaughtExceptionHandler(new vg3(this, thread.getUncaughtExceptionHandler()));
        }
    }

    public final void b(Throwable th) throws Throwable {
        xu0.a(new d30(th, (byte) 2));
        if (this.m) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    if (kotlin.text.c.q(stackTraceElement.getClassName(), AdError.GOOGLE_MOBILE_ADS_DOMAIN, false)) {
                        z = true;
                    }
                    if (Intrinsics.a(stackTraceElement.getClassName(), ah3.class.getName()) || Intrinsics.a(stackTraceElement.getClassName(), kl0.class.getName())) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (z && !z2) {
                this.c.getClass();
                this.e.a(new ml0(th, "UNTRAPPED_EXCEPTION", null, false, System.currentTimeMillis(), rl1.b, false));
            }
        }
        scd.g0(dze.b, new rf4((byte) 27, null, this));
    }

    public final Object d(String str, Function0 function0) {
        try {
            return function0.invoke();
        } catch (Exception e) {
            this.a(str, (Throwable) e);
            return null;
        }
    }
}
