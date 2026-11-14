package defpackage;

import J.N;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class h53 extends i93 implements jbl, jj2 {
    @Override // defpackage.jj2
    public final void b0() {
        getParentFragmentManager().V(1, "BaseAuthPasswordsSettingsFragment");
    }

    @Override // defpackage.ltl, defpackage.ryl
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wi2 wi2Var = wi2.i;
        wi2Var.getClass();
        getLifecycle().a(wi2Var.b);
    }

    @Override // defpackage.ltl
    public final boolean w0() {
        return !N.MphJ2uhp();
    }

    @Override // defpackage.jbl
    public final String y() {
        return "BaseAuthPasswordsSettingsFragment";
    }
}
