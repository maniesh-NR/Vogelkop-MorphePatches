package com.opera.android.browser;

import android.os.Build;
import defpackage.vk2;

/* loaded from: classes.dex */
public final class OperaContentBrowserClient {
    public static boolean a;

    public static boolean allowIoctl0x7001() {
        return "Xiaomi".equals(Build.MANUFACTURER);
    }

    public static boolean allowIoctlZero() {
        if (Build.VERSION.SDK_INT != 30) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return "INFINIX MOBILITY LIMITED".equals(str) || "TECNO MOBILE LIMITED".equals(str);
    }

    public static void onNetworkServiceCreated() {
        if (a) {
            return;
        }
        a = true;
        cqp.o0(new vk2((byte) 18));
    }
}
