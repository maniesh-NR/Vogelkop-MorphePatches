package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class p3m extends m93 implements f7f {
    public final v3m A;

    public p3m(v3m v3mVar) {
        super(2131951683, -1);
        this.A = v3mVar;
    }

    @Override // defpackage.m93
    public final void G0(String str) {
        plk plkVar = this.A.d;
        ((xl) plkVar.b).j(new e4m(plkVar, str, (byte) 0));
    }

    @Override // defpackage.m93
    public final Collection H0() {
        Set set = (Set) ((ode) this.A.d.d).g();
        return set != null ? set : Collections.EMPTY_SET;
    }

    @Override // defpackage.m93
    public final void I0() {
        plk plkVar = this.A.d;
        ((xl) plkVar.b).j(new d4m(plkVar, (byte) 1));
    }

    @Override // defpackage.m93
    public final void J0(ArrayList arrayList) {
        plk plkVar = this.A.d;
        ((xl) plkVar.b).j(new iyk(plkVar, arrayList, (byte) 1));
    }

    public final void d0(Object obj) {
        ig igVar = this.w;
        vml.a(igVar);
        vml.c(igVar);
    }

    @Override // defpackage.m93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ode) this.A.d.d).j(getViewLifecycleOwner(), this);
    }
}
