package org.chromium.content.browser;

import J.N;
import android.os.SystemClock;
import defpackage.ard;
import defpackage.epd;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.k03;
import defpackage.zqd;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.chromium.content_public.browser.MediaSession;
import org.chromium.services.media_session.MediaImage;
import org.chromium.services.media_session.MediaMetadata;
import org.chromium.services.media_session.MediaPosition;

/* loaded from: classes.dex */
public final class MediaSessionImpl extends MediaSession {
    public long a;
    public final h7f b;
    public final g7f c;
    public boolean d;
    public byte e;
    public MediaMetadata f;
    public List g;
    public HashSet h;
    public MediaPosition i;

    public MediaSessionImpl(long j) {
        this.a = j;
        h7f h7fVar = new h7f();
        this.b = h7fVar;
        this.c = new g7f(h7fVar);
    }

    public static MediaSessionImpl create(long j) {
        return new MediaSessionImpl(j);
    }

    @Override // org.chromium.content_public.browser.MediaSession
    public final void a(zqd zqdVar) {
        ard ardVar = zqdVar.c;
        this.b.b(zqdVar);
        byte b = this.e;
        if (b != 0) {
            zqdVar.b(this.d, b == 2);
        }
        MediaMetadata mediaMetadata = this.f;
        if (mediaMetadata != null) {
            ardVar.n = mediaMetadata;
            ardVar.i();
        }
        List list = this.g;
        if (list != null) {
            zqdVar.a(list);
        }
        MediaPosition mediaPosition = this.i;
        if (mediaPosition != null) {
            ardVar.r = mediaPosition;
            if (!ardVar.e()) {
                ardVar.l.n = ardVar.r;
                ardVar.g();
            }
        }
        HashSet hashSet = this.h;
        if (hashSet != null) {
            ardVar.q = hashSet;
            if (ardVar.e()) {
                return;
            }
            ardVar.l.m = ardVar.q;
            ardVar.g();
        }
    }

    @Override // org.chromium.content_public.browser.MediaSession
    public final void b(int i) {
        N.MAqRqyJa(this.a, i);
    }

    @Override // org.chromium.content_public.browser.MediaSession
    public final void c(zqd zqdVar) {
        this.b.c(zqdVar);
    }

    @Override // org.chromium.content_public.browser.MediaSession
    public final void d() {
        N.MlezJYnz(this.a, 1);
    }

    @Override // org.chromium.content_public.browser.MediaSession
    public final void e(long j) {
        N.MK7btVfc(this.a, j);
    }

    @Override // org.chromium.content_public.browser.MediaSession
    public final void f() {
        N.MW5s36cs(this.a);
    }

    @Override // org.chromium.content_public.browser.MediaSession
    public final void g() {
        N.M5LC9gX$(this.a, 1);
    }

    public final boolean hasObservers() {
        return !this.b.isEmpty();
    }

    public final void mediaSessionActionsChanged(int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        this.h = hashSet;
        g7f g7fVar = this.c;
        g7fVar.b();
        while (g7fVar.hasNext()) {
            ard ardVar = ((zqd) g7fVar.next()).c;
            ardVar.q = hashSet;
            if (!ardVar.e()) {
                ardVar.l.m = ardVar.q;
                ardVar.g();
            }
        }
    }

    public final void mediaSessionArtworkChanged(MediaImage[] mediaImageArr) {
        this.g = Arrays.asList(mediaImageArr);
        g7f g7fVar = this.c;
        g7fVar.b();
        while (g7fVar.hasNext()) {
            ((zqd) g7fVar.next()).a(this.g);
        }
    }

    public final void mediaSessionDestroyed() {
        g7f g7fVar = this.c;
        g7fVar.b();
        while (g7fVar.hasNext()) {
            zqd zqdVar = (zqd) g7fVar.next();
            ard ardVar = zqdVar.c;
            k03 k03Var = ardVar.u;
            if (k03Var.a >= 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                k03Var.c = jElapsedRealtime - k03Var.a;
                k03Var.b = jElapsedRealtime;
                k03Var.a = -1L;
            }
            epd epdVar = ardVar.c;
            MediaSession mediaSession = zqdVar.b;
            epdVar.a(mediaSession, false, false);
            ardVar.d.n(mediaSession);
            ardVar.c();
            ardVar.a();
        }
        g7fVar.b();
        while (g7fVar.hasNext()) {
            zqd zqdVar2 = (zqd) g7fVar.next();
            MediaSession mediaSession2 = zqdVar2.a;
            if (mediaSession2 != null) {
                mediaSession2.c(zqdVar2);
                zqdVar2.a = null;
            }
        }
        this.b.clear();
        this.a = 0L;
    }

    public final void mediaSessionMetadataChanged(MediaMetadata mediaMetadata) {
        this.f = mediaMetadata;
        g7f g7fVar = this.c;
        g7fVar.b();
        while (g7fVar.hasNext()) {
            ard ardVar = ((zqd) g7fVar.next()).c;
            ardVar.n = mediaMetadata;
            ardVar.i();
        }
    }

    public final void mediaSessionPositionChanged(MediaPosition mediaPosition) {
        this.i = mediaPosition;
        g7f g7fVar = this.c;
        g7fVar.b();
        while (g7fVar.hasNext()) {
            ard ardVar = ((zqd) g7fVar.next()).c;
            ardVar.r = mediaPosition;
            if (!ardVar.e()) {
                ardVar.l.n = ardVar.r;
                ardVar.g();
            }
        }
    }

    public final void mediaSessionStateChanged(boolean z, boolean z2) {
        this.d = z;
        this.e = z2 ? (byte) 2 : (byte) 1;
        g7f g7fVar = this.c;
        g7fVar.b();
        while (g7fVar.hasNext()) {
            ((zqd) g7fVar.next()).b(z, z2);
        }
    }
}
