package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collections;

/* loaded from: classes.dex */
public final class me9 extends c59 {
    public final j4c n;

    public me9(Context context, umi umiVar, j4c j4cVar) {
        super(context, umiVar, x1p.h(context, 2132019084, 2132019082, 2132019083, 2132019109));
        this.n = j4cVar;
    }

    @Override // defpackage.c59
    public final void e(String str, String str2, boolean z) {
        super.e(str, str2, z);
        bf9 bf9Var = (bf9) this.n.get();
        bf9Var.s = str2;
        j4c j4cVar = bf9Var.d;
        if (bf9Var.r() >= 1 && bf9Var.m == null && bf9Var.n == null) {
            String str3 = bf9Var.s;
            if (str3 == null) {
                bf9Var.N();
            } else {
                String str4 = "OFA/" + r9n.t(bf9Var.b).versionName;
                int i = u1b.c;
                x1b x1bVar = new x1b("sync");
                if (!str3.equals(((SharedPreferences) j4cVar.get()).getString("device_notification_token", null)) || !str4.equals(((SharedPreferences) j4cVar.get()).getString("device_version_token", null)) || !x1bVar.equals(w1h.o((SharedPreferences) j4cVar.get(), "device_capabilities", Collections.EMPTY_SET))) {
                    le9 le9Var = bf9Var.e;
                    String strConcat = "ofa:".concat(str3);
                    qn qnVar = new qn(bf9Var, str3, str4, x1bVar, (byte) 25);
                    axl axlVar = new axl(bf9Var, (byte) 7);
                    le9Var.getClass();
                    bf9Var.m = le9.c(new vw1(le9Var, str4, strConcat, x1bVar, qnVar, axlVar, (byte) 4), axlVar);
                }
            }
        }
        if (bf9Var.s == null || bf9Var.r() >= 1 || bf9Var.g.isEmpty()) {
            return;
        }
        bf9Var.C();
    }
}
