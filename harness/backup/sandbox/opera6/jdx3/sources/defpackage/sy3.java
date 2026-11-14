package defpackage;

import android.text.TextUtils;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.UrlMangler;

/* loaded from: classes.dex */
public final /* synthetic */ class sy3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ sy3(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public final Object get() {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                return str;
            case 1:
                String rendererUrl = BrowserUtils.getRendererUrl(str);
                String[] strArr = wqm.a;
                return aik.g(rendererUrl);
            default:
                String strA = UrlMangler.a(str, "article_share_url");
                return TextUtils.isEmpty(strA) ? BrowserUtils.getExternalUrlWithFallback(str) : strA;
        }
    }
}
