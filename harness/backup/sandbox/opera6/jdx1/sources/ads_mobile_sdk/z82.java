package ads_mobile_sdk;

import android.app.Activity;
import android.content.ComponentName;
import android.net.Uri;
import android.os.RemoteException;
import defpackage.asa;
import defpackage.t66;
import defpackage.y66;
import defpackage.yra;
import java.util.Map;

/* loaded from: classes.dex */
public final class z82 extends y66 {
    public final /* synthetic */ f92 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;

    public z82(f92 f92Var, Activity activity, Uri uri, String str, Map map) {
        this.a = f92Var;
        this.b = activity;
        this.c = uri;
        this.d = str;
        this.e = map;
    }

    @Override // defpackage.y66
    public final void onCustomTabsServiceConnected(l45 l45Var) throws NumberFormatException {
        asa asaVar = (asa) l45Var.a;
        try {
            ((yra) asaVar).R0();
        } catch (RemoteException unused) {
        }
        qb7 qb7Var = null;
        t66 t66Var = new t66(null);
        try {
            if (((yra) asaVar).a(t66Var)) {
                qb7Var = new qb7(asaVar, t66Var, (ComponentName) l45Var.b);
            }
        } catch (RemoteException unused2) {
        }
        String str = this.d;
        Map map = this.e;
        this.a.a(qb7Var, this.b, this.c, str, map);
        this.b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
