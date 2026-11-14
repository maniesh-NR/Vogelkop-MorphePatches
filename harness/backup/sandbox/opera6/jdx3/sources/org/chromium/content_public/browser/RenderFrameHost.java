package org.chromium.content_public.browser;

import defpackage.iz9;
import org.chromium.base.Callback;
import org.chromium.url.Origin;

/* loaded from: classes.dex */
public interface RenderFrameHost {

    public static final class WebAuthSecurityChecksResults {
        public final boolean a;
        public final int b;

        public WebAuthSecurityChecksResults(int i, boolean z) {
            this.b = i;
            this.a = z;
        }
    }

    void a(String str, Origin origin, boolean z, Callback callback);

    boolean b();

    iz9 c();

    Origin d();

    void e(String str, Origin origin, Callback callback);

    void f();

    void g();
}
