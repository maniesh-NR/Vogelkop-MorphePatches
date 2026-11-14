package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n5p {
    public static final List a(PackageManager packageManager, Intent intent, int i) {
        return Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(i)) : packageManager.queryIntentActivities(intent, i);
    }

    public static boolean b(Context context, Intent intent) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return !(Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(131072L)) : packageManager.queryIntentActivities(intent, 131072)).isEmpty();
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public static boolean c(String str) {
        if (str == null) {
            return false;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        return "play.google.com".equals(host) || "market.android.com".equals(host) || "market".equals(scheme);
    }

    public static final ResolveInfo d(PackageManager packageManager, Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(65536L)) : packageManager.resolveActivity(intent, 65536);
    }

    public static boolean e(String str) {
        if (c(str) || str == null) {
            return true;
        }
        String scheme = Uri.parse(str).getScheme();
        return ("http".equals(scheme) || "https".equals(scheme)) ? false : true;
    }
}
