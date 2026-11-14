package com.opera.android.wallpaper;

import J.N;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import defpackage.cmn;
import defpackage.dmn;
import defpackage.dx3;
import defpackage.gjm;
import defpackage.lnn;
import defpackage.wln;
import kotlin.text.c;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class WallpaperStorefrontExtension {
    public static dx3 a;
    public static lnn b;

    public static int getSupportedPreviewTargets() {
        if (r9n.H(t8.a)) {
            return ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && c.q(Build.MODEL, "Redmi", false)) ? 3 : 7;
        }
        return 1;
    }

    public static boolean shouldInstall(@NonNull GURL gurl) {
        String strQ;
        String host;
        if (!gurl.b || (strQ = rih.q(t8.a)) == null || (host = Uri.parse(strQ).getHost()) == null || host.isEmpty()) {
            return false;
        }
        return N.MstQ1QcZ(gurl, host);
    }

    public static boolean showPreview(@NonNull GURL gurl, int i) {
        int supportedPreviewTargets;
        if (a == null || (supportedPreviewTargets = i & getSupportedPreviewTargets()) == 0) {
            return false;
        }
        ((gjm) a.s().b().get()).e(new dmn(wln.g, new cmn(null, gurl.g(), supportedPreviewTargets, 9, false)), false);
        return true;
    }
}
