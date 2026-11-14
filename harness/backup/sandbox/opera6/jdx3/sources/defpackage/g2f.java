package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ConditionVariable;
import java.util.Locale;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class g2f extends sgb {
    public final ConditionVariable k = new ConditionVariable();
    public Bitmap l;
    public final long m;
    public final Uri n;

    public g2f(Uri uri) {
        int currentConnectionType = NetworkChangeNotifier.isInitialized() ? NetworkChangeNotifier.getInstance().getCurrentConnectionType() : 0;
        this.m = Math.max(30000L, currentConnectionType != 3 ? currentConnectionType != 4 ? 15000L : 30000L : 60000L);
        this.n = uri;
    }

    public final void U(Bitmap bitmap, boolean z) {
        this.l = bitmap;
        this.k.open();
    }

    public final void u(int i) {
        String str;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i == 2) {
            str = "NETWORK_ERROR";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "RESPONSE_ERROR";
        }
        String.format(Locale.US, "ICON_URL: %s [%s]", this.n, str.concat(i == 3 ? ":0" : ""));
        super.u(i);
    }
}
