package defpackage;

/* loaded from: classes.dex */
public final class ppl implements nkd, mkd {
    public final nkd a;
    public final long b;
    public mkd c;

    public ppl(nkd nkdVar, long j) {
        this.a = nkdVar;
        this.b = j;
    }

    @Override // defpackage.nkd
    public final long a(bj8[] bj8VarArr, boolean[] zArr, vhi[] vhiVarArr, boolean[] zArr2, long j) {
        vhi[] vhiVarArr2 = new vhi[vhiVarArr.length];
        int i = 0;
        while (true) {
            vhi vhiVar = null;
            if (i >= vhiVarArr.length) {
                break;
            }
            opl oplVar = (opl) vhiVarArr[i];
            if (oplVar != null) {
                vhiVar = oplVar.a;
            }
            vhiVarArr2[i] = vhiVar;
            i++;
        }
        nkd nkdVar = this.a;
        long j2 = this.b;
        long jA = nkdVar.a(bj8VarArr, zArr, vhiVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < vhiVarArr.length; i2++) {
            vhi vhiVar2 = vhiVarArr2[i2];
            if (vhiVar2 == null) {
                vhiVarArr[i2] = null;
            } else {
                vhi vhiVar3 = vhiVarArr[i2];
                if (vhiVar3 == null || ((opl) vhiVar3).a != vhiVar2) {
                    vhiVarArr[i2] = new opl(vhiVar2, j2);
                }
            }
        }
        return jA + j2;
    }

    @Override // defpackage.nkd
    public final long b(long j, uwi uwiVar) {
        long j2 = this.b;
        return this.a.b(j - j2, uwiVar) + j2;
    }

    @Override // defpackage.nkd
    public final void e(long j) {
        this.a.e(j - this.b);
    }

    @Override // defpackage.nkd
    public final void f(mkd mkdVar, long j) {
        this.c = mkdVar;
        this.a.f(this, j - this.b);
    }

    @Override // defpackage.n1j
    public final boolean g(gtc gtcVar) {
        ftc ftcVar = new ftc();
        long j = gtcVar.a;
        ftcVar.b = gtcVar.b;
        ftcVar.c = gtcVar.c;
        ftcVar.a = j - this.b;
        return this.a.g(new gtc(ftcVar));
    }

    @Override // defpackage.n1j
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.a.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.b;
    }

    @Override // defpackage.n1j
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.a.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.b;
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
        mkd mkdVar = this.c;
        mkdVar.getClass();
        mkdVar.j(this);
    }

    @Override // defpackage.nkd
    public final void maybeThrowPrepareError() {
        this.a.maybeThrowPrepareError();
    }

    @Override // defpackage.mkd
    public final void p(nkd nkdVar) {
        mkd mkdVar = this.c;
        mkdVar.getClass();
        mkdVar.p(this);
    }

    @Override // defpackage.nkd
    public final long readDiscontinuity() {
        long discontinuity = this.a.readDiscontinuity();
        if (discontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return discontinuity + this.b;
    }

    @Override // defpackage.n1j
    public final void reevaluateBuffer(long j) {
        this.a.reevaluateBuffer(j - this.b);
    }

    @Override // defpackage.nkd
    public final long seekToUs(long j) {
        long j2 = this.b;
        return this.a.seekToUs(j - j2) + j2;
    }
}
