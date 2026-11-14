package defpackage;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* loaded from: classes.dex */
public final class omo extends WebViewClient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pno b;

    public /* synthetic */ omo(pno pnoVar, byte b) {
        this.a = b;
        this.b = pnoVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        byte b = this.a;
        pno pnoVar = this.b;
        switch (b) {
            case 0:
                renderProcessGoneDetail.toString();
                Objects.toString(webView);
                if (pnoVar.g() == webView) {
                    pnoVar.b = new b2b((Object) null, (byte) 3);
                }
                if (webView != null) {
                    webView.destroy();
                    break;
                }
                break;
            default:
                renderProcessGoneDetail.toString();
                Objects.toString(webView);
                if (pnoVar.g() == webView) {
                    pnoVar.b = new b2b((Object) null, (byte) 3);
                }
                if (webView != null) {
                    webView.destroy();
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 0:
                return aoh.d(webResourceRequest.getUrl().toString());
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 0:
                return aoh.d(str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
