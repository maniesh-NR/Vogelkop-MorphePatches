package ads_mobile_sdk;

import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.c26;
import defpackage.cek;
import defpackage.drj;
import defpackage.fsg;
import defpackage.hkm;
import defpackage.pin;
import defpackage.sbl;
import defpackage.scd;
import defpackage.vkp;
import defpackage.zch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class ry0 extends WebViewClient {
    public final bl1 a;
    public final cy0 b;
    public final nx5 c;
    public final ax0 d;
    public final k8 e;
    public final qr0 f;
    public final d91 g;
    public final vkp h;
    public final ji i = new ji((Object) null, (Object) null);
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicInteger l = new AtomicInteger(0);
    public final ji m = new ji((Object) null, (Object) null);
    public final ji n;
    public final ji o;
    public final ji p;
    public hr1 q;
    public wr3 r;
    public final ji s;
    public final AtomicBoolean t;
    public volatile jz2 u;
    public static final /* synthetic */ xtb[] w = {zch.b(ry0.class, "loadedDeferred", "getLoadedDeferred()Lkotlinx/coroutines/CompletableDeferred;"), zch.b(ry0.class, "encounteredError", "getEncounteredError()Lcom/google/android/libraries/ads/mobile/sdk/internal/util/GmaResult$WebError;"), zch.b(ry0.class, "followUrls", "getFollowUrls()Z"), zch.b(ry0.class, "isCrossProcessAdEnabled", "isCrossProcessAdEnabled()Z"), zch.b(ry0.class, "adEventEmitter", "getAdEventEmitter()Lcom/google/android/libraries/ads/mobile/sdk/internal/event/InternalAdEventListener;"), zch.b(ry0.class, "onJavascriptReadyListener", "getOnJavascriptReadyListener()Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/JavascriptReadyListener;")};
    public static final drj v = new drj((byte) 13);

    public ry0(bl1 bl1Var, cy0 cy0Var, nx5 nx5Var, ax0 ax0Var, k8 k8Var, qr0 qr0Var, d91 d91Var, vkp vkpVar) {
        this.a = bl1Var;
        this.b = cy0Var;
        this.c = nx5Var;
        this.d = ax0Var;
        this.e = k8Var;
        this.f = qr0Var;
        this.g = d91Var;
        this.h = vkpVar;
        Boolean bool = Boolean.FALSE;
        this.n = new ji((Object) null, bool);
        this.o = new ji((Object) null, bool);
        this.p = new ji((Object) null, (Object) null);
        this.s = new ji((Object) null, (Object) null);
        this.t = new AtomicBoolean(false);
    }

    public final void a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(this.e.a(uri, this.b));
        jz2 jz2Var = this.u;
        byte b = 0;
        byte b2 = 3;
        mt5 mt5Var = null;
        if (jz2Var != null && !jz2Var.a()) {
            defpackage.na2.B(this.c, null, null, new ey0(this, uri, mt5Var, b), 3);
            return;
        }
        if (this.d.a(intent)) {
            if (!this.t.getAndSet(true)) {
                defpackage.na2.B(this.c, h.a, null, new fsg(new pin(this, uri, mt5Var, b2), mt5Var, b2), 2);
            }
            ji jiVar = this.o;
            xtb xtbVar = w[3];
            if (((Boolean) jiVar.getValue(this)).booleanValue()) {
                defpackage.na2.B(this.c, h.a, null, new fsg(new gy0(this, mt5Var, b), mt5Var, b2), 2);
            }
        }
    }

    public final void d() {
        xtb[] xtbVarArr = w;
        xtb xtbVar = xtbVarArr[1];
        jv0 jv0Var = (jv0) this.m.getValue(this);
        ji jiVar = this.i;
        if (jv0Var != null) {
            xtb xtbVar2 = xtbVarArr[0];
            cd5 cd5Var = (bd5) jiVar.getValue(this);
            if (cd5Var != null) {
                cd5Var.j0(jv0Var);
            }
            jiVar.setValue(xtbVarArr[0], null);
            return;
        }
        if (this.b.k.get()) {
            kv0 kv0Var = kv0.c;
            xtb xtbVar3 = xtbVarArr[0];
            cd5 cd5Var2 = (bd5) jiVar.getValue(this);
            if (cd5Var2 != null) {
                cd5Var2.j0(kv0Var);
            }
            jiVar.setValue(xtbVarArr[0], null);
            return;
        }
        if (this.k.get()) {
            kv0 kv0Var2 = kv0.c;
            xtb xtbVar4 = xtbVarArr[0];
            cd5 cd5Var3 = (bd5) jiVar.getValue(this);
            if (cd5Var3 != null) {
                cd5Var3.j0(kv0Var2);
            }
            jiVar.setValue(xtbVarArr[0], null);
            return;
        }
        if (!this.j.get() || this.l.get() > 0) {
            return;
        }
        hv0 hv0Var = new hv0(Unit.a);
        xtb xtbVar5 = xtbVarArr[0];
        cd5 cd5Var4 = (bd5) jiVar.getValue(this);
        if (cd5Var4 != null) {
            cd5Var4.j0(hv0Var);
        }
        jiVar.setValue(xtbVarArr[0], null);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Uri uri = Uri.parse(str);
        v.getClass();
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            c26.K(new ey0(this, uri, null, (byte) 1));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.j.set(true);
        xtb xtbVar = w[5];
        ty1 ty1Var = (ty1) this.s.getValue(this);
        byte b = 2;
        mt5 mt5Var = null;
        if (ty1Var != null) {
            c26.K(new aq1(ty1Var.a, ty1Var.b, mt5Var, b));
        }
        d();
        if (this.b.k.get()) {
            gy0 gy0Var = new gy0(this, mt5Var, b);
            defpackage.na2.B(this.c, h.a, null, new fsg(gy0Var, mt5Var, (byte) 3), 2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        jv0 jv0Var = new jv0(i, str, str2);
        this.m.setValue(w[1], jv0Var);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean zDidCrash = renderProcessGoneDetail.didCrash();
        int iRendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        cy0 cy0Var = this.b;
        ViewParent parent = cy0Var.getParent();
        mt5 mt5Var = null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(cy0Var);
        }
        xh3.a(cy0Var.b, new by0(cy0Var, mt5Var, (byte) 7));
        xh3.a(cy0Var.c, new by0(cy0Var, mt5Var, (byte) 8));
        StringBuilder sb = new StringBuilder("WebView render process gone. Crashed? ");
        sb.append(zDidCrash);
        String strN = rfp.n(iRendererPriorityAtExit, " Priority? ", sb);
        cy0Var.e.a(strN, (Throwable) new Exception(strN));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse;
        mt5 mt5Var = null;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null) {
            return null;
        }
        ry0 ry0Var = this;
        WebResourceRequest webResourceRequest2 = webResourceRequest;
        Uri uri = url;
        defpackage.na2.B(ry0Var.c, null, null, new ly0(url, webResourceRequest2, ry0Var, mt5Var, (byte) 0), 3);
        hr1 hr1Var = ry0Var.q;
        if (hr1Var != null) {
            cek cekVar = new cek((Object) hr1Var, (Object) ry0Var, (Object) webResourceRequest2, mt5Var, (byte) 22);
            ry0Var = ry0Var;
            webResourceRequest2 = webResourceRequest2;
            webResourceResponse = (WebResourceResponse) scd.g0(h.a, cekVar);
        } else {
            webResourceResponse = null;
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        qr0 qr0Var = ry0Var.f;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads_analytics_events_via_webview_requests", Boolean.FALSE, fo.a)).booleanValue()) {
            return (WebResourceResponse) scd.g0(h.a, new ly0(uri, webResourceRequest2, ry0Var, mt5Var, (byte) 1));
        }
        return (WebResourceResponse) scd.g0(h.a, new sbl(uri, webResourceRequest2, ry0Var, (mt5) null));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        drj drjVar = v;
        Uri url = webResourceRequest.getUrl();
        drjVar.getClass();
        byte b = 1;
        mt5 mt5Var = null;
        if ("gmsg".equalsIgnoreCase(url.getScheme()) && "mobileads.google.com".equalsIgnoreCase(url.getHost())) {
            c26.K(new ey0(this, webResourceRequest.getUrl(), mt5Var, b));
            return true;
        }
        ji jiVar = this.n;
        xtb xtbVar = w[2];
        if (((Boolean) jiVar.getValue(this)).booleanValue()) {
            Uri url2 = webResourceRequest.getUrl();
            if (kotlin.text.c.m(url2.getScheme(), "http", true) || kotlin.text.c.m(url2.getScheme(), "https", true)) {
                jz2 jz2Var = this.u;
                if (jz2Var != null && !jz2Var.a()) {
                    defpackage.na2.B(this.c, null, null, new hkm(this, webResourceRequest, mt5Var, (byte) 29), 3);
                    return true;
                }
                if (!this.t.getAndSet(true)) {
                    xh3.a(this.c, new pin(this, webResourceRequest, mt5Var, (byte) 7));
                }
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
        }
        if (!this.b.willNotDraw()) {
            a(webResourceRequest.getUrl());
            return true;
        }
        vr3 vr3Var = xu0.a;
        xu0.b("Non-creative WebView unable to handle URL: " + webResourceRequest.getUrl(), null);
        return true;
    }
}
