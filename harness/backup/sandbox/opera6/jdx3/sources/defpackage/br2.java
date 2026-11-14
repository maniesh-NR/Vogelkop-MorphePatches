package defpackage;

import J.N;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.CreditCard;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class br2 extends l7n {
    public final wk4 b;
    public final ot2 c;
    public final AutofillManager d;
    public final ode e = new ode();
    public final jvg f;
    public String g;
    public CreditCard h;

    public br2(gjm gjmVar, wk4 wk4Var, ot2 ot2Var, AutofillManager autofillManager) {
        this.b = wk4Var;
        this.c = ot2Var;
        this.d = autofillManager;
        this.f = new jvg(this, gjmVar);
        a26.V(wk4Var, (kze) new tvk((l7n) this).a, new bx(this, (byte) 1));
    }

    public final ar2 f(CreditCard creditCard, Address address) throws NumberFormatException {
        int iW = y9m.W(creditCard.f);
        String str = creditCard.h;
        if (str.length() <= 0) {
            str = null;
        }
        String str2 = creditCard.b;
        String str3 = str2.length() > 0 ? str2 : null;
        String str4 = !this.d.a.a ? "" : (String) N.M6qqsegZ(creditCard.a);
        String strA = creditCard.a();
        String str5 = creditCard.e;
        String str6 = creditCard.d;
        boolean z = true;
        try {
            int i = Integer.parseInt(str5);
            int i2 = Integer.parseInt(str6);
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(1);
            int i4 = calendar.get(2) + 1;
            if (i >= i3 && (i != i3 || i2 >= i4)) {
                z = false;
            }
        } catch (NumberFormatException unused) {
        }
        boolean z2 = z;
        String str7 = creditCard.i;
        return new ar2(iW, str, str3, str4, strA, str7.length() > 0 ? str7 : null, address != null ? address.n : null, z2);
    }

    public final void g() {
        Object obj;
        ArrayList arrayListB = this.b.b();
        int size = arrayListB.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayListB.get(i);
            i++;
            String str = ((CreditCard) obj).a;
            String str2 = this.g;
            if (str2 == null) {
                str2 = null;
            }
            if (Intrinsics.a(str, str2)) {
                break;
            }
        }
        CreditCard creditCard = (CreditCard) obj;
        if (creditCard == null) {
            return;
        }
        this.h = creditCard;
        String str3 = creditCard.g;
        if (str3 == null || str3.length() == 0) {
            this.e.r(f(creditCard, null));
        } else {
            this.d.c(new wx((Object) this, (Object) creditCard, (byte) 12));
        }
    }
}
