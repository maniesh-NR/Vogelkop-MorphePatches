package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class x6 implements ListenableFuture {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(x6.class.getName());
    public static final na2 f;
    public static final Object g;
    public volatile Object a;
    public volatile s6 b;
    public volatile w6 c;

    static {
        na2 v6Var;
        try {
            v6Var = new t6(AtomicReferenceFieldUpdater.newUpdater(w6.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(w6.class, w6.class, "b"), AtomicReferenceFieldUpdater.newUpdater(x6.class, w6.class, "c"), AtomicReferenceFieldUpdater.newUpdater(x6.class, s6.class, "b"), AtomicReferenceFieldUpdater.newUpdater(x6.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            v6Var = new v6();
        }
        f = v6Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void d(x6 x6Var) {
        w6 w6Var;
        s6 s6Var;
        s6 s6Var2;
        s6 s6Var3;
        do {
            w6Var = x6Var.c;
        } while (!f.m(x6Var, w6Var, w6.c));
        while (true) {
            s6Var = null;
            if (w6Var == null) {
                break;
            }
            Thread thread = w6Var.a;
            if (thread != null) {
                w6Var.a = null;
                LockSupport.unpark(thread);
            }
            w6Var = w6Var.b;
        }
        x6Var.c();
        do {
            s6Var2 = x6Var.b;
        } while (!f.k(x6Var, s6Var2, s6.d));
        while (true) {
            s6Var3 = s6Var;
            s6Var = s6Var2;
            if (s6Var == null) {
                break;
            }
            s6Var2 = s6Var.c;
            s6Var.c = s6Var3;
        }
        while (s6Var3 != null) {
            s6 s6Var4 = s6Var3.c;
            Runnable runnable = s6Var3.a;
            if (runnable instanceof u6) {
                h9o.t();
                return;
            } else {
                e(runnable, s6Var3.b);
                s6Var3 = s6Var4;
            }
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof p6) {
            CancellationException cancellationException = ((p6) obj).b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof r6) {
            throw new ExecutionException(((r6) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object g(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        s6 s6Var = this.b;
        s6 s6Var2 = s6.d;
        if (s6Var != s6Var2) {
            s6 s6Var3 = new s6(runnable, executor);
            do {
                s6Var3.c = s6Var;
                if (f.k(this, s6Var, s6Var3)) {
                    return;
                } else {
                    s6Var = this.b;
                }
            } while (s6Var != s6Var2);
        }
        e(runnable, executor);
    }

    public void c() {
    }

    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!f.l(this, obj, d ? new p6(z, new CancellationException("Future.cancel() was called.")) : z ? p6.c : p6.d)) {
            return false;
        }
        d(this);
        return true;
    }

    public final Object get() {
        Object obj;
        w6 w6Var = w6.c;
        if (Thread.interrupted()) {
            bpp.n();
            return null;
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return f(obj2);
        }
        w6 w6Var2 = this.c;
        if (w6Var2 != w6Var) {
            w6 w6Var3 = new w6();
            do {
                na2 na2Var = f;
                na2Var.J(w6Var3, w6Var2);
                if (na2Var.m(this, w6Var2, w6Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            i(w6Var3);
                            bpp.n();
                            return null;
                        }
                        obj = this.a;
                    } while (obj == null);
                    return f(obj);
                }
                w6Var2 = this.c;
            } while (w6Var2 != w6Var);
        }
        return f(this.a);
    }

    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        Object obj;
        w6 w6Var = w6.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            bpp.n();
            return null;
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return f(obj2);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            w6 w6Var2 = this.c;
            if (w6Var2 != w6Var) {
                w6 w6Var3 = new w6();
                obj = null;
                do {
                    na2 na2Var = f;
                    na2Var.J(w6Var3, w6Var2);
                    if (na2Var.m(this, w6Var2, w6Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(w6Var3);
                                bpp.n();
                                return null;
                            }
                            Object obj3 = this.a;
                            if (obj3 != null) {
                                return f(obj3);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(w6Var3);
                    } else {
                        w6Var2 = this.c;
                    }
                } while (w6Var2 != w6Var);
            }
            return f(this.a);
        }
        obj = null;
        while (nanos > 0) {
            Object obj4 = this.a;
            if (obj4 != null) {
                return f(obj4);
            }
            if (Thread.interrupted()) {
                bpp.n();
                return obj;
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbQ = p3p.q(j, "Waited ", " ");
        sbQ.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbQ.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z) {
                strConcat = z1m.j(nanos2, strConcat, " nanoseconds ");
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(sko.k(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(w6 w6Var) {
        w6Var.a = null;
        while (true) {
            w6 w6Var2 = this.c;
            if (w6Var2 != w6.c) {
                w6 w6Var3 = null;
                while (w6Var2 != null) {
                    w6 w6Var4 = w6Var2.b;
                    if (w6Var2.a != null) {
                        w6Var3 = w6Var2;
                    } else if (w6Var3 != null) {
                        w6Var3.b = w6Var4;
                        if (w6Var3.a == null) {
                            break;
                        }
                    } else if (f.m(this, w6Var2, w6Var4)) {
                    }
                    w6Var2 = w6Var4;
                }
                return;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.a instanceof p6;
    }

    public final boolean isDone() {
        return this.a != null;
    }

    public final boolean j(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.l(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!f.l(this, null, new r6(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof p6) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e2) {
                strH = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                p3p.v(sb, "PENDING, info=[", strH, "]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
