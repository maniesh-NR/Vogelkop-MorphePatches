package defpackage;

import android.os.StrictMode;
import java.io.Closeable;
import org.chromium.base.TraceEvent;

/* loaded from: classes.dex */
public final class tgk implements Closeable {
    public final StrictMode.ThreadPolicy a;
    public final StrictMode.VmPolicy b;

    public tgk(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        this.a = threadPolicy;
        this.b = vmPolicy;
    }

    public static tgk h() {
        TraceEvent traceEventN = TraceEvent.n("StrictModeContext.allowAllThreadPolicies", (String) null);
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            tgk tgkVar = new tgk(threadPolicy, null);
            if (traceEventN != null) {
                traceEventN.close();
            }
            return tgkVar;
        } catch (Throwable th) {
            if (traceEventN != null) {
                try {
                    traceEventN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static tgk k() {
        TraceEvent traceEventN = TraceEvent.n("StrictModeContext.allowAllVmPolicies", (String) null);
        try {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            tgk tgkVar = new tgk(null, vmPolicy);
            if (traceEventN != null) {
                traceEventN.close();
            }
            return tgkVar;
        } catch (Throwable th) {
            if (traceEventN != null) {
                try {
                    traceEventN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static tgk l() {
        TraceEvent traceEventN = TraceEvent.n("StrictModeContext.allowDiskReads", (String) null);
        try {
            tgk tgkVar = new tgk(StrictMode.allowThreadDiskReads(), null);
            if (traceEventN != null) {
                traceEventN.close();
            }
            return tgkVar;
        } catch (Throwable th) {
            if (traceEventN != null) {
                try {
                    traceEventN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static tgk m() {
        TraceEvent traceEventN = TraceEvent.n("StrictModeContext.allowDiskWrites", (String) null);
        try {
            tgk tgkVar = new tgk(StrictMode.allowThreadDiskWrites(), null);
            if (traceEventN != null) {
                traceEventN.close();
            }
            return tgkVar;
        } catch (Throwable th) {
            if (traceEventN != null) {
                try {
                    traceEventN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
        TraceEvent.l(hashCode(), "StrictModeContext");
    }
}
