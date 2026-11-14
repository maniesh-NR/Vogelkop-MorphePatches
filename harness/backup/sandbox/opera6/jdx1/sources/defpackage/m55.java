package defpackage;

/* loaded from: classes.dex */
public final class m55 implements vhi {
    public final vhi a;
    public boolean b;
    public final /* synthetic */ n55 c;

    public m55(n55 n55Var, vhi vhiVar) {
        this.c = n55Var;
        this.a = vhiVar;
    }

    @Override // defpackage.vhi
    public final int c(i16 i16Var, qj6 qj6Var, int i) {
        n55 n55Var = this.c;
        if (n55Var.c()) {
            return -3;
        }
        if (this.b) {
            qj6Var.b = 4;
            return -4;
        }
        long bufferedPositionUs = n55Var.getBufferedPositionUs();
        int iC = this.a.c(i16Var, qj6Var, i);
        if (iC != -5) {
            long j = n55Var.f;
            if (j == Long.MIN_VALUE || ((iC != -4 || qj6Var.g < j) && !(iC == -3 && bufferedPositionUs == Long.MIN_VALUE && !qj6Var.f))) {
                return iC;
            }
            qj6Var.i();
            qj6Var.b = 4;
            this.b = true;
            return -4;
        }
        oj9 oj9Var = (oj9) i16Var.c;
        oj9Var.getClass();
        int i2 = oj9Var.J;
        int i3 = oj9Var.I;
        if (i3 == 0 && i2 == 0) {
            return -5;
        }
        if (n55Var.e != 0) {
            i3 = 0;
        }
        if (n55Var.f != Long.MIN_VALUE) {
            i2 = 0;
        }
        nj9 nj9VarA = oj9Var.a();
        nj9VarA.H = i3;
        nj9VarA.I = i2;
        i16Var.c = new oj9(nj9VarA);
        return -5;
    }

    @Override // defpackage.vhi
    public final boolean isReady() {
        return !this.c.c() && this.a.isReady();
    }

    @Override // defpackage.vhi
    public final void maybeThrowError() {
        this.a.maybeThrowError();
    }

    @Override // defpackage.vhi
    public final int skipData(long j) {
        if (this.c.c()) {
            return -3;
        }
        return this.a.skipData(j);
    }
}
