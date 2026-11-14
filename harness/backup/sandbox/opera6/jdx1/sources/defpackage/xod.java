package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xod {
    public final MediaSession a;
    public final wod b;
    public final apd c;
    public final Bundle e;
    public vhg g;
    public ArrayList h;
    public xjd i;
    public int j;
    public int k;
    public r22 l;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public xod(Context context, String str, Bundle bundle) {
        MediaSession mediaSession = new MediaSession(context, str, bundle);
        this.a = mediaSession;
        wod wodVar = new wod(this);
        this.b = wodVar;
        this.c = new apd(mediaSession.getSessionToken(), wodVar);
        this.e = bundle;
        mediaSession.setFlags(3);
    }
}
