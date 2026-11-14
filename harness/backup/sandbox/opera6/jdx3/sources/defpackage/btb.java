package defpackage;

import android.net.Uri;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.UrlMangler;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class btb {
    public static final boolean a(String str, String str2) {
        return "opera".equals(str) && "jump".equals(str2);
    }

    public static final boolean b(String str) {
        return c.q(str, "opera://jump/", false) || c.q(BrowserUtils.getRendererUrl(str), "opera-jump://", false);
    }

    public static String c(int i, String str, String str2) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return d(null, str, str2, false);
    }

    public static final String d(Uri uri, String str, String str2, boolean z) {
        Uri.Builder builderEncodedPath = new Uri.Builder().scheme("opera-jump").authority("ui").encodedPath("/");
        Uri.Builder builderEncodedPath2 = new Uri.Builder().scheme("opera").authority("jump").encodedPath("/");
        if (uri != null) {
            for (String str3 : wqm.n(uri)) {
                String queryParameter = uri.getQueryParameter(str3);
                if (queryParameter != null) {
                    builderEncodedPath2.appendQueryParameter(str3, queryParameter);
                    builderEncodedPath.appendQueryParameter(str3, queryParameter);
                }
            }
        }
        if (str != null) {
            builderEncodedPath.appendQueryParameter("source", str);
        }
        if (str2 != null) {
            builderEncodedPath.appendQueryParameter("campaign", str2);
        }
        if (z) {
            builderEncodedPath.appendQueryParameter("intro", "true");
        }
        String string = builderEncodedPath2.build().toString();
        UrlMangler.Builder builder = new UrlMangler.Builder("jump", builderEncodedPath.build().toString());
        builder.displayString(string);
        builder.externalUrl(string);
        return builder.build();
    }
}
