package defpackage;

/* loaded from: classes.dex */
public final class hac extends b8e implements hi5, gz9 {
    public t71 o;
    public gbc p;
    public dil q;
    public final t0g r = hyg.k((Object) null);

    public hac(t71 t71Var, gbc gbcVar, dil dilVar) {
        this.o = t71Var;
        this.p = gbcVar;
        this.q = dilVar;
    }

    public final void G(wye wyeVar) {
        this.r.setValue(wyeVar);
    }

    @Override // defpackage.b8e
    public final void L0() {
        t71 t71Var = this.o;
        if (t71Var.a != null) {
            d8b.c("Expected textInputModifierNode to be null");
        }
        t71Var.a = this;
    }

    @Override // defpackage.b8e
    public final void M0() {
        this.o.k(this);
    }
}
