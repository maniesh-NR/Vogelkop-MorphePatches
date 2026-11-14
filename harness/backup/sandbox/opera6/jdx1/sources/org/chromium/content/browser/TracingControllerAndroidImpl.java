package org.chromium.content.browser;

import J.N;
import android.content.Context;
import android.os.Environment;
import android.util.Pair;
import defpackage.tgk;
import defpackage.up1;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.chromium.base.Callback;
import org.chromium.base.PathUtils;

/* loaded from: classes.dex */
public final class TracingControllerAndroidImpl {
    public final Context a;
    public final up1 b = new up1(this, (byte) 21);
    public final TracingIntentFilter c;
    public boolean d;
    public String e;
    public long f;

    public TracingControllerAndroidImpl(Context context) {
        this.a = context;
        TracingIntentFilter tracingIntentFilter = new TracingIntentFilter();
        tracingIntentFilter.addAction(context.getPackageName() + ".GPU_PROFILER_START");
        tracingIntentFilter.addAction(context.getPackageName() + ".GPU_PROFILER_STOP");
        tracingIntentFilter.addAction(context.getPackageName() + ".GPU_PROFILER_LIST_CATEGORIES");
        this.c = tracingIntentFilter;
    }

    public static String generateTracingFilePath(String str) {
        tgk tgkVarM = tgk.m();
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                if (str.isEmpty()) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    str = "chrome-profile-results-" + simpleDateFormat.format(new Date());
                }
                String downloadsDirectory = PathUtils.getDownloadsDirectory();
                if (!downloadsDirectory.isEmpty()) {
                    String path = new File(downloadsDirectory, str).getPath();
                    tgkVarM.close();
                    return path;
                }
            }
            tgkVarM.close();
            return null;
        } catch (Throwable th) {
            try {
                tgkVarM.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean a(String str, String str2, String str3) {
        Context context = this.a;
        if (str == null && (str = generateTracingFilePath("")) == null) {
            arl.a(context, 0, context.getString(2132020575)).b();
            return false;
        }
        if (this.d) {
            return false;
        }
        long jMWlLnA$6 = this.f;
        if (jMWlLnA$6 == 0) {
            jMWlLnA$6 = N.MWlLnA$6(this);
            this.f = jMWlLnA$6;
        }
        if (!N.MZYMIGWv(jMWlLnA$6, str2, str3, false)) {
            arl.a(context, 0, context.getString(2132020574)).b();
            return false;
        }
        arl.a(context, 0, context.getString(2132020576) + ": " + str2).b();
        this.e = str;
        this.d = true;
        return true;
    }

    public final void onKnownCategoriesReceived(String[] strArr, Object obj) {
        if (obj != null) {
            ((Callback) obj).onResult(strArr);
        }
    }

    public final void onTraceBufferUsageReceived(float f, long j, Object obj) {
        ((Callback) obj).onResult(new Pair(Float.valueOf(f), Long.valueOf(j)));
    }

    public final void onTracingStopped(Object obj) {
        if (this.d) {
            Object[] objArr = {this.e};
            Context context = this.a;
            arl.a(context, 0, context.getString(2132020577, objArr)).b();
            this.d = false;
            this.e = null;
            if (obj != null) {
                ((Callback) obj).onResult((Object) null);
            }
        }
    }
}
