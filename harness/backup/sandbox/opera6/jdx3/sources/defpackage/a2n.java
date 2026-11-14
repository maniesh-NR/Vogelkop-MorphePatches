package defpackage;

/* loaded from: classes.dex */
public final class a2n implements mo7 {
    public final dj9 a;
    public final skm b;
    public final long c = System.currentTimeMillis();

    public a2n(dj9 dj9Var, skm skmVar) {
        this.a = dj9Var;
        this.b = skmVar;
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        dj9 dj9Var = this.a;
        if (((cj9) dj9Var.i()).isEmpty()) {
            return;
        }
        on7 on7Var = pn7.b;
        long jF = pn7.f(cs5.y0(r0.c, un7.e));
        x5f x5fVar = (x5f) this.b;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        x56VarF.I(zpaVar).p(36, 1, this.c - jF);
        x5fVar.U0(x56VarF);
        dj9Var.H(this);
    }
}
