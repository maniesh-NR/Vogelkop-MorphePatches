package ads_mobile_sdk;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.bip;
import defpackage.hgp;
import defpackage.sfp;

/* loaded from: classes.dex */
public final class zt0 extends BaseGmsClient {
    public final int a;

    public zt0(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, int i) {
        super(context, looper, 116, baseConnectionCallbacks, baseOnConnectionFailedListener, (String) null);
        this.a = i;
    }

    public final IInterface createServiceInterface(IBinder iBinder) {
        int i = hgp.j;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof bip ? (bip) iInterfaceQueryLocalInterface : new sfp(iBinder, "com.google.android.gms.gass.internal.IGassService", (byte) 1);
    }

    public final int getMinApkVersion() {
        return this.a;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }
}
