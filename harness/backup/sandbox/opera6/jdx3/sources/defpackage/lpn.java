package defpackage;

import J.N;
import android.net.Uri;
import com.opera.android.browser.WebContentsWrapper;
import kotlin.text.StringsKt;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class lpn extends rtn {
    public final rpn c;
    public final Uri d;
    public boolean e;

    public lpn(WebContentsWrapper webContentsWrapper, rpn rpnVar, Uri uri) {
        super(webContentsWrapper);
        this.c = rpnVar;
        this.d = uri;
        this.e = true;
    }

    public final void titleWasSet(String str) {
        Object value;
        qpn qpnVar;
        WebContents webContentsF;
        String strN;
        if (this.e) {
            this.e = false;
            return;
        }
        WebContentsWrapper webContentsWrapper = this.b;
        String str2 = null;
        if (webContentsWrapper.j) {
            webContentsWrapper = null;
        }
        if (webContentsWrapper != null && (webContentsF = webContentsWrapper.f()) != null) {
            GURL gurlP = webContentsF.p();
            String authority = this.d.getAuthority();
            gurlP.getClass();
            if (!N.MstQ1QcZ(gurlP, authority)) {
                webContentsF = null;
            }
            if (webContentsF != null && (strN = webContentsF.n()) != null && !StringsKt.N(strN)) {
                str2 = strN;
            }
        }
        pxh rxhVar = str2 == null ? new rxh(2132022371) : new qxh(str2);
        nak nakVar = this.c.b;
        do {
            value = nakVar.getValue();
            qpnVar = (qpn) value;
        } while (!nakVar.h(value, qpn.a(qpnVar, new ptl(rxhVar, qpnVar.a.b), false, null, false, 14)));
    }
}
