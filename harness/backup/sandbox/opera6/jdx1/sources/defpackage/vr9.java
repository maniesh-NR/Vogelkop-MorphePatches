package defpackage;

import androidx.fragment.app.Fragment;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class vr9 implements Runnable, ywh {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;

    public /* synthetic */ vr9(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public vr9(bl9 bl9Var, Fragment fragment) {
        this.a = (byte) 12;
        this.b = fragment;
        Objects.requireNonNull(bl9Var);
        this.c = bl9Var;
    }

    public /* synthetic */ vr9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ vr9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj3;
    }

    public vr9(Runnable runnable, int i) {
        this.a = (byte) 6;
        this.c = new AtomicInteger(i);
        this.b = runnable;
    }

    public vr9(ne5 ne5Var) {
        this.a = (byte) 24;
        this.c = ne5Var;
        this.b = new ArrayList();
    }

    public vr9(s28 s28Var, k25 k25Var) {
        this.a = (byte) 16;
        this.b = k25Var;
        Objects.requireNonNull(s28Var);
        this.c = s28Var;
    }

    public vr9(s9i s9iVar) {
        this.a = (byte) 8;
        this.c = s9iVar;
        this.b = new ArrayDeque(1);
    }

    public vr9(uy8 uy8Var, xqe xqeVar) {
        this.a = (byte) 11;
        this.b = xqeVar;
        Objects.requireNonNull(uy8Var);
        this.c = uy8Var;
    }

    public vr9(z1j z1jVar) {
        this.a = (byte) 18;
        this.c = z1jVar;
    }

    private final void b() {
        try {
            ((Runnable) this.c).run();
            synchronized (((op1) this.b).d) {
                ((op1) this.b).a();
            }
        } catch (Throwable th) {
            synchronized (((op1) this.b).d) {
                ((op1) this.b).a();
                throw th;
            }
        }
    }

    private final void c() {
        h5o h5oVar;
        t1h t1hVar = ((qzk) this.c).b.f;
        String str = (String) this.b;
        synchronized (t1hVar.k) {
            z5o z5oVarC = t1hVar.c(str);
            h5oVar = z5oVarC != null ? z5oVarC.a : null;
        }
        if (h5oVar == null || !h5oVar.b()) {
            return;
        }
        synchronized (((qzk) this.c).d) {
            ((qzk) this.c).g.put(new w4o(h5oVar.a, h5oVar.t), h5oVar);
            qzk qzkVar = (qzk) this.c;
            ((qzk) this.c).h.put(new w4o(h5oVar.a, h5oVar.t), q4o.a(qzkVar.i, h5oVar, qzkVar.c.b, qzkVar));
        }
    }

    public final void a(z7 z7Var, z4o z4oVar) {
        k82 k82Var = new k82(z4oVar, this);
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.addLast(new iv(this, z7Var, k82Var, (byte) 3));
        if (zIsEmpty) {
            ((Runnable) arrayDeque.getFirst()).run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        defpackage.z1j.f.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> L7f
            z1j r2 = (defpackage.z1j) r2     // Catch: java.lang.Throwable -> L7f
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L7f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7f
            r3 = 1
            if (r0 != 0) goto L23
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L7d
            z1j r0 = (defpackage.z1j) r0     // Catch: java.lang.Throwable -> L7d
            int r4 = r0.c     // Catch: java.lang.Throwable -> L7d
            r5 = 4
            if (r4 != r5) goto L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L43
            goto L3c
        L19:
            long r6 = r0.d     // Catch: java.lang.Throwable -> L7d
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L7d
            r0.c = r5     // Catch: java.lang.Throwable -> L7d
            r0 = r3
        L23:
            java.lang.Object r4 = r10.c     // Catch: java.lang.Throwable -> L7d
            z1j r4 = (defpackage.z1j) r4     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayDeque r4 = r4.b     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L7d
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L7d
            r10.b = r4     // Catch: java.lang.Throwable -> L7d
            if (r4 != 0) goto L44
            java.lang.Object r10 = r10.c     // Catch: java.lang.Throwable -> L7d
            z1j r10 = (defpackage.z1j) r10     // Catch: java.lang.Throwable -> L7d
            r10.c = r3     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L43
        L3c:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L43:
            return
        L44:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L7f
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L77
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L77
            r3.run()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L77
            goto L74
        L53:
            r3 = move-exception
            y6c r4 = defpackage.z1j.f     // Catch: java.lang.Throwable -> L77
            java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L77
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L77
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r10.b     // Catch: java.lang.Throwable -> L77
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L77
            r6.append(r7)     // Catch: java.lang.Throwable -> L77
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L77
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L77
        L74:
            r10.b = r2     // Catch: java.lang.Throwable -> L7f
            goto L2
        L77:
            r0 = move-exception
            r10.b = r2     // Catch: java.lang.Throwable -> L7f
            throw r0     // Catch: java.lang.Throwable -> L7f
        L7b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            throw r10     // Catch: java.lang.Throwable -> L7f
        L7d:
            r10 = move-exception
            goto L7b
        L7f:
            r10 = move-exception
            if (r1 == 0) goto L89
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L89:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr9.d():void");
    }

    public final void h(z7 z7Var, y7 y7Var) {
        z8b z8bVar = new z8b(y7Var, this);
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.addLast(new iv(this, z7Var, z8bVar, (byte) 4));
        if (zIsEmpty) {
            ((Runnable) arrayDeque.getFirst()).run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x0545  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr9.run():void");
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ua7 ua7Var = new ua7(vr9.class.getSimpleName());
                x77 x77Var = new x77((byte) 25, false);
                ((x77) ua7Var.d).d = x77Var;
                ua7Var.d = x77Var;
                x77Var.c = (qr9) obj;
                return ua7Var.toString();
            case 18:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((z1j) obj).c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
