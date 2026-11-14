package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dkd implements e11 {
    public int A;
    public boolean B;
    public final Context a;
    public final ju6 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public rhg o;
    public ro9 p;
    public ro9 q;
    public ro9 r;
    public oj9 s;
    public oj9 t;
    public oj9 u;
    public boolean v;
    public byte w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = f03.p();
    public final fql f = new fql();
    public final dql g = new dql();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public byte m = 0;
    public byte n = 0;

    public dkd(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        ju6 ju6Var = new ju6();
        this.c = ju6Var;
        ju6Var.d = this;
    }

    public static dkd b(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new dkd(context, mediaMetricsManager.createPlaybackSession());
    }

    public final boolean a(ro9 ro9Var) {
        String str;
        if (ro9Var == null) {
            return false;
        }
        String str2 = (String) ro9Var.d;
        ju6 ju6Var = this.c;
        synchronized (ju6Var) {
            str = ju6Var.f;
        }
        return str2.equals(str);
    }

    public final void c() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.k.build();
            this.b.execute(new Runnable() { // from class: bkd
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e(playbackMetricsBuild);
                }
            });
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final LogSessionId d() {
        return this.d.getSessionId();
    }

    public final /* synthetic */ void e(PlaybackMetrics playbackMetrics) {
        this.d.reportPlaybackMetrics(playbackMetrics);
    }

    public final /* synthetic */ void f(NetworkEvent networkEvent) {
        this.d.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void g(PlaybackErrorEvent playbackErrorEvent) {
        this.d.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void h(PlaybackStateEvent playbackStateEvent) {
        this.d.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void i(TrackChangeEvent trackChangeEvent) {
        this.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final void j(gql gqlVar, jrd jrdVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.k;
        if (jrdVar == null || (iB = gqlVar.b(jrdVar.a)) == -1) {
            return;
        }
        dql dqlVar = this.g;
        int i = 0;
        gqlVar.f(iB, dqlVar, false);
        int i2 = dqlVar.c;
        fql fqlVar = this.f;
        gqlVar.n(i2, fqlVar);
        mjd mjdVar = fqlVar.b.b;
        if (mjdVar != null) {
            int iG = tym.G(mjdVar.a, mjdVar.b);
            i = iG != 0 ? iG != 1 ? iG != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (fqlVar.l != -9223372036854775807L && !fqlVar.j && !fqlVar.h && !fqlVar.a()) {
            builder.setMediaDurationMillis(tym.c0(fqlVar.l));
        }
        builder.setPlaybackType(fqlVar.a() ? 2 : 1);
        this.B = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05e6 A[PHI: r11
      0x05e6: PHI (r11v25 byte) = (r11v24 byte), (r11v27 byte), (r11v26 byte), (r11v26 byte), (r11v26 byte) binds: [B:333:0x05aa, B:355:0x05e1, B:339:0x05b8, B:340:0x05ba, B:341:0x05bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:430:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.qi8 r24, k5o r25) {
        /*
            Method dump skipped, instructions count: 1700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkd.k(qi8, k5o):void");
    }

    public final void l(d11 d11Var, String str) {
        jrd jrdVar = d11Var.d;
        if (jrdVar == null || !jrdVar.b()) {
            c();
            this.j = str;
            this.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.9.0");
            j(d11Var.b, jrdVar);
        }
    }

    public final void m(d11 d11Var, String str) {
        jrd jrdVar = d11Var.d;
        if ((jrdVar == null || !jrdVar.b()) && str.equals(this.j)) {
            c();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void n(int i, long j, oj9 oj9Var, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (oj9Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = oj9Var.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = oj9Var.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = oj9Var.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = oj9Var.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = oj9Var.u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = oj9Var.v;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = oj9Var.F;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = oj9Var.G;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = oj9Var.d;
            if (str4 != null) {
                String str5 = tym.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = oj9Var.y;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.b.execute(new Runnable() { // from class: yjd
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(trackChangeEventBuild);
            }
        });
    }
}
