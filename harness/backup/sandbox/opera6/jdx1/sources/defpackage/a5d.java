package defpackage;

import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class a5d extends WebChromeClient {
    public final /* synthetic */ byte a;

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
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        switch (this.a) {
            case 0:
                if (consoleMessage == null || consoleMessage.message() == null) {
                    return false;
                }
                if (!consoleMessage.message().contains("Uncaught ReferenceError")) {
                    consoleMessage.message();
                    if (consoleMessage.sourceId() != null) {
                        new StringBuilder(" at ").append(consoleMessage.sourceId());
                    }
                    consoleMessage.lineNumber();
                }
                return true;
            default:
                return super.onConsoleMessage(consoleMessage);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.a) {
            case 0:
                jsResult.cancel();
                return true;
            default:
                return super.onJsConfirm(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        switch (this.a) {
            case 0:
                jsPromptResult.cancel();
                return true;
            default:
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    }
}
