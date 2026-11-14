package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class w9p extends exg {
    public long b;
    public long c;

    public final synchronized void C() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b == 0) {
            this.b = jElapsedRealtime;
        }
        this.c = jElapsedRealtime;
    }
}
