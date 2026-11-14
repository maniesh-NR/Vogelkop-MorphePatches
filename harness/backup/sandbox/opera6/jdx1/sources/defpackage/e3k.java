package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class e3k implements hgd {
    public boolean a;
    public long b;
    public long c;
    public thg d;

    public final void a(long j) {
        this.b = j;
        if (this.a) {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.a) {
            return;
        }
        this.c = SystemClock.elapsedRealtime();
        this.a = true;
    }

    public final void c(thg thgVar) {
        if (this.a) {
            a(getPositionUs());
        }
        this.d = thgVar;
    }

    public final thg getPlaybackParameters() {
        return this.d;
    }

    public final long getPositionUs() {
        long j = this.b;
        if (!this.a) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        return (this.d.a == 1.0f ? tym.N(jElapsedRealtime) : jElapsedRealtime * r6.c) + j;
    }
}
