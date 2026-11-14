package defpackage;

/* loaded from: classes.dex */
public final class dld implements lig {
    public final /* synthetic */ gld a;

    public dld(gld gldVar) {
        this.a = gldVar;
    }

    @Override // defpackage.lig
    public final void b(long j) {
        pgh pghVar = this.a.B;
        if (pghVar != null) {
            pghVar.f = j;
        }
    }

    @Override // defpackage.lig
    public final void d(boolean z, boolean z2) {
        pgh pghVar = this.a.B;
        if (pghVar != null) {
            pghVar.g = z;
        }
    }

    @Override // defpackage.lig
    public final void f(boolean z, boolean z2) {
        pgh pghVar = this.a.B;
        if (pghVar != null) {
            pghVar.h = z2;
        }
    }

    @Override // defpackage.lig
    public final void j(boolean z, boolean z2, boolean z3) {
        pgh pghVar = this.a.B;
        if (pghVar != null) {
            pghVar.i = z2;
            pghVar.j = z3;
            if (z2 || z3) {
                return;
            }
            pghVar.e = 0;
        }
    }
}
