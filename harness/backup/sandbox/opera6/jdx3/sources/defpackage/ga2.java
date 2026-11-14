package defpackage;

/* loaded from: classes.dex */
public final class ga2 implements rjm {
    public sjm a = sjm.b;
    public final /* synthetic */ ha2 b;

    public ga2(ha2 ha2Var) {
        this.b = ha2Var;
    }

    @Override // defpackage.rjm
    public final void b(sjm sjmVar) {
        this.a = sjmVar;
        bmb it = sfe.R((i7f) this.b.d.a, rjm.class).iterator();
        while (true) {
            bmb bmbVar = it;
            if (!bmbVar.hasNext()) {
                return;
            } else {
                ((rjm) bmbVar.next()).b(sjmVar);
            }
        }
    }
}
