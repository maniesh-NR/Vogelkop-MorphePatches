package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;

/* loaded from: classes.dex */
public final class yod implements vod {
    public final MediaSession a;
    public final b b;
    public final MediaSessionCompat$Token c;
    public Bundle e;
    public PlaybackStateCompat g;
    public MediaMetadataCompat h;
    public uod i;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public yod(Context context, String str) {
        MediaSession mediaSession = new MediaSession(context, str, null);
        this.a = mediaSession;
        b bVar = new b(this);
        this.b = bVar;
        this.c = new MediaSessionCompat$Token(mediaSession.getSessionToken(), bVar);
        this.e = null;
        mediaSession.setFlags(3);
    }

    public yod(MediaSession mediaSession) {
        this.a = mediaSession;
        b bVar = new b(this);
        this.b = bVar;
        this.c = new MediaSessionCompat$Token(mediaSession.getSessionToken(), bVar);
        this.e = null;
        mediaSession.setFlags(3);
    }

    public final void a(uod uodVar, Handler handler) {
        synchronized (this.d) {
            this.i = uodVar;
            this.a.setCallback(uodVar == null ? null : uodVar.mCallbackFwk, handler);
            if (uodVar != null) {
                uodVar.setSessionImpl(this, handler);
            }
        }
    }
}
