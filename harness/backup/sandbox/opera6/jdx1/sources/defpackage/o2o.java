package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class o2o extends u2o {
    public final WindowInsets.Builder e;

    public o2o() {
        this.e = new WindowInsets.Builder();
    }

    public o2o(g3o g3oVar) {
        super(g3oVar);
        WindowInsets windowInsetsF = g3oVar.f();
        this.e = windowInsetsF != null ? new WindowInsets.Builder(windowInsetsF) : new WindowInsets.Builder();
    }

    @Override // defpackage.u2o
    public g3o b() {
        a();
        g3o g3oVarG = g3o.g(null, this.e.build());
        r9b[] r9bVarArr = this.b;
        d3o d3oVar = g3oVarG.a;
        d3oVar.w(r9bVarArr);
        d3oVar.v(null);
        d3oVar.A(this.c);
        d3oVar.B(this.d);
        return g3oVarG;
    }

    @Override // defpackage.u2o
    public void e(r9b r9bVar) {
        this.e.setMandatorySystemGestureInsets(r9bVar.e());
    }

    @Override // defpackage.u2o
    public void f(r9b r9bVar) {
        this.e.setStableInsets(r9bVar.e());
    }

    @Override // defpackage.u2o
    public void g(r9b r9bVar) {
        this.e.setSystemGestureInsets(r9bVar.e());
    }

    @Override // defpackage.u2o
    public void h(r9b r9bVar) {
        this.e.setSystemWindowInsets(r9bVar.e());
    }

    @Override // defpackage.u2o
    public void i(r9b r9bVar) {
        this.e.setTappableElementInsets(r9bVar.e());
    }
}
