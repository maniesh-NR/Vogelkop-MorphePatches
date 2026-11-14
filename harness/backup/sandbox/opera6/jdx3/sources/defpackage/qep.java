package defpackage;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class qep extends p8p {

    @NotNull
    public static final nep Companion = new nep();
    public final String g;
    public final boolean h;
    public final int i;

    public qep(int i, int i2, String str, boolean z) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, mep.b);
            throw null;
        }
        this.g = str;
        this.h = z;
        this.i = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qep(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        super("wv_rpg");
        String url = webView.getUrl();
        boolean zDidCrash = renderProcessGoneDetail.didCrash();
        int iRendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        urj urjVar = wlp.b;
        this.g = url;
        this.h = zDidCrash;
        this.i = iRendererPriorityAtExit;
    }
}
