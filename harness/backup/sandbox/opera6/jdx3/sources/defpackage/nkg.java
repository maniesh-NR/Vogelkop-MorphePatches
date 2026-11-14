package defpackage;

/* loaded from: classes.dex */
public final class nkg implements j6l, f7f {
    public final ode a;
    public k6l b;
    public final /* synthetic */ okg c;

    public nkg(okg okgVar, ode odeVar) {
        this.c = okgVar;
        this.a = odeVar;
        k6l k6lVar = (k6l) odeVar.g();
        k6l k6lVar2 = this.b;
        if (k6lVar2 != null) {
            k6lVar2.H(this);
        }
        this.b = k6lVar;
        if (k6lVar != null) {
            k6lVar.F(this);
        }
        odeVar.k(this);
    }

    @Override // defpackage.j6l
    public final void L(b2l b2lVar, boolean z) {
        if (((d7l) b2lVar).j.m()) {
            int id = ((d7l) b2lVar).j.getId();
            okg okgVar = this.c;
            okgVar.c.h(new g00(okgVar, id, (byte) 6), false);
        }
    }

    public final void d0(Object obj) {
        k6l k6lVar = (k6l) obj;
        k6l k6lVar2 = this.b;
        if (k6lVar2 != null) {
            k6lVar2.H(this);
        }
        this.b = k6lVar;
        if (k6lVar != null) {
            k6lVar.F(this);
        }
    }

    @Override // defpackage.j6l
    public final void onDestroy() {
        okg okgVar = this.c;
        okgVar.c.h(new mjg(okgVar), false);
    }
}
