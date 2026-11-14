package org.chromium.base;

import J.N;
import android.os.Build;
import android.text.TextUtils;
import com.leanplum.internal.ResourceQualifiers;

/* loaded from: classes.dex */
public final class AndroidInfo {
    public static IAndroidInfo a() {
        IAndroidInfo iAndroidInfo = new IAndroidInfo();
        iAndroidInfo.a = TextUtils.join(", ", Build.SUPPORTED_ABIS);
        String str = Build.FINGERPRINT;
        iAndroidInfo.b = str.substring(0, Math.min(str.length(), ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL));
        iAndroidInfo.c = Build.ID;
        iAndroidInfo.d = Build.BOARD;
        iAndroidInfo.e = Build.BRAND;
        iAndroidInfo.f = Build.TYPE;
        iAndroidInfo.g = Build.VERSION.CODENAME;
        iAndroidInfo.h = Build.DEVICE;
        iAndroidInfo.i = Build.HARDWARE;
        iAndroidInfo.j = b();
        iAndroidInfo.k = Build.MANUFACTURER;
        iAndroidInfo.l = Build.MODEL;
        int i = Build.VERSION.SDK_INT;
        iAndroidInfo.m = i;
        if (i >= 36) {
            iAndroidInfo.n = x04.a();
        } else {
            iAndroidInfo.n = 100000 * i;
        }
        iAndroidInfo.o = Build.VERSION.SECURITY_PATCH;
        iAndroidInfo.p = i >= 31 ? Build.SOC_MANUFACTURER : "";
        iAndroidInfo.q = Build.VERSION.INCREMENTAL;
        return iAndroidInfo;
    }

    public static boolean b() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    public static void c(IAndroidInfo iAndroidInfo) {
        N.MYc8mtnY(iAndroidInfo.e, iAndroidInfo.h, iAndroidInfo.c, iAndroidInfo.k, iAndroidInfo.l, iAndroidInfo.f, iAndroidInfo.d, iAndroidInfo.b, iAndroidInfo.q, iAndroidInfo.i, iAndroidInfo.g, iAndroidInfo.p, iAndroidInfo.a, iAndroidInfo.m, iAndroidInfo.n, iAndroidInfo.j, iAndroidInfo.o);
    }

    public static void nativeReadyForFields() {
        c(a());
    }
}
