package defpackage;

/* loaded from: classes.dex */
public final class zkk implements qdb {
    public final x5f a;

    public zkk(pde pdeVar, x5f x5fVar, z9j z9jVar) {
        this.a = x5fVar;
        a26.T(z9jVar, pdeVar, new g9l(this, (byte) 3));
    }

    public zkk(x5f x5fVar) {
        this.a = x5fVar;
    }

    @Override // defpackage.qdb
    public final void a(pdb pdbVar) {
        int iOrdinal = pdbVar.ordinal();
        x5f x5fVar = this.a;
        if (iOrdinal == 0) {
            if (x5fVar.h) {
                x56 x56VarF = zpa.F();
                c66 c66Var = (c66) x56VarF.n(22);
                if (c66Var == null) {
                    x56VarF.q(22, 1, new c66(2443, 1, 7));
                    c66Var = (c66) x56VarF.n(22);
                }
                c66Var.e(3);
                x5fVar.U0(x56VarF);
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                h9o.p();
            }
        } else if (x5fVar.h) {
            x56 x56VarF2 = zpa.F();
            c66 c66Var2 = (c66) x56VarF2.n(22);
            if (c66Var2 == null) {
                x56VarF2.q(22, 1, new c66(2443, 1, 7));
                c66Var2 = (c66) x56VarF2.n(22);
            }
            c66Var2.e(2);
            x5fVar.U0(x56VarF2);
        }
    }

    @Override // defpackage.qdb
    public final void b(vr0 vr0Var) {
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).b(new t5f(vr0Var, (byte) 1));
            x5fVar.U0(x56VarF);
        }
    }
}
