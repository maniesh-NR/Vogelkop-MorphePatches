package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class qm5 implements pm5 {
    public final ConnectivityManager b;

    public qm5(ConnectivityManager connectivityManager) {
        this.b = connectivityManager;
    }

    @Override // defpackage.pm5
    public final boolean a() {
        ConnectivityManager connectivityManager = this.b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
