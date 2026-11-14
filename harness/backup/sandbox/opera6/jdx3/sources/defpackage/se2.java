package defpackage;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final /* synthetic */ class se2 implements dsk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ se2(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    public final Object get() {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return new HandlerThread(te2.r(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(te2.r(i, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
