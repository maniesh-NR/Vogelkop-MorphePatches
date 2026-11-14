package defpackage;

import android.util.SparseArray;
import java.util.Objects;

/* loaded from: classes.dex */
public class uhi implements hyl {
    public oj9 A;
    public oj9 B;
    public long C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final rhi a;
    public final uuj c;
    public final em7 d;
    public final am7 e;
    public thi f;
    public oj9 g;
    public xl7 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final y03 b = new y03();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public gyl[] o = new gyl[1000];

    public uhi(l45 l45Var, em7 em7Var, am7 am7Var) {
        this.d = em7Var;
        this.e = am7Var;
        this.a = new rhi(l45Var);
        hai haiVar = new hai((byte) 16);
        uuj uujVar = new uuj();
        uujVar.b = new SparseArray();
        uujVar.c = haiVar;
        uujVar.a = -1;
        this.c = uujVar;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.y = true;
        this.x = true;
        this.D = true;
    }

    public final void A(oj9 oj9Var, i16 i16Var) {
        vl7 vl7Var;
        boolean z;
        oj9 oj9Var2;
        oj9 oj9Var3 = this.g;
        if (oj9Var3 == null) {
            z = true;
            vl7Var = null;
        } else {
            vl7Var = oj9Var3.r;
            z = false;
        }
        this.g = oj9Var;
        vl7 vl7Var2 = oj9Var.r;
        em7 em7Var = this.d;
        if (em7Var != null) {
            int iD = em7Var.d(oj9Var);
            nj9 nj9VarA = oj9Var.a();
            nj9VarA.N = iD;
            oj9Var2 = new oj9(nj9VarA);
        } else {
            oj9Var2 = oj9Var;
        }
        i16Var.c = oj9Var2;
        i16Var.b = this.h;
        if (em7Var != null) {
            if (z || !Objects.equals(vl7Var, vl7Var2)) {
                xl7 xl7Var = this.h;
                am7 am7Var = this.e;
                xl7 xl7VarB = em7Var.b(am7Var, oj9Var);
                this.h = xl7VarB;
                i16Var.b = xl7VarB;
                if (xl7Var != null) {
                    xl7Var.d(am7Var);
                }
            }
        }
    }

    public final synchronized long B() {
        return this.s != this.p ? this.j[u(this.s)] : this.C;
    }

    public final int C(i16 i16Var, qj6 qj6Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        y03 y03Var = this.b;
        synchronized (this) {
            qj6Var.f = false;
            i2 = -3;
            if (this.s != this.p) {
                oj9 oj9Var = ((shi) this.c.f(t())).a;
                if (z2 || oj9Var != this.g) {
                    A(oj9Var, i16Var);
                    i2 = -5;
                } else {
                    int iU = u(this.s);
                    if (y(iU)) {
                        qj6Var.b = this.m[iU];
                        if (this.s == this.p - 1 && (z || this.w)) {
                            qj6Var.a(536870912);
                        }
                        qj6Var.g = this.n[iU];
                        y03Var.a = this.l[iU];
                        y03Var.b = this.k[iU];
                        y03Var.c = this.o[iU];
                        i2 = -4;
                    } else {
                        qj6Var.f = true;
                    }
                }
            } else if (z || this.w) {
                qj6Var.b = 4;
                qj6Var.g = Long.MIN_VALUE;
                i2 = -4;
            } else {
                oj9 oj9Var2 = this.B;
                if (oj9Var2 != null && (z2 || oj9Var2 != this.g)) {
                    A(oj9Var2, i16Var);
                    i2 = -5;
                }
            }
        }
        if (i2 == -4 && !qj6Var.d(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                rhi rhiVar = this.a;
                y03 y03Var2 = this.b;
                if (z3) {
                    rhi.e(rhiVar.e, qj6Var, y03Var2, rhiVar.c);
                } else {
                    rhiVar.e = rhi.e(rhiVar.e, qj6Var, y03Var2, rhiVar.c);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void D(boolean z) {
        rhi rhiVar = this.a;
        tr3 tr3Var = rhiVar.d;
        if (((h01) tr3Var.c) != null) {
            l45 l45Var = rhiVar.a;
            synchronized (l45Var) {
                ((xs6) l45Var.c).c.o0(tr3Var);
                tr3 tr3Var2 = tr3Var;
                while (tr3Var2 != null) {
                    h01 h01Var = (h01) tr3Var2.c;
                    h01Var.getClass();
                    l45Var.N(h01Var);
                    tr3Var2 = (tr3) tr3Var2.d;
                    if (tr3Var2 == null || ((h01) tr3Var2.c) == null) {
                        tr3Var2 = null;
                    }
                }
            }
            tr3Var.c = null;
            tr3Var.d = null;
        }
        tr3 tr3Var3 = rhiVar.d;
        int i = rhiVar.b;
        z4o.H(((h01) tr3Var3.c) == null);
        tr3Var3.a = 0L;
        tr3Var3.b = i;
        tr3 tr3Var4 = rhiVar.d;
        rhiVar.e = tr3Var4;
        rhiVar.f = tr3Var4;
        rhiVar.g = 0L;
        l45 l45Var2 = rhiVar.a;
        synchronized (l45Var2) {
            ((xs6) l45Var2.c).c.t0();
        }
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        uuj uujVar = this.c;
        SparseArray sparseArray = (SparseArray) uujVar.b;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((hai) uujVar.c).accept(sparseArray.valueAt(i2));
        }
        uujVar.a = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final synchronized boolean E(int i) {
        synchronized (this) {
            try {
                this.s = 0;
                rhi rhiVar = this.a;
                rhiVar.e = rhiVar.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = this.q;
        if (i < i2 || i > this.p + i2) {
            return false;
        }
        this.t = Long.MIN_VALUE;
        this.s = i - i2;
        return true;
    }

    public final synchronized boolean F(long j, boolean z) throws Throwable {
        uhi uhiVar;
        Throwable th;
        uhi uhiVar2;
        long j2;
        int iO;
        try {
            synchronized (this) {
                try {
                    try {
                        synchronized (this) {
                            try {
                                this.s = 0;
                                rhi rhiVar = this.a;
                                rhiVar.e = rhiVar.d;
                            } finally {
                                th = th;
                                uhiVar = this;
                                while (true) {
                                    Throwable th2 = th;
                                    try {
                                        try {
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                }
                            }
                        }
                        return false;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
            int iU = u(0);
            int i = this.s;
            int i2 = this.p;
            if (!(i != i2) || j < this.n[iU] || (j > this.v && !z)) {
                return false;
            }
            if (this.D) {
                iO = i2 - i;
                int i3 = 0;
                while (true) {
                    if (i3 < iO) {
                        try {
                            if (this.n[iU] >= j) {
                                iO = i3;
                                break;
                            }
                            iU++;
                            if (iU == this.i) {
                                iU = 0;
                            }
                            i3++;
                        } catch (Throwable th7) {
                            th = th7;
                            uhiVar = this;
                            throw th;
                        }
                    } else if (!z) {
                        iO = -1;
                    }
                }
                uhiVar2 = this;
                j2 = j;
            } else {
                uhiVar2 = this;
                j2 = j;
                iO = uhiVar2.o(iU, i2 - i, j2, true);
            }
            if (iO == -1) {
                return false;
            }
            uhiVar2.t = j2;
            uhiVar2.s += iO;
            return true;
        } catch (Throwable th8) {
            th = th8;
            uhiVar = this;
            th = th;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void G(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Lc
            int r0 = r2.s     // Catch: java.lang.Throwable -> L19
            int r0 = r0 + r3
            int r1 = r2.p     // Catch: java.lang.Throwable -> L19
            if (r0 > r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            defpackage.z4o.w(r0)     // Catch: java.lang.Throwable -> L19
            int r0 = r2.s     // Catch: java.lang.Throwable -> L19
            int r0 = r0 + r3
            r2.s = r0     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
        L19:
            r3 = move-exception
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhi.G(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0102 A[Catch: all -> 0x01d9, TryCatch #0 {, blocks: (B:52:0x0087, B:54:0x008b, B:58:0x00a1, B:59:0x00a4, B:63:0x00ac, B:68:0x00e7, B:91:0x0163, B:93:0x016c, B:70:0x0102, B:72:0x010b, B:74:0x0114, B:76:0x0129, B:80:0x0132, B:81:0x0137, B:83:0x013d, B:87:0x014b, B:89:0x0150, B:90:0x0160, B:73:0x0112), top: B:100:0x0087 }] */
    @Override // defpackage.hyl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r10, int r12, int r13, int r14, defpackage.gyl r15) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhi.a(long, int, int, int, gyl):void");
    }

    @Override // defpackage.hyl
    public final void b(g1g g1gVar, int i, int i2) {
        while (i > 0) {
            rhi rhiVar = this.a;
            int iB = rhiVar.b(i);
            tr3 tr3Var = rhiVar.f;
            h01 h01Var = (h01) tr3Var.c;
            g1gVar.k(h01Var.a, ((int) (rhiVar.g - tr3Var.a)) + h01Var.b, iB);
            i -= iB;
            long j = rhiVar.g + iB;
            rhiVar.g = j;
            tr3 tr3Var2 = rhiVar.f;
            if (j == tr3Var2.b) {
                rhiVar.f = (tr3) tr3Var2.d;
            }
        }
    }

    @Override // defpackage.hyl
    public final int d(oc6 oc6Var, int i, boolean z) {
        rhi rhiVar = this.a;
        int iB = rhiVar.b(i);
        tr3 tr3Var = rhiVar.f;
        h01 h01Var = (h01) tr3Var.c;
        int i2 = oc6Var.read(h01Var.a, ((int) (rhiVar.g - tr3Var.a)) + h01Var.b, iB);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            qp2.c();
            return 0;
        }
        long j = rhiVar.g + i2;
        rhiVar.g = j;
        tr3 tr3Var2 = rhiVar.f;
        if (j == tr3Var2.b) {
            rhiVar.f = (tr3) tr3Var2.d;
        }
        return i2;
    }

    @Override // defpackage.hyl
    public final void g(oj9 oj9Var) {
        oj9 oj9VarP = p(oj9Var);
        boolean z = false;
        this.z = false;
        this.A = oj9Var;
        synchronized (this) {
            this.y = false;
            if (!Objects.equals(oj9VarP, this.B)) {
                if (!(((SparseArray) this.c.b).size() == 0)) {
                    SparseArray sparseArray = (SparseArray) this.c.b;
                    if (((shi) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(oj9VarP)) {
                        SparseArray sparseArray2 = (SparseArray) this.c.b;
                        oj9VarP = ((shi) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                        this.B = oj9VarP;
                    }
                    this.D &= dzd.a(oj9VarP.n, oj9VarP.k);
                    this.E = false;
                    z = true;
                }
                this.B = oj9VarP;
                this.D &= dzd.a(oj9VarP.n, oj9VarP.k);
                this.E = false;
                z = true;
            }
        }
        thi thiVar = this.f;
        if (thiVar == null || !z) {
            return;
        }
        thiVar.c();
    }

    public final int h(long j) {
        int i = this.p;
        int iU = u(i - 1);
        while (i > this.s && this.n[iU] >= j) {
            i--;
            iU--;
            if (iU == -1) {
                iU = this.i - 1;
            }
        }
        return i;
    }

    public final long i(int i) {
        this.u = Math.max(this.u, s(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        uuj uujVar = this.c;
        SparseArray sparseArray = (SparseArray) uujVar.b;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((hai) uujVar.c).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = uujVar.a;
            if (i8 > 0) {
                uujVar.a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        return this.k[i9 - 1] + this.l[r7];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r12, boolean r14) throws java.lang.Throwable {
        /*
            r11 = this;
            rhi r0 = r11.a
            monitor-enter(r11)
            int r1 = r11.p     // Catch: java.lang.Throwable -> L39
            r2 = -1
            if (r1 == 0) goto L33
            long[] r4 = r11.n     // Catch: java.lang.Throwable -> L39
            int r6 = r11.r     // Catch: java.lang.Throwable -> L39
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L39
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 < 0) goto L33
            if (r14 == 0) goto L1b
            int r14 = r11.s     // Catch: java.lang.Throwable -> L1d
            if (r14 == r1) goto L1b
            int r1 = r14 + 1
        L1b:
            r7 = r1
            goto L21
        L1d:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L3c
        L21:
            r10 = 0
            r5 = r11
            r8 = r12
            int r11 = r5.o(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L3e
            r12 = -1
            if (r11 != r12) goto L2d
            monitor-exit(r5)
            goto L35
        L2d:
            long r2 = r5.i(r11)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r5)
            goto L35
        L33:
            r5 = r11
            monitor-exit(r5)
        L35:
            r0.a(r2)
            return
        L39:
            r0 = move-exception
            r5 = r11
        L3b:
            r12 = r0
        L3c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3e
            throw r12
        L3e:
            r0 = move-exception
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhi.j(long, boolean):void");
    }

    public final void k() {
        long jI;
        rhi rhiVar = this.a;
        synchronized (this) {
            int i = this.p;
            jI = i == 0 ? -1L : i(i);
        }
        rhiVar.a(jI);
    }

    public final void l(long j) {
        if (this.p == 0) {
            return;
        }
        z4o.w(j > r());
        n(this.q + h(j));
    }

    public final long m(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        z4o.w(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, s(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        uuj uujVar = this.c;
        SparseArray sparseArray = (SparseArray) uujVar.b;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((hai) uujVar.c).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        uujVar.a = sparseArray.size() > 0 ? Math.min(uujVar.a, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        return this.k[u(i6 - 1)] + this.l[r9];
    }

    public final void n(int i) {
        tr3 tr3Var;
        rhi rhiVar = this.a;
        long jM = m(i);
        int i2 = rhiVar.b;
        z4o.w(jM <= rhiVar.g);
        rhiVar.g = jM;
        if (jM != 0) {
            tr3 tr3Var2 = rhiVar.d;
            if (jM != tr3Var2.a) {
                while (true) {
                    long j = rhiVar.g;
                    long j2 = tr3Var2.b;
                    tr3Var = (tr3) tr3Var2.d;
                    if (j <= j2) {
                        break;
                    } else {
                        tr3Var2 = tr3Var;
                    }
                }
                tr3Var.getClass();
                if (((h01) tr3Var.c) != null) {
                    l45 l45Var = rhiVar.a;
                    synchronized (l45Var) {
                        ((xs6) l45Var.c).c.o0(tr3Var);
                        tr3 tr3Var3 = tr3Var;
                        while (tr3Var3 != null) {
                            h01 h01Var = (h01) tr3Var3.c;
                            h01Var.getClass();
                            l45Var.N(h01Var);
                            tr3Var3 = (tr3) tr3Var3.d;
                            if (tr3Var3 == null || ((h01) tr3Var3.c) == null) {
                                tr3Var3 = null;
                            }
                        }
                    }
                    tr3Var.c = null;
                    tr3Var.d = null;
                }
                tr3 tr3Var4 = new tr3(tr3Var2.b, i2);
                tr3Var2.d = tr3Var4;
                if (rhiVar.g == tr3Var2.b) {
                    tr3Var2 = tr3Var4;
                }
                rhiVar.f = tr3Var2;
                if (rhiVar.e == tr3Var) {
                    rhiVar.e = tr3Var4;
                    return;
                }
                return;
            }
        }
        tr3 tr3Var5 = rhiVar.d;
        if (((h01) tr3Var5.c) != null) {
            l45 l45Var2 = rhiVar.a;
            synchronized (l45Var2) {
                ((xs6) l45Var2.c).c.o0(tr3Var5);
                tr3 tr3Var6 = tr3Var5;
                while (tr3Var6 != null) {
                    h01 h01Var2 = (h01) tr3Var6.c;
                    h01Var2.getClass();
                    l45Var2.N(h01Var2);
                    tr3Var6 = (tr3) tr3Var6.d;
                    if (tr3Var6 == null || ((h01) tr3Var6.c) == null) {
                        tr3Var6 = null;
                    }
                }
            }
            tr3Var5.c = null;
            tr3Var5.d = null;
        }
        tr3 tr3Var7 = new tr3(rhiVar.g, i2);
        rhiVar.d = tr3Var7;
        rhiVar.e = tr3Var7;
        rhiVar.f = tr3Var7;
    }

    public final int o(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public oj9 p(oj9 oj9Var) {
        if (this.F == 0 || oj9Var.s == Long.MAX_VALUE) {
            return oj9Var;
        }
        nj9 nj9VarA = oj9Var.a();
        nj9VarA.r = oj9Var.s + this.F;
        return new oj9(nj9VarA);
    }

    public final synchronized long q() {
        return this.v;
    }

    public final synchronized long r() {
        return Math.max(this.u, s(this.s));
    }

    public final long s(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iU = u(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iU]);
            if ((this.m[iU] & 1) != 0) {
                return jMax;
            }
            iU--;
            if (iU == -1) {
                iU = this.i - 1;
            }
        }
        return jMax;
    }

    public final int t() {
        return this.q + this.s;
    }

    public final int u(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int v(long j, boolean z) {
        try {
            try {
                int iU = u(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[iU]) {
                    return 0;
                }
                if (j > this.v && z) {
                    return i2 - i;
                }
                int iO = o(iU, i2 - i, j, true);
                if (iO == -1) {
                    return 0;
                }
                return iO;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized oj9 w() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean x(boolean z) {
        oj9 oj9Var;
        boolean z2 = false;
        if (this.s != this.p) {
            if (((shi) this.c.f(t())).a != this.g) {
                return true;
            }
            return y(u(this.s));
        }
        if (z || this.w || ((oj9Var = this.B) != null && oj9Var != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean y(int i) {
        xl7 xl7Var = this.h;
        if (xl7Var == null || xl7Var.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.b();
    }

    public final void z() {
        xl7 xl7Var = this.h;
        if (xl7Var == null || xl7Var.getState() != 1) {
            return;
        }
        wl7 error = this.h.getError();
        error.getClass();
        throw error;
    }
}
