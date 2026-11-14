package defpackage;

import android.webkit.WebView;
import androidx.webkit.WebViewStartUpConfig;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public final class eyn implements dyn {
    public final WebViewProviderFactoryBoundaryInterface a;

    public eyn(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // defpackage.dyn
    public final void a(WebViewStartUpConfig webViewStartUpConfig, r2n r2nVar) {
        this.a.startUpWebView(new er3(new bxk(webViewStartUpConfig, (byte) 14)), new er3(new lyn(r2nVar)));
    }

    @Override // defpackage.dyn
    public final String[] b() {
        return this.a.getSupportedFeatures();
    }

    @Override // defpackage.dyn
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) fr3.m(WebViewProviderBoundaryInterface.class, this.a.createWebView(webView));
    }

    @Override // defpackage.dyn
    public final ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) fr3.m(ProfileStoreBoundaryInterface.class, this.a.getProfileStore());
    }

    @Override // defpackage.dyn
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) fr3.m(StaticsBoundaryInterface.class, this.a.getStatics());
    }

    @Override // defpackage.dyn
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) fr3.m(WebkitToCompatConverterBoundaryInterface.class, this.a.getWebkitToCompatConverter());
    }
}
