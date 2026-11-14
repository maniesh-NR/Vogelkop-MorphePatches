package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class ebh implements as6, abh, hpf {
    public final af3 b;
    public Boolean d;
    public boolean e;
    public final ode a = new ode();
    public lh4 c = lh4.c;

    public ebh(BrowserActivity browserActivity, af3 af3Var, jze jzeVar) {
        this.b = af3Var;
        jzeVar.j(browserActivity, new t77((Object) this, (byte) 6));
        browserActivity.getLifecycle().a(this);
    }

    @Override // defpackage.abh
    public final void D() {
    }

    @Override // defpackage.hpf
    public final void I(fpf fpfVar) {
        b(true);
    }

    @Override // defpackage.abh
    public final void a(bbh bbhVar) {
        csh cshVar = bbhVar.a;
        boolean z = this.e;
        ode odeVar = this.a;
        if (z || !cshVar.equals(odeVar.g())) {
            this.e = false;
            odeVar.r(cshVar);
        }
    }

    public final void b(boolean z) {
        Boolean bool = this.d;
        if (bool == null) {
            this.d = Boolean.valueOf(z);
        } else if (z != bool.booleanValue()) {
            this.d = Boolean.valueOf(z);
            this.e = true;
            c();
        }
    }

    public final void c() {
        if (this.c.b != null) {
            return;
        }
        lh4 lh4Var = new lh4(new o8f(this, (byte) 27), (byte) 0);
        this.c = lh4Var;
        this.b.d(lh4Var);
    }

    @Override // defpackage.hpf
    public final void h(cpf cpfVar) {
        b(false);
    }

    @Override // defpackage.hpf
    public final void n(epf epfVar) {
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.c.b = null;
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        c();
    }

    @Override // defpackage.hpf
    public final void r(gpf gpfVar) {
        b(false);
    }
}
