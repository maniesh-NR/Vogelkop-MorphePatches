package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;

/* loaded from: classes.dex */
public final class qhe {
    public final Uri a;
    public final tqo b;

    public qhe(Uri uri, tqo tqoVar) {
        this.a = uri;
        this.b = tqoVar;
        if (uri != null) {
            URLUtil.isNetworkUrl(uri.toString());
        }
    }
}
