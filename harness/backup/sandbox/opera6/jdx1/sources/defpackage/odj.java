package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class odj extends ConnectivityManager.NetworkCallback {
    public static final odj a = new odj();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listK0;
        qs7 qs7VarX = qs7.x();
        int i = q4o.a;
        qs7VarX.getClass();
        synchronized (b) {
            listK0 = CollectionsKt.k0(c.entrySet());
        }
        for (Map.Entry entry : listK0) {
            ((Function1) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? dp5.a : new ep5(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List listK0;
        qs7 qs7VarX = qs7.x();
        int i = q4o.a;
        qs7VarX.getClass();
        synchronized (b) {
            listK0 = CollectionsKt.k0(c.keySet());
        }
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(new ep5(7));
        }
    }
}
