package ads_mobile_sdk;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p13 extends oz2 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ byte e;

    public /* synthetic */ p13(Object obj, byte b) {
        this.e = b;
        this.b = obj;
    }

    @Override // ads_mobile_sdk.oz2
    public final void a() {
        switch (this.e) {
            case 0:
                synchronized (((u13) this.b).f) {
                    if (((u13) this.b).l.get() > 0 && ((u13) this.b).l.decrementAndGet() > 0) {
                        ((u13) this.b).b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                    u13 u13Var = (u13) this.b;
                    if (u13Var.n != null) {
                        u13Var.b.a("Unbind from service.", new Object[0]);
                        u13 u13Var2 = (u13) this.b;
                        u13Var2.a.unbindService(u13Var2.m);
                        u13Var = (u13) this.b;
                        u13Var.g = false;
                        u13Var.n = null;
                        u13Var.m = null;
                    }
                    Iterator it = u13Var.e.iterator();
                    while (it.hasNext()) {
                        ((TaskCompletionSource) it.next()).trySetException(new RemoteException(u13Var.c + " : Binder has died."));
                    }
                    u13Var.e.clear();
                    return;
                }
            default:
                u13 u13Var3 = ((t13) this.b).a;
                u13Var3.b.a("unlinkToDeath", new Object[0]);
                u13Var3.n.asBinder().unlinkToDeath(u13Var3.k, 0);
                u13Var3.n = null;
                u13Var3.g = false;
                return;
        }
    }
}
