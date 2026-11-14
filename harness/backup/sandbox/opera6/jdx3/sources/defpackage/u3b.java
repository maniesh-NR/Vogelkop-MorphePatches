package defpackage;

import android.content.SharedPreferences;
import android.view.View;

/* loaded from: classes.dex */
public final class u3b implements y9n {
    public final yzb a;

    public u3b(yzb yzbVar) {
        this.a = yzbVar;
    }

    @Override // defpackage.y9n
    public final void T(View view, int i, int i2) {
        if (i == 100 && view.isShown()) {
            p12 p12Var = (p12) this.a.b;
            ((can) ((x79) p12Var.d).a).a(view);
            ru9 ru9Var = (ru9) p12Var.e;
            int i3 = ru9Var.a.getInt("main.menu.premium_promo.top.impressions", 0);
            nv6 nv6VarB = ru9Var.b();
            ((SharedPreferences.Editor) nv6VarB.a).putInt("main.menu.premium_promo.top.impressions", i3 + 1);
            nv6VarB.w();
        }
    }
}
