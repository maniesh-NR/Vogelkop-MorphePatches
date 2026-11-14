package ads_mobile_sdk;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class x52 implements Runnable {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ String b;

    public x52(bw2 bw2Var, WebView webView, String str) {
        this.a = webView;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bw2.a(this.a, this.b);
    }
}
