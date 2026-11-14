package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class uoe extends k73 {
    public final ConnectivityManager g;
    public final eg7 h;

    public uoe(Context context, a5o a5oVar) {
        super(context, a5oVar);
        this.g = (ConnectivityManager) ((Context) ((k73) this).c).getSystemService("connectivity");
        this.h = new eg7(this, (byte) 3);
    }

    public final void A() {
        try {
            qs7 qs7VarX = qs7.x();
            int i = voe.a;
            qs7VarX.getClass();
            this.g.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException unused) {
            qs7 qs7VarX2 = qs7.x();
            int i2 = voe.a;
            qs7VarX2.getClass();
        } catch (SecurityException unused2) {
            qs7 qs7VarX3 = qs7.x();
            int i3 = voe.a;
            qs7VarX3.getClass();
        }
    }

    public final Object s() {
        return voe.a(this.g);
    }

    public final void z() {
        try {
            qs7 qs7VarX = qs7.x();
            int i = voe.a;
            qs7VarX.getClass();
            this.g.registerDefaultNetworkCallback(this.h);
        } catch (IllegalArgumentException unused) {
            qs7 qs7VarX2 = qs7.x();
            int i2 = voe.a;
            qs7VarX2.getClass();
        } catch (SecurityException unused2) {
            qs7 qs7VarX3 = qs7.x();
            int i3 = voe.a;
            qs7VarX3.getClass();
        }
    }
}
