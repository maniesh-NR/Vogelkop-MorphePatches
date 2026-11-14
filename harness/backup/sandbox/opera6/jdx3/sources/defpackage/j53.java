package defpackage;

/* loaded from: classes.dex */
public final class j53 extends gph {
    public boolean a;
    public final /* synthetic */ xm3 b;

    public j53(xm3 xm3Var) {
        this.b = xm3Var;
    }

    public final void f(int i, int i2) {
        j();
    }

    public final void h(int i, int i2) {
        if (this.b.e.h == 0) {
            this.a = false;
        }
        j();
    }

    public final void j() {
        int i;
        xm3 xm3Var = this.b;
        qhc qhcVar = xm3Var.h;
        ml3 ml3Var = xm3Var.c;
        if (((ml3Var == null || !ml3Var.h()) && xm3Var.i == 3 && !xm3Var.l.e()) || (i = xm3Var.e.h - 1) < 0) {
            return;
        }
        qhc qhcVarH = xm3Var.H(0);
        qhc qhcVarH2 = xm3Var.H(i);
        if ((qhcVarH.c() == 6 || qhcVarH.c() == 2) && qhcVarH2.c() == 3) {
            if (this.a) {
                return;
            }
            this.a = true;
            xm3Var.e.a(qhcVar);
            return;
        }
        if (this.a) {
            this.a = false;
            xm3Var.e.g(qhcVar);
        }
    }
}
