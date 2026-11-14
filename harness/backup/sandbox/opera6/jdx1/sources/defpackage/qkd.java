package defpackage;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qkd {
    public final el6 c;
    public final szk d;
    public final uk6 e;
    public long f;
    public int g;
    public boolean h;
    public okd i;
    public okd j;
    public okd k;
    public okd l;
    public okd m;
    public int n;
    public Object o;
    public long p;
    public final dql a = new dql();
    public final fql b = new fql();
    public ArrayList q = new ArrayList();

    public qkd(el6 el6Var, szk szkVar, uk6 uk6Var) {
        this.c = el6Var;
        this.d = szkVar;
        this.e = uk6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jrd o(defpackage.gql r14, java.lang.Object r15, long r16, long r18, defpackage.fql r20, defpackage.dql r21) {
        /*
            r0 = r16
            r2 = r20
            r4 = r21
            r14.g(r15, r4)
            int r5 = r4.c
            r14.n(r5, r2)
            int r5 = r14.b(r15)
            r7 = r15
        L13:
            to r3 = r4.g
            int r3 = r3.a
            r6 = -1
            if (r3 == 0) goto L6b
            r8 = 1
            r9 = 0
            if (r3 != r8) goto L24
            boolean r10 = r4.g(r9)
            if (r10 != 0) goto L6b
        L24:
            to r10 = r4.g
            int r10 = r10.d
            boolean r10 = r4.h(r10)
            if (r10 == 0) goto L6b
            r10 = 0
            int r12 = r4.c(r10)
            if (r12 != r6) goto L6b
            long r12 = r4.d
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r12 = r3 + (-1)
            boolean r12 = r4.g(r12)
            if (r12 == 0) goto L46
            r12 = 2
            goto L47
        L46:
            r12 = r8
        L47:
            int r3 = r3 - r12
        L48:
            if (r9 > r3) goto L56
            to r12 = r4.g
            ro r12 = r12.a(r9)
            long r12 = r12.j
            long r10 = r10 + r12
            int r9 = r9 + 1
            goto L48
        L56:
            long r12 = r4.d
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 > 0) goto L6b
        L5c:
            int r3 = r2.n
            if (r5 > r3) goto L6b
            r14.f(r5, r4, r8)
            java.lang.Object r7 = r4.b
            r7.getClass()
            int r5 = r5 + 1
            goto L13
        L6b:
            r14.g(r7, r4)
            int r10 = r4.c(r0)
            if (r10 != r6) goto L80
            int r14 = r4.b(r0)
            jrd r0 = new jrd
            r8 = r18
            r0.<init>(r14, r8, r7)
            return r0
        L80:
            r8 = r18
            int r11 = r4.f(r10)
            jrd r6 = new jrd
            r12 = -1
            r6.<init>(r7, r8, r10, r11, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkd.o(gql, java.lang.Object, long, long, fql, dql):jrd");
    }

    public final okd a() {
        okd okdVar = this.i;
        if (okdVar == null) {
            return null;
        }
        if (okdVar == this.j) {
            this.j = okdVar.m;
        }
        if (okdVar == this.k) {
            this.k = okdVar.m;
        }
        okdVar.i();
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            this.l = null;
            okd okdVar2 = this.i;
            this.o = okdVar2.b;
            this.p = okdVar2.g.a.d;
        }
        this.i = this.i.m;
        l();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        okd okdVar = this.i;
        okdVar.getClass();
        this.o = okdVar.b;
        this.p = okdVar.g.a.d;
        while (okdVar != null) {
            okdVar.i();
            okdVar = okdVar.m;
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pkd c(defpackage.gql r21, defpackage.okd r22, long r23) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkd.c(gql, okd, long):pkd");
    }

    public final pkd d(gql gqlVar, okd okdVar, long j) {
        dql dqlVar;
        gql gqlVar2;
        pkd pkdVar = okdVar.g;
        long j2 = (okdVar.p + pkdVar.e) - j;
        if (pkdVar.h) {
            return c(gqlVar, okdVar, j2);
        }
        jrd jrdVar = pkdVar.a;
        Object obj = jrdVar.a;
        int i = jrdVar.e;
        dql dqlVar2 = this.a;
        gqlVar.g(obj, dqlVar2);
        boolean z = pkdVar.g;
        if (!jrdVar.b()) {
            if (i != -1 && dqlVar2.g(i)) {
                return c(gqlVar, okdVar, j2);
            }
            int iF = dqlVar2.f(i);
            boolean z2 = dqlVar2.h(i) && dqlVar2.e(i, iF) == 3;
            if (iF != dqlVar2.g.a(i).b && !z2) {
                return f(gqlVar, jrdVar.a, jrdVar.e, iF, pkdVar.e, jrdVar.d, z);
            }
            gqlVar.g(obj, dqlVar2);
            long jD = dqlVar2.d(i);
            return g(gqlVar, jrdVar.a, jD == Long.MIN_VALUE ? dqlVar2.d : dqlVar2.g.a(i).j + jD, pkdVar.e, jrdVar.d, false);
        }
        int i2 = jrdVar.b;
        int i3 = dqlVar2.g.a(i2).b;
        if (i3 == -1) {
            return null;
        }
        int iA = dqlVar2.g.a(i2).a(jrdVar.c);
        if (iA < i3) {
            return f(gqlVar, jrdVar.a, i2, iA, pkdVar.c, jrdVar.d, z);
        }
        long jLongValue = pkdVar.c;
        if (jLongValue == -9223372036854775807L) {
            Pair pairJ = gqlVar.j(this.b, dqlVar2, dqlVar2.c, -9223372036854775807L, Math.max(0L, j2));
            dqlVar = dqlVar2;
            gqlVar2 = gqlVar;
            if (pairJ == null) {
                return null;
            }
            jLongValue = ((Long) pairJ.second).longValue();
        } else {
            dqlVar = dqlVar2;
            gqlVar2 = gqlVar;
        }
        int i4 = jrdVar.b;
        gqlVar2.g(obj, dqlVar);
        long jD2 = dqlVar.d(i4);
        return g(gqlVar, jrdVar.a, Math.max(jD2 == Long.MIN_VALUE ? dqlVar.d : dqlVar.g.a(i4).j + jD2, jLongValue), pkdVar.c, jrdVar.d, z);
    }

    public final pkd e(gql gqlVar, jrd jrdVar, long j, long j2) {
        gqlVar.g(jrdVar.a, this.a);
        boolean zB = jrdVar.b();
        Object obj = jrdVar.a;
        return zB ? f(gqlVar, obj, jrdVar.b, jrdVar.c, j, jrdVar.d, false) : g(gqlVar, obj, j2, j, jrdVar.d, false);
    }

    public final pkd f(gql gqlVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        jrd jrdVar = new jrd(obj, j2, i, i2, -1);
        dql dqlVar = this.a;
        long jA = gqlVar.g(obj, dqlVar).a(i, i2);
        long jMax = i2 == dqlVar.f(i) ? dqlVar.g.b : 0L;
        boolean zH = dqlVar.h(i);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new pkd(jrdVar, jMax, j, -9223372036854775807L, jA, z, zH, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pkd g(defpackage.gql r27, java.lang.Object r28, long r29, long r31, long r33, boolean r35) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkd.g(gql, java.lang.Object, long, long, long, boolean):pkd");
    }

    public final pkd h(gql gqlVar, pkd pkdVar) {
        boolean z;
        jrd jrdVar = pkdVar.a;
        int i = jrdVar.e;
        boolean zH = false;
        boolean z2 = !jrdVar.b() && i == -1;
        int i2 = jrdVar.b;
        boolean zJ = j(gqlVar, jrdVar);
        boolean zI = i(gqlVar, jrdVar, z2);
        Object obj = jrdVar.a;
        dql dqlVar = this.a;
        gqlVar.g(obj, dqlVar);
        long jD = (jrdVar.b() || i == -1) ? -9223372036854775807L : dqlVar.d(i);
        long jA = jrdVar.b() ? dqlVar.a(i2, jrdVar.c) : (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? dqlVar.d : jD;
        if (!jrdVar.b()) {
            if (i != -1 && dqlVar.h(i)) {
                z = true;
            }
            return new pkd(jrdVar, pkdVar.b, pkdVar.c, jD, jA, pkdVar.f, z, z2, zJ, zI);
        }
        zH = dqlVar.h(i2);
        z = zH;
        return new pkd(jrdVar, pkdVar.b, pkdVar.c, jD, jA, pkdVar.f, z, z2, zJ, zI);
    }

    public final boolean i(gql gqlVar, jrd jrdVar, boolean z) {
        int iB = gqlVar.b(jrdVar.a);
        dql dqlVar = this.a;
        int i = gqlVar.f(iB, dqlVar, false).c;
        fql fqlVar = this.b;
        return !gqlVar.m(i, fqlVar, 0L).h && gqlVar.d(iB, dqlVar, fqlVar, this.g, this.h) == -1 && z;
    }

    public final boolean j(gql gqlVar, jrd jrdVar) {
        boolean z = !jrdVar.b() && jrdVar.e == -1;
        Object obj = jrdVar.a;
        if (z) {
            if (gqlVar.m(gqlVar.g(obj, this.a).c, this.b, 0L).n == gqlVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        okd okdVar = this.m;
        if (okdVar == null || okdVar.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                okd okdVar2 = (okd) this.q.get(i);
                if (!okdVar2.h()) {
                    this.m = okdVar2;
                    return;
                }
            }
        }
    }

    public final void l() {
        z0b z0bVarP = h1b.p();
        for (okd okdVar = this.i; okdVar != null; okdVar = okdVar.m) {
            z0bVarP.c(okdVar.g.a);
        }
        okd okdVar2 = this.j;
        this.d.c(new jbd(this, z0bVarP, okdVar2 == null ? null : okdVar2.g.a, (byte) 2));
    }

    public final void m(long j) {
        okd okdVar = this.l;
        if (okdVar != null) {
            z4o.H(okdVar.m == null);
            if (okdVar.e) {
                okdVar.a.reevaluateBuffer(j - okdVar.p);
            }
        }
    }

    public final int n(okd okdVar) {
        okdVar.getClass();
        int i = 0;
        if (okdVar != this.l) {
            this.l = okdVar;
            while (true) {
                okdVar = okdVar.m;
                if (okdVar == null) {
                    break;
                }
                okd okdVar2 = this.j;
                if (okdVar == okdVar2) {
                    okdVar2 = this.i;
                    this.j = okdVar2;
                    this.k = okdVar2;
                    i = 3;
                }
                if (okdVar == this.k) {
                    this.k = okdVar2;
                    i |= 2;
                }
                okdVar.i();
                this.n--;
            }
            okd okdVar3 = this.l;
            okdVar3.getClass();
            if (okdVar3.m != null) {
                okdVar3.b();
                okdVar3.m = null;
                okdVar3.c();
            }
            l();
        }
        return i;
    }

    public final jrd p(gql gqlVar, Object obj, long j) {
        long jQ;
        int iB;
        dql dqlVar = this.a;
        int i = gqlVar.g(obj, dqlVar).c;
        Object obj2 = this.o;
        if (obj2 == null || (iB = gqlVar.b(obj2)) == -1 || gqlVar.f(iB, dqlVar, false).c != i) {
            okd okdVar = this.i;
            while (true) {
                if (okdVar == null) {
                    okd okdVar2 = this.i;
                    while (true) {
                        if (okdVar2 != null) {
                            int iB2 = gqlVar.b(okdVar2.b);
                            if (iB2 != -1 && gqlVar.f(iB2, dqlVar, false).c == i) {
                                jQ = okdVar2.g.a.d;
                                break;
                            }
                            okdVar2 = okdVar2.m;
                        } else {
                            jQ = q(obj);
                            if (jQ == -1) {
                                jQ = this.f;
                                this.f = 1 + jQ;
                                if (this.i == null) {
                                    this.o = obj;
                                    this.p = jQ;
                                }
                            }
                        }
                    }
                } else {
                    if (okdVar.b.equals(obj)) {
                        jQ = okdVar.g.a.d;
                        break;
                    }
                    okdVar = okdVar.m;
                }
            }
        } else {
            jQ = this.p;
        }
        gqlVar.g(obj, dqlVar);
        int i2 = dqlVar.c;
        fql fqlVar = this.b;
        gqlVar.n(i2, fqlVar);
        Object obj3 = obj;
        boolean z = false;
        for (int iB3 = gqlVar.b(obj); iB3 >= fqlVar.m; iB3--) {
            gqlVar.f(iB3, dqlVar, true);
            boolean z2 = dqlVar.g.a > 0;
            z |= z2;
            if (dqlVar.c(dqlVar.d) != -1) {
                obj3 = dqlVar.b;
                obj3.getClass();
            }
            if (z && (!z2 || dqlVar.d != 0)) {
                break;
            }
        }
        return o(gqlVar, obj3, j, jQ, fqlVar, dqlVar);
    }

    public final long q(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            okd okdVar = (okd) this.q.get(i);
            if (okdVar.b.equals(obj)) {
                return okdVar.g.a.d;
            }
        }
        return -1L;
    }

    public final int r(gql gqlVar) {
        gql gqlVar2;
        okd okdVar;
        okd okdVar2 = this.i;
        if (okdVar2 == null) {
            return 0;
        }
        int iB = gqlVar.b(okdVar2.b);
        while (true) {
            gqlVar2 = gqlVar;
            iB = gqlVar2.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                okdVar = okdVar2.m;
                if (okdVar == null || okdVar2.g.h) {
                    break;
                }
                okdVar2 = okdVar;
            }
            if (iB == -1 || okdVar == null || gqlVar2.b(okdVar.b) != iB) {
                break;
            }
            okdVar2 = okdVar;
            gqlVar = gqlVar2;
        }
        int iN = n(okdVar2);
        okdVar2.g = h(gqlVar2, okdVar2.g);
        return iN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b1, code lost:
    
        return n(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(defpackage.gql r18, long r19, long r21, long r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            okd r2 = r0.i
            r3 = 0
        L7:
            r4 = 0
            if (r2 == 0) goto Lb2
            pkd r5 = r2.g
            if (r3 != 0) goto L13
            pkd r3 = r0.h(r1, r5)
            goto L2e
        L13:
            r6 = r19
            pkd r8 = r0.d(r1, r3, r6)
            if (r8 == 0) goto Lad
            long r9 = r5.b
            long r11 = r8.b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto Lad
            jrd r9 = r5.a
            jrd r10 = r8.a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lad
            r3 = r8
        L2e:
            long r8 = r3.e
            long r10 = r5.c
            long r12 = r5.e
            pkd r10 = r3.a(r10)
            r2.g = r10
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 == 0) goto La4
            r2.k()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L50
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L53
        L50:
            long r10 = r2.p
            long r8 = r8 + r10
        L53:
            okd r1 = r0.j
            r10 = 1
            r14 = -9223372036854775808
            if (r2 != r1) goto L6a
            pkd r1 = r2.g
            boolean r1 = r1.g
            if (r1 != 0) goto L6a
            int r1 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r1 == 0) goto L68
            int r1 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r1 < 0) goto L6a
        L68:
            r1 = r10
            goto L6b
        L6a:
            r1 = r4
        L6b:
            okd r11 = r0.k
            if (r2 != r11) goto L79
            int r11 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r11 == 0) goto L77
            int r8 = (r23 > r8 ? 1 : (r23 == r8 ? 0 : -1))
            if (r8 < 0) goto L79
        L77:
            r8 = r10
            goto L7a
        L79:
            r8 = r4
        L7a:
            int r0 = r0.n(r2)
            if (r0 == 0) goto L81
            return r0
        L81:
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L97
            long r11 = r5.d
            int r2 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r2 != 0) goto L97
            long r2 = r3.d
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 == 0) goto L97
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L97
            r2 = r10
            goto L98
        L97:
            r2 = r4
        L98:
            if (r1 == 0) goto L9f
            if (r0 != 0) goto L9e
            if (r2 == 0) goto L9f
        L9e:
            r4 = r10
        L9f:
            if (r8 == 0) goto La3
            r4 = r4 | 2
        La3:
            return r4
        La4:
            okd r3 = r2.m
            r16 = r3
            r3 = r2
            r2 = r16
            goto L7
        Lad:
            int r0 = r0.n(r3)
            return r0
        Lb2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkd.s(gql, long, long, long):int");
    }
}
