package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class wne extends ProxySelector {
    public final ProxySelector a = ProxySelector.getDefault();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        try {
            return this.a.select(uri);
        } catch (IllegalArgumentException unused) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
    }
}
