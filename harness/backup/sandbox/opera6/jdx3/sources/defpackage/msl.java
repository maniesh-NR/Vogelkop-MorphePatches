package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class msl implements Runnable {
    public static final msl f = new msl();
    public oml b;
    public long c;
    public boolean d;
    public final Object a = new Object();
    public long e = 40000;

    public final void a() {
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            if (this.b != null) {
                return;
            }
            if (this.e >= 0) {
                this.c = SystemClock.uptimeMillis();
                oml omlVar = new oml(vml.d.c(this));
                this.b = omlVar;
                omlVar.b(null, this.e, TimeUnit.MILLISECONDS, null);
            }
        }
    }

    public final void b(boolean z) {
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            long jUptimeMillis = this.e - (SystemClock.uptimeMillis() - this.c);
            this.b.cancel(false);
            if (z) {
                this.b = null;
                this.d = true;
                this.e = 0L;
            } else {
                this.b = null;
                this.d = false;
                this.e = jUptimeMillis;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.b = null;
            this.d = true;
            this.e = 0L;
            ks3.B("TooLongLoading[WelcomeFragment]", null);
        }
    }
}
