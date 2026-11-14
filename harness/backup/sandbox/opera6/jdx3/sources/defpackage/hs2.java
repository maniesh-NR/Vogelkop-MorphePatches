package defpackage;

import android.view.MenuItem;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class hs2 extends rr2 {
    public Address y;

    @Override // defpackage.rr2
    public final void G0() {
        l5b l5bVar = q9n.c;
        q9n.u(getView());
        g0();
    }

    @Override // defpackage.rr2
    public final void H0(String str, String str2, String str3) {
        Address address = this.y;
        String str4 = (address == null || !address.o) ? "" : address.a;
        Address address2 = new Address(str4, str, "", "", "", "", "", "", "", "", str2, str3, "", "", true);
        boolean zIsEmpty = str4.isEmpty();
        AutofillManager autofillManager = this.w;
        if (zIsEmpty) {
            autofillManager.a(address2, null);
        } else {
            autofillManager.g(address2);
        }
    }

    @Override // defpackage.rr2
    public final void J0() {
        super.J0();
        q9n.F((TextInputLayout) this.r.e, this.y.b);
        q9n.F((TextInputLayout) this.r.f, this.y.k);
        q9n.F((TextInputLayout) this.r.d, this.y.l);
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Address address;
        if (menuItem.getItemId() != 2131364047) {
            return false;
        }
        tr2 tr2Var = this.x;
        if (tr2Var != null && (address = this.y) != null) {
            tr2Var.a(address.a);
        }
        g0();
        return true;
    }
}
