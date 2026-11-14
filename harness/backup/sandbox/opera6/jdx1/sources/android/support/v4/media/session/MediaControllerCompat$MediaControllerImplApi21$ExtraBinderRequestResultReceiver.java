package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import defpackage.g2n;
import defpackage.o0g;
import defpackage.rsa;
import defpackage.usa;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        usa usaVar;
        a aVar = (a) this.a.get();
        if (aVar == null || bundle == null) {
            return;
        }
        synchronized (aVar.b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = aVar.e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i2 = b.b;
            if (binder == null) {
                usaVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof usa)) {
                    rsa rsaVar = new rsa();
                    rsaVar.a = binder;
                    usaVar = rsaVar;
                } else {
                    usaVar = (usa) iInterfaceQueryLocalInterface;
                }
            }
            synchronized (mediaSessionCompat$Token.a) {
                try {
                    mediaSessionCompat$Token.c = usaVar;
                } finally {
                }
            }
            MediaSessionCompat$Token mediaSessionCompat$Token2 = aVar.e;
            g2n g2nVarZ = o0g.Z(bundle);
            synchronized (mediaSessionCompat$Token2.a) {
                mediaSessionCompat$Token2.d = g2nVarZ;
            }
            aVar.a();
        }
    }
}
