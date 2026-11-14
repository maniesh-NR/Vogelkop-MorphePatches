package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class nwf extends t0h implements gim, him {
    public final /* synthetic */ byte a;
    public final hv3 b;
    public final Object c;

    public /* synthetic */ nwf(hv3 hv3Var, Object obj, byte b) {
        this.a = b;
        this.b = hv3Var;
        this.c = obj;
    }

    @Override // defpackage.him
    public final void a(View view) {
        new bbl(this, view, (byte) 2);
    }

    @Override // defpackage.gim
    public final void b(View view) {
        new bbl(this, view, (byte) 1);
    }

    public final void u(boolean z) {
        switch (this.a) {
            case 0:
                new mwf(this, z, (byte) 0);
                break;
            default:
                new zp3(this, z, (byte) 1);
                break;
        }
    }

    public final void v(ph0 ph0Var) {
        ((x5f) this.c).f0(ph0Var);
    }

    public final void w(xl0 xl0Var) {
        ((x5f) this.c).k0(xl0Var);
    }

    public final void x(rq0 rq0Var) {
        x5f x5fVar = (x5f) this.c;
        if (x5fVar.h) {
            x5fVar.T0(new o5f((Object) rq0Var, (byte) 5));
        }
    }
}
