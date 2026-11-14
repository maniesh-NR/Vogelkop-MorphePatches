package defpackage;

import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class rle {
    public final NetworkChangeNotifier.ConnectionTypeObserver a;

    public rle(NetworkChangeNotifier.ConnectionTypeObserver connectionTypeObserver) {
        this.a = connectionTypeObserver;
        NetworkChangeNotifier.addConnectionTypeObserver(connectionTypeObserver);
    }
}
