package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g6f implements ServiceConnection {
    public final vw1 a;
    public final Context b;
    public boolean c;
    public final f6f d;

    public g6f(Context context, vw1 vw1Var) {
        f6f f6fVar = new f6f(this);
        this.d = f6fVar;
        this.a = vw1Var;
        this.b = context;
        f6fVar.B0(vml.d, 3L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        fgf fgfVar;
        Context context = this.b;
        int i = egf.a;
        if (iBinder == null) {
            fgfVar = null;
        } else {
            fgf fgfVarQueryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            if (fgfVarQueryLocalInterface == null || !(fgfVarQueryLocalInterface instanceof fgf)) {
                fgf dgfVar = new dgf();
                ((dgf) dgfVar).a = iBinder;
                fgfVar = dgfVar;
            } else {
                fgfVar = fgfVarQueryLocalInterface;
            }
        }
        if (fgfVar != null) {
            try {
                if (!this.c) {
                    dgf dgfVar2 = (dgf) fgfVar;
                    this.a.a(new AdvertisingIdClient.Info(dgfVar2.a(), dgfVar2.R0()));
                    this.d.S();
                }
            } catch (RemoteException unused) {
            } catch (Throwable th) {
                context.unbindService(this);
                throw th;
            }
            context.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
