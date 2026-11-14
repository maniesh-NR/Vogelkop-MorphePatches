package defpackage;

import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class pz4 extends InterceptNavigationDelegate {
    public final /* synthetic */ rz4 b;

    public pz4(rz4 rz4Var) {
        this.b = rz4Var;
    }

    @Override // org.chromium.components.navigation_interception.InterceptNavigationDelegate
    public final void a(NavigationHandle navigationHandle, GURL gurl, boolean z, boolean z2, boolean z3, boolean z4, d23 d23Var) {
        d23Var.c(Boolean.valueOf(this.b.E0(navigationHandle, gurl, z, z2)));
    }
}
