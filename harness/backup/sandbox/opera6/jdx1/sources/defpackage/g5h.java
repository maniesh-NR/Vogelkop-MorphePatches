package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g5h implements nkd, en8, osc, usc, thi {
    public static final Map R;
    public static final oj9 S;
    public boolean A;
    public vzk B;
    public twi C;
    public long D;
    public boolean E;
    public byte F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public boolean K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public final Uri a;
    public final ed6 b;
    public final em7 c;
    public final i06 d;
    public final ro9 e;
    public final am7 f;
    public final j5h g;
    public final l45 h;
    public final String i;
    public final long j = 1048576;
    public final oj9 k;
    public final long l;
    public final qb7 m;
    public final l45 n;
    public final rj5 o;
    public final z4h p;
    public final z4h q;
    public final Handler r;
    public mkd s;
    public jua t;
    public c5h[] u;
    public uhi[] v;
    public f5h[] w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        R = Collections.unmodifiableMap(map);
        nj9 nj9Var = new nj9();
        nj9Var.a = "icy";
        nj9Var.m = dzd.p("application/x-icy");
        S = new oj9(nj9Var);
    }

    public g5h(Uri uri, ed6 ed6Var, l45 l45Var, em7 em7Var, am7 am7Var, i06 i06Var, ro9 ro9Var, j5h j5hVar, l45 l45Var2, String str, oj9 oj9Var, long j, enb enbVar) {
        this.a = uri;
        this.b = ed6Var;
        this.c = em7Var;
        this.f = am7Var;
        this.d = i06Var;
        this.e = ro9Var;
        this.g = j5hVar;
        this.h = l45Var2;
        this.i = str;
        this.k = oj9Var;
        this.m = enbVar != null ? new qb7(enbVar) : new qb7("ProgressiveMediaPeriod");
        this.n = l45Var;
        this.l = j;
        this.o = new rj5(0);
        this.p = new z4h(this, (byte) 1);
        this.q = new z4h(this, (byte) 2);
        this.r = tym.p(null);
        this.w = new f5h[0];
        this.v = new uhi[0];
        this.u = new c5h[0];
        this.M = -9223372036854775807L;
        this.F = (byte) 1;
    }

    @Override // defpackage.nkd
    public final long a(bj8[] bj8VarArr, boolean[] zArr, vhi[] vhiVarArr, boolean[] zArr2, long j) {
        bj8 bj8Var;
        j();
        vzk vzkVar = this.B;
        fyl fylVar = (fyl) vzkVar.a;
        boolean[] zArr3 = (boolean[]) vzkVar.c;
        int i = this.J;
        int i2 = 0;
        for (int i3 = 0; i3 < bj8VarArr.length; i3++) {
            vhi vhiVar = vhiVarArr[i3];
            if (vhiVar != null && (bj8VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((e5h) vhiVar).a;
                z4o.H(zArr3[i4]);
                this.J--;
                zArr3[i4] = false;
                vhiVarArr[i3] = null;
            }
        }
        boolean z = !this.G ? j == 0 || this.A : i != 0;
        for (int i5 = 0; i5 < bj8VarArr.length; i5++) {
            if (vhiVarArr[i5] == null && (bj8Var = bj8VarArr[i5]) != null) {
                z4o.H(bj8Var.length() == 1);
                z4o.H(bj8Var.getIndexInTrackGroup(0) == 0);
                int iB = fylVar.b(bj8Var.getTrackGroup());
                z4o.H(!zArr3[iB]);
                this.J++;
                zArr3[iB] = true;
                this.I |= bj8Var.getSelectedFormat().t;
                vhiVarArr[i5] = new e5h(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    uhi uhiVar = this.v[iB];
                    z = (uhiVar.t() == 0 || uhiVar.F(j, true)) ? false : true;
                }
            }
        }
        if (this.J == 0) {
            this.N = false;
            this.H = false;
            this.I = false;
            qb7 qb7Var = this.m;
            if (qb7Var.s()) {
                uhi[] uhiVarArr = this.v;
                int length = uhiVarArr.length;
                while (i2 < length) {
                    uhiVarArr[i2].k();
                    i2++;
                }
                qb7Var.i();
            } else {
                this.P = false;
                for (uhi uhiVar2 : this.v) {
                    uhiVar2.D(false);
                }
            }
        } else if (z) {
            j = seekToUs(j);
            while (i2 < vhiVarArr.length) {
                if (vhiVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.G = true;
        return j;
    }

    @Override // defpackage.nkd
    public final long b(long j, uwi uwiVar) {
        j();
        if (!this.C.isSeekable()) {
            return 0L;
        }
        swi seekPoints = this.C.getSeekPoints(j);
        return uwiVar.a(j, seekPoints.a.a, seekPoints.b.a);
    }

    @Override // defpackage.thi
    public final void c() {
        this.r.post(this.p);
    }

    @Override // defpackage.osc
    public final void d(rsc rscVar, long j, long j2, boolean z) {
        d5h d5hVar = (d5h) rscVar;
        vbk vbkVar = d5hVar.b;
        bsc bscVar = new bsc(d5hVar.j, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        this.d.getClass();
        this.e.x(bscVar, 1, -1, null, 0, null, d5hVar.i, this.D);
        if (z) {
            return;
        }
        for (uhi uhiVar : this.v) {
            uhiVar.D(false);
        }
        if (this.J > 0) {
            mkd mkdVar = this.s;
            mkdVar.getClass();
            mkdVar.j(this);
        }
    }

    @Override // defpackage.nkd
    public final void e(long j) throws Throwable {
        if (this.A) {
            return;
        }
        j();
        if (m()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.B.c;
        int length = this.v.length;
        for (int i = 0; i < length; i++) {
            this.v[i].j(j, zArr[i]);
        }
    }

    @Override // defpackage.en8
    public final void endTracks() {
        this.x = true;
        this.r.post(this.p);
    }

    @Override // defpackage.nkd
    public final void f(mkd mkdVar, long j) {
        this.s = mkdVar;
        oj9 oj9Var = this.k;
        if (oj9Var == null) {
            this.o.c();
            t();
        } else {
            track(0, 3).g(oj9Var);
            s(new z5b(new long[]{0}, new long[]{0}, -9223372036854775807L));
            endTracks();
            this.M = j;
        }
    }

    @Override // defpackage.n1j
    public final boolean g(gtc gtcVar) {
        if (this.P) {
            return false;
        }
        qb7 qb7Var = this.m;
        if (qb7Var.q() || this.N) {
            return false;
        }
        if ((this.y || this.k != null) && this.J == 0) {
            return false;
        }
        boolean zC = this.o.c();
        if (qb7Var.s()) {
            return zC;
        }
        t();
        return true;
    }

    @Override // defpackage.n1j
    public final long getBufferedPositionUs() {
        long jL;
        boolean z;
        j();
        if (this.P || this.J == 0) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.M;
        }
        if (this.z) {
            int length = this.v.length;
            jL = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                vzk vzkVar = this.B;
                if (((boolean[]) vzkVar.b)[i] && ((boolean[]) vzkVar.c)[i]) {
                    uhi uhiVar = this.v[i];
                    synchronized (uhiVar) {
                        z = uhiVar.w;
                    }
                    if (!z) {
                        jL = Math.min(jL, this.v[i].q());
                    }
                }
            }
        } else {
            jL = Long.MAX_VALUE;
        }
        if (jL == Long.MAX_VALUE) {
            jL = l(false);
        }
        return jL == Long.MIN_VALUE ? this.L : jL;
    }

    @Override // defpackage.n1j
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // defpackage.nkd
    public final fyl getTrackGroups() {
        j();
        return (fyl) this.B.a;
    }

    @Override // defpackage.en8
    public final void h(twi twiVar) {
        this.r.post(new q2g(this, twiVar, (byte) 13));
    }

    @Override // defpackage.osc
    public final void i(rsc rscVar, long j, long j2) {
        d5h d5hVar = (d5h) rscVar;
        if (this.D == -9223372036854775807L && this.C != null) {
            long jL = l(true);
            long j3 = jL == Long.MIN_VALUE ? 0L : jL + 10000;
            this.D = j3;
            this.g.v(j3, this.C, this.E);
        }
        vbk vbkVar = d5hVar.b;
        bsc bscVar = new bsc(d5hVar.j, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        this.d.getClass();
        this.e.y(bscVar, 1, -1, null, 0, null, d5hVar.i, this.D);
        this.P = true;
        mkd mkdVar = this.s;
        mkdVar.getClass();
        mkdVar.j(this);
    }

    @Override // defpackage.n1j
    public final boolean isLoading() {
        boolean z;
        if (!this.m.s()) {
            return false;
        }
        rj5 rj5Var = this.o;
        synchronized (rj5Var) {
            z = rj5Var.b;
        }
        return z;
    }

    public final void j() {
        z4o.H(this.y);
        this.B.getClass();
        this.C.getClass();
    }

    public final int k() {
        int i = 0;
        for (uhi uhiVar : this.v) {
            i += uhiVar.q + uhiVar.p;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            uhi[] r3 = r5.v
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            vzk r3 = r5.B
            r3.getClass()
            java.lang.Object r3 = r3.c
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            uhi[] r3 = r5.v
            r3 = r3[r2]
            long r3 = r3.q()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g5h.l(boolean):long");
    }

    public final boolean m() {
        return this.M != -9223372036854775807L;
    }

    @Override // defpackage.nkd
    public final void maybeThrowPrepareError() throws IOException {
        int iK = this.d.k(this.F);
        qb7 qb7Var = this.m;
        IOException iOException = (IOException) qb7Var.c;
        if (iOException != null) {
            throw iOException;
        }
        qsc qscVar = (qsc) qb7Var.b;
        if (qscVar != null) {
            if (iK == Integer.MIN_VALUE) {
                iK = qscVar.a;
            }
            IOException iOException2 = qscVar.e;
            if (iOException2 != null && qscVar.f > iK) {
                throw iOException2;
            }
        }
        if (this.P && !this.y) {
            throw s1g.d("Loading finished before preparation is complete.", null);
        }
    }

    public final void n() {
        long j = this.l;
        if (this.Q || this.y || !this.x || this.C == null) {
            return;
        }
        for (uhi uhiVar : this.v) {
            if (uhiVar.w() == null) {
                return;
            }
        }
        rj5 rj5Var = this.o;
        synchronized (rj5Var) {
            rj5Var.b = false;
        }
        int length = this.v.length;
        eyl[] eylVarArr = new eyl[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            oj9 oj9VarW = this.v[i].w();
            oj9VarW.getClass();
            String str = oj9VarW.n;
            boolean zK = dzd.k(str);
            boolean z = zK || dzd.o(str);
            zArr[i] = z;
            this.z |= z;
            this.A = j != -9223372036854775807L && length == 1 && dzd.m(str);
            jua juaVar = this.t;
            if (juaVar != null) {
                int i2 = juaVar.a;
                if (zK || this.w[i].b) {
                    lxd lxdVar = oj9VarW.l;
                    lxd lxdVar2 = lxdVar == null ? new lxd(juaVar) : lxdVar.a(juaVar);
                    nj9 nj9VarA = oj9VarW.a();
                    nj9VarA.k = lxdVar2;
                    oj9VarW = new oj9(nj9VarA);
                }
                if (zK && oj9VarW.h == -1 && oj9VarW.i == -1 && i2 != -1) {
                    nj9 nj9VarA2 = oj9VarW.a();
                    nj9VarA2.h = i2;
                    oj9VarW = new oj9(nj9VarA2);
                }
            }
            int iD = this.c.d(oj9VarW);
            nj9 nj9VarA3 = oj9VarW.a();
            nj9VarA3.N = iD;
            oj9 oj9Var = new oj9(nj9VarA3);
            eylVarArr[i] = new eyl(Integer.toString(i), oj9Var);
            this.I |= oj9Var.t;
        }
        fyl fylVar = new fyl(eylVarArr);
        vzk vzkVar = new vzk();
        vzkVar.a = fylVar;
        vzkVar.b = zArr;
        int i3 = fylVar.a;
        vzkVar.c = new boolean[i3];
        vzkVar.d = new boolean[i3];
        this.B = vzkVar;
        if (this.A && this.D == -9223372036854775807L) {
            this.D = j;
            this.C = new a5h(this, this.C);
        }
        this.g.v(this.D, this.C, this.E);
        this.y = true;
        mkd mkdVar = this.s;
        mkdVar.getClass();
        mkdVar.p(this);
    }

    public final void o(int i) {
        j();
        vzk vzkVar = this.B;
        boolean[] zArr = (boolean[]) vzkVar.d;
        if (zArr[i]) {
            return;
        }
        oj9 oj9Var = ((fyl) vzkVar.a).a(i).d[0];
        this.e.n(dzd.i(oj9Var.n), oj9Var, 0, null, this.L);
        zArr[i] = true;
    }

    public final void onLoaderReleased() {
        for (uhi uhiVar : this.v) {
            uhiVar.D(true);
            xl7 xl7Var = uhiVar.h;
            if (xl7Var != null) {
                xl7Var.d(uhiVar.e);
                uhiVar.h = null;
                uhiVar.g = null;
            }
        }
        l45 l45Var = this.n;
        cn8 cn8Var = (cn8) l45Var.b;
        if (cn8Var != null) {
            cn8Var.release();
            l45Var.b = null;
        }
        l45Var.c = null;
    }

    public final void p(int i) {
        j();
        if (this.N) {
            if ((!this.z || ((boolean[]) this.B.b)[i]) && !this.v[i].x(false)) {
                this.M = 0L;
                this.N = false;
                this.H = true;
                this.L = 0L;
                this.O = 0;
                for (uhi uhiVar : this.v) {
                    uhiVar.D(false);
                }
                mkd mkdVar = this.s;
                mkdVar.getClass();
                mkdVar.j(this);
            }
        }
    }

    public final hyl q(f5h f5hVar) {
        int length = this.v.length;
        for (int i = 0; i < length; i++) {
            if (f5hVar.equals(this.w[i])) {
                return this.v[i];
            }
        }
        if (this.x) {
            w7d.K("Extractor added new track (id=" + f5hVar.a + ") after finishing tracks.");
            return new s97();
        }
        uhi uhiVar = new uhi(this.h, this.c, this.f);
        c5h c5hVar = new c5h(uhiVar);
        uhiVar.f = this;
        int i2 = length + 1;
        f5h[] f5hVarArr = (f5h[]) Arrays.copyOf(this.w, i2);
        f5hVarArr[length] = f5hVar;
        String str = tym.a;
        this.w = f5hVarArr;
        uhi[] uhiVarArr = (uhi[]) Arrays.copyOf(this.v, i2);
        uhiVarArr[length] = uhiVar;
        this.v = uhiVarArr;
        c5h[] c5hVarArr = (c5h[]) Arrays.copyOf(this.u, i2);
        c5hVarArr[length] = c5hVar;
        this.u = c5hVarArr;
        return c5hVar;
    }

    @Override // defpackage.osc
    public final void r(rsc rscVar, long j, long j2, int i) {
        d5h d5hVar = (d5h) rscVar;
        vbk vbkVar = d5hVar.b;
        this.e.B(i == 0 ? new bsc(d5hVar.j, j) : new bsc(d5hVar.j, vbkVar.c, vbkVar.d, j, j2, vbkVar.b), 1, -1, null, 0, null, d5hVar.i, this.D, i);
    }

    @Override // defpackage.nkd
    public final long readDiscontinuity() {
        if (this.I) {
            this.I = false;
            return this.L;
        }
        if (!this.H) {
            return -9223372036854775807L;
        }
        if (!this.P && k() <= this.O) {
            return -9223372036854775807L;
        }
        this.H = false;
        return this.L;
    }

    @Override // defpackage.n1j
    public final void reevaluateBuffer(long j) {
    }

    public final void s(twi twiVar) {
        this.C = this.t == null ? twiVar : new rv2(-9223372036854775807L);
        this.D = twiVar.getDurationUs();
        boolean z = !this.K && twiVar.getDurationUs() == -9223372036854775807L;
        this.E = z;
        this.F = z ? (byte) 7 : (byte) 1;
        if (this.y) {
            this.g.v(this.D, twiVar, z);
        } else {
            n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long seekToUs(long r10) {
        /*
            r9 = this;
            r9.j()
            vzk r0 = r9.B
            java.lang.Object r0 = r0.b
            boolean[] r0 = (boolean[]) r0
            twi r1 = r9.C
            boolean r1 = r1.isSeekable()
            if (r1 != 0) goto L13
            r10 = 0
        L13:
            r1 = 0
            r9.H = r1
            long r2 = r9.L
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 != 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = r1
        L1f:
            r9.L = r10
            boolean r3 = r9.m()
            if (r3 == 0) goto L2a
            r9.M = r10
            return r10
        L2a:
            byte r3 = r9.F
            r4 = 7
            qb7 r5 = r9.m
            if (r3 == r4) goto L79
            boolean r3 = r9.P
            if (r3 != 0) goto L3b
            boolean r3 = r5.s()
            if (r3 == 0) goto L79
        L3b:
            uhi[] r3 = r9.v
            int r3 = r3.length
            r4 = r1
        L3f:
            if (r4 >= r3) goto La9
            uhi[] r6 = r9.v
            r6 = r6[r4]
            c5h[] r7 = r9.u
            r7 = r7[r4]
            java.util.concurrent.atomic.AtomicReference r7 = r7.d
            java.lang.Object r7 = r7.get()
            b5h r8 = defpackage.b5h.a
            if (r7 != r8) goto L76
            int r7 = r6.t()
            if (r7 != 0) goto L5b
            if (r2 != 0) goto L76
        L5b:
            boolean r7 = r9.A
            if (r7 == 0) goto L66
            int r7 = r6.q
            boolean r6 = r6.E(r7)
            goto L6c
        L66:
            boolean r7 = r9.P
            boolean r6 = r6.F(r10, r7)
        L6c:
            if (r6 != 0) goto L76
            boolean r6 = r0[r4]
            if (r6 != 0) goto L79
            boolean r6 = r9.z
            if (r6 == 0) goto L79
        L76:
            int r4 = r4 + 1
            goto L3f
        L79:
            r9.N = r1
            r9.M = r10
            r9.P = r1
            r9.I = r1
            boolean r0 = r5.s()
            if (r0 == 0) goto L98
            uhi[] r9 = r9.v
            int r0 = r9.length
        L8a:
            if (r1 >= r0) goto L94
            r2 = r9[r1]
            r2.k()
            int r1 = r1 + 1
            goto L8a
        L94:
            r5.i()
            return r10
        L98:
            r0 = 0
            r5.c = r0
            uhi[] r9 = r9.v
            int r0 = r9.length
            r2 = r1
        L9f:
            if (r2 >= r0) goto La9
            r3 = r9[r2]
            r3.D(r1)
            int r2 = r2 + 1
            goto L9f
        La9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g5h.seekToUs(long):long");
    }

    public final void t() {
        d5h d5hVar = new d5h(this, this.a, this.b, this.n, this, this.o);
        if (this.y) {
            z4o.H(m());
            long j = this.D;
            if (j != -9223372036854775807L && this.M > j) {
                this.P = true;
                this.M = -9223372036854775807L;
                return;
            }
            twi twiVar = this.C;
            twiVar.getClass();
            long j2 = twiVar.getSeekPoints(this.M).a.b;
            long j3 = this.M;
            d5hVar.f.b = j2;
            d5hVar.i = j3;
            d5hVar.h = true;
            d5hVar.l = false;
            for (uhi uhiVar : this.v) {
                uhiVar.t = this.M;
            }
            this.M = -9223372036854775807L;
        }
        this.O = k();
        this.m.C(d5hVar, this, this.d.k(this.F));
    }

    @Override // defpackage.en8
    public final hyl track(int i, int i2) {
        return q(new f5h(i, false));
    }

    @Override // defpackage.osc
    public final psc u(rsc rscVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        psc pscVar;
        twi twiVar;
        d5h d5hVar = (d5h) rscVar;
        vbk vbkVar = d5hVar.b;
        bsc bscVar = new bsc(d5hVar.j, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        String str = tym.a;
        this.d.getClass();
        if ((iOException instanceof s1g) || (iOException instanceof FileNotFoundException) || (iOException instanceof ioa) || (iOException instanceof vsc)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof id6) && ((id6) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            pscVar = qb7.g;
        } else {
            int iK = k();
            int i2 = iK > this.O ? 1 : 0;
            if (this.K || !((twiVar = this.C) == null || twiVar.getDurationUs() == -9223372036854775807L)) {
                this.O = iK;
            } else if (!this.y || v()) {
                this.H = this.y;
                this.L = 0L;
                this.O = 0;
                for (uhi uhiVar : this.v) {
                    uhiVar.D(false);
                }
                d5hVar.f.b = 0L;
                d5hVar.i = 0L;
                d5hVar.h = true;
                d5hVar.l = false;
            } else {
                this.N = true;
                pscVar = qb7.f;
            }
            pscVar = new psc(i2, jMin);
        }
        psc pscVar2 = pscVar;
        this.e.z(bscVar, 1, -1, null, 0, null, d5hVar.i, this.D, iOException, !pscVar2.a());
        return pscVar2;
    }

    public final boolean v() {
        return this.H || m();
    }
}
