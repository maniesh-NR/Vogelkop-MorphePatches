package defpackage;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface;

/* loaded from: classes.dex */
public final class mke implements WebViewNavigationListenerBoundaryInterface {
    public static final String[] a = {"WEB_VIEW_NAVIGATION_LISTENER_V1"};

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof mke)) {
            return false;
        }
        throw null;
    }

    public final String[] getSupportedFeatures() {
        return a;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onFirstContentfulPaint(InvocationHandler invocationHandler, long j) {
        dwf.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onNavigationCompleted(InvocationHandler invocationHandler) {
        kke.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onNavigationRedirected(InvocationHandler invocationHandler) {
        kke.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onNavigationStarted(InvocationHandler invocationHandler) {
        kke.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onPageDOMContentLoadedEventFired(InvocationHandler invocationHandler) {
        dwf.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onPageDeleted(InvocationHandler invocationHandler) {
        dwf.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onPageLoadEventFired(InvocationHandler invocationHandler) {
        dwf.a(invocationHandler);
        throw null;
    }
}
