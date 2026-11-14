package defpackage;

/* loaded from: classes.dex */
public abstract class bv9 implements Cloneable {
    public final hv9 a;
    public hv9 b;

    public bv9(hv9 hv9Var) {
        this.a = hv9Var;
        if (hv9Var.g()) {
            qp2.o("Default instance must be immutable.");
            throw null;
        }
        this.b = hv9Var.i();
    }

    public final hv9 b() {
        hv9 hv9VarC = c();
        hv9VarC.getClass();
        if (hv9.f(hv9VarC, true)) {
            return hv9VarC;
        }
        throw new alm();
    }

    public final hv9 c() {
        boolean zG = this.b.g();
        hv9 hv9Var = this.b;
        if (!zG) {
            return hv9Var;
        }
        hv9Var.getClass();
        y6h y6hVar = y6h.c;
        y6hVar.getClass();
        y6hVar.a(hv9Var.getClass()).makeImmutable(hv9Var);
        hv9Var.h();
        return this.b;
    }

    public final Object clone() {
        bv9 bv9Var = (bv9) this.a.c(5);
        bv9Var.b = c();
        return bv9Var;
    }

    public final void e() {
        if (this.b.g()) {
            return;
        }
        hv9 hv9VarI = this.a.i();
        hv9 hv9Var = this.b;
        y6h y6hVar = y6h.c;
        y6hVar.getClass();
        y6hVar.a(hv9VarI.getClass()).mergeFrom(hv9VarI, hv9Var);
        this.b = hv9VarI;
    }
}
