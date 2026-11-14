package defpackage;

/* loaded from: classes.dex */
public final class n55 implements nkd, mkd {
    public final nkd a;
    public mkd b;
    public m55[] c = new m55[0];
    public long d;
    public long e;
    public long f;
    public q55 g;

    public n55(nkd nkdVar, boolean z, long j, long j2) {
        this.a = nkdVar;
        this.d = z ? j : -9223372036854775807L;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.nkd
    public final long a(bj8[] bj8VarArr, boolean[] zArr, vhi[] vhiVarArr, boolean[] zArr2, long j) {
        long j2;
        this.c = new m55[vhiVarArr.length];
        vhi[] vhiVarArr2 = new vhi[vhiVarArr.length];
        for (int i = 0; i < vhiVarArr.length; i++) {
            m55[] m55VarArr = this.c;
            m55 m55Var = (m55) vhiVarArr[i];
            m55VarArr[i] = m55Var;
            vhiVarArr2[i] = m55Var != null ? m55Var.a : null;
        }
        long jA = this.a.a(bj8VarArr, zArr, vhiVarArr2, zArr2, j);
        long j3 = this.f;
        long jMax = Math.max(jA, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (c()) {
            if (jA >= j) {
                if (jA != 0) {
                    for (bj8 bj8Var : bj8VarArr) {
                        if (bj8Var != null) {
                            oj9 selectedFormat = bj8Var.getSelectedFormat();
                            if (!dzd.a(selectedFormat.n, selectedFormat.k)) {
                            }
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
            break;
        } else {
            j2 = -9223372036854775807L;
        }
        this.d = j2;
        for (int i2 = 0; i2 < vhiVarArr.length; i2++) {
            vhi vhiVar = vhiVarArr2[i2];
            m55[] m55VarArr2 = this.c;
            if (vhiVar == null) {
                m55VarArr2[i2] = null;
            } else {
                m55 m55Var2 = m55VarArr2[i2];
                if (m55Var2 == null || m55Var2.a != vhiVar) {
                    m55VarArr2[i2] = new m55(this, vhiVar);
                }
            }
            vhiVarArr[i2] = m55VarArr2[i2];
        }
        return jMax;
    }

    @Override // defpackage.nkd
    public final long b(long j, uwi uwiVar) {
        long j2 = this.e;
        if (j == j2) {
            return j2;
        }
        long j3 = tym.j(uwiVar.a, 0L, j - j2);
        long j4 = uwiVar.b;
        long j5 = this.f;
        long j6 = tym.j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (j3 != uwiVar.a || j6 != uwiVar.b) {
            uwiVar = new uwi(j3, j6);
        }
        return this.a.b(j, uwiVar);
    }

    public final boolean c() {
        return this.d != -9223372036854775807L;
    }

    @Override // defpackage.nkd
    public final void e(long j) {
        this.a.e(j);
    }

    @Override // defpackage.nkd
    public final void f(mkd mkdVar, long j) {
        this.b = mkdVar;
        this.a.f(this, j);
    }

    @Override // defpackage.n1j
    public final boolean g(gtc gtcVar) {
        return this.a.g(gtcVar);
    }

    @Override // defpackage.n1j
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.n1j
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.nkd
    public final fyl getTrackGroups() {
        return this.a.getTrackGroups();
    }

    @Override // defpackage.n1j
    public final boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // defpackage.m1j
    public final void j(n1j n1jVar) {
        mkd mkdVar = this.b;
        mkdVar.getClass();
        mkdVar.j(this);
    }

    @Override // defpackage.nkd
    public final void maybeThrowPrepareError() throws q55 {
        q55 q55Var = this.g;
        if (q55Var != null) {
            throw q55Var;
        }
        this.a.maybeThrowPrepareError();
    }

    @Override // defpackage.mkd
    public final void p(nkd nkdVar) {
        if (this.g != null) {
            return;
        }
        mkd mkdVar = this.b;
        mkdVar.getClass();
        mkdVar.p(this);
    }

    @Override // defpackage.nkd
    public final long readDiscontinuity() {
        if (c()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j;
        }
        long discontinuity2 = this.a.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.e;
        long j3 = this.f;
        long jMax = Math.max(discontinuity2, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.n1j
    public final void reevaluateBuffer(long j) {
        this.a.reevaluateBuffer(j);
    }

    @Override // defpackage.nkd
    public final long seekToUs(long j) {
        this.d = -9223372036854775807L;
        for (m55 m55Var : this.c) {
            if (m55Var != null) {
                m55Var.b = false;
            }
        }
        long jSeekToUs = this.a.seekToUs(j);
        long j2 = this.e;
        long j3 = this.f;
        long jMax = Math.max(jSeekToUs, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }
}
