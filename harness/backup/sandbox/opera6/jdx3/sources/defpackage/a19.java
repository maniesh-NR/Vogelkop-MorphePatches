package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class a19 extends ma {
    public final hda d;

    public a19(hda hdaVar) {
        this.d = hdaVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.d.invoke(valueCallback, fileChooserParams.createIntent());
        return true;
    }
}
