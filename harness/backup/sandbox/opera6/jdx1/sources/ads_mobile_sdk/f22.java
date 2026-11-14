package ads_mobile_sdk;

import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class f22 extends ozb implements Function0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Network b;
    public final /* synthetic */ NetworkCapabilities c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f22(long j, Network network, NetworkCapabilities networkCapabilities) {
        super(0);
        this.a = j;
        this.b = network;
        this.c = networkCapabilities;
    }

    public final Object invoke() {
        return "Network capabilities changed at " + pn7.q(this.a) + ": " + this.b + " " + this.c;
    }
}
