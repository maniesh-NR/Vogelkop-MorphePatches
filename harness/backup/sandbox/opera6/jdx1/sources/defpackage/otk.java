package defpackage;

import android.content.res.TypedArray;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class otk implements AutoCloseable {
    public final xfk a;
    public final nv6 b;
    public final gg4 c;
    public final u9d d;
    public final Object e = new Object();
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public boolean h;
    public boolean i;

    public otk(xfk xfkVar, nv6 nv6Var, gg4 gg4Var, u9d u9dVar) {
        this.a = xfkVar;
        this.b = nv6Var;
        this.c = gg4Var;
        this.d = u9dVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : u9dVar.entrySet()) {
            Object key = entry.getKey();
            ((sya) entry.getValue()).getClass();
            linkedHashMap.put(key, null);
        }
        this.f = linkedHashMap;
        this.g = new LinkedHashMap();
        this.h = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        synchronized (this.e) {
            if (this.i) {
                return;
            }
            this.i = true;
            this.f.clear();
            List<AutoCloseable> listK0 = CollectionsKt.k0(this.g.values());
            this.g.clear();
            for (AutoCloseable autoCloseable : listK0) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    if (!(autoCloseable instanceof TypedArray)) {
                        hai.d();
                        return;
                    }
                    ((TypedArray) autoCloseable).recycle();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        r1 = n08.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.e
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L7e
            r1.<init>()     // Catch: java.lang.Throwable -> L7e
            xfk r2 = r12.a     // Catch: java.lang.Throwable -> L7e
            java.util.List r2 = r2.c     // Catch: java.lang.Throwable -> L7e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L7e
        L10:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L7e
            vfk r3 = (defpackage.vfk) r3     // Catch: java.lang.Throwable -> L7e
            java.util.ArrayList r4 = r3.l     // Catch: java.lang.Throwable -> L7e
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L7e
            r6 = 0
            r7 = r6
        L24:
            if (r7 >= r5) goto L10
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L7e
            int r7 = r7 + 1
            cg4 r8 = (defpackage.cg4) r8     // Catch: java.lang.Throwable -> L7e
            java.util.LinkedHashMap r9 = r12.f     // Catch: java.lang.Throwable -> L7e
            int r10 = r8.a     // Catch: java.lang.Throwable -> L7e
            yfk r11 = new yfk     // Catch: java.lang.Throwable -> L7e
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r9 = r9.get(r11)     // Catch: java.lang.Throwable -> L7e
            android.view.Surface r9 = (android.view.Surface) r9     // Catch: java.lang.Throwable -> L7e
            if (r9 != 0) goto L4b
            qii r8 = r3.f     // Catch: java.lang.Throwable -> L7e
            if (r8 == 0) goto L45
            r8 = 1
            goto L46
        L45:
            r8 = r6
        L46:
            if (r8 != 0) goto L24
            n08 r1 = n08.a     // Catch: java.lang.Throwable -> L7e
            goto L56
        L4b:
            int r8 = r8.a     // Catch: java.lang.Throwable -> L7e
            yfk r10 = new yfk     // Catch: java.lang.Throwable -> L7e
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L7e
            r1.put(r10, r9)     // Catch: java.lang.Throwable -> L7e
            goto L24
        L56:
            monitor-exit(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L7a
            nv6 r12 = r12.b
            java.lang.Object r12 = r12.get()
            fa4 r12 = (defpackage.fa4) r12
            java.lang.Object r0 = r12.p
            monitor-enter(r0)
            boolean r2 = r12.c()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L70
            monitor-exit(r0)
            return
        L70:
            r12.z = r1     // Catch: java.lang.Throwable -> L7b
            dk4 r12 = r12.y     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)
            if (r12 == 0) goto L7a
            r12.d(r1)
        L7a:
            return
        L7b:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L7e:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otk.h():void");
    }

    public final void k() {
        synchronized (this.e) {
            if (this.i) {
                throw new IllegalStateException("Check failed.");
            }
            for (Surface surface : this.f.values()) {
                this.g.put(surface, this.c.a(surface));
            }
            this.h = true;
        }
    }

    public final void l() throws Exception {
        List<AutoCloseable> listK0;
        boolean zIsTerminated;
        synchronized (this.e) {
            this.h = false;
            listK0 = CollectionsKt.k0(this.g.values());
            this.g.clear();
        }
        for (AutoCloseable autoCloseable : listK0) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                if (!(autoCloseable instanceof TypedArray)) {
                    hai.d();
                    return;
                }
                ((TypedArray) autoCloseable).recycle();
            }
        }
    }
}
