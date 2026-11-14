package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class xs6 {
    public static final csh p;
    public final fql a;
    public final dql b;
    public final r05 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final l1b m;
    public final ConcurrentHashMap n;
    public long o;

    static {
        a1b a1bVar = h1b.b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        c09.e(6, objArr);
        p = h1b.o(6, objArr);
    }

    public xs6() {
        r05 r05Var = new r05((byte) 3);
        r05Var.d = 0;
        r05Var.e = new h01[100];
        a(1000, 0, "bufferForPlaybackMs", "0");
        a(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        a(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = new fql();
        this.b = new dql();
        this.c = r05Var;
        long jN = tym.N(50000L);
        this.d = jN;
        long jN2 = tym.N(1000L);
        this.e = jN2;
        this.f = jN;
        this.g = jN;
        this.h = jN2;
        this.i = jN2;
        this.j = tym.N(2000L);
        this.k = jN2;
        this.l = tym.N(0L);
        this.n = new ConcurrentHashMap();
        this.m = l1b.h(hsh.d);
        this.o = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        z4o.z(i >= i2, "%s cannot be less than %s", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.zrc r13) {
        /*
            r12 = this;
            fjg r0 = r13.a
            long r1 = r13.d
            java.util.concurrent.ConcurrentHashMap r3 = r12.n
            java.lang.Object r3 = r3.get(r0)
            ws6 r3 = (defpackage.ws6) r3
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r12.n
            java.lang.Object r4 = r4.get(r0)
            ws6 r4 = (defpackage.ws6) r4
            r4.getClass()
            monitor-enter(r4)
            int r5 = r4.d     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r4)
            int r5 = r5 << 16
            java.util.concurrent.ConcurrentHashMap r4 = r12.n
            java.lang.Object r4 = r4.get(r0)
            ws6 r4 = (defpackage.ws6) r4
            r4.getClass()
            int r4 = r4.c
            r6 = 0
            r7 = 1
            if (r5 < r4) goto L33
            r4 = r7
            goto L34
        L33:
            r4 = r6
        L34:
            fjg r5 = defpackage.fjg.c
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L3e
            r4 = r4 ^ r7
            return r4
        L3e:
            gql r0 = r13.b
            jrd r5 = r13.c
            java.lang.Object r5 = r5.a
            dql r8 = r12.b
            dql r5 = r0.g(r5, r8)
            int r5 = r5.c
            fql r8 = r12.a
            r9 = 0
            fql r0 = r0.m(r5, r8, r9)
            qjd r0 = r0.b
            mjd r0 = r0.b
            if (r0 == 0) goto L6e
            android.net.Uri r0 = r0.a
            java.lang.String r0 = r0.getScheme()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L70
            csh r5 = defpackage.xs6.p
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L70
        L6e:
            r0 = r6
            goto L71
        L70:
            r0 = r7
        L71:
            if (r0 == 0) goto L78
            long r8 = r12.e
            long r10 = r12.g
            goto L7c
        L78:
            long r8 = r12.d
            long r10 = r12.f
        L7c:
            float r12 = r13.e
            r13 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 <= 0) goto L8c
            long r12 = defpackage.tym.y(r8, r12)
            long r8 = java.lang.Math.min(r12, r10)
        L8c:
            r12 = 500000(0x7a120, double:2.47033E-318)
            long r8 = java.lang.Math.max(r8, r12)
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 >= 0) goto Laa
            if (r0 != 0) goto L9b
            if (r4 != 0) goto L9c
        L9b:
            r6 = r7
        L9c:
            r3.b = r6
            if (r6 != 0) goto Lb2
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 >= 0) goto Lb2
            java.lang.String r12 = "Target buffer size reached with less than 500ms of buffered media data."
            defpackage.w7d.K(r12)
            goto Lb2
        Laa:
            int r12 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r12 >= 0) goto Lb0
            if (r4 == 0) goto Lb2
        Lb0:
            r3.b = r6
        Lb2:
            boolean r12 = r3.b
            return r12
        Lb5:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb7
            throw r12
        Lb7:
            r12 = move-exception
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xs6.b(zrc):boolean");
    }

    public final void c() {
        boolean zIsEmpty = this.n.isEmpty();
        r05 r05Var = this.c;
        int i = 0;
        if (zIsEmpty) {
            synchronized (r05Var) {
                r05Var.r0(0);
            }
        } else {
            Iterator it = this.n.values().iterator();
            while (it.hasNext()) {
                i += ((ws6) it.next()).c;
            }
            r05Var.r0(i);
        }
    }
}
