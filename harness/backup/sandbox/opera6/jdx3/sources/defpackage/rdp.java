package defpackage;

import android.net.http.SslError;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class rdp extends p8p {

    @NotNull
    public static final pdp Companion = new pdp();
    public final String g;
    public final int h;

    public rdp(int i, String str, int i2) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, odp.b);
            throw null;
        }
        this.g = str;
        this.h = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdp(SslError sslError) {
        super("wv_ssl_error");
        String url = sslError.getUrl();
        int primaryError = sslError.getPrimaryError();
        urj urjVar = wlp.b;
        this.g = url;
        this.h = primaryError;
    }
}
