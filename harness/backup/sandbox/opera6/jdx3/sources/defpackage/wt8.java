package defpackage;

/* loaded from: classes.dex */
public final class wt8 implements p5j, tdn {
    public final /* synthetic */ xt8 a;

    public wt8(xt8 xt8Var) {
        this.a = xt8Var;
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("night_mode".equals(str) || "night_mode_schedule".equals(str)) {
            xt8 xt8Var = this.a;
            if (xt8Var.c.s() != 2) {
                xt8Var.R(1);
            }
        }
    }

    @Override // defpackage.tdn
    public final void s() {
        xt8 xt8Var = this.a;
        ydn ydnVar = xt8Var.b;
        if (ydnVar.d.a) {
            xt8Var.R(0);
        }
        if (ydnVar.c.isEnabled()) {
            xt8Var.R(2);
        }
    }

    @Override // defpackage.tdn
    public final void t() {
    }
}
