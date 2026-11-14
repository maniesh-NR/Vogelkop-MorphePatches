package defpackage;

import android.util.SparseArray;
import com.opera.android.oauth2.OperaAccessTokenProvider;

/* loaded from: classes.dex */
public final class a55 {
    public final pjn a;
    public final SparseArray b = new SparseArray();
    public final nrl c = new nrl((byte) 26);

    public a55(pjn pjnVar) {
        this.a = pjnVar;
        lb4 lb4Var = new lb4(this, (byte) 16);
        avj avjVar = cak.d;
        avj.g(1, lb4Var);
    }

    public final void a(int i, z45 z45Var) {
        String str;
        String[] strArr;
        if (i == 1) {
            str = "accountless_subscriptions";
        } else {
            if (i != 2) {
                hai.d();
                return;
            }
            str = "anonymous_account";
        }
        String str2 = z45Var.a;
        if (i == 1) {
            strArr = new String[]{"anonymous_subscription_premium_beta", "subscriptions:extend_vpn"};
        } else {
            if (i != 2) {
                hai.d();
                return;
            }
            strArr = new String[]{"anonymous_account"};
        }
        this.b.put(i, new OperaAccessTokenProvider(str, strArr, "ofa-beta-client", str2, null));
    }
}
