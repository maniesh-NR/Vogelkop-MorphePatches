package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class acp extends p8p {

    @NotNull
    public static final zbp Companion = new zbp();
    public final String g;
    public final boolean h;
    public final int i;

    public acp(int i, int i2, String str, boolean z) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, ybp.b);
            throw null;
        }
        this.g = str;
        this.h = z;
        this.i = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acp(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super("wv_error");
        String string = webResourceRequest.getUrl().toString();
        boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
        int errorCode = webResourceError.getErrorCode();
        urj urjVar = wlp.b;
        this.g = string;
        this.h = zIsForMainFrame;
        this.i = errorCode;
    }
}
