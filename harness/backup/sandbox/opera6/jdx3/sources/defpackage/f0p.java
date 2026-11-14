package defpackage;

/* loaded from: classes.dex */
public final class f0p extends ejo {
    public final /* synthetic */ pqo b;
    public final /* synthetic */ g94 c;
    public final /* synthetic */ e1p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0p(e1p e1pVar, kqo kqoVar, pqo pqoVar, g94 g94Var) {
        super(kqoVar);
        this.d = e1pVar;
        this.b = pqoVar;
        this.c = g94Var;
    }

    @Override // defpackage.mjo
    public final void d(qio qioVar) {
        pqo pqoVar = this.b;
        g94 g94Var = this.c;
        qioVar.a(new vdi(this, pqoVar, g94Var, (byte) 19));
        if (qioVar instanceof lio) {
            g94Var.l(new lio(new zno(bm.NETWORK_ERROR)));
        }
    }
}
