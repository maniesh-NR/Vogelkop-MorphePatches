package defpackage;

import J.N;
import com.opera.android.browser.webauth.OperaWebAuthnCredentialsDelegateBridge;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class rpf {
    public final WebContents a;
    public final RenderFrameHost b;
    public final tu c;
    public boolean d;

    public rpf(WebContents webContents, RenderFrameHost renderFrameHost, tu tuVar) {
        this.a = webContents;
        this.b = renderFrameHost;
        this.c = tuVar;
        OperaWebAuthnCredentialsDelegateBridge.a.add(this);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        OperaWebAuthnCredentialsDelegateBridge.a.remove(this);
        N.M5laEdWk(this.a, this.b);
    }
}
