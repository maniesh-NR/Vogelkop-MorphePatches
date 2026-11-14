package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.leanplum.internal.RequestBuilder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class na extends WebViewClient {
    public myn a;
    public ayn b;

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        otb otbVar = otb.d;
        String str2 = ((hzc) otbVar).b;
        eaj eajVar = eaj.b;
        if (((hzc) otbVar).a.a.compareTo(eajVar) <= 0) {
            otbVar.b(eajVar, str2, sko.j("doUpdateVisitedHistory: ", str), (Throwable) null);
        }
        super.doUpdateVisitedHistory(webView, str, z);
        ayn aynVar = this.b;
        if (aynVar == null) {
            aynVar = null;
        }
        aynVar.d.setValue(Boolean.valueOf(webView.canGoBack()));
        ayn aynVar2 = this.b;
        (aynVar2 != null ? aynVar2 : null).e.setValue(Boolean.valueOf(webView.canGoForward()));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        otb otbVar = otb.d;
        String str2 = ((hzc) otbVar).b;
        eaj eajVar = eaj.b;
        if (((hzc) otbVar).a.a.compareTo(eajVar) <= 0) {
            otbVar.b(eajVar, str2, sko.j("onPageFinished: ", str), (Throwable) null);
        }
        myn mynVar = this.a;
        if (mynVar == null) {
            mynVar = null;
        }
        mynVar.c.setValue(htc.a);
        myn mynVar2 = this.a;
        (mynVar2 != null ? mynVar2 : null).a.setValue(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        otb otbVar = otb.d;
        String str2 = ((hzc) otbVar).b;
        eaj eajVar = eaj.b;
        if (((hzc) otbVar).a.a.compareTo(eajVar) <= 0) {
            otbVar.b(eajVar, str2, sko.j("onPageStarted: ", str), (Throwable) null);
        }
        myn mynVar = this.a;
        if (mynVar == null) {
            mynVar = null;
        }
        mynVar.c.setValue(new jtc(0.0f));
        myn mynVar2 = this.a;
        if (mynVar2 == null) {
            mynVar2 = null;
        }
        mynVar2.e.clear();
        myn mynVar3 = this.a;
        if (mynVar3 == null) {
            mynVar3 = null;
        }
        mynVar3.d.setValue((Object) null);
        myn mynVar4 = this.a;
        if (mynVar4 == null) {
            mynVar4 = null;
        }
        mynVar4.a.setValue(str);
        myn mynVar5 = this.a;
        if (mynVar5 == null) {
            mynVar5 = null;
        }
        mynVar5.b().getClass();
        myn mynVar6 = this.a;
        if (mynVar6 == null) {
            mynVar6 = null;
        }
        mynVar6.b().getClass();
        ayn aynVar = this.b;
        ayn aynVar2 = aynVar != null ? aynVar : null;
        na2.B(aynVar2.a, (CoroutineContext) null, (rx5) null, new cek(aynVar2, "var meta = document.createElement('meta');meta.setAttribute('name', 'viewport');meta.setAttribute('content', 'width=device-width, initial-scale=1.0, maximum-scale=10.0, minimum-scale=0.1,user-scalable=yes');document.getElementsByTagName('head')[0].appendChild(meta);", (Object) null, (mt5) null, (byte) 9), 3);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        otb otbVar = otb.d;
        String str = ((hzc) otbVar).b;
        eaj eajVar = eaj.e;
        if (((hzc) otbVar).a.a.compareTo(eajVar) <= 0) {
            otbVar.b(eajVar, str, "onReceivedError: " + ((Object) (webResourceError != null ? webResourceError.getDescription() : null)), (Throwable) null);
        }
        if (webResourceError != null) {
            myn mynVar = this.a;
            (mynVar != null ? mynVar : null).e.add(new xwn(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest != null ? webResourceRequest.isForMainFrame() : false));
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        otb otbVar = otb.d;
        String str = ((hzc) otbVar).b;
        eaj eajVar = eaj.b;
        if (((hzc) otbVar).a.a.compareTo(eajVar) <= 0) {
            otbVar.b(eajVar, str, fki.p(url, "Intercepting request for URL: "), (Throwable) null);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String method;
        otb otbVar = otb.d;
        String str = ((hzc) otbVar).b;
        eaj eajVar = eaj.b;
        if (((hzc) otbVar).a.a.compareTo(eajVar) <= 0) {
            if (webResourceRequest != null) {
                url = webResourceRequest.getUrl();
                boolValueOf = Boolean.valueOf(webResourceRequest.isForMainFrame());
                boolValueOf2 = Boolean.valueOf(webResourceRequest.isRedirect());
                method = webResourceRequest.getMethod();
            } else {
                url = null;
                boolValueOf = null;
                boolValueOf2 = null;
                method = null;
            }
            otbVar.b(eajVar, str, "shouldOverrideUrlLoading: " + url + " " + boolValueOf + " " + boolValueOf2 + " " + method, (Throwable) null);
        }
        if (webResourceRequest != null) {
            ayn aynVar = this.b;
            if (aynVar == null) {
                aynVar = null;
            }
            if (aynVar.b != null) {
                boolean zIsRedirect = webResourceRequest.isRedirect();
                String string = webResourceRequest.getUrl().toString();
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                LinkedHashMap linkedHashMap = requestHeaders != null ? new LinkedHashMap(requestHeaders) : new LinkedHashMap();
                boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
                String method2 = webResourceRequest.getMethod();
                if (method2 == null) {
                    method2 = RequestBuilder.GET;
                }
                fvn fvnVar = new fvn(string, linkedHashMap, zIsForMainFrame, zIsRedirect, method2);
                ayn aynVar2 = this.b;
                Object obj = ((Boolean) ((Function1) (aynVar2 != null ? aynVar2 : null).b.b).invoke(fvnVar)).booleanValue() ? gvn.a : hvn.a;
                if (obj instanceof gvn) {
                    return false;
                }
                if (obj instanceof hvn) {
                    return true;
                }
                h9o.p();
                return false;
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
