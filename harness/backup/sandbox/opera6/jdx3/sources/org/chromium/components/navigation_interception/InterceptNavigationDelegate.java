package org.chromium.components.navigation_interception;

import defpackage.d23;
import defpackage.wa;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* loaded from: classes.dex */
public abstract class InterceptNavigationDelegate {
    public static final HashMap a = new HashMap();

    public static void destroyFromNative(long j) {
        a.remove(Long.valueOf(j));
    }

    public static InterceptNavigationDelegate get(long j) {
        WeakReference weakReference = (WeakReference) a.get(Long.valueOf(j));
        if (weakReference != null) {
            return (InterceptNavigationDelegate) weakReference.get();
        }
        return null;
    }

    public abstract void a(NavigationHandle navigationHandle, GURL gurl, boolean z, boolean z2, boolean z3, boolean z4, d23 d23Var);

    public final void associateNative(long j) {
        a.put(Long.valueOf(j), new WeakReference(this));
    }

    public final void callShouldIgnoreNavigation(NavigationHandle navigationHandle, GURL gurl, boolean z, boolean z2, boolean z3) {
        a(navigationHandle, gurl, z, z2, z3, false, new d23(new wa(navigationHandle, (byte) 16), (byte) 2));
    }

    public GURL handleSubframeExternalProtocol(GURL gurl, int i, boolean z, Origin origin) {
        return null;
    }

    public void onResourceRequestWithGesture() {
    }

    public void requestFinishPendingShouldIgnoreCheck() {
    }
}
