package defpackage;

/* loaded from: classes.dex */
public final class w2l implements j6l {
    public final /* synthetic */ x2l a;
    public final /* synthetic */ pde b;

    public w2l(x2l x2lVar, pde pdeVar) {
        this.a = x2lVar;
        this.b = pdeVar;
    }

    @Override // defpackage.j6l
    public final void H(b2l b2lVar, b2l b2lVar2, int i) {
        x2l x2lVar = this.a;
        ypd ypdVar = x2lVar.j;
        int iOrdinal = ((b3c) this.b.g()).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            int iA = vep.A(i);
            if (iA == 0) {
                return;
            }
            if (iA != 1 && iA != 2) {
                h9o.p();
                return;
            }
        } else if (iOrdinal != 3) {
            h9o.p();
            return;
        }
        ypdVar.r(((d7l) b2lVar2).j.a().d);
        ypd.K(ypdVar, x2lVar.o.a(b2lVar2), 0, 6);
    }

    @Override // defpackage.j6l
    public final void L(b2l b2lVar, boolean z) {
        this.a.m.f();
    }

    @Override // defpackage.j6l
    public final void h(b2l b2lVar, int i) {
        this.a.m.f();
    }

    @Override // defpackage.j6l
    public final void o(b2l b2lVar, int i, boolean z) {
        this.a.m.f();
    }

    @Override // defpackage.j6l
    public final void onDestroy() {
        this.a.K(l08.a);
    }
}
