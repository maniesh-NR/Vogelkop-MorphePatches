package defpackage;

/* loaded from: classes.dex */
public final class zp3 extends mzg {
    public final /* synthetic */ byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ t0h d;

    public /* synthetic */ zp3(t0h t0hVar, boolean z, byte b) {
        this.b = b;
        this.d = t0hVar;
        this.c = z;
    }

    public final void g() {
        byte b = this.b;
        boolean z = this.c;
        t0h t0hVar = this.d;
        switch (b) {
            case 0:
                ((bq3) t0hVar).a.j(z);
                break;
            case 1:
                ((nwf) t0hVar).b.j(z);
                break;
            default:
                ((nwf) t0hVar).b.j(z);
                break;
        }
    }

    public final void o() {
        byte b = this.b;
        ph0 ph0Var = ph0.h;
        ph0 ph0Var2 = ph0.f;
        boolean z = this.c;
        t0h t0hVar = this.d;
        switch (b) {
            case 0:
                bq3 bq3Var = (bq3) t0hVar;
                if (z) {
                    ph0Var = ph0Var2;
                }
                bq3Var.u(ph0Var);
                break;
            case 1:
                ((nwf) t0hVar).x(z ? rq0.e : rq0.f);
                break;
            default:
                nwf nwfVar = (nwf) t0hVar;
                if (z) {
                    ph0Var = ph0Var2;
                }
                nwfVar.v(ph0Var);
                break;
        }
    }
}
