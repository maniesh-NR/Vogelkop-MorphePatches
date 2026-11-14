package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class ma extends WebChromeClient {
    public myn a;
    public Context b;
    public String c = "";

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        myn mynVar = this.a;
        if (mynVar == null) {
            mynVar = null;
        }
        ghg ghgVar = mynVar.b().b;
        return super.getDefaultVideoPoster();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPermissionRequest(android.webkit.PermissionRequest r15) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma.onPermissionRequest(android.webkit.PermissionRequest):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        myn mynVar = this.a;
        if (mynVar == null) {
            mynVar = null;
        }
        if ((mynVar.a() instanceof htc) && Intrinsics.a(webView.getUrl(), this.c)) {
            return;
        }
        myn mynVar2 = this.a;
        (mynVar2 != null ? mynVar2 : null).c.setValue(i == 100 ? htc.a : new jtc(i / 100.0f));
        String url = webView.getUrl();
        if (url == null) {
            url = "";
        }
        this.c = url;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        otb otbVar = otb.d;
        String str2 = ((hzc) otbVar).b;
        eaj eajVar = eaj.b;
        if (((hzc) otbVar).a.a.compareTo(eajVar) <= 0) {
            otbVar.b(eajVar, str2, p3p.w("onReceivedTitle: ", str, " url:", webView.getUrl()), (Throwable) null);
        }
        myn mynVar = this.a;
        if (mynVar == null) {
            mynVar = null;
        }
        mynVar.d.setValue(str);
        myn mynVar2 = this.a;
        myn mynVar3 = mynVar2 != null ? mynVar2 : null;
        String url = webView.getUrl();
        if (url == null) {
            url = "";
        }
        mynVar3.a.setValue(url);
    }
}
