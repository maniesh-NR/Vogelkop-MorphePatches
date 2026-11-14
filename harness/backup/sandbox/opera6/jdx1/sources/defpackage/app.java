package defpackage;

import android.content.Context;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.internal.zzfe;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class app extends WebChromeClient {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zzfe b;
    public final /* synthetic */ ArrayList c;

    public app(Context context, zzfe zzfeVar, ArrayList arrayList) {
        this.a = context;
        this.b = zzfeVar;
        this.c = arrayList;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(this.a);
        webViewTransport.setWebView(webView2);
        webView2.setWebViewClient(new c5d(this, (byte) 5));
        message.sendToTarget();
        return true;
    }
}
