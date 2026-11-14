package ads_mobile_sdk;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class uu1 extends WebViewClient {
    public final /* synthetic */ xu1 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ uu1(xu1 xu1Var, byte b) {
        this.b = b;
        this.a = xu1Var;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        byte b = this.b;
        xu1 xu1Var = this.a;
        switch (b) {
            case 0:
                xu1Var.a(webView, renderProcessGoneDetail);
                break;
            default:
                xu1Var.a(webView, renderProcessGoneDetail);
                break;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.b) {
            case 0:
                return xih.b(webResourceRequest.getUrl().toString());
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.b) {
            case 0:
                return xih.b(str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
