package defpackage;

import ads_mobile_sdk.gx0;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.opera.ad.mraid.MRAIDView;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c5d extends WebViewClient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c5d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(WebView webView, int i, String str, String str2) {
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.onPageFinished(webView, str);
                MRAIDView mRAIDView = (MRAIDView) obj;
                if (mRAIDView.C == 0) {
                    mRAIDView.N = true;
                    mRAIDView.D("mraid.setPlacementType('inline');");
                    sko.w(6);
                    mRAIDView.u.evaluateJavascript("mraid.logLevel = mraid.LogLevelEnum.NONE;", new z4d((byte) 0));
                    if (mRAIDView.O) {
                        mRAIDView.z();
                        mRAIDView.y();
                        mRAIDView.w();
                        mRAIDView.x();
                        mRAIDView.C = (byte) 1;
                        mRAIDView.I();
                        mRAIDView.D("mraid.fireReadyEvent();");
                        if (mRAIDView.D) {
                            mRAIDView.J();
                        }
                    }
                }
                if (mRAIDView.R) {
                    mRAIDView.R = false;
                    mRAIDView.c0.post(new dnb(this, (byte) 18));
                    break;
                }
                break;
            case 1:
            case 2:
            case 5:
            default:
                super.onPageFinished(webView, str);
                break;
            case 3:
                t2p t2pVar = (t2p) obj;
                Context context = t2pVar.b;
                super.onPageFinished(webView, str);
                t2pVar.e.setImageDrawable((webView.canGoBack() ? bbp.LEFT_ARROW : bbp.UNLEFT_ARROW).d(context));
                t2pVar.f.setImageDrawable((webView.canGoForward() ? bbp.RIGHT_ARROW : bbp.UNRIGHT_ARROW).d(context));
                break;
            case 4:
                ito[] itoVarArr = ito.a;
                a3p a3pVar = (a3p) obj;
                boolean z = a3pVar.k;
                a3pVar.G = true;
                if (a3pVar.v == n2p.LOADING) {
                    StringBuilder sb = new StringBuilder("mraid.setPlacementType('");
                    sb.append(z ? "interstitial" : "inline");
                    sb.append("');");
                    a3pVar.g(sb.toString());
                    webView.evaluateJavascript("mraid.logLevel = mraid.LogLevelEnum.NONE;", new z4d((byte) 5));
                    if (a3pVar.H) {
                        a3pVar.y();
                        a3pVar.x();
                        a3pVar.v();
                        a3pVar.w();
                        if (z) {
                            a3pVar.l(null);
                        } else {
                            a3pVar.v = n2p.DEFAULT;
                            a3pVar.r();
                            a3pVar.g("mraid.fireReadyEvent();");
                            if (a3pVar.w) {
                                a3pVar.s();
                            }
                        }
                    }
                }
                if (a3pVar.L) {
                    a3pVar.L = false;
                    pfp.a(new wr9(a3pVar, webView, (byte) 25));
                }
                a3pVar.b();
                a3pVar.d.g(webView);
                t5p t5pVar = d1p.a;
                d1p.b(webView.getContext(), a3pVar.e0);
                break;
            case 6:
                "Finished loading WebView".concat(String.valueOf(str));
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.a) {
            case 3:
                super.onPageStarted(webView, str, bitmap);
                t2p t2pVar = (t2p) this.b;
                t2pVar.f.setImageDrawable(bbp.UNRIGHT_ARROW.d(t2pVar.b));
                break;
            case 6:
                "Started loading WebView".concat(String.valueOf(str));
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.a) {
            case 6:
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 4:
                Objects.toString(webResourceRequest.getUrl());
                Objects.toString(webResourceError.getDescription());
                ito[] itoVarArr = ito.a;
                if (!((a3p) this.b).n.contains(webResourceRequest.getUrl())) {
                    p8p.a(new acp(webResourceRequest, webResourceError));
                }
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.a) {
            case 4:
                Objects.toString(webResourceRequest.getUrl());
                webResourceResponse.getStatusCode();
                ito[] itoVarArr = ito.a;
                if (!((a3p) this.b).n.contains(webResourceRequest.getUrl())) {
                    p8p.a(new xcp(webResourceRequest, webResourceResponse));
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
            case 3:
                sslErrorHandler.cancel();
                break;
            case 4:
                Objects.toString(sslError);
                ito[] itoVarArr = ito.a;
                p8p.a(new rdp(sslError));
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.a) {
            case 0:
                upj.g(webView, renderProcessGoneDetail);
                return true;
            case 1:
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            case 2:
                upj.g(webView, renderProcessGoneDetail);
                return true;
            case 3:
                upj.g(webView, renderProcessGoneDetail);
                return true;
            case 4:
                ((a3p) this.b).d.a();
                p8p.a(new qep(webView, renderProcessGoneDetail));
                tlp.a(webView, renderProcessGoneDetail);
                return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        switch (this.a) {
            case 4:
                Objects.toString(webResourceRequest.getUrl());
                ito[] itoVarArr = ito.a;
                super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
                break;
            default:
                super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01f7  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r14, android.webkit.WebResourceRequest r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5d.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((gx0) obj).a.a(webResourceRequest.getUrl());
                return true;
            case 2:
                return ((plk) obj).g(webResourceRequest.getUrl().toString()) || super.shouldOverrideUrlLoading(webView, webResourceRequest);
            case 3:
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            case 4:
                a3p a3pVar = (a3p) obj;
                Uri url = webResourceRequest.getUrl();
                Objects.toString(url);
                ito[] itoVarArr = ito.a;
                try {
                    if (Intrinsics.a(url.getScheme(), "mraid")) {
                        a3pVar.k(url);
                    } else {
                        if (URLUtil.isNetworkUrl(url.toString())) {
                            Map map = a3p.h0;
                            if (Intrinsics.a(url.getHost(), "appassets.androidplatform.net")) {
                                if (!webResourceRequest.hasGesture()) {
                                    return false;
                                }
                                a3pVar.g0.set(true);
                                return false;
                            }
                        }
                        a3pVar.n(url.toString());
                    }
                } catch (Exception e) {
                    e.getMessage();
                    ito[] itoVarArr2 = ito.a;
                }
                return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1 A[Catch: Exception -> 0x0222, TryCatch #0 {Exception -> 0x0222, blocks: (B:89:0x01b7, B:91:0x01c1, B:92:0x01cd, B:94:0x01d7, B:100:0x01f4, B:97:0x01ed, B:101:0x0202, B:103:0x020c), top: B:110:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cd A[Catch: Exception -> 0x0222, TryCatch #0 {Exception -> 0x0222, blocks: (B:89:0x01b7, B:91:0x01c1, B:92:0x01cd, B:94:0x01d7, B:100:0x01f4, B:97:0x01ed, B:101:0x0202, B:103:0x020c), top: B:110:0x01b7 }] */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r21, java.lang.String r22) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5d.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
