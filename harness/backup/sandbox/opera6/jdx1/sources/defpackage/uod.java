package defpackage;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class uod {
    sod mCallbackHandler;
    private boolean mMediaPlayPausePendingOnHandler;
    final Object mLock = new Object();
    final MediaSession.Callback mCallbackFwk = new tod(this, 0);
    WeakReference<vod> mSessionImpl = new WeakReference<>(null);

    public void handleMediaPlayPauseIfPendingOnHandler(vod vodVar, Handler handler) {
        if (this.mMediaPlayPausePendingOnHandler) {
            this.mMediaPlayPausePendingOnHandler = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompat = ((yod) vodVar).g;
            long j = playbackStateCompat == null ? 0L : playbackStateCompat.e;
            boolean z = playbackStateCompat != null && playbackStateCompat.a == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z) {
                if (z3) {
                    onPause();
                }
            } else if (z2) {
                onPlay();
            }
        }
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
    }

    public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void onCustomAction(String str, Bundle bundle) {
    }

    public void onFastForward() {
    }

    public boolean onMediaButtonEvent(Intent intent) {
        return false;
    }

    public void onPause() {
    }

    public void onPlay() {
    }

    public void onPlayFromMediaId(String str, Bundle bundle) {
    }

    public void onPlayFromSearch(String str, Bundle bundle) {
    }

    public void onPlayFromUri(Uri uri, Bundle bundle) {
    }

    public void onPrepare() {
    }

    public void onPrepareFromMediaId(String str, Bundle bundle) {
    }

    public void onPrepareFromSearch(String str, Bundle bundle) {
    }

    public void onPrepareFromUri(Uri uri, Bundle bundle) {
    }

    public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    @Deprecated
    public void onRemoveQueueItemAt(int i) {
    }

    public void onRewind() {
    }

    public void onSeekTo(long j) {
    }

    public void onSetCaptioningEnabled(boolean z) {
    }

    public void onSetPlaybackSpeed(float f) {
    }

    public void onSetRating(RatingCompat ratingCompat) {
    }

    public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
    }

    public void onSetRepeatMode(int i) {
    }

    public void onSetShuffleMode(int i) {
    }

    public void onSkipToNext() {
    }

    public void onSkipToPrevious() {
    }

    public void onSkipToQueueItem(long j) {
    }

    public void onStop() {
    }

    public void setSessionImpl(vod vodVar, Handler handler) {
        synchronized (this.mLock) {
            this.mSessionImpl = new WeakReference<>(vodVar);
            sod sodVar = this.mCallbackHandler;
            sod sodVar2 = null;
            if (sodVar != null) {
                sodVar.removeCallbacksAndMessages(null);
            }
            if (vodVar != null && handler != null) {
                sodVar2 = new sod(this, handler.getLooper());
            }
            this.mCallbackHandler = sodVar2;
        }
    }
}
