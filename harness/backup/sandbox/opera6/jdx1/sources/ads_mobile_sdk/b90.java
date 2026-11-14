package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import defpackage.asa;
import defpackage.t66;
import defpackage.y66;
import defpackage.yra;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b90 extends y66 {
    public final Context a;
    public final nx5 b;
    public final ux2 c;
    public qb7 d;
    public l45 e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public b90(Context context, nx5 nx5Var, ux2 ux2Var) {
        this.a = context;
        this.b = nx5Var;
        this.c = ux2Var;
    }

    @Override // defpackage.y66
    public final void onCustomTabsServiceConnected(l45 l45Var) {
        asa asaVar = (asa) l45Var.a;
        this.e = l45Var;
        try {
            ((yra) asaVar).R0();
        } catch (RemoteException unused) {
        }
        t66 t66Var = new t66(new a90(this));
        qb7 qb7Var = ((yra) asaVar).a(t66Var) ? new qb7(asaVar, t66Var, (ComponentName) l45Var.b) : null;
        this.d = qb7Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.d = null;
        this.e = null;
    }
}
