package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes.dex */
public final class jjp extends BaseGmsClient {
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i = udp.j;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof sep ? (sep) iInterfaceQueryLocalInterface : new ycp(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", (byte) 1);
    }

    public final int getMinApkVersion() {
        return 243300000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }
}
