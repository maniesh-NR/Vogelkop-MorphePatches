package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class xcp extends p8p {

    @NotNull
    public static final wcp Companion = new wcp();
    public final String g;
    public final boolean h;
    public final int i;

    public xcp(int i, int i2, String str, boolean z) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, vcp.b);
            throw null;
        }
        this.g = str;
        this.h = z;
        this.i = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcp(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super("wv_http_error");
        String string = webResourceRequest.getUrl().toString();
        boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
        int statusCode = webResourceResponse.getStatusCode();
        urj urjVar = wlp.b;
        this.g = string;
        this.h = zIsForMainFrame;
        this.i = statusCode;
    }
}
