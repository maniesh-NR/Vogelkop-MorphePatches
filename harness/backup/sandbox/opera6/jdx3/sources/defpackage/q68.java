package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class q68 {
    public final long a = SystemClock.elapsedRealtime();
    public final long b;

    public q68(long j) {
        this.b = j;
    }

    public final boolean a() {
        return this.a + this.b < SystemClock.elapsedRealtime();
    }
}
