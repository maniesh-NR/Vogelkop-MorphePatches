package defpackage;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class eho extends WebViewClient {
    public final lyo a;
    public final lyo b;

    public eho(lyo lyoVar, lyo lyoVar2) {
        this.a = lyoVar;
        this.b = lyoVar2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        dn dnVar;
        super.onPageFinished(webView, str);
        lyo lyoVar = this.a;
        if (lyoVar != null) {
            dzo dzoVar = lyoVar.a;
            if (dzoVar.j) {
                return;
            }
            dzoVar.e = true;
            z4k z4kVar = dzoVar.h;
            if (z4kVar != null && (dnVar = (dn) ((lxo) z4kVar.b).b) != null) {
                dnVar.i();
            }
            dzoVar.j = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        upj.g(webView, renderProcessGoneDetail);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        lyo lyoVar = this.b;
        return lyoVar != null && lyoVar.a(string);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        lyo lyoVar = this.b;
        return lyoVar != null && lyoVar.a(str);
    }
}
