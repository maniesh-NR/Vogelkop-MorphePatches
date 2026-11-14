package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import defpackage.hkp;
import defpackage.vjp;
import defpackage.wip;

/* loaded from: classes.dex */
public final class wa1 implements ServiceConnection {
    public final e7 a;
    public final /* synthetic */ xa1 b;

    public wa1(xa1 xa1Var, e7 e7Var) {
        this.b = xa1Var;
        this.a = e7Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hkp wipVar;
        int i = vjp.j;
        if (iBinder == null) {
            wipVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            wipVar = iInterfaceQueryLocalInterface instanceof hkp ? (hkp) iInterfaceQueryLocalInterface : new wip(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", (byte) 1);
        }
        xa1 xa1Var = this.b;
        xa1Var.d = wipVar;
        xa1Var.a = (byte) 2;
        this.a.a(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        xa1 xa1Var = this.b;
        xa1Var.d = null;
        xa1Var.a = (byte) 0;
    }
}
