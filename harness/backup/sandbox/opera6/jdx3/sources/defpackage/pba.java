package defpackage;

/* loaded from: classes.dex */
public final class pba implements kz3 {
    public boolean a;
    public final /* synthetic */ qba b;
    public final /* synthetic */ sba c;

    public pba(sba sbaVar, qba qbaVar) {
        this.b = qbaVar;
        this.c = sbaVar;
    }

    @Override // defpackage.kz3
    public final void b(hjm hjmVar) {
        rba rbaVar = this.b.f;
        if (this.a) {
            return;
        }
        sba sbaVar = this.c;
        if (sbaVar.f || sbaVar.g) {
            return;
        }
        this.a = true;
        if (rbaVar != null) {
            int iOrdinal = hjmVar.ordinal();
            if (iOrdinal == 0) {
                rbaVar.s();
            } else if (iOrdinal == 1) {
                rbaVar.t();
            }
        }
    }

    @Override // defpackage.kz3
    public final void c(boolean z) {
        if (this.b.i) {
            this.c.b(hjm.b);
        }
    }

    @Override // defpackage.kz3
    public final void d() {
        this.c.f = true;
        rba rbaVar = this.b.f;
        if (rbaVar != null) {
            rbaVar.z();
        }
    }

    @Override // defpackage.kz3
    public final void g(lz3 lz3Var) {
        rba rbaVar = this.b.f;
        if (rbaVar != null) {
            rbaVar.d();
        }
    }

    @Override // defpackage.kz3
    public final void h() {
    }
}
