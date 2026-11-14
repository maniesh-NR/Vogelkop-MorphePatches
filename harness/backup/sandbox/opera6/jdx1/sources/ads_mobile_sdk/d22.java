package ads_mobile_sdk;

import android.net.Network;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class d22 extends ozb implements Function0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Network b;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d22(long j, Network network, byte b) {
        super(0);
        this.i = b;
        this.a = j;
        this.b = network;
    }

    public final Object invoke() {
        byte b = this.i;
        Network network = this.b;
        long j = this.a;
        switch (b) {
            case 0:
                return "Network available at " + pn7.q(j) + ": " + network;
            default:
                return "Network lost at " + pn7.q(j) + ": " + network;
        }
    }
}
