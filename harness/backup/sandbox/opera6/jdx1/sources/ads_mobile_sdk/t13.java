package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class t13 implements ServiceConnection {
    public final /* synthetic */ u13 a;

    public t13(u13 u13Var) {
        this.a = u13Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        u13 u13Var = this.a;
        u13Var.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        u13Var.b(new r13(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        u13 u13Var = this.a;
        u13Var.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        u13Var.b(new p13(this, (byte) 1));
    }
}
