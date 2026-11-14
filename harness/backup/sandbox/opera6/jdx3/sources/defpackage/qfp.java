package defpackage;

import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class qfp extends p8p {

    @NotNull
    public static final ofp Companion = new ofp();
    public final String g;

    public qfp(int i, String str) {
        if (1 == (i & 1)) {
            this.g = str;
        } else {
            x7d.I(i, 1, nfp.b);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfp(WebView webView) {
        super("wv_rpu");
        String url = webView.getUrl();
        urj urjVar = wlp.b;
        this.g = url;
    }
}
