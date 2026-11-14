package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class fmd extends rnd {
    public final String f;
    public final MediaRouter2.RoutingController g;
    public final Messenger h;
    public final Messenger i;
    public final Handler k;
    public bnd o;
    public final /* synthetic */ jmd p;
    public final SparseArray j = new SparseArray();
    public final AtomicInteger l = new AtomicInteger(1);
    public final dnb m = new dnb(this, (byte) 29);
    public int n = -1;

    public fmd(jmd jmdVar, MediaRouter2.RoutingController routingController, String str) {
        this.p = jmdVar;
        this.g = routingController;
        this.f = str;
        Messenger messengerH = jmd.h(routingController);
        this.h = messengerH;
        this.i = messengerH == null ? null : new Messenger(new ue2(this));
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.snd
    public final void d() {
        this.g.release();
    }

    @Override // defpackage.snd
    public final void f(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.n = i;
        Handler handler = this.k;
        dnb dnbVar = this.m;
        handler.removeCallbacks(dnbVar);
        handler.postDelayed(dnbVar, 1000L);
    }

    @Override // defpackage.snd
    public final void i(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        int volume = this.n;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = Math.max(0, Math.min(volume + i, this.g.getVolumeMax()));
        this.n = iMax;
        this.g.setVolume(iMax);
        Handler handler = this.k;
        dnb dnbVar = this.m;
        handler.removeCallbacks(dnbVar);
        handler.postDelayed(dnbVar, 1000L);
    }

    @Override // defpackage.rnd
    public final void m(String str) {
        MediaRoute2Info mediaRoute2InfoI;
        if (str == null || str.isEmpty() || (mediaRoute2InfoI = this.p.i(str)) == null) {
            return;
        }
        this.g.selectRoute(mediaRoute2InfoI);
    }

    @Override // defpackage.rnd
    public final void n(String str) {
        MediaRoute2Info mediaRoute2InfoI;
        if (str == null || str.isEmpty() || (mediaRoute2InfoI = this.p.i(str)) == null) {
            return;
        }
        this.g.deselectRoute(mediaRoute2InfoI);
    }

    @Override // defpackage.rnd
    public final void o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        String str = (String) arrayList.get(0);
        jmd jmdVar = this.p;
        MediaRoute2Info mediaRoute2InfoI = jmdVar.i(str);
        if (mediaRoute2InfoI == null) {
            return;
        }
        jmdVar.i.transferTo(mediaRoute2InfoI);
    }

    public final String p() {
        bnd bndVar = this.o;
        return bndVar != null ? bndVar.d() : this.g.getId();
    }

    public final void q(int i, String str) throws RemoteException {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null || routingController.isReleased() || (messenger = this.h) == null) {
            return;
        }
        int andIncrement = this.l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }

    public final void r(int i, String str) throws RemoteException {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null || routingController.isReleased() || (messenger = this.h) == null) {
            return;
        }
        int andIncrement = this.l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }
}
