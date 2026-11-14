package defpackage;

/* loaded from: classes.dex */
public final class b47 implements as6 {
    public final /* synthetic */ c47 a;

    public b47(c47 c47Var) {
        this.a = c47Var;
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        c47 c47Var = this.a;
        oml omlVar = new oml(c47Var.a.d(new bl6(c47Var, (byte) 14)));
        on7 on7Var = pn7.b;
        tih tihVar = uih.a;
        long jF = pn7.f(c47.g);
        long jF2 = pn7.f(c47.h);
        tihVar.getClass();
        coh.k(omlVar, (Object) null, cs5.y0(uih.b.o(jF, jF2), un7.d));
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
    }
}
