package defpackage;

/* loaded from: classes.dex */
public final class xbc {
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final int a;
    public final long b;
    public final Object c;
    public final int d;
    public final sjd e;
    public final a4j f;

    static {
        String str = tym.a;
        g = "0";
        h = "1";
        i = "2";
        j = "3";
        k = "4";
        l = "5";
    }

    public xbc(int i2, long j2, sjd sjdVar, a4j a4jVar, Object obj, int i3) {
        this.a = i2;
        this.b = j2;
        this.e = sjdVar;
        this.f = a4jVar;
        this.c = obj;
        this.d = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.xbc a(android.os.Bundle r10) {
        /*
            java.lang.String r0 = defpackage.xbc.g
            r1 = 0
            int r3 = r10.getInt(r0, r1)
            java.lang.String r0 = defpackage.xbc.h
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.getLong(r0, r4)
            java.lang.String r0 = defpackage.xbc.i
            android.os.Bundle r0 = r10.getBundle(r0)
            r2 = 0
            if (r0 != 0) goto L1c
            r6 = r2
            goto L21
        L1c:
            sjd r0 = defpackage.sjd.a(r0)
            r6 = r0
        L21:
            java.lang.String r0 = defpackage.xbc.l
            android.os.Bundle r0 = r10.getBundle(r0)
            if (r0 == 0) goto L2f
            a4j r0 = defpackage.a4j.a(r0)
        L2d:
            r7 = r0
            goto L38
        L2f:
            if (r3 == 0) goto L37
            a4j r0 = new a4j
            r0.<init>(r3)
            goto L2d
        L37:
            r7 = r2
        L38:
            java.lang.String r0 = defpackage.xbc.k
            int r9 = r10.getInt(r0)
            r0 = 1
            if (r9 == r0) goto L86
            java.lang.String r0 = defpackage.xbc.j
            r8 = 2
            if (r9 == r8) goto L7c
            r8 = 3
            if (r9 == r8) goto L50
            r10 = 4
            if (r9 == r10) goto L86
            h9o.e()
            return r2
        L50:
            android.os.IBinder r10 = r10.getBinder(r0)
            if (r10 == 0) goto L86
            h1b r10 = defpackage.k14.a(r10)
            z0b r0 = h1b.p()
        L5e:
            int r2 = r10.size()
            if (r1 >= r2) goto L77
            java.lang.Object r2 = r10.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r2.getClass()
            qjd r2 = defpackage.qjd.b(r2)
            r0.c(r2)
            int r1 = r1 + 1
            goto L5e
        L77:
            csh r2 = r0.g()
            goto L86
        L7c:
            android.os.Bundle r10 = r10.getBundle(r0)
            if (r10 == 0) goto L86
            qjd r2 = defpackage.qjd.b(r10)
        L86:
            r8 = r2
            xbc r2 = new xbc
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbc.a(android.os.Bundle):xbc");
    }
}
