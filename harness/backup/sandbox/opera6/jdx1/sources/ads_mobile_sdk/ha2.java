package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class ha2 {
    public final qr0 a;
    public final Context b;
    public final zyk c = z4c.b(new ea2(this, (byte) 1));
    public final zyk d = z4c.b(new ea2(this, (byte) 2));
    public final zyk e = z4c.b(new ea2(this, (byte) 0));

    public ha2(Context context, qr0 qr0Var) {
        this.a = qr0Var;
        this.b = context;
    }

    public final void a() {
        try {
            ka2 ka2Var = (ka2) this.c.getValue();
            ka2Var.getClass();
            synchronized (ka2.class) {
                ka2Var.f.a(ka2Var.c);
                ka2Var.f.a(ka2Var.a);
            }
        } catch (Exception e) {
            xh3.a("Exception while clearing PAIDV1", e, 4);
        }
    }

    public final void b() {
        try {
            ma2 ma2Var = (ma2) this.d.getValue();
            ma2Var.getClass();
            synchronized (ma2.class) {
                ji jiVar = ma2Var.f;
                if (((SharedPreferences) jiVar.b).contains(ma2Var.a)) {
                    ma2Var.f.a(ma2Var.c);
                    ma2Var.f.a(ma2Var.a);
                }
            }
        } catch (Exception e) {
            xh3.a("Exception while clearing PAIDV2", e, 4);
        }
    }
}
