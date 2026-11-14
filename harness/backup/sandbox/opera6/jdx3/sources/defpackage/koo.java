package defpackage;

import com.opera.ad.interstitial.AdActivity;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class koo extends k8 implements ioo, ecn {
    public final nxo o;
    public qb7 p;

    public koo(nxo nxoVar, uuj uujVar) {
        super(uujVar, (Object) null);
        this.o = nxoVar;
    }

    @Override // defpackage.ecn
    public final void a(boolean z) {
        nxo nxoVar = this.o;
        if (z) {
            nxoVar.e();
        } else {
            nxoVar.h();
        }
        qb7 qb7Var = this.p;
        if (qb7Var != null) {
            ((j10) qb7Var.b).a.n((yz) qb7Var.c, z);
        }
    }

    @Override // defpackage.ioo
    public final boolean a() {
        return this.o.d();
    }

    @Override // defpackage.ioo
    public final bm b() {
        return this.o.l;
    }

    @Override // defpackage.ioo
    public final void p(qb7 qb7Var) {
        this.p = qb7Var;
        fzo fzoVar = this.o.g;
        if (fzoVar != null) {
            fzoVar.a = qb7Var;
        }
    }

    @Override // defpackage.ioo
    public final void v(BrowserActivity browserActivity) {
        AdActivity.b(this, browserActivity);
    }
}
