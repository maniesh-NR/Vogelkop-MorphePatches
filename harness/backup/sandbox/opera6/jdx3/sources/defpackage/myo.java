package defpackage;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class myo extends WebChromeClient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ myo(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        switch (this.a) {
            case 1:
                return (Bitmap) tlp.b.getValue();
            default:
                return super.getDefaultVideoPoster();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        switch (this.a) {
            case 1:
                if (callback != null) {
                    callback.invoke(str, ((a3p) this.b).h, false);
                    break;
                }
                break;
            default:
                super.onGeolocationPermissionsShowPrompt(str, callback);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.a) {
            case 0:
                jsResult.confirm();
                return true;
            default:
                ito[] itoVarArr = ito.a;
                return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.a) {
            case 0:
                jsResult.confirm();
                return true;
            default:
                return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.a) {
            case 0:
                jsResult.confirm();
                break;
            default:
                ito[] itoVarArr = ito.a;
                jsResult.cancel();
                break;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        switch (this.a) {
            case 0:
                jsPromptResult.confirm();
                break;
            default:
                ito[] itoVarArr = ito.a;
                jsPromptResult.cancel();
                break;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        switch (this.a) {
            case 0:
                super.onProgressChanged(webView, i);
                nyo nyoVar = (nyo) this.b;
                nyoVar.d = System.currentTimeMillis();
                if (!nyoVar.e && !((Boolean) sjo.b.a()).booleanValue() && i >= 50) {
                    webView.loadUrl("javascript:function onExportPageLoaded() {    window.location = 'operaadx://FINISHED';}window.addEventListener('load', function() {    onExportPageLoaded();}, false);");
                    nyoVar.e = true;
                    break;
                }
                break;
            default:
                super.onProgressChanged(webView, i);
                break;
        }
    }
}
