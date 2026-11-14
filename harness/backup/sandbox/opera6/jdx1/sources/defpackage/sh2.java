package defpackage;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class sh2 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ d5o a;

    public sh2(d5o d5oVar) {
        this.a = d5oVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        ((th2) this.a.c).i.i(-1, new t40((byte) 27));
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        ((th2) this.a.c).i.i(-1, new t40((byte) 28));
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        ((th2) this.a.c).i.i(-1, new t40((byte) 27));
    }
}
