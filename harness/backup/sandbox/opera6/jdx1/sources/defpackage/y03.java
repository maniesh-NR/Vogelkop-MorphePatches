package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class y03 {
    public int a;
    public long b;
    public Object c;

    public y03(byte b) {
        switch (b) {
            case 3:
                cpj cpjVar = cpj.b;
                if (cpjVar == null) {
                    Pattern pattern = yym.b;
                    cpjVar = new cpj((byte) 4);
                    cpj.b = cpjVar;
                }
                yym yymVar = yym.c;
                if (yymVar == null) {
                    yymVar = new yym(cpjVar);
                    yym.c = yymVar;
                }
                this.c = yymVar;
                break;
            default:
                this.c = new Object();
                this.b = Long.MIN_VALUE;
                break;
        }
    }

    public y03(long j) {
        r2 r2Var = new r2(1, uih.a, tih.class, "nextLong", "nextLong(J)J", 0, (byte) 10);
        this.b = j;
        this.c = r2Var;
    }

    public final long a() {
        int i = this.a;
        if (i == 0) {
            pn7.b.getClass();
            return 0L;
        }
        on7 on7Var = pn7.b;
        int i2 = i - 1;
        if (i2 > 63) {
            i2 = 63;
        }
        pn7 pn7Var = new pn7(pn7.m(cs5.y0(1 << i2, un7.e), cs5.y0(((Number) ((r2) this.c).invoke(1000L)).longValue(), un7.d)));
        pn7.b.getClass();
        return djh.f(pn7Var, new pn7(0L), new pn7(this.b)).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.a     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r4.c     // Catch: java.lang.Throwable -> L1f
            yym r0 = (yym) r0     // Catch: java.lang.Throwable -> L1f
            cpj r0 = r0.a     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1f
            long r2 = r4.b     // Catch: java.lang.Throwable -> L1f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L1a
            r0 = 0
            goto L1b
        L1a:
            r0 = 1
        L1b:
            monitor-exit(r4)
            return r0
        L1d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
            throw r0
        L1f:
            r0 = move-exception
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y03.b():boolean");
    }

    public final synchronized void c(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                try {
                    this.a = 0;
                } finally {
                }
            }
            return;
        }
        this.a++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                try {
                    jMin = (long) Math.min(Math.pow(2.0d, this.a) + ((long) (Math.random() * 1000.0d)), 1800000.0d);
                } finally {
                }
            } else {
                jMin = 86400000;
            }
            ((yym) this.c).a.getClass();
            this.b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
