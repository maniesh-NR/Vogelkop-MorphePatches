package defpackage;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;

/* loaded from: classes.dex */
public final class to4 extends RemoteMediaClient.Callback {
    public final /* synthetic */ zo4 a;

    public to4(zo4 zo4Var) {
        this.a = zo4Var;
    }

    public final void onAdBreakStatusUpdated() {
    }

    public final void onMediaError(MediaError mediaError) {
        this.a.C0(mediaError);
    }

    public final void onMetadataUpdated() {
    }

    public final void onPreloadStatusUpdated() {
    }

    public final void onQueueStatusUpdated() {
    }

    public final void onSendingRemoteMediaRequest() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStatusUpdated() {
        /*
            r5 = this;
            r0 = 0
            zo4 r5 = r5.a
            r5.L = r0
            com.google.android.gms.cast.framework.media.RemoteMediaClient r0 = r5.v
            com.google.android.gms.cast.MediaStatus r0 = r0.getMediaStatus()
            if (r0 == 0) goto L30
            com.google.android.gms.cast.MediaInfo r1 = r0.getMediaInfo()
            if (r1 == 0) goto L23
            long r1 = r1.getStreamDuration()
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L23
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L28
        L23:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L28:
            r5.E = r1
            r5.M0(r0)
            r5.O0(r0)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to4.onStatusUpdated():void");
    }
}
