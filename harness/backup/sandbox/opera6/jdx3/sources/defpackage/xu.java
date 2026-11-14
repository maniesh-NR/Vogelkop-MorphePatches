package defpackage;

/* loaded from: classes.dex */
public final class xu extends l7n implements h93 {
    public final x5g b;
    public final d8j c;
    public final ode d;
    public final ode e;
    public final vu f;

    public xu(uab uabVar, x5g x5gVar, d8j d8jVar) {
        this.b = x5gVar;
        this.c = d8jVar;
        ode odeVar = new ode(l08.a);
        this.d = odeVar;
        this.e = new ode();
        vu vuVar = new vu(this);
        this.f = vuVar;
        tu tuVar = new tu(odeVar, (byte) 0);
        umi umiVar = uabVar.b;
        nml nmlVarE = umiVar.e(new bm8(uabVar, (byte) 25));
        nmlVarE.b(umiVar.f(new bm8(tuVar, (byte) 26)));
        nmlVarE.a(Boolean.FALSE);
        x5gVar.c();
        x5gVar.b.b(vuVar);
    }

    public final void e() {
        this.b.b.c(this.f);
    }

    @Override // defpackage.h93
    public final void s() {
        d8j d8jVar = this.c;
        if (d8jVar != null) {
            ((g8j) d8jVar).h();
        }
    }
}
