package ads_mobile_sdk;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import defpackage.dlp;
import defpackage.enp;
import defpackage.vlp;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r13 extends oz2 {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ t13 c;

    public r13(t13 t13Var, IBinder iBinder) {
        this.c = t13Var;
        this.b = iBinder;
    }

    @Override // ads_mobile_sdk.oz2
    public final void a() throws RemoteException {
        enp dlpVar;
        u13 u13Var = this.c.a;
        u13Var.i.getClass();
        int i = vlp.j;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            dlpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.prewarm.protocol.IPrewarmService");
            dlpVar = iInterfaceQueryLocalInterface instanceof enp ? (enp) iInterfaceQueryLocalInterface : new dlp(iBinder, "com.google.android.play.core.prewarm.protocol.IPrewarmService", (byte) 1);
        }
        u13Var.n = dlpVar;
        e7 e7Var = u13Var.b;
        int i2 = 0;
        e7Var.a("linkToDeath", new Object[0]);
        try {
            u13Var.n.asBinder().linkToDeath(u13Var.k, 0);
        } catch (RemoteException unused) {
            Object[] objArr = new Object[0];
            e7Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                e7.a((String) e7Var.a, "linkToDeath failed", objArr);
            }
        }
        u13Var.g = false;
        ArrayList arrayList = u13Var.d;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
        u13Var.d.clear();
    }
}
