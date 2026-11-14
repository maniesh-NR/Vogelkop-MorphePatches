package defpackage;

import androidx.webkit.WebViewFeature;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface;

/* loaded from: classes.dex */
public final class oun implements WebViewNavigationClientBoundaryInterface {
    public final String[] getSupportedFeatures() {
        return new String[]{WebViewFeature.NAVIGATION_CALLBACK_BASIC};
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onFirstContentfulPaint(InvocationHandler invocationHandler) {
        dwf.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onNavigationCompleted(InvocationHandler invocationHandler) {
        kke.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onNavigationRedirected(InvocationHandler invocationHandler) {
        kke.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onNavigationStarted(InvocationHandler invocationHandler) {
        kke.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onPageDOMContentLoadedEventFired(InvocationHandler invocationHandler) {
        dwf.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onPageDeleted(InvocationHandler invocationHandler) {
        dwf.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onPageLoadEventFired(InvocationHandler invocationHandler) {
        dwf.a(invocationHandler);
        throw null;
    }
}
