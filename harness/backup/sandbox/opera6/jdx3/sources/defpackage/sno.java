package defpackage;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class sno extends WebViewClient {
    public final /* synthetic */ byte a;
    public final WebViewClient b;

    public /* synthetic */ sno(WebViewClient webViewClient, byte b) {
        this.a = b;
        this.b = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        switch (this.a) {
            case 0:
                this.b.doUpdateVisitedHistory(webView, str, z);
                break;
            default:
                this.b.doUpdateVisitedHistory(webView, str, z);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        switch (this.a) {
            case 0:
                this.b.onFormResubmission(webView, message, message2);
                break;
            default:
                this.b.onFormResubmission(webView, message, message2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        switch (this.a) {
            case 0:
                this.b.onLoadResource(webView, str);
                break;
            default:
                this.b.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        switch (this.a) {
            case 0:
                this.b.onPageCommitVisible(webView, str);
                break;
            default:
                this.b.onPageCommitVisible(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                this.b.onPageFinished(webView, str);
                break;
            default:
                this.b.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.a) {
            case 0:
                this.b.onPageStarted(webView, str, bitmap);
                break;
            default:
                this.b.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        switch (this.a) {
            case 0:
                this.b.onReceivedClientCertRequest(webView, clientCertRequest);
                break;
            default:
                this.b.onReceivedClientCertRequest(webView, clientCertRequest);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.a) {
            case 0:
                this.b.onReceivedError(webView, i, str, str2);
                break;
            default:
                this.b.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 0:
                this.b.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
            default:
                this.b.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        switch (this.a) {
            case 0:
                this.b.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
            default:
                this.b.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.a) {
            case 0:
                this.b.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
            default:
                this.b.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        switch (this.a) {
            case 0:
                this.b.onReceivedLoginRequest(webView, str, str2, str3);
                break;
            default:
                this.b.onReceivedLoginRequest(webView, str, str2, str3);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
            case 0:
                this.b.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
            default:
                this.b.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.a) {
        }
        return this.b.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        switch (this.a) {
            case 0:
                this.b.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
                break;
            default:
                this.b.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        switch (this.a) {
            case 0:
                this.b.onScaleChanged(webView, f, f2);
                break;
            default:
                this.b.onScaleChanged(webView, f, f2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                this.b.onUnhandledKeyEvent(webView, keyEvent);
                break;
            default:
                this.b.onUnhandledKeyEvent(webView, keyEvent);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
        }
        return this.b.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        switch (this.a) {
        }
        return this.b.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (this.a) {
        }
        return this.b.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        byte b = this.a;
        WebViewClient webViewClient = this.b;
        switch (b) {
            case 0:
                if (!aoh.d(webResourceRequest.getUrl().toString())) {
                    break;
                }
                break;
            default:
                if (!xih.b(webResourceRequest.getUrl().toString())) {
                    break;
                }
                break;
        }
        return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 0:
                if (!aoh.d(str)) {
                    break;
                }
                break;
            default:
                if (!xih.b(str)) {
                    break;
                }
                break;
        }
        return this.b.shouldOverrideUrlLoading(webView, str);
    }
}
