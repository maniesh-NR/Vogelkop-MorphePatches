package defpackage;

/* loaded from: classes.dex */
public final class ohf implements hpf, qdb {
    public final x5f a;

    public ohf(x5f x5fVar) {
        this.a = x5fVar;
    }

    public ohf(xb xbVar, x5f x5fVar) {
        this.a = x5fVar;
        xbVar.e.k(new t77((Object) this, (byte) 6));
    }

    @Override // defpackage.hpf
    public final void I(fpf fpfVar) {
        this.a.j0(pl0.b);
    }

    @Override // defpackage.qdb
    public final void a(pdb pdbVar) {
    }

    @Override // defpackage.qdb
    public final void b(vr0 vr0Var) {
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).b(new t5f(vr0Var, (byte) 0));
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.hpf
    public final void h(cpf cpfVar) {
        this.a.j0(pl0.c);
    }

    @Override // defpackage.hpf
    public final void n(epf epfVar) {
    }

    @Override // defpackage.hpf
    public final void r(gpf gpfVar) {
        this.a.j0(pl0.d);
    }
}
