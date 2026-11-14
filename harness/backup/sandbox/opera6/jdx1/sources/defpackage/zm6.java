package defpackage;

/* loaded from: classes.dex */
public final class zm6 implements kz2 {
    public static final /* synthetic */ xtb[] e;
    public final kz2 a;
    public final ml6 b;
    public final gz2 c;
    public final fz2 d;

    static {
        xtb peeVar = new pee(zm6.class, "isEnabled", "isEnabled()Z", 0);
        uqh.a.getClass();
        e = new xtb[]{peeVar};
    }

    public zm6(kz2 kz2Var, boolean z, int i) {
        ml6 ml6Var = new ml6();
        this.a = kz2Var;
        this.b = ml6Var;
        this.c = new gz2(false, i, new xm6(1, ml6Var, ml6.class, "startPredictiveBack", "startPredictiveBack(Lcom/arkivanov/essenty/backhandler/BackEvent;)Z", 8, (byte) 0), new r2(1, ml6Var, ml6.class, "progressPredictiveBack", "progressPredictiveBack(Lcom/arkivanov/essenty/backhandler/BackEvent;)V", 0, (byte) 25), new q2(0, ml6Var, ml6.class, "cancelPredictiveBack", "cancelPredictiveBack()V", 0, (byte) 23), new ym6(0, ml6Var, ml6.class, "back", "back()Z", 8));
        this.d = new fz2(Boolean.valueOf(z), this, (byte) 3);
        ml6Var.c = b5j.f(ml6Var.c, new wg5(this, (byte) 12));
    }

    @Override // defpackage.kz2
    public final void a(gz2 gz2Var) {
        this.b.a(gz2Var);
    }

    @Override // defpackage.kz2
    public final boolean b(gz2 gz2Var) {
        return this.b.a.contains(gz2Var);
    }

    @Override // defpackage.kz2
    public final void c(gz2 gz2Var) {
        this.b.c(gz2Var);
    }

    public final void d() {
        kz2 kz2Var = this.a;
        gz2 gz2Var = this.c;
        if (kz2Var.b(gz2Var)) {
            return;
        }
        kz2Var.a(gz2Var);
    }

    public final void e() {
        kz2 kz2Var = this.a;
        gz2 gz2Var = this.c;
        if (kz2Var.b(gz2Var)) {
            kz2Var.c(gz2Var);
        }
    }

    public final void f() {
        xtb xtbVar = e[0];
        this.c.c.g(gz2.h[0], Boolean.valueOf(((Boolean) ((a7f) this.d).b).booleanValue() && this.b.e()));
    }
}
