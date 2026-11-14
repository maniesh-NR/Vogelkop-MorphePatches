package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import defpackage.bli;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1qSDK extends AFi1pSDK {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Network;", "p0", "Landroid/net/NetworkInfo;", "x_", "(Landroid/net/Network;)Landroid/net/NetworkInfo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFi1qSDK$1, reason: invalid class name */
    static final class AnonymousClass1 extends ozb implements Function1<Network, NetworkInfo> {
        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: x_, reason: merged with bridge method [inline-methods] */
        public final NetworkInfo invoke(Network network) {
            return AFi1qSDK.this.getMediationNetwork.getNetworkInfo(network);
        }
    }

    public AFi1qSDK(@NotNull Context context) {
        super(context);
    }

    private static boolean w_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final boolean getMonetizationNetwork() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.getMediationNetwork;
            if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Network network : allNetworks) {
                    NetworkCapabilities networkCapabilities = this.getMediationNetwork.getNetworkCapabilities(network);
                    if (networkCapabilities != null) {
                        arrayList.add(networkCapabilities);
                    }
                }
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (w_((NetworkCapabilities) obj)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception e) {
            AFLogger.afErrorLog("Failed collecting ivc data", e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    @NotNull
    public final String getRevenue() {
        Network[] allNetworks;
        Sequence sequenceM;
        Object next;
        ConnectivityManager connectivityManager = this.getMediationNetwork;
        if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null || (sequenceM = e82.m(allNetworks)) == null) {
            return "unknown";
        }
        u39 u39Var = new u39(new v39(new m2m(sequenceM, new AnonymousClass1()), false, new bli((byte) 13)));
        while (true) {
            if (!u39Var.hasNext()) {
                next = null;
                break;
            }
            next = u39Var.next();
            if (AFi1pSDK.v_((NetworkInfo) next)) {
                break;
            }
        }
        NetworkInfo networkInfo = (NetworkInfo) next;
        if (networkInfo == null) {
            return "unknown";
        }
        int type = networkInfo.getType();
        return type != 0 ? type == 1 ? "WIFI" : "unknown" : "MOBILE";
    }
}
