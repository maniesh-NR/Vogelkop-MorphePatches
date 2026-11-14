package defpackage;

/* loaded from: classes.dex */
public final class icd implements nkd, mkd {
    public final jrd a;
    public final long b;
    public final l45 c;
    public l73 d;
    public nkd e;
    public mkd f;
    public long g = -9223372036854775807L;

    public icd(jrd jrdVar, l45 l45Var, long j) {
        this.a = jrdVar;
        this.c = l45Var;
        this.b = j;
    }

    @Override // defpackage.nkd
    public final long a(bj8[] bj8VarArr, boolean[] zArr, vhi[] vhiVarArr, boolean[] zArr2, long j) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.g = -9223372036854775807L;
        nkd nkdVar = this.e;
        String str = tym.a;
        return nkdVar.a(bj8VarArr, zArr, vhiVarArr, zArr2, j);
    }

    @Override // defpackage.nkd
    public final long b(long j, uwi uwiVar) {
        nkd nkdVar = this.e;
        String str = tym.a;
        return nkdVar.b(j, uwiVar);
    }

    public final void c(jrd jrdVar) {
        long j = this.g;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        l73 l73Var = this.d;
        l73Var.getClass();
        nkd nkdVarC = l73Var.c(jrdVar, this.c, j);
        this.e = nkdVarC;
        if (this.f != null) {
            nkdVarC.f(this, j);
        }
    }

    @Override // defpackage.nkd
    public final void e(long j) {
        nkd nkdVar = this.e;
        String str = tym.a;
        nkdVar.e(j);
    }

    @Override // defpackage.nkd
    public final void f(mkd mkdVar, long j) {
        this.f = mkdVar;
        nkd nkdVar = this.e;
        if (nkdVar != null) {
            long j2 = this.g;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            nkdVar.f(this, j2);
        }
    }

    @Override // defpackage.n1j
    public final boolean g(gtc gtcVar) {
        nkd nkdVar = this.e;
        return nkdVar != null && nkdVar.g(gtcVar);
    }

    @Override // defpackage.n1j
    public final long getBufferedPositionUs() {
        nkd nkdVar = this.e;
        String str = tym.a;
        return nkdVar.getBufferedPositionUs();
    }

    @Override // defpackage.n1j
    public final long getNextLoadPositionUs() {
        nkd nkdVar = this.e;
        String str = tym.a;
        return nkdVar.getNextLoadPositionUs();
    }

    @Override // defpackage.nkd
    public final fyl getTrackGroups() {
        nkd nkdVar = this.e;
        String str = tym.a;
        return nkdVar.getTrackGroups();
    }

    @Override // defpackage.n1j
    public final boolean isLoading() {
        nkd nkdVar = this.e;
        return nkdVar != null && nkdVar.isLoading();
    }

    @Override // defpackage.m1j
    public final void j(n1j n1jVar) {
        mkd mkdVar = this.f;
        String str = tym.a;
        mkdVar.j(this);
    }

    @Override // defpackage.nkd
    public final void maybeThrowPrepareError() {
        nkd nkdVar = this.e;
        if (nkdVar != null) {
            nkdVar.maybeThrowPrepareError();
            return;
        }
        l73 l73Var = this.d;
        if (l73Var != null) {
            l73Var.k();
        }
    }

    @Override // defpackage.mkd
    public final void p(nkd nkdVar) {
        mkd mkdVar = this.f;
        String str = tym.a;
        mkdVar.p(this);
    }

    @Override // defpackage.nkd
    public final long readDiscontinuity() {
        nkd nkdVar = this.e;
        String str = tym.a;
        return nkdVar.readDiscontinuity();
    }

    @Override // defpackage.n1j
    public final void reevaluateBuffer(long j) {
        nkd nkdVar = this.e;
        String str = tym.a;
        nkdVar.reevaluateBuffer(j);
    }

    @Override // defpackage.nkd
    public final long seekToUs(long j) {
        nkd nkdVar = this.e;
        String str = tym.a;
        return nkdVar.seekToUs(j);
    }
}
