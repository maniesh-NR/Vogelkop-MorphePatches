package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class qdp extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return;
        }
        t5p t5pVar = d1p.a;
        d1p.c(d1p.a(((b1p) this).a, networkCapabilities));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(@NonNull Network network) {
        d1p.c(d1p.a);
    }
}
