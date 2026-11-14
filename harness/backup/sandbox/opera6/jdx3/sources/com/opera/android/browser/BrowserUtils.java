package com.opera.android.browser;

import J.N;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ImagesContract;
import defpackage.aik;
import defpackage.wqm;
import org.chromium.net.GURLUtils;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class BrowserUtils {
    public static String a(String str) {
        String origin = GURLUtils.getOrigin(Uri.parse(str).toString());
        String[] strArr = aik.a;
        return origin == null ? "" : origin;
    }

    public static zg b(String str) {
        String strA = UrlMangler.a(str, "search_template");
        if (strA == null) {
            return null;
        }
        String strA2 = UrlMangler.a(str, "display_string");
        String strA3 = UrlMangler.a(str, "search_origin");
        int i = 0;
        if (strA3 != null) {
            try {
                i = vep.B(10)[Integer.valueOf(strA3).intValue()];
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return i == 0 ? zg.n(2, strA, strA2) : zg.n(i, strA, strA2);
    }

    public static boolean c(String str) {
        String hostString = getHostString(str);
        return "translate.googleusercontent.com".equals(hostString) || hostString.endsWith(".translate.goog") || "translate.yandex.com".equals(hostString) || "translated.turbopages.org".equals(hostString);
    }

    public static boolean d(int i) {
        int i2 = i & 255;
        return (i2 == 3 || i2 == 6 || (i & (-268435456)) != 0) ? false : true;
    }

    @NonNull
    public static String getDisplayString(@NonNull String str) {
        GURL gurl = new GURL(str);
        String[] strArr = wqm.a;
        if (N.MKonq97J(gurl)) {
            return (String) N.M6gdEujY(gurl);
        }
        String strA = UrlMangler.a(str, "display_string");
        return strA != null ? strA : (String) N.MXoV$28C(getExternalUrlWithFallback(str));
    }

    @NonNull
    public static String getEditableString(@NonNull String str) {
        GURL gurl = new GURL(str);
        String[] strArr = wqm.a;
        return N.MKonq97J(gurl) ? (String) N.M6gdEujY(gurl) : (String) N.MA$5GGU4(getExternalUrlWithFallback(str));
    }

    @NonNull
    public static String getExternalUrlWithFallback(@NonNull String str) {
        String strA = UrlMangler.a(str, "external_url");
        return strA != null ? strA : getRendererUrl(str);
    }

    @NonNull
    public static String getHostString(@NonNull String str) {
        return (String) N.MThXHJdO(getExternalUrlWithFallback(str));
    }

    @NonNull
    public static String getRendererUrl(@NonNull String str) {
        String strA = UrlMangler.a(str, ImagesContract.URL);
        if (strA != null) {
            return strA;
        }
        Uri uriBuild = Uri.parse(str);
        if ("chrome".equals(uriBuild.getScheme())) {
            uriBuild = uriBuild.buildUpon().scheme("opera").build();
        }
        return uriBuild.toString();
    }

    @Nullable
    public static String getTitle(@NonNull String str) {
        return UrlMangler.a(str, "title");
    }

    @NonNull
    public static String getTitleWithFallback(@NonNull String str) {
        String strA = UrlMangler.a(str, "title");
        return strA != null ? strA : (String) N.MWAcU8Kr(getExternalUrlWithFallback(str));
    }
}
