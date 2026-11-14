package defpackage;

import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public abstract class sle {
    public static rle a(NetworkChangeNotifier.ConnectionTypeObserver connectionTypeObserver) {
        b();
        return new rle(connectionTypeObserver);
    }

    public static void b() {
        if (NetworkChangeNotifier.isInitialized()) {
            return;
        }
        NetworkChangeNotifier.init();
        NetworkChangeNotifier.setAutoDetectConnectivityState(true);
    }

    public static int c() {
        b();
        return NetworkChangeNotifier.getInstance().getCurrentConnectionType();
    }

    public static boolean d() {
        b();
        return NetworkChangeNotifier.isOnline();
    }
}
