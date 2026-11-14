package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class vlj extends gql {
    public static final Object r = new Object();
    public final long e;
    public final long f;
    public final long g = -9223372036854775807L;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final j06 o;
    public final qjd p;
    public final ljd q;

    static {
        ejd ejdVar = new ejd();
        ejdVar.a = "SinglePeriodTimeline";
        ejdVar.b = Uri.EMPTY;
        ejdVar.a();
    }

    public vlj(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, j06 j06Var, qjd qjdVar, ljd ljdVar) {
        this.e = j;
        this.f = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = j06Var;
        qjdVar.getClass();
        this.p = qjdVar;
        this.q = ljdVar;
    }

    @Override // defpackage.gql
    public final int b(Object obj) {
        return r != obj ? -1 : 0;
    }

    @Override // defpackage.gql
    public final dql f(int i, dql dqlVar, boolean z) {
        z4o.A(i, 1);
        dqlVar.i(null, z ? r : null, 0, this.h, -this.j);
        return dqlVar;
    }

    @Override // defpackage.gql
    public final int h() {
        return 1;
    }

    @Override // defpackage.gql
    public final Object l(int i) {
        z4o.A(i, 1);
        return r;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[PHI: r1
      0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.gql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fql m(int r25, defpackage.fql r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.z4o.A(r2, r1)
            long r1 = r0.k
            boolean r14 = r0.m
            if (r14 == 0) goto L2c
            boolean r3 = r0.n
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L29
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
        L29:
            r16 = r5
            goto L2e
        L2c:
            r16 = r1
        L2e:
            java.lang.Object r4 = defpackage.fql.p
            r21 = 0
            long r1 = r0.j
            qjd r5 = r0.p
            j06 r6 = r0.o
            long r7 = r0.e
            long r9 = r0.f
            long r11 = r0.g
            boolean r13 = r0.l
            ljd r15 = r0.q
            r22 = r1
            long r0 = r0.i
            r20 = 0
            r3 = r26
            r18 = r0
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlj.m(int, fql, long):fql");
    }

    @Override // defpackage.gql
    public final int o() {
        return 1;
    }
}
