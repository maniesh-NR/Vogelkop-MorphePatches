package defpackage;

import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataSink;

/* loaded from: classes.dex */
public abstract class fnb extends UploadDataSink {
    public final AtomicInteger a = new AtomicInteger(3);
    public final enb b;
    public final onb c;
    public final tom d;
    public ByteBuffer e;
    public long f;
    public long g;
    public int h;

    public fnb(Executor executor, onb onbVar, tom tomVar) {
        this.b = new enb(this, executor);
        this.c = onbVar;
        this.d = new tom(tomVar, (byte) 1);
    }

    public final void a(gnb gnbVar, String str) {
        lni.h("JavaUploadDataSinkBase#executeOnExecutor ".concat(str));
        try {
            this.c.execute(new zr9((Object) str, (Object) gnbVar, (byte) 11));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(qnb qnbVar, String str) {
        try {
            lni.h("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor ".concat(str));
            try {
                this.b.execute(new gl6((Object) this, (Object) str, (Object) qnbVar, (byte) 26));
                Trace.endSection();
            } finally {
            }
        } catch (RejectedExecutionException e) {
            c(e);
        }
    }

    public abstract void c(Exception exc);

    public final void onReadError(Exception exc) {
        c(exc);
    }

    public final void onReadSucceeded(boolean z) {
        AtomicInteger atomicInteger = this.a;
        if (!atomicInteger.compareAndSet(0, 2)) {
            qp2.n(sko.i(atomicInteger.get(), "onReadSucceeded() called when not awaiting a read result; in state: "));
        } else {
            a(new gnb(((nnb) this).m, new vw((byte) 6, (Object) this, z), (byte) 2), "onReadSucceeded");
        }
    }

    public final void onRewindError(Exception exc) {
        c(exc);
    }

    public final void onRewindSucceeded() {
        AtomicInteger atomicInteger = this.a;
        byte b = 1;
        if (!atomicInteger.compareAndSet(1, 2)) {
            qp2.n(sko.i(atomicInteger.get(), "onRewindSucceeded() called when not awaiting a rewind; in state: "));
        } else {
            a(new gnb(((nnb) this).m, new cnb(this, b), (byte) 2), "startRead");
        }
    }
}
