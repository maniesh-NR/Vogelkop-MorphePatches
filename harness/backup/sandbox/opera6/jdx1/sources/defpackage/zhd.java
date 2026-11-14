package defpackage;

import ads_mobile_sdk.oz2;
import ads_mobile_sdk.u13;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class zhd implements IBinder.DeathRecipient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zhd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ghd ghdVar = ((gid) obj).a;
                Objects.requireNonNull(ghdVar);
                ghdVar.u0(new dnb(ghdVar, (byte) 23));
                return;
            default:
                u13 u13Var = (u13) obj;
                int i = 0;
                u13Var.b.a("reportBinderDeath", new Object[0]);
                if (u13Var.j.get() != null) {
                    h9o.t();
                    return;
                }
                u13Var.b.a("%s : Binder has died.", u13Var.c);
                ArrayList arrayList = u13Var.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    RemoteException remoteException = new RemoteException(z1m.l(new StringBuilder(), u13Var.c, " : Binder has died."));
                    TaskCompletionSource taskCompletionSource = ((oz2) obj2).a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                u13Var.d.clear();
                synchronized (u13Var.f) {
                    Iterator it = u13Var.e.iterator();
                    while (it.hasNext()) {
                        ((TaskCompletionSource) it.next()).trySetException(new RemoteException(u13Var.c + " : Binder has died."));
                    }
                    u13Var.e.clear();
                }
                return;
        }
    }
}
