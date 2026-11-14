package defpackage;

import android.view.MenuItem;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class ds2 extends iq2 {
    public ds2(AutofillManager autofillManager, gw gwVar, Address address) {
        super(2132017804, 2131755016, autofillManager, gwVar, address);
    }

    @Override // defpackage.iq2
    public final boolean M0() {
        Address addressH0 = H0();
        this.r.g(addressH0);
        es2 es2Var = this.F;
        if (es2Var == null) {
            return true;
        }
        es2Var.b(addressH0.a);
        return true;
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131364047) {
            return false;
        }
        es2 es2Var = this.F;
        if (es2Var != null) {
            es2Var.a(this.s.a);
        }
        g0();
        return true;
    }
}
