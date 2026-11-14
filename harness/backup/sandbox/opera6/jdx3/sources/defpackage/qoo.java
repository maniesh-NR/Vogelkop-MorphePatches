package defpackage;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public final class qoo {
    public z4k a;
    public rii b;
    public h9o c;
    public uto d;
    public tvk e;
    public final MediaPlayer f;
    public final jmo g;

    public qoo() {
        MediaPlayer mediaPlayer;
        synchronized (new Object()) {
            mediaPlayer = new MediaPlayer();
            this.f = mediaPlayer;
        }
        mediaPlayer.setAudioStreamType(3);
        this.g = new jmo(this, this);
        a();
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.f;
        jmo jmoVar = this.g;
        mediaPlayer.setOnPreparedListener(jmoVar);
        mediaPlayer.setOnBufferingUpdateListener(jmoVar);
        mediaPlayer.setOnCompletionListener(jmoVar);
        mediaPlayer.setOnSeekCompleteListener(jmoVar);
        mediaPlayer.setOnVideoSizeChangedListener(jmoVar);
        mediaPlayer.setOnErrorListener(jmoVar);
        mediaPlayer.setOnInfoListener(jmoVar);
    }
}
