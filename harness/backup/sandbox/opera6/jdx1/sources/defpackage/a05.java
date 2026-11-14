package defpackage;

/* loaded from: classes.dex */
public final class a05 implements vhi {
    public final b05 a;
    public final uhi b;
    public final int c;
    public boolean d;
    public final /* synthetic */ b05 e;

    public a05(b05 b05Var, b05 b05Var2, uhi uhiVar, int i) {
        this.e = b05Var;
        this.a = b05Var2;
        this.b = uhiVar;
        this.c = i;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        b05 b05Var = this.e;
        ro9 ro9Var = b05Var.g;
        int[] iArr = b05Var.b;
        int i = this.c;
        ro9Var.n(iArr[i], b05Var.c[i], 0, null, b05Var.t);
        this.d = true;
    }

    @Override // defpackage.vhi
    public final int c(i16 i16Var, qj6 qj6Var, int i) {
        b05 b05Var = this.e;
        if (b05Var.l()) {
            return -3;
        }
        i73 i73Var = b05Var.v;
        uhi uhiVar = this.b;
        if (i73Var != null && i73Var.c(this.c + 1) <= uhiVar.t()) {
            return -3;
        }
        a();
        return uhiVar.C(i16Var, qj6Var, i, b05Var.y);
    }

    @Override // defpackage.vhi
    public final boolean isReady() {
        b05 b05Var = this.e;
        return !b05Var.l() && this.b.x(b05Var.y);
    }

    @Override // defpackage.vhi
    public final void maybeThrowError() {
    }

    @Override // defpackage.vhi
    public final int skipData(long j) {
        b05 b05Var = this.e;
        if (b05Var.l()) {
            return 0;
        }
        boolean z = b05Var.y;
        uhi uhiVar = this.b;
        int iV = uhiVar.v(j, z);
        i73 i73Var = b05Var.v;
        if (i73Var != null) {
            iV = Math.min(iV, i73Var.c(this.c + 1) - uhiVar.t());
        }
        uhiVar.G(iV);
        if (iV > 0) {
            a();
        }
        return iV;
    }
}
