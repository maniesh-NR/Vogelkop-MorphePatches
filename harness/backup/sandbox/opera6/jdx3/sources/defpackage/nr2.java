package defpackage;

import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class nr2 extends iq2 {
    public final x5f L;
    public final yh2 M;
    public boolean N;

    public nr2(x5f x5fVar, AutofillManager autofillManager, gw gwVar, Address address, yh2 yh2Var) {
        super(2132017658, 0, autofillManager, gwVar, address);
        this.L = x5fVar;
        this.M = yh2Var;
    }

    @Override // defpackage.iq2
    public final boolean M0() {
        if (this.N) {
            return false;
        }
        this.N = true;
        this.M.run(H0());
        this.L.y(g80.b);
        return true;
    }

    @Override // defpackage.ryl
    public final void g0() {
        super.g0();
        if (this.N) {
            return;
        }
        this.M.run(null);
    }
}
