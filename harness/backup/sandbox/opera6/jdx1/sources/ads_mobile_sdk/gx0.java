package ads_mobile_sdk;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.hkm;

/* loaded from: classes.dex */
public final class gx0 extends WebChromeClient {
    public final ry0 a;
    public final d91 b;

    public gx0(ry0 ry0Var) {
        this.a = ry0Var;
        this.b = ry0Var.g;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        mt0 mt0Var;
        if (!(webView instanceof cy0) || (mt0Var = ((cy0) webView).o) == null) {
            return;
        }
        mt0Var.a(ev.c);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.message() == null) {
            return true;
        }
        defpackage.na2.B(this.a.c, null, null, new hkm(this, consoleMessage, null, (byte) 10), 3);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new c5d(this, (byte) 1));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        vr3 vr3Var = xu0.a;
        xu0.c("JavaScript alert() ignored: " + str2, null);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        vr3 vr3Var = xu0.a;
        xu0.c("JavaScript confirm() ignored: " + str2, null);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        vr3 vr3Var = xu0.a;
        xu0.c("JavaScript prompt() ignored: " + str2, null);
        jsPromptResult.cancel();
        return true;
    }
}
