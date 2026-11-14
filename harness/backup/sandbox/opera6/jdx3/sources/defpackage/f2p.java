package defpackage;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes.dex */
public abstract class f2p extends WebView {
    public boolean a;

    public f2p(Context context) {
        super(context, null, 0);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        setFocusableInTouchMode(false);
        setWebChromeClient(tlp.c);
        setWebViewClient(tlp.d);
        setBackground(null);
        setLayerType(2, null);
        setOverScrollMode(1);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        settings.setUseWideViewPort(false);
        settings.setSupportMultipleWindows(false);
        settings.setSafeBrowsingEnabled(true);
        settings.setDomStorageEnabled(false);
        if (i <= 34) {
            settings.setDatabaseEnabled(false);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(2);
        settings.setNeedInitialFocus(false);
        addJavascriptInterface(new m2p(this), "operaNative");
    }

    public static final void b(f2p f2pVar) {
        super.destroy();
    }

    public final void a(long j) {
        this.a = true;
        xgh.g(this);
        setWebChromeClient(tlp.c);
        setWebViewClient(tlp.d);
        setWebViewRenderProcessClient(null);
        e();
        if (j <= 0) {
            super.destroy();
        } else {
            pfp.a.postDelayed(new ttn((Object) this, (byte) 21), j);
        }
    }

    public void c(boolean z) {
    }

    public void d() {
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        a(0L);
    }

    public void e() {
    }
}
