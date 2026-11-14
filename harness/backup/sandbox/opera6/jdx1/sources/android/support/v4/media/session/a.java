package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import defpackage.jhd;
import defpackage.wmd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    public a(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.b);
        this.a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.e;
        if (mediaSessionCompat$Token.a() == null) {
            return;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wmd wmdVar = (wmd) obj;
            jhd jhdVar = new jhd(wmdVar);
            this.d.put(wmdVar, jhdVar);
            wmdVar.c = jhdVar;
            try {
                mediaSessionCompat$Token.a().D0(jhdVar);
                wmdVar.e(13, null, null);
            } catch (RemoteException unused) {
            }
        }
        arrayList.clear();
    }

    public final void b(wmd wmdVar) {
        this.a.unregisterCallback(wmdVar.a);
        synchronized (this.b) {
            if (this.e.a() != null) {
                try {
                    jhd jhdVar = (jhd) this.d.remove(wmdVar);
                    if (jhdVar != null) {
                        wmdVar.c = null;
                        this.e.a().x0(jhdVar);
                    }
                } catch (RemoteException unused) {
                }
            } else {
                this.c.remove(wmdVar);
            }
        }
    }
}
