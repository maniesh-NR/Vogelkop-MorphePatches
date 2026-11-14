package defpackage;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class tlp {
    public static final Set a = e82.E(new String[]{"com.google.android.webview", "com.google.android.webview.beta", "com.google.android.webview.dev", "com.google.android.webview.canary", "com.google.android.webview.debug", "com.android.webview"});
    public static final zyk b = z4c.b(xvo.u);
    public static final a5d c = new a5d((byte) 1);
    public static final slp d = new slp();

    public static final void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Objects.toString(webView);
        renderProcessGoneDetail.didCrash();
        renderProcessGoneDetail.rendererPriorityAtExit();
        webView.setVisibility(8);
        webView.setWebChromeClient(c);
        webView.setWebViewClient(d);
        xgh.g(webView);
        webView.destroy();
    }
}
