package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class rq4 extends ltl {
    public final ode r;
    public final boolean s;
    public oq4 t;

    /* JADX WARN: Illegal instructions before constructor call */
    public rq4(umi umiVar, byte[][] bArr, boolean z) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(z ? 2132020607 : 2132018202);
        super((itl) u7kVarF.a);
        ode odeVar = new ode();
        umiVar.c(new fh4(odeVar, bArr, (byte) 3)).a(null);
        this.r = odeVar;
        this.s = z;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ndc viewLifecycleOwner = getViewLifecycleOwner();
        oq4 oq4Var = this.t;
        ode odeVar = this.r;
        odeVar.j(viewLifecycleOwner, new k9(new nrl(oq4Var, odeVar, this.s), (byte) 24));
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.t = oq4.a(layoutInflater, viewGroup, true);
    }
}
