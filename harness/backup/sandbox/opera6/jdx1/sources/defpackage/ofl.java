package defpackage;

/* loaded from: classes.dex */
public final class ofl implements lfl {
    public final long a;
    public final /* synthetic */ pfl b;

    public ofl(pfl pflVar, long j) {
        this.b = pflVar;
        this.a = j;
    }

    @Override // defpackage.lfl
    public final long U(b2c b2cVar) throws pxb {
        b2c b2cVar2 = (b2c) this.b.r.getValue();
        if (b2cVar2 != null) {
            if (b2cVar2.f()) {
                return b2cVar.w(b2cVar2.K(this.a));
            }
            return 0L;
        }
        d8b.d("Tried to open context menu before the anchor was placed.");
        t3p.v();
        return 0L;
    }

    @Override // defpackage.lfl
    public final voh W(b2c b2cVar) {
        return bwg.a(U(b2cVar), 0L);
    }

    @Override // defpackage.lfl
    public final kfl y() {
        return j7h.d(this.b);
    }
}
