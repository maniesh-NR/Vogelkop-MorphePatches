package defpackage;

/* loaded from: classes.dex */
public final class opl implements vhi {
    public final vhi a;
    public final long b;

    public opl(vhi vhiVar, long j) {
        this.a = vhiVar;
        this.b = j;
    }

    @Override // defpackage.vhi
    public final int c(i16 i16Var, qj6 qj6Var, int i) {
        int iC = this.a.c(i16Var, qj6Var, i);
        if (iC == -4) {
            qj6Var.g += this.b;
        }
        return iC;
    }

    @Override // defpackage.vhi
    public final boolean isReady() {
        return this.a.isReady();
    }

    @Override // defpackage.vhi
    public final void maybeThrowError() {
        this.a.maybeThrowError();
    }

    @Override // defpackage.vhi
    public final int skipData(long j) {
        return this.a.skipData(j - this.b);
    }
}
