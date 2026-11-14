package defpackage;

import android.content.res.TypedArray;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class dk4 implements h4j {
    public final e3a a;
    public final xj4 b;
    public final w6j c;
    public final gg4 d;
    public final h0l e;
    public final hd4 f;
    public final xfk g;
    public final hnl h;
    public final nx5 i;
    public final int j;
    public final Object k;
    public final ef2 l;
    public final Map m;
    public final Map n;
    public qql o;
    public final i4d p;
    public wc4 q;
    public yj4 r;
    public Map s;
    public LinkedHashMap t;
    public zj4 u;
    public final CountDownLatch v;
    public boolean w;
    public final CountDownLatch x;
    public Map y;
    public final LinkedHashMap z;

    public dk4(e3a e3aVar, xj4 xj4Var, w6j w6jVar, gg4 gg4Var, h0l h0lVar, hd4 hd4Var, jpo jpoVar, xfk xfkVar, hnl hnlVar, nx5 nx5Var) {
        this.a = e3aVar;
        this.b = xj4Var;
        this.c = w6jVar;
        this.d = gg4Var;
        this.e = h0lVar;
        this.f = hd4Var;
        this.g = xfkVar;
        this.h = hnlVar;
        this.i = nx5Var;
        bf2 bf2Var = ek4.a;
        bf2Var.getClass();
        this.j = bf2.b.incrementAndGet(bf2Var);
        this.k = new Object();
        this.l = c26.k(Boolean.FALSE);
        this.m = Collections.synchronizedMap(new HashMap());
        this.n = Collections.synchronizedMap(new HashMap());
        this.p = jpoVar != null ? new i4d(jpoVar) : null;
        this.u = zj4.a;
        this.v = new CountDownLatch(1);
        this.x = new CountDownLatch(1);
        this.z = new LinkedHashMap();
    }

    @Override // defpackage.h4j
    public final void a() throws Exception {
        if (this.l.a(Boolean.FALSE, Boolean.TRUE)) {
            toString();
            Trace.beginSection(this + "#onSessionFinalized");
            k();
            g(0L);
            Trace.endSection();
        }
    }

    @Override // defpackage.h4j
    public final void b() {
        toString();
        Trace.beginSection(this + "#onSessionDisconnected");
        e();
        try {
            Trace.beginSection(this + "#onSessionDisconnected Await");
            this.v.await();
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ac4 r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.k
            monitor-enter(r0)
            yj4 r1 = r7.r     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L20
            if (r8 == 0) goto L20
            w6j r1 = r7.c     // Catch: java.lang.Throwable -> L9f
            java.util.Map r2 = r7.m     // Catch: java.lang.Throwable -> L9f
            java.util.Map r3 = r7.n     // Catch: java.lang.Throwable -> L9f
            sa4 r1 = r1.e(r8, r2, r3)     // Catch: java.lang.Throwable -> L9f
            yj4 r2 = new yj4     // Catch: java.lang.Throwable -> L9f
            pyl r3 = new pyl     // Catch: java.lang.Throwable -> L9f
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L9f
            r2.<init>(r8, r3, r1)     // Catch: java.lang.Throwable -> L9f
            r7.r = r2     // Catch: java.lang.Throwable -> L9f
            r1 = r2
        L20:
            zj4 r8 = r7.u     // Catch: java.lang.Throwable -> L9f
            zj4 r2 = defpackage.zj4.c     // Catch: java.lang.Throwable -> L9f
            if (r8 != r2) goto L9d
            if (r1 == 0) goto L9d
            java.util.Map r8 = r7.s     // Catch: java.lang.Throwable -> L9f
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L34
            java.util.LinkedHashMap r8 = r7.t     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto L34
            r8 = r2
            goto L35
        L34:
            r8 = r3
        L35:
            monitor-exit(r0)
            if (r8 == 0) goto L3b
            r7.f(r3)
        L3b:
            java.lang.Object r8 = r7.k
            monitor-enter(r8)
            h0l r0 = r7.e     // Catch: java.lang.Throwable -> L9a
            r0.getClass()     // Catch: java.lang.Throwable -> L9a
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L9a
            qql r0 = r7.o     // Catch: java.lang.Throwable -> L9a
            long r5 = r0.a     // Catch: java.lang.Throwable -> L9a
            long r3 = r3 - r5
            r7.toString()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "%.3f ms"
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L9a
            r5 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r5
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Throwable -> L9a
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L9a
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)     // Catch: java.lang.Throwable -> L9a
            r3 = 0
            java.lang.String.format(r3, r0, r2)     // Catch: java.lang.Throwable -> L9a
            e3a r7 = r7.a     // Catch: java.lang.Throwable -> L9a
            pyl r0 = r1.b     // Catch: java.lang.Throwable -> L9a
            r7.toString()     // Catch: java.lang.Throwable -> L9a
            nak r1 = r7.e     // Catch: java.lang.Throwable -> L9a
            j3a r2 = defpackage.j3a.b     // Catch: java.lang.Throwable -> L9a
            r1.k(r3, r2)     // Catch: java.lang.Throwable -> L9a
            d3a r1 = r7.c     // Catch: java.lang.Throwable -> L9a
            r1.t(r0)     // Catch: java.lang.Throwable -> L9a
            java.util.List r7 = r7.d     // Catch: java.lang.Throwable -> L9a
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L9a
        L81:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L98
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L9a
            o3a r0 = (defpackage.o3a) r0     // Catch: java.lang.Throwable -> L9a
            mf4 r1 = r0.a     // Catch: java.lang.Throwable -> L9a
            nd4 r0 = r0.b     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L94
            r0 = r3
        L94:
            r1.b(r0, r2)     // Catch: java.lang.Throwable -> L9a
            goto L81
        L98:
            monitor-exit(r8)
            return
        L9a:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        L9d:
            monitor-exit(r0)
            return
        L9f:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk4.c(ac4):void");
    }

    public final void d(Map map) {
        synchronized (this.k) {
            zj4 zj4Var = this.u;
            if (zj4Var != zj4.d && zj4Var != zj4.e) {
                n08 n08Var = this.y;
                if (n08Var == null) {
                    n08Var = n08.a;
                }
                m(n08Var, map);
                this.y = map;
                Map map2 = this.s;
                mt5 mt5Var = null;
                if (map2 != null && this.t == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (map2.containsKey(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (linkedHashMap.size() == map2.size()) {
                        this.t = linkedHashMap;
                        na2.B(this.i, null, null, new bz1((byte) 3, (mt5) null, this), 3);
                    }
                }
                na2.B(this.i, null, null, new ak4(this, mt5Var, (byte) 1), 3);
            }
        }
    }

    public final void e() {
        synchronized (this.k) {
            zj4 zj4Var = this.u;
            zj4 zj4Var2 = zj4.d;
            if (zj4Var == zj4Var2 || zj4Var == zj4.e) {
                return;
            }
            this.u = zj4Var2;
            yj4 yj4Var = this.r;
            byte b = 1;
            mt5 mt5Var = null;
            boolean z = false;
            if (yj4Var != null) {
                this.r = null;
            } else {
                if (this.f.d && this.w) {
                    z = true;
                }
                yj4Var = null;
            }
            i4d i4dVar = this.p;
            if (i4dVar != null) {
                i4dVar.D();
            }
            if (z) {
                synchronized (this.k) {
                    yj4Var = this.r;
                    this.r = null;
                }
            }
            Trace.beginSection(this.a + "#onGraphStopping");
            e3a e3aVar = this.a;
            e3aVar.toString();
            nak nakVar = e3aVar.e;
            l3a l3aVar = l3a.b;
            nakVar.k((Object) null, l3aVar);
            e3aVar.c.t(null);
            for (o3a o3aVar : e3aVar.d) {
                mf4 mf4Var = o3aVar.a;
                nd4 nd4Var = o3aVar.b;
                if (nd4Var == null) {
                    nd4Var = null;
                }
                mf4Var.b(nd4Var, l3aVar);
            }
            Trace.endSection();
            if (yj4Var != null) {
                pyl pylVar = yj4Var.b;
                toString();
                Trace.beginSection(this + "#shutdown");
                if (this.f.a) {
                }
                Trace.beginSection(this + "#disconnect");
                yj4Var.c.e();
                Trace.endSection();
                if (this.f.d) {
                }
                Trace.beginSection(this.a + "#onGraphStopped");
                this.a.b();
                Trace.endSection();
                Trace.endSection();
            } else {
                Trace.beginSection(this.a + "#onGraphStopped");
                this.a.b();
                Trace.endSection();
            }
            this.v.countDown();
        }
    }

    public final void f(boolean z) {
        yj4 yj4Var;
        Map map;
        LinkedHashMap linkedHashMap;
        boolean z2;
        synchronized (this.k) {
            yj4Var = this.r;
            map = this.s;
            linkedHashMap = this.t;
        }
        if (yj4Var == null || map == null || linkedHashMap == null) {
            return;
        }
        Trace.beginSection(this + "#finalizeOutputConfigurations");
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        for (Map.Entry entry : map.entrySet()) {
            yfk yfkVar = (yfk) entry.getKey();
            int i = yfkVar.a;
            h81 h81Var = (h81) entry.getValue();
            Object obj = linkedHashMap.get(yfkVar);
            if (obj == null) {
                qp2.n("Required value was null.");
                return;
            }
            h81Var.a.addSurface((Surface) obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add((h81) ((Map.Entry) it.next()).getValue());
        }
        yj4Var.a.g0(CollectionsKt.k0(linkedHashSet));
        synchronized (this.k) {
            if (this.u == zj4.c) {
                this.m.putAll(linkedHashMap);
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (true) {
                    z2 = true;
                    if (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int i2 = ((yfk) entry2.getKey()).a;
                        Surface surface = (Surface) entry2.getValue();
                        cg4 cg4VarH = this.g.h(i2);
                        if (cg4VarH == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (cg4VarH.b.size() != 1) {
                            throw new IllegalStateException("Cannot finalize a multi-output stream!");
                        }
                        this.n.put(new fuf(((wfk) CollectionsKt.Z(cg4VarH.b)).a), surface);
                    } else {
                        this.e.getClass();
                        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                        ArrayList arrayList = new ArrayList(map.size());
                        Iterator it3 = map.entrySet().iterator();
                        while (it3.hasNext()) {
                            yfk yfkVar2 = (yfk) ((Map.Entry) it3.next()).getKey();
                            int i3 = yfkVar2.a;
                            arrayList.add(yfkVar2);
                        }
                        arrayList.toString();
                        toString();
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1));
                    }
                }
            } else {
                z2 = false;
            }
        }
        if (z2 && z) {
            e3a e3aVar = this.a;
            e3aVar.toString();
            e3aVar.c.g.b0(r2a.b);
        }
        Trace.endSection();
    }

    public final void g(long j) throws Exception {
        List<AutoCloseable> listK0;
        boolean zIsTerminated;
        if (j != 0) {
            na2.B(this.i, null, null, new bk4(j, this, null), 3);
            return;
        }
        toString();
        synchronized (this.k) {
            listK0 = CollectionsKt.k0(this.z.values());
            this.z.clear();
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

    public final void h() throws Exception {
        toString();
        Trace.beginSection(this + "#onClosed");
        k();
        this.x.countDown();
        i4d i4dVar = this.p;
        if (i4dVar != null) {
            i4dVar.D();
        }
        Trace.endSection();
    }

    public final void i() throws Exception {
        toString();
        Trace.beginSection(this + "#onConfigureFailed");
        this.a.a(new i3a(9, false));
        k();
        this.x.countDown();
        i4d i4dVar = this.p;
        if (i4dVar != null) {
            i4dVar.D();
        }
        Trace.endSection();
    }

    public final void j(ac4 ac4Var) {
        toString();
        Trace.beginSection(this + "#configure");
        c(ac4Var);
        this.x.countDown();
        i4d i4dVar = this.p;
        if (i4dVar != null) {
            i4dVar.D();
        }
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() throws java.lang.Exception {
        /*
            r7 = this;
            r7.e()
            java.lang.Object r0 = r7.k
            monitor-enter(r0)
            zj4 r1 = r7.u     // Catch: java.lang.Throwable -> L30
            zj4 r2 = defpackage.zj4.e     // Catch: java.lang.Throwable -> L30
            r3 = 0
            if (r1 == r2) goto L23
            wc4 r1 = r7.q     // Catch: java.lang.Throwable -> L30
            r5 = 1
            if (r1 == 0) goto L24
            boolean r1 = r7.w     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L24
            hd4 r1 = r7.f     // Catch: java.lang.Throwable -> L30
            int r1 = r1.c     // Catch: java.lang.Throwable -> L30
            if (r1 == r5) goto L24
            r6 = 2
            if (r1 != r6) goto L23
            r3 = 2000(0x7d0, double:9.88E-321)
            goto L24
        L23:
            r5 = 0
        L24:
            r1 = 0
            r7.q = r1     // Catch: java.lang.Throwable -> L30
            r7.u = r2     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)
            if (r5 == 0) goto L2f
            r7.g(r3)
        L2f:
            return
        L30:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk4.k():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(nt5 r11) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk4.l(nt5):java.lang.Object");
    }

    public final void m(Map map, Map map2) throws Exception {
        Surface surface;
        AutoCloseable autoCloseable;
        boolean zIsTerminated;
        Set setN0 = CollectionsKt.n0(map.values());
        Set setN02 = CollectionsKt.n0(map2.values());
        Iterator it = b5j.d(setN0, setN02).iterator();
        do {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.z;
            if (!zHasNext) {
                for (Surface surface2 : b5j.d(setN02, setN0)) {
                    linkedHashMap.put(surface2, this.d.a(surface2));
                }
                return;
            }
            surface = (Surface) it.next();
            autoCloseable = (AutoCloseable) linkedHashMap.remove(surface);
            if (autoCloseable == null) {
                autoCloseable = null;
            } else if (autoCloseable instanceof AutoCloseable) {
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
        } while (autoCloseable != null);
        kp5.b(surface, " doesn't have a matching surface token!", "Surface ");
    }

    public final String toString() {
        return "CaptureSessionState-" + this.j;
    }
}
