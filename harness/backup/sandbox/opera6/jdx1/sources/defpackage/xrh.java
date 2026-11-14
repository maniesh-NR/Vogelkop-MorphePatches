package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class xrh extends und implements ServiceConnection {
    public final ComponentName i;
    public final ceg j;
    public final ArrayList k;
    public boolean l;
    public boolean m;
    public srh n;
    public boolean o;
    public r9g p;

    public xrh(Context context, ComponentName componentName) {
        super(context, new lld(componentName, (byte) 1));
        this.k = new ArrayList();
        this.i = componentName;
        this.j = new ceg();
    }

    @Override // defpackage.und
    public final rnd a(String str, tnd tndVar) {
        if (str == null) {
            qp2.o("initialMemberRouteId cannot be null.");
            return null;
        }
        mi9 mi9Var = this.g;
        if (mi9Var != null) {
            List list = mi9Var.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((bnd) list.get(i)).d().equals(str)) {
                    vrh vrhVar = new vrh(this, str, tndVar);
                    this.k.add(vrhVar);
                    if (this.o) {
                        vrhVar.a(this.n);
                    }
                    l();
                    return vrhVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.und
    public final snd c(String str, tnd tndVar) {
        if (str != null) {
            return i(str, null, tndVar);
        }
        qp2.o("routeId cannot be null");
        return null;
    }

    @Override // defpackage.und
    public final snd d(String str, String str2) {
        if (str == null) {
            qp2.o("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return i(str, str2, tnd.b);
        }
        qp2.o("routeGroupId cannot be null");
        return null;
    }

    @Override // defpackage.und
    public final void e(dnd dndVar) {
        if (this.o) {
            srh srhVar = this.n;
            int i = srhVar.d;
            srhVar.d = i + 1;
            srhVar.b(10, i, 0, dndVar != null ? dndVar.a : null, null);
        }
        l();
    }

    public final void h() {
        if (this.m) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.i);
        try {
            this.m = this.a.bindService(intent, this, 4097);
        } catch (SecurityException unused) {
        }
    }

    public final wrh i(String str, String str2, tnd tndVar) {
        mi9 mi9Var = this.g;
        if (mi9Var == null) {
            return null;
        }
        List list = mi9Var.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((bnd) list.get(i)).d().equals(str)) {
                wrh wrhVar = new wrh(this, str, str2, tndVar);
                this.k.add(wrhVar);
                if (this.o) {
                    wrhVar.a(this.n);
                }
                l();
                return wrhVar;
            }
        }
        return null;
    }

    public final void j() {
        if (this.n != null) {
            f(null);
            this.o = false;
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((trh) arrayList.get(i)).c();
            }
            srh srhVar = this.n;
            srhVar.b(2, 0, 0, null, null);
            srhVar.b.b.clear();
            srhVar.a.getBinder().unlinkToDeath(srhVar, 0);
            srhVar.i.j.post(new rrh(srhVar, (byte) 0));
            this.n = null;
        }
    }

    public final void k() {
        if (this.m) {
            this.m = false;
            j();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException unused) {
                toString();
            }
        }
    }

    public final void l() {
        boolean zIsEmpty;
        if (this.l) {
            zIsEmpty = true;
            if (this.e == null) {
                zIsEmpty = true ^ this.k.isEmpty();
            }
        } else {
            zIsEmpty = false;
        }
        if (zIsEmpty) {
            h();
        } else {
            k();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        if (this.m) {
            j();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        srh srhVar = new srh(this, messenger);
                        int i = srhVar.d;
                        srhVar.d = i + 1;
                        srhVar.g = i;
                        if (srhVar.b(1, i, 4, null, null)) {
                            try {
                                srhVar.a.getBinder().linkToDeath(srhVar, 0);
                                this.n = srhVar;
                                return;
                            } catch (RemoteException unused) {
                                srhVar.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            toString();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        j();
    }

    public final String toString() {
        return "Service connection " + this.i.flattenToShortString();
    }
}
