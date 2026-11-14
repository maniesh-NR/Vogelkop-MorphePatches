package ads_mobile_sdk;

import defpackage.mip;
import defpackage.phj;
import defpackage.wpb;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x80 extends phj {
    public final qr0 c;
    public final Object e = new Object();
    public final List n;

    public x80(nx5 nx5Var, mip mipVar, qr0 qr0Var, x33 x33Var) {
        wpb wpbVar;
        this.c = qr0Var;
        pn7.b.getClass();
        try {
            wpbVar = (wpb) new m5a().b(wpb.class, (String) qr0Var.a("gads:pact_active_exp_id:enabled", "[]", fo.a$23));
        } catch (Exception e) {
            xh3.a(e);
            wpbVar = null;
        }
        if (wpbVar == null) {
            new wpb();
        }
        qr0 qr0Var2 = this.c;
        qr0Var2.getClass();
        this.n = (List) qr0Var2.a("gads:pact_navigation_event_to_request_channel", Collections.singletonList("1"), fo.a$15);
    }
}
