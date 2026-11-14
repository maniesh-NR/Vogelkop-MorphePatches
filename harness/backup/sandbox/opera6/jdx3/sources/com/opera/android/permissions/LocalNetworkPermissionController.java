package com.opera.android.permissions;

import J.N;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.api.Callback;
import defpackage.lw0;
import defpackage.r1o;
import defpackage.wen;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class LocalNetworkPermissionController {
    public static void a(final Callback callback, final WindowAndroid windowAndroid) {
        boolean zHasPermission = windowAndroid.hasPermission("android.permission.ACCESS_LOCAL_NETWORK");
        if (windowAndroid.hasPermission("android.permission.ACCESS_LOCAL_NETWORK") || !ipe.G()) {
            callback.run(Boolean.valueOf(zHasPermission));
        } else if (windowAndroid.canRequestPermission("android.permission.ACCESS_LOCAL_NETWORK")) {
            windowAndroid.e(new String[]{"android.permission.ACCESS_LOCAL_NETWORK"}, new lw0(callback, (byte) 3));
        } else {
            windowAndroid.t(f03.n(t8.a), new r1o() { // from class: wuc
                @Override // defpackage.r1o
                public final void a(int i, Intent intent) {
                    callback.run(Boolean.valueOf(windowAndroid.hasPermission("android.permission.ACCESS_LOCAL_NETWORK")));
                }
            }, (Integer) null);
        }
    }

    public static boolean hasPermission(@NonNull WindowAndroid windowAndroid) {
        return windowAndroid.hasPermission("android.permission.ACCESS_LOCAL_NETWORK");
    }

    public static void nativeRequestPermission(@NonNull WebContents webContents) {
        GURL gurl = ChromiumContent.V;
        ChromiumContent chromiumContent = (ChromiumContent) N.Mo8CJari(webContents);
        if (chromiumContent == null) {
            N.MLWmh7HR(false);
            return;
        }
        boolean zHasPermission = chromiumContent.b.hasPermission("android.permission.ACCESS_LOCAL_NETWORK");
        if (zHasPermission || !ipe.G()) {
            N.MLWmh7HR(zHasPermission);
        } else {
            chromiumContent.p.a(new wen(chromiumContent, (byte) 2));
        }
    }
}
