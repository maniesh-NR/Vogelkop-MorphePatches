package defpackage;

/* loaded from: classes.dex */
public final class hgn extends lim implements tdn {
    public final ydn a;
    public final x5f b;

    public hgn(ydn ydnVar, x5f x5fVar) {
        this.a = ydnVar;
        this.b = x5fVar;
    }

    public final void R() {
        pt0 pt0Var = this.a.i().d;
        x5f x5fVar = this.b;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(zpaVar);
            b66VarF.getClass();
            b66VarF.q(50, 1, pt0Var);
            x5fVar.U0(x56VarF);
        }
    }

    public final void S() {
        ydn ydnVar = this.a;
        boolean z = ydnVar.p().a;
        vdn vdnVar = ydnVar.d;
        boolean z2 = vdnVar.a;
        boolean zB = vdnVar.b();
        boolean z3 = ydnVar.B;
        x5f x5fVar = this.b;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            if (z) {
                x56 x56VarF = zpa.F();
                b66 b66VarF = x56VarF.F(zpaVar);
                b66VarF.r(47, 1, z2);
                if (z2) {
                    b66VarF.r(48, 1, zB);
                    b66VarF.r(49, 1, z3);
                }
                x5fVar.U0(x56VarF);
            }
        }
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.a.F(this);
        S();
        R();
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.a.H(this);
    }

    @Override // defpackage.tdn
    public final void s() {
        S();
    }

    @Override // defpackage.tdn
    public final void t() {
        R();
    }
}
