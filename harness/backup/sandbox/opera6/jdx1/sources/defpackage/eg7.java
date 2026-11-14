package defpackage;

import ads_mobile_sdk.d22;
import ads_mobile_sdk.e32;
import ads_mobile_sdk.f22;
import ads_mobile_sdk.p22;
import ads_mobile_sdk.xu0;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import java.util.Objects;
import kotlin.coroutines.h;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes.dex */
public final class eg7 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ eg7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public eg7(of3 of3Var) {
        this.a = (byte) 1;
        this.b = of3Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = (NetworkChangeNotifierAutoDetect) obj;
                if (NetworkChangeNotifierAutoDetect.e(networkChangeNotifierAutoDetect)) {
                    NetworkChangeNotifierAutoDetect.g(networkChangeNotifierAutoDetect);
                    break;
                }
                break;
            case 5:
                on7 on7Var = pn7.b;
                p22 p22Var = (p22) obj;
                p22Var.c.getClass();
                long jY0 = cs5.y0(SystemClock.elapsedRealtime(), un7.d);
                xu0.a(new d22(jY0, network, (byte) 0));
                na2.B(p22Var.b, h.a, null, new fsg(new gg6(p22Var, jY0, network, (mt5) null), null, (byte) 3), 2);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 1:
                qs7 qs7VarX = qs7.x();
                int i = q4o.a;
                qs7VarX.getClass();
                ((of3) this.b).invoke(dp5.a);
                return;
            case 2:
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
            case 3:
                qs7 qs7VarX2 = qs7.x();
                int i2 = voe.a;
                Objects.toString(networkCapabilities);
                qs7VarX2.getClass();
                ((uoe) this.b).x(new toe(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)));
                return;
            case 4:
                synchronized (((e32) this.b)) {
                    e32 e32Var = (e32) this.b;
                    e32Var.d = network;
                    e32Var.c = networkCapabilities;
                }
                return;
            case 5:
                on7 on7Var = pn7.b;
                p22 p22Var = (p22) this.b;
                p22Var.c.getClass();
                long jY0 = cs5.y0(SystemClock.elapsedRealtime(), un7.d);
                xu0.a(new f22(jY0, network, networkCapabilities));
                na2.B(p22Var.b, h.a, null, new fsg(new oa7(p22Var, jY0, network, networkCapabilities, null), null, (byte) 3), 2);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.a) {
            case 2:
                onAvailable(null);
                break;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                vml.c(new bl6(this, (byte) 24));
                return;
            case 1:
                qs7 qs7VarX = qs7.x();
                int i = q4o.a;
                qs7VarX.getClass();
                ((of3) this.b).invoke(new ep5(7));
                return;
            case 2:
                onAvailable(null);
                return;
            case 3:
                qs7 qs7VarX2 = qs7.x();
                int i2 = voe.a;
                qs7VarX2.getClass();
                uoe uoeVar = (uoe) this.b;
                uoeVar.x(voe.a(uoeVar.g));
                return;
            case 4:
                synchronized (((e32) this.b)) {
                    if (network.equals(((e32) this.b).d)) {
                        e32 e32Var = (e32) this.b;
                        e32Var.d = null;
                        e32Var.c = null;
                    }
                }
                return;
            default:
                on7 on7Var = pn7.b;
                p22 p22Var = (p22) this.b;
                p22Var.c.getClass();
                long jY0 = cs5.y0(SystemClock.elapsedRealtime(), un7.d);
                xu0.a(new d22(jY0, network, (byte) 1));
                na2.B(p22Var.b, h.a, null, new fsg(new ic1((byte) 4, jY0, (mt5) null, p22Var), null, (byte) 3), 2);
                return;
        }
    }
}
