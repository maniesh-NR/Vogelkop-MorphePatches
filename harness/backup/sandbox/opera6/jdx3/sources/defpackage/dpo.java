package defpackage;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class dpo extends sxo {
    public final WebView d;

    public dpo(WebView webView, String str, mzo mzoVar) {
        super(webView, str, mzoVar);
        this.d = webView;
    }

    @Override // defpackage.sxo
    public final void b() {
    }

    @Override // defpackage.sxo
    public final void c() {
        this.d.evaluateJavascript("window.__operaOm && window.__operaOm.impression();", null);
    }
}
