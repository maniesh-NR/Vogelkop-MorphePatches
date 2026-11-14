package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class rg5 implements mej, sni {
    public final dx3 a;
    public final h7f b;
    public final tni c;
    public hjm d;
    public ch5 e;
    public boolean f;
    public sni g;
    public final t0g h;
    public final qg5 i;
    public final qdc j;

    public rg5(Context context) {
        dx3 dx3VarP = q9n.p(context);
        if (dx3VarP == null) {
            qp2.n("ComposeSheetHost requires a BrowserBaseActivity context");
            throw null;
        }
        this.a = dx3VarP;
        this.b = new h7f();
        this.c = dx3VarP.l;
        this.d = hjm.b;
        this.h = hyg.k((Object) null);
        this.i = new qg5(this);
        qdc qdcVar = new qdc(this, true);
        qdcVar.g(qcc.c);
        this.j = qdcVar;
    }

    @Override // defpackage.mej
    public final void Q(hjm hjmVar) {
        if (this.f) {
            this.d = hjmVar;
            this.h.setValue(hjmVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mej
    public final void U(View view) {
        if (this.f) {
            qp2.n("ComposeSheetHost.show called twice");
            return;
        }
        this.e = (ch5) view;
        this.a.addContentView(view, new ViewGroup.LayoutParams(-1, -1));
        this.f = true;
        this.j.g(qcc.e);
        this.c.a(this);
    }

    @Override // defpackage.sni
    public final void Y(boolean z) {
        sni sniVar = this.g;
        if (sniVar != null) {
            sniVar.Y(z);
        }
    }

    @Override // defpackage.mej
    public final Context getContext() {
        return this.a;
    }

    public final tcc getLifecycle() {
        return this.j;
    }

    @Override // defpackage.mej
    public final void i(y6f y6fVar) {
        this.b.b(y6fVar);
    }

    @Override // defpackage.mej
    public final void x(sni sniVar) {
        this.g = sniVar;
    }
}
