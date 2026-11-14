package ads_mobile_sdk;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public final class s01 {
    public final Context a;
    public final qr0 b;
    public final zyk c = z4c.b(new qm(this, (byte) 29));

    public s01(Context context, qr0 qr0Var) {
        this.a = context;
        this.b = qr0Var;
    }

    public final Object a(String str, String str2, Map map, boolean z, a92 a92Var) {
        qr0 qr0Var = this.b;
        qr0Var.getClass();
        on7 on7Var = pn7.b;
        return uyg.w(pn7.f(((pn7) qr0Var.a("gads:hsdp_open_timeout:ms", u0h.b(60, un7.e), fo.a$18)).a), new p01(this, str, str2, map, z, null), a92Var);
    }

    public final void a(String str) {
        synchronized (((kma) this.c.getValue())) {
            ((kma) this.c.getValue()).a(str);
        }
    }
}
