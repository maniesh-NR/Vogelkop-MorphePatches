package defpackage;

import J.N;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.CreditCard;

/* loaded from: classes.dex */
public final class gs2 extends mr2 {
    public final wh2 B;
    public final CreditCard C;

    public gs2(orm ormVar, wh2 wh2Var, AutofillManager autofillManager, gw gwVar, CreditCard creditCard) {
        super(ormVar, autofillManager, gwVar, 2132017809);
        this.B = wh2Var;
        this.C = creditCard;
    }

    @Override // defpackage.mr2
    public final String I0() {
        return this.C.g;
    }

    @Override // defpackage.mr2
    public final void K0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        CreditCard creditCard = new CreditCard(this.C.a, str, 0, "", str3, str4, str5, str6, str7);
        nrl nrlVar = this.s.a;
        if (nrlVar.a) {
            N.MFIUe29u(creditCard, str2);
        } else {
            nrlVar.d(new bi2(creditCard, str2, (byte) 5));
        }
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wh2 wh2Var = this.B;
        wh2Var.getClass();
        getLifecycle().a(wh2Var.b);
    }

    @Override // defpackage.mr2, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextInputLayout textInputLayout = this.u.m;
        CreditCard creditCard = this.C;
        q9n.F(textInputLayout, creditCard.h);
        q9n.F(this.u.l, creditCard.b);
        q9n.F(this.u.n, !this.s.a.a ? "" : (String) N.M6qqsegZ(creditCard.a));
        q9n.F(this.u.c, creditCard.i);
        String strA = creditCard.a();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        q9n.F(this.u.e, strA);
    }
}
