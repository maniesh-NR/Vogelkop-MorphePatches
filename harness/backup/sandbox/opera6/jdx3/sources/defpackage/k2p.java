package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* loaded from: classes.dex */
public final class k2p extends WebViewRenderProcessClient {
    @Override // android.webkit.WebViewRenderProcessClient
    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        webView.getUrl();
        webView.getTitle();
        ito[] itoVarArr = ito.a;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        webView.getUrl();
        webView.getTitle();
        ito[] itoVarArr = ito.a;
        p8p.a(new qfp(webView));
    }
}
