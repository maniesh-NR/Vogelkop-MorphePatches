package org.chromium.media;

import J.N;
import android.media.MediaPlayer;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class MediaServerCrashListener implements MediaPlayer.OnErrorListener {
    public MediaPlayer a;
    public long b = -1;
    public final long c;

    public MediaServerCrashListener(long j) {
        this.c = j;
    }

    public static MediaServerCrashListener create(long j) {
        return new MediaServerCrashListener(j);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 100) {
            N.Mm$QSrAo(this.c, true);
            releaseWatchdog();
        }
        return true;
    }

    public final void releaseWatchdog() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.release();
        this.a = null;
    }

    public final boolean startListening() {
        if (this.a != null) {
            return true;
        }
        try {
            this.a = MediaPlayer.create(t8.a, 2131951628);
        } catch (IllegalStateException | RuntimeException unused) {
        }
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(this);
            this.b = -1L;
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        if (j == -1 || jElapsedRealtime - j > 5000) {
            N.Mm$QSrAo(this.c, false);
            this.b = jElapsedRealtime;
        }
        return false;
    }
}
