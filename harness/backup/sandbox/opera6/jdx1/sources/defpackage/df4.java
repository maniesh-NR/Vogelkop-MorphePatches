package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class df4 {
    public final byte a;
    public final long b;
    public final Throwable c;

    public df4(long j, Exception exc) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof sg4) {
            this.a = (byte) 2;
            this.c = exc;
            return;
        }
        if (!(exc instanceof s7b)) {
            this.a = (byte) 0;
            this.c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.c = exc;
        if (exc instanceof hg4) {
            this.a = (byte) 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.a = (byte) 1;
        } else {
            this.a = (byte) 0;
        }
    }
}
