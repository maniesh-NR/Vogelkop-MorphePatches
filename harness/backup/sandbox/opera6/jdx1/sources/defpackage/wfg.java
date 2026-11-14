package defpackage;

import J.N;
import android.content.Context;
import com.opera.android.browser.obml.Platform;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final /* synthetic */ class wfg implements NetworkChangeNotifier.ConnectionTypeObserver {
    public final void onConnectionTypeChanged(int i) {
        Context context = Platform.a;
        N.M8lbHk_P(true, true, i != 6, i == 3 || i == 4 || i == 5 || i == 8);
    }
}
