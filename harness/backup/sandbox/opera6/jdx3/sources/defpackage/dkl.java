package defpackage;

import J.N;
import com.opera.android.browser.BrowserUtils;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class dkl extends cgh {
    public final String a;
    public final zyk b;

    public dkl(String str) {
        String[] strArr = wqm.a;
        GURL gurl = (GURL) N.MxvwDZcS(str);
        str = gurl.b ? (String) N.M52RypMk(BrowserUtils.getExternalUrlWithFallback(gurl.g())) : str;
        String[] strArr2 = aik.a;
        this.a = ehi.a(str);
        this.b = z4c.b(new p7l((Object) this, (byte) 7));
    }
}
