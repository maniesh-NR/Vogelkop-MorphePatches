package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d7f {
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public volatile boolean f;
    public final ReentrantLock a = new ReentrantLock();
    public final ReentrantLock e = new ReentrantLock();

    public d7f(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int[] r13) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r12.a
            r0.lock()
            int r1 = r13.length     // Catch: java.lang.Throwable -> L32
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            r5 = 1
            if (r3 >= r1) goto L23
            r6 = r13[r3]     // Catch: java.lang.Throwable -> L32
            long[] r7 = r12.b     // Catch: java.lang.Throwable -> L32
            r8 = r7[r6]     // Catch: java.lang.Throwable -> L32
            r10 = 1
            long r10 = r10 + r8
            r7[r6] = r10     // Catch: java.lang.Throwable -> L32
            r6 = 0
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L20
            r12.d = r5     // Catch: java.lang.Throwable -> L32
            r4 = r5
        L20:
            int r3 = r3 + 1
            goto L9
        L23:
            if (r4 != 0) goto L2d
            boolean r13 = r12.d     // Catch: java.lang.Throwable -> L32
            if (r13 != 0) goto L2d
            boolean r12 = r12.f     // Catch: java.lang.Throwable -> L32
            if (r12 == 0) goto L2e
        L2d:
            r2 = r5
        L2e:
            r0.unlock()
            return r2
        L32:
            r12 = move-exception
            r0.unlock()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d7f.a(int[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r15) {
        /*
            r14 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r14.a
            r0.lock()
            int r1 = r15.length     // Catch: java.lang.Throwable -> L31
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            r5 = 1
            if (r3 >= r1) goto L22
            r6 = r15[r3]     // Catch: java.lang.Throwable -> L31
            long[] r7 = r14.b     // Catch: java.lang.Throwable -> L31
            r8 = r7[r6]     // Catch: java.lang.Throwable -> L31
            r10 = 1
            long r12 = r8 - r10
            r7[r6] = r12     // Catch: java.lang.Throwable -> L31
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1f
            r14.d = r5     // Catch: java.lang.Throwable -> L31
            r4 = r5
        L1f:
            int r3 = r3 + 1
            goto L9
        L22:
            if (r4 != 0) goto L2c
            boolean r15 = r14.d     // Catch: java.lang.Throwable -> L31
            if (r15 != 0) goto L2c
            boolean r14 = r14.f     // Catch: java.lang.Throwable -> L31
            if (r14 == 0) goto L2d
        L2c:
            r2 = r5
        L2d:
            r0.unlock()
            return r2
        L31:
            r14 = move-exception
            r0.unlock()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d7f.b(int[]):boolean");
    }
}
