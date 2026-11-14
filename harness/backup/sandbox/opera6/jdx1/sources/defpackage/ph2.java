package defpackage;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class ph2 {
    public final oh2 a;
    public final int b;
    public final pjn c;
    public byte d;
    public long e;
    public int f;
    public long g;
    public long h;
    public long i;

    public ph2(AudioTrack audioTrack, pjn pjnVar) {
        this.a = new oh2(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = pjnVar;
        a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000;
            return;
        }
        if (i == 1) {
            this.f = 10000;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000;
        } else if (i == 4) {
            this.f = 500000;
        } else {
            h9o.e();
        }
    }
}
