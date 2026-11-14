package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

/* loaded from: classes.dex */
public final class qsc extends Handler implements Runnable {
    public final int a;
    public final rsc b;
    public final long c;
    public osc d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean h;
    public volatile boolean i;
    public final /* synthetic */ qb7 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsc(qb7 qb7Var, Looper looper, rsc rscVar, osc oscVar, int i, long j) {
        super(looper);
        this.j = qb7Var;
        this.b = rscVar;
        this.d = oscVar;
        this.a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.i = z;
        this.e = null;
        if (hasMessages(1)) {
            this.h = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.h = true;
                this.b.cancelLoad();
                Thread thread = this.g;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.j.b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            osc oscVar = this.d;
            oscVar.getClass();
            oscVar.d(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        osc oscVar = this.d;
        oscVar.getClass();
        oscVar.r(this.b, jElapsedRealtime, j, this.f);
        this.e = null;
        qb7 qb7Var = this.j;
        enb enbVar = (enb) qb7Var.a;
        qsc qscVar = (qsc) qb7Var.b;
        qscVar.getClass();
        enbVar.execute(qscVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.j.b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        osc oscVar = this.d;
        oscVar.getClass();
        if (this.h) {
            oscVar.d(this.b, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                oscVar.i(this.b, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                w7d.r("Unexpected exception handling load completed", e);
                this.j.c = new vsc(e);
                return;
            }
        }
        if (i2 == 3) {
            IOException iOException = (IOException) message.obj;
            this.e = iOException;
            int i3 = this.f + 1;
            this.f = i3;
            psc pscVarU = oscVar.u(this.b, jElapsedRealtime, j, iOException, i3);
            byte b = pscVarU.a;
            if (b == 3) {
                this.j.c = this.e;
                return;
            }
            if (b != 2) {
                if (b == 1) {
                    this.f = 1;
                }
                long jMin = pscVarU.b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.f - 1) * 1000, 5000);
                }
                qb7 qb7Var = this.j;
                z4o.H(((qsc) qb7Var.b) == null);
                qb7Var.b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(1, jMin);
                } else {
                    b();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.h;
                this.g = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.load();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (this.i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.i) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.i) {
                return;
            }
            w7d.r("OutOfMemory error loading stream", e2);
            obtainMessage(3, new vsc(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.i) {
                w7d.r("Unexpected error loading stream", e3);
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.i) {
                return;
            }
            w7d.r("Unexpected exception loading stream", e4);
            obtainMessage(3, new vsc(e4)).sendToTarget();
        }
    }
}
