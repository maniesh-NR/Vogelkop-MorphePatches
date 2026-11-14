package defpackage;

/* loaded from: classes.dex */
public final class lcn implements kz3 {
    public final rn9 a;
    public final /* synthetic */ rcn b;

    public lcn(rcn rcnVar, x5f x5fVar, mf0 mf0Var) {
        this.b = rcnVar;
        this.a = new rn9(x5fVar, mf0Var, (byte) 18);
    }

    @Override // defpackage.kz3
    public final void b(hjm hjmVar) {
        int iOrdinal = hjmVar.ordinal();
        rn9 rn9Var = this.a;
        rcn rcnVar = this.b;
        if (iOrdinal == 0) {
            rcnVar.c.c(this);
            rn9Var.J(kf0.b);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            rcnVar.c.c(this);
            rn9Var.J(kf0.e);
        }
    }

    @Override // defpackage.kz3
    public final void d() {
        this.b.c.c(this);
        this.a.J(kf0.d);
    }
}
