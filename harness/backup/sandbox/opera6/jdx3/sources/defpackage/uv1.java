package defpackage;

/* loaded from: classes.dex */
public final class uv1 extends gxl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uv1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.gxl, defpackage.hxl
    public final void i() {
        switch (this.a) {
            case 0:
                ((xv1) this.b).a.q().c(d59.b, true);
                break;
        }
    }

    @Override // defpackage.gxl, defpackage.hxl
    public final void x(int i) {
        switch (this.a) {
            case 1:
                fge fgeVar = (fge) this.b;
                bf9 bf9Var = fgeVar.t;
                if (i >= 1) {
                    bc9 bc9Var = fgeVar.z;
                    String strU = bf9Var.a.u();
                    if (bc9Var.g == null) {
                        bc9Var.g = strU;
                    }
                    bf9Var.H(fgeVar.J);
                    break;
                }
                break;
        }
    }
}
